//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Questionnaire}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableQuestionnaire.builder()}.
 */
@org.immutables.value.Generated(from = "Questionnaire", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableQuestionnaire implements com.fhir.Questionnaire {
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.markdown purpose;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Coding> code;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> derivedFrom;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.markdown copyright;
  private final @javax.annotation.Nullable com.fhir.date approvalDate;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable java.util.List<com.fhir.code> subjectType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.QuestionnaireStatus status;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_Item> item;
  private final @javax.annotation.Nullable com.fhir.date lastReviewDate;
  private final @javax.annotation.Nullable java.lang.Boolean experimental;
  private final @javax.annotation.Nullable com.fhir.Period effectivePeriod;
  private final @javax.annotation.Nullable java.lang.String title;

  private ImmutableQuestionnaire(
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.markdown purpose,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable java.util.List<com.fhir.Coding> code,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> derivedFrom,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.markdown copyright,
      @javax.annotation.Nullable com.fhir.date approvalDate,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable java.util.List<com.fhir.code> subjectType,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.QuestionnaireStatus status,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_Item> item,
      @javax.annotation.Nullable com.fhir.date lastReviewDate,
      @javax.annotation.Nullable java.lang.Boolean experimental,
      @javax.annotation.Nullable com.fhir.Period effectivePeriod,
      @javax.annotation.Nullable java.lang.String title) {
    this.contained = contained;
    this.purpose = purpose;
    this.implicitRules = implicitRules;
    this.date = date;
    this.version = version;
    this.code = code;
    this.resourceType = resourceType;
    this.derivedFrom = derivedFrom;
    this.jurisdiction = jurisdiction;
    this.id = id;
    this.contact = contact;
    this.url = url;
    this.extension = extension;
    this.copyright = copyright;
    this.approvalDate = approvalDate;
    this.publisher = publisher;
    this.subjectType = subjectType;
    this.useContext = useContext;
    this.text = text;
    this.status = status;
    this.name = name;
    this.language = language;
    this.modifierExtension = modifierExtension;
    this.description = description;
    this.identifier = identifier;
    this.meta = meta;
    this.item = item;
    this.lastReviewDate = lastReviewDate;
    this.experimental = experimental;
    this.effectivePeriod = effectivePeriod;
    this.title = title;
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code purpose} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("purpose")
  @Override
  public java.util.Optional<com.fhir.markdown> purpose() {
    return java.util.Optional.ofNullable(purpose);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.dateTime> date() {
    return java.util.Optional.ofNullable(date);
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("version")
  @Override
  public java.util.Optional<java.lang.String> version() {
    return java.util.Optional.ofNullable(version);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Coding>> code() {
    return java.util.Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code derivedFrom} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("derivedFrom")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> derivedFrom() {
    return java.util.Optional.ofNullable(derivedFrom);
  }

  /**
   * @return The value of the {@code jurisdiction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() {
    return java.util.Optional.ofNullable(jurisdiction);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code contact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contact")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() {
    return java.util.Optional.ofNullable(contact);
  }

  /**
   * @return The value of the {@code url} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @Override
  public java.util.Optional<com.fhir.uri> url() {
    return java.util.Optional.ofNullable(url);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code copyright} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("copyright")
  @Override
  public java.util.Optional<com.fhir.markdown> copyright() {
    return java.util.Optional.ofNullable(copyright);
  }

  /**
   * @return The value of the {@code approvalDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("approvalDate")
  @Override
  public java.util.Optional<com.fhir.date> approvalDate() {
    return java.util.Optional.ofNullable(approvalDate);
  }

  /**
   * @return The value of the {@code publisher} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("publisher")
  @Override
  public java.util.Optional<java.lang.String> publisher() {
    return java.util.Optional.ofNullable(publisher);
  }

  /**
   * @return The value of the {@code subjectType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subjectType")
  @Override
  public java.util.Optional<java.util.List<com.fhir.code>> subjectType() {
    return java.util.Optional.ofNullable(subjectType);
  }

  /**
   * @return The value of the {@code useContext} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("useContext")
  @Override
  public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() {
    return java.util.Optional.ofNullable(useContext);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.QuestionnaireStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<com.fhir.markdown> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code item} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("item")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Questionnaire_Item>> item() {
    return java.util.Optional.ofNullable(item);
  }

  /**
   * @return The value of the {@code lastReviewDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("lastReviewDate")
  @Override
  public java.util.Optional<com.fhir.date> lastReviewDate() {
    return java.util.Optional.ofNullable(lastReviewDate);
  }

  /**
   * @return The value of the {@code experimental} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("experimental")
  @Override
  public java.util.Optional<java.lang.Boolean> experimental() {
    return java.util.Optional.ofNullable(experimental);
  }

  /**
   * @return The value of the {@code effectivePeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
  @Override
  public java.util.Optional<com.fhir.Period> effectivePeriod() {
    return java.util.Optional.ofNullable(effectivePeriod);
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  @Override
  public java.util.Optional<java.lang.String> title() {
    return java.util.Optional.ofNullable(title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableQuestionnaire(
        newValue,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableQuestionnaire(
        value,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withPurpose(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        newValue,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withPurpose(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        value,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        newValue,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        value,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        newValue,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        value,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        newValue,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        value,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withCode(java.util.List<com.fhir.Coding> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Coding> newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        newValue,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withCode(java.util.Optional<? extends java.util.List<com.fhir.Coding>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Coding> value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        value,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Questionnaire#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableQuestionnaire withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        newValue,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#derivedFrom() derivedFrom} attribute.
   * @param value The value for derivedFrom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withDerivedFrom(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "derivedFrom");
    if (this.derivedFrom == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        newValue,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#derivedFrom() derivedFrom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for derivedFrom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withDerivedFrom(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.derivedFrom == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        value,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        newValue,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        value,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        newValue,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        value,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        newValue,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        value,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        newValue,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        value,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        newValue,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        value,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withCopyright(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        newValue,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withCopyright(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        value,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#approvalDate() approvalDate} attribute.
   * @param value The value for approvalDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withApprovalDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "approvalDate");
    if (this.approvalDate == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        newValue,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#approvalDate() approvalDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for approvalDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withApprovalDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.approvalDate == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        value,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        newValue,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        value,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#subjectType() subjectType} attribute.
   * @param value The value for subjectType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withSubjectType(java.util.List<com.fhir.code> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> newValue = java.util.Objects.requireNonNull(value, "subjectType");
    if (this.subjectType == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        newValue,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#subjectType() subjectType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withSubjectType(java.util.Optional<? extends java.util.List<com.fhir.code>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> value = optional.orElse(null);
    if (this.subjectType == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        value,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        newValue,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        value,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        newValue,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        value,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withStatus(com.fhir.QuestionnaireStatus value) {
    @javax.annotation.Nullable com.fhir.QuestionnaireStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        newValue,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withStatus(java.util.Optional<? extends com.fhir.QuestionnaireStatus> optional) {
    @javax.annotation.Nullable com.fhir.QuestionnaireStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        value,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        newValue,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        value,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        newValue,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        value,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        newValue,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        value,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        newValue,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        value,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        newValue,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        value,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        newValue,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        value,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#item() item} attribute.
   * @param value The value for item
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withItem(java.util.List<com.fhir.Questionnaire_Item> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_Item> newValue = java.util.Objects.requireNonNull(value, "item");
    if (this.item == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        newValue,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#item() item} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for item
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withItem(java.util.Optional<? extends java.util.List<com.fhir.Questionnaire_Item>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_Item> value = optional.orElse(null);
    if (this.item == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        value,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#lastReviewDate() lastReviewDate} attribute.
   * @param value The value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withLastReviewDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "lastReviewDate");
    if (this.lastReviewDate == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        newValue,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#lastReviewDate() lastReviewDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withLastReviewDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.lastReviewDate == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        value,
        this.experimental,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withExperimental(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        newValue,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withExperimental(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.experimental, value)) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        value,
        this.effectivePeriod,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withEffectivePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        newValue,
        this.title);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableQuestionnaire withEffectivePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        value,
        this.title);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Questionnaire#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Questionnaire#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableQuestionnaire withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableQuestionnaire(
        this.contained,
        this.purpose,
        this.implicitRules,
        this.date,
        this.version,
        this.code,
        this.resourceType,
        this.derivedFrom,
        this.jurisdiction,
        this.id,
        this.contact,
        this.url,
        this.extension,
        this.copyright,
        this.approvalDate,
        this.publisher,
        this.subjectType,
        this.useContext,
        this.text,
        this.status,
        this.name,
        this.language,
        this.modifierExtension,
        this.description,
        this.identifier,
        this.meta,
        this.item,
        this.lastReviewDate,
        this.experimental,
        this.effectivePeriod,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableQuestionnaire} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableQuestionnaire
        && equalTo((ImmutableQuestionnaire) another);
  }

  private boolean equalTo(ImmutableQuestionnaire another) {
    return java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(purpose, another.purpose)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(code, another.code)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(derivedFrom, another.derivedFrom)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(copyright, another.copyright)
        && java.util.Objects.equals(approvalDate, another.approvalDate)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(subjectType, another.subjectType)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(item, another.item)
        && java.util.Objects.equals(lastReviewDate, another.lastReviewDate)
        && java.util.Objects.equals(experimental, another.experimental)
        && java.util.Objects.equals(effectivePeriod, another.effectivePeriod)
        && java.util.Objects.equals(title, another.title);
  }

  /**
   * Computes a hash code from attributes: {@code contained}, {@code purpose}, {@code implicitRules}, {@code date}, {@code version}, {@code code}, {@code resourceType}, {@code derivedFrom}, {@code jurisdiction}, {@code id}, {@code contact}, {@code url}, {@code extension}, {@code copyright}, {@code approvalDate}, {@code publisher}, {@code subjectType}, {@code useContext}, {@code text}, {@code status}, {@code name}, {@code language}, {@code modifierExtension}, {@code description}, {@code identifier}, {@code meta}, {@code item}, {@code lastReviewDate}, {@code experimental}, {@code effectivePeriod}, {@code title}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(purpose);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(derivedFrom);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(copyright);
    h += (h << 5) + java.util.Objects.hashCode(approvalDate);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(subjectType);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(item);
    h += (h << 5) + java.util.Objects.hashCode(lastReviewDate);
    h += (h << 5) + java.util.Objects.hashCode(experimental);
    h += (h << 5) + java.util.Objects.hashCode(effectivePeriod);
    h += (h << 5) + java.util.Objects.hashCode(title);
    return h;
  }

  /**
   * Prints the immutable value {@code Questionnaire} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Questionnaire{");
    if (contained != null) {
      builder.append("contained=").append(contained);
    }
    if (purpose != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (implicitRules != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (date != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (version != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (code != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (derivedFrom != null) {
      builder.append(", ");
      builder.append("derivedFrom=").append(derivedFrom);
    }
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (approvalDate != null) {
      builder.append(", ");
      builder.append("approvalDate=").append(approvalDate);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (subjectType != null) {
      builder.append(", ");
      builder.append("subjectType=").append(subjectType);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (item != null) {
      builder.append(", ");
      builder.append("item=").append(item);
    }
    if (lastReviewDate != null) {
      builder.append(", ");
      builder.append("lastReviewDate=").append(lastReviewDate);
    }
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (effectivePeriod != null) {
      builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
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
  @org.immutables.value.Generated(from = "Questionnaire", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Questionnaire {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> purpose = java.util.Optional.empty();
    boolean purposeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Coding>> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> derivedFrom = java.util.Optional.empty();
    boolean derivedFromIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> copyright = java.util.Optional.empty();
    boolean copyrightIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> approvalDate = java.util.Optional.empty();
    boolean approvalDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.code>> subjectType = java.util.Optional.empty();
    boolean subjectTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.QuestionnaireStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Questionnaire_Item>> item = java.util.Optional.empty();
    boolean itemIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> lastReviewDate = java.util.Optional.empty();
    boolean lastReviewDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> experimental = java.util.Optional.empty();
    boolean experimentalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> effectivePeriod = java.util.Optional.empty();
    boolean effectivePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    public void setPurpose(java.util.Optional<com.fhir.markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<java.util.List<com.fhir.Coding>> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("derivedFrom")
    public void setDerivedFrom(java.util.Optional<java.util.List<com.fhir.canonical>> derivedFrom) {
      this.derivedFrom = derivedFrom;
      this.derivedFromIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("copyright")
    public void setCopyright(java.util.Optional<com.fhir.markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("approvalDate")
    public void setApprovalDate(java.util.Optional<com.fhir.date> approvalDate) {
      this.approvalDate = approvalDate;
      this.approvalDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public void setPublisher(java.util.Optional<java.lang.String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subjectType")
    public void setSubjectType(java.util.Optional<java.util.List<com.fhir.code>> subjectType) {
      this.subjectType = subjectType;
      this.subjectTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public void setUseContext(java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.QuestionnaireStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("item")
    public void setItem(java.util.Optional<java.util.List<com.fhir.Questionnaire_Item>> item) {
      this.item = item;
      this.itemIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lastReviewDate")
    public void setLastReviewDate(java.util.Optional<com.fhir.date> lastReviewDate) {
      this.lastReviewDate = lastReviewDate;
      this.lastReviewDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("experimental")
    public void setExperimental(java.util.Optional<java.lang.Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
    public void setEffectivePeriod(java.util.Optional<com.fhir.Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Coding>> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> derivedFrom() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> approvalDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.code>> subjectType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.QuestionnaireStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Questionnaire_Item>> item() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> lastReviewDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableQuestionnaire fromJson(Json json) {
    ImmutableQuestionnaire.Builder builder = ((ImmutableQuestionnaire.Builder) ImmutableQuestionnaire.builder());
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.derivedFromIsSet) {
      builder.derivedFrom(json.derivedFrom);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.approvalDateIsSet) {
      builder.approvalDate(json.approvalDate);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.subjectTypeIsSet) {
      builder.subjectType(json.subjectType);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.itemIsSet) {
      builder.item(json.item);
    }
    if (json.lastReviewDateIsSet) {
      builder.lastReviewDate(json.lastReviewDate);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
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
        .contained(instance.contained())
        .purpose(instance.purpose())
        .implicitRules(instance.implicitRules())
        .date(instance.date())
        .version(instance.version())
        .code(instance.code())
        .resourceType(instance.resourceType())
        .derivedFrom(instance.derivedFrom())
        .jurisdiction(instance.jurisdiction())
        .id(instance.id())
        .contact(instance.contact())
        .url(instance.url())
        .extension(instance.extension())
        .copyright(instance.copyright())
        .approvalDate(instance.approvalDate())
        .publisher(instance.publisher())
        .subjectType(instance.subjectType())
        .useContext(instance.useContext())
        .text(instance.text())
        .status(instance.status())
        .name(instance.name())
        .language(instance.language())
        .modifierExtension(instance.modifierExtension())
        .description(instance.description())
        .identifier(instance.identifier())
        .meta(instance.meta())
        .item(instance.item())
        .lastReviewDate(instance.lastReviewDate())
        .experimental(instance.experimental())
        .effectivePeriod(instance.effectivePeriod())
        .title(instance.title())
        .build();
  }

  /**
   * Creates a builder for {@link Questionnaire Questionnaire}.
   * <pre>
   * ImmutableQuestionnaire.builder()
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Questionnaire#contained() contained}
   *    .purpose(com.fhir.markdown) // optional {@link Questionnaire#purpose() purpose}
   *    .implicitRules(com.fhir.uri) // optional {@link Questionnaire#implicitRules() implicitRules}
   *    .date(com.fhir.dateTime) // optional {@link Questionnaire#date() date}
   *    .version(String) // optional {@link Questionnaire#version() version}
   *    .code(List&amp;lt;com.fhir.Coding&amp;gt;) // optional {@link Questionnaire#code() code}
   *    .resourceType(String) // required {@link Questionnaire#resourceType() resourceType}
   *    .derivedFrom(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link Questionnaire#derivedFrom() derivedFrom}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Questionnaire#jurisdiction() jurisdiction}
   *    .id(com.fhir.id) // optional {@link Questionnaire#id() id}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link Questionnaire#contact() contact}
   *    .url(com.fhir.uri) // optional {@link Questionnaire#url() url}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Questionnaire#extension() extension}
   *    .copyright(com.fhir.markdown) // optional {@link Questionnaire#copyright() copyright}
   *    .approvalDate(com.fhir.date) // optional {@link Questionnaire#approvalDate() approvalDate}
   *    .publisher(String) // optional {@link Questionnaire#publisher() publisher}
   *    .subjectType(List&amp;lt;com.fhir.code&amp;gt;) // optional {@link Questionnaire#subjectType() subjectType}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link Questionnaire#useContext() useContext}
   *    .text(com.fhir.Narrative) // optional {@link Questionnaire#text() text}
   *    .status(com.fhir.QuestionnaireStatus) // optional {@link Questionnaire#status() status}
   *    .name(String) // optional {@link Questionnaire#name() name}
   *    .language(com.fhir.code) // optional {@link Questionnaire#language() language}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Questionnaire#modifierExtension() modifierExtension}
   *    .description(com.fhir.markdown) // optional {@link Questionnaire#description() description}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Questionnaire#identifier() identifier}
   *    .meta(com.fhir.Meta) // optional {@link Questionnaire#meta() meta}
   *    .item(List&amp;lt;com.fhir.Questionnaire_Item&amp;gt;) // optional {@link Questionnaire#item() item}
   *    .lastReviewDate(com.fhir.date) // optional {@link Questionnaire#lastReviewDate() lastReviewDate}
   *    .experimental(Boolean) // optional {@link Questionnaire#experimental() experimental}
   *    .effectivePeriod(com.fhir.Period) // optional {@link Questionnaire#effectivePeriod() effectivePeriod}
   *    .title(String) // optional {@link Questionnaire#title() title}
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
  @org.immutables.value.Generated(from = "Questionnaire", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x1L;
    private static final long OPT_BIT_PURPOSE = 0x2L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4L;
    private static final long OPT_BIT_DATE = 0x8L;
    private static final long OPT_BIT_VERSION = 0x10L;
    private static final long OPT_BIT_CODE = 0x20L;
    private static final long OPT_BIT_DERIVED_FROM = 0x40L;
    private static final long OPT_BIT_JURISDICTION = 0x80L;
    private static final long OPT_BIT_ID = 0x100L;
    private static final long OPT_BIT_CONTACT = 0x200L;
    private static final long OPT_BIT_URL = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_COPYRIGHT = 0x1000L;
    private static final long OPT_BIT_APPROVAL_DATE = 0x2000L;
    private static final long OPT_BIT_PUBLISHER = 0x4000L;
    private static final long OPT_BIT_SUBJECT_TYPE = 0x8000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x10000L;
    private static final long OPT_BIT_TEXT = 0x20000L;
    private static final long OPT_BIT_STATUS = 0x40000L;
    private static final long OPT_BIT_NAME = 0x80000L;
    private static final long OPT_BIT_LANGUAGE = 0x100000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200000L;
    private static final long OPT_BIT_DESCRIPTION = 0x400000L;
    private static final long OPT_BIT_IDENTIFIER = 0x800000L;
    private static final long OPT_BIT_META = 0x1000000L;
    private static final long OPT_BIT_ITEM = 0x2000000L;
    private static final long OPT_BIT_LAST_REVIEW_DATE = 0x4000000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x8000000L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x10000000L;
    private static final long OPT_BIT_TITLE = 0x20000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.markdown purpose;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable java.util.List<com.fhir.Coding> code;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> derivedFrom;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.markdown copyright;
    private @javax.annotation.Nullable com.fhir.date approvalDate;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable java.util.List<com.fhir.code> subjectType;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.QuestionnaireStatus status;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Questionnaire_Item> item;
    private @javax.annotation.Nullable com.fhir.date lastReviewDate;
    private @javax.annotation.Nullable java.lang.Boolean experimental;
    private @javax.annotation.Nullable com.fhir.Period effectivePeriod;
    private @javax.annotation.Nullable java.lang.String title;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Questionnaire#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(java.util.List<com.fhir.ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = java.util.Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public final Builder contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    public final Builder purpose(com.fhir.markdown purpose) {
      checkNotIsSet(purposeIsSet(), "purpose");
      this.purpose = java.util.Objects.requireNonNull(purpose, "purpose");
      optBits |= OPT_BIT_PURPOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    public final Builder purpose(java.util.Optional<? extends com.fhir.markdown> purpose) {
      checkNotIsSet(purposeIsSet(), "purpose");
      this.purpose = purpose.orElse(null);
      optBits |= OPT_BIT_PURPOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(com.fhir.uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = java.util.Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public final Builder implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(com.fhir.dateTime date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = java.util.Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public final Builder date(java.util.Optional<? extends com.fhir.dateTime> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(java.lang.String version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = java.util.Objects.requireNonNull(version, "version");
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public final Builder version(java.util.Optional<java.lang.String> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = version.orElse(null);
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(java.util.List<com.fhir.Coding> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends java.util.List<com.fhir.Coding>> code) {
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
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public final Builder resourceType(java.lang.String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for chained invocation
     */
    public final Builder derivedFrom(java.util.List<com.fhir.canonical> derivedFrom) {
      checkNotIsSet(derivedFromIsSet(), "derivedFrom");
      this.derivedFrom = java.util.Objects.requireNonNull(derivedFrom, "derivedFrom");
      optBits |= OPT_BIT_DERIVED_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("derivedFrom")
    public final Builder derivedFrom(java.util.Optional<? extends java.util.List<com.fhir.canonical>> derivedFrom) {
      checkNotIsSet(derivedFromIsSet(), "derivedFrom");
      this.derivedFrom = derivedFrom.orElse(null);
      optBits |= OPT_BIT_DERIVED_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    public final Builder jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = java.util.Objects.requireNonNull(jurisdiction, "jurisdiction");
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public final Builder jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = jurisdiction.orElse(null);
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(com.fhir.id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<? extends com.fhir.id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    public final Builder contact(java.util.List<com.fhir.ContactDetail> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = java.util.Objects.requireNonNull(contact, "contact");
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public final Builder contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = contact.orElse(null);
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    public final Builder url(com.fhir.uri url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = java.util.Objects.requireNonNull(url, "url");
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public final Builder url(java.util.Optional<? extends com.fhir.uri> url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = url.orElse(null);
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    public final Builder copyright(com.fhir.markdown copyright) {
      checkNotIsSet(copyrightIsSet(), "copyright");
      this.copyright = java.util.Objects.requireNonNull(copyright, "copyright");
      optBits |= OPT_BIT_COPYRIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("copyright")
    public final Builder copyright(java.util.Optional<? extends com.fhir.markdown> copyright) {
      checkNotIsSet(copyrightIsSet(), "copyright");
      this.copyright = copyright.orElse(null);
      optBits |= OPT_BIT_COPYRIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder approvalDate(com.fhir.date approvalDate) {
      checkNotIsSet(approvalDateIsSet(), "approvalDate");
      this.approvalDate = java.util.Objects.requireNonNull(approvalDate, "approvalDate");
      optBits |= OPT_BIT_APPROVAL_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("approvalDate")
    public final Builder approvalDate(java.util.Optional<? extends com.fhir.date> approvalDate) {
      checkNotIsSet(approvalDateIsSet(), "approvalDate");
      this.approvalDate = approvalDate.orElse(null);
      optBits |= OPT_BIT_APPROVAL_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    public final Builder publisher(java.lang.String publisher) {
      checkNotIsSet(publisherIsSet(), "publisher");
      this.publisher = java.util.Objects.requireNonNull(publisher, "publisher");
      optBits |= OPT_BIT_PUBLISHER;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public final Builder publisher(java.util.Optional<java.lang.String> publisher) {
      checkNotIsSet(publisherIsSet(), "publisher");
      this.publisher = publisher.orElse(null);
      optBits |= OPT_BIT_PUBLISHER;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#subjectType() subjectType} to subjectType.
     * @param subjectType The value for subjectType
     * @return {@code this} builder for chained invocation
     */
    public final Builder subjectType(java.util.List<com.fhir.code> subjectType) {
      checkNotIsSet(subjectTypeIsSet(), "subjectType");
      this.subjectType = java.util.Objects.requireNonNull(subjectType, "subjectType");
      optBits |= OPT_BIT_SUBJECT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#subjectType() subjectType} to subjectType.
     * @param subjectType The value for subjectType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subjectType")
    public final Builder subjectType(java.util.Optional<? extends java.util.List<com.fhir.code>> subjectType) {
      checkNotIsSet(subjectTypeIsSet(), "subjectType");
      this.subjectType = subjectType.orElse(null);
      optBits |= OPT_BIT_SUBJECT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    public final Builder useContext(java.util.List<com.fhir.UsageContext> useContext) {
      checkNotIsSet(useContextIsSet(), "useContext");
      this.useContext = java.util.Objects.requireNonNull(useContext, "useContext");
      optBits |= OPT_BIT_USE_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public final Builder useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext) {
      checkNotIsSet(useContextIsSet(), "useContext");
      this.useContext = useContext.orElse(null);
      optBits |= OPT_BIT_USE_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(com.fhir.Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = java.util.Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public final Builder text(java.util.Optional<? extends com.fhir.Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.QuestionnaireStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.QuestionnaireStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(java.lang.String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = java.util.Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public final Builder name(java.util.Optional<java.lang.String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(com.fhir.code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = java.util.Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public final Builder language(java.util.Optional<? extends com.fhir.code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(com.fhir.markdown description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<? extends com.fhir.markdown> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(java.util.List<com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(com.fhir.Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = java.util.Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public final Builder meta(java.util.Optional<? extends com.fhir.Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    public final Builder item(java.util.List<com.fhir.Questionnaire_Item> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = java.util.Objects.requireNonNull(item, "item");
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("item")
    public final Builder item(java.util.Optional<? extends java.util.List<com.fhir.Questionnaire_Item>> item) {
      checkNotIsSet(itemIsSet(), "item");
      this.item = item.orElse(null);
      optBits |= OPT_BIT_ITEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder lastReviewDate(com.fhir.date lastReviewDate) {
      checkNotIsSet(lastReviewDateIsSet(), "lastReviewDate");
      this.lastReviewDate = java.util.Objects.requireNonNull(lastReviewDate, "lastReviewDate");
      optBits |= OPT_BIT_LAST_REVIEW_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastReviewDate")
    public final Builder lastReviewDate(java.util.Optional<? extends com.fhir.date> lastReviewDate) {
      checkNotIsSet(lastReviewDateIsSet(), "lastReviewDate");
      this.lastReviewDate = lastReviewDate.orElse(null);
      optBits |= OPT_BIT_LAST_REVIEW_DATE;
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
    @com.fasterxml.jackson.annotation.JsonProperty("experimental")
    public final Builder experimental(java.util.Optional<java.lang.Boolean> experimental) {
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
    public final Builder effectivePeriod(com.fhir.Period effectivePeriod) {
      checkNotIsSet(effectivePeriodIsSet(), "effectivePeriod");
      this.effectivePeriod = java.util.Objects.requireNonNull(effectivePeriod, "effectivePeriod");
      optBits |= OPT_BIT_EFFECTIVE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
    public final Builder effectivePeriod(java.util.Optional<? extends com.fhir.Period> effectivePeriod) {
      checkNotIsSet(effectivePeriodIsSet(), "effectivePeriod");
      this.effectivePeriod = effectivePeriod.orElse(null);
      optBits |= OPT_BIT_EFFECTIVE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    public final Builder title(java.lang.String title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = java.util.Objects.requireNonNull(title, "title");
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Questionnaire#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public final Builder title(java.util.Optional<java.lang.String> title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = title.orElse(null);
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Builds a new {@link Questionnaire Questionnaire}.
     * @return An immutable instance of Questionnaire
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Questionnaire build() {
      checkRequiredAttributes();
      return new ImmutableQuestionnaire(
          contained,
          purpose,
          implicitRules,
          date,
          version,
          code,
          resourceType,
          derivedFrom,
          jurisdiction,
          id,
          contact,
          url,
          extension,
          copyright,
          approvalDate,
          publisher,
          subjectType,
          useContext,
          text,
          status,
          name,
          language,
          modifierExtension,
          description,
          identifier,
          meta,
          item,
          lastReviewDate,
          experimental,
          effectivePeriod,
          title);
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean derivedFromIsSet() {
      return (optBits & OPT_BIT_DERIVED_FROM) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean approvalDateIsSet() {
      return (optBits & OPT_BIT_APPROVAL_DATE) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean subjectTypeIsSet() {
      return (optBits & OPT_BIT_SUBJECT_TYPE) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
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

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean itemIsSet() {
      return (optBits & OPT_BIT_ITEM) != 0;
    }

    private boolean lastReviewDateIsSet() {
      return (optBits & OPT_BIT_LAST_REVIEW_DATE) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Questionnaire is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Questionnaire, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Questionnaire", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Questionnaire#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Questionnaire", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Questionnaire#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Questionnaire#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Questionnaire#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(com.fhir.markdown purpose);

    /**
     * Initializes the optional value {@link Questionnaire#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(java.util.Optional<? extends com.fhir.markdown> purpose);

    /**
     * Initializes the optional value {@link Questionnaire#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Questionnaire#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Questionnaire#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link Questionnaire#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link Questionnaire#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link Questionnaire#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link Questionnaire#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(java.util.List<com.fhir.Coding> code);

    /**
     * Initializes the optional value {@link Questionnaire#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(java.util.Optional<? extends java.util.List<com.fhir.Coding>> code);

    /**
     * Initializes the optional value {@link Questionnaire#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal derivedFrom(java.util.List<com.fhir.canonical> derivedFrom);

    /**
     * Initializes the optional value {@link Questionnaire#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal derivedFrom(java.util.Optional<? extends java.util.List<com.fhir.canonical>> derivedFrom);

    /**
     * Initializes the optional value {@link Questionnaire#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link Questionnaire#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link Questionnaire#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Questionnaire#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Questionnaire#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link Questionnaire#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link Questionnaire#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link Questionnaire#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link Questionnaire#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Questionnaire#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Questionnaire#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(com.fhir.markdown copyright);

    /**
     * Initializes the optional value {@link Questionnaire#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(java.util.Optional<? extends com.fhir.markdown> copyright);

    /**
     * Initializes the optional value {@link Questionnaire#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal approvalDate(com.fhir.date approvalDate);

    /**
     * Initializes the optional value {@link Questionnaire#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal approvalDate(java.util.Optional<? extends com.fhir.date> approvalDate);

    /**
     * Initializes the optional value {@link Questionnaire#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link Questionnaire#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link Questionnaire#subjectType() subjectType} to subjectType.
     * @param subjectType The value for subjectType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subjectType(java.util.List<com.fhir.code> subjectType);

    /**
     * Initializes the optional value {@link Questionnaire#subjectType() subjectType} to subjectType.
     * @param subjectType The value for subjectType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subjectType(java.util.Optional<? extends java.util.List<com.fhir.code>> subjectType);

    /**
     * Initializes the optional value {@link Questionnaire#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link Questionnaire#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link Questionnaire#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Questionnaire#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Questionnaire#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.QuestionnaireStatus status);

    /**
     * Initializes the optional value {@link Questionnaire#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.QuestionnaireStatus> status);

    /**
     * Initializes the optional value {@link Questionnaire#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link Questionnaire#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link Questionnaire#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Questionnaire#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Questionnaire#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Questionnaire#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Questionnaire#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link Questionnaire#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link Questionnaire#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Questionnaire#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Questionnaire#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Questionnaire#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Questionnaire#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for chained invocation
     */
    BuildFinal item(java.util.List<com.fhir.Questionnaire_Item> item);

    /**
     * Initializes the optional value {@link Questionnaire#item() item} to item.
     * @param item The value for item
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal item(java.util.Optional<? extends java.util.List<com.fhir.Questionnaire_Item>> item);

    /**
     * Initializes the optional value {@link Questionnaire#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastReviewDate(com.fhir.date lastReviewDate);

    /**
     * Initializes the optional value {@link Questionnaire#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastReviewDate(java.util.Optional<? extends com.fhir.date> lastReviewDate);

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
    BuildFinal experimental(java.util.Optional<java.lang.Boolean> experimental);

    /**
     * Initializes the optional value {@link Questionnaire#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(com.fhir.Period effectivePeriod);

    /**
     * Initializes the optional value {@link Questionnaire#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(java.util.Optional<? extends com.fhir.Period> effectivePeriod);

    /**
     * Initializes the optional value {@link Questionnaire#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link Questionnaire#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Builds a new {@link Questionnaire Questionnaire}.
     * @return An immutable instance of Questionnaire
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Questionnaire build();
  }
}
