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
 * Immutable implementation of {@link ChargeItemDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableChargeItemDefinition.builder()}.
 */
@Generated(from = "ChargeItemDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableChargeItemDefinition implements ChargeItemDefinition {
  private final @Nullable List<Canonical> replaces;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<ContactDetail> contact;
  private final @Nullable List<ChargeItemDefinition_PropertyGroup> propertyGroup;
  private final @Nullable String publisher;
  private final @Nullable CodeableConcept code;
  private final @Nullable List<Canonical> partOf;
  private final @Nullable ChargeitemdefinitionStatus status;
  private final @Nullable String version;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final @Nullable String title;
  private final @Nullable Meta meta;
  private final @Nullable Uri implicitRules;
  private final @Nullable Code language;
  private final @Nullable List<ChargeItemDefinition_Applicability> applicability;
  private final @Nullable Narrative text;
  private final @Nullable Boolean experimental;
  private final @Nullable Uri url;
  private final @Nullable Date approvalDate;
  private final @Nullable List<Extension> extension;
  private final @Nullable Date lastReviewDate;
  private final @Nullable DateTime date;
  private final @Nullable List<Reference> instance;
  private final @Nullable Period effectivePeriod;
  private final @Nullable Id id;
  private final @Nullable List<Uri> derivedFromUri;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Markdown copyright;
  private final String resourceType;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<UsageContext> useContext;
  private final @Nullable Markdown description;

  private ImmutableChargeItemDefinition(
      @Nullable List<Canonical> replaces,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<ContactDetail> contact,
      @Nullable List<ChargeItemDefinition_PropertyGroup> propertyGroup,
      @Nullable String publisher,
      @Nullable CodeableConcept code,
      @Nullable List<Canonical> partOf,
      @Nullable ChargeitemdefinitionStatus status,
      @Nullable String version,
      @Nullable List<CodeableConcept> jurisdiction,
      @Nullable String title,
      @Nullable Meta meta,
      @Nullable Uri implicitRules,
      @Nullable Code language,
      @Nullable List<ChargeItemDefinition_Applicability> applicability,
      @Nullable Narrative text,
      @Nullable Boolean experimental,
      @Nullable Uri url,
      @Nullable Date approvalDate,
      @Nullable List<Extension> extension,
      @Nullable Date lastReviewDate,
      @Nullable DateTime date,
      @Nullable List<Reference> instance,
      @Nullable Period effectivePeriod,
      @Nullable Id id,
      @Nullable List<Uri> derivedFromUri,
      @Nullable List<ResourceList> contained,
      @Nullable Markdown copyright,
      String resourceType,
      @Nullable List<Identifier> identifier,
      @Nullable List<UsageContext> useContext,
      @Nullable Markdown description) {
    this.replaces = replaces;
    this.modifierExtension = modifierExtension;
    this.contact = contact;
    this.propertyGroup = propertyGroup;
    this.publisher = publisher;
    this.code = code;
    this.partOf = partOf;
    this.status = status;
    this.version = version;
    this.jurisdiction = jurisdiction;
    this.title = title;
    this.meta = meta;
    this.implicitRules = implicitRules;
    this.language = language;
    this.applicability = applicability;
    this.text = text;
    this.experimental = experimental;
    this.url = url;
    this.approvalDate = approvalDate;
    this.extension = extension;
    this.lastReviewDate = lastReviewDate;
    this.date = date;
    this.instance = instance;
    this.effectivePeriod = effectivePeriod;
    this.id = id;
    this.derivedFromUri = derivedFromUri;
    this.contained = contained;
    this.copyright = copyright;
    this.resourceType = resourceType;
    this.identifier = identifier;
    this.useContext = useContext;
    this.description = description;
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
   * @return The value of the {@code propertyGroup} attribute
   */
  @JsonProperty("propertyGroup")
  @Override
  public Optional<List<ChargeItemDefinition_PropertyGroup>> propertyGroup() {
    return Optional.ofNullable(propertyGroup);
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<CodeableConcept> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code partOf} attribute
   */
  @JsonProperty("partOf")
  @Override
  public Optional<List<Canonical>> partOf() {
    return Optional.ofNullable(partOf);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<ChargeitemdefinitionStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
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
   * @return The value of the {@code applicability} attribute
   */
  @JsonProperty("applicability")
  @Override
  public Optional<List<ChargeItemDefinition_Applicability>> applicability() {
    return Optional.ofNullable(applicability);
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
   * @return The value of the {@code experimental} attribute
   */
  @JsonProperty("experimental")
  @Override
  public Optional<Boolean> experimental() {
    return Optional.ofNullable(experimental);
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
   * @return The value of the {@code approvalDate} attribute
   */
  @JsonProperty("approvalDate")
  @Override
  public Optional<Date> approvalDate() {
    return Optional.ofNullable(approvalDate);
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
   * @return The value of the {@code lastReviewDate} attribute
   */
  @JsonProperty("lastReviewDate")
  @Override
  public Optional<Date> lastReviewDate() {
    return Optional.ofNullable(lastReviewDate);
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
   * @return The value of the {@code instance} attribute
   */
  @JsonProperty("instance")
  @Override
  public Optional<List<Reference>> instance() {
    return Optional.ofNullable(instance);
  }

  /**
   * @return The value of the {@code effectivePeriod} attribute
   */
  @JsonProperty("effectivePeriod")
  @Override
  public Optional<Period> effectivePeriod() {
    return Optional.ofNullable(effectivePeriod);
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
   * @return The value of the {@code derivedFromUri} attribute
   */
  @JsonProperty("derivedFromUri")
  @Override
  public Optional<List<Uri>> derivedFromUri() {
    return Optional.ofNullable(derivedFromUri);
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
   * @return The value of the {@code copyright} attribute
   */
  @JsonProperty("copyright")
  @Override
  public Optional<Markdown> copyright() {
    return Optional.ofNullable(copyright);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<Markdown> description() {
    return Optional.ofNullable(description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#replaces() replaces} attribute.
   * @param value The value for replaces
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withReplaces(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "replaces");
    if (this.replaces == newValue) return this;
    return new ImmutableChargeItemDefinition(
        newValue,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#replaces() replaces} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for replaces
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withReplaces(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.replaces == value) return this;
    return new ImmutableChargeItemDefinition(
        value,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        newValue,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        value,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        newValue,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        value,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#propertyGroup() propertyGroup} attribute.
   * @param value The value for propertyGroup
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withPropertyGroup(List<ChargeItemDefinition_PropertyGroup> value) {
    @Nullable List<ChargeItemDefinition_PropertyGroup> newValue = Objects.requireNonNull(value, "propertyGroup");
    if (this.propertyGroup == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        newValue,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#propertyGroup() propertyGroup} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for propertyGroup
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withPropertyGroup(Optional<? extends List<ChargeItemDefinition_PropertyGroup>> optional) {
    @Nullable List<ChargeItemDefinition_PropertyGroup> value = optional.orElse(null);
    if (this.propertyGroup == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        value,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withPublisher(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "publisher");
    if (Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        newValue,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withPublisher(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.publisher, value)) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        value,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        newValue,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        value,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withPartOf(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        newValue,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withPartOf(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        value,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withStatus(ChargeitemdefinitionStatus value) {
    @Nullable ChargeitemdefinitionStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        newValue,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withStatus(Optional<? extends ChargeitemdefinitionStatus> optional) {
    @Nullable ChargeitemdefinitionStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        value,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        newValue,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        value,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        newValue,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        value,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        newValue,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        value,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        newValue,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        value,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        newValue,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        value,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        newValue,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        value,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#applicability() applicability} attribute.
   * @param value The value for applicability
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withApplicability(List<ChargeItemDefinition_Applicability> value) {
    @Nullable List<ChargeItemDefinition_Applicability> newValue = Objects.requireNonNull(value, "applicability");
    if (this.applicability == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        newValue,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#applicability() applicability} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for applicability
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withApplicability(Optional<? extends List<ChargeItemDefinition_Applicability>> optional) {
    @Nullable List<ChargeItemDefinition_Applicability> value = optional.orElse(null);
    if (this.applicability == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        value,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        newValue,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        value,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withExperimental(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        newValue,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withExperimental(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.experimental, value)) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        value,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        newValue,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        value,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#approvalDate() approvalDate} attribute.
   * @param value The value for approvalDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withApprovalDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "approvalDate");
    if (this.approvalDate == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        newValue,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#approvalDate() approvalDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for approvalDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withApprovalDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.approvalDate == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        value,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        newValue,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        value,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#lastReviewDate() lastReviewDate} attribute.
   * @param value The value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withLastReviewDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "lastReviewDate");
    if (this.lastReviewDate == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        newValue,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#lastReviewDate() lastReviewDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withLastReviewDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.lastReviewDate == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        value,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        newValue,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        value,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#instance() instance} attribute.
   * @param value The value for instance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withInstance(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "instance");
    if (this.instance == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        newValue,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#instance() instance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withInstance(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.instance == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        value,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withEffectivePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        newValue,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withEffectivePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        value,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        newValue,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        value,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#derivedFromUri() derivedFromUri} attribute.
   * @param value The value for derivedFromUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withDerivedFromUri(List<Uri> value) {
    @Nullable List<Uri> newValue = Objects.requireNonNull(value, "derivedFromUri");
    if (this.derivedFromUri == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        newValue,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#derivedFromUri() derivedFromUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for derivedFromUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withDerivedFromUri(Optional<? extends List<Uri>> optional) {
    @Nullable List<Uri> value = optional.orElse(null);
    if (this.derivedFromUri == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        value,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        newValue,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        value,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withCopyright(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        newValue,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withCopyright(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        value,
        this.resourceType,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeItemDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeItemDefinition withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        newValue,
        this.identifier,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        newValue,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        value,
        this.useContext,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withUseContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        newValue,
        this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withUseContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        value,
        this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableChargeItemDefinition(
        this.replaces,
        this.modifierExtension,
        this.contact,
        this.propertyGroup,
        this.publisher,
        this.code,
        this.partOf,
        this.status,
        this.version,
        this.jurisdiction,
        this.title,
        this.meta,
        this.implicitRules,
        this.language,
        this.applicability,
        this.text,
        this.experimental,
        this.url,
        this.approvalDate,
        this.extension,
        this.lastReviewDate,
        this.date,
        this.instance,
        this.effectivePeriod,
        this.id,
        this.derivedFromUri,
        this.contained,
        this.copyright,
        this.resourceType,
        this.identifier,
        this.useContext,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableChargeItemDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableChargeItemDefinition
        && equalTo((ImmutableChargeItemDefinition) another);
  }

  private boolean equalTo(ImmutableChargeItemDefinition another) {
    return Objects.equals(replaces, another.replaces)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(contact, another.contact)
        && Objects.equals(propertyGroup, another.propertyGroup)
        && Objects.equals(publisher, another.publisher)
        && Objects.equals(code, another.code)
        && Objects.equals(partOf, another.partOf)
        && Objects.equals(status, another.status)
        && Objects.equals(version, another.version)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(title, another.title)
        && Objects.equals(meta, another.meta)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(language, another.language)
        && Objects.equals(applicability, another.applicability)
        && Objects.equals(text, another.text)
        && Objects.equals(experimental, another.experimental)
        && Objects.equals(url, another.url)
        && Objects.equals(approvalDate, another.approvalDate)
        && Objects.equals(extension, another.extension)
        && Objects.equals(lastReviewDate, another.lastReviewDate)
        && Objects.equals(date, another.date)
        && Objects.equals(instance, another.instance)
        && Objects.equals(effectivePeriod, another.effectivePeriod)
        && Objects.equals(id, another.id)
        && Objects.equals(derivedFromUri, another.derivedFromUri)
        && Objects.equals(contained, another.contained)
        && Objects.equals(copyright, another.copyright)
        && resourceType.equals(another.resourceType)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(useContext, another.useContext)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code replaces}, {@code modifierExtension}, {@code contact}, {@code propertyGroup}, {@code publisher}, {@code code}, {@code partOf}, {@code status}, {@code version}, {@code jurisdiction}, {@code title}, {@code meta}, {@code implicitRules}, {@code language}, {@code applicability}, {@code text}, {@code experimental}, {@code url}, {@code approvalDate}, {@code extension}, {@code lastReviewDate}, {@code date}, {@code instance}, {@code effectivePeriod}, {@code id}, {@code derivedFromUri}, {@code contained}, {@code copyright}, {@code resourceType}, {@code identifier}, {@code useContext}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(replaces);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(propertyGroup);
    h += (h << 5) + Objects.hashCode(publisher);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(partOf);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(applicability);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(experimental);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(approvalDate);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(lastReviewDate);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(instance);
    h += (h << 5) + Objects.hashCode(effectivePeriod);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(derivedFromUri);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(copyright);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(useContext);
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code ChargeItemDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ChargeItemDefinition{");
    if (replaces != null) {
      builder.append("replaces=").append(replaces);
    }
    if (modifierExtension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (contact != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (propertyGroup != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("propertyGroup=").append(propertyGroup);
    }
    if (publisher != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (code != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (partOf != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (status != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (version != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (jurisdiction != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (title != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (meta != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (implicitRules != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (applicability != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("applicability=").append(applicability);
    }
    if (text != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (experimental != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (url != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (approvalDate != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("approvalDate=").append(approvalDate);
    }
    if (extension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (lastReviewDate != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("lastReviewDate=").append(lastReviewDate);
    }
    if (date != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (instance != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("instance=").append(instance);
    }
    if (effectivePeriod != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (id != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (derivedFromUri != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("derivedFromUri=").append(derivedFromUri);
    }
    if (contained != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (copyright != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (builder.length() > 21) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ChargeItemDefinition", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ChargeItemDefinition {
    @Nullable Optional<List<Canonical>> replaces = Optional.empty();
    boolean replacesIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<List<ChargeItemDefinition_PropertyGroup>> propertyGroup = Optional.empty();
    boolean propertyGroupIsSet;
    @Nullable Optional<String> publisher = Optional.empty();
    boolean publisherIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<List<Canonical>> partOf = Optional.empty();
    boolean partOfIsSet;
    @Nullable Optional<ChargeitemdefinitionStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<ChargeItemDefinition_Applicability>> applicability = Optional.empty();
    boolean applicabilityIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Boolean> experimental = Optional.empty();
    boolean experimentalIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<Date> approvalDate = Optional.empty();
    boolean approvalDateIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Date> lastReviewDate = Optional.empty();
    boolean lastReviewDateIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<List<Reference>> instance = Optional.empty();
    boolean instanceIsSet;
    @Nullable Optional<Period> effectivePeriod = Optional.empty();
    boolean effectivePeriodIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Uri>> derivedFromUri = Optional.empty();
    boolean derivedFromUriIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Markdown> copyright = Optional.empty();
    boolean copyrightIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<UsageContext>> useContext = Optional.empty();
    boolean useContextIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @JsonProperty("replaces")
    public void setReplaces(Optional<List<Canonical>> replaces) {
      this.replaces = replaces;
      this.replacesIsSet = true;
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
    @JsonProperty("propertyGroup")
    public void setPropertyGroup(Optional<List<ChargeItemDefinition_PropertyGroup>> propertyGroup) {
      this.propertyGroup = propertyGroup;
      this.propertyGroupIsSet = true;
    }
    @JsonProperty("publisher")
    public void setPublisher(Optional<String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("partOf")
    public void setPartOf(Optional<List<Canonical>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<ChargeitemdefinitionStatus> status) {
      this.status = status;
      this.statusIsSet = true;
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
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
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
    @JsonProperty("applicability")
    public void setApplicability(Optional<List<ChargeItemDefinition_Applicability>> applicability) {
      this.applicability = applicability;
      this.applicabilityIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("experimental")
    public void setExperimental(Optional<Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("approvalDate")
    public void setApprovalDate(Optional<Date> approvalDate) {
      this.approvalDate = approvalDate;
      this.approvalDateIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("lastReviewDate")
    public void setLastReviewDate(Optional<Date> lastReviewDate) {
      this.lastReviewDate = lastReviewDate;
      this.lastReviewDateIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("instance")
    public void setInstance(Optional<List<Reference>> instance) {
      this.instance = instance;
      this.instanceIsSet = true;
    }
    @JsonProperty("effectivePeriod")
    public void setEffectivePeriod(Optional<Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("derivedFromUri")
    public void setDerivedFromUri(Optional<List<Uri>> derivedFromUri) {
      this.derivedFromUri = derivedFromUri;
      this.derivedFromUriIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("copyright")
    public void setCopyright(Optional<Markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("useContext")
    public void setUseContext(Optional<List<UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @Override
    public Optional<List<Canonical>> replaces() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ChargeItemDefinition_PropertyGroup>> propertyGroup() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ChargeitemdefinitionStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ChargeItemDefinition_Applicability>> applicability() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> approvalDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> lastReviewDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> instance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Uri>> derivedFromUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableChargeItemDefinition fromJson(Json json) {
    ImmutableChargeItemDefinition.Builder builder = ((ImmutableChargeItemDefinition.Builder) ImmutableChargeItemDefinition.builder());
    if (json.replacesIsSet) {
      builder.replaces(json.replaces);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.propertyGroupIsSet) {
      builder.propertyGroup(json.propertyGroup);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.applicabilityIsSet) {
      builder.applicability(json.applicability);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.approvalDateIsSet) {
      builder.approvalDate(json.approvalDate);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.lastReviewDateIsSet) {
      builder.lastReviewDate(json.lastReviewDate);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.instanceIsSet) {
      builder.instance(json.instance);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.derivedFromUriIsSet) {
      builder.derivedFromUri(json.derivedFromUri);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    return (ImmutableChargeItemDefinition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ChargeItemDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ChargeItemDefinition instance
   */
  public static ChargeItemDefinition copyOf(ChargeItemDefinition instance) {
    if (instance instanceof ImmutableChargeItemDefinition) {
      return (ImmutableChargeItemDefinition) instance;
    }
    return ((ImmutableChargeItemDefinition.Builder) ImmutableChargeItemDefinition.builder())
        .replaces(instance.replaces())
        .modifierExtension(instance.modifierExtension())
        .contact(instance.contact())
        .propertyGroup(instance.propertyGroup())
        .publisher(instance.publisher())
        .code(instance.code())
        .partOf(instance.partOf())
        .status(instance.status())
        .version(instance.version())
        .jurisdiction(instance.jurisdiction())
        .title(instance.title())
        .meta(instance.meta())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .applicability(instance.applicability())
        .text(instance.text())
        .experimental(instance.experimental())
        .url(instance.url())
        .approvalDate(instance.approvalDate())
        .extension(instance.extension())
        .lastReviewDate(instance.lastReviewDate())
        .date(instance.date())
        .instance(instance.instance())
        .effectivePeriod(instance.effectivePeriod())
        .id(instance.id())
        .derivedFromUri(instance.derivedFromUri())
        .contained(instance.contained())
        .copyright(instance.copyright())
        .resourceType(instance.resourceType())
        .identifier(instance.identifier())
        .useContext(instance.useContext())
        .description(instance.description())
        .build();
  }

  /**
   * Creates a builder for {@link ChargeItemDefinition ChargeItemDefinition}.
   * <pre>
   * ImmutableChargeItemDefinition.builder()
   *    .replaces(List&amp;lt;com.medplum.types.fhir.Canonical&amp;gt;) // optional {@link ChargeItemDefinition#replaces() replaces}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ChargeItemDefinition#modifierExtension() modifierExtension}
   *    .contact(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link ChargeItemDefinition#contact() contact}
   *    .propertyGroup(List&amp;lt;com.medplum.types.fhir.ChargeItemDefinition_PropertyGroup&amp;gt;) // optional {@link ChargeItemDefinition#propertyGroup() propertyGroup}
   *    .publisher(String) // optional {@link ChargeItemDefinition#publisher() publisher}
   *    .code(com.medplum.types.fhir.CodeableConcept) // optional {@link ChargeItemDefinition#code() code}
   *    .partOf(List&amp;lt;com.medplum.types.fhir.Canonical&amp;gt;) // optional {@link ChargeItemDefinition#partOf() partOf}
   *    .status(com.medplum.types.fhir.ChargeitemdefinitionStatus) // optional {@link ChargeItemDefinition#status() status}
   *    .version(String) // optional {@link ChargeItemDefinition#version() version}
   *    .jurisdiction(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ChargeItemDefinition#jurisdiction() jurisdiction}
   *    .title(String) // optional {@link ChargeItemDefinition#title() title}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link ChargeItemDefinition#meta() meta}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link ChargeItemDefinition#implicitRules() implicitRules}
   *    .language(com.medplum.types.fhir.Code) // optional {@link ChargeItemDefinition#language() language}
   *    .applicability(List&amp;lt;com.medplum.types.fhir.ChargeItemDefinition_Applicability&amp;gt;) // optional {@link ChargeItemDefinition#applicability() applicability}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link ChargeItemDefinition#text() text}
   *    .experimental(Boolean) // optional {@link ChargeItemDefinition#experimental() experimental}
   *    .url(com.medplum.types.fhir.Uri) // optional {@link ChargeItemDefinition#url() url}
   *    .approvalDate(com.medplum.types.fhir.Date) // optional {@link ChargeItemDefinition#approvalDate() approvalDate}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ChargeItemDefinition#extension() extension}
   *    .lastReviewDate(com.medplum.types.fhir.Date) // optional {@link ChargeItemDefinition#lastReviewDate() lastReviewDate}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link ChargeItemDefinition#date() date}
   *    .instance(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link ChargeItemDefinition#instance() instance}
   *    .effectivePeriod(com.medplum.types.fhir.Period) // optional {@link ChargeItemDefinition#effectivePeriod() effectivePeriod}
   *    .id(com.medplum.types.fhir.Id) // optional {@link ChargeItemDefinition#id() id}
   *    .derivedFromUri(List&amp;lt;com.medplum.types.fhir.Uri&amp;gt;) // optional {@link ChargeItemDefinition#derivedFromUri() derivedFromUri}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link ChargeItemDefinition#contained() contained}
   *    .copyright(com.medplum.types.fhir.Markdown) // optional {@link ChargeItemDefinition#copyright() copyright}
   *    .resourceType(String) // required {@link ChargeItemDefinition#resourceType() resourceType}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link ChargeItemDefinition#identifier() identifier}
   *    .useContext(List&amp;lt;com.medplum.types.fhir.UsageContext&amp;gt;) // optional {@link ChargeItemDefinition#useContext() useContext}
   *    .description(com.medplum.types.fhir.Markdown) // optional {@link ChargeItemDefinition#description() description}
   *    .build();
   * </pre>
   * @return A new ChargeItemDefinition builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableChargeItemDefinition.Builder();
  }

  /**
   * Builds instances of type {@link ChargeItemDefinition ChargeItemDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ChargeItemDefinition", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_REPLACES = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_CONTACT = 0x4L;
    private static final long OPT_BIT_PROPERTY_GROUP = 0x8L;
    private static final long OPT_BIT_PUBLISHER = 0x10L;
    private static final long OPT_BIT_CODE = 0x20L;
    private static final long OPT_BIT_PART_OF = 0x40L;
    private static final long OPT_BIT_STATUS = 0x80L;
    private static final long OPT_BIT_VERSION = 0x100L;
    private static final long OPT_BIT_JURISDICTION = 0x200L;
    private static final long OPT_BIT_TITLE = 0x400L;
    private static final long OPT_BIT_META = 0x800L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1000L;
    private static final long OPT_BIT_LANGUAGE = 0x2000L;
    private static final long OPT_BIT_APPLICABILITY = 0x4000L;
    private static final long OPT_BIT_TEXT = 0x8000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x10000L;
    private static final long OPT_BIT_URL = 0x20000L;
    private static final long OPT_BIT_APPROVAL_DATE = 0x40000L;
    private static final long OPT_BIT_EXTENSION = 0x80000L;
    private static final long OPT_BIT_LAST_REVIEW_DATE = 0x100000L;
    private static final long OPT_BIT_DATE = 0x200000L;
    private static final long OPT_BIT_INSTANCE = 0x400000L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x800000L;
    private static final long OPT_BIT_ID = 0x1000000L;
    private static final long OPT_BIT_DERIVED_FROM_URI = 0x2000000L;
    private static final long OPT_BIT_CONTAINED = 0x4000000L;
    private static final long OPT_BIT_COPYRIGHT = 0x8000000L;
    private static final long OPT_BIT_IDENTIFIER = 0x10000000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x20000000L;
    private static final long OPT_BIT_DESCRIPTION = 0x40000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Canonical> replaces;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<ContactDetail> contact;
    private @Nullable List<ChargeItemDefinition_PropertyGroup> propertyGroup;
    private @Nullable String publisher;
    private @Nullable CodeableConcept code;
    private @Nullable List<Canonical> partOf;
    private @Nullable ChargeitemdefinitionStatus status;
    private @Nullable String version;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable String title;
    private @Nullable Meta meta;
    private @Nullable Uri implicitRules;
    private @Nullable Code language;
    private @Nullable List<ChargeItemDefinition_Applicability> applicability;
    private @Nullable Narrative text;
    private @Nullable Boolean experimental;
    private @Nullable Uri url;
    private @Nullable Date approvalDate;
    private @Nullable List<Extension> extension;
    private @Nullable Date lastReviewDate;
    private @Nullable DateTime date;
    private @Nullable List<Reference> instance;
    private @Nullable Period effectivePeriod;
    private @Nullable Id id;
    private @Nullable List<Uri> derivedFromUri;
    private @Nullable List<ResourceList> contained;
    private @Nullable Markdown copyright;
    private @Nullable String resourceType;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<UsageContext> useContext;
    private @Nullable Markdown description;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#replaces() replaces} to replaces.
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
     * Initializes the optional value {@link ChargeItemDefinition#replaces() replaces} to replaces.
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
     * Initializes the optional value {@link ChargeItemDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ChargeItemDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ChargeItemDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link ChargeItemDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link ChargeItemDefinition#propertyGroup() propertyGroup} to propertyGroup.
     * @param propertyGroup The value for propertyGroup
     * @return {@code this} builder for chained invocation
     */
    public final Builder propertyGroup(List<ChargeItemDefinition_PropertyGroup> propertyGroup) {
      checkNotIsSet(propertyGroupIsSet(), "propertyGroup");
      this.propertyGroup = Objects.requireNonNull(propertyGroup, "propertyGroup");
      optBits |= OPT_BIT_PROPERTY_GROUP;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#propertyGroup() propertyGroup} to propertyGroup.
     * @param propertyGroup The value for propertyGroup
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("propertyGroup")
    public final Builder propertyGroup(Optional<? extends List<ChargeItemDefinition_PropertyGroup>> propertyGroup) {
      checkNotIsSet(propertyGroupIsSet(), "propertyGroup");
      this.propertyGroup = propertyGroup.orElse(null);
      optBits |= OPT_BIT_PROPERTY_GROUP;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ChargeItemDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ChargeItemDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder partOf(List<Canonical> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = Objects.requireNonNull(partOf, "partOf");
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("partOf")
    public final Builder partOf(Optional<? extends List<Canonical>> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = partOf.orElse(null);
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(ChargeitemdefinitionStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends ChargeitemdefinitionStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#version() version} to version.
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
     * Initializes the optional value {@link ChargeItemDefinition#version() version} to version.
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
     * Initializes the optional value {@link ChargeItemDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ChargeItemDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ChargeItemDefinition#title() title} to title.
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
     * Initializes the optional value {@link ChargeItemDefinition#title() title} to title.
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
     * Initializes the optional value {@link ChargeItemDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link ChargeItemDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link ChargeItemDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ChargeItemDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ChargeItemDefinition#language() language} to language.
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
     * Initializes the optional value {@link ChargeItemDefinition#language() language} to language.
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
     * Initializes the optional value {@link ChargeItemDefinition#applicability() applicability} to applicability.
     * @param applicability The value for applicability
     * @return {@code this} builder for chained invocation
     */
    public final Builder applicability(List<ChargeItemDefinition_Applicability> applicability) {
      checkNotIsSet(applicabilityIsSet(), "applicability");
      this.applicability = Objects.requireNonNull(applicability, "applicability");
      optBits |= OPT_BIT_APPLICABILITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#applicability() applicability} to applicability.
     * @param applicability The value for applicability
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("applicability")
    public final Builder applicability(Optional<? extends List<ChargeItemDefinition_Applicability>> applicability) {
      checkNotIsSet(applicabilityIsSet(), "applicability");
      this.applicability = applicability.orElse(null);
      optBits |= OPT_BIT_APPLICABILITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#text() text} to text.
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
     * Initializes the optional value {@link ChargeItemDefinition#text() text} to text.
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
     * Initializes the optional value {@link ChargeItemDefinition#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link ChargeItemDefinition#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link ChargeItemDefinition#url() url} to url.
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
     * Initializes the optional value {@link ChargeItemDefinition#url() url} to url.
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
     * Initializes the optional value {@link ChargeItemDefinition#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder approvalDate(Date approvalDate) {
      checkNotIsSet(approvalDateIsSet(), "approvalDate");
      this.approvalDate = Objects.requireNonNull(approvalDate, "approvalDate");
      optBits |= OPT_BIT_APPROVAL_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("approvalDate")
    public final Builder approvalDate(Optional<? extends Date> approvalDate) {
      checkNotIsSet(approvalDateIsSet(), "approvalDate");
      this.approvalDate = approvalDate.orElse(null);
      optBits |= OPT_BIT_APPROVAL_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link ChargeItemDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link ChargeItemDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder lastReviewDate(Date lastReviewDate) {
      checkNotIsSet(lastReviewDateIsSet(), "lastReviewDate");
      this.lastReviewDate = Objects.requireNonNull(lastReviewDate, "lastReviewDate");
      optBits |= OPT_BIT_LAST_REVIEW_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastReviewDate")
    public final Builder lastReviewDate(Optional<? extends Date> lastReviewDate) {
      checkNotIsSet(lastReviewDateIsSet(), "lastReviewDate");
      this.lastReviewDate = lastReviewDate.orElse(null);
      optBits |= OPT_BIT_LAST_REVIEW_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#date() date} to date.
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
     * Initializes the optional value {@link ChargeItemDefinition#date() date} to date.
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
     * Initializes the optional value {@link ChargeItemDefinition#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for chained invocation
     */
    public final Builder instance(List<Reference> instance) {
      checkNotIsSet(instanceIsSet(), "instance");
      this.instance = Objects.requireNonNull(instance, "instance");
      optBits |= OPT_BIT_INSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instance")
    public final Builder instance(Optional<? extends List<Reference>> instance) {
      checkNotIsSet(instanceIsSet(), "instance");
      this.instance = instance.orElse(null);
      optBits |= OPT_BIT_INSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectivePeriod(Period effectivePeriod) {
      checkNotIsSet(effectivePeriodIsSet(), "effectivePeriod");
      this.effectivePeriod = Objects.requireNonNull(effectivePeriod, "effectivePeriod");
      optBits |= OPT_BIT_EFFECTIVE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("effectivePeriod")
    public final Builder effectivePeriod(Optional<? extends Period> effectivePeriod) {
      checkNotIsSet(effectivePeriodIsSet(), "effectivePeriod");
      this.effectivePeriod = effectivePeriod.orElse(null);
      optBits |= OPT_BIT_EFFECTIVE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#id() id} to id.
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
     * Initializes the optional value {@link ChargeItemDefinition#id() id} to id.
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
     * Initializes the optional value {@link ChargeItemDefinition#derivedFromUri() derivedFromUri} to derivedFromUri.
     * @param derivedFromUri The value for derivedFromUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder derivedFromUri(List<Uri> derivedFromUri) {
      checkNotIsSet(derivedFromUriIsSet(), "derivedFromUri");
      this.derivedFromUri = Objects.requireNonNull(derivedFromUri, "derivedFromUri");
      optBits |= OPT_BIT_DERIVED_FROM_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#derivedFromUri() derivedFromUri} to derivedFromUri.
     * @param derivedFromUri The value for derivedFromUri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("derivedFromUri")
    public final Builder derivedFromUri(Optional<? extends List<Uri>> derivedFromUri) {
      checkNotIsSet(derivedFromUriIsSet(), "derivedFromUri");
      this.derivedFromUri = derivedFromUri.orElse(null);
      optBits |= OPT_BIT_DERIVED_FROM_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link ChargeItemDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link ChargeItemDefinition#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link ChargeItemDefinition#copyright() copyright} to copyright.
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
     * Initializes the value for the {@link ChargeItemDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ChargeItemDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ChargeItemDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ChargeItemDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link ChargeItemDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link ChargeItemDefinition#description() description} to description.
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
     * Initializes the optional value {@link ChargeItemDefinition#description() description} to description.
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
     * Builds a new {@link ChargeItemDefinition ChargeItemDefinition}.
     * @return An immutable instance of ChargeItemDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ChargeItemDefinition build() {
      checkRequiredAttributes();
      return new ImmutableChargeItemDefinition(
          replaces,
          modifierExtension,
          contact,
          propertyGroup,
          publisher,
          code,
          partOf,
          status,
          version,
          jurisdiction,
          title,
          meta,
          implicitRules,
          language,
          applicability,
          text,
          experimental,
          url,
          approvalDate,
          extension,
          lastReviewDate,
          date,
          instance,
          effectivePeriod,
          id,
          derivedFromUri,
          contained,
          copyright,
          resourceType,
          identifier,
          useContext,
          description);
    }

    private boolean replacesIsSet() {
      return (optBits & OPT_BIT_REPLACES) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean propertyGroupIsSet() {
      return (optBits & OPT_BIT_PROPERTY_GROUP) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean applicabilityIsSet() {
      return (optBits & OPT_BIT_APPLICABILITY) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean approvalDateIsSet() {
      return (optBits & OPT_BIT_APPROVAL_DATE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean lastReviewDateIsSet() {
      return (optBits & OPT_BIT_LAST_REVIEW_DATE) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean instanceIsSet() {
      return (optBits & OPT_BIT_INSTANCE) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean derivedFromUriIsSet() {
      return (optBits & OPT_BIT_DERIVED_FROM_URI) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ChargeItemDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build ChargeItemDefinition, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ChargeItemDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ChargeItemDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "ChargeItemDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ChargeItemDefinition#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for chained invocation
     */
    BuildFinal replaces(List<Canonical> replaces);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal replaces(Optional<? extends List<Canonical>> replaces);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#propertyGroup() propertyGroup} to propertyGroup.
     * @param propertyGroup The value for propertyGroup
     * @return {@code this} builder for chained invocation
     */
    BuildFinal propertyGroup(List<ChargeItemDefinition_PropertyGroup> propertyGroup);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#propertyGroup() propertyGroup} to propertyGroup.
     * @param propertyGroup The value for propertyGroup
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal propertyGroup(Optional<? extends List<ChargeItemDefinition_PropertyGroup>> propertyGroup);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(String publisher);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<String> publisher);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(CodeableConcept code);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends CodeableConcept> code);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(List<Canonical> partOf);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(Optional<? extends List<Canonical>> partOf);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(ChargeitemdefinitionStatus status);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends ChargeitemdefinitionStatus> status);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(List<CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#applicability() applicability} to applicability.
     * @param applicability The value for applicability
     * @return {@code this} builder for chained invocation
     */
    BuildFinal applicability(List<ChargeItemDefinition_Applicability> applicability);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#applicability() applicability} to applicability.
     * @param applicability The value for applicability
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal applicability(Optional<? extends List<ChargeItemDefinition_Applicability>> applicability);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(Optional<Boolean> experimental);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal approvalDate(Date approvalDate);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal approvalDate(Optional<? extends Date> approvalDate);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastReviewDate(Date lastReviewDate);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastReviewDate(Optional<? extends Date> lastReviewDate);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instance(List<Reference> instance);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instance(Optional<? extends List<Reference>> instance);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(Period effectivePeriod);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(Optional<? extends Period> effectivePeriod);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#derivedFromUri() derivedFromUri} to derivedFromUri.
     * @param derivedFromUri The value for derivedFromUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal derivedFromUri(List<Uri> derivedFromUri);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#derivedFromUri() derivedFromUri} to derivedFromUri.
     * @param derivedFromUri The value for derivedFromUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal derivedFromUri(Optional<? extends List<Uri>> derivedFromUri);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(Markdown copyright);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(Optional<? extends Markdown> copyright);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(List<UsageContext> useContext);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(Optional<? extends List<UsageContext>> useContext);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(Markdown description);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<? extends Markdown> description);

    /**
     * Builds a new {@link ChargeItemDefinition ChargeItemDefinition}.
     * @return An immutable instance of ChargeItemDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ChargeItemDefinition build();
  }
}
