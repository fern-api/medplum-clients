//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link SearchParameter}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSearchParameter.builder()}.
 */
@org.immutables.value.Generated(from = "SearchParameter", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSearchParameter implements com.fhir.SearchParameter {
  private final @javax.annotation.Nullable com.fhir.canonical derivedFrom;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable com.fhir.SearchparameterStatus status;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.SearchparameterType type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.SearchparameterModifierItem> modifier;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.SearchparameterXpathusage xpathUsage;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable java.lang.String xpath;
  private final @javax.annotation.Nullable java.util.List<com.fhir.SearchparameterComparatorItem> comparator;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable java.util.List<com.fhir.code> target;
  private final @javax.annotation.Nullable java.lang.Boolean experimental;
  private final @javax.annotation.Nullable com.fhir.code code;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.lang.Boolean multipleAnd;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.markdown purpose;
  private final @javax.annotation.Nullable java.util.List<com.fhir.code> base;
  private final @javax.annotation.Nullable java.lang.Boolean multipleOr;
  private final @javax.annotation.Nullable java.util.List<java.lang.String> chain;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.lang.String expression;
  private final @javax.annotation.Nullable java.util.List<com.fhir.SearchParameter_Component> component;

  private ImmutableSearchParameter(
      @javax.annotation.Nullable com.fhir.canonical derivedFrom,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable com.fhir.SearchparameterStatus status,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.SearchparameterType type,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable java.util.List<com.fhir.SearchparameterModifierItem> modifier,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.SearchparameterXpathusage xpathUsage,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable java.lang.String xpath,
      @javax.annotation.Nullable java.util.List<com.fhir.SearchparameterComparatorItem> comparator,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable java.util.List<com.fhir.code> target,
      @javax.annotation.Nullable java.lang.Boolean experimental,
      @javax.annotation.Nullable com.fhir.code code,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.lang.Boolean multipleAnd,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.markdown purpose,
      @javax.annotation.Nullable java.util.List<com.fhir.code> base,
      @javax.annotation.Nullable java.lang.Boolean multipleOr,
      @javax.annotation.Nullable java.util.List<java.lang.String> chain,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.lang.String expression,
      @javax.annotation.Nullable java.util.List<com.fhir.SearchParameter_Component> component) {
    this.derivedFrom = derivedFrom;
    this.useContext = useContext;
    this.status = status;
    this.date = date;
    this.text = text;
    this.type = type;
    this.jurisdiction = jurisdiction;
    this.description = description;
    this.modifier = modifier;
    this.meta = meta;
    this.xpathUsage = xpathUsage;
    this.modifierExtension = modifierExtension;
    this.resourceType = resourceType;
    this.url = url;
    this.version = version;
    this.xpath = xpath;
    this.comparator = comparator;
    this.name = name;
    this.target = target;
    this.experimental = experimental;
    this.code = code;
    this.contact = contact;
    this.id = id;
    this.multipleAnd = multipleAnd;
    this.extension = extension;
    this.publisher = publisher;
    this.contained = contained;
    this.language = language;
    this.purpose = purpose;
    this.base = base;
    this.multipleOr = multipleOr;
    this.chain = chain;
    this.implicitRules = implicitRules;
    this.expression = expression;
    this.component = component;
  }

  /**
   * @return The value of the {@code derivedFrom} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("derivedFrom")
  @Override
  public java.util.Optional<com.fhir.canonical> derivedFrom() {
    return java.util.Optional.ofNullable(derivedFrom);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.SearchparameterStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.SearchparameterType> type() {
    return java.util.Optional.ofNullable(type);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<com.fhir.markdown> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code modifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.SearchparameterModifierItem>> modifier() {
    return java.util.Optional.ofNullable(modifier);
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
   * @return The value of the {@code xpathUsage} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("xpathUsage")
  @Override
  public java.util.Optional<com.fhir.SearchparameterXpathusage> xpathUsage() {
    return java.util.Optional.ofNullable(xpathUsage);
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
   * @return The value of the {@code url} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @Override
  public java.util.Optional<com.fhir.uri> url() {
    return java.util.Optional.ofNullable(url);
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
   * @return The value of the {@code xpath} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("xpath")
  @Override
  public java.util.Optional<java.lang.String> xpath() {
    return java.util.Optional.ofNullable(xpath);
  }

  /**
   * @return The value of the {@code comparator} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("comparator")
  @Override
  public java.util.Optional<java.util.List<com.fhir.SearchparameterComparatorItem>> comparator() {
    return java.util.Optional.ofNullable(comparator);
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
   * @return The value of the {@code target} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("target")
  @Override
  public java.util.Optional<java.util.List<com.fhir.code>> target() {
    return java.util.Optional.ofNullable(target);
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
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.code> code() {
    return java.util.Optional.ofNullable(code);
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
   * @return The value of the {@code multipleAnd} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("multipleAnd")
  @Override
  public java.util.Optional<java.lang.Boolean> multipleAnd() {
    return java.util.Optional.ofNullable(multipleAnd);
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
   * @return The value of the {@code publisher} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("publisher")
  @Override
  public java.util.Optional<java.lang.String> publisher() {
    return java.util.Optional.ofNullable(publisher);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
   * @return The value of the {@code base} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("base")
  @Override
  public java.util.Optional<java.util.List<com.fhir.code>> base() {
    return java.util.Optional.ofNullable(base);
  }

  /**
   * @return The value of the {@code multipleOr} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("multipleOr")
  @Override
  public java.util.Optional<java.lang.Boolean> multipleOr() {
    return java.util.Optional.ofNullable(multipleOr);
  }

  /**
   * @return The value of the {@code chain} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("chain")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> chain() {
    return java.util.Optional.ofNullable(chain);
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
   * @return The value of the {@code expression} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("expression")
  @Override
  public java.util.Optional<java.lang.String> expression() {
    return java.util.Optional.ofNullable(expression);
  }

  /**
   * @return The value of the {@code component} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("component")
  @Override
  public java.util.Optional<java.util.List<com.fhir.SearchParameter_Component>> component() {
    return java.util.Optional.ofNullable(component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#derivedFrom() derivedFrom} attribute.
   * @param value The value for derivedFrom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withDerivedFrom(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "derivedFrom");
    if (this.derivedFrom == newValue) return this;
    return new ImmutableSearchParameter(
        newValue,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#derivedFrom() derivedFrom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for derivedFrom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withDerivedFrom(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.derivedFrom == value) return this;
    return new ImmutableSearchParameter(
        value,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        newValue,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        value,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withStatus(com.fhir.SearchparameterStatus value) {
    @javax.annotation.Nullable com.fhir.SearchparameterStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        newValue,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withStatus(java.util.Optional<? extends com.fhir.SearchparameterStatus> optional) {
    @javax.annotation.Nullable com.fhir.SearchparameterStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        value,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        newValue,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        value,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        newValue,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        value,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withType(com.fhir.SearchparameterType value) {
    @javax.annotation.Nullable com.fhir.SearchparameterType newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        newValue,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withType(java.util.Optional<? extends com.fhir.SearchparameterType> optional) {
    @javax.annotation.Nullable com.fhir.SearchparameterType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        value,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        newValue,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        value,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        newValue,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        value,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#modifier() modifier} attribute.
   * @param value The value for modifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withModifier(java.util.List<com.fhir.SearchparameterModifierItem> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.SearchparameterModifierItem> newValue = java.util.Objects.requireNonNull(value, "modifier");
    if (this.modifier == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        newValue,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#modifier() modifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withModifier(java.util.Optional<? extends java.util.List<com.fhir.SearchparameterModifierItem>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.SearchparameterModifierItem> value = optional.orElse(null);
    if (this.modifier == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        value,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        newValue,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        value,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#xpathUsage() xpathUsage} attribute.
   * @param value The value for xpathUsage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withXpathUsage(com.fhir.SearchparameterXpathusage value) {
    @javax.annotation.Nullable com.fhir.SearchparameterXpathusage newValue = java.util.Objects.requireNonNull(value, "xpathUsage");
    if (this.xpathUsage == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        newValue,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#xpathUsage() xpathUsage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for xpathUsage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withXpathUsage(java.util.Optional<? extends com.fhir.SearchparameterXpathusage> optional) {
    @javax.annotation.Nullable com.fhir.SearchparameterXpathusage value = optional.orElse(null);
    if (this.xpathUsage == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        value,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        newValue,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        value,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SearchParameter#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSearchParameter withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        newValue,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        newValue,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        value,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        newValue,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        value,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#xpath() xpath} attribute.
   * @param value The value for xpath
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withXpath(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "xpath");
    if (java.util.Objects.equals(this.xpath, newValue)) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        newValue,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#xpath() xpath} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for xpath
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withXpath(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.xpath, value)) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        value,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#comparator() comparator} attribute.
   * @param value The value for comparator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withComparator(java.util.List<com.fhir.SearchparameterComparatorItem> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.SearchparameterComparatorItem> newValue = java.util.Objects.requireNonNull(value, "comparator");
    if (this.comparator == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        newValue,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#comparator() comparator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comparator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withComparator(java.util.Optional<? extends java.util.List<com.fhir.SearchparameterComparatorItem>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.SearchparameterComparatorItem> value = optional.orElse(null);
    if (this.comparator == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        value,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        newValue,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        value,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#target() target} attribute.
   * @param value The value for target
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withTarget(java.util.List<com.fhir.code> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> newValue = java.util.Objects.requireNonNull(value, "target");
    if (this.target == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        newValue,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#target() target} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for target
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withTarget(java.util.Optional<? extends java.util.List<com.fhir.code>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> value = optional.orElse(null);
    if (this.target == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        value,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withExperimental(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        newValue,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withExperimental(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.experimental, value)) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        value,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withCode(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        newValue,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withCode(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        value,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        newValue,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        value,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        newValue,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        value,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#multipleAnd() multipleAnd} attribute.
   * @param value The value for multipleAnd
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withMultipleAnd(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.multipleAnd, newValue)) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        newValue,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#multipleAnd() multipleAnd} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for multipleAnd
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withMultipleAnd(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.multipleAnd, value)) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        value,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        newValue,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        value,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        newValue,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        value,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        newValue,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        value,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        newValue,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        value,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withPurpose(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        newValue,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withPurpose(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        value,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#base() base} attribute.
   * @param value The value for base
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withBase(java.util.List<com.fhir.code> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> newValue = java.util.Objects.requireNonNull(value, "base");
    if (this.base == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        newValue,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#base() base} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for base
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withBase(java.util.Optional<? extends java.util.List<com.fhir.code>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> value = optional.orElse(null);
    if (this.base == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        value,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#multipleOr() multipleOr} attribute.
   * @param value The value for multipleOr
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withMultipleOr(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.multipleOr, newValue)) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        newValue,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#multipleOr() multipleOr} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for multipleOr
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withMultipleOr(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.multipleOr, value)) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        value,
        this.chain,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#chain() chain} attribute.
   * @param value The value for chain
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withChain(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "chain");
    if (this.chain == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        newValue,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#chain() chain} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for chain
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withChain(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.chain == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        value,
        this.implicitRules,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        newValue,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        value,
        this.expression,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#expression() expression} attribute.
   * @param value The value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withExpression(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "expression");
    if (java.util.Objects.equals(this.expression, newValue)) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        newValue,
        this.component);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#expression() expression} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withExpression(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.expression, value)) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        value,
        this.component);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#component() component} attribute.
   * @param value The value for component
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withComponent(java.util.List<com.fhir.SearchParameter_Component> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.SearchParameter_Component> newValue = java.util.Objects.requireNonNull(value, "component");
    if (this.component == newValue) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#component() component} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for component
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withComponent(java.util.Optional<? extends java.util.List<com.fhir.SearchParameter_Component>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.SearchParameter_Component> value = optional.orElse(null);
    if (this.component == value) return this;
    return new ImmutableSearchParameter(
        this.derivedFrom,
        this.useContext,
        this.status,
        this.date,
        this.text,
        this.type,
        this.jurisdiction,
        this.description,
        this.modifier,
        this.meta,
        this.xpathUsage,
        this.modifierExtension,
        this.resourceType,
        this.url,
        this.version,
        this.xpath,
        this.comparator,
        this.name,
        this.target,
        this.experimental,
        this.code,
        this.contact,
        this.id,
        this.multipleAnd,
        this.extension,
        this.publisher,
        this.contained,
        this.language,
        this.purpose,
        this.base,
        this.multipleOr,
        this.chain,
        this.implicitRules,
        this.expression,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSearchParameter} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSearchParameter
        && equalTo((ImmutableSearchParameter) another);
  }

  private boolean equalTo(ImmutableSearchParameter another) {
    return java.util.Objects.equals(derivedFrom, another.derivedFrom)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(modifier, another.modifier)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(xpathUsage, another.xpathUsage)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(xpath, another.xpath)
        && java.util.Objects.equals(comparator, another.comparator)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(target, another.target)
        && java.util.Objects.equals(experimental, another.experimental)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(multipleAnd, another.multipleAnd)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(purpose, another.purpose)
        && java.util.Objects.equals(base, another.base)
        && java.util.Objects.equals(multipleOr, another.multipleOr)
        && java.util.Objects.equals(chain, another.chain)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(expression, another.expression)
        && java.util.Objects.equals(component, another.component);
  }

  /**
   * Computes a hash code from attributes: {@code derivedFrom}, {@code useContext}, {@code status}, {@code date}, {@code text}, {@code type}, {@code jurisdiction}, {@code description}, {@code modifier}, {@code meta}, {@code xpathUsage}, {@code modifierExtension}, {@code resourceType}, {@code url}, {@code version}, {@code xpath}, {@code comparator}, {@code name}, {@code target}, {@code experimental}, {@code code}, {@code contact}, {@code id}, {@code multipleAnd}, {@code extension}, {@code publisher}, {@code contained}, {@code language}, {@code purpose}, {@code base}, {@code multipleOr}, {@code chain}, {@code implicitRules}, {@code expression}, {@code component}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(derivedFrom);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(modifier);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(xpathUsage);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(xpath);
    h += (h << 5) + java.util.Objects.hashCode(comparator);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(target);
    h += (h << 5) + java.util.Objects.hashCode(experimental);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(multipleAnd);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(purpose);
    h += (h << 5) + java.util.Objects.hashCode(base);
    h += (h << 5) + java.util.Objects.hashCode(multipleOr);
    h += (h << 5) + java.util.Objects.hashCode(chain);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(expression);
    h += (h << 5) + java.util.Objects.hashCode(component);
    return h;
  }

  /**
   * Prints the immutable value {@code SearchParameter} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("SearchParameter{");
    if (derivedFrom != null) {
      builder.append("derivedFrom=").append(derivedFrom);
    }
    if (useContext != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (status != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (date != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (text != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (type != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (jurisdiction != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (description != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (modifier != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("modifier=").append(modifier);
    }
    if (meta != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (xpathUsage != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("xpathUsage=").append(xpathUsage);
    }
    if (modifierExtension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 16) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (xpath != null) {
      builder.append(", ");
      builder.append("xpath=").append(xpath);
    }
    if (comparator != null) {
      builder.append(", ");
      builder.append("comparator=").append(comparator);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (target != null) {
      builder.append(", ");
      builder.append("target=").append(target);
    }
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (multipleAnd != null) {
      builder.append(", ");
      builder.append("multipleAnd=").append(multipleAnd);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (purpose != null) {
      builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (base != null) {
      builder.append(", ");
      builder.append("base=").append(base);
    }
    if (multipleOr != null) {
      builder.append(", ");
      builder.append("multipleOr=").append(multipleOr);
    }
    if (chain != null) {
      builder.append(", ");
      builder.append("chain=").append(chain);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (expression != null) {
      builder.append(", ");
      builder.append("expression=").append(expression);
    }
    if (component != null) {
      builder.append(", ");
      builder.append("component=").append(component);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "SearchParameter", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.SearchParameter {
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> derivedFrom = java.util.Optional.empty();
    boolean derivedFromIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.SearchparameterStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.SearchparameterType> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.SearchparameterModifierItem>> modifier = java.util.Optional.empty();
    boolean modifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.SearchparameterXpathusage> xpathUsage = java.util.Optional.empty();
    boolean xpathUsageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> xpath = java.util.Optional.empty();
    boolean xpathIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.SearchparameterComparatorItem>> comparator = java.util.Optional.empty();
    boolean comparatorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.code>> target = java.util.Optional.empty();
    boolean targetIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> experimental = java.util.Optional.empty();
    boolean experimentalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> multipleAnd = java.util.Optional.empty();
    boolean multipleAndIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> purpose = java.util.Optional.empty();
    boolean purposeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.code>> base = java.util.Optional.empty();
    boolean baseIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> multipleOr = java.util.Optional.empty();
    boolean multipleOrIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> chain = java.util.Optional.empty();
    boolean chainIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> expression = java.util.Optional.empty();
    boolean expressionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.SearchParameter_Component>> component = java.util.Optional.empty();
    boolean componentIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("derivedFrom")
    public void setDerivedFrom(java.util.Optional<com.fhir.canonical> derivedFrom) {
      this.derivedFrom = derivedFrom;
      this.derivedFromIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public void setUseContext(java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.SearchparameterStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.SearchparameterType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifier")
    public void setModifier(java.util.Optional<java.util.List<com.fhir.SearchparameterModifierItem>> modifier) {
      this.modifier = modifier;
      this.modifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("xpathUsage")
    public void setXpathUsage(java.util.Optional<com.fhir.SearchparameterXpathusage> xpathUsage) {
      this.xpathUsage = xpathUsage;
      this.xpathUsageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("xpath")
    public void setXpath(java.util.Optional<java.lang.String> xpath) {
      this.xpath = xpath;
      this.xpathIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("comparator")
    public void setComparator(java.util.Optional<java.util.List<com.fhir.SearchparameterComparatorItem>> comparator) {
      this.comparator = comparator;
      this.comparatorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    public void setTarget(java.util.Optional<java.util.List<com.fhir.code>> target) {
      this.target = target;
      this.targetIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("experimental")
    public void setExperimental(java.util.Optional<java.lang.Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.code> code) {
      this.code = code;
      this.codeIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("multipleAnd")
    public void setMultipleAnd(java.util.Optional<java.lang.Boolean> multipleAnd) {
      this.multipleAnd = multipleAnd;
      this.multipleAndIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public void setPublisher(java.util.Optional<java.lang.String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    public void setPurpose(java.util.Optional<com.fhir.markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("base")
    public void setBase(java.util.Optional<java.util.List<com.fhir.code>> base) {
      this.base = base;
      this.baseIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("multipleOr")
    public void setMultipleOr(java.util.Optional<java.lang.Boolean> multipleOr) {
      this.multipleOr = multipleOr;
      this.multipleOrIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("chain")
    public void setChain(java.util.Optional<java.util.List<java.lang.String>> chain) {
      this.chain = chain;
      this.chainIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    public void setExpression(java.util.Optional<java.lang.String> expression) {
      this.expression = expression;
      this.expressionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("component")
    public void setComponent(java.util.Optional<java.util.List<com.fhir.SearchParameter_Component>> component) {
      this.component = component;
      this.componentIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.canonical> derivedFrom() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.SearchparameterStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.SearchparameterType> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.SearchparameterModifierItem>> modifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.SearchparameterXpathusage> xpathUsage() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> xpath() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.SearchparameterComparatorItem>> comparator() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.code>> target() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> multipleAnd() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.code>> base() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> multipleOr() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> chain() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> expression() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.SearchParameter_Component>> component() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableSearchParameter fromJson(Json json) {
    ImmutableSearchParameter.Builder builder = ((ImmutableSearchParameter.Builder) ImmutableSearchParameter.builder());
    if (json.derivedFromIsSet) {
      builder.derivedFrom(json.derivedFrom);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.modifierIsSet) {
      builder.modifier(json.modifier);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.xpathUsageIsSet) {
      builder.xpathUsage(json.xpathUsage);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.xpathIsSet) {
      builder.xpath(json.xpath);
    }
    if (json.comparatorIsSet) {
      builder.comparator(json.comparator);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.targetIsSet) {
      builder.target(json.target);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.multipleAndIsSet) {
      builder.multipleAnd(json.multipleAnd);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.baseIsSet) {
      builder.base(json.base);
    }
    if (json.multipleOrIsSet) {
      builder.multipleOr(json.multipleOr);
    }
    if (json.chainIsSet) {
      builder.chain(json.chain);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.expressionIsSet) {
      builder.expression(json.expression);
    }
    if (json.componentIsSet) {
      builder.component(json.component);
    }
    return (ImmutableSearchParameter) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SearchParameter} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SearchParameter instance
   */
  public static SearchParameter copyOf(SearchParameter instance) {
    if (instance instanceof ImmutableSearchParameter) {
      return (ImmutableSearchParameter) instance;
    }
    return ((ImmutableSearchParameter.Builder) ImmutableSearchParameter.builder())
        .derivedFrom(instance.derivedFrom())
        .useContext(instance.useContext())
        .status(instance.status())
        .date(instance.date())
        .text(instance.text())
        .type(instance.type())
        .jurisdiction(instance.jurisdiction())
        .description(instance.description())
        .modifier(instance.modifier())
        .meta(instance.meta())
        .xpathUsage(instance.xpathUsage())
        .modifierExtension(instance.modifierExtension())
        .resourceType(instance.resourceType())
        .url(instance.url())
        .version(instance.version())
        .xpath(instance.xpath())
        .comparator(instance.comparator())
        .name(instance.name())
        .target(instance.target())
        .experimental(instance.experimental())
        .code(instance.code())
        .contact(instance.contact())
        .id(instance.id())
        .multipleAnd(instance.multipleAnd())
        .extension(instance.extension())
        .publisher(instance.publisher())
        .contained(instance.contained())
        .language(instance.language())
        .purpose(instance.purpose())
        .base(instance.base())
        .multipleOr(instance.multipleOr())
        .chain(instance.chain())
        .implicitRules(instance.implicitRules())
        .expression(instance.expression())
        .component(instance.component())
        .build();
  }

  /**
   * Creates a builder for {@link SearchParameter SearchParameter}.
   * <pre>
   * ImmutableSearchParameter.builder()
   *    .derivedFrom(com.fhir.canonical) // optional {@link SearchParameter#derivedFrom() derivedFrom}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link SearchParameter#useContext() useContext}
   *    .status(com.fhir.SearchparameterStatus) // optional {@link SearchParameter#status() status}
   *    .date(com.fhir.dateTime) // optional {@link SearchParameter#date() date}
   *    .text(com.fhir.Narrative) // optional {@link SearchParameter#text() text}
   *    .type(com.fhir.SearchparameterType) // optional {@link SearchParameter#type() type}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link SearchParameter#jurisdiction() jurisdiction}
   *    .description(com.fhir.markdown) // optional {@link SearchParameter#description() description}
   *    .modifier(List&amp;lt;com.fhir.SearchparameterModifierItem&amp;gt;) // optional {@link SearchParameter#modifier() modifier}
   *    .meta(com.fhir.Meta) // optional {@link SearchParameter#meta() meta}
   *    .xpathUsage(com.fhir.SearchparameterXpathusage) // optional {@link SearchParameter#xpathUsage() xpathUsage}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SearchParameter#modifierExtension() modifierExtension}
   *    .resourceType(String) // required {@link SearchParameter#resourceType() resourceType}
   *    .url(com.fhir.uri) // optional {@link SearchParameter#url() url}
   *    .version(String) // optional {@link SearchParameter#version() version}
   *    .xpath(String) // optional {@link SearchParameter#xpath() xpath}
   *    .comparator(List&amp;lt;com.fhir.SearchparameterComparatorItem&amp;gt;) // optional {@link SearchParameter#comparator() comparator}
   *    .name(String) // optional {@link SearchParameter#name() name}
   *    .target(List&amp;lt;com.fhir.code&amp;gt;) // optional {@link SearchParameter#target() target}
   *    .experimental(Boolean) // optional {@link SearchParameter#experimental() experimental}
   *    .code(com.fhir.code) // optional {@link SearchParameter#code() code}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link SearchParameter#contact() contact}
   *    .id(com.fhir.id) // optional {@link SearchParameter#id() id}
   *    .multipleAnd(Boolean) // optional {@link SearchParameter#multipleAnd() multipleAnd}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SearchParameter#extension() extension}
   *    .publisher(String) // optional {@link SearchParameter#publisher() publisher}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link SearchParameter#contained() contained}
   *    .language(com.fhir.code) // optional {@link SearchParameter#language() language}
   *    .purpose(com.fhir.markdown) // optional {@link SearchParameter#purpose() purpose}
   *    .base(List&amp;lt;com.fhir.code&amp;gt;) // optional {@link SearchParameter#base() base}
   *    .multipleOr(Boolean) // optional {@link SearchParameter#multipleOr() multipleOr}
   *    .chain(List&amp;lt;String&amp;gt;) // optional {@link SearchParameter#chain() chain}
   *    .implicitRules(com.fhir.uri) // optional {@link SearchParameter#implicitRules() implicitRules}
   *    .expression(String) // optional {@link SearchParameter#expression() expression}
   *    .component(List&amp;lt;com.fhir.SearchParameter_Component&amp;gt;) // optional {@link SearchParameter#component() component}
   *    .build();
   * </pre>
   * @return A new SearchParameter builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableSearchParameter.Builder();
  }

  /**
   * Builds instances of type {@link SearchParameter SearchParameter}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "SearchParameter", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_DERIVED_FROM = 0x1L;
    private static final long OPT_BIT_USE_CONTEXT = 0x2L;
    private static final long OPT_BIT_STATUS = 0x4L;
    private static final long OPT_BIT_DATE = 0x8L;
    private static final long OPT_BIT_TEXT = 0x10L;
    private static final long OPT_BIT_TYPE = 0x20L;
    private static final long OPT_BIT_JURISDICTION = 0x40L;
    private static final long OPT_BIT_DESCRIPTION = 0x80L;
    private static final long OPT_BIT_MODIFIER = 0x100L;
    private static final long OPT_BIT_META = 0x200L;
    private static final long OPT_BIT_XPATH_USAGE = 0x400L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x800L;
    private static final long OPT_BIT_URL = 0x1000L;
    private static final long OPT_BIT_VERSION = 0x2000L;
    private static final long OPT_BIT_XPATH = 0x4000L;
    private static final long OPT_BIT_COMPARATOR = 0x8000L;
    private static final long OPT_BIT_NAME = 0x10000L;
    private static final long OPT_BIT_TARGET = 0x20000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x40000L;
    private static final long OPT_BIT_CODE = 0x80000L;
    private static final long OPT_BIT_CONTACT = 0x100000L;
    private static final long OPT_BIT_ID = 0x200000L;
    private static final long OPT_BIT_MULTIPLE_AND = 0x400000L;
    private static final long OPT_BIT_EXTENSION = 0x800000L;
    private static final long OPT_BIT_PUBLISHER = 0x1000000L;
    private static final long OPT_BIT_CONTAINED = 0x2000000L;
    private static final long OPT_BIT_LANGUAGE = 0x4000000L;
    private static final long OPT_BIT_PURPOSE = 0x8000000L;
    private static final long OPT_BIT_BASE = 0x10000000L;
    private static final long OPT_BIT_MULTIPLE_OR = 0x20000000L;
    private static final long OPT_BIT_CHAIN = 0x40000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x80000000L;
    private static final long OPT_BIT_EXPRESSION = 0x100000000L;
    private static final long OPT_BIT_COMPONENT = 0x200000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.canonical derivedFrom;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable com.fhir.SearchparameterStatus status;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.SearchparameterType type;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable java.util.List<com.fhir.SearchparameterModifierItem> modifier;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.SearchparameterXpathusage xpathUsage;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable java.lang.String xpath;
    private @javax.annotation.Nullable java.util.List<com.fhir.SearchparameterComparatorItem> comparator;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable java.util.List<com.fhir.code> target;
    private @javax.annotation.Nullable java.lang.Boolean experimental;
    private @javax.annotation.Nullable com.fhir.code code;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.lang.Boolean multipleAnd;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.markdown purpose;
    private @javax.annotation.Nullable java.util.List<com.fhir.code> base;
    private @javax.annotation.Nullable java.lang.Boolean multipleOr;
    private @javax.annotation.Nullable java.util.List<java.lang.String> chain;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.lang.String expression;
    private @javax.annotation.Nullable java.util.List<com.fhir.SearchParameter_Component> component;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SearchParameter#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for chained invocation
     */
    public final Builder derivedFrom(com.fhir.canonical derivedFrom) {
      checkNotIsSet(derivedFromIsSet(), "derivedFrom");
      this.derivedFrom = java.util.Objects.requireNonNull(derivedFrom, "derivedFrom");
      optBits |= OPT_BIT_DERIVED_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("derivedFrom")
    public final Builder derivedFrom(java.util.Optional<? extends com.fhir.canonical> derivedFrom) {
      checkNotIsSet(derivedFromIsSet(), "derivedFrom");
      this.derivedFrom = derivedFrom.orElse(null);
      optBits |= OPT_BIT_DERIVED_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link SearchParameter#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link SearchParameter#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.SearchparameterStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.SearchparameterStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#date() date} to date.
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
     * Initializes the optional value {@link SearchParameter#date() date} to date.
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
     * Initializes the optional value {@link SearchParameter#text() text} to text.
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
     * Initializes the optional value {@link SearchParameter#text() text} to text.
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
     * Initializes the optional value {@link SearchParameter#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.SearchparameterType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.SearchparameterType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link SearchParameter#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link SearchParameter#description() description} to description.
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
     * Initializes the optional value {@link SearchParameter#description() description} to description.
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
     * Initializes the optional value {@link SearchParameter#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifier(java.util.List<com.fhir.SearchparameterModifierItem> modifier) {
      checkNotIsSet(modifierIsSet(), "modifier");
      this.modifier = java.util.Objects.requireNonNull(modifier, "modifier");
      optBits |= OPT_BIT_MODIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifier")
    public final Builder modifier(java.util.Optional<? extends java.util.List<com.fhir.SearchparameterModifierItem>> modifier) {
      checkNotIsSet(modifierIsSet(), "modifier");
      this.modifier = modifier.orElse(null);
      optBits |= OPT_BIT_MODIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#meta() meta} to meta.
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
     * Initializes the optional value {@link SearchParameter#meta() meta} to meta.
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
     * Initializes the optional value {@link SearchParameter#xpathUsage() xpathUsage} to xpathUsage.
     * @param xpathUsage The value for xpathUsage
     * @return {@code this} builder for chained invocation
     */
    public final Builder xpathUsage(com.fhir.SearchparameterXpathusage xpathUsage) {
      checkNotIsSet(xpathUsageIsSet(), "xpathUsage");
      this.xpathUsage = java.util.Objects.requireNonNull(xpathUsage, "xpathUsage");
      optBits |= OPT_BIT_XPATH_USAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#xpathUsage() xpathUsage} to xpathUsage.
     * @param xpathUsage The value for xpathUsage
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("xpathUsage")
    public final Builder xpathUsage(java.util.Optional<? extends com.fhir.SearchparameterXpathusage> xpathUsage) {
      checkNotIsSet(xpathUsageIsSet(), "xpathUsage");
      this.xpathUsage = xpathUsage.orElse(null);
      optBits |= OPT_BIT_XPATH_USAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SearchParameter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link SearchParameter#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link SearchParameter#url() url} to url.
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
     * Initializes the optional value {@link SearchParameter#url() url} to url.
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
     * Initializes the optional value {@link SearchParameter#version() version} to version.
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
     * Initializes the optional value {@link SearchParameter#version() version} to version.
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
     * Initializes the optional value {@link SearchParameter#xpath() xpath} to xpath.
     * @param xpath The value for xpath
     * @return {@code this} builder for chained invocation
     */
    public final Builder xpath(java.lang.String xpath) {
      checkNotIsSet(xpathIsSet(), "xpath");
      this.xpath = java.util.Objects.requireNonNull(xpath, "xpath");
      optBits |= OPT_BIT_XPATH;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#xpath() xpath} to xpath.
     * @param xpath The value for xpath
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("xpath")
    public final Builder xpath(java.util.Optional<java.lang.String> xpath) {
      checkNotIsSet(xpathIsSet(), "xpath");
      this.xpath = xpath.orElse(null);
      optBits |= OPT_BIT_XPATH;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#comparator() comparator} to comparator.
     * @param comparator The value for comparator
     * @return {@code this} builder for chained invocation
     */
    public final Builder comparator(java.util.List<com.fhir.SearchparameterComparatorItem> comparator) {
      checkNotIsSet(comparatorIsSet(), "comparator");
      this.comparator = java.util.Objects.requireNonNull(comparator, "comparator");
      optBits |= OPT_BIT_COMPARATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#comparator() comparator} to comparator.
     * @param comparator The value for comparator
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("comparator")
    public final Builder comparator(java.util.Optional<? extends java.util.List<com.fhir.SearchparameterComparatorItem>> comparator) {
      checkNotIsSet(comparatorIsSet(), "comparator");
      this.comparator = comparator.orElse(null);
      optBits |= OPT_BIT_COMPARATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#name() name} to name.
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
     * Initializes the optional value {@link SearchParameter#name() name} to name.
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
     * Initializes the optional value {@link SearchParameter#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    public final Builder target(java.util.List<com.fhir.code> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = java.util.Objects.requireNonNull(target, "target");
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    public final Builder target(java.util.Optional<? extends java.util.List<com.fhir.code>> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = target.orElse(null);
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link SearchParameter#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link SearchParameter#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(com.fhir.code code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends com.fhir.code> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#contact() contact} to contact.
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
     * Initializes the optional value {@link SearchParameter#contact() contact} to contact.
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
     * Initializes the optional value {@link SearchParameter#id() id} to id.
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
     * Initializes the optional value {@link SearchParameter#id() id} to id.
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
     * Initializes the optional value {@link SearchParameter#multipleAnd() multipleAnd} to multipleAnd.
     * @param multipleAnd The value for multipleAnd
     * @return {@code this} builder for chained invocation
     */
    public final Builder multipleAnd(boolean multipleAnd) {
      checkNotIsSet(multipleAndIsSet(), "multipleAnd");
      this.multipleAnd = multipleAnd;
      optBits |= OPT_BIT_MULTIPLE_AND;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#multipleAnd() multipleAnd} to multipleAnd.
     * @param multipleAnd The value for multipleAnd
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("multipleAnd")
    public final Builder multipleAnd(java.util.Optional<java.lang.Boolean> multipleAnd) {
      checkNotIsSet(multipleAndIsSet(), "multipleAnd");
      this.multipleAnd = multipleAnd.orElse(null);
      optBits |= OPT_BIT_MULTIPLE_AND;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#extension() extension} to extension.
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
     * Initializes the optional value {@link SearchParameter#extension() extension} to extension.
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
     * Initializes the optional value {@link SearchParameter#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link SearchParameter#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link SearchParameter#contained() contained} to contained.
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
     * Initializes the optional value {@link SearchParameter#contained() contained} to contained.
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
     * Initializes the optional value {@link SearchParameter#language() language} to language.
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
     * Initializes the optional value {@link SearchParameter#language() language} to language.
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
     * Initializes the optional value {@link SearchParameter#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link SearchParameter#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link SearchParameter#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for chained invocation
     */
    public final Builder base(java.util.List<com.fhir.code> base) {
      checkNotIsSet(baseIsSet(), "base");
      this.base = java.util.Objects.requireNonNull(base, "base");
      optBits |= OPT_BIT_BASE;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("base")
    public final Builder base(java.util.Optional<? extends java.util.List<com.fhir.code>> base) {
      checkNotIsSet(baseIsSet(), "base");
      this.base = base.orElse(null);
      optBits |= OPT_BIT_BASE;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#multipleOr() multipleOr} to multipleOr.
     * @param multipleOr The value for multipleOr
     * @return {@code this} builder for chained invocation
     */
    public final Builder multipleOr(boolean multipleOr) {
      checkNotIsSet(multipleOrIsSet(), "multipleOr");
      this.multipleOr = multipleOr;
      optBits |= OPT_BIT_MULTIPLE_OR;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#multipleOr() multipleOr} to multipleOr.
     * @param multipleOr The value for multipleOr
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("multipleOr")
    public final Builder multipleOr(java.util.Optional<java.lang.Boolean> multipleOr) {
      checkNotIsSet(multipleOrIsSet(), "multipleOr");
      this.multipleOr = multipleOr.orElse(null);
      optBits |= OPT_BIT_MULTIPLE_OR;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#chain() chain} to chain.
     * @param chain The value for chain
     * @return {@code this} builder for chained invocation
     */
    public final Builder chain(java.util.List<java.lang.String> chain) {
      checkNotIsSet(chainIsSet(), "chain");
      this.chain = java.util.Objects.requireNonNull(chain, "chain");
      optBits |= OPT_BIT_CHAIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#chain() chain} to chain.
     * @param chain The value for chain
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("chain")
    public final Builder chain(java.util.Optional<? extends java.util.List<java.lang.String>> chain) {
      checkNotIsSet(chainIsSet(), "chain");
      this.chain = chain.orElse(null);
      optBits |= OPT_BIT_CHAIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SearchParameter#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SearchParameter#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for chained invocation
     */
    public final Builder expression(java.lang.String expression) {
      checkNotIsSet(expressionIsSet(), "expression");
      this.expression = java.util.Objects.requireNonNull(expression, "expression");
      optBits |= OPT_BIT_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expression")
    public final Builder expression(java.util.Optional<java.lang.String> expression) {
      checkNotIsSet(expressionIsSet(), "expression");
      this.expression = expression.orElse(null);
      optBits |= OPT_BIT_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#component() component} to component.
     * @param component The value for component
     * @return {@code this} builder for chained invocation
     */
    public final Builder component(java.util.List<com.fhir.SearchParameter_Component> component) {
      checkNotIsSet(componentIsSet(), "component");
      this.component = java.util.Objects.requireNonNull(component, "component");
      optBits |= OPT_BIT_COMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#component() component} to component.
     * @param component The value for component
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("component")
    public final Builder component(java.util.Optional<? extends java.util.List<com.fhir.SearchParameter_Component>> component) {
      checkNotIsSet(componentIsSet(), "component");
      this.component = component.orElse(null);
      optBits |= OPT_BIT_COMPONENT;
      return this;
    }

    /**
     * Builds a new {@link SearchParameter SearchParameter}.
     * @return An immutable instance of SearchParameter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.SearchParameter build() {
      checkRequiredAttributes();
      return new ImmutableSearchParameter(
          derivedFrom,
          useContext,
          status,
          date,
          text,
          type,
          jurisdiction,
          description,
          modifier,
          meta,
          xpathUsage,
          modifierExtension,
          resourceType,
          url,
          version,
          xpath,
          comparator,
          name,
          target,
          experimental,
          code,
          contact,
          id,
          multipleAnd,
          extension,
          publisher,
          contained,
          language,
          purpose,
          base,
          multipleOr,
          chain,
          implicitRules,
          expression,
          component);
    }

    private boolean derivedFromIsSet() {
      return (optBits & OPT_BIT_DERIVED_FROM) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean modifierIsSet() {
      return (optBits & OPT_BIT_MODIFIER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean xpathUsageIsSet() {
      return (optBits & OPT_BIT_XPATH_USAGE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean xpathIsSet() {
      return (optBits & OPT_BIT_XPATH) != 0;
    }

    private boolean comparatorIsSet() {
      return (optBits & OPT_BIT_COMPARATOR) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean targetIsSet() {
      return (optBits & OPT_BIT_TARGET) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean multipleAndIsSet() {
      return (optBits & OPT_BIT_MULTIPLE_AND) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean baseIsSet() {
      return (optBits & OPT_BIT_BASE) != 0;
    }

    private boolean multipleOrIsSet() {
      return (optBits & OPT_BIT_MULTIPLE_OR) != 0;
    }

    private boolean chainIsSet() {
      return (optBits & OPT_BIT_CHAIN) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean expressionIsSet() {
      return (optBits & OPT_BIT_EXPRESSION) != 0;
    }

    private boolean componentIsSet() {
      return (optBits & OPT_BIT_COMPONENT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of SearchParameter is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build SearchParameter, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "SearchParameter", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link SearchParameter#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "SearchParameter", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link SearchParameter#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal derivedFrom(com.fhir.canonical derivedFrom);

    /**
     * Initializes the optional value {@link SearchParameter#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal derivedFrom(java.util.Optional<? extends com.fhir.canonical> derivedFrom);

    /**
     * Initializes the optional value {@link SearchParameter#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link SearchParameter#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link SearchParameter#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.SearchparameterStatus status);

    /**
     * Initializes the optional value {@link SearchParameter#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.SearchparameterStatus> status);

    /**
     * Initializes the optional value {@link SearchParameter#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link SearchParameter#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link SearchParameter#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link SearchParameter#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link SearchParameter#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.SearchparameterType type);

    /**
     * Initializes the optional value {@link SearchParameter#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.SearchparameterType> type);

    /**
     * Initializes the optional value {@link SearchParameter#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link SearchParameter#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link SearchParameter#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link SearchParameter#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link SearchParameter#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifier(java.util.List<com.fhir.SearchparameterModifierItem> modifier);

    /**
     * Initializes the optional value {@link SearchParameter#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifier(java.util.Optional<? extends java.util.List<com.fhir.SearchparameterModifierItem>> modifier);

    /**
     * Initializes the optional value {@link SearchParameter#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link SearchParameter#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link SearchParameter#xpathUsage() xpathUsage} to xpathUsage.
     * @param xpathUsage The value for xpathUsage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal xpathUsage(com.fhir.SearchparameterXpathusage xpathUsage);

    /**
     * Initializes the optional value {@link SearchParameter#xpathUsage() xpathUsage} to xpathUsage.
     * @param xpathUsage The value for xpathUsage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal xpathUsage(java.util.Optional<? extends com.fhir.SearchparameterXpathusage> xpathUsage);

    /**
     * Initializes the optional value {@link SearchParameter#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link SearchParameter#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link SearchParameter#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link SearchParameter#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link SearchParameter#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link SearchParameter#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link SearchParameter#xpath() xpath} to xpath.
     * @param xpath The value for xpath
     * @return {@code this} builder for chained invocation
     */
    BuildFinal xpath(java.lang.String xpath);

    /**
     * Initializes the optional value {@link SearchParameter#xpath() xpath} to xpath.
     * @param xpath The value for xpath
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal xpath(java.util.Optional<java.lang.String> xpath);

    /**
     * Initializes the optional value {@link SearchParameter#comparator() comparator} to comparator.
     * @param comparator The value for comparator
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comparator(java.util.List<com.fhir.SearchparameterComparatorItem> comparator);

    /**
     * Initializes the optional value {@link SearchParameter#comparator() comparator} to comparator.
     * @param comparator The value for comparator
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comparator(java.util.Optional<? extends java.util.List<com.fhir.SearchparameterComparatorItem>> comparator);

    /**
     * Initializes the optional value {@link SearchParameter#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link SearchParameter#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link SearchParameter#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    BuildFinal target(java.util.List<com.fhir.code> target);

    /**
     * Initializes the optional value {@link SearchParameter#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal target(java.util.Optional<? extends java.util.List<com.fhir.code>> target);

    /**
     * Initializes the optional value {@link SearchParameter#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link SearchParameter#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(java.util.Optional<java.lang.Boolean> experimental);

    /**
     * Initializes the optional value {@link SearchParameter#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(com.fhir.code code);

    /**
     * Initializes the optional value {@link SearchParameter#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(java.util.Optional<? extends com.fhir.code> code);

    /**
     * Initializes the optional value {@link SearchParameter#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link SearchParameter#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link SearchParameter#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link SearchParameter#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link SearchParameter#multipleAnd() multipleAnd} to multipleAnd.
     * @param multipleAnd The value for multipleAnd
     * @return {@code this} builder for chained invocation
     */
    BuildFinal multipleAnd(boolean multipleAnd);

    /**
     * Initializes the optional value {@link SearchParameter#multipleAnd() multipleAnd} to multipleAnd.
     * @param multipleAnd The value for multipleAnd
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal multipleAnd(java.util.Optional<java.lang.Boolean> multipleAnd);

    /**
     * Initializes the optional value {@link SearchParameter#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link SearchParameter#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link SearchParameter#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link SearchParameter#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link SearchParameter#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link SearchParameter#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link SearchParameter#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link SearchParameter#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link SearchParameter#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(com.fhir.markdown purpose);

    /**
     * Initializes the optional value {@link SearchParameter#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(java.util.Optional<? extends com.fhir.markdown> purpose);

    /**
     * Initializes the optional value {@link SearchParameter#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for chained invocation
     */
    BuildFinal base(java.util.List<com.fhir.code> base);

    /**
     * Initializes the optional value {@link SearchParameter#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal base(java.util.Optional<? extends java.util.List<com.fhir.code>> base);

    /**
     * Initializes the optional value {@link SearchParameter#multipleOr() multipleOr} to multipleOr.
     * @param multipleOr The value for multipleOr
     * @return {@code this} builder for chained invocation
     */
    BuildFinal multipleOr(boolean multipleOr);

    /**
     * Initializes the optional value {@link SearchParameter#multipleOr() multipleOr} to multipleOr.
     * @param multipleOr The value for multipleOr
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal multipleOr(java.util.Optional<java.lang.Boolean> multipleOr);

    /**
     * Initializes the optional value {@link SearchParameter#chain() chain} to chain.
     * @param chain The value for chain
     * @return {@code this} builder for chained invocation
     */
    BuildFinal chain(java.util.List<java.lang.String> chain);

    /**
     * Initializes the optional value {@link SearchParameter#chain() chain} to chain.
     * @param chain The value for chain
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal chain(java.util.Optional<? extends java.util.List<java.lang.String>> chain);

    /**
     * Initializes the optional value {@link SearchParameter#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link SearchParameter#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link SearchParameter#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for chained invocation
     */
    BuildFinal expression(java.lang.String expression);

    /**
     * Initializes the optional value {@link SearchParameter#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal expression(java.util.Optional<java.lang.String> expression);

    /**
     * Initializes the optional value {@link SearchParameter#component() component} to component.
     * @param component The value for component
     * @return {@code this} builder for chained invocation
     */
    BuildFinal component(java.util.List<com.fhir.SearchParameter_Component> component);

    /**
     * Initializes the optional value {@link SearchParameter#component() component} to component.
     * @param component The value for component
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal component(java.util.Optional<? extends java.util.List<com.fhir.SearchParameter_Component>> component);

    /**
     * Builds a new {@link SearchParameter SearchParameter}.
     * @return An immutable instance of SearchParameter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    SearchParameter build();
  }
}
