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
 * Immutable implementation of {@link NamingSystem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableNamingSystem.builder()}.
 */
@Generated(from = "NamingSystem", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableNamingSystem implements NamingSystem {
  private final @Nullable Meta meta;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Extension> extension;
  private final @Nullable String responsible;
  private final @Nullable CodeableConcept type;
  private final @Nullable Narrative text;
  private final @Nullable List<UsageContext> useContext;
  private final List<NamingSystem_UniqueId> uniqueId;
  private final @Nullable Markdown description;
  private final @Nullable Uri implicitRules;
  private final @Nullable DateTime date;
  private final @Nullable Id id;
  private final String resourceType;
  private final @Nullable List<ContactDetail> contact;
  private final @Nullable NamingsystemStatus status;
  private final @Nullable NamingsystemKind kind;
  private final @Nullable String name;
  private final @Nullable Code language;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final @Nullable String usage;
  private final @Nullable String publisher;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableNamingSystem(
      @Nullable Meta meta,
      @Nullable List<ResourceList> contained,
      @Nullable List<Extension> extension,
      @Nullable String responsible,
      @Nullable CodeableConcept type,
      @Nullable Narrative text,
      @Nullable List<UsageContext> useContext,
      List<NamingSystem_UniqueId> uniqueId,
      @Nullable Markdown description,
      @Nullable Uri implicitRules,
      @Nullable DateTime date,
      @Nullable Id id,
      String resourceType,
      @Nullable List<ContactDetail> contact,
      @Nullable NamingsystemStatus status,
      @Nullable NamingsystemKind kind,
      @Nullable String name,
      @Nullable Code language,
      @Nullable List<CodeableConcept> jurisdiction,
      @Nullable String usage,
      @Nullable String publisher,
      @Nullable List<Extension> modifierExtension) {
    this.meta = meta;
    this.contained = contained;
    this.extension = extension;
    this.responsible = responsible;
    this.type = type;
    this.text = text;
    this.useContext = useContext;
    this.uniqueId = uniqueId;
    this.description = description;
    this.implicitRules = implicitRules;
    this.date = date;
    this.id = id;
    this.resourceType = resourceType;
    this.contact = contact;
    this.status = status;
    this.kind = kind;
    this.name = name;
    this.language = language;
    this.jurisdiction = jurisdiction;
    this.usage = usage;
    this.publisher = publisher;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code responsible} attribute
   */
  @JsonProperty("responsible")
  @Override
  public Optional<String> responsible() {
    return Optional.ofNullable(responsible);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code useContext} attribute
   */
  @JsonProperty("useContext")
  @Override
  public Optional<List<UsageContext>> useContext() {
    return Optional.ofNullable(useContext);
  }

  /**
   * @return The value of the {@code uniqueId} attribute
   */
  @JsonProperty("uniqueId")
  @Override
  public List<NamingSystem_UniqueId> uniqueId() {
    return uniqueId;
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code contact} attribute
   */
  @JsonProperty("contact")
  @Override
  public Optional<List<ContactDetail>> contact() {
    return Optional.ofNullable(contact);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<NamingsystemStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code kind} attribute
   */
  @JsonProperty("kind")
  @Override
  public Optional<NamingsystemKind> kind() {
    return Optional.ofNullable(kind);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * @return The value of the {@code usage} attribute
   */
  @JsonProperty("usage")
  @Override
  public Optional<String> usage() {
    return Optional.ofNullable(usage);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableNamingSystem(
        newValue,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableNamingSystem(
        value,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableNamingSystem(
        this.meta,
        newValue,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableNamingSystem(
        this.meta,
        value,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        newValue,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        value,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#responsible() responsible} attribute.
   * @param value The value for responsible
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withResponsible(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "responsible");
    if (Objects.equals(this.responsible, newValue)) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        newValue,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#responsible() responsible} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for responsible
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withResponsible(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.responsible, value)) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        value,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        newValue,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        value,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        newValue,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        value,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withUseContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        newValue,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withUseContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        value,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link NamingSystem#uniqueId() uniqueId}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withUniqueId(NamingSystem_UniqueId... elements) {
    List<NamingSystem_UniqueId> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        newValue,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link NamingSystem#uniqueId() uniqueId}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of uniqueId elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withUniqueId(Iterable<? extends NamingSystem_UniqueId> elements) {
    if (this.uniqueId == elements) return this;
    List<NamingSystem_UniqueId> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        newValue,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        newValue,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        value,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        newValue,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        value,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        newValue,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        value,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        newValue,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        value,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link NamingSystem#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNamingSystem withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        newValue,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        newValue,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        value,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withStatus(NamingsystemStatus value) {
    @Nullable NamingsystemStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        newValue,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withStatus(Optional<? extends NamingsystemStatus> optional) {
    @Nullable NamingsystemStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        value,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#kind() kind} attribute.
   * @param value The value for kind
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withKind(NamingsystemKind value) {
    @Nullable NamingsystemKind newValue = Objects.requireNonNull(value, "kind");
    if (this.kind == newValue) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        newValue,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#kind() kind} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for kind
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withKind(Optional<? extends NamingsystemKind> optional) {
    @Nullable NamingsystemKind value = optional.orElse(null);
    if (this.kind == value) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        value,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        newValue,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        value,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        newValue,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        value,
        this.jurisdiction,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        newValue,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        value,
        this.usage,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#usage() usage} attribute.
   * @param value The value for usage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withUsage(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "usage");
    if (Objects.equals(this.usage, newValue)) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        newValue,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#usage() usage} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withUsage(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.usage, value)) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        value,
        this.publisher,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withPublisher(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "publisher");
    if (Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withPublisher(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.publisher, value)) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link NamingSystem#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNamingSystem withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link NamingSystem#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNamingSystem withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableNamingSystem(
        this.meta,
        this.contained,
        this.extension,
        this.responsible,
        this.type,
        this.text,
        this.useContext,
        this.uniqueId,
        this.description,
        this.implicitRules,
        this.date,
        this.id,
        this.resourceType,
        this.contact,
        this.status,
        this.kind,
        this.name,
        this.language,
        this.jurisdiction,
        this.usage,
        this.publisher,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableNamingSystem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableNamingSystem
        && equalTo((ImmutableNamingSystem) another);
  }

  private boolean equalTo(ImmutableNamingSystem another) {
    return Objects.equals(meta, another.meta)
        && Objects.equals(contained, another.contained)
        && Objects.equals(extension, another.extension)
        && Objects.equals(responsible, another.responsible)
        && Objects.equals(type, another.type)
        && Objects.equals(text, another.text)
        && Objects.equals(useContext, another.useContext)
        && uniqueId.equals(another.uniqueId)
        && Objects.equals(description, another.description)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(date, another.date)
        && Objects.equals(id, another.id)
        && resourceType.equals(another.resourceType)
        && Objects.equals(contact, another.contact)
        && Objects.equals(status, another.status)
        && Objects.equals(kind, another.kind)
        && Objects.equals(name, another.name)
        && Objects.equals(language, another.language)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(usage, another.usage)
        && Objects.equals(publisher, another.publisher)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code meta}, {@code contained}, {@code extension}, {@code responsible}, {@code type}, {@code text}, {@code useContext}, {@code uniqueId}, {@code description}, {@code implicitRules}, {@code date}, {@code id}, {@code resourceType}, {@code contact}, {@code status}, {@code kind}, {@code name}, {@code language}, {@code jurisdiction}, {@code usage}, {@code publisher}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(responsible);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(useContext);
    h += (h << 5) + uniqueId.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(kind);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(usage);
    h += (h << 5) + Objects.hashCode(publisher);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code NamingSystem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("NamingSystem{");
    if (meta != null) {
      builder.append("meta=").append(meta);
    }
    if (contained != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (extension != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (responsible != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("responsible=").append(responsible);
    }
    if (type != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (text != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (useContext != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (builder.length() > 13) builder.append(", ");
    builder.append("uniqueId=").append(uniqueId);
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (kind != null) {
      builder.append(", ");
      builder.append("kind=").append(kind);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (usage != null) {
      builder.append(", ");
      builder.append("usage=").append(usage);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "NamingSystem", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements NamingSystem {
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> responsible = Optional.empty();
    boolean responsibleIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<UsageContext>> useContext = Optional.empty();
    boolean useContextIsSet;
    @Nullable List<NamingSystem_UniqueId> uniqueId = Collections.emptyList();
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<NamingsystemStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<NamingsystemKind> kind = Optional.empty();
    boolean kindIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<String> usage = Optional.empty();
    boolean usageIsSet;
    @Nullable Optional<String> publisher = Optional.empty();
    boolean publisherIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
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
    @JsonProperty("responsible")
    public void setResponsible(Optional<String> responsible) {
      this.responsible = responsible;
      this.responsibleIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("useContext")
    public void setUseContext(Optional<List<UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @JsonProperty("uniqueId")
    public void setUniqueId(List<NamingSystem_UniqueId> uniqueId) {
      this.uniqueId = uniqueId;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<NamingsystemStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("kind")
    public void setKind(Optional<NamingsystemKind> kind) {
      this.kind = kind;
      this.kindIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<List<CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("usage")
    public void setUsage(Optional<String> usage) {
      this.usage = usage;
      this.usageIsSet = true;
    }
    @JsonProperty("publisher")
    public void setPublisher(Optional<String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> responsible() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public List<NamingSystem_UniqueId> uniqueId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<NamingsystemStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<NamingsystemKind> kind() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> usage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableNamingSystem fromJson(Json json) {
    ImmutableNamingSystem.Builder builder = ((ImmutableNamingSystem.Builder) ImmutableNamingSystem.builder());
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.responsibleIsSet) {
      builder.responsible(json.responsible);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.uniqueId != null) {
      builder.addAllUniqueId(json.uniqueId);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.kindIsSet) {
      builder.kind(json.kind);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.usageIsSet) {
      builder.usage(json.usage);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableNamingSystem) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link NamingSystem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable NamingSystem instance
   */
  public static NamingSystem copyOf(NamingSystem instance) {
    if (instance instanceof ImmutableNamingSystem) {
      return (ImmutableNamingSystem) instance;
    }
    return ((ImmutableNamingSystem.Builder) ImmutableNamingSystem.builder())
        .meta(instance.meta())
        .contained(instance.contained())
        .extension(instance.extension())
        .responsible(instance.responsible())
        .type(instance.type())
        .text(instance.text())
        .useContext(instance.useContext())
        .addAllUniqueId(instance.uniqueId())
        .description(instance.description())
        .implicitRules(instance.implicitRules())
        .date(instance.date())
        .id(instance.id())
        .resourceType(instance.resourceType())
        .contact(instance.contact())
        .status(instance.status())
        .kind(instance.kind())
        .name(instance.name())
        .language(instance.language())
        .jurisdiction(instance.jurisdiction())
        .usage(instance.usage())
        .publisher(instance.publisher())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link NamingSystem NamingSystem}.
   * <pre>
   * ImmutableNamingSystem.builder()
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link NamingSystem#meta() meta}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link NamingSystem#contained() contained}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link NamingSystem#extension() extension}
   *    .responsible(String) // optional {@link NamingSystem#responsible() responsible}
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link NamingSystem#type() type}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link NamingSystem#text() text}
   *    .useContext(List&amp;lt;com.fhir.types.fhir.UsageContext&amp;gt;) // optional {@link NamingSystem#useContext() useContext}
   *    .addUniqueId|addAllUniqueId(com.fhir.types.fhir.NamingSystem_UniqueId) // {@link NamingSystem#uniqueId() uniqueId} elements
   *    .description(com.fhir.types.fhir.Markdown) // optional {@link NamingSystem#description() description}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link NamingSystem#implicitRules() implicitRules}
   *    .date(com.fhir.types.fhir.DateTime) // optional {@link NamingSystem#date() date}
   *    .id(com.fhir.types.fhir.Id) // optional {@link NamingSystem#id() id}
   *    .resourceType(String) // required {@link NamingSystem#resourceType() resourceType}
   *    .contact(List&amp;lt;com.fhir.types.fhir.ContactDetail&amp;gt;) // optional {@link NamingSystem#contact() contact}
   *    .status(com.fhir.types.fhir.NamingsystemStatus) // optional {@link NamingSystem#status() status}
   *    .kind(com.fhir.types.fhir.NamingsystemKind) // optional {@link NamingSystem#kind() kind}
   *    .name(String) // optional {@link NamingSystem#name() name}
   *    .language(com.fhir.types.fhir.Code) // optional {@link NamingSystem#language() language}
   *    .jurisdiction(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link NamingSystem#jurisdiction() jurisdiction}
   *    .usage(String) // optional {@link NamingSystem#usage() usage}
   *    .publisher(String) // optional {@link NamingSystem#publisher() publisher}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link NamingSystem#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new NamingSystem builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableNamingSystem.Builder();
  }

  /**
   * Builds instances of type {@link NamingSystem NamingSystem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "NamingSystem", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_META = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_RESPONSIBLE = 0x8L;
    private static final long OPT_BIT_TYPE = 0x10L;
    private static final long OPT_BIT_TEXT = 0x20L;
    private static final long OPT_BIT_USE_CONTEXT = 0x40L;
    private static final long OPT_BIT_DESCRIPTION = 0x80L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x100L;
    private static final long OPT_BIT_DATE = 0x200L;
    private static final long OPT_BIT_ID = 0x400L;
    private static final long OPT_BIT_CONTACT = 0x800L;
    private static final long OPT_BIT_STATUS = 0x1000L;
    private static final long OPT_BIT_KIND = 0x2000L;
    private static final long OPT_BIT_NAME = 0x4000L;
    private static final long OPT_BIT_LANGUAGE = 0x8000L;
    private static final long OPT_BIT_JURISDICTION = 0x10000L;
    private static final long OPT_BIT_USAGE = 0x20000L;
    private static final long OPT_BIT_PUBLISHER = 0x40000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Meta meta;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Extension> extension;
    private @Nullable String responsible;
    private @Nullable CodeableConcept type;
    private @Nullable Narrative text;
    private @Nullable List<UsageContext> useContext;
    private final List<NamingSystem_UniqueId> uniqueId = new ArrayList<NamingSystem_UniqueId>();
    private @Nullable Markdown description;
    private @Nullable Uri implicitRules;
    private @Nullable DateTime date;
    private @Nullable Id id;
    private @Nullable String resourceType;
    private @Nullable List<ContactDetail> contact;
    private @Nullable NamingsystemStatus status;
    private @Nullable NamingsystemKind kind;
    private @Nullable String name;
    private @Nullable Code language;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable String usage;
    private @Nullable String publisher;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link NamingSystem#meta() meta} to meta.
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
     * Initializes the optional value {@link NamingSystem#meta() meta} to meta.
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
     * Initializes the optional value {@link NamingSystem#contained() contained} to contained.
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
     * Initializes the optional value {@link NamingSystem#contained() contained} to contained.
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
     * Initializes the optional value {@link NamingSystem#extension() extension} to extension.
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
     * Initializes the optional value {@link NamingSystem#extension() extension} to extension.
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
     * Initializes the optional value {@link NamingSystem#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for chained invocation
     */
    public final Builder responsible(String responsible) {
      checkNotIsSet(responsibleIsSet(), "responsible");
      this.responsible = Objects.requireNonNull(responsible, "responsible");
      optBits |= OPT_BIT_RESPONSIBLE;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("responsible")
    public final Builder responsible(Optional<String> responsible) {
      checkNotIsSet(responsibleIsSet(), "responsible");
      this.responsible = responsible.orElse(null);
      optBits |= OPT_BIT_RESPONSIBLE;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem#text() text} to text.
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
     * Initializes the optional value {@link NamingSystem#text() text} to text.
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
     * Initializes the optional value {@link NamingSystem#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link NamingSystem#useContext() useContext} to useContext.
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
     * Adds one element to {@link NamingSystem#uniqueId() uniqueId} list.
     * @param element A uniqueId element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addUniqueId(NamingSystem_UniqueId element) {
      this.uniqueId.add(Objects.requireNonNull(element, "uniqueId element"));
      return this;
    }

    /**
     * Adds elements to {@link NamingSystem#uniqueId() uniqueId} list.
     * @param elements An array of uniqueId elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addUniqueId(NamingSystem_UniqueId... elements) {
      for (NamingSystem_UniqueId element : elements) {
        this.uniqueId.add(Objects.requireNonNull(element, "uniqueId element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link NamingSystem#uniqueId() uniqueId} list.
     * @param elements An iterable of uniqueId elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllUniqueId(Iterable<? extends NamingSystem_UniqueId> elements) {
      for (NamingSystem_UniqueId element : elements) {
        this.uniqueId.add(Objects.requireNonNull(element, "uniqueId element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem#description() description} to description.
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
     * Initializes the optional value {@link NamingSystem#description() description} to description.
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
     * Initializes the optional value {@link NamingSystem#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link NamingSystem#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link NamingSystem#date() date} to date.
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
     * Initializes the optional value {@link NamingSystem#date() date} to date.
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
     * Initializes the optional value {@link NamingSystem#id() id} to id.
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
     * Initializes the optional value {@link NamingSystem#id() id} to id.
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
     * Initializes the value for the {@link NamingSystem#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link NamingSystem#contact() contact} to contact.
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
     * Initializes the optional value {@link NamingSystem#contact() contact} to contact.
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
     * Initializes the optional value {@link NamingSystem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(NamingsystemStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends NamingsystemStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    public final Builder kind(NamingsystemKind kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = Objects.requireNonNull(kind, "kind");
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(Optional<? extends NamingsystemKind> kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = kind.orElse(null);
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem#name() name} to name.
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
     * Initializes the optional value {@link NamingSystem#name() name} to name.
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
     * Initializes the optional value {@link NamingSystem#language() language} to language.
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
     * Initializes the optional value {@link NamingSystem#language() language} to language.
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
     * Initializes the optional value {@link NamingSystem#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link NamingSystem#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link NamingSystem#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for chained invocation
     */
    public final Builder usage(String usage) {
      checkNotIsSet(usageIsSet(), "usage");
      this.usage = Objects.requireNonNull(usage, "usage");
      optBits |= OPT_BIT_USAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("usage")
    public final Builder usage(Optional<String> usage) {
      checkNotIsSet(usageIsSet(), "usage");
      this.usage = usage.orElse(null);
      optBits |= OPT_BIT_USAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link NamingSystem#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link NamingSystem#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link NamingSystem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link NamingSystem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link NamingSystem NamingSystem}.
     * @return An immutable instance of NamingSystem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public NamingSystem build() {
      checkRequiredAttributes();
      return new ImmutableNamingSystem(
          meta,
          contained,
          extension,
          responsible,
          type,
          text,
          useContext,
          createUnmodifiableList(true, uniqueId),
          description,
          implicitRules,
          date,
          id,
          resourceType,
          contact,
          status,
          kind,
          name,
          language,
          jurisdiction,
          usage,
          publisher,
          modifierExtension);
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

    private boolean responsibleIsSet() {
      return (optBits & OPT_BIT_RESPONSIBLE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean kindIsSet() {
      return (optBits & OPT_BIT_KIND) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean usageIsSet() {
      return (optBits & OPT_BIT_USAGE) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of NamingSystem is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build NamingSystem, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "NamingSystem", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link NamingSystem#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "NamingSystem", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link NamingSystem#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link NamingSystem#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link NamingSystem#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link NamingSystem#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link NamingSystem#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link NamingSystem#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link NamingSystem#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for chained invocation
     */
    BuildFinal responsible(String responsible);

    /**
     * Initializes the optional value {@link NamingSystem#responsible() responsible} to responsible.
     * @param responsible The value for responsible
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal responsible(Optional<String> responsible);

    /**
     * Initializes the optional value {@link NamingSystem#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(CodeableConcept type);

    /**
     * Initializes the optional value {@link NamingSystem#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends CodeableConcept> type);

    /**
     * Initializes the optional value {@link NamingSystem#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link NamingSystem#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link NamingSystem#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(List<UsageContext> useContext);

    /**
     * Initializes the optional value {@link NamingSystem#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(Optional<? extends List<UsageContext>> useContext);

    /**
     * Adds one element to {@link NamingSystem#uniqueId() uniqueId} list.
     * @param element A uniqueId element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addUniqueId(NamingSystem_UniqueId element);

    /**
     * Adds elements to {@link NamingSystem#uniqueId() uniqueId} list.
     * @param elements An array of uniqueId elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addUniqueId(NamingSystem_UniqueId... elements);

    /**
     * Adds elements to {@link NamingSystem#uniqueId() uniqueId} list.
     * @param elements An iterable of uniqueId elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllUniqueId(Iterable<? extends NamingSystem_UniqueId> elements);

    /**
     * Initializes the optional value {@link NamingSystem#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(Markdown description);

    /**
     * Initializes the optional value {@link NamingSystem#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<? extends Markdown> description);

    /**
     * Initializes the optional value {@link NamingSystem#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link NamingSystem#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link NamingSystem#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link NamingSystem#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link NamingSystem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link NamingSystem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link NamingSystem#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link NamingSystem#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Initializes the optional value {@link NamingSystem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(NamingsystemStatus status);

    /**
     * Initializes the optional value {@link NamingSystem#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends NamingsystemStatus> status);

    /**
     * Initializes the optional value {@link NamingSystem#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    BuildFinal kind(NamingsystemKind kind);

    /**
     * Initializes the optional value {@link NamingSystem#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal kind(Optional<? extends NamingsystemKind> kind);

    /**
     * Initializes the optional value {@link NamingSystem#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link NamingSystem#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link NamingSystem#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link NamingSystem#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link NamingSystem#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(List<CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link NamingSystem#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link NamingSystem#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal usage(String usage);

    /**
     * Initializes the optional value {@link NamingSystem#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal usage(Optional<String> usage);

    /**
     * Initializes the optional value {@link NamingSystem#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(String publisher);

    /**
     * Initializes the optional value {@link NamingSystem#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<String> publisher);

    /**
     * Initializes the optional value {@link NamingSystem#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link NamingSystem#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link NamingSystem NamingSystem}.
     * @return An immutable instance of NamingSystem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    NamingSystem build();
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
