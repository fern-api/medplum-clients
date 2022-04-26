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
 * Immutable implementation of {@link GraphDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGraphDefinition.builder()}.
 */
@Generated(from = "GraphDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableGraphDefinition implements GraphDefinition {
  private final @Nullable Narrative text;
  private final @Nullable Uri implicitRules;
  private final @Nullable Markdown purpose;
  private final @Nullable DateTime date;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<GraphDefinition_Link> link;
  private final @Nullable Boolean experimental;
  private final @Nullable Markdown description;
  private final @Nullable Canonical profile;
  private final @Nullable Code start;
  private final String resourceType;
  private final @Nullable Id id;
  private final @Nullable String name;
  private final @Nullable GraphdefinitionStatus status;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final @Nullable Code language;
  private final @Nullable Uri url;
  private final @Nullable String publisher;
  private final @Nullable Meta meta;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<UsageContext> useContext;
  private final @Nullable String version;
  private final @Nullable List<ContactDetail> contact;

  private ImmutableGraphDefinition(
      @Nullable Narrative text,
      @Nullable Uri implicitRules,
      @Nullable Markdown purpose,
      @Nullable DateTime date,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<GraphDefinition_Link> link,
      @Nullable Boolean experimental,
      @Nullable Markdown description,
      @Nullable Canonical profile,
      @Nullable Code start,
      String resourceType,
      @Nullable Id id,
      @Nullable String name,
      @Nullable GraphdefinitionStatus status,
      @Nullable List<CodeableConcept> jurisdiction,
      @Nullable Code language,
      @Nullable Uri url,
      @Nullable String publisher,
      @Nullable Meta meta,
      @Nullable List<ResourceList> contained,
      @Nullable List<Extension> extension,
      @Nullable List<UsageContext> useContext,
      @Nullable String version,
      @Nullable List<ContactDetail> contact) {
    this.text = text;
    this.implicitRules = implicitRules;
    this.purpose = purpose;
    this.date = date;
    this.modifierExtension = modifierExtension;
    this.link = link;
    this.experimental = experimental;
    this.description = description;
    this.profile = profile;
    this.start = start;
    this.resourceType = resourceType;
    this.id = id;
    this.name = name;
    this.status = status;
    this.jurisdiction = jurisdiction;
    this.language = language;
    this.url = url;
    this.publisher = publisher;
    this.meta = meta;
    this.contained = contained;
    this.extension = extension;
    this.useContext = useContext;
    this.version = version;
    this.contact = contact;
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
   * @return The value of the {@code purpose} attribute
   */
  @JsonProperty("purpose")
  @Override
  public Optional<Markdown> purpose() {
    return Optional.ofNullable(purpose);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code link} attribute
   */
  @JsonProperty("link")
  @Override
  public Optional<List<GraphDefinition_Link>> link() {
    return Optional.ofNullable(link);
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
   * @return The value of the {@code profile} attribute
   */
  @JsonProperty("profile")
  @Override
  public Optional<Canonical> profile() {
    return Optional.ofNullable(profile);
  }

  /**
   * @return The value of the {@code start} attribute
   */
  @JsonProperty("start")
  @Override
  public Optional<Code> start() {
    return Optional.ofNullable(start);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<GraphdefinitionStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * @return The value of the {@code useContext} attribute
   */
  @JsonProperty("useContext")
  @Override
  public Optional<List<UsageContext>> useContext() {
    return Optional.ofNullable(useContext);
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
   * @return The value of the {@code contact} attribute
   */
  @JsonProperty("contact")
  @Override
  public Optional<List<ContactDetail>> contact() {
    return Optional.ofNullable(contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableGraphDefinition(
        newValue,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableGraphDefinition(
        value,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableGraphDefinition(
        this.text,
        newValue,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableGraphDefinition(
        this.text,
        value,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withPurpose(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        newValue,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withPurpose(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        value,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        newValue,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        value,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        newValue,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        value,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#link() link} attribute.
   * @param value The value for link
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withLink(List<GraphDefinition_Link> value) {
    @Nullable List<GraphDefinition_Link> newValue = Objects.requireNonNull(value, "link");
    if (this.link == newValue) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        newValue,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#link() link} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for link
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withLink(Optional<? extends List<GraphDefinition_Link>> optional) {
    @Nullable List<GraphDefinition_Link> value = optional.orElse(null);
    if (this.link == value) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        value,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withExperimental(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        newValue,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withExperimental(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.experimental, value)) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        value,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        newValue,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        value,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#profile() profile} attribute.
   * @param value The value for profile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withProfile(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "profile");
    if (this.profile == newValue) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        newValue,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#profile() profile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for profile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withProfile(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.profile == value) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        value,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#start() start} attribute.
   * @param value The value for start
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withStart(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "start");
    if (this.start == newValue) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        newValue,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#start() start} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for start
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withStart(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.start == value) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        value,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GraphDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGraphDefinition withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        newValue,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        newValue,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        value,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        newValue,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        value,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withStatus(GraphdefinitionStatus value) {
    @Nullable GraphdefinitionStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        newValue,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withStatus(Optional<? extends GraphdefinitionStatus> optional) {
    @Nullable GraphdefinitionStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        value,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        newValue,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        value,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        newValue,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        value,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        newValue,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        value,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withPublisher(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "publisher");
    if (Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        newValue,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withPublisher(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.publisher, value)) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        value,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        newValue,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        value,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        newValue,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        value,
        this.extension,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        newValue,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        value,
        this.useContext,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withUseContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        newValue,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withUseContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        value,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        newValue,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        value,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GraphDefinition#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGraphDefinition withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GraphDefinition#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGraphDefinition withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableGraphDefinition(
        this.text,
        this.implicitRules,
        this.purpose,
        this.date,
        this.modifierExtension,
        this.link,
        this.experimental,
        this.description,
        this.profile,
        this.start,
        this.resourceType,
        this.id,
        this.name,
        this.status,
        this.jurisdiction,
        this.language,
        this.url,
        this.publisher,
        this.meta,
        this.contained,
        this.extension,
        this.useContext,
        this.version,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGraphDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGraphDefinition
        && equalTo((ImmutableGraphDefinition) another);
  }

  private boolean equalTo(ImmutableGraphDefinition another) {
    return Objects.equals(text, another.text)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(purpose, another.purpose)
        && Objects.equals(date, another.date)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(link, another.link)
        && Objects.equals(experimental, another.experimental)
        && Objects.equals(description, another.description)
        && Objects.equals(profile, another.profile)
        && Objects.equals(start, another.start)
        && resourceType.equals(another.resourceType)
        && Objects.equals(id, another.id)
        && Objects.equals(name, another.name)
        && Objects.equals(status, another.status)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(language, another.language)
        && Objects.equals(url, another.url)
        && Objects.equals(publisher, another.publisher)
        && Objects.equals(meta, another.meta)
        && Objects.equals(contained, another.contained)
        && Objects.equals(extension, another.extension)
        && Objects.equals(useContext, another.useContext)
        && Objects.equals(version, another.version)
        && Objects.equals(contact, another.contact);
  }

  /**
   * Computes a hash code from attributes: {@code text}, {@code implicitRules}, {@code purpose}, {@code date}, {@code modifierExtension}, {@code link}, {@code experimental}, {@code description}, {@code profile}, {@code start}, {@code resourceType}, {@code id}, {@code name}, {@code status}, {@code jurisdiction}, {@code language}, {@code url}, {@code publisher}, {@code meta}, {@code contained}, {@code extension}, {@code useContext}, {@code version}, {@code contact}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(purpose);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(link);
    h += (h << 5) + Objects.hashCode(experimental);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(profile);
    h += (h << 5) + Objects.hashCode(start);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(publisher);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(useContext);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(contact);
    return h;
  }

  /**
   * Prints the immutable value {@code GraphDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("GraphDefinition{");
    if (text != null) {
      builder.append("text=").append(text);
    }
    if (implicitRules != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (purpose != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (date != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (modifierExtension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (link != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("link=").append(link);
    }
    if (experimental != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (description != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (profile != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("profile=").append(profile);
    }
    if (start != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("start=").append(start);
    }
    if (builder.length() > 16) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "GraphDefinition", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements GraphDefinition {
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Markdown> purpose = Optional.empty();
    boolean purposeIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<GraphDefinition_Link>> link = Optional.empty();
    boolean linkIsSet;
    @Nullable Optional<Boolean> experimental = Optional.empty();
    boolean experimentalIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Canonical> profile = Optional.empty();
    boolean profileIsSet;
    @Nullable Optional<Code> start = Optional.empty();
    boolean startIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<GraphdefinitionStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<String> publisher = Optional.empty();
    boolean publisherIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<UsageContext>> useContext = Optional.empty();
    boolean useContextIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
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
    @JsonProperty("purpose")
    public void setPurpose(Optional<Markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("link")
    public void setLink(Optional<List<GraphDefinition_Link>> link) {
      this.link = link;
      this.linkIsSet = true;
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
    @JsonProperty("profile")
    public void setProfile(Optional<Canonical> profile) {
      this.profile = profile;
      this.profileIsSet = true;
    }
    @JsonProperty("start")
    public void setStart(Optional<Code> start) {
      this.start = start;
      this.startIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<GraphdefinitionStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<List<CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
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
    @JsonProperty("useContext")
    public void setUseContext(Optional<List<UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<GraphDefinition_Link>> link() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> profile() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> start() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<GraphdefinitionStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableGraphDefinition fromJson(Json json) {
    ImmutableGraphDefinition.Builder builder = ((ImmutableGraphDefinition.Builder) ImmutableGraphDefinition.builder());
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.linkIsSet) {
      builder.link(json.link);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.profileIsSet) {
      builder.profile(json.profile);
    }
    if (json.startIsSet) {
      builder.start(json.start);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    return (ImmutableGraphDefinition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link GraphDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable GraphDefinition instance
   */
  public static GraphDefinition copyOf(GraphDefinition instance) {
    if (instance instanceof ImmutableGraphDefinition) {
      return (ImmutableGraphDefinition) instance;
    }
    return ((ImmutableGraphDefinition.Builder) ImmutableGraphDefinition.builder())
        .text(instance.text())
        .implicitRules(instance.implicitRules())
        .purpose(instance.purpose())
        .date(instance.date())
        .modifierExtension(instance.modifierExtension())
        .link(instance.link())
        .experimental(instance.experimental())
        .description(instance.description())
        .profile(instance.profile())
        .start(instance.start())
        .resourceType(instance.resourceType())
        .id(instance.id())
        .name(instance.name())
        .status(instance.status())
        .jurisdiction(instance.jurisdiction())
        .language(instance.language())
        .url(instance.url())
        .publisher(instance.publisher())
        .meta(instance.meta())
        .contained(instance.contained())
        .extension(instance.extension())
        .useContext(instance.useContext())
        .version(instance.version())
        .contact(instance.contact())
        .build();
  }

  /**
   * Creates a builder for {@link GraphDefinition GraphDefinition}.
   * <pre>
   * ImmutableGraphDefinition.builder()
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link GraphDefinition#text() text}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link GraphDefinition#implicitRules() implicitRules}
   *    .purpose(com.fhir.types.fhir.Markdown) // optional {@link GraphDefinition#purpose() purpose}
   *    .date(com.fhir.types.fhir.DateTime) // optional {@link GraphDefinition#date() date}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link GraphDefinition#modifierExtension() modifierExtension}
   *    .link(List&amp;lt;com.fhir.types.fhir.GraphDefinition_Link&amp;gt;) // optional {@link GraphDefinition#link() link}
   *    .experimental(Boolean) // optional {@link GraphDefinition#experimental() experimental}
   *    .description(com.fhir.types.fhir.Markdown) // optional {@link GraphDefinition#description() description}
   *    .profile(com.fhir.types.fhir.Canonical) // optional {@link GraphDefinition#profile() profile}
   *    .start(com.fhir.types.fhir.Code) // optional {@link GraphDefinition#start() start}
   *    .resourceType(String) // required {@link GraphDefinition#resourceType() resourceType}
   *    .id(com.fhir.types.fhir.Id) // optional {@link GraphDefinition#id() id}
   *    .name(String) // optional {@link GraphDefinition#name() name}
   *    .status(com.fhir.types.fhir.GraphdefinitionStatus) // optional {@link GraphDefinition#status() status}
   *    .jurisdiction(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link GraphDefinition#jurisdiction() jurisdiction}
   *    .language(com.fhir.types.fhir.Code) // optional {@link GraphDefinition#language() language}
   *    .url(com.fhir.types.fhir.Uri) // optional {@link GraphDefinition#url() url}
   *    .publisher(String) // optional {@link GraphDefinition#publisher() publisher}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link GraphDefinition#meta() meta}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link GraphDefinition#contained() contained}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link GraphDefinition#extension() extension}
   *    .useContext(List&amp;lt;com.fhir.types.fhir.UsageContext&amp;gt;) // optional {@link GraphDefinition#useContext() useContext}
   *    .version(String) // optional {@link GraphDefinition#version() version}
   *    .contact(List&amp;lt;com.fhir.types.fhir.ContactDetail&amp;gt;) // optional {@link GraphDefinition#contact() contact}
   *    .build();
   * </pre>
   * @return A new GraphDefinition builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableGraphDefinition.Builder();
  }

  /**
   * Builds instances of type {@link GraphDefinition GraphDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "GraphDefinition", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_TEXT = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2L;
    private static final long OPT_BIT_PURPOSE = 0x4L;
    private static final long OPT_BIT_DATE = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_LINK = 0x20L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x40L;
    private static final long OPT_BIT_DESCRIPTION = 0x80L;
    private static final long OPT_BIT_PROFILE = 0x100L;
    private static final long OPT_BIT_START = 0x200L;
    private static final long OPT_BIT_ID = 0x400L;
    private static final long OPT_BIT_NAME = 0x800L;
    private static final long OPT_BIT_STATUS = 0x1000L;
    private static final long OPT_BIT_JURISDICTION = 0x2000L;
    private static final long OPT_BIT_LANGUAGE = 0x4000L;
    private static final long OPT_BIT_URL = 0x8000L;
    private static final long OPT_BIT_PUBLISHER = 0x10000L;
    private static final long OPT_BIT_META = 0x20000L;
    private static final long OPT_BIT_CONTAINED = 0x40000L;
    private static final long OPT_BIT_EXTENSION = 0x80000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x100000L;
    private static final long OPT_BIT_VERSION = 0x200000L;
    private static final long OPT_BIT_CONTACT = 0x400000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Narrative text;
    private @Nullable Uri implicitRules;
    private @Nullable Markdown purpose;
    private @Nullable DateTime date;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<GraphDefinition_Link> link;
    private @Nullable Boolean experimental;
    private @Nullable Markdown description;
    private @Nullable Canonical profile;
    private @Nullable Code start;
    private @Nullable String resourceType;
    private @Nullable Id id;
    private @Nullable String name;
    private @Nullable GraphdefinitionStatus status;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable Code language;
    private @Nullable Uri url;
    private @Nullable String publisher;
    private @Nullable Meta meta;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Extension> extension;
    private @Nullable List<UsageContext> useContext;
    private @Nullable String version;
    private @Nullable List<ContactDetail> contact;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link GraphDefinition#text() text} to text.
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
     * Initializes the optional value {@link GraphDefinition#text() text} to text.
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
     * Initializes the optional value {@link GraphDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link GraphDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link GraphDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link GraphDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link GraphDefinition#date() date} to date.
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
     * Initializes the optional value {@link GraphDefinition#date() date} to date.
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
     * Initializes the optional value {@link GraphDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link GraphDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link GraphDefinition#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    public final Builder link(List<GraphDefinition_Link> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = Objects.requireNonNull(link, "link");
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("link")
    public final Builder link(Optional<? extends List<GraphDefinition_Link>> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = link.orElse(null);
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link GraphDefinition#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link GraphDefinition#description() description} to description.
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
     * Initializes the optional value {@link GraphDefinition#description() description} to description.
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
     * Initializes the optional value {@link GraphDefinition#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for chained invocation
     */
    public final Builder profile(Canonical profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = Objects.requireNonNull(profile, "profile");
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("profile")
    public final Builder profile(Optional<? extends Canonical> profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = profile.orElse(null);
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for chained invocation
     */
    public final Builder start(Code start) {
      checkNotIsSet(startIsSet(), "start");
      this.start = Objects.requireNonNull(start, "start");
      optBits |= OPT_BIT_START;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("start")
    public final Builder start(Optional<? extends Code> start) {
      checkNotIsSet(startIsSet(), "start");
      this.start = start.orElse(null);
      optBits |= OPT_BIT_START;
      return this;
    }

    /**
     * Initializes the value for the {@link GraphDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link GraphDefinition#id() id} to id.
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
     * Initializes the optional value {@link GraphDefinition#id() id} to id.
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
     * Initializes the optional value {@link GraphDefinition#name() name} to name.
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
     * Initializes the optional value {@link GraphDefinition#name() name} to name.
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
     * Initializes the optional value {@link GraphDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(GraphdefinitionStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends GraphdefinitionStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link GraphDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link GraphDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link GraphDefinition#language() language} to language.
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
     * Initializes the optional value {@link GraphDefinition#language() language} to language.
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
     * Initializes the optional value {@link GraphDefinition#url() url} to url.
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
     * Initializes the optional value {@link GraphDefinition#url() url} to url.
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
     * Initializes the optional value {@link GraphDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link GraphDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link GraphDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link GraphDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link GraphDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link GraphDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link GraphDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link GraphDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link GraphDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link GraphDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link GraphDefinition#version() version} to version.
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
     * Initializes the optional value {@link GraphDefinition#version() version} to version.
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
     * Initializes the optional value {@link GraphDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link GraphDefinition#contact() contact} to contact.
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
     * Builds a new {@link GraphDefinition GraphDefinition}.
     * @return An immutable instance of GraphDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public GraphDefinition build() {
      checkRequiredAttributes();
      return new ImmutableGraphDefinition(
          text,
          implicitRules,
          purpose,
          date,
          modifierExtension,
          link,
          experimental,
          description,
          profile,
          start,
          resourceType,
          id,
          name,
          status,
          jurisdiction,
          language,
          url,
          publisher,
          meta,
          contained,
          extension,
          useContext,
          version,
          contact);
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean linkIsSet() {
      return (optBits & OPT_BIT_LINK) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean profileIsSet() {
      return (optBits & OPT_BIT_PROFILE) != 0;
    }

    private boolean startIsSet() {
      return (optBits & OPT_BIT_START) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of GraphDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build GraphDefinition, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "GraphDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link GraphDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "GraphDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link GraphDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link GraphDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link GraphDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link GraphDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link GraphDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(Markdown purpose);

    /**
     * Initializes the optional value {@link GraphDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(Optional<? extends Markdown> purpose);

    /**
     * Initializes the optional value {@link GraphDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link GraphDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link GraphDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link GraphDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link GraphDefinition#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    BuildFinal link(List<GraphDefinition_Link> link);

    /**
     * Initializes the optional value {@link GraphDefinition#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal link(Optional<? extends List<GraphDefinition_Link>> link);

    /**
     * Initializes the optional value {@link GraphDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link GraphDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(Optional<Boolean> experimental);

    /**
     * Initializes the optional value {@link GraphDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(Markdown description);

    /**
     * Initializes the optional value {@link GraphDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<? extends Markdown> description);

    /**
     * Initializes the optional value {@link GraphDefinition#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for chained invocation
     */
    BuildFinal profile(Canonical profile);

    /**
     * Initializes the optional value {@link GraphDefinition#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal profile(Optional<? extends Canonical> profile);

    /**
     * Initializes the optional value {@link GraphDefinition#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for chained invocation
     */
    BuildFinal start(Code start);

    /**
     * Initializes the optional value {@link GraphDefinition#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal start(Optional<? extends Code> start);

    /**
     * Initializes the optional value {@link GraphDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link GraphDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link GraphDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link GraphDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link GraphDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(GraphdefinitionStatus status);

    /**
     * Initializes the optional value {@link GraphDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends GraphdefinitionStatus> status);

    /**
     * Initializes the optional value {@link GraphDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(List<CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link GraphDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link GraphDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link GraphDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link GraphDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link GraphDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link GraphDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(String publisher);

    /**
     * Initializes the optional value {@link GraphDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<String> publisher);

    /**
     * Initializes the optional value {@link GraphDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link GraphDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link GraphDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link GraphDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link GraphDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link GraphDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link GraphDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(List<UsageContext> useContext);

    /**
     * Initializes the optional value {@link GraphDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(Optional<? extends List<UsageContext>> useContext);

    /**
     * Initializes the optional value {@link GraphDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link GraphDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link GraphDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link GraphDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Builds a new {@link GraphDefinition GraphDefinition}.
     * @return An immutable instance of GraphDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    GraphDefinition build();
  }
}
