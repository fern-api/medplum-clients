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
 * Immutable implementation of {@link Account}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAccount.builder()}.
 */
@Generated(from = "Account", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAccount implements Account {
  private final @Nullable AccountStatus status;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Reference owner;
  private final @Nullable Reference partOf;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept type;
  private final @Nullable List<Reference> subject;
  private final @Nullable Period servicePeriod;
  private final @Nullable Id id;
  private final @Nullable Code language;
  private final @Nullable Narrative text;
  private final @Nullable String name;
  private final @Nullable String description;
  private final String resourceType;
  private final @Nullable Meta meta;
  private final @Nullable List<Account_Guarantor> guarantor;
  private final @Nullable List<Account_Coverage> coverage;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Identifier> identifier;

  private ImmutableAccount(
      @Nullable AccountStatus status,
      @Nullable List<Extension> modifierExtension,
      @Nullable Reference owner,
      @Nullable Reference partOf,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept type,
      @Nullable List<Reference> subject,
      @Nullable Period servicePeriod,
      @Nullable Id id,
      @Nullable Code language,
      @Nullable Narrative text,
      @Nullable String name,
      @Nullable String description,
      String resourceType,
      @Nullable Meta meta,
      @Nullable List<Account_Guarantor> guarantor,
      @Nullable List<Account_Coverage> coverage,
      @Nullable Uri implicitRules,
      @Nullable List<ResourceList> contained,
      @Nullable List<Identifier> identifier) {
    this.status = status;
    this.modifierExtension = modifierExtension;
    this.owner = owner;
    this.partOf = partOf;
    this.extension = extension;
    this.type = type;
    this.subject = subject;
    this.servicePeriod = servicePeriod;
    this.id = id;
    this.language = language;
    this.text = text;
    this.name = name;
    this.description = description;
    this.resourceType = resourceType;
    this.meta = meta;
    this.guarantor = guarantor;
    this.coverage = coverage;
    this.implicitRules = implicitRules;
    this.contained = contained;
    this.identifier = identifier;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<AccountStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code owner} attribute
   */
  @JsonProperty("owner")
  @Override
  public Optional<Reference> owner() {
    return Optional.ofNullable(owner);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Optional<List<Reference>> subject() {
    return Optional.ofNullable(subject);
  }

  /**
   * @return The value of the {@code servicePeriod} attribute
   */
  @JsonProperty("servicePeriod")
  @Override
  public Optional<Period> servicePeriod() {
    return Optional.ofNullable(servicePeriod);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code guarantor} attribute
   */
  @JsonProperty("guarantor")
  @Override
  public Optional<List<Account_Guarantor>> guarantor() {
    return Optional.ofNullable(guarantor);
  }

  /**
   * @return The value of the {@code coverage} attribute
   */
  @JsonProperty("coverage")
  @Override
  public Optional<List<Account_Coverage>> coverage() {
    return Optional.ofNullable(coverage);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withStatus(AccountStatus value) {
    @Nullable AccountStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableAccount(
        newValue,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withStatus(Optional<? extends AccountStatus> optional) {
    @Nullable AccountStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableAccount(
        value,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableAccount(
        this.status,
        newValue,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableAccount(
        this.status,
        value,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#owner() owner} attribute.
   * @param value The value for owner
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withOwner(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "owner");
    if (this.owner == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        newValue,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#owner() owner} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for owner
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withOwner(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.owner == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        value,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withPartOf(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        newValue,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withPartOf(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        value,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        newValue,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        value,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        newValue,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        value,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withSubject(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        newValue,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withSubject(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        value,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#servicePeriod() servicePeriod} attribute.
   * @param value The value for servicePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withServicePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "servicePeriod");
    if (this.servicePeriod == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        newValue,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#servicePeriod() servicePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for servicePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withServicePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.servicePeriod == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        value,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        newValue,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        value,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        newValue,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        value,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        newValue,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        value,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        newValue,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        value,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        newValue,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        value,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Account#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAccount withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        newValue,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        newValue,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        value,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#guarantor() guarantor} attribute.
   * @param value The value for guarantor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withGuarantor(List<Account_Guarantor> value) {
    @Nullable List<Account_Guarantor> newValue = Objects.requireNonNull(value, "guarantor");
    if (this.guarantor == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        newValue,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#guarantor() guarantor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for guarantor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withGuarantor(Optional<? extends List<Account_Guarantor>> optional) {
    @Nullable List<Account_Guarantor> value = optional.orElse(null);
    if (this.guarantor == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        value,
        this.coverage,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#coverage() coverage} attribute.
   * @param value The value for coverage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withCoverage(List<Account_Coverage> value) {
    @Nullable List<Account_Coverage> newValue = Objects.requireNonNull(value, "coverage");
    if (this.coverage == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        newValue,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#coverage() coverage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for coverage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withCoverage(Optional<? extends List<Account_Coverage>> optional) {
    @Nullable List<Account_Coverage> value = optional.orElse(null);
    if (this.coverage == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        value,
        this.implicitRules,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        newValue,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        value,
        this.contained,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        newValue,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        value,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.owner,
        this.partOf,
        this.extension,
        this.type,
        this.subject,
        this.servicePeriod,
        this.id,
        this.language,
        this.text,
        this.name,
        this.description,
        this.resourceType,
        this.meta,
        this.guarantor,
        this.coverage,
        this.implicitRules,
        this.contained,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAccount} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAccount
        && equalTo((ImmutableAccount) another);
  }

  private boolean equalTo(ImmutableAccount another) {
    return Objects.equals(status, another.status)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(owner, another.owner)
        && Objects.equals(partOf, another.partOf)
        && Objects.equals(extension, another.extension)
        && Objects.equals(type, another.type)
        && Objects.equals(subject, another.subject)
        && Objects.equals(servicePeriod, another.servicePeriod)
        && Objects.equals(id, another.id)
        && Objects.equals(language, another.language)
        && Objects.equals(text, another.text)
        && Objects.equals(name, another.name)
        && Objects.equals(description, another.description)
        && resourceType.equals(another.resourceType)
        && Objects.equals(meta, another.meta)
        && Objects.equals(guarantor, another.guarantor)
        && Objects.equals(coverage, another.coverage)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(contained, another.contained)
        && Objects.equals(identifier, another.identifier);
  }

  /**
   * Computes a hash code from attributes: {@code status}, {@code modifierExtension}, {@code owner}, {@code partOf}, {@code extension}, {@code type}, {@code subject}, {@code servicePeriod}, {@code id}, {@code language}, {@code text}, {@code name}, {@code description}, {@code resourceType}, {@code meta}, {@code guarantor}, {@code coverage}, {@code implicitRules}, {@code contained}, {@code identifier}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(owner);
    h += (h << 5) + Objects.hashCode(partOf);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(servicePeriod);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(guarantor);
    h += (h << 5) + Objects.hashCode(coverage);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(identifier);
    return h;
  }

  /**
   * Prints the immutable value {@code Account} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Account{");
    if (status != null) {
      builder.append("status=").append(status);
    }
    if (modifierExtension != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (owner != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("owner=").append(owner);
    }
    if (partOf != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (extension != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (type != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (subject != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (servicePeriod != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("servicePeriod=").append(servicePeriod);
    }
    if (id != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (language != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (text != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (name != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (description != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (builder.length() > 8) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (guarantor != null) {
      builder.append(", ");
      builder.append("guarantor=").append(guarantor);
    }
    if (coverage != null) {
      builder.append(", ");
      builder.append("coverage=").append(coverage);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Account", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Account {
    @Nullable Optional<AccountStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Reference> owner = Optional.empty();
    boolean ownerIsSet;
    @Nullable Optional<Reference> partOf = Optional.empty();
    boolean partOfIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Reference>> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<Period> servicePeriod = Optional.empty();
    boolean servicePeriodIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Account_Guarantor>> guarantor = Optional.empty();
    boolean guarantorIsSet;
    @Nullable Optional<List<Account_Coverage>> coverage = Optional.empty();
    boolean coverageIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @JsonProperty("status")
    public void setStatus(Optional<AccountStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("owner")
    public void setOwner(Optional<Reference> owner) {
      this.owner = owner;
      this.ownerIsSet = true;
    }
    @JsonProperty("partOf")
    public void setPartOf(Optional<Reference> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<List<Reference>> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("servicePeriod")
    public void setServicePeriod(Optional<Period> servicePeriod) {
      this.servicePeriod = servicePeriod;
      this.servicePeriodIsSet = true;
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
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("guarantor")
    public void setGuarantor(Optional<List<Account_Guarantor>> guarantor) {
      this.guarantor = guarantor;
      this.guarantorIsSet = true;
    }
    @JsonProperty("coverage")
    public void setCoverage(Optional<List<Account_Coverage>> coverage) {
      this.coverage = coverage;
      this.coverageIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @Override
    public Optional<AccountStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> owner() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> servicePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Account_Guarantor>> guarantor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Account_Coverage>> coverage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAccount fromJson(Json json) {
    ImmutableAccount.Builder builder = ((ImmutableAccount.Builder) ImmutableAccount.builder());
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.ownerIsSet) {
      builder.owner(json.owner);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.servicePeriodIsSet) {
      builder.servicePeriod(json.servicePeriod);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.guarantorIsSet) {
      builder.guarantor(json.guarantor);
    }
    if (json.coverageIsSet) {
      builder.coverage(json.coverage);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    return (ImmutableAccount) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Account} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Account instance
   */
  public static Account copyOf(Account instance) {
    if (instance instanceof ImmutableAccount) {
      return (ImmutableAccount) instance;
    }
    return ((ImmutableAccount.Builder) ImmutableAccount.builder())
        .status(instance.status())
        .modifierExtension(instance.modifierExtension())
        .owner(instance.owner())
        .partOf(instance.partOf())
        .extension(instance.extension())
        .type(instance.type())
        .subject(instance.subject())
        .servicePeriod(instance.servicePeriod())
        .id(instance.id())
        .language(instance.language())
        .text(instance.text())
        .name(instance.name())
        .description(instance.description())
        .resourceType(instance.resourceType())
        .meta(instance.meta())
        .guarantor(instance.guarantor())
        .coverage(instance.coverage())
        .implicitRules(instance.implicitRules())
        .contained(instance.contained())
        .identifier(instance.identifier())
        .build();
  }

  /**
   * Creates a builder for {@link Account Account}.
   * <pre>
   * ImmutableAccount.builder()
   *    .status(com.medplum.types.fhir.AccountStatus) // optional {@link Account#status() status}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Account#modifierExtension() modifierExtension}
   *    .owner(com.medplum.types.fhir.Reference) // optional {@link Account#owner() owner}
   *    .partOf(com.medplum.types.fhir.Reference) // optional {@link Account#partOf() partOf}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Account#extension() extension}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link Account#type() type}
   *    .subject(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Account#subject() subject}
   *    .servicePeriod(com.medplum.types.fhir.Period) // optional {@link Account#servicePeriod() servicePeriod}
   *    .id(com.medplum.types.fhir.Id) // optional {@link Account#id() id}
   *    .language(com.medplum.types.fhir.Code) // optional {@link Account#language() language}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link Account#text() text}
   *    .name(String) // optional {@link Account#name() name}
   *    .description(String) // optional {@link Account#description() description}
   *    .resourceType(String) // required {@link Account#resourceType() resourceType}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link Account#meta() meta}
   *    .guarantor(List&amp;lt;com.medplum.types.fhir.Account_Guarantor&amp;gt;) // optional {@link Account#guarantor() guarantor}
   *    .coverage(List&amp;lt;com.medplum.types.fhir.Account_Coverage&amp;gt;) // optional {@link Account#coverage() coverage}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link Account#implicitRules() implicitRules}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link Account#contained() contained}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link Account#identifier() identifier}
   *    .build();
   * </pre>
   * @return A new Account builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableAccount.Builder();
  }

  /**
   * Builds instances of type {@link Account Account}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Account", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_STATUS = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_OWNER = 0x4L;
    private static final long OPT_BIT_PART_OF = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_TYPE = 0x20L;
    private static final long OPT_BIT_SUBJECT = 0x40L;
    private static final long OPT_BIT_SERVICE_PERIOD = 0x80L;
    private static final long OPT_BIT_ID = 0x100L;
    private static final long OPT_BIT_LANGUAGE = 0x200L;
    private static final long OPT_BIT_TEXT = 0x400L;
    private static final long OPT_BIT_NAME = 0x800L;
    private static final long OPT_BIT_DESCRIPTION = 0x1000L;
    private static final long OPT_BIT_META = 0x2000L;
    private static final long OPT_BIT_GUARANTOR = 0x4000L;
    private static final long OPT_BIT_COVERAGE = 0x8000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10000L;
    private static final long OPT_BIT_CONTAINED = 0x20000L;
    private static final long OPT_BIT_IDENTIFIER = 0x40000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable AccountStatus status;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference owner;
    private @Nullable Reference partOf;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept type;
    private @Nullable List<Reference> subject;
    private @Nullable Period servicePeriod;
    private @Nullable Id id;
    private @Nullable Code language;
    private @Nullable Narrative text;
    private @Nullable String name;
    private @Nullable String description;
    private @Nullable String resourceType;
    private @Nullable Meta meta;
    private @Nullable List<Account_Guarantor> guarantor;
    private @Nullable List<Account_Coverage> coverage;
    private @Nullable Uri implicitRules;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Identifier> identifier;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Account#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(AccountStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends AccountStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Account#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Account#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for chained invocation
     */
    public final Builder owner(Reference owner) {
      checkNotIsSet(ownerIsSet(), "owner");
      this.owner = Objects.requireNonNull(owner, "owner");
      optBits |= OPT_BIT_OWNER;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("owner")
    public final Builder owner(Optional<? extends Reference> owner) {
      checkNotIsSet(ownerIsSet(), "owner");
      this.owner = owner.orElse(null);
      optBits |= OPT_BIT_OWNER;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link Account#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link Account#extension() extension} to extension.
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
     * Initializes the optional value {@link Account#extension() extension} to extension.
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
     * Initializes the optional value {@link Account#type() type} to type.
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
     * Initializes the optional value {@link Account#type() type} to type.
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
     * Initializes the optional value {@link Account#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    public final Builder subject(List<Reference> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subject")
    public final Builder subject(Optional<? extends List<Reference>> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#servicePeriod() servicePeriod} to servicePeriod.
     * @param servicePeriod The value for servicePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder servicePeriod(Period servicePeriod) {
      checkNotIsSet(servicePeriodIsSet(), "servicePeriod");
      this.servicePeriod = Objects.requireNonNull(servicePeriod, "servicePeriod");
      optBits |= OPT_BIT_SERVICE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#servicePeriod() servicePeriod} to servicePeriod.
     * @param servicePeriod The value for servicePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("servicePeriod")
    public final Builder servicePeriod(Optional<? extends Period> servicePeriod) {
      checkNotIsSet(servicePeriodIsSet(), "servicePeriod");
      this.servicePeriod = servicePeriod.orElse(null);
      optBits |= OPT_BIT_SERVICE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#id() id} to id.
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
     * Initializes the optional value {@link Account#id() id} to id.
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
     * Initializes the optional value {@link Account#language() language} to language.
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
     * Initializes the optional value {@link Account#language() language} to language.
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
     * Initializes the optional value {@link Account#text() text} to text.
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
     * Initializes the optional value {@link Account#text() text} to text.
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
     * Initializes the optional value {@link Account#name() name} to name.
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
     * Initializes the optional value {@link Account#name() name} to name.
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
     * Initializes the optional value {@link Account#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the value for the {@link Account#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Account#meta() meta} to meta.
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
     * Initializes the optional value {@link Account#meta() meta} to meta.
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
     * Initializes the optional value {@link Account#guarantor() guarantor} to guarantor.
     * @param guarantor The value for guarantor
     * @return {@code this} builder for chained invocation
     */
    public final Builder guarantor(List<Account_Guarantor> guarantor) {
      checkNotIsSet(guarantorIsSet(), "guarantor");
      this.guarantor = Objects.requireNonNull(guarantor, "guarantor");
      optBits |= OPT_BIT_GUARANTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#guarantor() guarantor} to guarantor.
     * @param guarantor The value for guarantor
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("guarantor")
    public final Builder guarantor(Optional<? extends List<Account_Guarantor>> guarantor) {
      checkNotIsSet(guarantorIsSet(), "guarantor");
      this.guarantor = guarantor.orElse(null);
      optBits |= OPT_BIT_GUARANTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#coverage() coverage} to coverage.
     * @param coverage The value for coverage
     * @return {@code this} builder for chained invocation
     */
    public final Builder coverage(List<Account_Coverage> coverage) {
      checkNotIsSet(coverageIsSet(), "coverage");
      this.coverage = Objects.requireNonNull(coverage, "coverage");
      optBits |= OPT_BIT_COVERAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#coverage() coverage} to coverage.
     * @param coverage The value for coverage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("coverage")
    public final Builder coverage(Optional<? extends List<Account_Coverage>> coverage) {
      checkNotIsSet(coverageIsSet(), "coverage");
      this.coverage = coverage.orElse(null);
      optBits |= OPT_BIT_COVERAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Account#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Account#contained() contained} to contained.
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
     * Initializes the optional value {@link Account#contained() contained} to contained.
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
     * Initializes the optional value {@link Account#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Account#identifier() identifier} to identifier.
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
     * Builds a new {@link Account Account}.
     * @return An immutable instance of Account
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Account build() {
      checkRequiredAttributes();
      return new ImmutableAccount(
          status,
          modifierExtension,
          owner,
          partOf,
          extension,
          type,
          subject,
          servicePeriod,
          id,
          language,
          text,
          name,
          description,
          resourceType,
          meta,
          guarantor,
          coverage,
          implicitRules,
          contained,
          identifier);
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean ownerIsSet() {
      return (optBits & OPT_BIT_OWNER) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean servicePeriodIsSet() {
      return (optBits & OPT_BIT_SERVICE_PERIOD) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean guarantorIsSet() {
      return (optBits & OPT_BIT_GUARANTOR) != 0;
    }

    private boolean coverageIsSet() {
      return (optBits & OPT_BIT_COVERAGE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Account is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Account, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Account", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Account#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Account", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Account#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(AccountStatus status);

    /**
     * Initializes the optional value {@link Account#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends AccountStatus> status);

    /**
     * Initializes the optional value {@link Account#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Account#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Account#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for chained invocation
     */
    BuildFinal owner(Reference owner);

    /**
     * Initializes the optional value {@link Account#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal owner(Optional<? extends Reference> owner);

    /**
     * Initializes the optional value {@link Account#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(Reference partOf);

    /**
     * Initializes the optional value {@link Account#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(Optional<? extends Reference> partOf);

    /**
     * Initializes the optional value {@link Account#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Account#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Account#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(CodeableConcept type);

    /**
     * Initializes the optional value {@link Account#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends CodeableConcept> type);

    /**
     * Initializes the optional value {@link Account#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(List<Reference> subject);

    /**
     * Initializes the optional value {@link Account#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends List<Reference>> subject);

    /**
     * Initializes the optional value {@link Account#servicePeriod() servicePeriod} to servicePeriod.
     * @param servicePeriod The value for servicePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal servicePeriod(Period servicePeriod);

    /**
     * Initializes the optional value {@link Account#servicePeriod() servicePeriod} to servicePeriod.
     * @param servicePeriod The value for servicePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal servicePeriod(Optional<? extends Period> servicePeriod);

    /**
     * Initializes the optional value {@link Account#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Account#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Account#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Account#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Account#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Account#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Account#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link Account#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link Account#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link Account#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Initializes the optional value {@link Account#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Account#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Account#guarantor() guarantor} to guarantor.
     * @param guarantor The value for guarantor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal guarantor(List<Account_Guarantor> guarantor);

    /**
     * Initializes the optional value {@link Account#guarantor() guarantor} to guarantor.
     * @param guarantor The value for guarantor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal guarantor(Optional<? extends List<Account_Guarantor>> guarantor);

    /**
     * Initializes the optional value {@link Account#coverage() coverage} to coverage.
     * @param coverage The value for coverage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal coverage(List<Account_Coverage> coverage);

    /**
     * Initializes the optional value {@link Account#coverage() coverage} to coverage.
     * @param coverage The value for coverage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal coverage(Optional<? extends List<Account_Coverage>> coverage);

    /**
     * Initializes the optional value {@link Account#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Account#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Account#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Account#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Account#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Account#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Builds a new {@link Account Account}.
     * @return An immutable instance of Account
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Account build();
  }
}
