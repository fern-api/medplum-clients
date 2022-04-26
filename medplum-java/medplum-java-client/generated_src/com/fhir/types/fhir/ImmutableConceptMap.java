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
 * Immutable implementation of {@link ConceptMap}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableConceptMap.builder()}.
 */
@Generated(from = "ConceptMap", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableConceptMap implements ConceptMap {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Markdown description;
  private final @Nullable Identifier identifier;
  private final @Nullable String title;
  private final @Nullable String sourceUri;
  private final @Nullable List<ConceptMap_Group> group;
  private final @Nullable String sourceCanonical;
  private final @Nullable DateTime date;
  private final @Nullable Narrative text;
  private final @Nullable List<ContactDetail> contact;
  private final @Nullable Id id;
  private final @Nullable String version;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<UsageContext> useContext;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final @Nullable Uri implicitRules;
  private final @Nullable Code language;
  private final @Nullable String targetCanonical;
  private final @Nullable Uri url;
  private final @Nullable Markdown purpose;
  private final @Nullable Boolean experimental;
  private final @Nullable Meta meta;
  private final @Nullable String publisher;
  private final @Nullable String targetUri;
  private final @Nullable ConceptmapStatus status;
  private final String resourceType;
  private final @Nullable String name;
  private final @Nullable List<Extension> extension;
  private final @Nullable Markdown copyright;

  private ImmutableConceptMap(
      @Nullable List<Extension> modifierExtension,
      @Nullable Markdown description,
      @Nullable Identifier identifier,
      @Nullable String title,
      @Nullable String sourceUri,
      @Nullable List<ConceptMap_Group> group,
      @Nullable String sourceCanonical,
      @Nullable DateTime date,
      @Nullable Narrative text,
      @Nullable List<ContactDetail> contact,
      @Nullable Id id,
      @Nullable String version,
      @Nullable List<ResourceList> contained,
      @Nullable List<UsageContext> useContext,
      @Nullable List<CodeableConcept> jurisdiction,
      @Nullable Uri implicitRules,
      @Nullable Code language,
      @Nullable String targetCanonical,
      @Nullable Uri url,
      @Nullable Markdown purpose,
      @Nullable Boolean experimental,
      @Nullable Meta meta,
      @Nullable String publisher,
      @Nullable String targetUri,
      @Nullable ConceptmapStatus status,
      String resourceType,
      @Nullable String name,
      @Nullable List<Extension> extension,
      @Nullable Markdown copyright) {
    this.modifierExtension = modifierExtension;
    this.description = description;
    this.identifier = identifier;
    this.title = title;
    this.sourceUri = sourceUri;
    this.group = group;
    this.sourceCanonical = sourceCanonical;
    this.date = date;
    this.text = text;
    this.contact = contact;
    this.id = id;
    this.version = version;
    this.contained = contained;
    this.useContext = useContext;
    this.jurisdiction = jurisdiction;
    this.implicitRules = implicitRules;
    this.language = language;
    this.targetCanonical = targetCanonical;
    this.url = url;
    this.purpose = purpose;
    this.experimental = experimental;
    this.meta = meta;
    this.publisher = publisher;
    this.targetUri = targetUri;
    this.status = status;
    this.resourceType = resourceType;
    this.name = name;
    this.extension = extension;
    this.copyright = copyright;
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<Markdown> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<Identifier> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code sourceUri} attribute
   */
  @JsonProperty("sourceUri")
  @Override
  public Optional<String> sourceUri() {
    return Optional.ofNullable(sourceUri);
  }

  /**
   * @return The value of the {@code group} attribute
   */
  @JsonProperty("group")
  @Override
  public Optional<List<ConceptMap_Group>> group() {
    return Optional.ofNullable(group);
  }

  /**
   * @return The value of the {@code sourceCanonical} attribute
   */
  @JsonProperty("sourceCanonical")
  @Override
  public Optional<String> sourceCanonical() {
    return Optional.ofNullable(sourceCanonical);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @JsonProperty("jurisdiction")
  @Override
  public Optional<List<CodeableConcept>> jurisdiction() {
    return Optional.ofNullable(jurisdiction);
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
   * @return The value of the {@code targetCanonical} attribute
   */
  @JsonProperty("targetCanonical")
  @Override
  public Optional<String> targetCanonical() {
    return Optional.ofNullable(targetCanonical);
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
   * @return The value of the {@code purpose} attribute
   */
  @JsonProperty("purpose")
  @Override
  public Optional<Markdown> purpose() {
    return Optional.ofNullable(purpose);
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
   * @return The value of the {@code targetUri} attribute
   */
  @JsonProperty("targetUri")
  @Override
  public Optional<String> targetUri() {
    return Optional.ofNullable(targetUri);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<ConceptmapStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code copyright} attribute
   */
  @JsonProperty("copyright")
  @Override
  public Optional<Markdown> copyright() {
    return Optional.ofNullable(copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableConceptMap(
        newValue,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableConceptMap(
        value,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        newValue,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        value,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        newValue,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        value,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        newValue,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        value,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#sourceUri() sourceUri} attribute.
   * @param value The value for sourceUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withSourceUri(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "sourceUri");
    if (Objects.equals(this.sourceUri, newValue)) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        newValue,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#sourceUri() sourceUri} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withSourceUri(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.sourceUri, value)) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        value,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#group() group} attribute.
   * @param value The value for group
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withGroup(List<ConceptMap_Group> value) {
    @Nullable List<ConceptMap_Group> newValue = Objects.requireNonNull(value, "group");
    if (this.group == newValue) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        newValue,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#group() group} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for group
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withGroup(Optional<? extends List<ConceptMap_Group>> optional) {
    @Nullable List<ConceptMap_Group> value = optional.orElse(null);
    if (this.group == value) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        value,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#sourceCanonical() sourceCanonical} attribute.
   * @param value The value for sourceCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withSourceCanonical(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "sourceCanonical");
    if (Objects.equals(this.sourceCanonical, newValue)) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        newValue,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#sourceCanonical() sourceCanonical} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withSourceCanonical(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.sourceCanonical, value)) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        value,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        newValue,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        value,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        newValue,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        value,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        newValue,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        value,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        newValue,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        value,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        newValue,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        value,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        newValue,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        value,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withUseContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        newValue,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withUseContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        value,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        newValue,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        value,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        newValue,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        value,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        newValue,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        value,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#targetCanonical() targetCanonical} attribute.
   * @param value The value for targetCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withTargetCanonical(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "targetCanonical");
    if (Objects.equals(this.targetCanonical, newValue)) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        newValue,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#targetCanonical() targetCanonical} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for targetCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withTargetCanonical(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.targetCanonical, value)) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        value,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        newValue,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        value,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withPurpose(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        newValue,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withPurpose(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        value,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withExperimental(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        newValue,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withExperimental(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.experimental, value)) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        value,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        newValue,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        value,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withPublisher(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "publisher");
    if (Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        newValue,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withPublisher(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.publisher, value)) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        value,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#targetUri() targetUri} attribute.
   * @param value The value for targetUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withTargetUri(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "targetUri");
    if (Objects.equals(this.targetUri, newValue)) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        newValue,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#targetUri() targetUri} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for targetUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withTargetUri(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.targetUri, value)) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        value,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withStatus(ConceptmapStatus value) {
    @Nullable ConceptmapStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        newValue,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withStatus(Optional<? extends ConceptmapStatus> optional) {
    @Nullable ConceptmapStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        value,
        this.resourceType,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ConceptMap#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableConceptMap withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        newValue,
        this.name,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        newValue,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        value,
        this.extension,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        newValue,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        value,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap withCopyright(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap withCopyright(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableConceptMap(
        this.modifierExtension,
        this.description,
        this.identifier,
        this.title,
        this.sourceUri,
        this.group,
        this.sourceCanonical,
        this.date,
        this.text,
        this.contact,
        this.id,
        this.version,
        this.contained,
        this.useContext,
        this.jurisdiction,
        this.implicitRules,
        this.language,
        this.targetCanonical,
        this.url,
        this.purpose,
        this.experimental,
        this.meta,
        this.publisher,
        this.targetUri,
        this.status,
        this.resourceType,
        this.name,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableConceptMap} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableConceptMap
        && equalTo((ImmutableConceptMap) another);
  }

  private boolean equalTo(ImmutableConceptMap another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(description, another.description)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(title, another.title)
        && Objects.equals(sourceUri, another.sourceUri)
        && Objects.equals(group, another.group)
        && Objects.equals(sourceCanonical, another.sourceCanonical)
        && Objects.equals(date, another.date)
        && Objects.equals(text, another.text)
        && Objects.equals(contact, another.contact)
        && Objects.equals(id, another.id)
        && Objects.equals(version, another.version)
        && Objects.equals(contained, another.contained)
        && Objects.equals(useContext, another.useContext)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(language, another.language)
        && Objects.equals(targetCanonical, another.targetCanonical)
        && Objects.equals(url, another.url)
        && Objects.equals(purpose, another.purpose)
        && Objects.equals(experimental, another.experimental)
        && Objects.equals(meta, another.meta)
        && Objects.equals(publisher, another.publisher)
        && Objects.equals(targetUri, another.targetUri)
        && Objects.equals(status, another.status)
        && resourceType.equals(another.resourceType)
        && Objects.equals(name, another.name)
        && Objects.equals(extension, another.extension)
        && Objects.equals(copyright, another.copyright);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code description}, {@code identifier}, {@code title}, {@code sourceUri}, {@code group}, {@code sourceCanonical}, {@code date}, {@code text}, {@code contact}, {@code id}, {@code version}, {@code contained}, {@code useContext}, {@code jurisdiction}, {@code implicitRules}, {@code language}, {@code targetCanonical}, {@code url}, {@code purpose}, {@code experimental}, {@code meta}, {@code publisher}, {@code targetUri}, {@code status}, {@code resourceType}, {@code name}, {@code extension}, {@code copyright}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(sourceUri);
    h += (h << 5) + Objects.hashCode(group);
    h += (h << 5) + Objects.hashCode(sourceCanonical);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(useContext);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(targetCanonical);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(purpose);
    h += (h << 5) + Objects.hashCode(experimental);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(publisher);
    h += (h << 5) + Objects.hashCode(targetUri);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(copyright);
    return h;
  }

  /**
   * Prints the immutable value {@code ConceptMap} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ConceptMap{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (description != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (identifier != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (title != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (sourceUri != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("sourceUri=").append(sourceUri);
    }
    if (group != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("group=").append(group);
    }
    if (sourceCanonical != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("sourceCanonical=").append(sourceCanonical);
    }
    if (date != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (text != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (contact != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (id != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (version != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (contained != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (useContext != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (jurisdiction != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (implicitRules != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (targetCanonical != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("targetCanonical=").append(targetCanonical);
    }
    if (url != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (purpose != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (experimental != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (meta != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (publisher != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (targetUri != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("targetUri=").append(targetUri);
    }
    if (status != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (builder.length() > 11) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
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
  @Generated(from = "ConceptMap", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ConceptMap {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Identifier> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<String> sourceUri = Optional.empty();
    boolean sourceUriIsSet;
    @Nullable Optional<List<ConceptMap_Group>> group = Optional.empty();
    boolean groupIsSet;
    @Nullable Optional<String> sourceCanonical = Optional.empty();
    boolean sourceCanonicalIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<UsageContext>> useContext = Optional.empty();
    boolean useContextIsSet;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<String> targetCanonical = Optional.empty();
    boolean targetCanonicalIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<Markdown> purpose = Optional.empty();
    boolean purposeIsSet;
    @Nullable Optional<Boolean> experimental = Optional.empty();
    boolean experimentalIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<String> publisher = Optional.empty();
    boolean publisherIsSet;
    @Nullable Optional<String> targetUri = Optional.empty();
    boolean targetUriIsSet;
    @Nullable Optional<ConceptmapStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable String resourceType;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Markdown> copyright = Optional.empty();
    boolean copyrightIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("sourceUri")
    public void setSourceUri(Optional<String> sourceUri) {
      this.sourceUri = sourceUri;
      this.sourceUriIsSet = true;
    }
    @JsonProperty("group")
    public void setGroup(Optional<List<ConceptMap_Group>> group) {
      this.group = group;
      this.groupIsSet = true;
    }
    @JsonProperty("sourceCanonical")
    public void setSourceCanonical(Optional<String> sourceCanonical) {
      this.sourceCanonical = sourceCanonical;
      this.sourceCanonicalIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("useContext")
    public void setUseContext(Optional<List<UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<List<CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
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
    @JsonProperty("targetCanonical")
    public void setTargetCanonical(Optional<String> targetCanonical) {
      this.targetCanonical = targetCanonical;
      this.targetCanonicalIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("purpose")
    public void setPurpose(Optional<Markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @JsonProperty("experimental")
    public void setExperimental(Optional<Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
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
    @JsonProperty("targetUri")
    public void setTargetUri(Optional<String> targetUri) {
      this.targetUri = targetUri;
      this.targetUriIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<ConceptmapStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
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
    @JsonProperty("copyright")
    public void setCopyright(Optional<Markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> sourceUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ConceptMap_Group>> group() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> sourceCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> targetCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> targetUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ConceptmapStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
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
  static ImmutableConceptMap fromJson(Json json) {
    ImmutableConceptMap.Builder builder = ((ImmutableConceptMap.Builder) ImmutableConceptMap.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.sourceUriIsSet) {
      builder.sourceUri(json.sourceUri);
    }
    if (json.groupIsSet) {
      builder.group(json.group);
    }
    if (json.sourceCanonicalIsSet) {
      builder.sourceCanonical(json.sourceCanonical);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.targetCanonicalIsSet) {
      builder.targetCanonical(json.targetCanonical);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.targetUriIsSet) {
      builder.targetUri(json.targetUri);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    return (ImmutableConceptMap) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ConceptMap} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ConceptMap instance
   */
  public static ConceptMap copyOf(ConceptMap instance) {
    if (instance instanceof ImmutableConceptMap) {
      return (ImmutableConceptMap) instance;
    }
    return ((ImmutableConceptMap.Builder) ImmutableConceptMap.builder())
        .modifierExtension(instance.modifierExtension())
        .description(instance.description())
        .identifier(instance.identifier())
        .title(instance.title())
        .sourceUri(instance.sourceUri())
        .group(instance.group())
        .sourceCanonical(instance.sourceCanonical())
        .date(instance.date())
        .text(instance.text())
        .contact(instance.contact())
        .id(instance.id())
        .version(instance.version())
        .contained(instance.contained())
        .useContext(instance.useContext())
        .jurisdiction(instance.jurisdiction())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .targetCanonical(instance.targetCanonical())
        .url(instance.url())
        .purpose(instance.purpose())
        .experimental(instance.experimental())
        .meta(instance.meta())
        .publisher(instance.publisher())
        .targetUri(instance.targetUri())
        .status(instance.status())
        .resourceType(instance.resourceType())
        .name(instance.name())
        .extension(instance.extension())
        .copyright(instance.copyright())
        .build();
  }

  /**
   * Creates a builder for {@link ConceptMap ConceptMap}.
   * <pre>
   * ImmutableConceptMap.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ConceptMap#modifierExtension() modifierExtension}
   *    .description(com.fhir.types.fhir.Markdown) // optional {@link ConceptMap#description() description}
   *    .identifier(com.fhir.types.fhir.Identifier) // optional {@link ConceptMap#identifier() identifier}
   *    .title(String) // optional {@link ConceptMap#title() title}
   *    .sourceUri(String) // optional {@link ConceptMap#sourceUri() sourceUri}
   *    .group(List&amp;lt;com.fhir.types.fhir.ConceptMap_Group&amp;gt;) // optional {@link ConceptMap#group() group}
   *    .sourceCanonical(String) // optional {@link ConceptMap#sourceCanonical() sourceCanonical}
   *    .date(com.fhir.types.fhir.DateTime) // optional {@link ConceptMap#date() date}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link ConceptMap#text() text}
   *    .contact(List&amp;lt;com.fhir.types.fhir.ContactDetail&amp;gt;) // optional {@link ConceptMap#contact() contact}
   *    .id(com.fhir.types.fhir.Id) // optional {@link ConceptMap#id() id}
   *    .version(String) // optional {@link ConceptMap#version() version}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link ConceptMap#contained() contained}
   *    .useContext(List&amp;lt;com.fhir.types.fhir.UsageContext&amp;gt;) // optional {@link ConceptMap#useContext() useContext}
   *    .jurisdiction(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link ConceptMap#jurisdiction() jurisdiction}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link ConceptMap#implicitRules() implicitRules}
   *    .language(com.fhir.types.fhir.Code) // optional {@link ConceptMap#language() language}
   *    .targetCanonical(String) // optional {@link ConceptMap#targetCanonical() targetCanonical}
   *    .url(com.fhir.types.fhir.Uri) // optional {@link ConceptMap#url() url}
   *    .purpose(com.fhir.types.fhir.Markdown) // optional {@link ConceptMap#purpose() purpose}
   *    .experimental(Boolean) // optional {@link ConceptMap#experimental() experimental}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link ConceptMap#meta() meta}
   *    .publisher(String) // optional {@link ConceptMap#publisher() publisher}
   *    .targetUri(String) // optional {@link ConceptMap#targetUri() targetUri}
   *    .status(com.fhir.types.fhir.ConceptmapStatus) // optional {@link ConceptMap#status() status}
   *    .resourceType(String) // required {@link ConceptMap#resourceType() resourceType}
   *    .name(String) // optional {@link ConceptMap#name() name}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ConceptMap#extension() extension}
   *    .copyright(com.fhir.types.fhir.Markdown) // optional {@link ConceptMap#copyright() copyright}
   *    .build();
   * </pre>
   * @return A new ConceptMap builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableConceptMap.Builder();
  }

  /**
   * Builds instances of type {@link ConceptMap ConceptMap}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ConceptMap", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_DESCRIPTION = 0x2L;
    private static final long OPT_BIT_IDENTIFIER = 0x4L;
    private static final long OPT_BIT_TITLE = 0x8L;
    private static final long OPT_BIT_SOURCE_URI = 0x10L;
    private static final long OPT_BIT_GROUP = 0x20L;
    private static final long OPT_BIT_SOURCE_CANONICAL = 0x40L;
    private static final long OPT_BIT_DATE = 0x80L;
    private static final long OPT_BIT_TEXT = 0x100L;
    private static final long OPT_BIT_CONTACT = 0x200L;
    private static final long OPT_BIT_ID = 0x400L;
    private static final long OPT_BIT_VERSION = 0x800L;
    private static final long OPT_BIT_CONTAINED = 0x1000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x2000L;
    private static final long OPT_BIT_JURISDICTION = 0x4000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x8000L;
    private static final long OPT_BIT_LANGUAGE = 0x10000L;
    private static final long OPT_BIT_TARGET_CANONICAL = 0x20000L;
    private static final long OPT_BIT_URL = 0x40000L;
    private static final long OPT_BIT_PURPOSE = 0x80000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x100000L;
    private static final long OPT_BIT_META = 0x200000L;
    private static final long OPT_BIT_PUBLISHER = 0x400000L;
    private static final long OPT_BIT_TARGET_URI = 0x800000L;
    private static final long OPT_BIT_STATUS = 0x1000000L;
    private static final long OPT_BIT_NAME = 0x2000000L;
    private static final long OPT_BIT_EXTENSION = 0x4000000L;
    private static final long OPT_BIT_COPYRIGHT = 0x8000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Markdown description;
    private @Nullable Identifier identifier;
    private @Nullable String title;
    private @Nullable String sourceUri;
    private @Nullable List<ConceptMap_Group> group;
    private @Nullable String sourceCanonical;
    private @Nullable DateTime date;
    private @Nullable Narrative text;
    private @Nullable List<ContactDetail> contact;
    private @Nullable Id id;
    private @Nullable String version;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<UsageContext> useContext;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable Uri implicitRules;
    private @Nullable Code language;
    private @Nullable String targetCanonical;
    private @Nullable Uri url;
    private @Nullable Markdown purpose;
    private @Nullable Boolean experimental;
    private @Nullable Meta meta;
    private @Nullable String publisher;
    private @Nullable String targetUri;
    private @Nullable ConceptmapStatus status;
    private @Nullable String resourceType;
    private @Nullable String name;
    private @Nullable List<Extension> extension;
    private @Nullable Markdown copyright;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ConceptMap#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ConceptMap#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ConceptMap#description() description} to description.
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
     * Initializes the optional value {@link ConceptMap#description() description} to description.
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
     * Initializes the optional value {@link ConceptMap#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#title() title} to title.
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
     * Initializes the optional value {@link ConceptMap#title() title} to title.
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
     * Initializes the optional value {@link ConceptMap#sourceUri() sourceUri} to sourceUri.
     * @param sourceUri The value for sourceUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceUri(String sourceUri) {
      checkNotIsSet(sourceUriIsSet(), "sourceUri");
      this.sourceUri = Objects.requireNonNull(sourceUri, "sourceUri");
      optBits |= OPT_BIT_SOURCE_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#sourceUri() sourceUri} to sourceUri.
     * @param sourceUri The value for sourceUri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sourceUri")
    public final Builder sourceUri(Optional<String> sourceUri) {
      checkNotIsSet(sourceUriIsSet(), "sourceUri");
      this.sourceUri = sourceUri.orElse(null);
      optBits |= OPT_BIT_SOURCE_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for chained invocation
     */
    public final Builder group(List<ConceptMap_Group> group) {
      checkNotIsSet(groupIsSet(), "group");
      this.group = Objects.requireNonNull(group, "group");
      optBits |= OPT_BIT_GROUP;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("group")
    public final Builder group(Optional<? extends List<ConceptMap_Group>> group) {
      checkNotIsSet(groupIsSet(), "group");
      this.group = group.orElse(null);
      optBits |= OPT_BIT_GROUP;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#sourceCanonical() sourceCanonical} to sourceCanonical.
     * @param sourceCanonical The value for sourceCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceCanonical(String sourceCanonical) {
      checkNotIsSet(sourceCanonicalIsSet(), "sourceCanonical");
      this.sourceCanonical = Objects.requireNonNull(sourceCanonical, "sourceCanonical");
      optBits |= OPT_BIT_SOURCE_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#sourceCanonical() sourceCanonical} to sourceCanonical.
     * @param sourceCanonical The value for sourceCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sourceCanonical")
    public final Builder sourceCanonical(Optional<String> sourceCanonical) {
      checkNotIsSet(sourceCanonicalIsSet(), "sourceCanonical");
      this.sourceCanonical = sourceCanonical.orElse(null);
      optBits |= OPT_BIT_SOURCE_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#date() date} to date.
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
     * Initializes the optional value {@link ConceptMap#date() date} to date.
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
     * Initializes the optional value {@link ConceptMap#text() text} to text.
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
     * Initializes the optional value {@link ConceptMap#text() text} to text.
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
     * Initializes the optional value {@link ConceptMap#contact() contact} to contact.
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
     * Initializes the optional value {@link ConceptMap#contact() contact} to contact.
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
     * Initializes the optional value {@link ConceptMap#id() id} to id.
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
     * Initializes the optional value {@link ConceptMap#id() id} to id.
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
     * Initializes the optional value {@link ConceptMap#version() version} to version.
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
     * Initializes the optional value {@link ConceptMap#version() version} to version.
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
     * Initializes the optional value {@link ConceptMap#contained() contained} to contained.
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
     * Initializes the optional value {@link ConceptMap#contained() contained} to contained.
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
     * Initializes the optional value {@link ConceptMap#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link ConceptMap#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link ConceptMap#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ConceptMap#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ConceptMap#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ConceptMap#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ConceptMap#language() language} to language.
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
     * Initializes the optional value {@link ConceptMap#language() language} to language.
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
     * Initializes the optional value {@link ConceptMap#targetCanonical() targetCanonical} to targetCanonical.
     * @param targetCanonical The value for targetCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder targetCanonical(String targetCanonical) {
      checkNotIsSet(targetCanonicalIsSet(), "targetCanonical");
      this.targetCanonical = Objects.requireNonNull(targetCanonical, "targetCanonical");
      optBits |= OPT_BIT_TARGET_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#targetCanonical() targetCanonical} to targetCanonical.
     * @param targetCanonical The value for targetCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("targetCanonical")
    public final Builder targetCanonical(Optional<String> targetCanonical) {
      checkNotIsSet(targetCanonicalIsSet(), "targetCanonical");
      this.targetCanonical = targetCanonical.orElse(null);
      optBits |= OPT_BIT_TARGET_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#url() url} to url.
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
     * Initializes the optional value {@link ConceptMap#url() url} to url.
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
     * Initializes the optional value {@link ConceptMap#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link ConceptMap#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link ConceptMap#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link ConceptMap#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link ConceptMap#meta() meta} to meta.
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
     * Initializes the optional value {@link ConceptMap#meta() meta} to meta.
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
     * Initializes the optional value {@link ConceptMap#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ConceptMap#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ConceptMap#targetUri() targetUri} to targetUri.
     * @param targetUri The value for targetUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder targetUri(String targetUri) {
      checkNotIsSet(targetUriIsSet(), "targetUri");
      this.targetUri = Objects.requireNonNull(targetUri, "targetUri");
      optBits |= OPT_BIT_TARGET_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#targetUri() targetUri} to targetUri.
     * @param targetUri The value for targetUri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("targetUri")
    public final Builder targetUri(Optional<String> targetUri) {
      checkNotIsSet(targetUriIsSet(), "targetUri");
      this.targetUri = targetUri.orElse(null);
      optBits |= OPT_BIT_TARGET_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(ConceptmapStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends ConceptmapStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the value for the {@link ConceptMap#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ConceptMap#name() name} to name.
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
     * Initializes the optional value {@link ConceptMap#name() name} to name.
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
     * Initializes the optional value {@link ConceptMap#extension() extension} to extension.
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
     * Initializes the optional value {@link ConceptMap#extension() extension} to extension.
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
     * Initializes the optional value {@link ConceptMap#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link ConceptMap#copyright() copyright} to copyright.
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
     * Builds a new {@link ConceptMap ConceptMap}.
     * @return An immutable instance of ConceptMap
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ConceptMap build() {
      checkRequiredAttributes();
      return new ImmutableConceptMap(
          modifierExtension,
          description,
          identifier,
          title,
          sourceUri,
          group,
          sourceCanonical,
          date,
          text,
          contact,
          id,
          version,
          contained,
          useContext,
          jurisdiction,
          implicitRules,
          language,
          targetCanonical,
          url,
          purpose,
          experimental,
          meta,
          publisher,
          targetUri,
          status,
          resourceType,
          name,
          extension,
          copyright);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean sourceUriIsSet() {
      return (optBits & OPT_BIT_SOURCE_URI) != 0;
    }

    private boolean groupIsSet() {
      return (optBits & OPT_BIT_GROUP) != 0;
    }

    private boolean sourceCanonicalIsSet() {
      return (optBits & OPT_BIT_SOURCE_CANONICAL) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean targetCanonicalIsSet() {
      return (optBits & OPT_BIT_TARGET_CANONICAL) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean targetUriIsSet() {
      return (optBits & OPT_BIT_TARGET_URI) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ConceptMap is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build ConceptMap, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ConceptMap", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ConceptMap#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "ConceptMap", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ConceptMap#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ConceptMap#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ConceptMap#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(Markdown description);

    /**
     * Initializes the optional value {@link ConceptMap#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<? extends Markdown> description);

    /**
     * Initializes the optional value {@link ConceptMap#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(Identifier identifier);

    /**
     * Initializes the optional value {@link ConceptMap#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends Identifier> identifier);

    /**
     * Initializes the optional value {@link ConceptMap#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link ConceptMap#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Initializes the optional value {@link ConceptMap#sourceUri() sourceUri} to sourceUri.
     * @param sourceUri The value for sourceUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sourceUri(String sourceUri);

    /**
     * Initializes the optional value {@link ConceptMap#sourceUri() sourceUri} to sourceUri.
     * @param sourceUri The value for sourceUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sourceUri(Optional<String> sourceUri);

    /**
     * Initializes the optional value {@link ConceptMap#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for chained invocation
     */
    BuildFinal group(List<ConceptMap_Group> group);

    /**
     * Initializes the optional value {@link ConceptMap#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal group(Optional<? extends List<ConceptMap_Group>> group);

    /**
     * Initializes the optional value {@link ConceptMap#sourceCanonical() sourceCanonical} to sourceCanonical.
     * @param sourceCanonical The value for sourceCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sourceCanonical(String sourceCanonical);

    /**
     * Initializes the optional value {@link ConceptMap#sourceCanonical() sourceCanonical} to sourceCanonical.
     * @param sourceCanonical The value for sourceCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sourceCanonical(Optional<String> sourceCanonical);

    /**
     * Initializes the optional value {@link ConceptMap#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link ConceptMap#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link ConceptMap#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link ConceptMap#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link ConceptMap#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link ConceptMap#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Initializes the optional value {@link ConceptMap#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link ConceptMap#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link ConceptMap#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link ConceptMap#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link ConceptMap#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link ConceptMap#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link ConceptMap#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(List<UsageContext> useContext);

    /**
     * Initializes the optional value {@link ConceptMap#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(Optional<? extends List<UsageContext>> useContext);

    /**
     * Initializes the optional value {@link ConceptMap#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(List<CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link ConceptMap#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link ConceptMap#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link ConceptMap#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link ConceptMap#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link ConceptMap#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link ConceptMap#targetCanonical() targetCanonical} to targetCanonical.
     * @param targetCanonical The value for targetCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal targetCanonical(String targetCanonical);

    /**
     * Initializes the optional value {@link ConceptMap#targetCanonical() targetCanonical} to targetCanonical.
     * @param targetCanonical The value for targetCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal targetCanonical(Optional<String> targetCanonical);

    /**
     * Initializes the optional value {@link ConceptMap#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link ConceptMap#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link ConceptMap#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(Markdown purpose);

    /**
     * Initializes the optional value {@link ConceptMap#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(Optional<? extends Markdown> purpose);

    /**
     * Initializes the optional value {@link ConceptMap#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link ConceptMap#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(Optional<Boolean> experimental);

    /**
     * Initializes the optional value {@link ConceptMap#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link ConceptMap#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link ConceptMap#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(String publisher);

    /**
     * Initializes the optional value {@link ConceptMap#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<String> publisher);

    /**
     * Initializes the optional value {@link ConceptMap#targetUri() targetUri} to targetUri.
     * @param targetUri The value for targetUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal targetUri(String targetUri);

    /**
     * Initializes the optional value {@link ConceptMap#targetUri() targetUri} to targetUri.
     * @param targetUri The value for targetUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal targetUri(Optional<String> targetUri);

    /**
     * Initializes the optional value {@link ConceptMap#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(ConceptmapStatus status);

    /**
     * Initializes the optional value {@link ConceptMap#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends ConceptmapStatus> status);

    /**
     * Initializes the optional value {@link ConceptMap#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link ConceptMap#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link ConceptMap#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ConceptMap#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ConceptMap#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(Markdown copyright);

    /**
     * Initializes the optional value {@link ConceptMap#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(Optional<? extends Markdown> copyright);

    /**
     * Builds a new {@link ConceptMap ConceptMap}.
     * @return An immutable instance of ConceptMap
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ConceptMap build();
  }
}
