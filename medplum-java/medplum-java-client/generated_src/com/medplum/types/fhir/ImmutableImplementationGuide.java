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
 * Immutable implementation of {@link ImplementationGuide}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImplementationGuide.builder()}.
 */
@Generated(from = "ImplementationGuide", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImplementationGuide implements ImplementationGuide {
  private final @Nullable ImplementationguideLicense license;
  private final @Nullable List<ContactDetail> contact;
  private final @Nullable Uri implicitRules;
  private final @Nullable Meta meta;
  private final @Nullable ImplementationGuide_Manifest manifest;
  private final @Nullable Boolean experimental;
  private final @Nullable List<ImplementationGuide_DependsOn> dependsOn;
  private final @Nullable List<Extension> extension;
  private final @Nullable String title;
  private final @Nullable Id id;
  private final @Nullable ImplementationGuide_Definition definition;
  private final @Nullable String name;
  private final @Nullable Markdown copyright;
  private final @Nullable Uri url;
  private final String resourceType;
  private final @Nullable Code language;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable ImplementationguideStatus status;
  private final @Nullable Markdown description;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final @Nullable List<ImplementationguideFhirversionItem> fhirVersion;
  private final @Nullable DateTime date;
  private final @Nullable Narrative text;
  private final @Nullable String publisher;
  private final @Nullable Id packageId;
  private final @Nullable List<ImplementationGuide_Global> global;
  private final @Nullable String version;
  private final @Nullable List<UsageContext> useContext;

  private ImmutableImplementationGuide(
      @Nullable ImplementationguideLicense license,
      @Nullable List<ContactDetail> contact,
      @Nullable Uri implicitRules,
      @Nullable Meta meta,
      @Nullable ImplementationGuide_Manifest manifest,
      @Nullable Boolean experimental,
      @Nullable List<ImplementationGuide_DependsOn> dependsOn,
      @Nullable List<Extension> extension,
      @Nullable String title,
      @Nullable Id id,
      @Nullable ImplementationGuide_Definition definition,
      @Nullable String name,
      @Nullable Markdown copyright,
      @Nullable Uri url,
      String resourceType,
      @Nullable Code language,
      @Nullable List<ResourceList> contained,
      @Nullable ImplementationguideStatus status,
      @Nullable Markdown description,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<CodeableConcept> jurisdiction,
      @Nullable List<ImplementationguideFhirversionItem> fhirVersion,
      @Nullable DateTime date,
      @Nullable Narrative text,
      @Nullable String publisher,
      @Nullable Id packageId,
      @Nullable List<ImplementationGuide_Global> global,
      @Nullable String version,
      @Nullable List<UsageContext> useContext) {
    this.license = license;
    this.contact = contact;
    this.implicitRules = implicitRules;
    this.meta = meta;
    this.manifest = manifest;
    this.experimental = experimental;
    this.dependsOn = dependsOn;
    this.extension = extension;
    this.title = title;
    this.id = id;
    this.definition = definition;
    this.name = name;
    this.copyright = copyright;
    this.url = url;
    this.resourceType = resourceType;
    this.language = language;
    this.contained = contained;
    this.status = status;
    this.description = description;
    this.modifierExtension = modifierExtension;
    this.jurisdiction = jurisdiction;
    this.fhirVersion = fhirVersion;
    this.date = date;
    this.text = text;
    this.publisher = publisher;
    this.packageId = packageId;
    this.global = global;
    this.version = version;
    this.useContext = useContext;
  }

  /**
   * @return The value of the {@code license} attribute
   */
  @JsonProperty("license")
  @Override
  public Optional<ImplementationguideLicense> license() {
    return Optional.ofNullable(license);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code manifest} attribute
   */
  @JsonProperty("manifest")
  @Override
  public Optional<ImplementationGuide_Manifest> manifest() {
    return Optional.ofNullable(manifest);
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
   * @return The value of the {@code dependsOn} attribute
   */
  @JsonProperty("dependsOn")
  @Override
  public Optional<List<ImplementationGuide_DependsOn>> dependsOn() {
    return Optional.ofNullable(dependsOn);
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
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
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
   * @return The value of the {@code definition} attribute
   */
  @JsonProperty("definition")
  @Override
  public Optional<ImplementationGuide_Definition> definition() {
    return Optional.ofNullable(definition);
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
   * @return The value of the {@code copyright} attribute
   */
  @JsonProperty("copyright")
  @Override
  public Optional<Markdown> copyright() {
    return Optional.ofNullable(copyright);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<ImplementationguideStatus> status() {
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code fhirVersion} attribute
   */
  @JsonProperty("fhirVersion")
  @Override
  public Optional<List<ImplementationguideFhirversionItem>> fhirVersion() {
    return Optional.ofNullable(fhirVersion);
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
   * @return The value of the {@code packageId} attribute
   */
  @JsonProperty("packageId")
  @Override
  public Optional<Id> packageId() {
    return Optional.ofNullable(packageId);
  }

  /**
   * @return The value of the {@code global} attribute
   */
  @JsonProperty("global")
  @Override
  public Optional<List<ImplementationGuide_Global>> global() {
    return Optional.ofNullable(global);
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
   * @return The value of the {@code useContext} attribute
   */
  @JsonProperty("useContext")
  @Override
  public Optional<List<UsageContext>> useContext() {
    return Optional.ofNullable(useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#license() license} attribute.
   * @param value The value for license
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withLicense(ImplementationguideLicense value) {
    @Nullable ImplementationguideLicense newValue = Objects.requireNonNull(value, "license");
    if (this.license == newValue) return this;
    return new ImmutableImplementationGuide(
        newValue,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#license() license} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for license
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withLicense(Optional<? extends ImplementationguideLicense> optional) {
    @Nullable ImplementationguideLicense value = optional.orElse(null);
    if (this.license == value) return this;
    return new ImmutableImplementationGuide(
        value,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableImplementationGuide(
        this.license,
        newValue,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableImplementationGuide(
        this.license,
        value,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        newValue,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        value,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        newValue,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        value,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#manifest() manifest} attribute.
   * @param value The value for manifest
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withManifest(ImplementationGuide_Manifest value) {
    @Nullable ImplementationGuide_Manifest newValue = Objects.requireNonNull(value, "manifest");
    if (this.manifest == newValue) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        newValue,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#manifest() manifest} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manifest
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withManifest(Optional<? extends ImplementationGuide_Manifest> optional) {
    @Nullable ImplementationGuide_Manifest value = optional.orElse(null);
    if (this.manifest == value) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        value,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withExperimental(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        newValue,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withExperimental(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.experimental, value)) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        value,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#dependsOn() dependsOn} attribute.
   * @param value The value for dependsOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withDependsOn(List<ImplementationGuide_DependsOn> value) {
    @Nullable List<ImplementationGuide_DependsOn> newValue = Objects.requireNonNull(value, "dependsOn");
    if (this.dependsOn == newValue) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        newValue,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#dependsOn() dependsOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dependsOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withDependsOn(Optional<? extends List<ImplementationGuide_DependsOn>> optional) {
    @Nullable List<ImplementationGuide_DependsOn> value = optional.orElse(null);
    if (this.dependsOn == value) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        value,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        newValue,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        value,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        newValue,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        value,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        newValue,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        value,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#definition() definition} attribute.
   * @param value The value for definition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withDefinition(ImplementationGuide_Definition value) {
    @Nullable ImplementationGuide_Definition newValue = Objects.requireNonNull(value, "definition");
    if (this.definition == newValue) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        newValue,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#definition() definition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withDefinition(Optional<? extends ImplementationGuide_Definition> optional) {
    @Nullable ImplementationGuide_Definition value = optional.orElse(null);
    if (this.definition == value) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        value,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        newValue,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        value,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withCopyright(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        newValue,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withCopyright(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        value,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        newValue,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        value,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ImplementationGuide#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableImplementationGuide withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        newValue,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        newValue,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        value,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        newValue,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        value,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withStatus(ImplementationguideStatus value) {
    @Nullable ImplementationguideStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        newValue,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withStatus(Optional<? extends ImplementationguideStatus> optional) {
    @Nullable ImplementationguideStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        value,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        newValue,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        value,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        newValue,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        value,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        newValue,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        value,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#fhirVersion() fhirVersion} attribute.
   * @param value The value for fhirVersion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withFhirVersion(List<ImplementationguideFhirversionItem> value) {
    @Nullable List<ImplementationguideFhirversionItem> newValue = Objects.requireNonNull(value, "fhirVersion");
    if (this.fhirVersion == newValue) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        newValue,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#fhirVersion() fhirVersion} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fhirVersion
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withFhirVersion(Optional<? extends List<ImplementationguideFhirversionItem>> optional) {
    @Nullable List<ImplementationguideFhirversionItem> value = optional.orElse(null);
    if (this.fhirVersion == value) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        value,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        newValue,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        value,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        newValue,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        value,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withPublisher(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "publisher");
    if (Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        newValue,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withPublisher(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.publisher, value)) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        value,
        this.packageId,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#packageId() packageId} attribute.
   * @param value The value for packageId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withPackageId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "packageId");
    if (this.packageId == newValue) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        newValue,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#packageId() packageId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for packageId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withPackageId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.packageId == value) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        value,
        this.global,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#global() global} attribute.
   * @param value The value for global
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withGlobal(List<ImplementationGuide_Global> value) {
    @Nullable List<ImplementationGuide_Global> newValue = Objects.requireNonNull(value, "global");
    if (this.global == newValue) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        newValue,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#global() global} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for global
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withGlobal(Optional<? extends List<ImplementationGuide_Global>> optional) {
    @Nullable List<ImplementationGuide_Global> value = optional.orElse(null);
    if (this.global == value) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        value,
        this.version,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        newValue,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        value,
        this.useContext);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide withUseContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide withUseContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableImplementationGuide(
        this.license,
        this.contact,
        this.implicitRules,
        this.meta,
        this.manifest,
        this.experimental,
        this.dependsOn,
        this.extension,
        this.title,
        this.id,
        this.definition,
        this.name,
        this.copyright,
        this.url,
        this.resourceType,
        this.language,
        this.contained,
        this.status,
        this.description,
        this.modifierExtension,
        this.jurisdiction,
        this.fhirVersion,
        this.date,
        this.text,
        this.publisher,
        this.packageId,
        this.global,
        this.version,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImplementationGuide} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImplementationGuide
        && equalTo((ImmutableImplementationGuide) another);
  }

  private boolean equalTo(ImmutableImplementationGuide another) {
    return Objects.equals(license, another.license)
        && Objects.equals(contact, another.contact)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(meta, another.meta)
        && Objects.equals(manifest, another.manifest)
        && Objects.equals(experimental, another.experimental)
        && Objects.equals(dependsOn, another.dependsOn)
        && Objects.equals(extension, another.extension)
        && Objects.equals(title, another.title)
        && Objects.equals(id, another.id)
        && Objects.equals(definition, another.definition)
        && Objects.equals(name, another.name)
        && Objects.equals(copyright, another.copyright)
        && Objects.equals(url, another.url)
        && resourceType.equals(another.resourceType)
        && Objects.equals(language, another.language)
        && Objects.equals(contained, another.contained)
        && Objects.equals(status, another.status)
        && Objects.equals(description, another.description)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(fhirVersion, another.fhirVersion)
        && Objects.equals(date, another.date)
        && Objects.equals(text, another.text)
        && Objects.equals(publisher, another.publisher)
        && Objects.equals(packageId, another.packageId)
        && Objects.equals(global, another.global)
        && Objects.equals(version, another.version)
        && Objects.equals(useContext, another.useContext);
  }

  /**
   * Computes a hash code from attributes: {@code license}, {@code contact}, {@code implicitRules}, {@code meta}, {@code manifest}, {@code experimental}, {@code dependsOn}, {@code extension}, {@code title}, {@code id}, {@code definition}, {@code name}, {@code copyright}, {@code url}, {@code resourceType}, {@code language}, {@code contained}, {@code status}, {@code description}, {@code modifierExtension}, {@code jurisdiction}, {@code fhirVersion}, {@code date}, {@code text}, {@code publisher}, {@code packageId}, {@code global}, {@code version}, {@code useContext}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(license);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(manifest);
    h += (h << 5) + Objects.hashCode(experimental);
    h += (h << 5) + Objects.hashCode(dependsOn);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(definition);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(copyright);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(fhirVersion);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(publisher);
    h += (h << 5) + Objects.hashCode(packageId);
    h += (h << 5) + Objects.hashCode(global);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(useContext);
    return h;
  }

  /**
   * Prints the immutable value {@code ImplementationGuide} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ImplementationGuide{");
    if (license != null) {
      builder.append("license=").append(license);
    }
    if (contact != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (implicitRules != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (meta != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (manifest != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("manifest=").append(manifest);
    }
    if (experimental != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (dependsOn != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("dependsOn=").append(dependsOn);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (title != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (definition != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("definition=").append(definition);
    }
    if (name != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (copyright != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (url != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (builder.length() > 20) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (fhirVersion != null) {
      builder.append(", ");
      builder.append("fhirVersion=").append(fhirVersion);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (packageId != null) {
      builder.append(", ");
      builder.append("packageId=").append(packageId);
    }
    if (global != null) {
      builder.append(", ");
      builder.append("global=").append(global);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ImplementationGuide", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ImplementationGuide {
    @Nullable Optional<ImplementationguideLicense> license = Optional.empty();
    boolean licenseIsSet;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<ImplementationGuide_Manifest> manifest = Optional.empty();
    boolean manifestIsSet;
    @Nullable Optional<Boolean> experimental = Optional.empty();
    boolean experimentalIsSet;
    @Nullable Optional<List<ImplementationGuide_DependsOn>> dependsOn = Optional.empty();
    boolean dependsOnIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<ImplementationGuide_Definition> definition = Optional.empty();
    boolean definitionIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<Markdown> copyright = Optional.empty();
    boolean copyrightIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<ImplementationguideStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<List<ImplementationguideFhirversionItem>> fhirVersion = Optional.empty();
    boolean fhirVersionIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<String> publisher = Optional.empty();
    boolean publisherIsSet;
    @Nullable Optional<Id> packageId = Optional.empty();
    boolean packageIdIsSet;
    @Nullable Optional<List<ImplementationGuide_Global>> global = Optional.empty();
    boolean globalIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<List<UsageContext>> useContext = Optional.empty();
    boolean useContextIsSet;
    @JsonProperty("license")
    public void setLicense(Optional<ImplementationguideLicense> license) {
      this.license = license;
      this.licenseIsSet = true;
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
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("manifest")
    public void setManifest(Optional<ImplementationGuide_Manifest> manifest) {
      this.manifest = manifest;
      this.manifestIsSet = true;
    }
    @JsonProperty("experimental")
    public void setExperimental(Optional<Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @JsonProperty("dependsOn")
    public void setDependsOn(Optional<List<ImplementationGuide_DependsOn>> dependsOn) {
      this.dependsOn = dependsOn;
      this.dependsOnIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("definition")
    public void setDefinition(Optional<ImplementationGuide_Definition> definition) {
      this.definition = definition;
      this.definitionIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("copyright")
    public void setCopyright(Optional<Markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<ImplementationguideStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<List<CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("fhirVersion")
    public void setFhirVersion(Optional<List<ImplementationguideFhirversionItem>> fhirVersion) {
      this.fhirVersion = fhirVersion;
      this.fhirVersionIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
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
    @JsonProperty("packageId")
    public void setPackageId(Optional<Id> packageId) {
      this.packageId = packageId;
      this.packageIdIsSet = true;
    }
    @JsonProperty("global")
    public void setGlobal(Optional<List<ImplementationGuide_Global>> global) {
      this.global = global;
      this.globalIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("useContext")
    public void setUseContext(Optional<List<UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @Override
    public Optional<ImplementationguideLicense> license() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ImplementationGuide_Manifest> manifest() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ImplementationGuide_DependsOn>> dependsOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ImplementationGuide_Definition> definition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ImplementationguideStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ImplementationguideFhirversionItem>> fhirVersion() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> packageId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ImplementationGuide_Global>> global() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UsageContext>> useContext() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableImplementationGuide fromJson(Json json) {
    ImmutableImplementationGuide.Builder builder = ((ImmutableImplementationGuide.Builder) ImmutableImplementationGuide.builder());
    if (json.licenseIsSet) {
      builder.license(json.license);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.manifestIsSet) {
      builder.manifest(json.manifest);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.dependsOnIsSet) {
      builder.dependsOn(json.dependsOn);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.definitionIsSet) {
      builder.definition(json.definition);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.fhirVersionIsSet) {
      builder.fhirVersion(json.fhirVersion);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.packageIdIsSet) {
      builder.packageId(json.packageId);
    }
    if (json.globalIsSet) {
      builder.global(json.global);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    return (ImmutableImplementationGuide) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImplementationGuide} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImplementationGuide instance
   */
  public static ImplementationGuide copyOf(ImplementationGuide instance) {
    if (instance instanceof ImmutableImplementationGuide) {
      return (ImmutableImplementationGuide) instance;
    }
    return ((ImmutableImplementationGuide.Builder) ImmutableImplementationGuide.builder())
        .license(instance.license())
        .contact(instance.contact())
        .implicitRules(instance.implicitRules())
        .meta(instance.meta())
        .manifest(instance.manifest())
        .experimental(instance.experimental())
        .dependsOn(instance.dependsOn())
        .extension(instance.extension())
        .title(instance.title())
        .id(instance.id())
        .definition(instance.definition())
        .name(instance.name())
        .copyright(instance.copyright())
        .url(instance.url())
        .resourceType(instance.resourceType())
        .language(instance.language())
        .contained(instance.contained())
        .status(instance.status())
        .description(instance.description())
        .modifierExtension(instance.modifierExtension())
        .jurisdiction(instance.jurisdiction())
        .fhirVersion(instance.fhirVersion())
        .date(instance.date())
        .text(instance.text())
        .publisher(instance.publisher())
        .packageId(instance.packageId())
        .global(instance.global())
        .version(instance.version())
        .useContext(instance.useContext())
        .build();
  }

  /**
   * Creates a builder for {@link ImplementationGuide ImplementationGuide}.
   * <pre>
   * ImmutableImplementationGuide.builder()
   *    .license(com.medplum.types.fhir.ImplementationguideLicense) // optional {@link ImplementationGuide#license() license}
   *    .contact(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link ImplementationGuide#contact() contact}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link ImplementationGuide#implicitRules() implicitRules}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link ImplementationGuide#meta() meta}
   *    .manifest(com.medplum.types.fhir.ImplementationGuide_Manifest) // optional {@link ImplementationGuide#manifest() manifest}
   *    .experimental(Boolean) // optional {@link ImplementationGuide#experimental() experimental}
   *    .dependsOn(List&amp;lt;com.medplum.types.fhir.ImplementationGuide_DependsOn&amp;gt;) // optional {@link ImplementationGuide#dependsOn() dependsOn}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide#extension() extension}
   *    .title(String) // optional {@link ImplementationGuide#title() title}
   *    .id(com.medplum.types.fhir.Id) // optional {@link ImplementationGuide#id() id}
   *    .definition(com.medplum.types.fhir.ImplementationGuide_Definition) // optional {@link ImplementationGuide#definition() definition}
   *    .name(String) // optional {@link ImplementationGuide#name() name}
   *    .copyright(com.medplum.types.fhir.Markdown) // optional {@link ImplementationGuide#copyright() copyright}
   *    .url(com.medplum.types.fhir.Uri) // optional {@link ImplementationGuide#url() url}
   *    .resourceType(String) // required {@link ImplementationGuide#resourceType() resourceType}
   *    .language(com.medplum.types.fhir.Code) // optional {@link ImplementationGuide#language() language}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link ImplementationGuide#contained() contained}
   *    .status(com.medplum.types.fhir.ImplementationguideStatus) // optional {@link ImplementationGuide#status() status}
   *    .description(com.medplum.types.fhir.Markdown) // optional {@link ImplementationGuide#description() description}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide#modifierExtension() modifierExtension}
   *    .jurisdiction(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ImplementationGuide#jurisdiction() jurisdiction}
   *    .fhirVersion(List&amp;lt;com.medplum.types.fhir.ImplementationguideFhirversionItem&amp;gt;) // optional {@link ImplementationGuide#fhirVersion() fhirVersion}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link ImplementationGuide#date() date}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link ImplementationGuide#text() text}
   *    .publisher(String) // optional {@link ImplementationGuide#publisher() publisher}
   *    .packageId(com.medplum.types.fhir.Id) // optional {@link ImplementationGuide#packageId() packageId}
   *    .global(List&amp;lt;com.medplum.types.fhir.ImplementationGuide_Global&amp;gt;) // optional {@link ImplementationGuide#global() global}
   *    .version(String) // optional {@link ImplementationGuide#version() version}
   *    .useContext(List&amp;lt;com.medplum.types.fhir.UsageContext&amp;gt;) // optional {@link ImplementationGuide#useContext() useContext}
   *    .build();
   * </pre>
   * @return A new ImplementationGuide builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableImplementationGuide.Builder();
  }

  /**
   * Builds instances of type {@link ImplementationGuide ImplementationGuide}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ImplementationGuide", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_LICENSE = 0x1L;
    private static final long OPT_BIT_CONTACT = 0x2L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x4L;
    private static final long OPT_BIT_META = 0x8L;
    private static final long OPT_BIT_MANIFEST = 0x10L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x20L;
    private static final long OPT_BIT_DEPENDS_ON = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_TITLE = 0x100L;
    private static final long OPT_BIT_ID = 0x200L;
    private static final long OPT_BIT_DEFINITION = 0x400L;
    private static final long OPT_BIT_NAME = 0x800L;
    private static final long OPT_BIT_COPYRIGHT = 0x1000L;
    private static final long OPT_BIT_URL = 0x2000L;
    private static final long OPT_BIT_LANGUAGE = 0x4000L;
    private static final long OPT_BIT_CONTAINED = 0x8000L;
    private static final long OPT_BIT_STATUS = 0x10000L;
    private static final long OPT_BIT_DESCRIPTION = 0x20000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40000L;
    private static final long OPT_BIT_JURISDICTION = 0x80000L;
    private static final long OPT_BIT_FHIR_VERSION = 0x100000L;
    private static final long OPT_BIT_DATE = 0x200000L;
    private static final long OPT_BIT_TEXT = 0x400000L;
    private static final long OPT_BIT_PUBLISHER = 0x800000L;
    private static final long OPT_BIT_PACKAGE_ID = 0x1000000L;
    private static final long OPT_BIT_GLOBAL = 0x2000000L;
    private static final long OPT_BIT_VERSION = 0x4000000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x8000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable ImplementationguideLicense license;
    private @Nullable List<ContactDetail> contact;
    private @Nullable Uri implicitRules;
    private @Nullable Meta meta;
    private @Nullable ImplementationGuide_Manifest manifest;
    private @Nullable Boolean experimental;
    private @Nullable List<ImplementationGuide_DependsOn> dependsOn;
    private @Nullable List<Extension> extension;
    private @Nullable String title;
    private @Nullable Id id;
    private @Nullable ImplementationGuide_Definition definition;
    private @Nullable String name;
    private @Nullable Markdown copyright;
    private @Nullable Uri url;
    private @Nullable String resourceType;
    private @Nullable Code language;
    private @Nullable List<ResourceList> contained;
    private @Nullable ImplementationguideStatus status;
    private @Nullable Markdown description;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable List<ImplementationguideFhirversionItem> fhirVersion;
    private @Nullable DateTime date;
    private @Nullable Narrative text;
    private @Nullable String publisher;
    private @Nullable Id packageId;
    private @Nullable List<ImplementationGuide_Global> global;
    private @Nullable String version;
    private @Nullable List<UsageContext> useContext;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#license() license} to license.
     * @param license The value for license
     * @return {@code this} builder for chained invocation
     */
    public final Builder license(ImplementationguideLicense license) {
      checkNotIsSet(licenseIsSet(), "license");
      this.license = Objects.requireNonNull(license, "license");
      optBits |= OPT_BIT_LICENSE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#license() license} to license.
     * @param license The value for license
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("license")
    public final Builder license(Optional<? extends ImplementationguideLicense> license) {
      checkNotIsSet(licenseIsSet(), "license");
      this.license = license.orElse(null);
      optBits |= OPT_BIT_LICENSE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#contact() contact} to contact.
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
     * Initializes the optional value {@link ImplementationGuide#contact() contact} to contact.
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
     * Initializes the optional value {@link ImplementationGuide#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ImplementationGuide#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ImplementationGuide#meta() meta} to meta.
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
     * Initializes the optional value {@link ImplementationGuide#meta() meta} to meta.
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
     * Initializes the optional value {@link ImplementationGuide#manifest() manifest} to manifest.
     * @param manifest The value for manifest
     * @return {@code this} builder for chained invocation
     */
    public final Builder manifest(ImplementationGuide_Manifest manifest) {
      checkNotIsSet(manifestIsSet(), "manifest");
      this.manifest = Objects.requireNonNull(manifest, "manifest");
      optBits |= OPT_BIT_MANIFEST;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#manifest() manifest} to manifest.
     * @param manifest The value for manifest
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("manifest")
    public final Builder manifest(Optional<? extends ImplementationGuide_Manifest> manifest) {
      checkNotIsSet(manifestIsSet(), "manifest");
      this.manifest = manifest.orElse(null);
      optBits |= OPT_BIT_MANIFEST;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link ImplementationGuide#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link ImplementationGuide#dependsOn() dependsOn} to dependsOn.
     * @param dependsOn The value for dependsOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder dependsOn(List<ImplementationGuide_DependsOn> dependsOn) {
      checkNotIsSet(dependsOnIsSet(), "dependsOn");
      this.dependsOn = Objects.requireNonNull(dependsOn, "dependsOn");
      optBits |= OPT_BIT_DEPENDS_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#dependsOn() dependsOn} to dependsOn.
     * @param dependsOn The value for dependsOn
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dependsOn")
    public final Builder dependsOn(Optional<? extends List<ImplementationGuide_DependsOn>> dependsOn) {
      checkNotIsSet(dependsOnIsSet(), "dependsOn");
      this.dependsOn = dependsOn.orElse(null);
      optBits |= OPT_BIT_DEPENDS_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#extension() extension} to extension.
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
     * Initializes the optional value {@link ImplementationGuide#extension() extension} to extension.
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
     * Initializes the optional value {@link ImplementationGuide#title() title} to title.
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
     * Initializes the optional value {@link ImplementationGuide#title() title} to title.
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
     * Initializes the optional value {@link ImplementationGuide#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for chained invocation
     */
    public final Builder definition(ImplementationGuide_Definition definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = Objects.requireNonNull(definition, "definition");
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("definition")
    public final Builder definition(Optional<? extends ImplementationGuide_Definition> definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = definition.orElse(null);
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#name() name} to name.
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
     * Initializes the optional value {@link ImplementationGuide#name() name} to name.
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
     * Initializes the optional value {@link ImplementationGuide#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link ImplementationGuide#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link ImplementationGuide#url() url} to url.
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
     * Initializes the optional value {@link ImplementationGuide#url() url} to url.
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
     * Initializes the value for the {@link ImplementationGuide#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ImplementationGuide#language() language} to language.
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
     * Initializes the optional value {@link ImplementationGuide#language() language} to language.
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
     * Initializes the optional value {@link ImplementationGuide#contained() contained} to contained.
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
     * Initializes the optional value {@link ImplementationGuide#contained() contained} to contained.
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
     * Initializes the optional value {@link ImplementationGuide#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(ImplementationguideStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends ImplementationguideStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#description() description} to description.
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
     * Initializes the optional value {@link ImplementationGuide#description() description} to description.
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
     * Initializes the optional value {@link ImplementationGuide#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImplementationGuide#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImplementationGuide#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ImplementationGuide#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ImplementationGuide#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for chained invocation
     */
    public final Builder fhirVersion(List<ImplementationguideFhirversionItem> fhirVersion) {
      checkNotIsSet(fhirVersionIsSet(), "fhirVersion");
      this.fhirVersion = Objects.requireNonNull(fhirVersion, "fhirVersion");
      optBits |= OPT_BIT_FHIR_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("fhirVersion")
    public final Builder fhirVersion(Optional<? extends List<ImplementationguideFhirversionItem>> fhirVersion) {
      checkNotIsSet(fhirVersionIsSet(), "fhirVersion");
      this.fhirVersion = fhirVersion.orElse(null);
      optBits |= OPT_BIT_FHIR_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#date() date} to date.
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
     * Initializes the optional value {@link ImplementationGuide#date() date} to date.
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
     * Initializes the optional value {@link ImplementationGuide#text() text} to text.
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
     * Initializes the optional value {@link ImplementationGuide#text() text} to text.
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
     * Initializes the optional value {@link ImplementationGuide#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ImplementationGuide#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ImplementationGuide#packageId() packageId} to packageId.
     * @param packageId The value for packageId
     * @return {@code this} builder for chained invocation
     */
    public final Builder packageId(Id packageId) {
      checkNotIsSet(packageIdIsSet(), "packageId");
      this.packageId = Objects.requireNonNull(packageId, "packageId");
      optBits |= OPT_BIT_PACKAGE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#packageId() packageId} to packageId.
     * @param packageId The value for packageId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("packageId")
    public final Builder packageId(Optional<? extends Id> packageId) {
      checkNotIsSet(packageIdIsSet(), "packageId");
      this.packageId = packageId.orElse(null);
      optBits |= OPT_BIT_PACKAGE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#global() global} to global.
     * @param global The value for global
     * @return {@code this} builder for chained invocation
     */
    public final Builder global(List<ImplementationGuide_Global> global) {
      checkNotIsSet(globalIsSet(), "global");
      this.global = Objects.requireNonNull(global, "global");
      optBits |= OPT_BIT_GLOBAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#global() global} to global.
     * @param global The value for global
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("global")
    public final Builder global(Optional<? extends List<ImplementationGuide_Global>> global) {
      checkNotIsSet(globalIsSet(), "global");
      this.global = global.orElse(null);
      optBits |= OPT_BIT_GLOBAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide#version() version} to version.
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
     * Initializes the optional value {@link ImplementationGuide#version() version} to version.
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
     * Initializes the optional value {@link ImplementationGuide#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link ImplementationGuide#useContext() useContext} to useContext.
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
     * Builds a new {@link ImplementationGuide ImplementationGuide}.
     * @return An immutable instance of ImplementationGuide
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImplementationGuide build() {
      checkRequiredAttributes();
      return new ImmutableImplementationGuide(
          license,
          contact,
          implicitRules,
          meta,
          manifest,
          experimental,
          dependsOn,
          extension,
          title,
          id,
          definition,
          name,
          copyright,
          url,
          resourceType,
          language,
          contained,
          status,
          description,
          modifierExtension,
          jurisdiction,
          fhirVersion,
          date,
          text,
          publisher,
          packageId,
          global,
          version,
          useContext);
    }

    private boolean licenseIsSet() {
      return (optBits & OPT_BIT_LICENSE) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean manifestIsSet() {
      return (optBits & OPT_BIT_MANIFEST) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean dependsOnIsSet() {
      return (optBits & OPT_BIT_DEPENDS_ON) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean definitionIsSet() {
      return (optBits & OPT_BIT_DEFINITION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean fhirVersionIsSet() {
      return (optBits & OPT_BIT_FHIR_VERSION) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean packageIdIsSet() {
      return (optBits & OPT_BIT_PACKAGE_ID) != 0;
    }

    private boolean globalIsSet() {
      return (optBits & OPT_BIT_GLOBAL) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ImplementationGuide is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build ImplementationGuide, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ImplementationGuide", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ImplementationGuide#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "ImplementationGuide", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ImplementationGuide#license() license} to license.
     * @param license The value for license
     * @return {@code this} builder for chained invocation
     */
    BuildFinal license(ImplementationguideLicense license);

    /**
     * Initializes the optional value {@link ImplementationGuide#license() license} to license.
     * @param license The value for license
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal license(Optional<? extends ImplementationguideLicense> license);

    /**
     * Initializes the optional value {@link ImplementationGuide#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link ImplementationGuide#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Initializes the optional value {@link ImplementationGuide#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link ImplementationGuide#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link ImplementationGuide#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link ImplementationGuide#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link ImplementationGuide#manifest() manifest} to manifest.
     * @param manifest The value for manifest
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manifest(ImplementationGuide_Manifest manifest);

    /**
     * Initializes the optional value {@link ImplementationGuide#manifest() manifest} to manifest.
     * @param manifest The value for manifest
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manifest(Optional<? extends ImplementationGuide_Manifest> manifest);

    /**
     * Initializes the optional value {@link ImplementationGuide#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link ImplementationGuide#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(Optional<Boolean> experimental);

    /**
     * Initializes the optional value {@link ImplementationGuide#dependsOn() dependsOn} to dependsOn.
     * @param dependsOn The value for dependsOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dependsOn(List<ImplementationGuide_DependsOn> dependsOn);

    /**
     * Initializes the optional value {@link ImplementationGuide#dependsOn() dependsOn} to dependsOn.
     * @param dependsOn The value for dependsOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dependsOn(Optional<? extends List<ImplementationGuide_DependsOn>> dependsOn);

    /**
     * Initializes the optional value {@link ImplementationGuide#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ImplementationGuide#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ImplementationGuide#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link ImplementationGuide#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Initializes the optional value {@link ImplementationGuide#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link ImplementationGuide#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link ImplementationGuide#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal definition(ImplementationGuide_Definition definition);

    /**
     * Initializes the optional value {@link ImplementationGuide#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal definition(Optional<? extends ImplementationGuide_Definition> definition);

    /**
     * Initializes the optional value {@link ImplementationGuide#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link ImplementationGuide#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link ImplementationGuide#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(Markdown copyright);

    /**
     * Initializes the optional value {@link ImplementationGuide#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(Optional<? extends Markdown> copyright);

    /**
     * Initializes the optional value {@link ImplementationGuide#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link ImplementationGuide#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link ImplementationGuide#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link ImplementationGuide#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link ImplementationGuide#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link ImplementationGuide#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link ImplementationGuide#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(ImplementationguideStatus status);

    /**
     * Initializes the optional value {@link ImplementationGuide#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends ImplementationguideStatus> status);

    /**
     * Initializes the optional value {@link ImplementationGuide#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(Markdown description);

    /**
     * Initializes the optional value {@link ImplementationGuide#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<? extends Markdown> description);

    /**
     * Initializes the optional value {@link ImplementationGuide#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ImplementationGuide#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ImplementationGuide#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(List<CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link ImplementationGuide#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link ImplementationGuide#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for chained invocation
     */
    BuildFinal fhirVersion(List<ImplementationguideFhirversionItem> fhirVersion);

    /**
     * Initializes the optional value {@link ImplementationGuide#fhirVersion() fhirVersion} to fhirVersion.
     * @param fhirVersion The value for fhirVersion
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal fhirVersion(Optional<? extends List<ImplementationguideFhirversionItem>> fhirVersion);

    /**
     * Initializes the optional value {@link ImplementationGuide#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link ImplementationGuide#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link ImplementationGuide#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link ImplementationGuide#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link ImplementationGuide#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(String publisher);

    /**
     * Initializes the optional value {@link ImplementationGuide#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<String> publisher);

    /**
     * Initializes the optional value {@link ImplementationGuide#packageId() packageId} to packageId.
     * @param packageId The value for packageId
     * @return {@code this} builder for chained invocation
     */
    BuildFinal packageId(Id packageId);

    /**
     * Initializes the optional value {@link ImplementationGuide#packageId() packageId} to packageId.
     * @param packageId The value for packageId
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal packageId(Optional<? extends Id> packageId);

    /**
     * Initializes the optional value {@link ImplementationGuide#global() global} to global.
     * @param global The value for global
     * @return {@code this} builder for chained invocation
     */
    BuildFinal global(List<ImplementationGuide_Global> global);

    /**
     * Initializes the optional value {@link ImplementationGuide#global() global} to global.
     * @param global The value for global
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal global(Optional<? extends List<ImplementationGuide_Global>> global);

    /**
     * Initializes the optional value {@link ImplementationGuide#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link ImplementationGuide#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link ImplementationGuide#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(List<UsageContext> useContext);

    /**
     * Initializes the optional value {@link ImplementationGuide#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(Optional<? extends List<UsageContext>> useContext);

    /**
     * Builds a new {@link ImplementationGuide ImplementationGuide}.
     * @return An immutable instance of ImplementationGuide
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ImplementationGuide build();
  }
}
