//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ChargeItemDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableChargeItemDefinition.builder()}.
 */
@org.immutables.value.Generated(from = "ChargeItemDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableChargeItemDefinition implements com.fhir.ChargeItemDefinition {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> replaces;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ChargeItemDefinition_PropertyGroup> propertyGroup;
  private final @javax.annotation.Nullable com.fhir.markdown copyright;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.date approvalDate;
  private final @javax.annotation.Nullable com.fhir.date lastReviewDate;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.Period effectivePeriod;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> partOf;
  private final @javax.annotation.Nullable java.lang.Boolean experimental;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> instance;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable java.util.List<com.fhir.uri> derivedFromUri;
  private final @javax.annotation.Nullable com.fhir.ChargeitemdefinitionStatus status;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ChargeItemDefinition_Applicability> applicability;

  private ImmutableChargeItemDefinition(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> replaces,
      @javax.annotation.Nullable java.util.List<com.fhir.ChargeItemDefinition_PropertyGroup> propertyGroup,
      @javax.annotation.Nullable com.fhir.markdown copyright,
      @javax.annotation.Nullable com.fhir.CodeableConcept code,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.date approvalDate,
      @javax.annotation.Nullable com.fhir.date lastReviewDate,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.Period effectivePeriod,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> partOf,
      @javax.annotation.Nullable java.lang.Boolean experimental,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> instance,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable java.util.List<com.fhir.uri> derivedFromUri,
      @javax.annotation.Nullable com.fhir.ChargeitemdefinitionStatus status,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable java.util.List<com.fhir.ChargeItemDefinition_Applicability> applicability) {
    this.modifierExtension = modifierExtension;
    this.resourceType = resourceType;
    this.jurisdiction = jurisdiction;
    this.date = date;
    this.url = url;
    this.replaces = replaces;
    this.propertyGroup = propertyGroup;
    this.copyright = copyright;
    this.code = code;
    this.publisher = publisher;
    this.identifier = identifier;
    this.approvalDate = approvalDate;
    this.lastReviewDate = lastReviewDate;
    this.contained = contained;
    this.extension = extension;
    this.meta = meta;
    this.effectivePeriod = effectivePeriod;
    this.version = version;
    this.title = title;
    this.contact = contact;
    this.id = id;
    this.partOf = partOf;
    this.experimental = experimental;
    this.text = text;
    this.instance = instance;
    this.implicitRules = implicitRules;
    this.language = language;
    this.useContext = useContext;
    this.derivedFromUri = derivedFromUri;
    this.status = status;
    this.description = description;
    this.applicability = applicability;
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
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
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.dateTime> date() {
    return java.util.Optional.ofNullable(date);
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
   * @return The value of the {@code replaces} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("replaces")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> replaces() {
    return java.util.Optional.ofNullable(replaces);
  }

  /**
   * @return The value of the {@code propertyGroup} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("propertyGroup")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ChargeItemDefinition_PropertyGroup>> propertyGroup() {
    return java.util.Optional.ofNullable(propertyGroup);
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
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> code() {
    return java.util.Optional.ofNullable(code);
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
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
   * @return The value of the {@code lastReviewDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("lastReviewDate")
  @Override
  public java.util.Optional<com.fhir.date> lastReviewDate() {
    return java.util.Optional.ofNullable(lastReviewDate);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * @return The value of the {@code effectivePeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
  @Override
  public java.util.Optional<com.fhir.Period> effectivePeriod() {
    return java.util.Optional.ofNullable(effectivePeriod);
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
   * @return The value of the {@code title} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  @Override
  public java.util.Optional<java.lang.String> title() {
    return java.util.Optional.ofNullable(title);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code partOf} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("partOf")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> partOf() {
    return java.util.Optional.ofNullable(partOf);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code instance} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instance")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> instance() {
    return java.util.Optional.ofNullable(instance);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
   * @return The value of the {@code derivedFromUri} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("derivedFromUri")
  @Override
  public java.util.Optional<java.util.List<com.fhir.uri>> derivedFromUri() {
    return java.util.Optional.ofNullable(derivedFromUri);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.ChargeitemdefinitionStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code applicability} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("applicability")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ChargeItemDefinition_Applicability>> applicability() {
    return java.util.Optional.ofNullable(applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableChargeItemDefinition(
        newValue,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableChargeItemDefinition(
        value,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ChargeItemDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableChargeItemDefinition withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        newValue,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        newValue,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        value,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        newValue,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        value,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        newValue,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        value,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#replaces() replaces} attribute.
   * @param value The value for replaces
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withReplaces(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "replaces");
    if (this.replaces == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        newValue,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#replaces() replaces} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for replaces
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withReplaces(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.replaces == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        value,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#propertyGroup() propertyGroup} attribute.
   * @param value The value for propertyGroup
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withPropertyGroup(java.util.List<com.fhir.ChargeItemDefinition_PropertyGroup> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ChargeItemDefinition_PropertyGroup> newValue = java.util.Objects.requireNonNull(value, "propertyGroup");
    if (this.propertyGroup == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        newValue,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#propertyGroup() propertyGroup} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for propertyGroup
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withPropertyGroup(java.util.Optional<? extends java.util.List<com.fhir.ChargeItemDefinition_PropertyGroup>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ChargeItemDefinition_PropertyGroup> value = optional.orElse(null);
    if (this.propertyGroup == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        value,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withCopyright(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        newValue,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withCopyright(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        value,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        newValue,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        value,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        newValue,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        value,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        newValue,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        value,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#approvalDate() approvalDate} attribute.
   * @param value The value for approvalDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withApprovalDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "approvalDate");
    if (this.approvalDate == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        newValue,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#approvalDate() approvalDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for approvalDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withApprovalDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.approvalDate == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        value,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#lastReviewDate() lastReviewDate} attribute.
   * @param value The value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withLastReviewDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "lastReviewDate");
    if (this.lastReviewDate == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        newValue,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#lastReviewDate() lastReviewDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withLastReviewDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.lastReviewDate == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        value,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        newValue,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        value,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        newValue,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        value,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        newValue,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        value,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withEffectivePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        newValue,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withEffectivePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        value,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        newValue,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        value,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        newValue,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        value,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        newValue,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        value,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        newValue,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        value,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withPartOf(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        newValue,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withPartOf(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        value,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withExperimental(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        newValue,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withExperimental(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.experimental, value)) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        value,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        newValue,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        value,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#instance() instance} attribute.
   * @param value The value for instance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withInstance(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "instance");
    if (this.instance == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        newValue,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#instance() instance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withInstance(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.instance == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        value,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        newValue,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        value,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        newValue,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        value,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        newValue,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        value,
        this.derivedFromUri,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#derivedFromUri() derivedFromUri} attribute.
   * @param value The value for derivedFromUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withDerivedFromUri(java.util.List<com.fhir.uri> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> newValue = java.util.Objects.requireNonNull(value, "derivedFromUri");
    if (this.derivedFromUri == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        newValue,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#derivedFromUri() derivedFromUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for derivedFromUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withDerivedFromUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> value = optional.orElse(null);
    if (this.derivedFromUri == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        value,
        this.status,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withStatus(com.fhir.ChargeitemdefinitionStatus value) {
    @javax.annotation.Nullable com.fhir.ChargeitemdefinitionStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        newValue,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withStatus(java.util.Optional<? extends com.fhir.ChargeitemdefinitionStatus> optional) {
    @javax.annotation.Nullable com.fhir.ChargeitemdefinitionStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        value,
        this.description,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        newValue,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        value,
        this.applicability);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ChargeItemDefinition#applicability() applicability} attribute.
   * @param value The value for applicability
   * @return A modified copy of {@code this} object
   */
  public final ImmutableChargeItemDefinition withApplicability(java.util.List<com.fhir.ChargeItemDefinition_Applicability> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ChargeItemDefinition_Applicability> newValue = java.util.Objects.requireNonNull(value, "applicability");
    if (this.applicability == newValue) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ChargeItemDefinition#applicability() applicability} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for applicability
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableChargeItemDefinition withApplicability(java.util.Optional<? extends java.util.List<com.fhir.ChargeItemDefinition_Applicability>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ChargeItemDefinition_Applicability> value = optional.orElse(null);
    if (this.applicability == value) return this;
    return new ImmutableChargeItemDefinition(
        this.modifierExtension,
        this.resourceType,
        this.jurisdiction,
        this.date,
        this.url,
        this.replaces,
        this.propertyGroup,
        this.copyright,
        this.code,
        this.publisher,
        this.identifier,
        this.approvalDate,
        this.lastReviewDate,
        this.contained,
        this.extension,
        this.meta,
        this.effectivePeriod,
        this.version,
        this.title,
        this.contact,
        this.id,
        this.partOf,
        this.experimental,
        this.text,
        this.instance,
        this.implicitRules,
        this.language,
        this.useContext,
        this.derivedFromUri,
        this.status,
        this.description,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableChargeItemDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableChargeItemDefinition
        && equalTo((ImmutableChargeItemDefinition) another);
  }

  private boolean equalTo(ImmutableChargeItemDefinition another) {
    return java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(replaces, another.replaces)
        && java.util.Objects.equals(propertyGroup, another.propertyGroup)
        && java.util.Objects.equals(copyright, another.copyright)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(approvalDate, another.approvalDate)
        && java.util.Objects.equals(lastReviewDate, another.lastReviewDate)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(effectivePeriod, another.effectivePeriod)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(partOf, another.partOf)
        && java.util.Objects.equals(experimental, another.experimental)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(instance, another.instance)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(derivedFromUri, another.derivedFromUri)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(applicability, another.applicability);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code resourceType}, {@code jurisdiction}, {@code date}, {@code url}, {@code replaces}, {@code propertyGroup}, {@code copyright}, {@code code}, {@code publisher}, {@code identifier}, {@code approvalDate}, {@code lastReviewDate}, {@code contained}, {@code extension}, {@code meta}, {@code effectivePeriod}, {@code version}, {@code title}, {@code contact}, {@code id}, {@code partOf}, {@code experimental}, {@code text}, {@code instance}, {@code implicitRules}, {@code language}, {@code useContext}, {@code derivedFromUri}, {@code status}, {@code description}, {@code applicability}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(replaces);
    h += (h << 5) + java.util.Objects.hashCode(propertyGroup);
    h += (h << 5) + java.util.Objects.hashCode(copyright);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(approvalDate);
    h += (h << 5) + java.util.Objects.hashCode(lastReviewDate);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(effectivePeriod);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(partOf);
    h += (h << 5) + java.util.Objects.hashCode(experimental);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(instance);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(derivedFromUri);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(applicability);
    return h;
  }

  /**
   * Prints the immutable value {@code ChargeItemDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ChargeItemDefinition{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 21) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
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
    if (propertyGroup != null) {
      builder.append(", ");
      builder.append("propertyGroup=").append(propertyGroup);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (approvalDate != null) {
      builder.append(", ");
      builder.append("approvalDate=").append(approvalDate);
    }
    if (lastReviewDate != null) {
      builder.append(", ");
      builder.append("lastReviewDate=").append(lastReviewDate);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (effectivePeriod != null) {
      builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (partOf != null) {
      builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (instance != null) {
      builder.append(", ");
      builder.append("instance=").append(instance);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (derivedFromUri != null) {
      builder.append(", ");
      builder.append("derivedFromUri=").append(derivedFromUri);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (applicability != null) {
      builder.append(", ");
      builder.append("applicability=").append(applicability);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ChargeItemDefinition", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ChargeItemDefinition {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> replaces = java.util.Optional.empty();
    boolean replacesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ChargeItemDefinition_PropertyGroup>> propertyGroup = java.util.Optional.empty();
    boolean propertyGroupIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> copyright = java.util.Optional.empty();
    boolean copyrightIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> approvalDate = java.util.Optional.empty();
    boolean approvalDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> lastReviewDate = java.util.Optional.empty();
    boolean lastReviewDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> effectivePeriod = java.util.Optional.empty();
    boolean effectivePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> partOf = java.util.Optional.empty();
    boolean partOfIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> experimental = java.util.Optional.empty();
    boolean experimentalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> instance = java.util.Optional.empty();
    boolean instanceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.uri>> derivedFromUri = java.util.Optional.empty();
    boolean derivedFromUriIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ChargeitemdefinitionStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ChargeItemDefinition_Applicability>> applicability = java.util.Optional.empty();
    boolean applicabilityIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("replaces")
    public void setReplaces(java.util.Optional<java.util.List<com.fhir.canonical>> replaces) {
      this.replaces = replaces;
      this.replacesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("propertyGroup")
    public void setPropertyGroup(java.util.Optional<java.util.List<com.fhir.ChargeItemDefinition_PropertyGroup>> propertyGroup) {
      this.propertyGroup = propertyGroup;
      this.propertyGroupIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("copyright")
    public void setCopyright(java.util.Optional<com.fhir.markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public void setPublisher(java.util.Optional<java.lang.String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("approvalDate")
    public void setApprovalDate(java.util.Optional<com.fhir.date> approvalDate) {
      this.approvalDate = approvalDate;
      this.approvalDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lastReviewDate")
    public void setLastReviewDate(java.util.Optional<com.fhir.date> lastReviewDate) {
      this.lastReviewDate = lastReviewDate;
      this.lastReviewDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
    public void setEffectivePeriod(java.util.Optional<com.fhir.Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public void setPartOf(java.util.Optional<java.util.List<com.fhir.canonical>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("experimental")
    public void setExperimental(java.util.Optional<java.lang.Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instance")
    public void setInstance(java.util.Optional<java.util.List<com.fhir.Reference>> instance) {
      this.instance = instance;
      this.instanceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public void setUseContext(java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("derivedFromUri")
    public void setDerivedFromUri(java.util.Optional<java.util.List<com.fhir.uri>> derivedFromUri) {
      this.derivedFromUri = derivedFromUri;
      this.derivedFromUriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.ChargeitemdefinitionStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("applicability")
    public void setApplicability(java.util.Optional<java.util.List<com.fhir.ChargeItemDefinition_Applicability>> applicability) {
      this.applicability = applicability;
      this.applicabilityIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> replaces() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ChargeItemDefinition_PropertyGroup>> propertyGroup() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> approvalDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> lastReviewDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> instance() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.uri>> derivedFromUri() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ChargeitemdefinitionStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ChargeItemDefinition_Applicability>> applicability() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableChargeItemDefinition fromJson(Json json) {
    ImmutableChargeItemDefinition.Builder builder = ((ImmutableChargeItemDefinition.Builder) ImmutableChargeItemDefinition.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
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
    if (json.propertyGroupIsSet) {
      builder.propertyGroup(json.propertyGroup);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.approvalDateIsSet) {
      builder.approvalDate(json.approvalDate);
    }
    if (json.lastReviewDateIsSet) {
      builder.lastReviewDate(json.lastReviewDate);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.instanceIsSet) {
      builder.instance(json.instance);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.derivedFromUriIsSet) {
      builder.derivedFromUri(json.derivedFromUri);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.applicabilityIsSet) {
      builder.applicability(json.applicability);
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
        .modifierExtension(instance.modifierExtension())
        .resourceType(instance.resourceType())
        .jurisdiction(instance.jurisdiction())
        .date(instance.date())
        .url(instance.url())
        .replaces(instance.replaces())
        .propertyGroup(instance.propertyGroup())
        .copyright(instance.copyright())
        .code(instance.code())
        .publisher(instance.publisher())
        .identifier(instance.identifier())
        .approvalDate(instance.approvalDate())
        .lastReviewDate(instance.lastReviewDate())
        .contained(instance.contained())
        .extension(instance.extension())
        .meta(instance.meta())
        .effectivePeriod(instance.effectivePeriod())
        .version(instance.version())
        .title(instance.title())
        .contact(instance.contact())
        .id(instance.id())
        .partOf(instance.partOf())
        .experimental(instance.experimental())
        .text(instance.text())
        .instance(instance.instance())
        .implicitRules(instance.implicitRules())
        .language(instance.language())
        .useContext(instance.useContext())
        .derivedFromUri(instance.derivedFromUri())
        .status(instance.status())
        .description(instance.description())
        .applicability(instance.applicability())
        .build();
  }

  /**
   * Creates a builder for {@link ChargeItemDefinition ChargeItemDefinition}.
   * <pre>
   * ImmutableChargeItemDefinition.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ChargeItemDefinition#modifierExtension() modifierExtension}
   *    .resourceType(String) // required {@link ChargeItemDefinition#resourceType() resourceType}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ChargeItemDefinition#jurisdiction() jurisdiction}
   *    .date(com.fhir.dateTime) // optional {@link ChargeItemDefinition#date() date}
   *    .url(com.fhir.uri) // optional {@link ChargeItemDefinition#url() url}
   *    .replaces(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link ChargeItemDefinition#replaces() replaces}
   *    .propertyGroup(List&amp;lt;com.fhir.ChargeItemDefinition_PropertyGroup&amp;gt;) // optional {@link ChargeItemDefinition#propertyGroup() propertyGroup}
   *    .copyright(com.fhir.markdown) // optional {@link ChargeItemDefinition#copyright() copyright}
   *    .code(com.fhir.CodeableConcept) // optional {@link ChargeItemDefinition#code() code}
   *    .publisher(String) // optional {@link ChargeItemDefinition#publisher() publisher}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link ChargeItemDefinition#identifier() identifier}
   *    .approvalDate(com.fhir.date) // optional {@link ChargeItemDefinition#approvalDate() approvalDate}
   *    .lastReviewDate(com.fhir.date) // optional {@link ChargeItemDefinition#lastReviewDate() lastReviewDate}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link ChargeItemDefinition#contained() contained}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ChargeItemDefinition#extension() extension}
   *    .meta(com.fhir.Meta) // optional {@link ChargeItemDefinition#meta() meta}
   *    .effectivePeriod(com.fhir.Period) // optional {@link ChargeItemDefinition#effectivePeriod() effectivePeriod}
   *    .version(String) // optional {@link ChargeItemDefinition#version() version}
   *    .title(String) // optional {@link ChargeItemDefinition#title() title}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link ChargeItemDefinition#contact() contact}
   *    .id(com.fhir.id) // optional {@link ChargeItemDefinition#id() id}
   *    .partOf(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link ChargeItemDefinition#partOf() partOf}
   *    .experimental(Boolean) // optional {@link ChargeItemDefinition#experimental() experimental}
   *    .text(com.fhir.Narrative) // optional {@link ChargeItemDefinition#text() text}
   *    .instance(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ChargeItemDefinition#instance() instance}
   *    .implicitRules(com.fhir.uri) // optional {@link ChargeItemDefinition#implicitRules() implicitRules}
   *    .language(com.fhir.code) // optional {@link ChargeItemDefinition#language() language}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link ChargeItemDefinition#useContext() useContext}
   *    .derivedFromUri(List&amp;lt;com.fhir.uri&amp;gt;) // optional {@link ChargeItemDefinition#derivedFromUri() derivedFromUri}
   *    .status(com.fhir.ChargeitemdefinitionStatus) // optional {@link ChargeItemDefinition#status() status}
   *    .description(com.fhir.markdown) // optional {@link ChargeItemDefinition#description() description}
   *    .applicability(List&amp;lt;com.fhir.ChargeItemDefinition_Applicability&amp;gt;) // optional {@link ChargeItemDefinition#applicability() applicability}
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
  @org.immutables.value.Generated(from = "ChargeItemDefinition", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_JURISDICTION = 0x2L;
    private static final long OPT_BIT_DATE = 0x4L;
    private static final long OPT_BIT_URL = 0x8L;
    private static final long OPT_BIT_REPLACES = 0x10L;
    private static final long OPT_BIT_PROPERTY_GROUP = 0x20L;
    private static final long OPT_BIT_COPYRIGHT = 0x40L;
    private static final long OPT_BIT_CODE = 0x80L;
    private static final long OPT_BIT_PUBLISHER = 0x100L;
    private static final long OPT_BIT_IDENTIFIER = 0x200L;
    private static final long OPT_BIT_APPROVAL_DATE = 0x400L;
    private static final long OPT_BIT_LAST_REVIEW_DATE = 0x800L;
    private static final long OPT_BIT_CONTAINED = 0x1000L;
    private static final long OPT_BIT_EXTENSION = 0x2000L;
    private static final long OPT_BIT_META = 0x4000L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x8000L;
    private static final long OPT_BIT_VERSION = 0x10000L;
    private static final long OPT_BIT_TITLE = 0x20000L;
    private static final long OPT_BIT_CONTACT = 0x40000L;
    private static final long OPT_BIT_ID = 0x80000L;
    private static final long OPT_BIT_PART_OF = 0x100000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x200000L;
    private static final long OPT_BIT_TEXT = 0x400000L;
    private static final long OPT_BIT_INSTANCE = 0x800000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1000000L;
    private static final long OPT_BIT_LANGUAGE = 0x2000000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x4000000L;
    private static final long OPT_BIT_DERIVED_FROM_URI = 0x8000000L;
    private static final long OPT_BIT_STATUS = 0x10000000L;
    private static final long OPT_BIT_DESCRIPTION = 0x20000000L;
    private static final long OPT_BIT_APPLICABILITY = 0x40000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> replaces;
    private @javax.annotation.Nullable java.util.List<com.fhir.ChargeItemDefinition_PropertyGroup> propertyGroup;
    private @javax.annotation.Nullable com.fhir.markdown copyright;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.date approvalDate;
    private @javax.annotation.Nullable com.fhir.date lastReviewDate;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.Period effectivePeriod;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> partOf;
    private @javax.annotation.Nullable java.lang.Boolean experimental;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> instance;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable java.util.List<com.fhir.uri> derivedFromUri;
    private @javax.annotation.Nullable com.fhir.ChargeitemdefinitionStatus status;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable java.util.List<com.fhir.ChargeItemDefinition_Applicability> applicability;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ChargeItemDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link ChargeItemDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ChargeItemDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ChargeItemDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ChargeItemDefinition#date() date} to date.
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
     * Initializes the optional value {@link ChargeItemDefinition#date() date} to date.
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
     * Initializes the optional value {@link ChargeItemDefinition#url() url} to url.
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
     * Initializes the optional value {@link ChargeItemDefinition#url() url} to url.
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
     * Initializes the optional value {@link ChargeItemDefinition#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for chained invocation
     */
    public final Builder replaces(java.util.List<com.fhir.canonical> replaces) {
      checkNotIsSet(replacesIsSet(), "replaces");
      this.replaces = java.util.Objects.requireNonNull(replaces, "replaces");
      optBits |= OPT_BIT_REPLACES;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replaces")
    public final Builder replaces(java.util.Optional<? extends java.util.List<com.fhir.canonical>> replaces) {
      checkNotIsSet(replacesIsSet(), "replaces");
      this.replaces = replaces.orElse(null);
      optBits |= OPT_BIT_REPLACES;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#propertyGroup() propertyGroup} to propertyGroup.
     * @param propertyGroup The value for propertyGroup
     * @return {@code this} builder for chained invocation
     */
    public final Builder propertyGroup(java.util.List<com.fhir.ChargeItemDefinition_PropertyGroup> propertyGroup) {
      checkNotIsSet(propertyGroupIsSet(), "propertyGroup");
      this.propertyGroup = java.util.Objects.requireNonNull(propertyGroup, "propertyGroup");
      optBits |= OPT_BIT_PROPERTY_GROUP;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#propertyGroup() propertyGroup} to propertyGroup.
     * @param propertyGroup The value for propertyGroup
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("propertyGroup")
    public final Builder propertyGroup(java.util.Optional<? extends java.util.List<com.fhir.ChargeItemDefinition_PropertyGroup>> propertyGroup) {
      checkNotIsSet(propertyGroupIsSet(), "propertyGroup");
      this.propertyGroup = propertyGroup.orElse(null);
      optBits |= OPT_BIT_PROPERTY_GROUP;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link ChargeItemDefinition#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link ChargeItemDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(com.fhir.CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends com.fhir.CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ChargeItemDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ChargeItemDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ChargeItemDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ChargeItemDefinition#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link ChargeItemDefinition#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link ChargeItemDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link ChargeItemDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link ChargeItemDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link ChargeItemDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link ChargeItemDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link ChargeItemDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link ChargeItemDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link ChargeItemDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link ChargeItemDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link ChargeItemDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link ChargeItemDefinition#version() version} to version.
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
     * Initializes the optional value {@link ChargeItemDefinition#version() version} to version.
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
     * Initializes the optional value {@link ChargeItemDefinition#title() title} to title.
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
     * Initializes the optional value {@link ChargeItemDefinition#title() title} to title.
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
     * Initializes the optional value {@link ChargeItemDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link ChargeItemDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link ChargeItemDefinition#id() id} to id.
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
     * Initializes the optional value {@link ChargeItemDefinition#id() id} to id.
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
     * Initializes the optional value {@link ChargeItemDefinition#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder partOf(java.util.List<com.fhir.canonical> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = java.util.Objects.requireNonNull(partOf, "partOf");
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public final Builder partOf(java.util.Optional<? extends java.util.List<com.fhir.canonical>> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = partOf.orElse(null);
      optBits |= OPT_BIT_PART_OF;
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
    @com.fasterxml.jackson.annotation.JsonProperty("experimental")
    public final Builder experimental(java.util.Optional<java.lang.Boolean> experimental) {
      checkNotIsSet(experimentalIsSet(), "experimental");
      this.experimental = experimental.orElse(null);
      optBits |= OPT_BIT_EXPERIMENTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#text() text} to text.
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
     * Initializes the optional value {@link ChargeItemDefinition#text() text} to text.
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
     * Initializes the optional value {@link ChargeItemDefinition#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for chained invocation
     */
    public final Builder instance(java.util.List<com.fhir.Reference> instance) {
      checkNotIsSet(instanceIsSet(), "instance");
      this.instance = java.util.Objects.requireNonNull(instance, "instance");
      optBits |= OPT_BIT_INSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instance")
    public final Builder instance(java.util.Optional<? extends java.util.List<com.fhir.Reference>> instance) {
      checkNotIsSet(instanceIsSet(), "instance");
      this.instance = instance.orElse(null);
      optBits |= OPT_BIT_INSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ChargeItemDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ChargeItemDefinition#language() language} to language.
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
     * Initializes the optional value {@link ChargeItemDefinition#language() language} to language.
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
     * Initializes the optional value {@link ChargeItemDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link ChargeItemDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link ChargeItemDefinition#derivedFromUri() derivedFromUri} to derivedFromUri.
     * @param derivedFromUri The value for derivedFromUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder derivedFromUri(java.util.List<com.fhir.uri> derivedFromUri) {
      checkNotIsSet(derivedFromUriIsSet(), "derivedFromUri");
      this.derivedFromUri = java.util.Objects.requireNonNull(derivedFromUri, "derivedFromUri");
      optBits |= OPT_BIT_DERIVED_FROM_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#derivedFromUri() derivedFromUri} to derivedFromUri.
     * @param derivedFromUri The value for derivedFromUri
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("derivedFromUri")
    public final Builder derivedFromUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> derivedFromUri) {
      checkNotIsSet(derivedFromUriIsSet(), "derivedFromUri");
      this.derivedFromUri = derivedFromUri.orElse(null);
      optBits |= OPT_BIT_DERIVED_FROM_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.ChargeitemdefinitionStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.ChargeitemdefinitionStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#description() description} to description.
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
     * Initializes the optional value {@link ChargeItemDefinition#description() description} to description.
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
     * Initializes the optional value {@link ChargeItemDefinition#applicability() applicability} to applicability.
     * @param applicability The value for applicability
     * @return {@code this} builder for chained invocation
     */
    public final Builder applicability(java.util.List<com.fhir.ChargeItemDefinition_Applicability> applicability) {
      checkNotIsSet(applicabilityIsSet(), "applicability");
      this.applicability = java.util.Objects.requireNonNull(applicability, "applicability");
      optBits |= OPT_BIT_APPLICABILITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ChargeItemDefinition#applicability() applicability} to applicability.
     * @param applicability The value for applicability
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applicability")
    public final Builder applicability(java.util.Optional<? extends java.util.List<com.fhir.ChargeItemDefinition_Applicability>> applicability) {
      checkNotIsSet(applicabilityIsSet(), "applicability");
      this.applicability = applicability.orElse(null);
      optBits |= OPT_BIT_APPLICABILITY;
      return this;
    }

    /**
     * Builds a new {@link ChargeItemDefinition ChargeItemDefinition}.
     * @return An immutable instance of ChargeItemDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ChargeItemDefinition build() {
      checkRequiredAttributes();
      return new ImmutableChargeItemDefinition(
          modifierExtension,
          resourceType,
          jurisdiction,
          date,
          url,
          replaces,
          propertyGroup,
          copyright,
          code,
          publisher,
          identifier,
          approvalDate,
          lastReviewDate,
          contained,
          extension,
          meta,
          effectivePeriod,
          version,
          title,
          contact,
          id,
          partOf,
          experimental,
          text,
          instance,
          implicitRules,
          language,
          useContext,
          derivedFromUri,
          status,
          description,
          applicability);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
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

    private boolean propertyGroupIsSet() {
      return (optBits & OPT_BIT_PROPERTY_GROUP) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean approvalDateIsSet() {
      return (optBits & OPT_BIT_APPROVAL_DATE) != 0;
    }

    private boolean lastReviewDateIsSet() {
      return (optBits & OPT_BIT_LAST_REVIEW_DATE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean instanceIsSet() {
      return (optBits & OPT_BIT_INSTANCE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean derivedFromUriIsSet() {
      return (optBits & OPT_BIT_DERIVED_FROM_URI) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean applicabilityIsSet() {
      return (optBits & OPT_BIT_APPLICABILITY) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ChargeItemDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build ChargeItemDefinition, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ChargeItemDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ChargeItemDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "ChargeItemDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ChargeItemDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for chained invocation
     */
    BuildFinal replaces(java.util.List<com.fhir.canonical> replaces);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal replaces(java.util.Optional<? extends java.util.List<com.fhir.canonical>> replaces);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#propertyGroup() propertyGroup} to propertyGroup.
     * @param propertyGroup The value for propertyGroup
     * @return {@code this} builder for chained invocation
     */
    BuildFinal propertyGroup(java.util.List<com.fhir.ChargeItemDefinition_PropertyGroup> propertyGroup);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#propertyGroup() propertyGroup} to propertyGroup.
     * @param propertyGroup The value for propertyGroup
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal propertyGroup(java.util.Optional<? extends java.util.List<com.fhir.ChargeItemDefinition_PropertyGroup>> propertyGroup);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(com.fhir.markdown copyright);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(java.util.Optional<? extends com.fhir.markdown> copyright);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(com.fhir.CodeableConcept code);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(java.util.Optional<? extends com.fhir.CodeableConcept> code);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal approvalDate(com.fhir.date approvalDate);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal approvalDate(java.util.Optional<? extends com.fhir.date> approvalDate);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastReviewDate(com.fhir.date lastReviewDate);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastReviewDate(java.util.Optional<? extends com.fhir.date> lastReviewDate);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(com.fhir.Period effectivePeriod);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(java.util.Optional<? extends com.fhir.Period> effectivePeriod);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(java.util.List<com.fhir.canonical> partOf);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(java.util.Optional<? extends java.util.List<com.fhir.canonical>> partOf);

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
    BuildFinal experimental(java.util.Optional<java.lang.Boolean> experimental);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instance(java.util.List<com.fhir.Reference> instance);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#instance() instance} to instance.
     * @param instance The value for instance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instance(java.util.Optional<? extends java.util.List<com.fhir.Reference>> instance);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#derivedFromUri() derivedFromUri} to derivedFromUri.
     * @param derivedFromUri The value for derivedFromUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal derivedFromUri(java.util.List<com.fhir.uri> derivedFromUri);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#derivedFromUri() derivedFromUri} to derivedFromUri.
     * @param derivedFromUri The value for derivedFromUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal derivedFromUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> derivedFromUri);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.ChargeitemdefinitionStatus status);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.ChargeitemdefinitionStatus> status);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#applicability() applicability} to applicability.
     * @param applicability The value for applicability
     * @return {@code this} builder for chained invocation
     */
    BuildFinal applicability(java.util.List<com.fhir.ChargeItemDefinition_Applicability> applicability);

    /**
     * Initializes the optional value {@link ChargeItemDefinition#applicability() applicability} to applicability.
     * @param applicability The value for applicability
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal applicability(java.util.Optional<? extends java.util.List<com.fhir.ChargeItemDefinition_Applicability>> applicability);

    /**
     * Builds a new {@link ChargeItemDefinition ChargeItemDefinition}.
     * @return An immutable instance of ChargeItemDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ChargeItemDefinition build();
  }
}
