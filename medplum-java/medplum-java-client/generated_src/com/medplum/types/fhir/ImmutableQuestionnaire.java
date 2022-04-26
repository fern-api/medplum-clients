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
 * Immutable implementation of {@link Questionnaire}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableQuestionnaire.builder()}.
 */
@Generated(from = "Questionnaire", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableQuestionnaire implements Questionnaire {
  private final @Nullable List<UsageContext> useContext;
  private final @Nullable String title;
  private final @Nullable List<Questionnaire_Item> item;
  private final @Nullable Date approvalDate;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<ContactDetail> contact;
  private final @Nullable Markdown purpose;
  private final @Nullable Uri url;
  private final @Nullable DateTime date;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Markdown copyright;
  private final @Nullable Id id;
  private final @Nullable Narrative text;
  private final @Nullable String publisher;
  private final @Nullable Date lastReviewDate;
  private final @Nullable List<Code> subjectType;
  private final @Nullable QuestionnaireStatus status;
  private final @Nullable Markdown description;
  private final @Nullable List<Canonical> derivedFrom;
  private final @Nullable String name;
  private final @Nullable List<Coding> code;
  private final String resourceType;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final @Nullable String version;
  private final @Nullable Code language;
  private final @Nullable Meta meta;
  private final @Nullable Boolean experimental;
  private final @Nullable Period effectivePeriod;
  private final @Nullable Uri implicitRules;

  private ImmutableQuestionnaire(
      @Nullable List<UsageContext> useContext,
      @Nullable String title,
      @Nullable List<Questionnaire_Item> item,
      @Nullable Date approvalDate,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<ContactDetail> contact,
      @Nullable Markdown purpose,
      @Nullable Uri url,
      @Nullable DateTime date,
      @Nullable List<Extension> extension,
      @Nullable List<ResourceList> contained,
      @Nullable List<Identifier> identifier,
      @Nullable Markdown copyright,
      @Nullable Id id,
      @Nullable Narrative text,
      @Nullable String publisher,
      @Nullable Date lastReviewDate,
      @Nullable List<Code> subjectType,
      @Nullable QuestionnaireStatus status,
      @Nullable Markdown description,
      @Nullable List<Canonical> derivedFrom,
      @Nullable String name,
      @Nullable List<Coding> code,
      String resourceType,
      @Nullable List<CodeableConcept> jurisdiction,
      @Nullable String version,
      @Nullable Code language,
      @Nullable Meta meta,
      @Nullable Boolean experimental,
      @Nullable Period effectivePeriod,
      @Nullable Uri implicitRules) {
    this.useContext = useContext;
    this.title = title;
    this.item = item;
    this.approvalDate = approvalDate;
    this.modifierExtension = modifierExtension;
    this.contact = contact;
    this.purpose = purpose;
    this.url = url;
    this.date = date;
    this.extension = extension;
    this.contained = contained;
    this.identifier = identifier;
    this.copyright = copyright;
    this.id = id;
    this.text = text;
    this.publisher = publisher;
    this.lastReviewDate = lastReviewDate;
    this.subjectType = subjectType;
    this.status = status;
    this.description = description;
    this.derivedFrom = derivedFrom;
    this.name = name;
    this.code = code;
    this.resourceType = resourceType;
    this.jurisdiction = jurisdiction;
    this.version = version;
    this.language = language;
    this.meta = meta;
    this.experimental = experimental;
    this.effectivePeriod = effectivePeriod;
    this.implicitRules = implicitRules;
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
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
  }

  /**
   * @return The value of the {@code item} attribute
   */
  @JsonProperty("item")
  @Override
  public Optional<List<Questionnaire_Item>> item() {
    return Optional.ofNullable(item);
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
   * @return The value of the {@code purpose} attribute
   */
  @JsonProperty("purpose")
  @Override
  public Optional<Markdown> purpose() {
    return Optional.ofNullable(purpose);
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
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
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
   * @return The value of the {@code copyright} attribute
   */
  @JsonProperty("copyright")
  @Override
  public Optional<Markdown> copyright() {
    return Optional.ofNullable(copyright);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
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
   * @return The value of the {@code lastReviewDate} attribute
   */
  @JsonProperty("lastReviewDate")
  @Override
  public Optional<Date> lastReviewDate() {
    return Optional.ofNullable(lastReviewDate);
  }

  /**
   * @return The value of the {@code subjectType} attribute
   */
  @JsonProperty("subjectType")
  @Override
  public Optional<List<Code>> subjectType() {
    return Optional.ofNullable(subjectType);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<QuestionnaireStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code derivedFrom} attribute
   */
  @JsonProperty("derivedFrom")
  @Override
  public Optional<List<Canonical>> derivedFrom() {
    return Optional.ofNullable(derivedFrom);
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<List<Coding>> code() {
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @JsonProperty("jurisdiction")
  @Override
  public Optional<List<CodeableConcept>> jurisdiction() {
    return Optional.ofNullable(jurisdiction);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * @return The value of the {@code experimental} attribute
   */
  @JsonProperty("experimental")
  @Override
  public Optional<Boolean> experimental() {
    return Optional.ofNullable(experimental);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withUseContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableQuestionnaire(
        newValue,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withUseContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableQuestionnaire(
        value,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        newValue,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        value,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#item() item} attribute.
   * @param value The value for item
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withItem(List<Questionnaire_Item> value) {
    @Nullable List<Questionnaire_Item> newValue = Objects.requireNonNull(value, "item");
    if (this.item == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        newValue,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#item() item} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for item
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withItem(Optional<? extends List<Questionnaire_Item>> optional) {
    @Nullable List<Questionnaire_Item> value = optional.orElse(null);
    if (this.item == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        value,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#approvalDate() approvalDate} attribute.
   * @param value The value for approvalDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withApprovalDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "approvalDate");
    if (this.approvalDate == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        newValue,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#approvalDate() approvalDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for approvalDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withApprovalDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.approvalDate == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        value,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        newValue,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        value,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        newValue,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        value,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withPurpose(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        newValue,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withPurpose(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        value,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        newValue,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        value,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        newValue,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        value,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        newValue,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        value,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        newValue,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        value,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        newValue,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        value,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withCopyright(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        newValue,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withCopyright(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        value,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        newValue,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        value,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        newValue,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        value,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withPublisher(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "publisher");
    if (Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        newValue,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withPublisher(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.publisher, value)) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        value,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#lastReviewDate() lastReviewDate} attribute.
   * @param value The value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withLastReviewDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "lastReviewDate");
    if (this.lastReviewDate == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        newValue,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#lastReviewDate() lastReviewDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withLastReviewDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.lastReviewDate == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        value,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#subjectType() subjectType} attribute.
   * @param value The value for subjectType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withSubjectType(List<Code> value) {
    @Nullable List<Code> newValue = Objects.requireNonNull(value, "subjectType");
    if (this.subjectType == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        newValue,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#subjectType() subjectType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withSubjectType(Optional<? extends List<Code>> optional) {
    @Nullable List<Code> value = optional.orElse(null);
    if (this.subjectType == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        value,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withStatus(QuestionnaireStatus value) {
    @Nullable QuestionnaireStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        newValue,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withStatus(Optional<? extends QuestionnaireStatus> optional) {
    @Nullable QuestionnaireStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        value,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        newValue,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        value,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#derivedFrom() derivedFrom} attribute.
   * @param value The value for derivedFrom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withDerivedFrom(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "derivedFrom");
    if (this.derivedFrom == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        newValue,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#derivedFrom() derivedFrom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for derivedFrom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withDerivedFrom(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.derivedFrom == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        value,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        newValue,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        value,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withCode(List<Coding> value) {
    @Nullable List<Coding> newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        newValue,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withCode(Optional<? extends List<Coding>> optional) {
    @Nullable List<Coding> value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        value,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Questionnaire#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableQuestionnaire withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        newValue,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        newValue,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        value,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        newValue,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        value,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        newValue,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        value,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        newValue,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        value,
        this.experimental,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withExperimental(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        newValue,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withExperimental(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.experimental, value)) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        value,
        this.effectivePeriod,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withEffectivePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        newValue,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withEffectivePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        value,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableQuestionnaire(
        this.useContext,
        this.title,
        this.item,
        this.approvalDate,
        this.modifierExtension,
        this.contact,
        this.purpose,
        this.url,
        this.date,
        this.extension,
        this.contained,
        this.identifier,
        this.copyright,
        this.id,
        this.text,
        this.publisher,
        this.lastReviewDate,
        this.subjectType,
        this.status,
        this.description,
        this.derivedFrom,
        this.name,
        this.code,
        this.resourceType,
        this.jurisdiction,
        this.version,
        this.language,
        this.meta,
        this.experimental,
        this.effectivePeriod,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableQuestionnaire} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableQuestionnaire
        && equalTo((ImmutableQuestionnaire) another);
  }

  private boolean equalTo(ImmutableQuestionnaire another) {
    return Objects.equals(useContext, another.useContext)
        && Objects.equals(title, another.title)
        && Objects.equals(item, another.item)
        && Objects.equals(approvalDate, another.approvalDate)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(contact, another.contact)
        && Objects.equals(purpose, another.purpose)
        && Objects.equals(url, another.url)
        && Objects.equals(date, another.date)
        && Objects.equals(extension, another.extension)
        && Objects.equals(contained, another.contained)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(copyright, another.copyright)
        && Objects.equals(id, another.id)
        && Objects.equals(text, another.text)
        && Objects.equals(publisher, another.publisher)
        && Objects.equals(lastReviewDate, another.lastReviewDate)
        && Objects.equals(subjectType, another.subjectType)
        && Objects.equals(status, another.status)
        && Objects.equals(description, another.description)
        && Objects.equals(derivedFrom, another.derivedFrom)
        && Objects.equals(name, another.name)
        && Objects.equals(code, another.code)
        && resourceType.equals(another.resourceType)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(version, another.version)
        && Objects.equals(language, another.language)
        && Objects.equals(meta, another.meta)
        && Objects.equals(experimental, another.experimental)
        && Objects.equals(effectivePeriod, another.effectivePeriod)
        && Objects.equals(implicitRules, another.implicitRules);
  }

  /**
   * Computes a hash code from attributes: {@code useContext}, {@code title}, {@code item}, {@code approvalDate}, {@code modifierExtension}, {@code contact}, {@code purpose}, {@code url}, {@code date}, {@code extension}, {@code contained}, {@code identifier}, {@code copyright}, {@code id}, {@code text}, {@code publisher}, {@code lastReviewDate}, {@code subjectType}, {@code status}, {@code description}, {@code derivedFrom}, {@code name}, {@code code}, {@code resourceType}, {@code jurisdiction}, {@code version}, {@code language}, {@code meta}, {@code experimental}, {@code effectivePeriod}, {@code implicitRules}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(useContext);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(item);
    h += (h << 5) + Objects.hashCode(approvalDate);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(purpose);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(copyright);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(publisher);
    h += (h << 5) + Objects.hashCode(lastReviewDate);
    h += (h << 5) + Objects.hashCode(subjectType);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(derivedFrom);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(experimental);
    h += (h << 5) + Objects.hashCode(effectivePeriod);
    h += (h << 5) + Objects.hashCode(implicitRules);
    return h;
  }

  /**
   * Prints the immutable value {@code Questionnaire} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Questionnaire{");
    if (useContext != null) {
      builder.append("useContext=").append(useContext);
    }
    if (title != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (item != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("item=").append(item);
    }
    if (approvalDate != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("approvalDate=").append(approvalDate);
    }
    if (modifierExtension != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (contact != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (purpose != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (url != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (date != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (extension != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (contained != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (identifier != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (copyright != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (id != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (text != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (publisher != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (lastReviewDate != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("lastReviewDate=").append(lastReviewDate);
    }
    if (subjectType != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("subjectType=").append(subjectType);
    }
    if (status != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (description != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (derivedFrom != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("derivedFrom=").append(derivedFrom);
    }
    if (name != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (code != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (effectivePeriod != null) {
      builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Questionnaire", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Questionnaire {
    @Nullable Optional<List<UsageContext>> useContext = Optional.empty();
    boolean useContextIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<List<Questionnaire_Item>> item = Optional.empty();
    boolean itemIsSet;
    @Nullable Optional<Date> approvalDate = Optional.empty();
    boolean approvalDateIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<Markdown> purpose = Optional.empty();
    boolean purposeIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Markdown> copyright = Optional.empty();
    boolean copyrightIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<String> publisher = Optional.empty();
    boolean publisherIsSet;
    @Nullable Optional<Date> lastReviewDate = Optional.empty();
    boolean lastReviewDateIsSet;
    @Nullable Optional<List<Code>> subjectType = Optional.empty();
    boolean subjectTypeIsSet;
    @Nullable Optional<QuestionnaireStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<Canonical>> derivedFrom = Optional.empty();
    boolean derivedFromIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<Coding>> code = Optional.empty();
    boolean codeIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Boolean> experimental = Optional.empty();
    boolean experimentalIsSet;
    @Nullable Optional<Period> effectivePeriod = Optional.empty();
    boolean effectivePeriodIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @JsonProperty("useContext")
    public void setUseContext(Optional<List<UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("item")
    public void setItem(Optional<List<Questionnaire_Item>> item) {
      this.item = item;
      this.itemIsSet = true;
    }
    @JsonProperty("approvalDate")
    public void setApprovalDate(Optional<Date> approvalDate) {
      this.approvalDate = approvalDate;
      this.approvalDateIsSet = true;
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
    @JsonProperty("purpose")
    public void setPurpose(Optional<Markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
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
    @JsonProperty("copyright")
    public void setCopyright(Optional<Markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("publisher")
    public void setPublisher(Optional<String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @JsonProperty("lastReviewDate")
    public void setLastReviewDate(Optional<Date> lastReviewDate) {
      this.lastReviewDate = lastReviewDate;
      this.lastReviewDateIsSet = true;
    }
    @JsonProperty("subjectType")
    public void setSubjectType(Optional<List<Code>> subjectType) {
      this.subjectType = subjectType;
      this.subjectTypeIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<QuestionnaireStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("derivedFrom")
    public void setDerivedFrom(Optional<List<Canonical>> derivedFrom) {
      this.derivedFrom = derivedFrom;
      this.derivedFromIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<List<Coding>> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<List<CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("experimental")
    public void setExperimental(Optional<Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @JsonProperty("effectivePeriod")
    public void setEffectivePeriod(Optional<Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @Override
    public Optional<List<UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Questionnaire_Item>> item() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> approvalDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> lastReviewDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Code>> subjectType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<QuestionnaireStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> derivedFrom() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Coding>> code() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableQuestionnaire fromJson(Json json) {
    ImmutableQuestionnaire.Builder builder = ((ImmutableQuestionnaire.Builder) ImmutableQuestionnaire.builder());
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.itemIsSet) {
      builder.item(json.item);
    }
    if (json.approvalDateIsSet) {
      builder.approvalDate(json.approvalDate);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.lastReviewDateIsSet) {
      builder.lastReviewDate(json.lastReviewDate);
    }
    if (json.subjectTypeIsSet) {
      builder.subjectType(json.subjectType);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.derivedFromIsSet) {
      builder.derivedFrom(json.derivedFrom);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    return (ImmutableQuestionnaire) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Questionnaire} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Questionnaire instance
   */
  public static Questionnaire copyOf(Questionnaire instance) {
    if (instance instanceof ImmutableQuestionnaire) {
      return (ImmutableQuestionnaire) instance;
    }
    return ((ImmutableQuestionnaire.Builder) ImmutableQuestionnaire.builder())
        .useContext(instance.useContext())
        .title(instance.title())
        .item(instance.item())
        .approvalDate(instance.approvalDate())
        .modifierExtension(instance.modifierExtension())
        .contact(instance.contact())
        .purpose(instance.purpose())
        .url(instance.url())
        .date(instance.date())
        .extension(instance.extension())
        .contained(instance.contained())
        .identifier(instance.identifier())
        .copyright(instance.copyright())
        .id(instance.id())
        .text(instance.text())
        .publisher(instance.publisher())
        .lastReviewDate(instance.lastReviewDate())
        .subjectType(instance.subjectType())
        .status(instance.status())
        .description(instance.description())
        .derivedFrom(instance.derivedFrom())
        .name(instance.name())
        .code(instance.code())
        .resourceType(instance.resourceType())
        .jurisdiction(instance.jurisdiction())
        .version(instance.version())
        .language(instance.language())
        .meta(instance.meta())
        .experimental(instance.experimental())
        .effectivePeriod(instance.effectivePeriod())
        .implicitRules(instance.implicitRules())
        .build();
  }

  /**
   * Creates a builder for {@link Questionnaire Questionnaire}.
   * <pre>
   * ImmutableQuestionnaire.builder()
   *    .useContext(List&amp;lt;com.medplum.types.fhir.UsageContext&amp;gt;) // optional {@link Questionnaire#useContext() useContext}
   *    .title(String) // optional {@link Questionnaire#title() title}
   *    .item(List&amp;lt;com.medplum.types.fhir.Questionnaire_Item&amp;gt;) // optional {@link Questionnaire#item() item}
   *    .approvalDate(com.medplum.types.fhir.Date) // optional {@link Questionnaire#approvalDate() approvalDate}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Questionnaire#modifierExtension() modifierExtension}
   *    .contact(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link Questionnaire#contact() contact}
   *    .purpose(com.medplum.types.fhir.Markdown) // optional {@link Questionnaire#purpose() purpose}
   *    .url(com.medplum.types.fhir.Uri) // optional {@link Questionnaire#url() url}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link Questionnaire#date() date}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Questionnaire#extension() extension}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link Questionnaire#contained() contained}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link Questionnaire#identifier() identifier}
   *    .copyright(com.medplum.types.fhir.Markdown) // optional {@link Questionnaire#copyright() copyright}
   *    .id(com.medplum.types.fhir.Id) // optional {@link Questionnaire#id() id}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link Questionnaire#text() text}
   *    .publisher(String) // optional {@link Questionnaire#publisher() publisher}
   *    .lastReviewDate(com.medplum.types.fhir.Date) // optional {@link Questionnaire#lastReviewDate() lastReviewDate}
   *    .subjectType(List&amp;lt;com.medplum.types.fhir.Code&amp;gt;) // optional {@link Questionnaire#subjectType() subjectType}
   *    .status(com.medplum.types.fhir.QuestionnaireStatus) // optional {@link Questionnaire#status() status}
   *    .description(com.medplum.types.fhir.Markdown) // optional {@link Questionnaire#description() description}
   *    .derivedFrom(List&amp;lt;com.medplum.types.fhir.Canonical&amp;gt;) // optional {@link Questionnaire#derivedFrom() derivedFrom}
   *    .name(String) // optional {@link Questionnaire#name() name}
   *    .code(List&amp;lt;com.medplum.types.fhir.Coding&amp;gt;) // optional {@link Questionnaire#code() code}
   *    .resourceType(String) // required {@link Questionnaire#resourceType() resourceType}
   *    .jurisdiction(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Questionnaire#jurisdiction() jurisdiction}
   *    .version(String) // optional {@link Questionnaire#version() version}
   *    .language(com.medplum.types.fhir.Code) // optional {@link Questionnaire#language() language}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link Questionnaire#meta() meta}
   *    .experimental(Boolean) // optional {@link Questionnaire#experimental() experimental}
   *    .effectivePeriod(com.medplum.types.fhir.Period) // optional {@link Questionnaire#effectivePeriod() effectivePeriod}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link Questionnaire#implicitRules() implicitRules}
   *    .build();
   * </pre>
   * @return A new Questionnaire builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableQuestionnaire.Builder();
  }

  /**
   * Builds instances of type {@link Questionnaire Questionnaire}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Questionnaire", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_USE_CONTEXT = 0x1L;
    private static final long OPT_BIT_TITLE = 0x2L;
    private static final long OPT_BIT_ITEM = 0x4L;
    private static final long OPT_BIT_APPROVAL_DATE = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_CONTACT = 0x20L;
    private static final long OPT_BIT_PURPOSE = 0x40L;
    private static final long OPT_BIT_URL = 0x80L;
    private static final long OPT_BIT_DATE = 0x100L;
    private static final long OPT_BIT_EXTENSION = 0x200L;
    private static final long OPT_BIT_CONTAINED = 0x400L;
    private static final long OPT_BIT_IDENTIFIER = 0x800L;
    private static final long OPT_BIT_COPYRIGHT = 0x1000L;
    private static final long OPT_BIT_ID = 0x2000L;
    private static final long OPT_BIT_TEXT = 0x4000L;
    private static final long OPT_BIT_PUBLISHER = 0x8000L;
    private static final long OPT_BIT_LAST_REVIEW_DATE = 0x10000L;
    private static final long OPT_BIT_SUBJECT_TYPE = 0x20000L;
    private static final long OPT_BIT_STATUS = 0x40000L;
    private static final long OPT_BIT_DESCRIPTION = 0x80000L;
    private static final long OPT_BIT_DERIVED_FROM = 0x100000L;
    private static final long OPT_BIT_NAME = 0x200000L;
    private static final long OPT_BIT_CODE = 0x400000L;
    private static final long OPT_BIT_JURISDICTION = 0x800000L;
    private static final long OPT_BIT_VERSION = 0x1000000L;
    private static final long OPT_BIT_LANGUAGE = 0x2000000L;
    private static final long OPT_BIT_META = 0x4000000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x8000000L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x10000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<UsageContext> useContext;
    private @Nullable String title;
    private @Nullable List<Questionnaire_Item> item;
    private @Nullable Date approvalDate;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<ContactDetail> contact;
    private @Nullable Markdown purpose;
    private @Nullable Uri url;
    private @Nullable DateTime date;
    private @Nullable List<Extension> extension;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Identifier> identifier;
    private @Nullable Markdown copyright;
    private @Nullable Id id;
    private @Nullable Narrative text;
    private @Nullable String publisher;
    private @Nullable Date lastReviewDate;
    private @Nullable List<Code> subjectType;
    private @Nullable QuestionnaireStatus status;
    private @Nullable Markdown description;
    private @Nullable List<Canonical> derivedFrom;
    private @Nullable String name;
    private @Nullable List<Coding> code;
    private @Nullable String resourceType;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable String version;
    private @Nullable Code language;
    private @Nullable Meta meta;
    private @Nullable Boolean experimental;
    private @Nullable Period effectivePeriod;
    private @Nullable Uri implicitRules;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Questionnaire#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link Questionnaire#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link Questionnaire#title() title} to title.
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
     * Initializes the optional value {@link Questionnaire#title() title} to title.
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
     * Initializes the optional value {@link Questionnaire#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    public final Builder item(List<Questionnaire_Item> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = Objects.requireNonNull(item, "item");
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("item")
    public final Builder item(Optional<? extends List<Questionnaire_Item>> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = item.orElse(null);
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link Questionnaire#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link Questionnaire#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Questionnaire#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Questionnaire#contact() contact} to contact.
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
     * Initializes the optional value {@link Questionnaire#contact() contact} to contact.
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
     * Initializes the optional value {@link Questionnaire#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link Questionnaire#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link Questionnaire#url() url} to url.
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
     * Initializes the optional value {@link Questionnaire#url() url} to url.
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
     * Initializes the optional value {@link Questionnaire#date() date} to date.
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
     * Initializes the optional value {@link Questionnaire#date() date} to date.
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
     * Initializes the optional value {@link Questionnaire#extension() extension} to extension.
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
     * Initializes the optional value {@link Questionnaire#extension() extension} to extension.
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
     * Initializes the optional value {@link Questionnaire#contained() contained} to contained.
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
     * Initializes the optional value {@link Questionnaire#contained() contained} to contained.
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
     * Initializes the optional value {@link Questionnaire#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Questionnaire#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Questionnaire#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link Questionnaire#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link Questionnaire#id() id} to id.
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
     * Initializes the optional value {@link Questionnaire#id() id} to id.
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
     * Initializes the optional value {@link Questionnaire#text() text} to text.
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
     * Initializes the optional value {@link Questionnaire#text() text} to text.
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
     * Initializes the optional value {@link Questionnaire#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link Questionnaire#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link Questionnaire#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link Questionnaire#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link Questionnaire#subjectType() subjectType} to subjectType.
     * @param subjectType The value for subjectType
     * @return {@code this} builder for chained invocation
     */
    public final Builder subjectType(List<Code> subjectType) {
      checkNotIsSet(subjectTypeIsSet(), "subjectType");
      this.subjectType = Objects.requireNonNull(subjectType, "subjectType");
      optBits |= OPT_BIT_SUBJECT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#subjectType() subjectType} to subjectType.
     * @param subjectType The value for subjectType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subjectType")
    public final Builder subjectType(Optional<? extends List<Code>> subjectType) {
      checkNotIsSet(subjectTypeIsSet(), "subjectType");
      this.subjectType = subjectType.orElse(null);
      optBits |= OPT_BIT_SUBJECT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(QuestionnaireStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends QuestionnaireStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#description() description} to description.
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
     * Initializes the optional value {@link Questionnaire#description() description} to description.
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
     * Initializes the optional value {@link Questionnaire#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for chained invocation
     */
    public final Builder derivedFrom(List<Canonical> derivedFrom) {
      checkNotIsSet(derivedFromIsSet(), "derivedFrom");
      this.derivedFrom = Objects.requireNonNull(derivedFrom, "derivedFrom");
      optBits |= OPT_BIT_DERIVED_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("derivedFrom")
    public final Builder derivedFrom(Optional<? extends List<Canonical>> derivedFrom) {
      checkNotIsSet(derivedFromIsSet(), "derivedFrom");
      this.derivedFrom = derivedFrom.orElse(null);
      optBits |= OPT_BIT_DERIVED_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#name() name} to name.
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
     * Initializes the optional value {@link Questionnaire#name() name} to name.
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
     * Initializes the optional value {@link Questionnaire#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(List<Coding> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends List<Coding>> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the value for the {@link Questionnaire#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Questionnaire#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link Questionnaire#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link Questionnaire#version() version} to version.
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
     * Initializes the optional value {@link Questionnaire#version() version} to version.
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
     * Initializes the optional value {@link Questionnaire#language() language} to language.
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
     * Initializes the optional value {@link Questionnaire#language() language} to language.
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
     * Initializes the optional value {@link Questionnaire#meta() meta} to meta.
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
     * Initializes the optional value {@link Questionnaire#meta() meta} to meta.
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
     * Initializes the optional value {@link Questionnaire#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link Questionnaire#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link Questionnaire#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link Questionnaire#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link Questionnaire#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Questionnaire#implicitRules() implicitRules} to implicitRules.
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
     * Builds a new {@link Questionnaire Questionnaire}.
     * @return An immutable instance of Questionnaire
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Questionnaire build() {
      checkRequiredAttributes();
      return new ImmutableQuestionnaire(
          useContext,
          title,
          item,
          approvalDate,
          modifierExtension,
          contact,
          purpose,
          url,
          date,
          extension,
          contained,
          identifier,
          copyright,
          id,
          text,
          publisher,
          lastReviewDate,
          subjectType,
          status,
          description,
          derivedFrom,
          name,
          code,
          resourceType,
          jurisdiction,
          version,
          language,
          meta,
          experimental,
          effectivePeriod,
          implicitRules);
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean itemIsSet() {
      return (optBits & OPT_BIT_ITEM) != 0;
    }

    private boolean approvalDateIsSet() {
      return (optBits & OPT_BIT_APPROVAL_DATE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean lastReviewDateIsSet() {
      return (optBits & OPT_BIT_LAST_REVIEW_DATE) != 0;
    }

    private boolean subjectTypeIsSet() {
      return (optBits & OPT_BIT_SUBJECT_TYPE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean derivedFromIsSet() {
      return (optBits & OPT_BIT_DERIVED_FROM) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Questionnaire is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Questionnaire, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Questionnaire", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Questionnaire#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Questionnaire", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Questionnaire#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(List<UsageContext> useContext);

    /**
     * Initializes the optional value {@link Questionnaire#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(Optional<? extends List<UsageContext>> useContext);

    /**
     * Initializes the optional value {@link Questionnaire#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link Questionnaire#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Initializes the optional value {@link Questionnaire#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    BuildFinal item(List<Questionnaire_Item> item);

    /**
     * Initializes the optional value {@link Questionnaire#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal item(Optional<? extends List<Questionnaire_Item>> item);

    /**
     * Initializes the optional value {@link Questionnaire#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal approvalDate(Date approvalDate);

    /**
     * Initializes the optional value {@link Questionnaire#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal approvalDate(Optional<? extends Date> approvalDate);

    /**
     * Initializes the optional value {@link Questionnaire#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Questionnaire#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Questionnaire#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link Questionnaire#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Initializes the optional value {@link Questionnaire#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(Markdown purpose);

    /**
     * Initializes the optional value {@link Questionnaire#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(Optional<? extends Markdown> purpose);

    /**
     * Initializes the optional value {@link Questionnaire#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link Questionnaire#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link Questionnaire#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link Questionnaire#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link Questionnaire#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Questionnaire#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Questionnaire#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Questionnaire#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Questionnaire#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Questionnaire#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Questionnaire#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(Markdown copyright);

    /**
     * Initializes the optional value {@link Questionnaire#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(Optional<? extends Markdown> copyright);

    /**
     * Initializes the optional value {@link Questionnaire#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Questionnaire#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Questionnaire#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Questionnaire#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Questionnaire#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(String publisher);

    /**
     * Initializes the optional value {@link Questionnaire#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<String> publisher);

    /**
     * Initializes the optional value {@link Questionnaire#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastReviewDate(Date lastReviewDate);

    /**
     * Initializes the optional value {@link Questionnaire#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastReviewDate(Optional<? extends Date> lastReviewDate);

    /**
     * Initializes the optional value {@link Questionnaire#subjectType() subjectType} to subjectType.
     * @param subjectType The value for subjectType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subjectType(List<Code> subjectType);

    /**
     * Initializes the optional value {@link Questionnaire#subjectType() subjectType} to subjectType.
     * @param subjectType The value for subjectType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subjectType(Optional<? extends List<Code>> subjectType);

    /**
     * Initializes the optional value {@link Questionnaire#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(QuestionnaireStatus status);

    /**
     * Initializes the optional value {@link Questionnaire#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends QuestionnaireStatus> status);

    /**
     * Initializes the optional value {@link Questionnaire#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(Markdown description);

    /**
     * Initializes the optional value {@link Questionnaire#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<? extends Markdown> description);

    /**
     * Initializes the optional value {@link Questionnaire#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal derivedFrom(List<Canonical> derivedFrom);

    /**
     * Initializes the optional value {@link Questionnaire#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal derivedFrom(Optional<? extends List<Canonical>> derivedFrom);

    /**
     * Initializes the optional value {@link Questionnaire#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link Questionnaire#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link Questionnaire#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(List<Coding> code);

    /**
     * Initializes the optional value {@link Questionnaire#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends List<Coding>> code);

    /**
     * Initializes the optional value {@link Questionnaire#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(List<CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link Questionnaire#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link Questionnaire#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link Questionnaire#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link Questionnaire#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Questionnaire#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Questionnaire#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Questionnaire#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Questionnaire#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link Questionnaire#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(Optional<Boolean> experimental);

    /**
     * Initializes the optional value {@link Questionnaire#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(Period effectivePeriod);

    /**
     * Initializes the optional value {@link Questionnaire#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(Optional<? extends Period> effectivePeriod);

    /**
     * Initializes the optional value {@link Questionnaire#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Questionnaire#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Builds a new {@link Questionnaire Questionnaire}.
     * @return An immutable instance of Questionnaire
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Questionnaire build();
  }
}
