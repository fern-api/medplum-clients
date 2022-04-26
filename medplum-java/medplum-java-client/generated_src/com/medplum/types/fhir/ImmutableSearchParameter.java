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
 * Immutable implementation of {@link SearchParameter}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSearchParameter.builder()}.
 */
@Generated(from = "SearchParameter", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSearchParameter implements SearchParameter {
  private final @Nullable String version;
  private final @Nullable Code code;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<SearchparameterModifierItem> modifier;
  private final @Nullable Boolean multipleAnd;
  private final @Nullable SearchparameterXpathusage xpathUsage;
  private final @Nullable List<UsageContext> useContext;
  private final @Nullable DateTime date;
  private final @Nullable String expression;
  private final @Nullable List<SearchparameterComparatorItem> comparator;
  private final @Nullable Narrative text;
  private final @Nullable List<SearchParameter_Component> component;
  private final @Nullable Markdown description;
  private final @Nullable Id id;
  private final @Nullable List<ContactDetail> contact;
  private final @Nullable Meta meta;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable SearchparameterType type;
  private final @Nullable Boolean multipleOr;
  private final @Nullable String xpath;
  private final String resourceType;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Uri url;
  private final @Nullable Canonical derivedFrom;
  private final @Nullable List<String> chain;
  private final @Nullable List<Code> target;
  private final @Nullable String publisher;
  private final @Nullable List<Code> base;
  private final @Nullable Code language;
  private final @Nullable Boolean experimental;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final @Nullable Markdown purpose;
  private final @Nullable String name;
  private final @Nullable SearchparameterStatus status;

  private ImmutableSearchParameter(
      @Nullable String version,
      @Nullable Code code,
      @Nullable Uri implicitRules,
      @Nullable List<SearchparameterModifierItem> modifier,
      @Nullable Boolean multipleAnd,
      @Nullable SearchparameterXpathusage xpathUsage,
      @Nullable List<UsageContext> useContext,
      @Nullable DateTime date,
      @Nullable String expression,
      @Nullable List<SearchparameterComparatorItem> comparator,
      @Nullable Narrative text,
      @Nullable List<SearchParameter_Component> component,
      @Nullable Markdown description,
      @Nullable Id id,
      @Nullable List<ContactDetail> contact,
      @Nullable Meta meta,
      @Nullable List<Extension> modifierExtension,
      @Nullable SearchparameterType type,
      @Nullable Boolean multipleOr,
      @Nullable String xpath,
      String resourceType,
      @Nullable List<ResourceList> contained,
      @Nullable Uri url,
      @Nullable Canonical derivedFrom,
      @Nullable List<String> chain,
      @Nullable List<Code> target,
      @Nullable String publisher,
      @Nullable List<Code> base,
      @Nullable Code language,
      @Nullable Boolean experimental,
      @Nullable List<Extension> extension,
      @Nullable List<CodeableConcept> jurisdiction,
      @Nullable Markdown purpose,
      @Nullable String name,
      @Nullable SearchparameterStatus status) {
    this.version = version;
    this.code = code;
    this.implicitRules = implicitRules;
    this.modifier = modifier;
    this.multipleAnd = multipleAnd;
    this.xpathUsage = xpathUsage;
    this.useContext = useContext;
    this.date = date;
    this.expression = expression;
    this.comparator = comparator;
    this.text = text;
    this.component = component;
    this.description = description;
    this.id = id;
    this.contact = contact;
    this.meta = meta;
    this.modifierExtension = modifierExtension;
    this.type = type;
    this.multipleOr = multipleOr;
    this.xpath = xpath;
    this.resourceType = resourceType;
    this.contained = contained;
    this.url = url;
    this.derivedFrom = derivedFrom;
    this.chain = chain;
    this.target = target;
    this.publisher = publisher;
    this.base = base;
    this.language = language;
    this.experimental = experimental;
    this.extension = extension;
    this.jurisdiction = jurisdiction;
    this.purpose = purpose;
    this.name = name;
    this.status = status;
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<Code> code() {
    return Optional.ofNullable(code);
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
   * @return The value of the {@code modifier} attribute
   */
  @JsonProperty("modifier")
  @Override
  public Optional<List<SearchparameterModifierItem>> modifier() {
    return Optional.ofNullable(modifier);
  }

  /**
   * @return The value of the {@code multipleAnd} attribute
   */
  @JsonProperty("multipleAnd")
  @Override
  public Optional<Boolean> multipleAnd() {
    return Optional.ofNullable(multipleAnd);
  }

  /**
   * @return The value of the {@code xpathUsage} attribute
   */
  @JsonProperty("xpathUsage")
  @Override
  public Optional<SearchparameterXpathusage> xpathUsage() {
    return Optional.ofNullable(xpathUsage);
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
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
  }

  /**
   * @return The value of the {@code expression} attribute
   */
  @JsonProperty("expression")
  @Override
  public Optional<String> expression() {
    return Optional.ofNullable(expression);
  }

  /**
   * @return The value of the {@code comparator} attribute
   */
  @JsonProperty("comparator")
  @Override
  public Optional<List<SearchparameterComparatorItem>> comparator() {
    return Optional.ofNullable(comparator);
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
   * @return The value of the {@code component} attribute
   */
  @JsonProperty("component")
  @Override
  public Optional<List<SearchParameter_Component>> component() {
    return Optional.ofNullable(component);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<SearchparameterType> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code multipleOr} attribute
   */
  @JsonProperty("multipleOr")
  @Override
  public Optional<Boolean> multipleOr() {
    return Optional.ofNullable(multipleOr);
  }

  /**
   * @return The value of the {@code xpath} attribute
   */
  @JsonProperty("xpath")
  @Override
  public Optional<String> xpath() {
    return Optional.ofNullable(xpath);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code derivedFrom} attribute
   */
  @JsonProperty("derivedFrom")
  @Override
  public Optional<Canonical> derivedFrom() {
    return Optional.ofNullable(derivedFrom);
  }

  /**
   * @return The value of the {@code chain} attribute
   */
  @JsonProperty("chain")
  @Override
  public Optional<List<String>> chain() {
    return Optional.ofNullable(chain);
  }

  /**
   * @return The value of the {@code target} attribute
   */
  @JsonProperty("target")
  @Override
  public Optional<List<Code>> target() {
    return Optional.ofNullable(target);
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
   * @return The value of the {@code base} attribute
   */
  @JsonProperty("base")
  @Override
  public Optional<List<Code>> base() {
    return Optional.ofNullable(base);
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
   * @return The value of the {@code experimental} attribute
   */
  @JsonProperty("experimental")
  @Override
  public Optional<Boolean> experimental() {
    return Optional.ofNullable(experimental);
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @JsonProperty("jurisdiction")
  @Override
  public Optional<List<CodeableConcept>> jurisdiction() {
    return Optional.ofNullable(jurisdiction);
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
  public Optional<SearchparameterStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableSearchParameter(
        newValue,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableSearchParameter(
        value,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withCode(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        newValue,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withCode(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        value,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        newValue,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        value,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#modifier() modifier} attribute.
   * @param value The value for modifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withModifier(List<SearchparameterModifierItem> value) {
    @Nullable List<SearchparameterModifierItem> newValue = Objects.requireNonNull(value, "modifier");
    if (this.modifier == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        newValue,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#modifier() modifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withModifier(Optional<? extends List<SearchparameterModifierItem>> optional) {
    @Nullable List<SearchparameterModifierItem> value = optional.orElse(null);
    if (this.modifier == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        value,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#multipleAnd() multipleAnd} attribute.
   * @param value The value for multipleAnd
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withMultipleAnd(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.multipleAnd, newValue)) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        newValue,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#multipleAnd() multipleAnd} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for multipleAnd
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withMultipleAnd(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.multipleAnd, value)) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        value,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#xpathUsage() xpathUsage} attribute.
   * @param value The value for xpathUsage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withXpathUsage(SearchparameterXpathusage value) {
    @Nullable SearchparameterXpathusage newValue = Objects.requireNonNull(value, "xpathUsage");
    if (this.xpathUsage == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        newValue,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#xpathUsage() xpathUsage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for xpathUsage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withXpathUsage(Optional<? extends SearchparameterXpathusage> optional) {
    @Nullable SearchparameterXpathusage value = optional.orElse(null);
    if (this.xpathUsage == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        value,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withUseContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        newValue,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withUseContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        value,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        newValue,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        value,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#expression() expression} attribute.
   * @param value The value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withExpression(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "expression");
    if (Objects.equals(this.expression, newValue)) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        newValue,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#expression() expression} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expression
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withExpression(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.expression, value)) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        value,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#comparator() comparator} attribute.
   * @param value The value for comparator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withComparator(List<SearchparameterComparatorItem> value) {
    @Nullable List<SearchparameterComparatorItem> newValue = Objects.requireNonNull(value, "comparator");
    if (this.comparator == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        newValue,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#comparator() comparator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comparator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withComparator(Optional<? extends List<SearchparameterComparatorItem>> optional) {
    @Nullable List<SearchparameterComparatorItem> value = optional.orElse(null);
    if (this.comparator == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        value,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        newValue,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        value,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#component() component} attribute.
   * @param value The value for component
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withComponent(List<SearchParameter_Component> value) {
    @Nullable List<SearchParameter_Component> newValue = Objects.requireNonNull(value, "component");
    if (this.component == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        newValue,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#component() component} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for component
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withComponent(Optional<? extends List<SearchParameter_Component>> optional) {
    @Nullable List<SearchParameter_Component> value = optional.orElse(null);
    if (this.component == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        value,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        newValue,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        value,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        newValue,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        value,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        newValue,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        value,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        newValue,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        value,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        newValue,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        value,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withType(SearchparameterType value) {
    @Nullable SearchparameterType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        newValue,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withType(Optional<? extends SearchparameterType> optional) {
    @Nullable SearchparameterType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        value,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#multipleOr() multipleOr} attribute.
   * @param value The value for multipleOr
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withMultipleOr(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.multipleOr, newValue)) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        newValue,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#multipleOr() multipleOr} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for multipleOr
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withMultipleOr(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.multipleOr, value)) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        value,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#xpath() xpath} attribute.
   * @param value The value for xpath
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withXpath(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "xpath");
    if (Objects.equals(this.xpath, newValue)) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        newValue,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#xpath() xpath} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for xpath
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withXpath(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.xpath, value)) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        value,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SearchParameter#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSearchParameter withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        newValue,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        newValue,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        value,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        newValue,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        value,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#derivedFrom() derivedFrom} attribute.
   * @param value The value for derivedFrom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withDerivedFrom(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "derivedFrom");
    if (this.derivedFrom == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        newValue,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#derivedFrom() derivedFrom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for derivedFrom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withDerivedFrom(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.derivedFrom == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        value,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#chain() chain} attribute.
   * @param value The value for chain
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withChain(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "chain");
    if (this.chain == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        newValue,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#chain() chain} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for chain
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withChain(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.chain == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        value,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#target() target} attribute.
   * @param value The value for target
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withTarget(List<Code> value) {
    @Nullable List<Code> newValue = Objects.requireNonNull(value, "target");
    if (this.target == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        newValue,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#target() target} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for target
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withTarget(Optional<? extends List<Code>> optional) {
    @Nullable List<Code> value = optional.orElse(null);
    if (this.target == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        value,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withPublisher(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "publisher");
    if (Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        newValue,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withPublisher(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.publisher, value)) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        value,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#base() base} attribute.
   * @param value The value for base
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withBase(List<Code> value) {
    @Nullable List<Code> newValue = Objects.requireNonNull(value, "base");
    if (this.base == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        newValue,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#base() base} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for base
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withBase(Optional<? extends List<Code>> optional) {
    @Nullable List<Code> value = optional.orElse(null);
    if (this.base == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        value,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        newValue,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        value,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withExperimental(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        newValue,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withExperimental(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.experimental, value)) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        value,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        newValue,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        value,
        this.jurisdiction,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        newValue,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        value,
        this.purpose,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withPurpose(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        newValue,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withPurpose(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        value,
        this.name,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        newValue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        value,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SearchParameter#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSearchParameter withStatus(SearchparameterStatus value) {
    @Nullable SearchparameterStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SearchParameter#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSearchParameter withStatus(Optional<? extends SearchparameterStatus> optional) {
    @Nullable SearchparameterStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableSearchParameter(
        this.version,
        this.code,
        this.implicitRules,
        this.modifier,
        this.multipleAnd,
        this.xpathUsage,
        this.useContext,
        this.date,
        this.expression,
        this.comparator,
        this.text,
        this.component,
        this.description,
        this.id,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.type,
        this.multipleOr,
        this.xpath,
        this.resourceType,
        this.contained,
        this.url,
        this.derivedFrom,
        this.chain,
        this.target,
        this.publisher,
        this.base,
        this.language,
        this.experimental,
        this.extension,
        this.jurisdiction,
        this.purpose,
        this.name,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSearchParameter} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSearchParameter
        && equalTo((ImmutableSearchParameter) another);
  }

  private boolean equalTo(ImmutableSearchParameter another) {
    return Objects.equals(version, another.version)
        && Objects.equals(code, another.code)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(modifier, another.modifier)
        && Objects.equals(multipleAnd, another.multipleAnd)
        && Objects.equals(xpathUsage, another.xpathUsage)
        && Objects.equals(useContext, another.useContext)
        && Objects.equals(date, another.date)
        && Objects.equals(expression, another.expression)
        && Objects.equals(comparator, another.comparator)
        && Objects.equals(text, another.text)
        && Objects.equals(component, another.component)
        && Objects.equals(description, another.description)
        && Objects.equals(id, another.id)
        && Objects.equals(contact, another.contact)
        && Objects.equals(meta, another.meta)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(type, another.type)
        && Objects.equals(multipleOr, another.multipleOr)
        && Objects.equals(xpath, another.xpath)
        && resourceType.equals(another.resourceType)
        && Objects.equals(contained, another.contained)
        && Objects.equals(url, another.url)
        && Objects.equals(derivedFrom, another.derivedFrom)
        && Objects.equals(chain, another.chain)
        && Objects.equals(target, another.target)
        && Objects.equals(publisher, another.publisher)
        && Objects.equals(base, another.base)
        && Objects.equals(language, another.language)
        && Objects.equals(experimental, another.experimental)
        && Objects.equals(extension, another.extension)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(purpose, another.purpose)
        && Objects.equals(name, another.name)
        && Objects.equals(status, another.status);
  }

  /**
   * Computes a hash code from attributes: {@code version}, {@code code}, {@code implicitRules}, {@code modifier}, {@code multipleAnd}, {@code xpathUsage}, {@code useContext}, {@code date}, {@code expression}, {@code comparator}, {@code text}, {@code component}, {@code description}, {@code id}, {@code contact}, {@code meta}, {@code modifierExtension}, {@code type}, {@code multipleOr}, {@code xpath}, {@code resourceType}, {@code contained}, {@code url}, {@code derivedFrom}, {@code chain}, {@code target}, {@code publisher}, {@code base}, {@code language}, {@code experimental}, {@code extension}, {@code jurisdiction}, {@code purpose}, {@code name}, {@code status}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(modifier);
    h += (h << 5) + Objects.hashCode(multipleAnd);
    h += (h << 5) + Objects.hashCode(xpathUsage);
    h += (h << 5) + Objects.hashCode(useContext);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(expression);
    h += (h << 5) + Objects.hashCode(comparator);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(component);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(multipleOr);
    h += (h << 5) + Objects.hashCode(xpath);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(derivedFrom);
    h += (h << 5) + Objects.hashCode(chain);
    h += (h << 5) + Objects.hashCode(target);
    h += (h << 5) + Objects.hashCode(publisher);
    h += (h << 5) + Objects.hashCode(base);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(experimental);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(purpose);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(status);
    return h;
  }

  /**
   * Prints the immutable value {@code SearchParameter} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SearchParameter{");
    if (version != null) {
      builder.append("version=").append(version);
    }
    if (code != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (implicitRules != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (modifier != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("modifier=").append(modifier);
    }
    if (multipleAnd != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("multipleAnd=").append(multipleAnd);
    }
    if (xpathUsage != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("xpathUsage=").append(xpathUsage);
    }
    if (useContext != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (date != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (expression != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("expression=").append(expression);
    }
    if (comparator != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("comparator=").append(comparator);
    }
    if (text != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (component != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("component=").append(component);
    }
    if (description != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (id != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (contact != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (meta != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (modifierExtension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (type != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (multipleOr != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("multipleOr=").append(multipleOr);
    }
    if (xpath != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("xpath=").append(xpath);
    }
    if (builder.length() > 16) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (derivedFrom != null) {
      builder.append(", ");
      builder.append("derivedFrom=").append(derivedFrom);
    }
    if (chain != null) {
      builder.append(", ");
      builder.append("chain=").append(chain);
    }
    if (target != null) {
      builder.append(", ");
      builder.append("target=").append(target);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (base != null) {
      builder.append(", ");
      builder.append("base=").append(base);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (purpose != null) {
      builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SearchParameter", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SearchParameter {
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<Code> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<SearchparameterModifierItem>> modifier = Optional.empty();
    boolean modifierIsSet;
    @Nullable Optional<Boolean> multipleAnd = Optional.empty();
    boolean multipleAndIsSet;
    @Nullable Optional<SearchparameterXpathusage> xpathUsage = Optional.empty();
    boolean xpathUsageIsSet;
    @Nullable Optional<List<UsageContext>> useContext = Optional.empty();
    boolean useContextIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<String> expression = Optional.empty();
    boolean expressionIsSet;
    @Nullable Optional<List<SearchparameterComparatorItem>> comparator = Optional.empty();
    boolean comparatorIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<SearchParameter_Component>> component = Optional.empty();
    boolean componentIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<SearchparameterType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Boolean> multipleOr = Optional.empty();
    boolean multipleOrIsSet;
    @Nullable Optional<String> xpath = Optional.empty();
    boolean xpathIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<Canonical> derivedFrom = Optional.empty();
    boolean derivedFromIsSet;
    @Nullable Optional<List<String>> chain = Optional.empty();
    boolean chainIsSet;
    @Nullable Optional<List<Code>> target = Optional.empty();
    boolean targetIsSet;
    @Nullable Optional<String> publisher = Optional.empty();
    boolean publisherIsSet;
    @Nullable Optional<List<Code>> base = Optional.empty();
    boolean baseIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Boolean> experimental = Optional.empty();
    boolean experimentalIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<Markdown> purpose = Optional.empty();
    boolean purposeIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<SearchparameterStatus> status = Optional.empty();
    boolean statusIsSet;
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<Code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("modifier")
    public void setModifier(Optional<List<SearchparameterModifierItem>> modifier) {
      this.modifier = modifier;
      this.modifierIsSet = true;
    }
    @JsonProperty("multipleAnd")
    public void setMultipleAnd(Optional<Boolean> multipleAnd) {
      this.multipleAnd = multipleAnd;
      this.multipleAndIsSet = true;
    }
    @JsonProperty("xpathUsage")
    public void setXpathUsage(Optional<SearchparameterXpathusage> xpathUsage) {
      this.xpathUsage = xpathUsage;
      this.xpathUsageIsSet = true;
    }
    @JsonProperty("useContext")
    public void setUseContext(Optional<List<UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("expression")
    public void setExpression(Optional<String> expression) {
      this.expression = expression;
      this.expressionIsSet = true;
    }
    @JsonProperty("comparator")
    public void setComparator(Optional<List<SearchparameterComparatorItem>> comparator) {
      this.comparator = comparator;
      this.comparatorIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("component")
    public void setComponent(Optional<List<SearchParameter_Component>> component) {
      this.component = component;
      this.componentIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<SearchparameterType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("multipleOr")
    public void setMultipleOr(Optional<Boolean> multipleOr) {
      this.multipleOr = multipleOr;
      this.multipleOrIsSet = true;
    }
    @JsonProperty("xpath")
    public void setXpath(Optional<String> xpath) {
      this.xpath = xpath;
      this.xpathIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("derivedFrom")
    public void setDerivedFrom(Optional<Canonical> derivedFrom) {
      this.derivedFrom = derivedFrom;
      this.derivedFromIsSet = true;
    }
    @JsonProperty("chain")
    public void setChain(Optional<List<String>> chain) {
      this.chain = chain;
      this.chainIsSet = true;
    }
    @JsonProperty("target")
    public void setTarget(Optional<List<Code>> target) {
      this.target = target;
      this.targetIsSet = true;
    }
    @JsonProperty("publisher")
    public void setPublisher(Optional<String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @JsonProperty("base")
    public void setBase(Optional<List<Code>> base) {
      this.base = base;
      this.baseIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("experimental")
    public void setExperimental(Optional<Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<List<CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("purpose")
    public void setPurpose(Optional<Markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<SearchparameterStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SearchparameterModifierItem>> modifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> multipleAnd() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SearchparameterXpathusage> xpathUsage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> expression() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SearchparameterComparatorItem>> comparator() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SearchParameter_Component>> component() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SearchparameterType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> multipleOr() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> xpath() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> derivedFrom() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> chain() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Code>> target() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Code>> base() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SearchparameterStatus> status() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSearchParameter fromJson(Json json) {
    ImmutableSearchParameter.Builder builder = ((ImmutableSearchParameter.Builder) ImmutableSearchParameter.builder());
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.modifierIsSet) {
      builder.modifier(json.modifier);
    }
    if (json.multipleAndIsSet) {
      builder.multipleAnd(json.multipleAnd);
    }
    if (json.xpathUsageIsSet) {
      builder.xpathUsage(json.xpathUsage);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.expressionIsSet) {
      builder.expression(json.expression);
    }
    if (json.comparatorIsSet) {
      builder.comparator(json.comparator);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.componentIsSet) {
      builder.component(json.component);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.multipleOrIsSet) {
      builder.multipleOr(json.multipleOr);
    }
    if (json.xpathIsSet) {
      builder.xpath(json.xpath);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.derivedFromIsSet) {
      builder.derivedFrom(json.derivedFrom);
    }
    if (json.chainIsSet) {
      builder.chain(json.chain);
    }
    if (json.targetIsSet) {
      builder.target(json.target);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.baseIsSet) {
      builder.base(json.base);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
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
        .version(instance.version())
        .code(instance.code())
        .implicitRules(instance.implicitRules())
        .modifier(instance.modifier())
        .multipleAnd(instance.multipleAnd())
        .xpathUsage(instance.xpathUsage())
        .useContext(instance.useContext())
        .date(instance.date())
        .expression(instance.expression())
        .comparator(instance.comparator())
        .text(instance.text())
        .component(instance.component())
        .description(instance.description())
        .id(instance.id())
        .contact(instance.contact())
        .meta(instance.meta())
        .modifierExtension(instance.modifierExtension())
        .type(instance.type())
        .multipleOr(instance.multipleOr())
        .xpath(instance.xpath())
        .resourceType(instance.resourceType())
        .contained(instance.contained())
        .url(instance.url())
        .derivedFrom(instance.derivedFrom())
        .chain(instance.chain())
        .target(instance.target())
        .publisher(instance.publisher())
        .base(instance.base())
        .language(instance.language())
        .experimental(instance.experimental())
        .extension(instance.extension())
        .jurisdiction(instance.jurisdiction())
        .purpose(instance.purpose())
        .name(instance.name())
        .status(instance.status())
        .build();
  }

  /**
   * Creates a builder for {@link SearchParameter SearchParameter}.
   * <pre>
   * ImmutableSearchParameter.builder()
   *    .version(String) // optional {@link SearchParameter#version() version}
   *    .code(com.medplum.types.fhir.Code) // optional {@link SearchParameter#code() code}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link SearchParameter#implicitRules() implicitRules}
   *    .modifier(List&amp;lt;com.medplum.types.fhir.SearchparameterModifierItem&amp;gt;) // optional {@link SearchParameter#modifier() modifier}
   *    .multipleAnd(Boolean) // optional {@link SearchParameter#multipleAnd() multipleAnd}
   *    .xpathUsage(com.medplum.types.fhir.SearchparameterXpathusage) // optional {@link SearchParameter#xpathUsage() xpathUsage}
   *    .useContext(List&amp;lt;com.medplum.types.fhir.UsageContext&amp;gt;) // optional {@link SearchParameter#useContext() useContext}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link SearchParameter#date() date}
   *    .expression(String) // optional {@link SearchParameter#expression() expression}
   *    .comparator(List&amp;lt;com.medplum.types.fhir.SearchparameterComparatorItem&amp;gt;) // optional {@link SearchParameter#comparator() comparator}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link SearchParameter#text() text}
   *    .component(List&amp;lt;com.medplum.types.fhir.SearchParameter_Component&amp;gt;) // optional {@link SearchParameter#component() component}
   *    .description(com.medplum.types.fhir.Markdown) // optional {@link SearchParameter#description() description}
   *    .id(com.medplum.types.fhir.Id) // optional {@link SearchParameter#id() id}
   *    .contact(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link SearchParameter#contact() contact}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link SearchParameter#meta() meta}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SearchParameter#modifierExtension() modifierExtension}
   *    .type(com.medplum.types.fhir.SearchparameterType) // optional {@link SearchParameter#type() type}
   *    .multipleOr(Boolean) // optional {@link SearchParameter#multipleOr() multipleOr}
   *    .xpath(String) // optional {@link SearchParameter#xpath() xpath}
   *    .resourceType(String) // required {@link SearchParameter#resourceType() resourceType}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link SearchParameter#contained() contained}
   *    .url(com.medplum.types.fhir.Uri) // optional {@link SearchParameter#url() url}
   *    .derivedFrom(com.medplum.types.fhir.Canonical) // optional {@link SearchParameter#derivedFrom() derivedFrom}
   *    .chain(List&amp;lt;String&amp;gt;) // optional {@link SearchParameter#chain() chain}
   *    .target(List&amp;lt;com.medplum.types.fhir.Code&amp;gt;) // optional {@link SearchParameter#target() target}
   *    .publisher(String) // optional {@link SearchParameter#publisher() publisher}
   *    .base(List&amp;lt;com.medplum.types.fhir.Code&amp;gt;) // optional {@link SearchParameter#base() base}
   *    .language(com.medplum.types.fhir.Code) // optional {@link SearchParameter#language() language}
   *    .experimental(Boolean) // optional {@link SearchParameter#experimental() experimental}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SearchParameter#extension() extension}
   *    .jurisdiction(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link SearchParameter#jurisdiction() jurisdiction}
   *    .purpose(com.medplum.types.fhir.Markdown) // optional {@link SearchParameter#purpose() purpose}
   *    .name(String) // optional {@link SearchParameter#name() name}
   *    .status(com.medplum.types.fhir.SearchparameterStatus) // optional {@link SearchParameter#status() status}
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
  @Generated(from = "SearchParameter", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_VERSION = 0x1L;
    private static final long OPT_BIT_CODE = 0x2L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4L;
    private static final long OPT_BIT_MODIFIER = 0x8L;
    private static final long OPT_BIT_MULTIPLE_AND = 0x10L;
    private static final long OPT_BIT_XPATH_USAGE = 0x20L;
    private static final long OPT_BIT_USE_CONTEXT = 0x40L;
    private static final long OPT_BIT_DATE = 0x80L;
    private static final long OPT_BIT_EXPRESSION = 0x100L;
    private static final long OPT_BIT_COMPARATOR = 0x200L;
    private static final long OPT_BIT_TEXT = 0x400L;
    private static final long OPT_BIT_COMPONENT = 0x800L;
    private static final long OPT_BIT_DESCRIPTION = 0x1000L;
    private static final long OPT_BIT_ID = 0x2000L;
    private static final long OPT_BIT_CONTACT = 0x4000L;
    private static final long OPT_BIT_META = 0x8000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10000L;
    private static final long OPT_BIT_TYPE = 0x20000L;
    private static final long OPT_BIT_MULTIPLE_OR = 0x40000L;
    private static final long OPT_BIT_XPATH = 0x80000L;
    private static final long OPT_BIT_CONTAINED = 0x100000L;
    private static final long OPT_BIT_URL = 0x200000L;
    private static final long OPT_BIT_DERIVED_FROM = 0x400000L;
    private static final long OPT_BIT_CHAIN = 0x800000L;
    private static final long OPT_BIT_TARGET = 0x1000000L;
    private static final long OPT_BIT_PUBLISHER = 0x2000000L;
    private static final long OPT_BIT_BASE = 0x4000000L;
    private static final long OPT_BIT_LANGUAGE = 0x8000000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x10000000L;
    private static final long OPT_BIT_EXTENSION = 0x20000000L;
    private static final long OPT_BIT_JURISDICTION = 0x40000000L;
    private static final long OPT_BIT_PURPOSE = 0x80000000L;
    private static final long OPT_BIT_NAME = 0x100000000L;
    private static final long OPT_BIT_STATUS = 0x200000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String version;
    private @Nullable Code code;
    private @Nullable Uri implicitRules;
    private @Nullable List<SearchparameterModifierItem> modifier;
    private @Nullable Boolean multipleAnd;
    private @Nullable SearchparameterXpathusage xpathUsage;
    private @Nullable List<UsageContext> useContext;
    private @Nullable DateTime date;
    private @Nullable String expression;
    private @Nullable List<SearchparameterComparatorItem> comparator;
    private @Nullable Narrative text;
    private @Nullable List<SearchParameter_Component> component;
    private @Nullable Markdown description;
    private @Nullable Id id;
    private @Nullable List<ContactDetail> contact;
    private @Nullable Meta meta;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable SearchparameterType type;
    private @Nullable Boolean multipleOr;
    private @Nullable String xpath;
    private @Nullable String resourceType;
    private @Nullable List<ResourceList> contained;
    private @Nullable Uri url;
    private @Nullable Canonical derivedFrom;
    private @Nullable List<String> chain;
    private @Nullable List<Code> target;
    private @Nullable String publisher;
    private @Nullable List<Code> base;
    private @Nullable Code language;
    private @Nullable Boolean experimental;
    private @Nullable List<Extension> extension;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable Markdown purpose;
    private @Nullable String name;
    private @Nullable SearchparameterStatus status;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SearchParameter#version() version} to version.
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
     * Initializes the optional value {@link SearchParameter#version() version} to version.
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
     * Initializes the optional value {@link SearchParameter#code() code} to code.
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
     * Initializes the optional value {@link SearchParameter#code() code} to code.
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
     * Initializes the optional value {@link SearchParameter#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SearchParameter#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SearchParameter#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifier(List<SearchparameterModifierItem> modifier) {
      checkNotIsSet(modifierIsSet(), "modifier");
      this.modifier = Objects.requireNonNull(modifier, "modifier");
      optBits |= OPT_BIT_MODIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifier")
    public final Builder modifier(Optional<? extends List<SearchparameterModifierItem>> modifier) {
      checkNotIsSet(modifierIsSet(), "modifier");
      this.modifier = modifier.orElse(null);
      optBits |= OPT_BIT_MODIFIER;
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
    @JsonProperty("multipleAnd")
    public final Builder multipleAnd(Optional<Boolean> multipleAnd) {
      checkNotIsSet(multipleAndIsSet(), "multipleAnd");
      this.multipleAnd = multipleAnd.orElse(null);
      optBits |= OPT_BIT_MULTIPLE_AND;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#xpathUsage() xpathUsage} to xpathUsage.
     * @param xpathUsage The value for xpathUsage
     * @return {@code this} builder for chained invocation
     */
    public final Builder xpathUsage(SearchparameterXpathusage xpathUsage) {
      checkNotIsSet(xpathUsageIsSet(), "xpathUsage");
      this.xpathUsage = Objects.requireNonNull(xpathUsage, "xpathUsage");
      optBits |= OPT_BIT_XPATH_USAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#xpathUsage() xpathUsage} to xpathUsage.
     * @param xpathUsage The value for xpathUsage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("xpathUsage")
    public final Builder xpathUsage(Optional<? extends SearchparameterXpathusage> xpathUsage) {
      checkNotIsSet(xpathUsageIsSet(), "xpathUsage");
      this.xpathUsage = xpathUsage.orElse(null);
      optBits |= OPT_BIT_XPATH_USAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link SearchParameter#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link SearchParameter#date() date} to date.
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
     * Initializes the optional value {@link SearchParameter#date() date} to date.
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
     * Initializes the optional value {@link SearchParameter#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for chained invocation
     */
    public final Builder expression(String expression) {
      checkNotIsSet(expressionIsSet(), "expression");
      this.expression = Objects.requireNonNull(expression, "expression");
      optBits |= OPT_BIT_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("expression")
    public final Builder expression(Optional<String> expression) {
      checkNotIsSet(expressionIsSet(), "expression");
      this.expression = expression.orElse(null);
      optBits |= OPT_BIT_EXPRESSION;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#comparator() comparator} to comparator.
     * @param comparator The value for comparator
     * @return {@code this} builder for chained invocation
     */
    public final Builder comparator(List<SearchparameterComparatorItem> comparator) {
      checkNotIsSet(comparatorIsSet(), "comparator");
      this.comparator = Objects.requireNonNull(comparator, "comparator");
      optBits |= OPT_BIT_COMPARATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#comparator() comparator} to comparator.
     * @param comparator The value for comparator
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("comparator")
    public final Builder comparator(Optional<? extends List<SearchparameterComparatorItem>> comparator) {
      checkNotIsSet(comparatorIsSet(), "comparator");
      this.comparator = comparator.orElse(null);
      optBits |= OPT_BIT_COMPARATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#text() text} to text.
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
     * Initializes the optional value {@link SearchParameter#text() text} to text.
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
     * Initializes the optional value {@link SearchParameter#component() component} to component.
     * @param component The value for component
     * @return {@code this} builder for chained invocation
     */
    public final Builder component(List<SearchParameter_Component> component) {
      checkNotIsSet(componentIsSet(), "component");
      this.component = Objects.requireNonNull(component, "component");
      optBits |= OPT_BIT_COMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#component() component} to component.
     * @param component The value for component
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("component")
    public final Builder component(Optional<? extends List<SearchParameter_Component>> component) {
      checkNotIsSet(componentIsSet(), "component");
      this.component = component.orElse(null);
      optBits |= OPT_BIT_COMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#description() description} to description.
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
     * Initializes the optional value {@link SearchParameter#description() description} to description.
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
     * Initializes the optional value {@link SearchParameter#id() id} to id.
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
     * Initializes the optional value {@link SearchParameter#id() id} to id.
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
     * Initializes the optional value {@link SearchParameter#contact() contact} to contact.
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
     * Initializes the optional value {@link SearchParameter#contact() contact} to contact.
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
     * Initializes the optional value {@link SearchParameter#meta() meta} to meta.
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
     * Initializes the optional value {@link SearchParameter#meta() meta} to meta.
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
     * Initializes the optional value {@link SearchParameter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SearchParameter#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SearchParameter#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(SearchparameterType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends SearchparameterType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
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
    @JsonProperty("multipleOr")
    public final Builder multipleOr(Optional<Boolean> multipleOr) {
      checkNotIsSet(multipleOrIsSet(), "multipleOr");
      this.multipleOr = multipleOr.orElse(null);
      optBits |= OPT_BIT_MULTIPLE_OR;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#xpath() xpath} to xpath.
     * @param xpath The value for xpath
     * @return {@code this} builder for chained invocation
     */
    public final Builder xpath(String xpath) {
      checkNotIsSet(xpathIsSet(), "xpath");
      this.xpath = Objects.requireNonNull(xpath, "xpath");
      optBits |= OPT_BIT_XPATH;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#xpath() xpath} to xpath.
     * @param xpath The value for xpath
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("xpath")
    public final Builder xpath(Optional<String> xpath) {
      checkNotIsSet(xpathIsSet(), "xpath");
      this.xpath = xpath.orElse(null);
      optBits |= OPT_BIT_XPATH;
      return this;
    }

    /**
     * Initializes the value for the {@link SearchParameter#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link SearchParameter#contained() contained} to contained.
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
     * Initializes the optional value {@link SearchParameter#contained() contained} to contained.
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
     * Initializes the optional value {@link SearchParameter#url() url} to url.
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
     * Initializes the optional value {@link SearchParameter#url() url} to url.
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
     * Initializes the optional value {@link SearchParameter#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for chained invocation
     */
    public final Builder derivedFrom(Canonical derivedFrom) {
      checkNotIsSet(derivedFromIsSet(), "derivedFrom");
      this.derivedFrom = Objects.requireNonNull(derivedFrom, "derivedFrom");
      optBits |= OPT_BIT_DERIVED_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("derivedFrom")
    public final Builder derivedFrom(Optional<? extends Canonical> derivedFrom) {
      checkNotIsSet(derivedFromIsSet(), "derivedFrom");
      this.derivedFrom = derivedFrom.orElse(null);
      optBits |= OPT_BIT_DERIVED_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#chain() chain} to chain.
     * @param chain The value for chain
     * @return {@code this} builder for chained invocation
     */
    public final Builder chain(List<String> chain) {
      checkNotIsSet(chainIsSet(), "chain");
      this.chain = Objects.requireNonNull(chain, "chain");
      optBits |= OPT_BIT_CHAIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#chain() chain} to chain.
     * @param chain The value for chain
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("chain")
    public final Builder chain(Optional<? extends List<String>> chain) {
      checkNotIsSet(chainIsSet(), "chain");
      this.chain = chain.orElse(null);
      optBits |= OPT_BIT_CHAIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    public final Builder target(List<Code> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = Objects.requireNonNull(target, "target");
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("target")
    public final Builder target(Optional<? extends List<Code>> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = target.orElse(null);
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link SearchParameter#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link SearchParameter#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for chained invocation
     */
    public final Builder base(List<Code> base) {
      checkNotIsSet(baseIsSet(), "base");
      this.base = Objects.requireNonNull(base, "base");
      optBits |= OPT_BIT_BASE;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("base")
    public final Builder base(Optional<? extends List<Code>> base) {
      checkNotIsSet(baseIsSet(), "base");
      this.base = base.orElse(null);
      optBits |= OPT_BIT_BASE;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#language() language} to language.
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
     * Initializes the optional value {@link SearchParameter#language() language} to language.
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
    @JsonProperty("experimental")
    public final Builder experimental(Optional<Boolean> experimental) {
      checkNotIsSet(experimentalIsSet(), "experimental");
      this.experimental = experimental.orElse(null);
      optBits |= OPT_BIT_EXPERIMENTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#extension() extension} to extension.
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
     * Initializes the optional value {@link SearchParameter#extension() extension} to extension.
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
     * Initializes the optional value {@link SearchParameter#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link SearchParameter#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link SearchParameter#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link SearchParameter#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link SearchParameter#name() name} to name.
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
     * Initializes the optional value {@link SearchParameter#name() name} to name.
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
     * Initializes the optional value {@link SearchParameter#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(SearchparameterStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SearchParameter#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends SearchparameterStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Builds a new {@link SearchParameter SearchParameter}.
     * @return An immutable instance of SearchParameter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SearchParameter build() {
      checkRequiredAttributes();
      return new ImmutableSearchParameter(
          version,
          code,
          implicitRules,
          modifier,
          multipleAnd,
          xpathUsage,
          useContext,
          date,
          expression,
          comparator,
          text,
          component,
          description,
          id,
          contact,
          meta,
          modifierExtension,
          type,
          multipleOr,
          xpath,
          resourceType,
          contained,
          url,
          derivedFrom,
          chain,
          target,
          publisher,
          base,
          language,
          experimental,
          extension,
          jurisdiction,
          purpose,
          name,
          status);
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean modifierIsSet() {
      return (optBits & OPT_BIT_MODIFIER) != 0;
    }

    private boolean multipleAndIsSet() {
      return (optBits & OPT_BIT_MULTIPLE_AND) != 0;
    }

    private boolean xpathUsageIsSet() {
      return (optBits & OPT_BIT_XPATH_USAGE) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean expressionIsSet() {
      return (optBits & OPT_BIT_EXPRESSION) != 0;
    }

    private boolean comparatorIsSet() {
      return (optBits & OPT_BIT_COMPARATOR) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean componentIsSet() {
      return (optBits & OPT_BIT_COMPONENT) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean multipleOrIsSet() {
      return (optBits & OPT_BIT_MULTIPLE_OR) != 0;
    }

    private boolean xpathIsSet() {
      return (optBits & OPT_BIT_XPATH) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean derivedFromIsSet() {
      return (optBits & OPT_BIT_DERIVED_FROM) != 0;
    }

    private boolean chainIsSet() {
      return (optBits & OPT_BIT_CHAIN) != 0;
    }

    private boolean targetIsSet() {
      return (optBits & OPT_BIT_TARGET) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean baseIsSet() {
      return (optBits & OPT_BIT_BASE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SearchParameter is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build SearchParameter, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "SearchParameter", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link SearchParameter#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "SearchParameter", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link SearchParameter#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link SearchParameter#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link SearchParameter#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(Code code);

    /**
     * Initializes the optional value {@link SearchParameter#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends Code> code);

    /**
     * Initializes the optional value {@link SearchParameter#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link SearchParameter#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link SearchParameter#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifier(List<SearchparameterModifierItem> modifier);

    /**
     * Initializes the optional value {@link SearchParameter#modifier() modifier} to modifier.
     * @param modifier The value for modifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifier(Optional<? extends List<SearchparameterModifierItem>> modifier);

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
    BuildFinal multipleAnd(Optional<Boolean> multipleAnd);

    /**
     * Initializes the optional value {@link SearchParameter#xpathUsage() xpathUsage} to xpathUsage.
     * @param xpathUsage The value for xpathUsage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal xpathUsage(SearchparameterXpathusage xpathUsage);

    /**
     * Initializes the optional value {@link SearchParameter#xpathUsage() xpathUsage} to xpathUsage.
     * @param xpathUsage The value for xpathUsage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal xpathUsage(Optional<? extends SearchparameterXpathusage> xpathUsage);

    /**
     * Initializes the optional value {@link SearchParameter#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(List<UsageContext> useContext);

    /**
     * Initializes the optional value {@link SearchParameter#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(Optional<? extends List<UsageContext>> useContext);

    /**
     * Initializes the optional value {@link SearchParameter#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link SearchParameter#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link SearchParameter#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for chained invocation
     */
    BuildFinal expression(String expression);

    /**
     * Initializes the optional value {@link SearchParameter#expression() expression} to expression.
     * @param expression The value for expression
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal expression(Optional<String> expression);

    /**
     * Initializes the optional value {@link SearchParameter#comparator() comparator} to comparator.
     * @param comparator The value for comparator
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comparator(List<SearchparameterComparatorItem> comparator);

    /**
     * Initializes the optional value {@link SearchParameter#comparator() comparator} to comparator.
     * @param comparator The value for comparator
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comparator(Optional<? extends List<SearchparameterComparatorItem>> comparator);

    /**
     * Initializes the optional value {@link SearchParameter#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link SearchParameter#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link SearchParameter#component() component} to component.
     * @param component The value for component
     * @return {@code this} builder for chained invocation
     */
    BuildFinal component(List<SearchParameter_Component> component);

    /**
     * Initializes the optional value {@link SearchParameter#component() component} to component.
     * @param component The value for component
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal component(Optional<? extends List<SearchParameter_Component>> component);

    /**
     * Initializes the optional value {@link SearchParameter#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(Markdown description);

    /**
     * Initializes the optional value {@link SearchParameter#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<? extends Markdown> description);

    /**
     * Initializes the optional value {@link SearchParameter#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link SearchParameter#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link SearchParameter#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link SearchParameter#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Initializes the optional value {@link SearchParameter#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link SearchParameter#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link SearchParameter#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link SearchParameter#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link SearchParameter#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(SearchparameterType type);

    /**
     * Initializes the optional value {@link SearchParameter#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends SearchparameterType> type);

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
    BuildFinal multipleOr(Optional<Boolean> multipleOr);

    /**
     * Initializes the optional value {@link SearchParameter#xpath() xpath} to xpath.
     * @param xpath The value for xpath
     * @return {@code this} builder for chained invocation
     */
    BuildFinal xpath(String xpath);

    /**
     * Initializes the optional value {@link SearchParameter#xpath() xpath} to xpath.
     * @param xpath The value for xpath
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal xpath(Optional<String> xpath);

    /**
     * Initializes the optional value {@link SearchParameter#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link SearchParameter#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link SearchParameter#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link SearchParameter#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link SearchParameter#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for chained invocation
     */
    BuildFinal derivedFrom(Canonical derivedFrom);

    /**
     * Initializes the optional value {@link SearchParameter#derivedFrom() derivedFrom} to derivedFrom.
     * @param derivedFrom The value for derivedFrom
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal derivedFrom(Optional<? extends Canonical> derivedFrom);

    /**
     * Initializes the optional value {@link SearchParameter#chain() chain} to chain.
     * @param chain The value for chain
     * @return {@code this} builder for chained invocation
     */
    BuildFinal chain(List<String> chain);

    /**
     * Initializes the optional value {@link SearchParameter#chain() chain} to chain.
     * @param chain The value for chain
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal chain(Optional<? extends List<String>> chain);

    /**
     * Initializes the optional value {@link SearchParameter#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    BuildFinal target(List<Code> target);

    /**
     * Initializes the optional value {@link SearchParameter#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal target(Optional<? extends List<Code>> target);

    /**
     * Initializes the optional value {@link SearchParameter#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(String publisher);

    /**
     * Initializes the optional value {@link SearchParameter#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<String> publisher);

    /**
     * Initializes the optional value {@link SearchParameter#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for chained invocation
     */
    BuildFinal base(List<Code> base);

    /**
     * Initializes the optional value {@link SearchParameter#base() base} to base.
     * @param base The value for base
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal base(Optional<? extends List<Code>> base);

    /**
     * Initializes the optional value {@link SearchParameter#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link SearchParameter#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

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
    BuildFinal experimental(Optional<Boolean> experimental);

    /**
     * Initializes the optional value {@link SearchParameter#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link SearchParameter#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link SearchParameter#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(List<CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link SearchParameter#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link SearchParameter#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(Markdown purpose);

    /**
     * Initializes the optional value {@link SearchParameter#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(Optional<? extends Markdown> purpose);

    /**
     * Initializes the optional value {@link SearchParameter#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link SearchParameter#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link SearchParameter#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(SearchparameterStatus status);

    /**
     * Initializes the optional value {@link SearchParameter#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends SearchparameterStatus> status);

    /**
     * Builds a new {@link SearchParameter SearchParameter}.
     * @return An immutable instance of SearchParameter
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    SearchParameter build();
  }
}
