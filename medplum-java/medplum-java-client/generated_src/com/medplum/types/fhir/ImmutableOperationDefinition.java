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
 * Immutable implementation of {@link OperationDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOperationDefinition.builder()}.
 */
@Generated(from = "OperationDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableOperationDefinition implements OperationDefinition {
  private final @Nullable List<UsageContext> useContext;
  private final @Nullable Code language;
  private final @Nullable Boolean system;
  private final @Nullable Boolean instance;
  private final @Nullable Meta meta;
  private final @Nullable Canonical base;
  private final @Nullable Canonical outputProfile;
  private final @Nullable Boolean experimental;
  private final @Nullable Markdown purpose;
  private final @Nullable String version;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final @Nullable Id id;
  private final @Nullable Markdown description;
  private final @Nullable Markdown comment;
  private final @Nullable OperationdefinitionStatus status;
  private final @Nullable OperationdefinitionKind kind;
  private final @Nullable Code code;
  private final String resourceType;
  private final @Nullable List<Extension> extension;
  private final @Nullable Narrative text;
  private final @Nullable List<ContactDetail> contact;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Code> resource;
  private final @Nullable String publisher;
  private final @Nullable String name;
  private final @Nullable Boolean type;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable DateTime date;
  private final @Nullable String title;
  private final @Nullable Uri url;
  private final @Nullable Boolean affectsState;
  private final @Nullable List<OperationDefinition_Overload> overload;
  private final @Nullable Canonical inputProfile;
  private final @Nullable List<OperationDefinition_Parameter> parameter;

  private ImmutableOperationDefinition(
      @Nullable List<UsageContext> useContext,
      @Nullable Code language,
      @Nullable Boolean system,
      @Nullable Boolean instance,
      @Nullable Meta meta,
      @Nullable Canonical base,
      @Nullable Canonical outputProfile,
      @Nullable Boolean experimental,
      @Nullable Markdown purpose,
      @Nullable String version,
      @Nullable List<CodeableConcept> jurisdiction,
      @Nullable Id id,
      @Nullable Markdown description,
      @Nullable Markdown comment,
      @Nullable OperationdefinitionStatus status,
      @Nullable OperationdefinitionKind kind,
      @Nullable Code code,
      String resourceType,
      @Nullable List<Extension> extension,
      @Nullable Narrative text,
      @Nullable List<ContactDetail> contact,
      @Nullable Uri implicitRules,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Code> resource,
      @Nullable String publisher,
      @Nullable String name,
      @Nullable Boolean type,
      @Nullable List<ResourceList> contained,
      @Nullable DateTime date,
      @Nullable String title,
      @Nullable Uri url,
      @Nullable Boolean affectsState,
      @Nullable List<OperationDefinition_Overload> overload,
      @Nullable Canonical inputProfile,
      @Nullable List<OperationDefinition_Parameter> parameter) {
    this.useContext = useContext;
    this.language = language;
    this.system = system;
    this.instance = instance;
    this.meta = meta;
    this.base = base;
    this.outputProfile = outputProfile;
    this.experimental = experimental;
    this.purpose = purpose;
    this.version = version;
    this.jurisdiction = jurisdiction;
    this.id = id;
    this.description = description;
    this.comment = comment;
    this.status = status;
    this.kind = kind;
    this.code = code;
    this.resourceType = resourceType;
    this.extension = extension;
    this.text = text;
    this.contact = contact;
    this.implicitRules = implicitRules;
    this.modifierExtension = modifierExtension;
    this.resource = resource;
    this.publisher = publisher;
    this.name = name;
    this.type = type;
    this.contained = contained;
    this.date = date;
    this.title = title;
    this.url = url;
    this.affectsState = affectsState;
    this.overload = overload;
    this.inputProfile = inputProfile;
    this.parameter = parameter;
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code system} attribute
   */
  @JsonProperty("system")
  @Override
  public Optional<Boolean> system() {
    return Optional.ofNullable(system);
  }

  /**
   * @return The value of the {@code instance} attribute
   */
  @JsonProperty("instance")
  @Override
  public Optional<Boolean> instance() {
    return Optional.ofNullable(instance);
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
   * @return The value of the {@code base} attribute
   */
  @JsonProperty("base")
  @Override
  public Optional<Canonical> base() {
    return Optional.ofNullable(base);
  }

  /**
   * @return The value of the {@code outputProfile} attribute
   */
  @JsonProperty("outputProfile")
  @Override
  public Optional<Canonical> outputProfile() {
    return Optional.ofNullable(outputProfile);
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
   * @return The value of the {@code purpose} attribute
   */
  @JsonProperty("purpose")
  @Override
  public Optional<Markdown> purpose() {
    return Optional.ofNullable(purpose);
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @JsonProperty("jurisdiction")
  @Override
  public Optional<List<CodeableConcept>> jurisdiction() {
    return Optional.ofNullable(jurisdiction);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<Markdown> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code comment} attribute
   */
  @JsonProperty("comment")
  @Override
  public Optional<Markdown> comment() {
    return Optional.ofNullable(comment);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<OperationdefinitionStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code kind} attribute
   */
  @JsonProperty("kind")
  @Override
  public Optional<OperationdefinitionKind> kind() {
    return Optional.ofNullable(kind);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<Code> code() {
    return Optional.ofNullable(code);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code resource} attribute
   */
  @JsonProperty("resource")
  @Override
  public Optional<List<Code>> resource() {
    return Optional.ofNullable(resource);
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Boolean> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
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
   * @return The value of the {@code url} attribute
   */
  @JsonProperty("url")
  @Override
  public Optional<Uri> url() {
    return Optional.ofNullable(url);
  }

  /**
   * @return The value of the {@code affectsState} attribute
   */
  @JsonProperty("affectsState")
  @Override
  public Optional<Boolean> affectsState() {
    return Optional.ofNullable(affectsState);
  }

  /**
   * @return The value of the {@code overload} attribute
   */
  @JsonProperty("overload")
  @Override
  public Optional<List<OperationDefinition_Overload>> overload() {
    return Optional.ofNullable(overload);
  }

  /**
   * @return The value of the {@code inputProfile} attribute
   */
  @JsonProperty("inputProfile")
  @Override
  public Optional<Canonical> inputProfile() {
    return Optional.ofNullable(inputProfile);
  }

  /**
   * @return The value of the {@code parameter} attribute
   */
  @JsonProperty("parameter")
  @Override
  public Optional<List<OperationDefinition_Parameter>> parameter() {
    return Optional.ofNullable(parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withUseContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableOperationDefinition(
        newValue,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withUseContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableOperationDefinition(
        value,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        newValue,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        value,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#system() system} attribute.
   * @param value The value for system
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withSystem(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.system, newValue)) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        newValue,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#system() system} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for system
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withSystem(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.system, value)) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        value,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#instance() instance} attribute.
   * @param value The value for instance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withInstance(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.instance, newValue)) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        newValue,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#instance() instance} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withInstance(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.instance, value)) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        value,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        newValue,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        value,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#base() base} attribute.
   * @param value The value for base
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withBase(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "base");
    if (this.base == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        newValue,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#base() base} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for base
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withBase(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.base == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        value,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#outputProfile() outputProfile} attribute.
   * @param value The value for outputProfile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withOutputProfile(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "outputProfile");
    if (this.outputProfile == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        newValue,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#outputProfile() outputProfile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outputProfile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withOutputProfile(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.outputProfile == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        value,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withExperimental(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        newValue,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withExperimental(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.experimental, value)) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        value,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withPurpose(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        newValue,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withPurpose(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        value,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        newValue,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        value,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        newValue,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        value,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        newValue,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        value,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        newValue,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        value,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withComment(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "comment");
    if (this.comment == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        newValue,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#comment() comment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withComment(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.comment == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        value,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withStatus(OperationdefinitionStatus value) {
    @Nullable OperationdefinitionStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        newValue,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withStatus(Optional<? extends OperationdefinitionStatus> optional) {
    @Nullable OperationdefinitionStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        value,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#kind() kind} attribute.
   * @param value The value for kind
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withKind(OperationdefinitionKind value) {
    @Nullable OperationdefinitionKind newValue = Objects.requireNonNull(value, "kind");
    if (this.kind == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        newValue,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#kind() kind} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for kind
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withKind(Optional<? extends OperationdefinitionKind> optional) {
    @Nullable OperationdefinitionKind value = optional.orElse(null);
    if (this.kind == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        value,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withCode(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        newValue,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withCode(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        value,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link OperationDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableOperationDefinition withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        newValue,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        newValue,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        value,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        newValue,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        value,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        newValue,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        value,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        newValue,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        value,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        newValue,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        value,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#resource() resource} attribute.
   * @param value The value for resource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withResource(List<Code> value) {
    @Nullable List<Code> newValue = Objects.requireNonNull(value, "resource");
    if (this.resource == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        newValue,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#resource() resource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withResource(Optional<? extends List<Code>> optional) {
    @Nullable List<Code> value = optional.orElse(null);
    if (this.resource == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        value,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withPublisher(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "publisher");
    if (Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        newValue,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withPublisher(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.publisher, value)) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        value,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        newValue,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        value,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withType(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.type, newValue)) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        newValue,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#type() type} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withType(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.type, value)) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        value,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        newValue,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        value,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        newValue,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        value,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        newValue,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        value,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        newValue,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        value,
        this.affectsState,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#affectsState() affectsState} attribute.
   * @param value The value for affectsState
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withAffectsState(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.affectsState, newValue)) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        newValue,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#affectsState() affectsState} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for affectsState
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withAffectsState(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.affectsState, value)) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        value,
        this.overload,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#overload() overload} attribute.
   * @param value The value for overload
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withOverload(List<OperationDefinition_Overload> value) {
    @Nullable List<OperationDefinition_Overload> newValue = Objects.requireNonNull(value, "overload");
    if (this.overload == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        newValue,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#overload() overload} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for overload
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withOverload(Optional<? extends List<OperationDefinition_Overload>> optional) {
    @Nullable List<OperationDefinition_Overload> value = optional.orElse(null);
    if (this.overload == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        value,
        this.inputProfile,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#inputProfile() inputProfile} attribute.
   * @param value The value for inputProfile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withInputProfile(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "inputProfile");
    if (this.inputProfile == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        newValue,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#inputProfile() inputProfile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for inputProfile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withInputProfile(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.inputProfile == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        value,
        this.parameter);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition#parameter() parameter} attribute.
   * @param value The value for parameter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition withParameter(List<OperationDefinition_Parameter> value) {
    @Nullable List<OperationDefinition_Parameter> newValue = Objects.requireNonNull(value, "parameter");
    if (this.parameter == newValue) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition#parameter() parameter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parameter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition withParameter(Optional<? extends List<OperationDefinition_Parameter>> optional) {
    @Nullable List<OperationDefinition_Parameter> value = optional.orElse(null);
    if (this.parameter == value) return this;
    return new ImmutableOperationDefinition(
        this.useContext,
        this.language,
        this.system,
        this.instance,
        this.meta,
        this.base,
        this.outputProfile,
        this.experimental,
        this.purpose,
        this.version,
        this.jurisdiction,
        this.id,
        this.description,
        this.comment,
        this.status,
        this.kind,
        this.code,
        this.resourceType,
        this.extension,
        this.text,
        this.contact,
        this.implicitRules,
        this.modifierExtension,
        this.resource,
        this.publisher,
        this.name,
        this.type,
        this.contained,
        this.date,
        this.title,
        this.url,
        this.affectsState,
        this.overload,
        this.inputProfile,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOperationDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOperationDefinition
        && equalTo((ImmutableOperationDefinition) another);
  }

  private boolean equalTo(ImmutableOperationDefinition another) {
    return Objects.equals(useContext, another.useContext)
        && Objects.equals(language, another.language)
        && Objects.equals(system, another.system)
        && Objects.equals(instance, another.instance)
        && Objects.equals(meta, another.meta)
        && Objects.equals(base, another.base)
        && Objects.equals(outputProfile, another.outputProfile)
        && Objects.equals(experimental, another.experimental)
        && Objects.equals(purpose, another.purpose)
        && Objects.equals(version, another.version)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(id, another.id)
        && Objects.equals(description, another.description)
        && Objects.equals(comment, another.comment)
        && Objects.equals(status, another.status)
        && Objects.equals(kind, another.kind)
        && Objects.equals(code, another.code)
        && resourceType.equals(another.resourceType)
        && Objects.equals(extension, another.extension)
        && Objects.equals(text, another.text)
        && Objects.equals(contact, another.contact)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(resource, another.resource)
        && Objects.equals(publisher, another.publisher)
        && Objects.equals(name, another.name)
        && Objects.equals(type, another.type)
        && Objects.equals(contained, another.contained)
        && Objects.equals(date, another.date)
        && Objects.equals(title, another.title)
        && Objects.equals(url, another.url)
        && Objects.equals(affectsState, another.affectsState)
        && Objects.equals(overload, another.overload)
        && Objects.equals(inputProfile, another.inputProfile)
        && Objects.equals(parameter, another.parameter);
  }

  /**
   * Computes a hash code from attributes: {@code useContext}, {@code language}, {@code system}, {@code instance}, {@code meta}, {@code base}, {@code outputProfile}, {@code experimental}, {@code purpose}, {@code version}, {@code jurisdiction}, {@code id}, {@code description}, {@code comment}, {@code status}, {@code kind}, {@code code}, {@code resourceType}, {@code extension}, {@code text}, {@code contact}, {@code implicitRules}, {@code modifierExtension}, {@code resource}, {@code publisher}, {@code name}, {@code type}, {@code contained}, {@code date}, {@code title}, {@code url}, {@code affectsState}, {@code overload}, {@code inputProfile}, {@code parameter}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(useContext);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(system);
    h += (h << 5) + Objects.hashCode(instance);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(base);
    h += (h << 5) + Objects.hashCode(outputProfile);
    h += (h << 5) + Objects.hashCode(experimental);
    h += (h << 5) + Objects.hashCode(purpose);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(comment);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(kind);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(resource);
    h += (h << 5) + Objects.hashCode(publisher);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(affectsState);
    h += (h << 5) + Objects.hashCode(overload);
    h += (h << 5) + Objects.hashCode(inputProfile);
    h += (h << 5) + Objects.hashCode(parameter);
    return h;
  }

  /**
   * Prints the immutable value {@code OperationDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("OperationDefinition{");
    if (useContext != null) {
      builder.append("useContext=").append(useContext);
    }
    if (language != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (system != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("system=").append(system);
    }
    if (instance != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("instance=").append(instance);
    }
    if (meta != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (base != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("base=").append(base);
    }
    if (outputProfile != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("outputProfile=").append(outputProfile);
    }
    if (experimental != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (purpose != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (version != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (jurisdiction != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (description != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (comment != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("comment=").append(comment);
    }
    if (status != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (kind != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("kind=").append(kind);
    }
    if (code != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (builder.length() > 20) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (resource != null) {
      builder.append(", ");
      builder.append("resource=").append(resource);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (affectsState != null) {
      builder.append(", ");
      builder.append("affectsState=").append(affectsState);
    }
    if (overload != null) {
      builder.append(", ");
      builder.append("overload=").append(overload);
    }
    if (inputProfile != null) {
      builder.append(", ");
      builder.append("inputProfile=").append(inputProfile);
    }
    if (parameter != null) {
      builder.append(", ");
      builder.append("parameter=").append(parameter);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "OperationDefinition", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements OperationDefinition {
    @Nullable Optional<List<UsageContext>> useContext = Optional.empty();
    boolean useContextIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Boolean> system = Optional.empty();
    boolean systemIsSet;
    @Nullable Optional<Boolean> instance = Optional.empty();
    boolean instanceIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Canonical> base = Optional.empty();
    boolean baseIsSet;
    @Nullable Optional<Canonical> outputProfile = Optional.empty();
    boolean outputProfileIsSet;
    @Nullable Optional<Boolean> experimental = Optional.empty();
    boolean experimentalIsSet;
    @Nullable Optional<Markdown> purpose = Optional.empty();
    boolean purposeIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Markdown> comment = Optional.empty();
    boolean commentIsSet;
    @Nullable Optional<OperationdefinitionStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<OperationdefinitionKind> kind = Optional.empty();
    boolean kindIsSet;
    @Nullable Optional<Code> code = Optional.empty();
    boolean codeIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Code>> resource = Optional.empty();
    boolean resourceIsSet;
    @Nullable Optional<String> publisher = Optional.empty();
    boolean publisherIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<Boolean> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<Boolean> affectsState = Optional.empty();
    boolean affectsStateIsSet;
    @Nullable Optional<List<OperationDefinition_Overload>> overload = Optional.empty();
    boolean overloadIsSet;
    @Nullable Optional<Canonical> inputProfile = Optional.empty();
    boolean inputProfileIsSet;
    @Nullable Optional<List<OperationDefinition_Parameter>> parameter = Optional.empty();
    boolean parameterIsSet;
    @JsonProperty("useContext")
    public void setUseContext(Optional<List<UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("system")
    public void setSystem(Optional<Boolean> system) {
      this.system = system;
      this.systemIsSet = true;
    }
    @JsonProperty("instance")
    public void setInstance(Optional<Boolean> instance) {
      this.instance = instance;
      this.instanceIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("base")
    public void setBase(Optional<Canonical> base) {
      this.base = base;
      this.baseIsSet = true;
    }
    @JsonProperty("outputProfile")
    public void setOutputProfile(Optional<Canonical> outputProfile) {
      this.outputProfile = outputProfile;
      this.outputProfileIsSet = true;
    }
    @JsonProperty("experimental")
    public void setExperimental(Optional<Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @JsonProperty("purpose")
    public void setPurpose(Optional<Markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<List<CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("comment")
    public void setComment(Optional<Markdown> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<OperationdefinitionStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("kind")
    public void setKind(Optional<OperationdefinitionKind> kind) {
      this.kind = kind;
      this.kindIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<Code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
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
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("resource")
    public void setResource(Optional<List<Code>> resource) {
      this.resource = resource;
      this.resourceIsSet = true;
    }
    @JsonProperty("publisher")
    public void setPublisher(Optional<String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<Boolean> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("affectsState")
    public void setAffectsState(Optional<Boolean> affectsState) {
      this.affectsState = affectsState;
      this.affectsStateIsSet = true;
    }
    @JsonProperty("overload")
    public void setOverload(Optional<List<OperationDefinition_Overload>> overload) {
      this.overload = overload;
      this.overloadIsSet = true;
    }
    @JsonProperty("inputProfile")
    public void setInputProfile(Optional<Canonical> inputProfile) {
      this.inputProfile = inputProfile;
      this.inputProfileIsSet = true;
    }
    @JsonProperty("parameter")
    public void setParameter(Optional<List<OperationDefinition_Parameter>> parameter) {
      this.parameter = parameter;
      this.parameterIsSet = true;
    }
    @Override
    public Optional<List<UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> system() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> instance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> base() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> outputProfile() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> comment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<OperationdefinitionStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<OperationdefinitionKind> kind() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> code() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Code>> resource() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> affectsState() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<OperationDefinition_Overload>> overload() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> inputProfile() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<OperationDefinition_Parameter>> parameter() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableOperationDefinition fromJson(Json json) {
    ImmutableOperationDefinition.Builder builder = ((ImmutableOperationDefinition.Builder) ImmutableOperationDefinition.builder());
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.systemIsSet) {
      builder.system(json.system);
    }
    if (json.instanceIsSet) {
      builder.instance(json.instance);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.baseIsSet) {
      builder.base(json.base);
    }
    if (json.outputProfileIsSet) {
      builder.outputProfile(json.outputProfile);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.kindIsSet) {
      builder.kind(json.kind);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.resourceIsSet) {
      builder.resource(json.resource);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.affectsStateIsSet) {
      builder.affectsState(json.affectsState);
    }
    if (json.overloadIsSet) {
      builder.overload(json.overload);
    }
    if (json.inputProfileIsSet) {
      builder.inputProfile(json.inputProfile);
    }
    if (json.parameterIsSet) {
      builder.parameter(json.parameter);
    }
    return (ImmutableOperationDefinition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link OperationDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable OperationDefinition instance
   */
  public static OperationDefinition copyOf(OperationDefinition instance) {
    if (instance instanceof ImmutableOperationDefinition) {
      return (ImmutableOperationDefinition) instance;
    }
    return ((ImmutableOperationDefinition.Builder) ImmutableOperationDefinition.builder())
        .useContext(instance.useContext())
        .language(instance.language())
        .system(instance.system())
        .instance(instance.instance())
        .meta(instance.meta())
        .base(instance.base())
        .outputProfile(instance.outputProfile())
        .experimental(instance.experimental())
        .purpose(instance.purpose())
        .version(instance.version())
        .jurisdiction(instance.jurisdiction())
        .id(instance.id())
        .description(instance.description())
        .comment(instance.comment())
        .status(instance.status())
        .kind(instance.kind())
        .code(instance.code())
        .resourceType(instance.resourceType())
        .extension(instance.extension())
        .text(instance.text())
        .contact(instance.contact())
        .implicitRules(instance.implicitRules())
        .modifierExtension(instance.modifierExtension())
        .resource(instance.resource())
        .publisher(instance.publisher())
        .name(instance.name())
        .type(instance.type())
        .contained(instance.contained())
        .date(instance.date())
        .title(instance.title())
        .url(instance.url())
        .affectsState(instance.affectsState())
        .overload(instance.overload())
        .inputProfile(instance.inputProfile())
        .parameter(instance.parameter())
        .build();
  }

  /**
   * Creates a builder for {@link OperationDefinition OperationDefinition}.
   * <pre>
   * ImmutableOperationDefinition.builder()
   *    .useContext(List&amp;lt;com.medplum.types.fhir.UsageContext&amp;gt;) // optional {@link OperationDefinition#useContext() useContext}
   *    .language(com.medplum.types.fhir.Code) // optional {@link OperationDefinition#language() language}
   *    .system(Boolean) // optional {@link OperationDefinition#system() system}
   *    .instance(Boolean) // optional {@link OperationDefinition#instance() instance}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link OperationDefinition#meta() meta}
   *    .base(com.medplum.types.fhir.Canonical) // optional {@link OperationDefinition#base() base}
   *    .outputProfile(com.medplum.types.fhir.Canonical) // optional {@link OperationDefinition#outputProfile() outputProfile}
   *    .experimental(Boolean) // optional {@link OperationDefinition#experimental() experimental}
   *    .purpose(com.medplum.types.fhir.Markdown) // optional {@link OperationDefinition#purpose() purpose}
   *    .version(String) // optional {@link OperationDefinition#version() version}
   *    .jurisdiction(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link OperationDefinition#jurisdiction() jurisdiction}
   *    .id(com.medplum.types.fhir.Id) // optional {@link OperationDefinition#id() id}
   *    .description(com.medplum.types.fhir.Markdown) // optional {@link OperationDefinition#description() description}
   *    .comment(com.medplum.types.fhir.Markdown) // optional {@link OperationDefinition#comment() comment}
   *    .status(com.medplum.types.fhir.OperationdefinitionStatus) // optional {@link OperationDefinition#status() status}
   *    .kind(com.medplum.types.fhir.OperationdefinitionKind) // optional {@link OperationDefinition#kind() kind}
   *    .code(com.medplum.types.fhir.Code) // optional {@link OperationDefinition#code() code}
   *    .resourceType(String) // required {@link OperationDefinition#resourceType() resourceType}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link OperationDefinition#extension() extension}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link OperationDefinition#text() text}
   *    .contact(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link OperationDefinition#contact() contact}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link OperationDefinition#implicitRules() implicitRules}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link OperationDefinition#modifierExtension() modifierExtension}
   *    .resource(List&amp;lt;com.medplum.types.fhir.Code&amp;gt;) // optional {@link OperationDefinition#resource() resource}
   *    .publisher(String) // optional {@link OperationDefinition#publisher() publisher}
   *    .name(String) // optional {@link OperationDefinition#name() name}
   *    .type(Boolean) // optional {@link OperationDefinition#type() type}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link OperationDefinition#contained() contained}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link OperationDefinition#date() date}
   *    .title(String) // optional {@link OperationDefinition#title() title}
   *    .url(com.medplum.types.fhir.Uri) // optional {@link OperationDefinition#url() url}
   *    .affectsState(Boolean) // optional {@link OperationDefinition#affectsState() affectsState}
   *    .overload(List&amp;lt;com.medplum.types.fhir.OperationDefinition_Overload&amp;gt;) // optional {@link OperationDefinition#overload() overload}
   *    .inputProfile(com.medplum.types.fhir.Canonical) // optional {@link OperationDefinition#inputProfile() inputProfile}
   *    .parameter(List&amp;lt;com.medplum.types.fhir.OperationDefinition_Parameter&amp;gt;) // optional {@link OperationDefinition#parameter() parameter}
   *    .build();
   * </pre>
   * @return A new OperationDefinition builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableOperationDefinition.Builder();
  }

  /**
   * Builds instances of type {@link OperationDefinition OperationDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "OperationDefinition", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_USE_CONTEXT = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x2L;
    private static final long OPT_BIT_SYSTEM = 0x4L;
    private static final long OPT_BIT_INSTANCE = 0x8L;
    private static final long OPT_BIT_META = 0x10L;
    private static final long OPT_BIT_BASE = 0x20L;
    private static final long OPT_BIT_OUTPUT_PROFILE = 0x40L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x80L;
    private static final long OPT_BIT_PURPOSE = 0x100L;
    private static final long OPT_BIT_VERSION = 0x200L;
    private static final long OPT_BIT_JURISDICTION = 0x400L;
    private static final long OPT_BIT_ID = 0x800L;
    private static final long OPT_BIT_DESCRIPTION = 0x1000L;
    private static final long OPT_BIT_COMMENT = 0x2000L;
    private static final long OPT_BIT_STATUS = 0x4000L;
    private static final long OPT_BIT_KIND = 0x8000L;
    private static final long OPT_BIT_CODE = 0x10000L;
    private static final long OPT_BIT_EXTENSION = 0x20000L;
    private static final long OPT_BIT_TEXT = 0x40000L;
    private static final long OPT_BIT_CONTACT = 0x80000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x100000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200000L;
    private static final long OPT_BIT_RESOURCE = 0x400000L;
    private static final long OPT_BIT_PUBLISHER = 0x800000L;
    private static final long OPT_BIT_NAME = 0x1000000L;
    private static final long OPT_BIT_TYPE = 0x2000000L;
    private static final long OPT_BIT_CONTAINED = 0x4000000L;
    private static final long OPT_BIT_DATE = 0x8000000L;
    private static final long OPT_BIT_TITLE = 0x10000000L;
    private static final long OPT_BIT_URL = 0x20000000L;
    private static final long OPT_BIT_AFFECTS_STATE = 0x40000000L;
    private static final long OPT_BIT_OVERLOAD = 0x80000000L;
    private static final long OPT_BIT_INPUT_PROFILE = 0x100000000L;
    private static final long OPT_BIT_PARAMETER = 0x200000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<UsageContext> useContext;
    private @Nullable Code language;
    private @Nullable Boolean system;
    private @Nullable Boolean instance;
    private @Nullable Meta meta;
    private @Nullable Canonical base;
    private @Nullable Canonical outputProfile;
    private @Nullable Boolean experimental;
    private @Nullable Markdown purpose;
    private @Nullable String version;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable Id id;
    private @Nullable Markdown description;
    private @Nullable Markdown comment;
    private @Nullable OperationdefinitionStatus status;
    private @Nullable OperationdefinitionKind kind;
    private @Nullable Code code;
    private @Nullable String resourceType;
    private @Nullable List<Extension> extension;
    private @Nullable Narrative text;
    private @Nullable List<ContactDetail> contact;
    private @Nullable Uri implicitRules;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Code> resource;
    private @Nullable String publisher;
    private @Nullable String name;
    private @Nullable Boolean type;
    private @Nullable List<ResourceList> contained;
    private @Nullable DateTime date;
    private @Nullable String title;
    private @Nullable Uri url;
    private @Nullable Boolean affectsState;
    private @Nullable List<OperationDefinition_Overload> overload;
    private @Nullable Canonical inputProfile;
    private @Nullable List<OperationDefinition_Parameter> parameter;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link OperationDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link OperationDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link OperationDefinition#language() language} to language.
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
     * Initializes the optional value {@link OperationDefinition#language() language} to language.
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
     * Initializes the optional value {@link OperationDefinition#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for chained invocation
     */
    public final Builder system(boolean system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = system;
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("system")
    public final Builder system(Optional<Boolean> system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = system.orElse(null);
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for chained invocation
     */
    public final Builder instance(boolean instance) {
      checkNotIsSet(instanceIsSet(), "instance");
      this.instance = instance;
      optBits |= OPT_BIT_INSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instance")
    public final Builder instance(Optional<Boolean> instance) {
      checkNotIsSet(instanceIsSet(), "instance");
      this.instance = instance.orElse(null);
      optBits |= OPT_BIT_INSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link OperationDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link OperationDefinition#base() base} to base.
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
     * Initializes the optional value {@link OperationDefinition#base() base} to base.
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
     * Initializes the optional value {@link OperationDefinition#outputProfile() outputProfile} to outputProfile.
     * @param outputProfile The value for outputProfile
     * @return {@code this} builder for chained invocation
     */
    public final Builder outputProfile(Canonical outputProfile) {
      checkNotIsSet(outputProfileIsSet(), "outputProfile");
      this.outputProfile = Objects.requireNonNull(outputProfile, "outputProfile");
      optBits |= OPT_BIT_OUTPUT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#outputProfile() outputProfile} to outputProfile.
     * @param outputProfile The value for outputProfile
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outputProfile")
    public final Builder outputProfile(Optional<? extends Canonical> outputProfile) {
      checkNotIsSet(outputProfileIsSet(), "outputProfile");
      this.outputProfile = outputProfile.orElse(null);
      optBits |= OPT_BIT_OUTPUT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link OperationDefinition#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link OperationDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link OperationDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link OperationDefinition#version() version} to version.
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
     * Initializes the optional value {@link OperationDefinition#version() version} to version.
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
     * Initializes the optional value {@link OperationDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link OperationDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link OperationDefinition#id() id} to id.
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
     * Initializes the optional value {@link OperationDefinition#id() id} to id.
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
     * Initializes the optional value {@link OperationDefinition#description() description} to description.
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
     * Initializes the optional value {@link OperationDefinition#description() description} to description.
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
     * Initializes the optional value {@link OperationDefinition#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    public final Builder comment(Markdown comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = Objects.requireNonNull(comment, "comment");
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("comment")
    public final Builder comment(Optional<? extends Markdown> comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = comment.orElse(null);
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(OperationdefinitionStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends OperationdefinitionStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    public final Builder kind(OperationdefinitionKind kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = Objects.requireNonNull(kind, "kind");
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(Optional<? extends OperationdefinitionKind> kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = kind.orElse(null);
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(Code code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends Code> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the value for the {@link OperationDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link OperationDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link OperationDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link OperationDefinition#text() text} to text.
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
     * Initializes the optional value {@link OperationDefinition#text() text} to text.
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
     * Initializes the optional value {@link OperationDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link OperationDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link OperationDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link OperationDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link OperationDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link OperationDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link OperationDefinition#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    public final Builder resource(List<Code> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = Objects.requireNonNull(resource, "resource");
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resource")
    public final Builder resource(Optional<? extends List<Code>> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = resource.orElse(null);
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link OperationDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link OperationDefinition#name() name} to name.
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
     * Initializes the optional value {@link OperationDefinition#name() name} to name.
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
     * Initializes the optional value {@link OperationDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(boolean type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type;
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<Boolean> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link OperationDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link OperationDefinition#date() date} to date.
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
     * Initializes the optional value {@link OperationDefinition#date() date} to date.
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
     * Initializes the optional value {@link OperationDefinition#title() title} to title.
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
     * Initializes the optional value {@link OperationDefinition#title() title} to title.
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
     * Initializes the optional value {@link OperationDefinition#url() url} to url.
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
     * Initializes the optional value {@link OperationDefinition#url() url} to url.
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
     * Initializes the optional value {@link OperationDefinition#affectsState() affectsState} to affectsState.
     * @param affectsState The value for affectsState
     * @return {@code this} builder for chained invocation
     */
    public final Builder affectsState(boolean affectsState) {
      checkNotIsSet(affectsStateIsSet(), "affectsState");
      this.affectsState = affectsState;
      optBits |= OPT_BIT_AFFECTS_STATE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#affectsState() affectsState} to affectsState.
     * @param affectsState The value for affectsState
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("affectsState")
    public final Builder affectsState(Optional<Boolean> affectsState) {
      checkNotIsSet(affectsStateIsSet(), "affectsState");
      this.affectsState = affectsState.orElse(null);
      optBits |= OPT_BIT_AFFECTS_STATE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#overload() overload} to overload.
     * @param overload The value for overload
     * @return {@code this} builder for chained invocation
     */
    public final Builder overload(List<OperationDefinition_Overload> overload) {
      checkNotIsSet(overloadIsSet(), "overload");
      this.overload = Objects.requireNonNull(overload, "overload");
      optBits |= OPT_BIT_OVERLOAD;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#overload() overload} to overload.
     * @param overload The value for overload
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("overload")
    public final Builder overload(Optional<? extends List<OperationDefinition_Overload>> overload) {
      checkNotIsSet(overloadIsSet(), "overload");
      this.overload = overload.orElse(null);
      optBits |= OPT_BIT_OVERLOAD;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#inputProfile() inputProfile} to inputProfile.
     * @param inputProfile The value for inputProfile
     * @return {@code this} builder for chained invocation
     */
    public final Builder inputProfile(Canonical inputProfile) {
      checkNotIsSet(inputProfileIsSet(), "inputProfile");
      this.inputProfile = Objects.requireNonNull(inputProfile, "inputProfile");
      optBits |= OPT_BIT_INPUT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#inputProfile() inputProfile} to inputProfile.
     * @param inputProfile The value for inputProfile
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("inputProfile")
    public final Builder inputProfile(Optional<? extends Canonical> inputProfile) {
      checkNotIsSet(inputProfileIsSet(), "inputProfile");
      this.inputProfile = inputProfile.orElse(null);
      optBits |= OPT_BIT_INPUT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    public final Builder parameter(List<OperationDefinition_Parameter> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = Objects.requireNonNull(parameter, "parameter");
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parameter")
    public final Builder parameter(Optional<? extends List<OperationDefinition_Parameter>> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = parameter.orElse(null);
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Builds a new {@link OperationDefinition OperationDefinition}.
     * @return An immutable instance of OperationDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public OperationDefinition build() {
      checkRequiredAttributes();
      return new ImmutableOperationDefinition(
          useContext,
          language,
          system,
          instance,
          meta,
          base,
          outputProfile,
          experimental,
          purpose,
          version,
          jurisdiction,
          id,
          description,
          comment,
          status,
          kind,
          code,
          resourceType,
          extension,
          text,
          contact,
          implicitRules,
          modifierExtension,
          resource,
          publisher,
          name,
          type,
          contained,
          date,
          title,
          url,
          affectsState,
          overload,
          inputProfile,
          parameter);
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean systemIsSet() {
      return (optBits & OPT_BIT_SYSTEM) != 0;
    }

    private boolean instanceIsSet() {
      return (optBits & OPT_BIT_INSTANCE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean baseIsSet() {
      return (optBits & OPT_BIT_BASE) != 0;
    }

    private boolean outputProfileIsSet() {
      return (optBits & OPT_BIT_OUTPUT_PROFILE) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean kindIsSet() {
      return (optBits & OPT_BIT_KIND) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean resourceIsSet() {
      return (optBits & OPT_BIT_RESOURCE) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean affectsStateIsSet() {
      return (optBits & OPT_BIT_AFFECTS_STATE) != 0;
    }

    private boolean overloadIsSet() {
      return (optBits & OPT_BIT_OVERLOAD) != 0;
    }

    private boolean inputProfileIsSet() {
      return (optBits & OPT_BIT_INPUT_PROFILE) != 0;
    }

    private boolean parameterIsSet() {
      return (optBits & OPT_BIT_PARAMETER) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of OperationDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build OperationDefinition, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "OperationDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link OperationDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "OperationDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link OperationDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(List<UsageContext> useContext);

    /**
     * Initializes the optional value {@link OperationDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(Optional<? extends List<UsageContext>> useContext);

    /**
     * Initializes the optional value {@link OperationDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link OperationDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link OperationDefinition#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for chained invocation
     */
    BuildFinal system(boolean system);

    /**
     * Initializes the optional value {@link OperationDefinition#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal system(Optional<Boolean> system);

    /**
     * Initializes the optional value {@link OperationDefinition#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instance(boolean instance);

    /**
     * Initializes the optional value {@link OperationDefinition#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instance(Optional<Boolean> instance);

    /**
     * Initializes the optional value {@link OperationDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link OperationDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link OperationDefinition#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for chained invocation
     */
    BuildFinal base(Canonical base);

    /**
     * Initializes the optional value {@link OperationDefinition#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal base(Optional<? extends Canonical> base);

    /**
     * Initializes the optional value {@link OperationDefinition#outputProfile() outputProfile} to outputProfile.
     * @param outputProfile The value for outputProfile
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outputProfile(Canonical outputProfile);

    /**
     * Initializes the optional value {@link OperationDefinition#outputProfile() outputProfile} to outputProfile.
     * @param outputProfile The value for outputProfile
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outputProfile(Optional<? extends Canonical> outputProfile);

    /**
     * Initializes the optional value {@link OperationDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link OperationDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(Optional<Boolean> experimental);

    /**
     * Initializes the optional value {@link OperationDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(Markdown purpose);

    /**
     * Initializes the optional value {@link OperationDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(Optional<? extends Markdown> purpose);

    /**
     * Initializes the optional value {@link OperationDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link OperationDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link OperationDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(List<CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link OperationDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link OperationDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link OperationDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link OperationDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(Markdown description);

    /**
     * Initializes the optional value {@link OperationDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<? extends Markdown> description);

    /**
     * Initializes the optional value {@link OperationDefinition#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comment(Markdown comment);

    /**
     * Initializes the optional value {@link OperationDefinition#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comment(Optional<? extends Markdown> comment);

    /**
     * Initializes the optional value {@link OperationDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(OperationdefinitionStatus status);

    /**
     * Initializes the optional value {@link OperationDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends OperationdefinitionStatus> status);

    /**
     * Initializes the optional value {@link OperationDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    BuildFinal kind(OperationdefinitionKind kind);

    /**
     * Initializes the optional value {@link OperationDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal kind(Optional<? extends OperationdefinitionKind> kind);

    /**
     * Initializes the optional value {@link OperationDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(Code code);

    /**
     * Initializes the optional value {@link OperationDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends Code> code);

    /**
     * Initializes the optional value {@link OperationDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link OperationDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link OperationDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link OperationDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link OperationDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link OperationDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Initializes the optional value {@link OperationDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link OperationDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link OperationDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link OperationDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link OperationDefinition#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    BuildFinal resource(List<Code> resource);

    /**
     * Initializes the optional value {@link OperationDefinition#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resource(Optional<? extends List<Code>> resource);

    /**
     * Initializes the optional value {@link OperationDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(String publisher);

    /**
     * Initializes the optional value {@link OperationDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<String> publisher);

    /**
     * Initializes the optional value {@link OperationDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link OperationDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link OperationDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(boolean type);

    /**
     * Initializes the optional value {@link OperationDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<Boolean> type);

    /**
     * Initializes the optional value {@link OperationDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link OperationDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link OperationDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link OperationDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link OperationDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link OperationDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Initializes the optional value {@link OperationDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link OperationDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link OperationDefinition#affectsState() affectsState} to affectsState.
     * @param affectsState The value for affectsState
     * @return {@code this} builder for chained invocation
     */
    BuildFinal affectsState(boolean affectsState);

    /**
     * Initializes the optional value {@link OperationDefinition#affectsState() affectsState} to affectsState.
     * @param affectsState The value for affectsState
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal affectsState(Optional<Boolean> affectsState);

    /**
     * Initializes the optional value {@link OperationDefinition#overload() overload} to overload.
     * @param overload The value for overload
     * @return {@code this} builder for chained invocation
     */
    BuildFinal overload(List<OperationDefinition_Overload> overload);

    /**
     * Initializes the optional value {@link OperationDefinition#overload() overload} to overload.
     * @param overload The value for overload
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal overload(Optional<? extends List<OperationDefinition_Overload>> overload);

    /**
     * Initializes the optional value {@link OperationDefinition#inputProfile() inputProfile} to inputProfile.
     * @param inputProfile The value for inputProfile
     * @return {@code this} builder for chained invocation
     */
    BuildFinal inputProfile(Canonical inputProfile);

    /**
     * Initializes the optional value {@link OperationDefinition#inputProfile() inputProfile} to inputProfile.
     * @param inputProfile The value for inputProfile
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal inputProfile(Optional<? extends Canonical> inputProfile);

    /**
     * Initializes the optional value {@link OperationDefinition#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parameter(List<OperationDefinition_Parameter> parameter);

    /**
     * Initializes the optional value {@link OperationDefinition#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parameter(Optional<? extends List<OperationDefinition_Parameter>> parameter);

    /**
     * Builds a new {@link OperationDefinition OperationDefinition}.
     * @return An immutable instance of OperationDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    OperationDefinition build();
  }
}
