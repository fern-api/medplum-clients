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
 * Immutable implementation of {@link TerminologyCapabilities}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTerminologyCapabilities.builder()}.
 */
@Generated(from = "TerminologyCapabilities", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTerminologyCapabilities implements TerminologyCapabilities {
  private final @Nullable String version;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable TerminologyCapabilities_Software software;
  private final @Nullable List<TerminologyCapabilities_CodeSystem> codeSystem;
  private final @Nullable Code language;
  private final @Nullable TerminologyCapabilities_Implementation implementation;
  private final @Nullable Boolean lockedDate;
  private final @Nullable TerminologyCapabilities_Closure closure;
  private final @Nullable String name;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable DateTime date;
  private final @Nullable Markdown purpose;
  private final @Nullable List<ContactDetail> contact;
  private final @Nullable Narrative text;
  private final @Nullable Uri implicitRules;
  private final String resourceType;
  private final @Nullable TerminologyCapabilities_ValidateCode validateCode;
  private final @Nullable String publisher;
  private final @Nullable String title;
  private final @Nullable List<UsageContext> useContext;
  private final @Nullable Code kind;
  private final @Nullable Id id;
  private final @Nullable Uri url;
  private final @Nullable TerminologycapabilitiesCodesearch codeSearch;
  private final @Nullable Boolean experimental;
  private final @Nullable TerminologyCapabilities_Expansion expansion;
  private final @Nullable Markdown description;
  private final @Nullable TerminologyCapabilities_Translation translation;
  private final @Nullable Meta meta;
  private final @Nullable TerminologycapabilitiesStatus status;
  private final @Nullable Markdown copyright;

  private ImmutableTerminologyCapabilities(
      @Nullable String version,
      @Nullable List<CodeableConcept> jurisdiction,
      @Nullable List<Extension> modifierExtension,
      @Nullable TerminologyCapabilities_Software software,
      @Nullable List<TerminologyCapabilities_CodeSystem> codeSystem,
      @Nullable Code language,
      @Nullable TerminologyCapabilities_Implementation implementation,
      @Nullable Boolean lockedDate,
      @Nullable TerminologyCapabilities_Closure closure,
      @Nullable String name,
      @Nullable List<Extension> extension,
      @Nullable List<ResourceList> contained,
      @Nullable DateTime date,
      @Nullable Markdown purpose,
      @Nullable List<ContactDetail> contact,
      @Nullable Narrative text,
      @Nullable Uri implicitRules,
      String resourceType,
      @Nullable TerminologyCapabilities_ValidateCode validateCode,
      @Nullable String publisher,
      @Nullable String title,
      @Nullable List<UsageContext> useContext,
      @Nullable Code kind,
      @Nullable Id id,
      @Nullable Uri url,
      @Nullable TerminologycapabilitiesCodesearch codeSearch,
      @Nullable Boolean experimental,
      @Nullable TerminologyCapabilities_Expansion expansion,
      @Nullable Markdown description,
      @Nullable TerminologyCapabilities_Translation translation,
      @Nullable Meta meta,
      @Nullable TerminologycapabilitiesStatus status,
      @Nullable Markdown copyright) {
    this.version = version;
    this.jurisdiction = jurisdiction;
    this.modifierExtension = modifierExtension;
    this.software = software;
    this.codeSystem = codeSystem;
    this.language = language;
    this.implementation = implementation;
    this.lockedDate = lockedDate;
    this.closure = closure;
    this.name = name;
    this.extension = extension;
    this.contained = contained;
    this.date = date;
    this.purpose = purpose;
    this.contact = contact;
    this.text = text;
    this.implicitRules = implicitRules;
    this.resourceType = resourceType;
    this.validateCode = validateCode;
    this.publisher = publisher;
    this.title = title;
    this.useContext = useContext;
    this.kind = kind;
    this.id = id;
    this.url = url;
    this.codeSearch = codeSearch;
    this.experimental = experimental;
    this.expansion = expansion;
    this.description = description;
    this.translation = translation;
    this.meta = meta;
    this.status = status;
    this.copyright = copyright;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code software} attribute
   */
  @JsonProperty("software")
  @Override
  public Optional<TerminologyCapabilities_Software> software() {
    return Optional.ofNullable(software);
  }

  /**
   * @return The value of the {@code codeSystem} attribute
   */
  @JsonProperty("codeSystem")
  @Override
  public Optional<List<TerminologyCapabilities_CodeSystem>> codeSystem() {
    return Optional.ofNullable(codeSystem);
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
   * @return The value of the {@code implementation} attribute
   */
  @JsonProperty("implementation")
  @Override
  public Optional<TerminologyCapabilities_Implementation> implementation() {
    return Optional.ofNullable(implementation);
  }

  /**
   * @return The value of the {@code lockedDate} attribute
   */
  @JsonProperty("lockedDate")
  @Override
  public Optional<Boolean> lockedDate() {
    return Optional.ofNullable(lockedDate);
  }

  /**
   * @return The value of the {@code closure} attribute
   */
  @JsonProperty("closure")
  @Override
  public Optional<TerminologyCapabilities_Closure> closure() {
    return Optional.ofNullable(closure);
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
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
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
   * @return The value of the {@code contact} attribute
   */
  @JsonProperty("contact")
  @Override
  public Optional<List<ContactDetail>> contact() {
    return Optional.ofNullable(contact);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code validateCode} attribute
   */
  @JsonProperty("validateCode")
  @Override
  public Optional<TerminologyCapabilities_ValidateCode> validateCode() {
    return Optional.ofNullable(validateCode);
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
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
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
   * @return The value of the {@code kind} attribute
   */
  @JsonProperty("kind")
  @Override
  public Optional<Code> kind() {
    return Optional.ofNullable(kind);
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
   * @return The value of the {@code url} attribute
   */
  @JsonProperty("url")
  @Override
  public Optional<Uri> url() {
    return Optional.ofNullable(url);
  }

  /**
   * @return The value of the {@code codeSearch} attribute
   */
  @JsonProperty("codeSearch")
  @Override
  public Optional<TerminologycapabilitiesCodesearch> codeSearch() {
    return Optional.ofNullable(codeSearch);
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
   * @return The value of the {@code expansion} attribute
   */
  @JsonProperty("expansion")
  @Override
  public Optional<TerminologyCapabilities_Expansion> expansion() {
    return Optional.ofNullable(expansion);
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
   * @return The value of the {@code translation} attribute
   */
  @JsonProperty("translation")
  @Override
  public Optional<TerminologyCapabilities_Translation> translation() {
    return Optional.ofNullable(translation);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<TerminologycapabilitiesStatus> status() {
    return Optional.ofNullable(status);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableTerminologyCapabilities(
        newValue,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableTerminologyCapabilities(
        value,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        newValue,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        value,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        newValue,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        value,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#software() software} attribute.
   * @param value The value for software
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withSoftware(TerminologyCapabilities_Software value) {
    @Nullable TerminologyCapabilities_Software newValue = Objects.requireNonNull(value, "software");
    if (this.software == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        newValue,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#software() software} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for software
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withSoftware(Optional<? extends TerminologyCapabilities_Software> optional) {
    @Nullable TerminologyCapabilities_Software value = optional.orElse(null);
    if (this.software == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        value,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#codeSystem() codeSystem} attribute.
   * @param value The value for codeSystem
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withCodeSystem(List<TerminologyCapabilities_CodeSystem> value) {
    @Nullable List<TerminologyCapabilities_CodeSystem> newValue = Objects.requireNonNull(value, "codeSystem");
    if (this.codeSystem == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        newValue,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#codeSystem() codeSystem} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for codeSystem
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withCodeSystem(Optional<? extends List<TerminologyCapabilities_CodeSystem>> optional) {
    @Nullable List<TerminologyCapabilities_CodeSystem> value = optional.orElse(null);
    if (this.codeSystem == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        value,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        newValue,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        value,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#implementation() implementation} attribute.
   * @param value The value for implementation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withImplementation(TerminologyCapabilities_Implementation value) {
    @Nullable TerminologyCapabilities_Implementation newValue = Objects.requireNonNull(value, "implementation");
    if (this.implementation == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        newValue,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#implementation() implementation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implementation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withImplementation(Optional<? extends TerminologyCapabilities_Implementation> optional) {
    @Nullable TerminologyCapabilities_Implementation value = optional.orElse(null);
    if (this.implementation == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        value,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#lockedDate() lockedDate} attribute.
   * @param value The value for lockedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withLockedDate(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.lockedDate, newValue)) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        newValue,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#lockedDate() lockedDate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lockedDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withLockedDate(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.lockedDate, value)) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        value,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#closure() closure} attribute.
   * @param value The value for closure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withClosure(TerminologyCapabilities_Closure value) {
    @Nullable TerminologyCapabilities_Closure newValue = Objects.requireNonNull(value, "closure");
    if (this.closure == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        newValue,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#closure() closure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for closure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withClosure(Optional<? extends TerminologyCapabilities_Closure> optional) {
    @Nullable TerminologyCapabilities_Closure value = optional.orElse(null);
    if (this.closure == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        value,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        newValue,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        value,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        newValue,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        value,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        newValue,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        value,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        newValue,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        value,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withPurpose(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        newValue,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withPurpose(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        value,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        newValue,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        value,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        newValue,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        value,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        newValue,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        value,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link TerminologyCapabilities#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTerminologyCapabilities withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        newValue,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#validateCode() validateCode} attribute.
   * @param value The value for validateCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withValidateCode(TerminologyCapabilities_ValidateCode value) {
    @Nullable TerminologyCapabilities_ValidateCode newValue = Objects.requireNonNull(value, "validateCode");
    if (this.validateCode == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        newValue,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#validateCode() validateCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validateCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withValidateCode(Optional<? extends TerminologyCapabilities_ValidateCode> optional) {
    @Nullable TerminologyCapabilities_ValidateCode value = optional.orElse(null);
    if (this.validateCode == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        value,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withPublisher(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "publisher");
    if (Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        newValue,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withPublisher(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.publisher, value)) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        value,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        newValue,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        value,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withUseContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        newValue,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withUseContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        value,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#kind() kind} attribute.
   * @param value The value for kind
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withKind(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "kind");
    if (this.kind == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        newValue,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#kind() kind} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for kind
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withKind(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.kind == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        value,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        newValue,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        value,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        newValue,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        value,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#codeSearch() codeSearch} attribute.
   * @param value The value for codeSearch
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withCodeSearch(TerminologycapabilitiesCodesearch value) {
    @Nullable TerminologycapabilitiesCodesearch newValue = Objects.requireNonNull(value, "codeSearch");
    if (this.codeSearch == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        newValue,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#codeSearch() codeSearch} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for codeSearch
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withCodeSearch(Optional<? extends TerminologycapabilitiesCodesearch> optional) {
    @Nullable TerminologycapabilitiesCodesearch value = optional.orElse(null);
    if (this.codeSearch == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        value,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withExperimental(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        newValue,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withExperimental(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.experimental, value)) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        value,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#expansion() expansion} attribute.
   * @param value The value for expansion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withExpansion(TerminologyCapabilities_Expansion value) {
    @Nullable TerminologyCapabilities_Expansion newValue = Objects.requireNonNull(value, "expansion");
    if (this.expansion == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        newValue,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#expansion() expansion} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expansion
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withExpansion(Optional<? extends TerminologyCapabilities_Expansion> optional) {
    @Nullable TerminologyCapabilities_Expansion value = optional.orElse(null);
    if (this.expansion == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        value,
        this.description,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        newValue,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        value,
        this.translation,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#translation() translation} attribute.
   * @param value The value for translation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withTranslation(TerminologyCapabilities_Translation value) {
    @Nullable TerminologyCapabilities_Translation newValue = Objects.requireNonNull(value, "translation");
    if (this.translation == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        newValue,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#translation() translation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for translation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withTranslation(Optional<? extends TerminologyCapabilities_Translation> optional) {
    @Nullable TerminologyCapabilities_Translation value = optional.orElse(null);
    if (this.translation == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        value,
        this.meta,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        newValue,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        value,
        this.status,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withStatus(TerminologycapabilitiesStatus value) {
    @Nullable TerminologycapabilitiesStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        newValue,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withStatus(Optional<? extends TerminologycapabilitiesStatus> optional) {
    @Nullable TerminologycapabilitiesStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        value,
        this.copyright);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities withCopyright(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities withCopyright(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableTerminologyCapabilities(
        this.version,
        this.jurisdiction,
        this.modifierExtension,
        this.software,
        this.codeSystem,
        this.language,
        this.implementation,
        this.lockedDate,
        this.closure,
        this.name,
        this.extension,
        this.contained,
        this.date,
        this.purpose,
        this.contact,
        this.text,
        this.implicitRules,
        this.resourceType,
        this.validateCode,
        this.publisher,
        this.title,
        this.useContext,
        this.kind,
        this.id,
        this.url,
        this.codeSearch,
        this.experimental,
        this.expansion,
        this.description,
        this.translation,
        this.meta,
        this.status,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTerminologyCapabilities} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTerminologyCapabilities
        && equalTo((ImmutableTerminologyCapabilities) another);
  }

  private boolean equalTo(ImmutableTerminologyCapabilities another) {
    return Objects.equals(version, another.version)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(software, another.software)
        && Objects.equals(codeSystem, another.codeSystem)
        && Objects.equals(language, another.language)
        && Objects.equals(implementation, another.implementation)
        && Objects.equals(lockedDate, another.lockedDate)
        && Objects.equals(closure, another.closure)
        && Objects.equals(name, another.name)
        && Objects.equals(extension, another.extension)
        && Objects.equals(contained, another.contained)
        && Objects.equals(date, another.date)
        && Objects.equals(purpose, another.purpose)
        && Objects.equals(contact, another.contact)
        && Objects.equals(text, another.text)
        && Objects.equals(implicitRules, another.implicitRules)
        && resourceType.equals(another.resourceType)
        && Objects.equals(validateCode, another.validateCode)
        && Objects.equals(publisher, another.publisher)
        && Objects.equals(title, another.title)
        && Objects.equals(useContext, another.useContext)
        && Objects.equals(kind, another.kind)
        && Objects.equals(id, another.id)
        && Objects.equals(url, another.url)
        && Objects.equals(codeSearch, another.codeSearch)
        && Objects.equals(experimental, another.experimental)
        && Objects.equals(expansion, another.expansion)
        && Objects.equals(description, another.description)
        && Objects.equals(translation, another.translation)
        && Objects.equals(meta, another.meta)
        && Objects.equals(status, another.status)
        && Objects.equals(copyright, another.copyright);
  }

  /**
   * Computes a hash code from attributes: {@code version}, {@code jurisdiction}, {@code modifierExtension}, {@code software}, {@code codeSystem}, {@code language}, {@code implementation}, {@code lockedDate}, {@code closure}, {@code name}, {@code extension}, {@code contained}, {@code date}, {@code purpose}, {@code contact}, {@code text}, {@code implicitRules}, {@code resourceType}, {@code validateCode}, {@code publisher}, {@code title}, {@code useContext}, {@code kind}, {@code id}, {@code url}, {@code codeSearch}, {@code experimental}, {@code expansion}, {@code description}, {@code translation}, {@code meta}, {@code status}, {@code copyright}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(software);
    h += (h << 5) + Objects.hashCode(codeSystem);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(implementation);
    h += (h << 5) + Objects.hashCode(lockedDate);
    h += (h << 5) + Objects.hashCode(closure);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(purpose);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(validateCode);
    h += (h << 5) + Objects.hashCode(publisher);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(useContext);
    h += (h << 5) + Objects.hashCode(kind);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(codeSearch);
    h += (h << 5) + Objects.hashCode(experimental);
    h += (h << 5) + Objects.hashCode(expansion);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(translation);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(copyright);
    return h;
  }

  /**
   * Prints the immutable value {@code TerminologyCapabilities} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TerminologyCapabilities{");
    if (version != null) {
      builder.append("version=").append(version);
    }
    if (jurisdiction != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (modifierExtension != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (software != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("software=").append(software);
    }
    if (codeSystem != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("codeSystem=").append(codeSystem);
    }
    if (language != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (implementation != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("implementation=").append(implementation);
    }
    if (lockedDate != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("lockedDate=").append(lockedDate);
    }
    if (closure != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("closure=").append(closure);
    }
    if (name != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (extension != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (contained != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (date != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (purpose != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (contact != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (text != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (implicitRules != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (builder.length() > 24) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (validateCode != null) {
      builder.append(", ");
      builder.append("validateCode=").append(validateCode);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (kind != null) {
      builder.append(", ");
      builder.append("kind=").append(kind);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (codeSearch != null) {
      builder.append(", ");
      builder.append("codeSearch=").append(codeSearch);
    }
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (expansion != null) {
      builder.append(", ");
      builder.append("expansion=").append(expansion);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (translation != null) {
      builder.append(", ");
      builder.append("translation=").append(translation);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TerminologyCapabilities", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TerminologyCapabilities {
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<TerminologyCapabilities_Software> software = Optional.empty();
    boolean softwareIsSet;
    @Nullable Optional<List<TerminologyCapabilities_CodeSystem>> codeSystem = Optional.empty();
    boolean codeSystemIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<TerminologyCapabilities_Implementation> implementation = Optional.empty();
    boolean implementationIsSet;
    @Nullable Optional<Boolean> lockedDate = Optional.empty();
    boolean lockedDateIsSet;
    @Nullable Optional<TerminologyCapabilities_Closure> closure = Optional.empty();
    boolean closureIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<Markdown> purpose = Optional.empty();
    boolean purposeIsSet;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable String resourceType;
    @Nullable Optional<TerminologyCapabilities_ValidateCode> validateCode = Optional.empty();
    boolean validateCodeIsSet;
    @Nullable Optional<String> publisher = Optional.empty();
    boolean publisherIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<List<UsageContext>> useContext = Optional.empty();
    boolean useContextIsSet;
    @Nullable Optional<Code> kind = Optional.empty();
    boolean kindIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<TerminologycapabilitiesCodesearch> codeSearch = Optional.empty();
    boolean codeSearchIsSet;
    @Nullable Optional<Boolean> experimental = Optional.empty();
    boolean experimentalIsSet;
    @Nullable Optional<TerminologyCapabilities_Expansion> expansion = Optional.empty();
    boolean expansionIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<TerminologyCapabilities_Translation> translation = Optional.empty();
    boolean translationIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<TerminologycapabilitiesStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Markdown> copyright = Optional.empty();
    boolean copyrightIsSet;
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("software")
    public void setSoftware(Optional<TerminologyCapabilities_Software> software) {
      this.software = software;
      this.softwareIsSet = true;
    }
    @JsonProperty("codeSystem")
    public void setCodeSystem(Optional<List<TerminologyCapabilities_CodeSystem>> codeSystem) {
      this.codeSystem = codeSystem;
      this.codeSystemIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("implementation")
    public void setImplementation(Optional<TerminologyCapabilities_Implementation> implementation) {
      this.implementation = implementation;
      this.implementationIsSet = true;
    }
    @JsonProperty("lockedDate")
    public void setLockedDate(Optional<Boolean> lockedDate) {
      this.lockedDate = lockedDate;
      this.lockedDateIsSet = true;
    }
    @JsonProperty("closure")
    public void setClosure(Optional<TerminologyCapabilities_Closure> closure) {
      this.closure = closure;
      this.closureIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
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
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("purpose")
    public void setPurpose(Optional<Markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("validateCode")
    public void setValidateCode(Optional<TerminologyCapabilities_ValidateCode> validateCode) {
      this.validateCode = validateCode;
      this.validateCodeIsSet = true;
    }
    @JsonProperty("publisher")
    public void setPublisher(Optional<String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("useContext")
    public void setUseContext(Optional<List<UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @JsonProperty("kind")
    public void setKind(Optional<Code> kind) {
      this.kind = kind;
      this.kindIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("codeSearch")
    public void setCodeSearch(Optional<TerminologycapabilitiesCodesearch> codeSearch) {
      this.codeSearch = codeSearch;
      this.codeSearchIsSet = true;
    }
    @JsonProperty("experimental")
    public void setExperimental(Optional<Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @JsonProperty("expansion")
    public void setExpansion(Optional<TerminologyCapabilities_Expansion> expansion) {
      this.expansion = expansion;
      this.expansionIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("translation")
    public void setTranslation(Optional<TerminologyCapabilities_Translation> translation) {
      this.translation = translation;
      this.translationIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<TerminologycapabilitiesStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("copyright")
    public void setCopyright(Optional<Markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TerminologyCapabilities_Software> software() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<TerminologyCapabilities_CodeSystem>> codeSystem() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TerminologyCapabilities_Implementation> implementation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> lockedDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TerminologyCapabilities_Closure> closure() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TerminologyCapabilities_ValidateCode> validateCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> kind() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TerminologycapabilitiesCodesearch> codeSearch() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TerminologyCapabilities_Expansion> expansion() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TerminologyCapabilities_Translation> translation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TerminologycapabilitiesStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> copyright() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTerminologyCapabilities fromJson(Json json) {
    ImmutableTerminologyCapabilities.Builder builder = ((ImmutableTerminologyCapabilities.Builder) ImmutableTerminologyCapabilities.builder());
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.softwareIsSet) {
      builder.software(json.software);
    }
    if (json.codeSystemIsSet) {
      builder.codeSystem(json.codeSystem);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.implementationIsSet) {
      builder.implementation(json.implementation);
    }
    if (json.lockedDateIsSet) {
      builder.lockedDate(json.lockedDate);
    }
    if (json.closureIsSet) {
      builder.closure(json.closure);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.validateCodeIsSet) {
      builder.validateCode(json.validateCode);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.kindIsSet) {
      builder.kind(json.kind);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.codeSearchIsSet) {
      builder.codeSearch(json.codeSearch);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.expansionIsSet) {
      builder.expansion(json.expansion);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.translationIsSet) {
      builder.translation(json.translation);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    return (ImmutableTerminologyCapabilities) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TerminologyCapabilities} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TerminologyCapabilities instance
   */
  public static TerminologyCapabilities copyOf(TerminologyCapabilities instance) {
    if (instance instanceof ImmutableTerminologyCapabilities) {
      return (ImmutableTerminologyCapabilities) instance;
    }
    return ((ImmutableTerminologyCapabilities.Builder) ImmutableTerminologyCapabilities.builder())
        .version(instance.version())
        .jurisdiction(instance.jurisdiction())
        .modifierExtension(instance.modifierExtension())
        .software(instance.software())
        .codeSystem(instance.codeSystem())
        .language(instance.language())
        .implementation(instance.implementation())
        .lockedDate(instance.lockedDate())
        .closure(instance.closure())
        .name(instance.name())
        .extension(instance.extension())
        .contained(instance.contained())
        .date(instance.date())
        .purpose(instance.purpose())
        .contact(instance.contact())
        .text(instance.text())
        .implicitRules(instance.implicitRules())
        .resourceType(instance.resourceType())
        .validateCode(instance.validateCode())
        .publisher(instance.publisher())
        .title(instance.title())
        .useContext(instance.useContext())
        .kind(instance.kind())
        .id(instance.id())
        .url(instance.url())
        .codeSearch(instance.codeSearch())
        .experimental(instance.experimental())
        .expansion(instance.expansion())
        .description(instance.description())
        .translation(instance.translation())
        .meta(instance.meta())
        .status(instance.status())
        .copyright(instance.copyright())
        .build();
  }

  /**
   * Creates a builder for {@link TerminologyCapabilities TerminologyCapabilities}.
   * <pre>
   * ImmutableTerminologyCapabilities.builder()
   *    .version(String) // optional {@link TerminologyCapabilities#version() version}
   *    .jurisdiction(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link TerminologyCapabilities#jurisdiction() jurisdiction}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link TerminologyCapabilities#modifierExtension() modifierExtension}
   *    .software(com.medplum.types.fhir.TerminologyCapabilities_Software) // optional {@link TerminologyCapabilities#software() software}
   *    .codeSystem(List&amp;lt;com.medplum.types.fhir.TerminologyCapabilities_CodeSystem&amp;gt;) // optional {@link TerminologyCapabilities#codeSystem() codeSystem}
   *    .language(com.medplum.types.fhir.Code) // optional {@link TerminologyCapabilities#language() language}
   *    .implementation(com.medplum.types.fhir.TerminologyCapabilities_Implementation) // optional {@link TerminologyCapabilities#implementation() implementation}
   *    .lockedDate(Boolean) // optional {@link TerminologyCapabilities#lockedDate() lockedDate}
   *    .closure(com.medplum.types.fhir.TerminologyCapabilities_Closure) // optional {@link TerminologyCapabilities#closure() closure}
   *    .name(String) // optional {@link TerminologyCapabilities#name() name}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link TerminologyCapabilities#extension() extension}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link TerminologyCapabilities#contained() contained}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link TerminologyCapabilities#date() date}
   *    .purpose(com.medplum.types.fhir.Markdown) // optional {@link TerminologyCapabilities#purpose() purpose}
   *    .contact(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link TerminologyCapabilities#contact() contact}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link TerminologyCapabilities#text() text}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link TerminologyCapabilities#implicitRules() implicitRules}
   *    .resourceType(String) // required {@link TerminologyCapabilities#resourceType() resourceType}
   *    .validateCode(com.medplum.types.fhir.TerminologyCapabilities_ValidateCode) // optional {@link TerminologyCapabilities#validateCode() validateCode}
   *    .publisher(String) // optional {@link TerminologyCapabilities#publisher() publisher}
   *    .title(String) // optional {@link TerminologyCapabilities#title() title}
   *    .useContext(List&amp;lt;com.medplum.types.fhir.UsageContext&amp;gt;) // optional {@link TerminologyCapabilities#useContext() useContext}
   *    .kind(com.medplum.types.fhir.Code) // optional {@link TerminologyCapabilities#kind() kind}
   *    .id(com.medplum.types.fhir.Id) // optional {@link TerminologyCapabilities#id() id}
   *    .url(com.medplum.types.fhir.Uri) // optional {@link TerminologyCapabilities#url() url}
   *    .codeSearch(com.medplum.types.fhir.TerminologycapabilitiesCodesearch) // optional {@link TerminologyCapabilities#codeSearch() codeSearch}
   *    .experimental(Boolean) // optional {@link TerminologyCapabilities#experimental() experimental}
   *    .expansion(com.medplum.types.fhir.TerminologyCapabilities_Expansion) // optional {@link TerminologyCapabilities#expansion() expansion}
   *    .description(com.medplum.types.fhir.Markdown) // optional {@link TerminologyCapabilities#description() description}
   *    .translation(com.medplum.types.fhir.TerminologyCapabilities_Translation) // optional {@link TerminologyCapabilities#translation() translation}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link TerminologyCapabilities#meta() meta}
   *    .status(com.medplum.types.fhir.TerminologycapabilitiesStatus) // optional {@link TerminologyCapabilities#status() status}
   *    .copyright(com.medplum.types.fhir.Markdown) // optional {@link TerminologyCapabilities#copyright() copyright}
   *    .build();
   * </pre>
   * @return A new TerminologyCapabilities builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableTerminologyCapabilities.Builder();
  }

  /**
   * Builds instances of type {@link TerminologyCapabilities TerminologyCapabilities}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TerminologyCapabilities", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_VERSION = 0x1L;
    private static final long OPT_BIT_JURISDICTION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_SOFTWARE = 0x8L;
    private static final long OPT_BIT_CODE_SYSTEM = 0x10L;
    private static final long OPT_BIT_LANGUAGE = 0x20L;
    private static final long OPT_BIT_IMPLEMENTATION = 0x40L;
    private static final long OPT_BIT_LOCKED_DATE = 0x80L;
    private static final long OPT_BIT_CLOSURE = 0x100L;
    private static final long OPT_BIT_NAME = 0x200L;
    private static final long OPT_BIT_EXTENSION = 0x400L;
    private static final long OPT_BIT_CONTAINED = 0x800L;
    private static final long OPT_BIT_DATE = 0x1000L;
    private static final long OPT_BIT_PURPOSE = 0x2000L;
    private static final long OPT_BIT_CONTACT = 0x4000L;
    private static final long OPT_BIT_TEXT = 0x8000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10000L;
    private static final long OPT_BIT_VALIDATE_CODE = 0x20000L;
    private static final long OPT_BIT_PUBLISHER = 0x40000L;
    private static final long OPT_BIT_TITLE = 0x80000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x100000L;
    private static final long OPT_BIT_KIND = 0x200000L;
    private static final long OPT_BIT_ID = 0x400000L;
    private static final long OPT_BIT_URL = 0x800000L;
    private static final long OPT_BIT_CODE_SEARCH = 0x1000000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x2000000L;
    private static final long OPT_BIT_EXPANSION = 0x4000000L;
    private static final long OPT_BIT_DESCRIPTION = 0x8000000L;
    private static final long OPT_BIT_TRANSLATION = 0x10000000L;
    private static final long OPT_BIT_META = 0x20000000L;
    private static final long OPT_BIT_STATUS = 0x40000000L;
    private static final long OPT_BIT_COPYRIGHT = 0x80000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String version;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable TerminologyCapabilities_Software software;
    private @Nullable List<TerminologyCapabilities_CodeSystem> codeSystem;
    private @Nullable Code language;
    private @Nullable TerminologyCapabilities_Implementation implementation;
    private @Nullable Boolean lockedDate;
    private @Nullable TerminologyCapabilities_Closure closure;
    private @Nullable String name;
    private @Nullable List<Extension> extension;
    private @Nullable List<ResourceList> contained;
    private @Nullable DateTime date;
    private @Nullable Markdown purpose;
    private @Nullable List<ContactDetail> contact;
    private @Nullable Narrative text;
    private @Nullable Uri implicitRules;
    private @Nullable String resourceType;
    private @Nullable TerminologyCapabilities_ValidateCode validateCode;
    private @Nullable String publisher;
    private @Nullable String title;
    private @Nullable List<UsageContext> useContext;
    private @Nullable Code kind;
    private @Nullable Id id;
    private @Nullable Uri url;
    private @Nullable TerminologycapabilitiesCodesearch codeSearch;
    private @Nullable Boolean experimental;
    private @Nullable TerminologyCapabilities_Expansion expansion;
    private @Nullable Markdown description;
    private @Nullable TerminologyCapabilities_Translation translation;
    private @Nullable Meta meta;
    private @Nullable TerminologycapabilitiesStatus status;
    private @Nullable Markdown copyright;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#version() version} to version.
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
     * Initializes the optional value {@link TerminologyCapabilities#version() version} to version.
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
     * Initializes the optional value {@link TerminologyCapabilities#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link TerminologyCapabilities#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link TerminologyCapabilities#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TerminologyCapabilities#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TerminologyCapabilities#software() software} to software.
     * @param software The value for software
     * @return {@code this} builder for chained invocation
     */
    public final Builder software(TerminologyCapabilities_Software software) {
      checkNotIsSet(softwareIsSet(), "software");
      this.software = Objects.requireNonNull(software, "software");
      optBits |= OPT_BIT_SOFTWARE;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#software() software} to software.
     * @param software The value for software
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("software")
    public final Builder software(Optional<? extends TerminologyCapabilities_Software> software) {
      checkNotIsSet(softwareIsSet(), "software");
      this.software = software.orElse(null);
      optBits |= OPT_BIT_SOFTWARE;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#codeSystem() codeSystem} to codeSystem.
     * @param codeSystem The value for codeSystem
     * @return {@code this} builder for chained invocation
     */
    public final Builder codeSystem(List<TerminologyCapabilities_CodeSystem> codeSystem) {
      checkNotIsSet(codeSystemIsSet(), "codeSystem");
      this.codeSystem = Objects.requireNonNull(codeSystem, "codeSystem");
      optBits |= OPT_BIT_CODE_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#codeSystem() codeSystem} to codeSystem.
     * @param codeSystem The value for codeSystem
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("codeSystem")
    public final Builder codeSystem(Optional<? extends List<TerminologyCapabilities_CodeSystem>> codeSystem) {
      checkNotIsSet(codeSystemIsSet(), "codeSystem");
      this.codeSystem = codeSystem.orElse(null);
      optBits |= OPT_BIT_CODE_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#language() language} to language.
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
     * Initializes the optional value {@link TerminologyCapabilities#language() language} to language.
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
     * Initializes the optional value {@link TerminologyCapabilities#implementation() implementation} to implementation.
     * @param implementation The value for implementation
     * @return {@code this} builder for chained invocation
     */
    public final Builder implementation(TerminologyCapabilities_Implementation implementation) {
      checkNotIsSet(implementationIsSet(), "implementation");
      this.implementation = Objects.requireNonNull(implementation, "implementation");
      optBits |= OPT_BIT_IMPLEMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#implementation() implementation} to implementation.
     * @param implementation The value for implementation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("implementation")
    public final Builder implementation(Optional<? extends TerminologyCapabilities_Implementation> implementation) {
      checkNotIsSet(implementationIsSet(), "implementation");
      this.implementation = implementation.orElse(null);
      optBits |= OPT_BIT_IMPLEMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#lockedDate() lockedDate} to lockedDate.
     * @param lockedDate The value for lockedDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder lockedDate(boolean lockedDate) {
      checkNotIsSet(lockedDateIsSet(), "lockedDate");
      this.lockedDate = lockedDate;
      optBits |= OPT_BIT_LOCKED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#lockedDate() lockedDate} to lockedDate.
     * @param lockedDate The value for lockedDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lockedDate")
    public final Builder lockedDate(Optional<Boolean> lockedDate) {
      checkNotIsSet(lockedDateIsSet(), "lockedDate");
      this.lockedDate = lockedDate.orElse(null);
      optBits |= OPT_BIT_LOCKED_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#closure() closure} to closure.
     * @param closure The value for closure
     * @return {@code this} builder for chained invocation
     */
    public final Builder closure(TerminologyCapabilities_Closure closure) {
      checkNotIsSet(closureIsSet(), "closure");
      this.closure = Objects.requireNonNull(closure, "closure");
      optBits |= OPT_BIT_CLOSURE;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#closure() closure} to closure.
     * @param closure The value for closure
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("closure")
    public final Builder closure(Optional<? extends TerminologyCapabilities_Closure> closure) {
      checkNotIsSet(closureIsSet(), "closure");
      this.closure = closure.orElse(null);
      optBits |= OPT_BIT_CLOSURE;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#name() name} to name.
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
     * Initializes the optional value {@link TerminologyCapabilities#name() name} to name.
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
     * Initializes the optional value {@link TerminologyCapabilities#extension() extension} to extension.
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
     * Initializes the optional value {@link TerminologyCapabilities#extension() extension} to extension.
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
     * Initializes the optional value {@link TerminologyCapabilities#contained() contained} to contained.
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
     * Initializes the optional value {@link TerminologyCapabilities#contained() contained} to contained.
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
     * Initializes the optional value {@link TerminologyCapabilities#date() date} to date.
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
     * Initializes the optional value {@link TerminologyCapabilities#date() date} to date.
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
     * Initializes the optional value {@link TerminologyCapabilities#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link TerminologyCapabilities#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link TerminologyCapabilities#contact() contact} to contact.
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
     * Initializes the optional value {@link TerminologyCapabilities#contact() contact} to contact.
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
     * Initializes the optional value {@link TerminologyCapabilities#text() text} to text.
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
     * Initializes the optional value {@link TerminologyCapabilities#text() text} to text.
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
     * Initializes the optional value {@link TerminologyCapabilities#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link TerminologyCapabilities#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the value for the {@link TerminologyCapabilities#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link TerminologyCapabilities#validateCode() validateCode} to validateCode.
     * @param validateCode The value for validateCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder validateCode(TerminologyCapabilities_ValidateCode validateCode) {
      checkNotIsSet(validateCodeIsSet(), "validateCode");
      this.validateCode = Objects.requireNonNull(validateCode, "validateCode");
      optBits |= OPT_BIT_VALIDATE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#validateCode() validateCode} to validateCode.
     * @param validateCode The value for validateCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("validateCode")
    public final Builder validateCode(Optional<? extends TerminologyCapabilities_ValidateCode> validateCode) {
      checkNotIsSet(validateCodeIsSet(), "validateCode");
      this.validateCode = validateCode.orElse(null);
      optBits |= OPT_BIT_VALIDATE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link TerminologyCapabilities#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link TerminologyCapabilities#title() title} to title.
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
     * Initializes the optional value {@link TerminologyCapabilities#title() title} to title.
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
     * Initializes the optional value {@link TerminologyCapabilities#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link TerminologyCapabilities#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link TerminologyCapabilities#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    public final Builder kind(Code kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = Objects.requireNonNull(kind, "kind");
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(Optional<? extends Code> kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = kind.orElse(null);
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#id() id} to id.
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
     * Initializes the optional value {@link TerminologyCapabilities#id() id} to id.
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
     * Initializes the optional value {@link TerminologyCapabilities#url() url} to url.
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
     * Initializes the optional value {@link TerminologyCapabilities#url() url} to url.
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
     * Initializes the optional value {@link TerminologyCapabilities#codeSearch() codeSearch} to codeSearch.
     * @param codeSearch The value for codeSearch
     * @return {@code this} builder for chained invocation
     */
    public final Builder codeSearch(TerminologycapabilitiesCodesearch codeSearch) {
      checkNotIsSet(codeSearchIsSet(), "codeSearch");
      this.codeSearch = Objects.requireNonNull(codeSearch, "codeSearch");
      optBits |= OPT_BIT_CODE_SEARCH;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#codeSearch() codeSearch} to codeSearch.
     * @param codeSearch The value for codeSearch
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("codeSearch")
    public final Builder codeSearch(Optional<? extends TerminologycapabilitiesCodesearch> codeSearch) {
      checkNotIsSet(codeSearchIsSet(), "codeSearch");
      this.codeSearch = codeSearch.orElse(null);
      optBits |= OPT_BIT_CODE_SEARCH;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link TerminologyCapabilities#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link TerminologyCapabilities#expansion() expansion} to expansion.
     * @param expansion The value for expansion
     * @return {@code this} builder for chained invocation
     */
    public final Builder expansion(TerminologyCapabilities_Expansion expansion) {
      checkNotIsSet(expansionIsSet(), "expansion");
      this.expansion = Objects.requireNonNull(expansion, "expansion");
      optBits |= OPT_BIT_EXPANSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#expansion() expansion} to expansion.
     * @param expansion The value for expansion
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("expansion")
    public final Builder expansion(Optional<? extends TerminologyCapabilities_Expansion> expansion) {
      checkNotIsSet(expansionIsSet(), "expansion");
      this.expansion = expansion.orElse(null);
      optBits |= OPT_BIT_EXPANSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#description() description} to description.
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
     * Initializes the optional value {@link TerminologyCapabilities#description() description} to description.
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
     * Initializes the optional value {@link TerminologyCapabilities#translation() translation} to translation.
     * @param translation The value for translation
     * @return {@code this} builder for chained invocation
     */
    public final Builder translation(TerminologyCapabilities_Translation translation) {
      checkNotIsSet(translationIsSet(), "translation");
      this.translation = Objects.requireNonNull(translation, "translation");
      optBits |= OPT_BIT_TRANSLATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#translation() translation} to translation.
     * @param translation The value for translation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("translation")
    public final Builder translation(Optional<? extends TerminologyCapabilities_Translation> translation) {
      checkNotIsSet(translationIsSet(), "translation");
      this.translation = translation.orElse(null);
      optBits |= OPT_BIT_TRANSLATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#meta() meta} to meta.
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
     * Initializes the optional value {@link TerminologyCapabilities#meta() meta} to meta.
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
     * Initializes the optional value {@link TerminologyCapabilities#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(TerminologycapabilitiesStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends TerminologycapabilitiesStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link TerminologyCapabilities#copyright() copyright} to copyright.
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
     * Builds a new {@link TerminologyCapabilities TerminologyCapabilities}.
     * @return An immutable instance of TerminologyCapabilities
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TerminologyCapabilities build() {
      checkRequiredAttributes();
      return new ImmutableTerminologyCapabilities(
          version,
          jurisdiction,
          modifierExtension,
          software,
          codeSystem,
          language,
          implementation,
          lockedDate,
          closure,
          name,
          extension,
          contained,
          date,
          purpose,
          contact,
          text,
          implicitRules,
          resourceType,
          validateCode,
          publisher,
          title,
          useContext,
          kind,
          id,
          url,
          codeSearch,
          experimental,
          expansion,
          description,
          translation,
          meta,
          status,
          copyright);
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean softwareIsSet() {
      return (optBits & OPT_BIT_SOFTWARE) != 0;
    }

    private boolean codeSystemIsSet() {
      return (optBits & OPT_BIT_CODE_SYSTEM) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean implementationIsSet() {
      return (optBits & OPT_BIT_IMPLEMENTATION) != 0;
    }

    private boolean lockedDateIsSet() {
      return (optBits & OPT_BIT_LOCKED_DATE) != 0;
    }

    private boolean closureIsSet() {
      return (optBits & OPT_BIT_CLOSURE) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean validateCodeIsSet() {
      return (optBits & OPT_BIT_VALIDATE_CODE) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean kindIsSet() {
      return (optBits & OPT_BIT_KIND) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean codeSearchIsSet() {
      return (optBits & OPT_BIT_CODE_SEARCH) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean expansionIsSet() {
      return (optBits & OPT_BIT_EXPANSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean translationIsSet() {
      return (optBits & OPT_BIT_TRANSLATION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TerminologyCapabilities is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build TerminologyCapabilities, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "TerminologyCapabilities", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link TerminologyCapabilities#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "TerminologyCapabilities", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link TerminologyCapabilities#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(List<CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#software() software} to software.
     * @param software The value for software
     * @return {@code this} builder for chained invocation
     */
    BuildFinal software(TerminologyCapabilities_Software software);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#software() software} to software.
     * @param software The value for software
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal software(Optional<? extends TerminologyCapabilities_Software> software);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#codeSystem() codeSystem} to codeSystem.
     * @param codeSystem The value for codeSystem
     * @return {@code this} builder for chained invocation
     */
    BuildFinal codeSystem(List<TerminologyCapabilities_CodeSystem> codeSystem);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#codeSystem() codeSystem} to codeSystem.
     * @param codeSystem The value for codeSystem
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal codeSystem(Optional<? extends List<TerminologyCapabilities_CodeSystem>> codeSystem);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#implementation() implementation} to implementation.
     * @param implementation The value for implementation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implementation(TerminologyCapabilities_Implementation implementation);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#implementation() implementation} to implementation.
     * @param implementation The value for implementation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implementation(Optional<? extends TerminologyCapabilities_Implementation> implementation);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#lockedDate() lockedDate} to lockedDate.
     * @param lockedDate The value for lockedDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lockedDate(boolean lockedDate);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#lockedDate() lockedDate} to lockedDate.
     * @param lockedDate The value for lockedDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lockedDate(Optional<Boolean> lockedDate);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#closure() closure} to closure.
     * @param closure The value for closure
     * @return {@code this} builder for chained invocation
     */
    BuildFinal closure(TerminologyCapabilities_Closure closure);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#closure() closure} to closure.
     * @param closure The value for closure
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal closure(Optional<? extends TerminologyCapabilities_Closure> closure);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(Markdown purpose);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(Optional<? extends Markdown> purpose);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#validateCode() validateCode} to validateCode.
     * @param validateCode The value for validateCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal validateCode(TerminologyCapabilities_ValidateCode validateCode);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#validateCode() validateCode} to validateCode.
     * @param validateCode The value for validateCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal validateCode(Optional<? extends TerminologyCapabilities_ValidateCode> validateCode);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(String publisher);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<String> publisher);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(List<UsageContext> useContext);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(Optional<? extends List<UsageContext>> useContext);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    BuildFinal kind(Code kind);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal kind(Optional<? extends Code> kind);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#codeSearch() codeSearch} to codeSearch.
     * @param codeSearch The value for codeSearch
     * @return {@code this} builder for chained invocation
     */
    BuildFinal codeSearch(TerminologycapabilitiesCodesearch codeSearch);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#codeSearch() codeSearch} to codeSearch.
     * @param codeSearch The value for codeSearch
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal codeSearch(Optional<? extends TerminologycapabilitiesCodesearch> codeSearch);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(Optional<Boolean> experimental);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#expansion() expansion} to expansion.
     * @param expansion The value for expansion
     * @return {@code this} builder for chained invocation
     */
    BuildFinal expansion(TerminologyCapabilities_Expansion expansion);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#expansion() expansion} to expansion.
     * @param expansion The value for expansion
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal expansion(Optional<? extends TerminologyCapabilities_Expansion> expansion);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(Markdown description);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<? extends Markdown> description);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#translation() translation} to translation.
     * @param translation The value for translation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal translation(TerminologyCapabilities_Translation translation);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#translation() translation} to translation.
     * @param translation The value for translation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal translation(Optional<? extends TerminologyCapabilities_Translation> translation);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(TerminologycapabilitiesStatus status);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends TerminologycapabilitiesStatus> status);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(Markdown copyright);

    /**
     * Initializes the optional value {@link TerminologyCapabilities#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(Optional<? extends Markdown> copyright);

    /**
     * Builds a new {@link TerminologyCapabilities TerminologyCapabilities}.
     * @return An immutable instance of TerminologyCapabilities
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    TerminologyCapabilities build();
  }
}
