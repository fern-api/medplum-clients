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
 * Immutable implementation of {@link MessageDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMessageDefinition.builder()}.
 */
@Generated(from = "MessageDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMessageDefinition implements MessageDefinition {
  private final @Nullable Boolean experimental;
  private final @Nullable Narrative text;
  private final @Nullable List<ContactDetail> contact;
  private final @Nullable List<UsageContext> useContext;
  private final @Nullable MessagedefinitionCategory category;
  private final @Nullable List<Extension> modifierExtension;
  private final String resourceType;
  private final @Nullable Coding eventCoding;
  private final @Nullable Markdown copyright;
  private final @Nullable String title;
  private final @Nullable String publisher;
  private final @Nullable Id id;
  private final @Nullable Code language;
  private final @Nullable Markdown description;
  private final @Nullable List<MessageDefinition_Focus> focus;
  private final @Nullable List<Extension> extension;
  private final @Nullable String version;
  private final @Nullable MessagedefinitionResponserequired responseRequired;
  private final @Nullable List<Canonical> graph;
  private final @Nullable List<MessageDefinition_AllowedResponse> allowedResponse;
  private final @Nullable MessagedefinitionStatus status;
  private final @Nullable String eventUri;
  private final @Nullable DateTime date;
  private final @Nullable Uri url;
  private final @Nullable List<Canonical> replaces;
  private final @Nullable String name;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final @Nullable Meta meta;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Uri implicitRules;
  private final @Nullable Markdown purpose;
  private final @Nullable List<Canonical> parent;
  private final @Nullable Canonical base;

  private ImmutableMessageDefinition(
      @Nullable Boolean experimental,
      @Nullable Narrative text,
      @Nullable List<ContactDetail> contact,
      @Nullable List<UsageContext> useContext,
      @Nullable MessagedefinitionCategory category,
      @Nullable List<Extension> modifierExtension,
      String resourceType,
      @Nullable Coding eventCoding,
      @Nullable Markdown copyright,
      @Nullable String title,
      @Nullable String publisher,
      @Nullable Id id,
      @Nullable Code language,
      @Nullable Markdown description,
      @Nullable List<MessageDefinition_Focus> focus,
      @Nullable List<Extension> extension,
      @Nullable String version,
      @Nullable MessagedefinitionResponserequired responseRequired,
      @Nullable List<Canonical> graph,
      @Nullable List<MessageDefinition_AllowedResponse> allowedResponse,
      @Nullable MessagedefinitionStatus status,
      @Nullable String eventUri,
      @Nullable DateTime date,
      @Nullable Uri url,
      @Nullable List<Canonical> replaces,
      @Nullable String name,
      @Nullable List<ResourceList> contained,
      @Nullable List<CodeableConcept> jurisdiction,
      @Nullable Meta meta,
      @Nullable List<Identifier> identifier,
      @Nullable Uri implicitRules,
      @Nullable Markdown purpose,
      @Nullable List<Canonical> parent,
      @Nullable Canonical base) {
    this.experimental = experimental;
    this.text = text;
    this.contact = contact;
    this.useContext = useContext;
    this.category = category;
    this.modifierExtension = modifierExtension;
    this.resourceType = resourceType;
    this.eventCoding = eventCoding;
    this.copyright = copyright;
    this.title = title;
    this.publisher = publisher;
    this.id = id;
    this.language = language;
    this.description = description;
    this.focus = focus;
    this.extension = extension;
    this.version = version;
    this.responseRequired = responseRequired;
    this.graph = graph;
    this.allowedResponse = allowedResponse;
    this.status = status;
    this.eventUri = eventUri;
    this.date = date;
    this.url = url;
    this.replaces = replaces;
    this.name = name;
    this.contained = contained;
    this.jurisdiction = jurisdiction;
    this.meta = meta;
    this.identifier = identifier;
    this.implicitRules = implicitRules;
    this.purpose = purpose;
    this.parent = parent;
    this.base = base;
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
   * @return The value of the {@code useContext} attribute
   */
  @JsonProperty("useContext")
  @Override
  public Optional<List<UsageContext>> useContext() {
    return Optional.ofNullable(useContext);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<MessagedefinitionCategory> category() {
    return Optional.ofNullable(category);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code eventCoding} attribute
   */
  @JsonProperty("eventCoding")
  @Override
  public Optional<Coding> eventCoding() {
    return Optional.ofNullable(eventCoding);
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
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code focus} attribute
   */
  @JsonProperty("focus")
  @Override
  public Optional<List<MessageDefinition_Focus>> focus() {
    return Optional.ofNullable(focus);
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
   * @return The value of the {@code responseRequired} attribute
   */
  @JsonProperty("responseRequired")
  @Override
  public Optional<MessagedefinitionResponserequired> responseRequired() {
    return Optional.ofNullable(responseRequired);
  }

  /**
   * @return The value of the {@code graph} attribute
   */
  @JsonProperty("graph")
  @Override
  public Optional<List<Canonical>> graph() {
    return Optional.ofNullable(graph);
  }

  /**
   * @return The value of the {@code allowedResponse} attribute
   */
  @JsonProperty("allowedResponse")
  @Override
  public Optional<List<MessageDefinition_AllowedResponse>> allowedResponse() {
    return Optional.ofNullable(allowedResponse);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<MessagedefinitionStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code eventUri} attribute
   */
  @JsonProperty("eventUri")
  @Override
  public Optional<String> eventUri() {
    return Optional.ofNullable(eventUri);
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
   * @return The value of the {@code replaces} attribute
   */
  @JsonProperty("replaces")
  @Override
  public Optional<List<Canonical>> replaces() {
    return Optional.ofNullable(replaces);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
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
   * @return The value of the {@code parent} attribute
   */
  @JsonProperty("parent")
  @Override
  public Optional<List<Canonical>> parent() {
    return Optional.ofNullable(parent);
  }

  /**
   * @return The value of the {@code base} attribute
   */
  @JsonProperty("base")
  @Override
  public Optional<Canonical> base() {
    return Optional.ofNullable(base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withExperimental(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableMessageDefinition(
        newValue,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withExperimental(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.experimental, value)) return this;
    return new ImmutableMessageDefinition(
        value,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        newValue,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        value,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        newValue,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        value,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withUseContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        newValue,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withUseContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        value,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withCategory(MessagedefinitionCategory value) {
    @Nullable MessagedefinitionCategory newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        newValue,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withCategory(Optional<? extends MessagedefinitionCategory> optional) {
    @Nullable MessagedefinitionCategory value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        value,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        newValue,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        value,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MessageDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMessageDefinition withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        newValue,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#eventCoding() eventCoding} attribute.
   * @param value The value for eventCoding
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withEventCoding(Coding value) {
    @Nullable Coding newValue = Objects.requireNonNull(value, "eventCoding");
    if (this.eventCoding == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        newValue,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#eventCoding() eventCoding} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for eventCoding
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withEventCoding(Optional<? extends Coding> optional) {
    @Nullable Coding value = optional.orElse(null);
    if (this.eventCoding == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        value,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withCopyright(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        newValue,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withCopyright(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        value,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        newValue,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        value,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withPublisher(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "publisher");
    if (Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        newValue,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withPublisher(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.publisher, value)) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        value,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        newValue,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        value,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        newValue,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        value,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        newValue,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        value,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#focus() focus} attribute.
   * @param value The value for focus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withFocus(List<MessageDefinition_Focus> value) {
    @Nullable List<MessageDefinition_Focus> newValue = Objects.requireNonNull(value, "focus");
    if (this.focus == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        newValue,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#focus() focus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for focus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withFocus(Optional<? extends List<MessageDefinition_Focus>> optional) {
    @Nullable List<MessageDefinition_Focus> value = optional.orElse(null);
    if (this.focus == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        value,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        newValue,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        value,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        newValue,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        value,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#responseRequired() responseRequired} attribute.
   * @param value The value for responseRequired
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withResponseRequired(MessagedefinitionResponserequired value) {
    @Nullable MessagedefinitionResponserequired newValue = Objects.requireNonNull(value, "responseRequired");
    if (this.responseRequired == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        newValue,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#responseRequired() responseRequired} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for responseRequired
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withResponseRequired(Optional<? extends MessagedefinitionResponserequired> optional) {
    @Nullable MessagedefinitionResponserequired value = optional.orElse(null);
    if (this.responseRequired == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        value,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#graph() graph} attribute.
   * @param value The value for graph
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withGraph(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "graph");
    if (this.graph == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        newValue,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#graph() graph} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for graph
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withGraph(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.graph == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        value,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#allowedResponse() allowedResponse} attribute.
   * @param value The value for allowedResponse
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withAllowedResponse(List<MessageDefinition_AllowedResponse> value) {
    @Nullable List<MessageDefinition_AllowedResponse> newValue = Objects.requireNonNull(value, "allowedResponse");
    if (this.allowedResponse == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        newValue,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#allowedResponse() allowedResponse} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for allowedResponse
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withAllowedResponse(Optional<? extends List<MessageDefinition_AllowedResponse>> optional) {
    @Nullable List<MessageDefinition_AllowedResponse> value = optional.orElse(null);
    if (this.allowedResponse == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        value,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withStatus(MessagedefinitionStatus value) {
    @Nullable MessagedefinitionStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        newValue,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withStatus(Optional<? extends MessagedefinitionStatus> optional) {
    @Nullable MessagedefinitionStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        value,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#eventUri() eventUri} attribute.
   * @param value The value for eventUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withEventUri(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "eventUri");
    if (Objects.equals(this.eventUri, newValue)) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        newValue,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#eventUri() eventUri} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for eventUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withEventUri(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.eventUri, value)) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        value,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        newValue,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        value,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        newValue,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        value,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#replaces() replaces} attribute.
   * @param value The value for replaces
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withReplaces(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "replaces");
    if (this.replaces == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        newValue,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#replaces() replaces} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for replaces
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withReplaces(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.replaces == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        value,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        newValue,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        value,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        newValue,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        value,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        newValue,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        value,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        newValue,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        value,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        newValue,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        value,
        this.implicitRules,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        newValue,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        value,
        this.purpose,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withPurpose(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        newValue,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withPurpose(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        value,
        this.parent,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#parent() parent} attribute.
   * @param value The value for parent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withParent(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "parent");
    if (this.parent == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        newValue,
        this.base);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#parent() parent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withParent(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.parent == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        value,
        this.base);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageDefinition#base() base} attribute.
   * @param value The value for base
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageDefinition withBase(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "base");
    if (this.base == newValue) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageDefinition#base() base} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for base
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageDefinition withBase(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.base == value) return this;
    return new ImmutableMessageDefinition(
        this.experimental,
        this.text,
        this.contact,
        this.useContext,
        this.category,
        this.modifierExtension,
        this.resourceType,
        this.eventCoding,
        this.copyright,
        this.title,
        this.publisher,
        this.id,
        this.language,
        this.description,
        this.focus,
        this.extension,
        this.version,
        this.responseRequired,
        this.graph,
        this.allowedResponse,
        this.status,
        this.eventUri,
        this.date,
        this.url,
        this.replaces,
        this.name,
        this.contained,
        this.jurisdiction,
        this.meta,
        this.identifier,
        this.implicitRules,
        this.purpose,
        this.parent,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMessageDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMessageDefinition
        && equalTo((ImmutableMessageDefinition) another);
  }

  private boolean equalTo(ImmutableMessageDefinition another) {
    return Objects.equals(experimental, another.experimental)
        && Objects.equals(text, another.text)
        && Objects.equals(contact, another.contact)
        && Objects.equals(useContext, another.useContext)
        && Objects.equals(category, another.category)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && resourceType.equals(another.resourceType)
        && Objects.equals(eventCoding, another.eventCoding)
        && Objects.equals(copyright, another.copyright)
        && Objects.equals(title, another.title)
        && Objects.equals(publisher, another.publisher)
        && Objects.equals(id, another.id)
        && Objects.equals(language, another.language)
        && Objects.equals(description, another.description)
        && Objects.equals(focus, another.focus)
        && Objects.equals(extension, another.extension)
        && Objects.equals(version, another.version)
        && Objects.equals(responseRequired, another.responseRequired)
        && Objects.equals(graph, another.graph)
        && Objects.equals(allowedResponse, another.allowedResponse)
        && Objects.equals(status, another.status)
        && Objects.equals(eventUri, another.eventUri)
        && Objects.equals(date, another.date)
        && Objects.equals(url, another.url)
        && Objects.equals(replaces, another.replaces)
        && Objects.equals(name, another.name)
        && Objects.equals(contained, another.contained)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(meta, another.meta)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(purpose, another.purpose)
        && Objects.equals(parent, another.parent)
        && Objects.equals(base, another.base);
  }

  /**
   * Computes a hash code from attributes: {@code experimental}, {@code text}, {@code contact}, {@code useContext}, {@code category}, {@code modifierExtension}, {@code resourceType}, {@code eventCoding}, {@code copyright}, {@code title}, {@code publisher}, {@code id}, {@code language}, {@code description}, {@code focus}, {@code extension}, {@code version}, {@code responseRequired}, {@code graph}, {@code allowedResponse}, {@code status}, {@code eventUri}, {@code date}, {@code url}, {@code replaces}, {@code name}, {@code contained}, {@code jurisdiction}, {@code meta}, {@code identifier}, {@code implicitRules}, {@code purpose}, {@code parent}, {@code base}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(experimental);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(useContext);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(eventCoding);
    h += (h << 5) + Objects.hashCode(copyright);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(publisher);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(focus);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(responseRequired);
    h += (h << 5) + Objects.hashCode(graph);
    h += (h << 5) + Objects.hashCode(allowedResponse);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(eventUri);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(replaces);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(purpose);
    h += (h << 5) + Objects.hashCode(parent);
    h += (h << 5) + Objects.hashCode(base);
    return h;
  }

  /**
   * Prints the immutable value {@code MessageDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MessageDefinition{");
    if (experimental != null) {
      builder.append("experimental=").append(experimental);
    }
    if (text != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (contact != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (useContext != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (category != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("category=").append(category);
    }
    if (modifierExtension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 18) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (eventCoding != null) {
      builder.append(", ");
      builder.append("eventCoding=").append(eventCoding);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (focus != null) {
      builder.append(", ");
      builder.append("focus=").append(focus);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (responseRequired != null) {
      builder.append(", ");
      builder.append("responseRequired=").append(responseRequired);
    }
    if (graph != null) {
      builder.append(", ");
      builder.append("graph=").append(graph);
    }
    if (allowedResponse != null) {
      builder.append(", ");
      builder.append("allowedResponse=").append(allowedResponse);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (eventUri != null) {
      builder.append(", ");
      builder.append("eventUri=").append(eventUri);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (replaces != null) {
      builder.append(", ");
      builder.append("replaces=").append(replaces);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (purpose != null) {
      builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (parent != null) {
      builder.append(", ");
      builder.append("parent=").append(parent);
    }
    if (base != null) {
      builder.append(", ");
      builder.append("base=").append(base);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MessageDefinition", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MessageDefinition {
    @Nullable Optional<Boolean> experimental = Optional.empty();
    boolean experimentalIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<List<UsageContext>> useContext = Optional.empty();
    boolean useContextIsSet;
    @Nullable Optional<MessagedefinitionCategory> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Coding> eventCoding = Optional.empty();
    boolean eventCodingIsSet;
    @Nullable Optional<Markdown> copyright = Optional.empty();
    boolean copyrightIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<String> publisher = Optional.empty();
    boolean publisherIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<MessageDefinition_Focus>> focus = Optional.empty();
    boolean focusIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<MessagedefinitionResponserequired> responseRequired = Optional.empty();
    boolean responseRequiredIsSet;
    @Nullable Optional<List<Canonical>> graph = Optional.empty();
    boolean graphIsSet;
    @Nullable Optional<List<MessageDefinition_AllowedResponse>> allowedResponse = Optional.empty();
    boolean allowedResponseIsSet;
    @Nullable Optional<MessagedefinitionStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<String> eventUri = Optional.empty();
    boolean eventUriIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<List<Canonical>> replaces = Optional.empty();
    boolean replacesIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Markdown> purpose = Optional.empty();
    boolean purposeIsSet;
    @Nullable Optional<List<Canonical>> parent = Optional.empty();
    boolean parentIsSet;
    @Nullable Optional<Canonical> base = Optional.empty();
    boolean baseIsSet;
    @JsonProperty("experimental")
    public void setExperimental(Optional<Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
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
    @JsonProperty("useContext")
    public void setUseContext(Optional<List<UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<MessagedefinitionCategory> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("eventCoding")
    public void setEventCoding(Optional<Coding> eventCoding) {
      this.eventCoding = eventCoding;
      this.eventCodingIsSet = true;
    }
    @JsonProperty("copyright")
    public void setCopyright(Optional<Markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("publisher")
    public void setPublisher(Optional<String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
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
    @JsonProperty("focus")
    public void setFocus(Optional<List<MessageDefinition_Focus>> focus) {
      this.focus = focus;
      this.focusIsSet = true;
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
    @JsonProperty("responseRequired")
    public void setResponseRequired(Optional<MessagedefinitionResponserequired> responseRequired) {
      this.responseRequired = responseRequired;
      this.responseRequiredIsSet = true;
    }
    @JsonProperty("graph")
    public void setGraph(Optional<List<Canonical>> graph) {
      this.graph = graph;
      this.graphIsSet = true;
    }
    @JsonProperty("allowedResponse")
    public void setAllowedResponse(Optional<List<MessageDefinition_AllowedResponse>> allowedResponse) {
      this.allowedResponse = allowedResponse;
      this.allowedResponseIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<MessagedefinitionStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("eventUri")
    public void setEventUri(Optional<String> eventUri) {
      this.eventUri = eventUri;
      this.eventUriIsSet = true;
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
    @JsonProperty("replaces")
    public void setReplaces(Optional<List<Canonical>> replaces) {
      this.replaces = replaces;
      this.replacesIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<List<CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
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
    @JsonProperty("parent")
    public void setParent(Optional<List<Canonical>> parent) {
      this.parent = parent;
      this.parentIsSet = true;
    }
    @JsonProperty("base")
    public void setBase(Optional<Canonical> base) {
      this.base = base;
      this.baseIsSet = true;
    }
    @Override
    public Optional<Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<MessagedefinitionCategory> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Coding> eventCoding() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MessageDefinition_Focus>> focus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<MessagedefinitionResponserequired> responseRequired() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> graph() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MessageDefinition_AllowedResponse>> allowedResponse() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<MessagedefinitionStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> eventUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> replaces() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> parent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> base() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMessageDefinition fromJson(Json json) {
    ImmutableMessageDefinition.Builder builder = ((ImmutableMessageDefinition.Builder) ImmutableMessageDefinition.builder());
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.eventCodingIsSet) {
      builder.eventCoding(json.eventCoding);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.focusIsSet) {
      builder.focus(json.focus);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.responseRequiredIsSet) {
      builder.responseRequired(json.responseRequired);
    }
    if (json.graphIsSet) {
      builder.graph(json.graph);
    }
    if (json.allowedResponseIsSet) {
      builder.allowedResponse(json.allowedResponse);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.eventUriIsSet) {
      builder.eventUri(json.eventUri);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.replacesIsSet) {
      builder.replaces(json.replaces);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.parentIsSet) {
      builder.parent(json.parent);
    }
    if (json.baseIsSet) {
      builder.base(json.base);
    }
    return (ImmutableMessageDefinition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MessageDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MessageDefinition instance
   */
  public static MessageDefinition copyOf(MessageDefinition instance) {
    if (instance instanceof ImmutableMessageDefinition) {
      return (ImmutableMessageDefinition) instance;
    }
    return ((ImmutableMessageDefinition.Builder) ImmutableMessageDefinition.builder())
        .experimental(instance.experimental())
        .text(instance.text())
        .contact(instance.contact())
        .useContext(instance.useContext())
        .category(instance.category())
        .modifierExtension(instance.modifierExtension())
        .resourceType(instance.resourceType())
        .eventCoding(instance.eventCoding())
        .copyright(instance.copyright())
        .title(instance.title())
        .publisher(instance.publisher())
        .id(instance.id())
        .language(instance.language())
        .description(instance.description())
        .focus(instance.focus())
        .extension(instance.extension())
        .version(instance.version())
        .responseRequired(instance.responseRequired())
        .graph(instance.graph())
        .allowedResponse(instance.allowedResponse())
        .status(instance.status())
        .eventUri(instance.eventUri())
        .date(instance.date())
        .url(instance.url())
        .replaces(instance.replaces())
        .name(instance.name())
        .contained(instance.contained())
        .jurisdiction(instance.jurisdiction())
        .meta(instance.meta())
        .identifier(instance.identifier())
        .implicitRules(instance.implicitRules())
        .purpose(instance.purpose())
        .parent(instance.parent())
        .base(instance.base())
        .build();
  }

  /**
   * Creates a builder for {@link MessageDefinition MessageDefinition}.
   * <pre>
   * ImmutableMessageDefinition.builder()
   *    .experimental(Boolean) // optional {@link MessageDefinition#experimental() experimental}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link MessageDefinition#text() text}
   *    .contact(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link MessageDefinition#contact() contact}
   *    .useContext(List&amp;lt;com.medplum.types.fhir.UsageContext&amp;gt;) // optional {@link MessageDefinition#useContext() useContext}
   *    .category(com.medplum.types.fhir.MessagedefinitionCategory) // optional {@link MessageDefinition#category() category}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MessageDefinition#modifierExtension() modifierExtension}
   *    .resourceType(String) // required {@link MessageDefinition#resourceType() resourceType}
   *    .eventCoding(com.medplum.types.fhir.Coding) // optional {@link MessageDefinition#eventCoding() eventCoding}
   *    .copyright(com.medplum.types.fhir.Markdown) // optional {@link MessageDefinition#copyright() copyright}
   *    .title(String) // optional {@link MessageDefinition#title() title}
   *    .publisher(String) // optional {@link MessageDefinition#publisher() publisher}
   *    .id(com.medplum.types.fhir.Id) // optional {@link MessageDefinition#id() id}
   *    .language(com.medplum.types.fhir.Code) // optional {@link MessageDefinition#language() language}
   *    .description(com.medplum.types.fhir.Markdown) // optional {@link MessageDefinition#description() description}
   *    .focus(List&amp;lt;com.medplum.types.fhir.MessageDefinition_Focus&amp;gt;) // optional {@link MessageDefinition#focus() focus}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MessageDefinition#extension() extension}
   *    .version(String) // optional {@link MessageDefinition#version() version}
   *    .responseRequired(com.medplum.types.fhir.MessagedefinitionResponserequired) // optional {@link MessageDefinition#responseRequired() responseRequired}
   *    .graph(List&amp;lt;com.medplum.types.fhir.Canonical&amp;gt;) // optional {@link MessageDefinition#graph() graph}
   *    .allowedResponse(List&amp;lt;com.medplum.types.fhir.MessageDefinition_AllowedResponse&amp;gt;) // optional {@link MessageDefinition#allowedResponse() allowedResponse}
   *    .status(com.medplum.types.fhir.MessagedefinitionStatus) // optional {@link MessageDefinition#status() status}
   *    .eventUri(String) // optional {@link MessageDefinition#eventUri() eventUri}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link MessageDefinition#date() date}
   *    .url(com.medplum.types.fhir.Uri) // optional {@link MessageDefinition#url() url}
   *    .replaces(List&amp;lt;com.medplum.types.fhir.Canonical&amp;gt;) // optional {@link MessageDefinition#replaces() replaces}
   *    .name(String) // optional {@link MessageDefinition#name() name}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link MessageDefinition#contained() contained}
   *    .jurisdiction(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link MessageDefinition#jurisdiction() jurisdiction}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link MessageDefinition#meta() meta}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link MessageDefinition#identifier() identifier}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link MessageDefinition#implicitRules() implicitRules}
   *    .purpose(com.medplum.types.fhir.Markdown) // optional {@link MessageDefinition#purpose() purpose}
   *    .parent(List&amp;lt;com.medplum.types.fhir.Canonical&amp;gt;) // optional {@link MessageDefinition#parent() parent}
   *    .base(com.medplum.types.fhir.Canonical) // optional {@link MessageDefinition#base() base}
   *    .build();
   * </pre>
   * @return A new MessageDefinition builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableMessageDefinition.Builder();
  }

  /**
   * Builds instances of type {@link MessageDefinition MessageDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MessageDefinition", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x1L;
    private static final long OPT_BIT_TEXT = 0x2L;
    private static final long OPT_BIT_CONTACT = 0x4L;
    private static final long OPT_BIT_USE_CONTEXT = 0x8L;
    private static final long OPT_BIT_CATEGORY = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_EVENT_CODING = 0x40L;
    private static final long OPT_BIT_COPYRIGHT = 0x80L;
    private static final long OPT_BIT_TITLE = 0x100L;
    private static final long OPT_BIT_PUBLISHER = 0x200L;
    private static final long OPT_BIT_ID = 0x400L;
    private static final long OPT_BIT_LANGUAGE = 0x800L;
    private static final long OPT_BIT_DESCRIPTION = 0x1000L;
    private static final long OPT_BIT_FOCUS = 0x2000L;
    private static final long OPT_BIT_EXTENSION = 0x4000L;
    private static final long OPT_BIT_VERSION = 0x8000L;
    private static final long OPT_BIT_RESPONSE_REQUIRED = 0x10000L;
    private static final long OPT_BIT_GRAPH = 0x20000L;
    private static final long OPT_BIT_ALLOWED_RESPONSE = 0x40000L;
    private static final long OPT_BIT_STATUS = 0x80000L;
    private static final long OPT_BIT_EVENT_URI = 0x100000L;
    private static final long OPT_BIT_DATE = 0x200000L;
    private static final long OPT_BIT_URL = 0x400000L;
    private static final long OPT_BIT_REPLACES = 0x800000L;
    private static final long OPT_BIT_NAME = 0x1000000L;
    private static final long OPT_BIT_CONTAINED = 0x2000000L;
    private static final long OPT_BIT_JURISDICTION = 0x4000000L;
    private static final long OPT_BIT_META = 0x8000000L;
    private static final long OPT_BIT_IDENTIFIER = 0x10000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20000000L;
    private static final long OPT_BIT_PURPOSE = 0x40000000L;
    private static final long OPT_BIT_PARENT = 0x80000000L;
    private static final long OPT_BIT_BASE = 0x100000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Boolean experimental;
    private @Nullable Narrative text;
    private @Nullable List<ContactDetail> contact;
    private @Nullable List<UsageContext> useContext;
    private @Nullable MessagedefinitionCategory category;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String resourceType;
    private @Nullable Coding eventCoding;
    private @Nullable Markdown copyright;
    private @Nullable String title;
    private @Nullable String publisher;
    private @Nullable Id id;
    private @Nullable Code language;
    private @Nullable Markdown description;
    private @Nullable List<MessageDefinition_Focus> focus;
    private @Nullable List<Extension> extension;
    private @Nullable String version;
    private @Nullable MessagedefinitionResponserequired responseRequired;
    private @Nullable List<Canonical> graph;
    private @Nullable List<MessageDefinition_AllowedResponse> allowedResponse;
    private @Nullable MessagedefinitionStatus status;
    private @Nullable String eventUri;
    private @Nullable DateTime date;
    private @Nullable Uri url;
    private @Nullable List<Canonical> replaces;
    private @Nullable String name;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable Meta meta;
    private @Nullable List<Identifier> identifier;
    private @Nullable Uri implicitRules;
    private @Nullable Markdown purpose;
    private @Nullable List<Canonical> parent;
    private @Nullable Canonical base;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MessageDefinition#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link MessageDefinition#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link MessageDefinition#text() text} to text.
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
     * Initializes the optional value {@link MessageDefinition#text() text} to text.
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
     * Initializes the optional value {@link MessageDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link MessageDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link MessageDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link MessageDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link MessageDefinition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(MessagedefinitionCategory category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(Optional<? extends MessagedefinitionCategory> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MessageDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link MessageDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MessageDefinition#eventCoding() eventCoding} to eventCoding.
     * @param eventCoding The value for eventCoding
     * @return {@code this} builder for chained invocation
     */
    public final Builder eventCoding(Coding eventCoding) {
      checkNotIsSet(eventCodingIsSet(), "eventCoding");
      this.eventCoding = Objects.requireNonNull(eventCoding, "eventCoding");
      optBits |= OPT_BIT_EVENT_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#eventCoding() eventCoding} to eventCoding.
     * @param eventCoding The value for eventCoding
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("eventCoding")
    public final Builder eventCoding(Optional<? extends Coding> eventCoding) {
      checkNotIsSet(eventCodingIsSet(), "eventCoding");
      this.eventCoding = eventCoding.orElse(null);
      optBits |= OPT_BIT_EVENT_CODING;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link MessageDefinition#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link MessageDefinition#title() title} to title.
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
     * Initializes the optional value {@link MessageDefinition#title() title} to title.
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
     * Initializes the optional value {@link MessageDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link MessageDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link MessageDefinition#id() id} to id.
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
     * Initializes the optional value {@link MessageDefinition#id() id} to id.
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
     * Initializes the optional value {@link MessageDefinition#language() language} to language.
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
     * Initializes the optional value {@link MessageDefinition#language() language} to language.
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
     * Initializes the optional value {@link MessageDefinition#description() description} to description.
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
     * Initializes the optional value {@link MessageDefinition#description() description} to description.
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
     * Initializes the optional value {@link MessageDefinition#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for chained invocation
     */
    public final Builder focus(List<MessageDefinition_Focus> focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = Objects.requireNonNull(focus, "focus");
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("focus")
    public final Builder focus(Optional<? extends List<MessageDefinition_Focus>> focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = focus.orElse(null);
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link MessageDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link MessageDefinition#version() version} to version.
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
     * Initializes the optional value {@link MessageDefinition#version() version} to version.
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
     * Initializes the optional value {@link MessageDefinition#responseRequired() responseRequired} to responseRequired.
     * @param responseRequired The value for responseRequired
     * @return {@code this} builder for chained invocation
     */
    public final Builder responseRequired(MessagedefinitionResponserequired responseRequired) {
      checkNotIsSet(responseRequiredIsSet(), "responseRequired");
      this.responseRequired = Objects.requireNonNull(responseRequired, "responseRequired");
      optBits |= OPT_BIT_RESPONSE_REQUIRED;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#responseRequired() responseRequired} to responseRequired.
     * @param responseRequired The value for responseRequired
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("responseRequired")
    public final Builder responseRequired(Optional<? extends MessagedefinitionResponserequired> responseRequired) {
      checkNotIsSet(responseRequiredIsSet(), "responseRequired");
      this.responseRequired = responseRequired.orElse(null);
      optBits |= OPT_BIT_RESPONSE_REQUIRED;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#graph() graph} to graph.
     * @param graph The value for graph
     * @return {@code this} builder for chained invocation
     */
    public final Builder graph(List<Canonical> graph) {
      checkNotIsSet(graphIsSet(), "graph");
      this.graph = Objects.requireNonNull(graph, "graph");
      optBits |= OPT_BIT_GRAPH;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#graph() graph} to graph.
     * @param graph The value for graph
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("graph")
    public final Builder graph(Optional<? extends List<Canonical>> graph) {
      checkNotIsSet(graphIsSet(), "graph");
      this.graph = graph.orElse(null);
      optBits |= OPT_BIT_GRAPH;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#allowedResponse() allowedResponse} to allowedResponse.
     * @param allowedResponse The value for allowedResponse
     * @return {@code this} builder for chained invocation
     */
    public final Builder allowedResponse(List<MessageDefinition_AllowedResponse> allowedResponse) {
      checkNotIsSet(allowedResponseIsSet(), "allowedResponse");
      this.allowedResponse = Objects.requireNonNull(allowedResponse, "allowedResponse");
      optBits |= OPT_BIT_ALLOWED_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#allowedResponse() allowedResponse} to allowedResponse.
     * @param allowedResponse The value for allowedResponse
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("allowedResponse")
    public final Builder allowedResponse(Optional<? extends List<MessageDefinition_AllowedResponse>> allowedResponse) {
      checkNotIsSet(allowedResponseIsSet(), "allowedResponse");
      this.allowedResponse = allowedResponse.orElse(null);
      optBits |= OPT_BIT_ALLOWED_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(MessagedefinitionStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends MessagedefinitionStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#eventUri() eventUri} to eventUri.
     * @param eventUri The value for eventUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder eventUri(String eventUri) {
      checkNotIsSet(eventUriIsSet(), "eventUri");
      this.eventUri = Objects.requireNonNull(eventUri, "eventUri");
      optBits |= OPT_BIT_EVENT_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#eventUri() eventUri} to eventUri.
     * @param eventUri The value for eventUri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("eventUri")
    public final Builder eventUri(Optional<String> eventUri) {
      checkNotIsSet(eventUriIsSet(), "eventUri");
      this.eventUri = eventUri.orElse(null);
      optBits |= OPT_BIT_EVENT_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#date() date} to date.
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
     * Initializes the optional value {@link MessageDefinition#date() date} to date.
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
     * Initializes the optional value {@link MessageDefinition#url() url} to url.
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
     * Initializes the optional value {@link MessageDefinition#url() url} to url.
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
     * Initializes the optional value {@link MessageDefinition#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for chained invocation
     */
    public final Builder replaces(List<Canonical> replaces) {
      checkNotIsSet(replacesIsSet(), "replaces");
      this.replaces = Objects.requireNonNull(replaces, "replaces");
      optBits |= OPT_BIT_REPLACES;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("replaces")
    public final Builder replaces(Optional<? extends List<Canonical>> replaces) {
      checkNotIsSet(replacesIsSet(), "replaces");
      this.replaces = replaces.orElse(null);
      optBits |= OPT_BIT_REPLACES;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#name() name} to name.
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
     * Initializes the optional value {@link MessageDefinition#name() name} to name.
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
     * Initializes the optional value {@link MessageDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link MessageDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link MessageDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link MessageDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link MessageDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link MessageDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link MessageDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MessageDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MessageDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MessageDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MessageDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link MessageDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link MessageDefinition#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    public final Builder parent(List<Canonical> parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = Objects.requireNonNull(parent, "parent");
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parent")
    public final Builder parent(Optional<? extends List<Canonical>> parent) {
      checkNotIsSet(parentIsSet(), "parent");
      this.parent = parent.orElse(null);
      optBits |= OPT_BIT_PARENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for chained invocation
     */
    public final Builder base(Canonical base) {
      checkNotIsSet(baseIsSet(), "base");
      this.base = Objects.requireNonNull(base, "base");
      optBits |= OPT_BIT_BASE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageDefinition#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("base")
    public final Builder base(Optional<? extends Canonical> base) {
      checkNotIsSet(baseIsSet(), "base");
      this.base = base.orElse(null);
      optBits |= OPT_BIT_BASE;
      return this;
    }

    /**
     * Builds a new {@link MessageDefinition MessageDefinition}.
     * @return An immutable instance of MessageDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MessageDefinition build() {
      checkRequiredAttributes();
      return new ImmutableMessageDefinition(
          experimental,
          text,
          contact,
          useContext,
          category,
          modifierExtension,
          resourceType,
          eventCoding,
          copyright,
          title,
          publisher,
          id,
          language,
          description,
          focus,
          extension,
          version,
          responseRequired,
          graph,
          allowedResponse,
          status,
          eventUri,
          date,
          url,
          replaces,
          name,
          contained,
          jurisdiction,
          meta,
          identifier,
          implicitRules,
          purpose,
          parent,
          base);
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean eventCodingIsSet() {
      return (optBits & OPT_BIT_EVENT_CODING) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean focusIsSet() {
      return (optBits & OPT_BIT_FOCUS) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean responseRequiredIsSet() {
      return (optBits & OPT_BIT_RESPONSE_REQUIRED) != 0;
    }

    private boolean graphIsSet() {
      return (optBits & OPT_BIT_GRAPH) != 0;
    }

    private boolean allowedResponseIsSet() {
      return (optBits & OPT_BIT_ALLOWED_RESPONSE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean eventUriIsSet() {
      return (optBits & OPT_BIT_EVENT_URI) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean replacesIsSet() {
      return (optBits & OPT_BIT_REPLACES) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean parentIsSet() {
      return (optBits & OPT_BIT_PARENT) != 0;
    }

    private boolean baseIsSet() {
      return (optBits & OPT_BIT_BASE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MessageDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MessageDefinition, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MessageDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MessageDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "MessageDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MessageDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link MessageDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(Optional<Boolean> experimental);

    /**
     * Initializes the optional value {@link MessageDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link MessageDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link MessageDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link MessageDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Initializes the optional value {@link MessageDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(List<UsageContext> useContext);

    /**
     * Initializes the optional value {@link MessageDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(Optional<? extends List<UsageContext>> useContext);

    /**
     * Initializes the optional value {@link MessageDefinition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(MessagedefinitionCategory category);

    /**
     * Initializes the optional value {@link MessageDefinition#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends MessagedefinitionCategory> category);

    /**
     * Initializes the optional value {@link MessageDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MessageDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MessageDefinition#eventCoding() eventCoding} to eventCoding.
     * @param eventCoding The value for eventCoding
     * @return {@code this} builder for chained invocation
     */
    BuildFinal eventCoding(Coding eventCoding);

    /**
     * Initializes the optional value {@link MessageDefinition#eventCoding() eventCoding} to eventCoding.
     * @param eventCoding The value for eventCoding
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal eventCoding(Optional<? extends Coding> eventCoding);

    /**
     * Initializes the optional value {@link MessageDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(Markdown copyright);

    /**
     * Initializes the optional value {@link MessageDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(Optional<? extends Markdown> copyright);

    /**
     * Initializes the optional value {@link MessageDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link MessageDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Initializes the optional value {@link MessageDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(String publisher);

    /**
     * Initializes the optional value {@link MessageDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<String> publisher);

    /**
     * Initializes the optional value {@link MessageDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link MessageDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link MessageDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link MessageDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link MessageDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(Markdown description);

    /**
     * Initializes the optional value {@link MessageDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<? extends Markdown> description);

    /**
     * Initializes the optional value {@link MessageDefinition#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal focus(List<MessageDefinition_Focus> focus);

    /**
     * Initializes the optional value {@link MessageDefinition#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal focus(Optional<? extends List<MessageDefinition_Focus>> focus);

    /**
     * Initializes the optional value {@link MessageDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MessageDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MessageDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link MessageDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link MessageDefinition#responseRequired() responseRequired} to responseRequired.
     * @param responseRequired The value for responseRequired
     * @return {@code this} builder for chained invocation
     */
    BuildFinal responseRequired(MessagedefinitionResponserequired responseRequired);

    /**
     * Initializes the optional value {@link MessageDefinition#responseRequired() responseRequired} to responseRequired.
     * @param responseRequired The value for responseRequired
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal responseRequired(Optional<? extends MessagedefinitionResponserequired> responseRequired);

    /**
     * Initializes the optional value {@link MessageDefinition#graph() graph} to graph.
     * @param graph The value for graph
     * @return {@code this} builder for chained invocation
     */
    BuildFinal graph(List<Canonical> graph);

    /**
     * Initializes the optional value {@link MessageDefinition#graph() graph} to graph.
     * @param graph The value for graph
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal graph(Optional<? extends List<Canonical>> graph);

    /**
     * Initializes the optional value {@link MessageDefinition#allowedResponse() allowedResponse} to allowedResponse.
     * @param allowedResponse The value for allowedResponse
     * @return {@code this} builder for chained invocation
     */
    BuildFinal allowedResponse(List<MessageDefinition_AllowedResponse> allowedResponse);

    /**
     * Initializes the optional value {@link MessageDefinition#allowedResponse() allowedResponse} to allowedResponse.
     * @param allowedResponse The value for allowedResponse
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal allowedResponse(Optional<? extends List<MessageDefinition_AllowedResponse>> allowedResponse);

    /**
     * Initializes the optional value {@link MessageDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(MessagedefinitionStatus status);

    /**
     * Initializes the optional value {@link MessageDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends MessagedefinitionStatus> status);

    /**
     * Initializes the optional value {@link MessageDefinition#eventUri() eventUri} to eventUri.
     * @param eventUri The value for eventUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal eventUri(String eventUri);

    /**
     * Initializes the optional value {@link MessageDefinition#eventUri() eventUri} to eventUri.
     * @param eventUri The value for eventUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal eventUri(Optional<String> eventUri);

    /**
     * Initializes the optional value {@link MessageDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link MessageDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link MessageDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link MessageDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link MessageDefinition#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for chained invocation
     */
    BuildFinal replaces(List<Canonical> replaces);

    /**
     * Initializes the optional value {@link MessageDefinition#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal replaces(Optional<? extends List<Canonical>> replaces);

    /**
     * Initializes the optional value {@link MessageDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link MessageDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link MessageDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link MessageDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link MessageDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(List<CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link MessageDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link MessageDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link MessageDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link MessageDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link MessageDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link MessageDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link MessageDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link MessageDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(Markdown purpose);

    /**
     * Initializes the optional value {@link MessageDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(Optional<? extends Markdown> purpose);

    /**
     * Initializes the optional value {@link MessageDefinition#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parent(List<Canonical> parent);

    /**
     * Initializes the optional value {@link MessageDefinition#parent() parent} to parent.
     * @param parent The value for parent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parent(Optional<? extends List<Canonical>> parent);

    /**
     * Initializes the optional value {@link MessageDefinition#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for chained invocation
     */
    BuildFinal base(Canonical base);

    /**
     * Initializes the optional value {@link MessageDefinition#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal base(Optional<? extends Canonical> base);

    /**
     * Builds a new {@link MessageDefinition MessageDefinition}.
     * @return An immutable instance of MessageDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MessageDefinition build();
  }
}
