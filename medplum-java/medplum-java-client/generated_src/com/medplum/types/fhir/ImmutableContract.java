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
 * Immutable implementation of {@link Contract}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableContract.builder()}.
 */
@Generated(from = "Contract", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableContract implements Contract {
  private final @Nullable List<Extension> extension;
  private final @Nullable Attachment legallyBindingAttachment;
  private final @Nullable List<CodeableConcept> subType;
  private final @Nullable Reference instantiatesCanonical;
  private final @Nullable String subtitle;
  private final @Nullable DateTime issued;
  private final @Nullable List<Contract_Term> term;
  private final @Nullable List<String> alias;
  private final @Nullable List<Reference> relevantHistory;
  private final @Nullable List<Contract_Rule> rule;
  private final String resourceType;
  private final @Nullable Code language;
  private final @Nullable List<Reference> authority;
  private final @Nullable CodeableConcept topicCodeableConcept;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable CodeableConcept scope;
  private final @Nullable List<Contract_Legal> legal;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable CodeableConcept contentDerivative;
  private final @Nullable Id id;
  private final @Nullable String title;
  private final @Nullable String version;
  private final @Nullable List<Contract_Friendly> friendly;
  private final @Nullable Uri instantiatesUri;
  private final @Nullable Meta meta;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Reference author;
  private final @Nullable Narrative text;
  private final @Nullable List<Reference> supportingInfo;
  private final @Nullable List<Reference> domain;
  private final @Nullable Uri implicitRules;
  private final @Nullable CodeableConcept expirationType;
  private final @Nullable List<Reference> subject;
  private final @Nullable List<Reference> site;
  private final @Nullable Contract_ContentDefinition contentDefinition;
  private final @Nullable CodeableConcept legalState;
  private final @Nullable List<Contract_Signer> signer;
  private final @Nullable Reference legallyBindingReference;
  private final @Nullable Uri url;
  private final @Nullable Period applies;
  private final @Nullable String name;
  private final @Nullable Code status;
  private final @Nullable Reference topicReference;
  private final @Nullable CodeableConcept type;

  private ImmutableContract(
      @Nullable List<Extension> extension,
      @Nullable Attachment legallyBindingAttachment,
      @Nullable List<CodeableConcept> subType,
      @Nullable Reference instantiatesCanonical,
      @Nullable String subtitle,
      @Nullable DateTime issued,
      @Nullable List<Contract_Term> term,
      @Nullable List<String> alias,
      @Nullable List<Reference> relevantHistory,
      @Nullable List<Contract_Rule> rule,
      String resourceType,
      @Nullable Code language,
      @Nullable List<Reference> authority,
      @Nullable CodeableConcept topicCodeableConcept,
      @Nullable List<Identifier> identifier,
      @Nullable CodeableConcept scope,
      @Nullable List<Contract_Legal> legal,
      @Nullable List<ResourceList> contained,
      @Nullable CodeableConcept contentDerivative,
      @Nullable Id id,
      @Nullable String title,
      @Nullable String version,
      @Nullable List<Contract_Friendly> friendly,
      @Nullable Uri instantiatesUri,
      @Nullable Meta meta,
      @Nullable List<Extension> modifierExtension,
      @Nullable Reference author,
      @Nullable Narrative text,
      @Nullable List<Reference> supportingInfo,
      @Nullable List<Reference> domain,
      @Nullable Uri implicitRules,
      @Nullable CodeableConcept expirationType,
      @Nullable List<Reference> subject,
      @Nullable List<Reference> site,
      @Nullable Contract_ContentDefinition contentDefinition,
      @Nullable CodeableConcept legalState,
      @Nullable List<Contract_Signer> signer,
      @Nullable Reference legallyBindingReference,
      @Nullable Uri url,
      @Nullable Period applies,
      @Nullable String name,
      @Nullable Code status,
      @Nullable Reference topicReference,
      @Nullable CodeableConcept type) {
    this.extension = extension;
    this.legallyBindingAttachment = legallyBindingAttachment;
    this.subType = subType;
    this.instantiatesCanonical = instantiatesCanonical;
    this.subtitle = subtitle;
    this.issued = issued;
    this.term = term;
    this.alias = alias;
    this.relevantHistory = relevantHistory;
    this.rule = rule;
    this.resourceType = resourceType;
    this.language = language;
    this.authority = authority;
    this.topicCodeableConcept = topicCodeableConcept;
    this.identifier = identifier;
    this.scope = scope;
    this.legal = legal;
    this.contained = contained;
    this.contentDerivative = contentDerivative;
    this.id = id;
    this.title = title;
    this.version = version;
    this.friendly = friendly;
    this.instantiatesUri = instantiatesUri;
    this.meta = meta;
    this.modifierExtension = modifierExtension;
    this.author = author;
    this.text = text;
    this.supportingInfo = supportingInfo;
    this.domain = domain;
    this.implicitRules = implicitRules;
    this.expirationType = expirationType;
    this.subject = subject;
    this.site = site;
    this.contentDefinition = contentDefinition;
    this.legalState = legalState;
    this.signer = signer;
    this.legallyBindingReference = legallyBindingReference;
    this.url = url;
    this.applies = applies;
    this.name = name;
    this.status = status;
    this.topicReference = topicReference;
    this.type = type;
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
   * @return The value of the {@code legallyBindingAttachment} attribute
   */
  @JsonProperty("legallyBindingAttachment")
  @Override
  public Optional<Attachment> legallyBindingAttachment() {
    return Optional.ofNullable(legallyBindingAttachment);
  }

  /**
   * @return The value of the {@code subType} attribute
   */
  @JsonProperty("subType")
  @Override
  public Optional<List<CodeableConcept>> subType() {
    return Optional.ofNullable(subType);
  }

  /**
   * @return The value of the {@code instantiatesCanonical} attribute
   */
  @JsonProperty("instantiatesCanonical")
  @Override
  public Optional<Reference> instantiatesCanonical() {
    return Optional.ofNullable(instantiatesCanonical);
  }

  /**
   * @return The value of the {@code subtitle} attribute
   */
  @JsonProperty("subtitle")
  @Override
  public Optional<String> subtitle() {
    return Optional.ofNullable(subtitle);
  }

  /**
   * @return The value of the {@code issued} attribute
   */
  @JsonProperty("issued")
  @Override
  public Optional<DateTime> issued() {
    return Optional.ofNullable(issued);
  }

  /**
   * @return The value of the {@code term} attribute
   */
  @JsonProperty("term")
  @Override
  public Optional<List<Contract_Term>> term() {
    return Optional.ofNullable(term);
  }

  /**
   * @return The value of the {@code alias} attribute
   */
  @JsonProperty("alias")
  @Override
  public Optional<List<String>> alias() {
    return Optional.ofNullable(alias);
  }

  /**
   * @return The value of the {@code relevantHistory} attribute
   */
  @JsonProperty("relevantHistory")
  @Override
  public Optional<List<Reference>> relevantHistory() {
    return Optional.ofNullable(relevantHistory);
  }

  /**
   * @return The value of the {@code rule} attribute
   */
  @JsonProperty("rule")
  @Override
  public Optional<List<Contract_Rule>> rule() {
    return Optional.ofNullable(rule);
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
   * @return The value of the {@code authority} attribute
   */
  @JsonProperty("authority")
  @Override
  public Optional<List<Reference>> authority() {
    return Optional.ofNullable(authority);
  }

  /**
   * @return The value of the {@code topicCodeableConcept} attribute
   */
  @JsonProperty("topicCodeableConcept")
  @Override
  public Optional<CodeableConcept> topicCodeableConcept() {
    return Optional.ofNullable(topicCodeableConcept);
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
   * @return The value of the {@code scope} attribute
   */
  @JsonProperty("scope")
  @Override
  public Optional<CodeableConcept> scope() {
    return Optional.ofNullable(scope);
  }

  /**
   * @return The value of the {@code legal} attribute
   */
  @JsonProperty("legal")
  @Override
  public Optional<List<Contract_Legal>> legal() {
    return Optional.ofNullable(legal);
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
   * @return The value of the {@code contentDerivative} attribute
   */
  @JsonProperty("contentDerivative")
  @Override
  public Optional<CodeableConcept> contentDerivative() {
    return Optional.ofNullable(contentDerivative);
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
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
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
   * @return The value of the {@code friendly} attribute
   */
  @JsonProperty("friendly")
  @Override
  public Optional<List<Contract_Friendly>> friendly() {
    return Optional.ofNullable(friendly);
  }

  /**
   * @return The value of the {@code instantiatesUri} attribute
   */
  @JsonProperty("instantiatesUri")
  @Override
  public Optional<Uri> instantiatesUri() {
    return Optional.ofNullable(instantiatesUri);
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
   * @return The value of the {@code author} attribute
   */
  @JsonProperty("author")
  @Override
  public Optional<Reference> author() {
    return Optional.ofNullable(author);
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
   * @return The value of the {@code supportingInfo} attribute
   */
  @JsonProperty("supportingInfo")
  @Override
  public Optional<List<Reference>> supportingInfo() {
    return Optional.ofNullable(supportingInfo);
  }

  /**
   * @return The value of the {@code domain} attribute
   */
  @JsonProperty("domain")
  @Override
  public Optional<List<Reference>> domain() {
    return Optional.ofNullable(domain);
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
   * @return The value of the {@code expirationType} attribute
   */
  @JsonProperty("expirationType")
  @Override
  public Optional<CodeableConcept> expirationType() {
    return Optional.ofNullable(expirationType);
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
   * @return The value of the {@code site} attribute
   */
  @JsonProperty("site")
  @Override
  public Optional<List<Reference>> site() {
    return Optional.ofNullable(site);
  }

  /**
   * @return The value of the {@code contentDefinition} attribute
   */
  @JsonProperty("contentDefinition")
  @Override
  public Optional<Contract_ContentDefinition> contentDefinition() {
    return Optional.ofNullable(contentDefinition);
  }

  /**
   * @return The value of the {@code legalState} attribute
   */
  @JsonProperty("legalState")
  @Override
  public Optional<CodeableConcept> legalState() {
    return Optional.ofNullable(legalState);
  }

  /**
   * @return The value of the {@code signer} attribute
   */
  @JsonProperty("signer")
  @Override
  public Optional<List<Contract_Signer>> signer() {
    return Optional.ofNullable(signer);
  }

  /**
   * @return The value of the {@code legallyBindingReference} attribute
   */
  @JsonProperty("legallyBindingReference")
  @Override
  public Optional<Reference> legallyBindingReference() {
    return Optional.ofNullable(legallyBindingReference);
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
   * @return The value of the {@code applies} attribute
   */
  @JsonProperty("applies")
  @Override
  public Optional<Period> applies() {
    return Optional.ofNullable(applies);
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
  public Optional<Code> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code topicReference} attribute
   */
  @JsonProperty("topicReference")
  @Override
  public Optional<Reference> topicReference() {
    return Optional.ofNullable(topicReference);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableContract(
        newValue,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableContract(
        value,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#legallyBindingAttachment() legallyBindingAttachment} attribute.
   * @param value The value for legallyBindingAttachment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withLegallyBindingAttachment(Attachment value) {
    @Nullable Attachment newValue = Objects.requireNonNull(value, "legallyBindingAttachment");
    if (this.legallyBindingAttachment == newValue) return this;
    return new ImmutableContract(
        this.extension,
        newValue,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#legallyBindingAttachment() legallyBindingAttachment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for legallyBindingAttachment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withLegallyBindingAttachment(Optional<? extends Attachment> optional) {
    @Nullable Attachment value = optional.orElse(null);
    if (this.legallyBindingAttachment == value) return this;
    return new ImmutableContract(
        this.extension,
        value,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#subType() subType} attribute.
   * @param value The value for subType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withSubType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "subType");
    if (this.subType == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        newValue,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#subType() subType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withSubType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.subType == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        value,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withInstantiatesCanonical(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        newValue,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withInstantiatesCanonical(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        value,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#subtitle() subtitle} attribute.
   * @param value The value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withSubtitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "subtitle");
    if (Objects.equals(this.subtitle, newValue)) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        newValue,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#subtitle() subtitle} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withSubtitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.subtitle, value)) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        value,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#issued() issued} attribute.
   * @param value The value for issued
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withIssued(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "issued");
    if (this.issued == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        newValue,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#issued() issued} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for issued
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withIssued(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.issued == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        value,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#term() term} attribute.
   * @param value The value for term
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withTerm(List<Contract_Term> value) {
    @Nullable List<Contract_Term> newValue = Objects.requireNonNull(value, "term");
    if (this.term == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        newValue,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#term() term} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for term
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withTerm(Optional<? extends List<Contract_Term>> optional) {
    @Nullable List<Contract_Term> value = optional.orElse(null);
    if (this.term == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        value,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#alias() alias} attribute.
   * @param value The value for alias
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withAlias(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "alias");
    if (this.alias == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        newValue,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#alias() alias} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for alias
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withAlias(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.alias == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        value,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#relevantHistory() relevantHistory} attribute.
   * @param value The value for relevantHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withRelevantHistory(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "relevantHistory");
    if (this.relevantHistory == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        newValue,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#relevantHistory() relevantHistory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relevantHistory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withRelevantHistory(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.relevantHistory == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        value,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#rule() rule} attribute.
   * @param value The value for rule
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withRule(List<Contract_Rule> value) {
    @Nullable List<Contract_Rule> newValue = Objects.requireNonNull(value, "rule");
    if (this.rule == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        newValue,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#rule() rule} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rule
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withRule(Optional<? extends List<Contract_Rule>> optional) {
    @Nullable List<Contract_Rule> value = optional.orElse(null);
    if (this.rule == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        value,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Contract#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableContract withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        newValue,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        newValue,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        value,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#authority() authority} attribute.
   * @param value The value for authority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withAuthority(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "authority");
    if (this.authority == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        newValue,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#authority() authority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withAuthority(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.authority == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        value,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#topicCodeableConcept() topicCodeableConcept} attribute.
   * @param value The value for topicCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withTopicCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "topicCodeableConcept");
    if (this.topicCodeableConcept == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        newValue,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#topicCodeableConcept() topicCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topicCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withTopicCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.topicCodeableConcept == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        value,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        newValue,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        value,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#scope() scope} attribute.
   * @param value The value for scope
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withScope(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "scope");
    if (this.scope == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        newValue,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#scope() scope} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for scope
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withScope(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.scope == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        value,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#legal() legal} attribute.
   * @param value The value for legal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withLegal(List<Contract_Legal> value) {
    @Nullable List<Contract_Legal> newValue = Objects.requireNonNull(value, "legal");
    if (this.legal == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        newValue,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#legal() legal} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for legal
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withLegal(Optional<? extends List<Contract_Legal>> optional) {
    @Nullable List<Contract_Legal> value = optional.orElse(null);
    if (this.legal == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        value,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        newValue,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        value,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#contentDerivative() contentDerivative} attribute.
   * @param value The value for contentDerivative
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withContentDerivative(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "contentDerivative");
    if (this.contentDerivative == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        newValue,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#contentDerivative() contentDerivative} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contentDerivative
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withContentDerivative(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.contentDerivative == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        value,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        newValue,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        value,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        newValue,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        value,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        newValue,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        value,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#friendly() friendly} attribute.
   * @param value The value for friendly
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withFriendly(List<Contract_Friendly> value) {
    @Nullable List<Contract_Friendly> newValue = Objects.requireNonNull(value, "friendly");
    if (this.friendly == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        newValue,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#friendly() friendly} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for friendly
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withFriendly(Optional<? extends List<Contract_Friendly>> optional) {
    @Nullable List<Contract_Friendly> value = optional.orElse(null);
    if (this.friendly == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        value,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withInstantiatesUri(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        newValue,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withInstantiatesUri(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        value,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        newValue,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        value,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        newValue,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        value,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withAuthor(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        newValue,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withAuthor(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        value,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        newValue,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        value,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#supportingInfo() supportingInfo} attribute.
   * @param value The value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withSupportingInfo(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "supportingInfo");
    if (this.supportingInfo == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        newValue,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#supportingInfo() supportingInfo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withSupportingInfo(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.supportingInfo == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        value,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#domain() domain} attribute.
   * @param value The value for domain
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withDomain(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "domain");
    if (this.domain == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        newValue,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#domain() domain} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for domain
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withDomain(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.domain == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        value,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        newValue,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        value,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#expirationType() expirationType} attribute.
   * @param value The value for expirationType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withExpirationType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "expirationType");
    if (this.expirationType == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        newValue,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#expirationType() expirationType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expirationType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withExpirationType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.expirationType == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        value,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withSubject(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        newValue,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withSubject(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        value,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#site() site} attribute.
   * @param value The value for site
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withSite(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "site");
    if (this.site == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        newValue,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#site() site} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for site
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withSite(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.site == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        value,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#contentDefinition() contentDefinition} attribute.
   * @param value The value for contentDefinition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withContentDefinition(Contract_ContentDefinition value) {
    @Nullable Contract_ContentDefinition newValue = Objects.requireNonNull(value, "contentDefinition");
    if (this.contentDefinition == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        newValue,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#contentDefinition() contentDefinition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contentDefinition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withContentDefinition(Optional<? extends Contract_ContentDefinition> optional) {
    @Nullable Contract_ContentDefinition value = optional.orElse(null);
    if (this.contentDefinition == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        value,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#legalState() legalState} attribute.
   * @param value The value for legalState
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withLegalState(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "legalState");
    if (this.legalState == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        newValue,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#legalState() legalState} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for legalState
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withLegalState(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.legalState == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        value,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#signer() signer} attribute.
   * @param value The value for signer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withSigner(List<Contract_Signer> value) {
    @Nullable List<Contract_Signer> newValue = Objects.requireNonNull(value, "signer");
    if (this.signer == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        newValue,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#signer() signer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for signer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withSigner(Optional<? extends List<Contract_Signer>> optional) {
    @Nullable List<Contract_Signer> value = optional.orElse(null);
    if (this.signer == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        value,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#legallyBindingReference() legallyBindingReference} attribute.
   * @param value The value for legallyBindingReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withLegallyBindingReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "legallyBindingReference");
    if (this.legallyBindingReference == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        newValue,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#legallyBindingReference() legallyBindingReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for legallyBindingReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withLegallyBindingReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.legallyBindingReference == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        value,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        newValue,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        value,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#applies() applies} attribute.
   * @param value The value for applies
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withApplies(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "applies");
    if (this.applies == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        newValue,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#applies() applies} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for applies
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withApplies(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.applies == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        value,
        this.name,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        newValue,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        value,
        this.status,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        newValue,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        value,
        this.topicReference,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#topicReference() topicReference} attribute.
   * @param value The value for topicReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withTopicReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "topicReference");
    if (this.topicReference == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        newValue,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#topicReference() topicReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topicReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withTopicReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.topicReference == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        value,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableContract(
        this.extension,
        this.legallyBindingAttachment,
        this.subType,
        this.instantiatesCanonical,
        this.subtitle,
        this.issued,
        this.term,
        this.alias,
        this.relevantHistory,
        this.rule,
        this.resourceType,
        this.language,
        this.authority,
        this.topicCodeableConcept,
        this.identifier,
        this.scope,
        this.legal,
        this.contained,
        this.contentDerivative,
        this.id,
        this.title,
        this.version,
        this.friendly,
        this.instantiatesUri,
        this.meta,
        this.modifierExtension,
        this.author,
        this.text,
        this.supportingInfo,
        this.domain,
        this.implicitRules,
        this.expirationType,
        this.subject,
        this.site,
        this.contentDefinition,
        this.legalState,
        this.signer,
        this.legallyBindingReference,
        this.url,
        this.applies,
        this.name,
        this.status,
        this.topicReference,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableContract} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableContract
        && equalTo((ImmutableContract) another);
  }

  private boolean equalTo(ImmutableContract another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(legallyBindingAttachment, another.legallyBindingAttachment)
        && Objects.equals(subType, another.subType)
        && Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && Objects.equals(subtitle, another.subtitle)
        && Objects.equals(issued, another.issued)
        && Objects.equals(term, another.term)
        && Objects.equals(alias, another.alias)
        && Objects.equals(relevantHistory, another.relevantHistory)
        && Objects.equals(rule, another.rule)
        && resourceType.equals(another.resourceType)
        && Objects.equals(language, another.language)
        && Objects.equals(authority, another.authority)
        && Objects.equals(topicCodeableConcept, another.topicCodeableConcept)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(scope, another.scope)
        && Objects.equals(legal, another.legal)
        && Objects.equals(contained, another.contained)
        && Objects.equals(contentDerivative, another.contentDerivative)
        && Objects.equals(id, another.id)
        && Objects.equals(title, another.title)
        && Objects.equals(version, another.version)
        && Objects.equals(friendly, another.friendly)
        && Objects.equals(instantiatesUri, another.instantiatesUri)
        && Objects.equals(meta, another.meta)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(author, another.author)
        && Objects.equals(text, another.text)
        && Objects.equals(supportingInfo, another.supportingInfo)
        && Objects.equals(domain, another.domain)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(expirationType, another.expirationType)
        && Objects.equals(subject, another.subject)
        && Objects.equals(site, another.site)
        && Objects.equals(contentDefinition, another.contentDefinition)
        && Objects.equals(legalState, another.legalState)
        && Objects.equals(signer, another.signer)
        && Objects.equals(legallyBindingReference, another.legallyBindingReference)
        && Objects.equals(url, another.url)
        && Objects.equals(applies, another.applies)
        && Objects.equals(name, another.name)
        && Objects.equals(status, another.status)
        && Objects.equals(topicReference, another.topicReference)
        && Objects.equals(type, another.type);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code legallyBindingAttachment}, {@code subType}, {@code instantiatesCanonical}, {@code subtitle}, {@code issued}, {@code term}, {@code alias}, {@code relevantHistory}, {@code rule}, {@code resourceType}, {@code language}, {@code authority}, {@code topicCodeableConcept}, {@code identifier}, {@code scope}, {@code legal}, {@code contained}, {@code contentDerivative}, {@code id}, {@code title}, {@code version}, {@code friendly}, {@code instantiatesUri}, {@code meta}, {@code modifierExtension}, {@code author}, {@code text}, {@code supportingInfo}, {@code domain}, {@code implicitRules}, {@code expirationType}, {@code subject}, {@code site}, {@code contentDefinition}, {@code legalState}, {@code signer}, {@code legallyBindingReference}, {@code url}, {@code applies}, {@code name}, {@code status}, {@code topicReference}, {@code type}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(legallyBindingAttachment);
    h += (h << 5) + Objects.hashCode(subType);
    h += (h << 5) + Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + Objects.hashCode(subtitle);
    h += (h << 5) + Objects.hashCode(issued);
    h += (h << 5) + Objects.hashCode(term);
    h += (h << 5) + Objects.hashCode(alias);
    h += (h << 5) + Objects.hashCode(relevantHistory);
    h += (h << 5) + Objects.hashCode(rule);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(authority);
    h += (h << 5) + Objects.hashCode(topicCodeableConcept);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(scope);
    h += (h << 5) + Objects.hashCode(legal);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(contentDerivative);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(friendly);
    h += (h << 5) + Objects.hashCode(instantiatesUri);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(author);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(supportingInfo);
    h += (h << 5) + Objects.hashCode(domain);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(expirationType);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(site);
    h += (h << 5) + Objects.hashCode(contentDefinition);
    h += (h << 5) + Objects.hashCode(legalState);
    h += (h << 5) + Objects.hashCode(signer);
    h += (h << 5) + Objects.hashCode(legallyBindingReference);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(applies);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(topicReference);
    h += (h << 5) + Objects.hashCode(type);
    return h;
  }

  /**
   * Prints the immutable value {@code Contract} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Contract{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (legallyBindingAttachment != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("legallyBindingAttachment=").append(legallyBindingAttachment);
    }
    if (subType != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("subType=").append(subType);
    }
    if (instantiatesCanonical != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (subtitle != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("subtitle=").append(subtitle);
    }
    if (issued != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("issued=").append(issued);
    }
    if (term != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("term=").append(term);
    }
    if (alias != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("alias=").append(alias);
    }
    if (relevantHistory != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("relevantHistory=").append(relevantHistory);
    }
    if (rule != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("rule=").append(rule);
    }
    if (builder.length() > 9) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (authority != null) {
      builder.append(", ");
      builder.append("authority=").append(authority);
    }
    if (topicCodeableConcept != null) {
      builder.append(", ");
      builder.append("topicCodeableConcept=").append(topicCodeableConcept);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (scope != null) {
      builder.append(", ");
      builder.append("scope=").append(scope);
    }
    if (legal != null) {
      builder.append(", ");
      builder.append("legal=").append(legal);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (contentDerivative != null) {
      builder.append(", ");
      builder.append("contentDerivative=").append(contentDerivative);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (friendly != null) {
      builder.append(", ");
      builder.append("friendly=").append(friendly);
    }
    if (instantiatesUri != null) {
      builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (author != null) {
      builder.append(", ");
      builder.append("author=").append(author);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (supportingInfo != null) {
      builder.append(", ");
      builder.append("supportingInfo=").append(supportingInfo);
    }
    if (domain != null) {
      builder.append(", ");
      builder.append("domain=").append(domain);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (expirationType != null) {
      builder.append(", ");
      builder.append("expirationType=").append(expirationType);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (site != null) {
      builder.append(", ");
      builder.append("site=").append(site);
    }
    if (contentDefinition != null) {
      builder.append(", ");
      builder.append("contentDefinition=").append(contentDefinition);
    }
    if (legalState != null) {
      builder.append(", ");
      builder.append("legalState=").append(legalState);
    }
    if (signer != null) {
      builder.append(", ");
      builder.append("signer=").append(signer);
    }
    if (legallyBindingReference != null) {
      builder.append(", ");
      builder.append("legallyBindingReference=").append(legallyBindingReference);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (applies != null) {
      builder.append(", ");
      builder.append("applies=").append(applies);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (topicReference != null) {
      builder.append(", ");
      builder.append("topicReference=").append(topicReference);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Contract", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Contract {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Attachment> legallyBindingAttachment = Optional.empty();
    boolean legallyBindingAttachmentIsSet;
    @Nullable Optional<List<CodeableConcept>> subType = Optional.empty();
    boolean subTypeIsSet;
    @Nullable Optional<Reference> instantiatesCanonical = Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @Nullable Optional<String> subtitle = Optional.empty();
    boolean subtitleIsSet;
    @Nullable Optional<DateTime> issued = Optional.empty();
    boolean issuedIsSet;
    @Nullable Optional<List<Contract_Term>> term = Optional.empty();
    boolean termIsSet;
    @Nullable Optional<List<String>> alias = Optional.empty();
    boolean aliasIsSet;
    @Nullable Optional<List<Reference>> relevantHistory = Optional.empty();
    boolean relevantHistoryIsSet;
    @Nullable Optional<List<Contract_Rule>> rule = Optional.empty();
    boolean ruleIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Reference>> authority = Optional.empty();
    boolean authorityIsSet;
    @Nullable Optional<CodeableConcept> topicCodeableConcept = Optional.empty();
    boolean topicCodeableConceptIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<CodeableConcept> scope = Optional.empty();
    boolean scopeIsSet;
    @Nullable Optional<List<Contract_Legal>> legal = Optional.empty();
    boolean legalIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<CodeableConcept> contentDerivative = Optional.empty();
    boolean contentDerivativeIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<List<Contract_Friendly>> friendly = Optional.empty();
    boolean friendlyIsSet;
    @Nullable Optional<Uri> instantiatesUri = Optional.empty();
    boolean instantiatesUriIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Reference> author = Optional.empty();
    boolean authorIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Reference>> supportingInfo = Optional.empty();
    boolean supportingInfoIsSet;
    @Nullable Optional<List<Reference>> domain = Optional.empty();
    boolean domainIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<CodeableConcept> expirationType = Optional.empty();
    boolean expirationTypeIsSet;
    @Nullable Optional<List<Reference>> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<List<Reference>> site = Optional.empty();
    boolean siteIsSet;
    @Nullable Optional<Contract_ContentDefinition> contentDefinition = Optional.empty();
    boolean contentDefinitionIsSet;
    @Nullable Optional<CodeableConcept> legalState = Optional.empty();
    boolean legalStateIsSet;
    @Nullable Optional<List<Contract_Signer>> signer = Optional.empty();
    boolean signerIsSet;
    @Nullable Optional<Reference> legallyBindingReference = Optional.empty();
    boolean legallyBindingReferenceIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<Period> applies = Optional.empty();
    boolean appliesIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Reference> topicReference = Optional.empty();
    boolean topicReferenceIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("legallyBindingAttachment")
    public void setLegallyBindingAttachment(Optional<Attachment> legallyBindingAttachment) {
      this.legallyBindingAttachment = legallyBindingAttachment;
      this.legallyBindingAttachmentIsSet = true;
    }
    @JsonProperty("subType")
    public void setSubType(Optional<List<CodeableConcept>> subType) {
      this.subType = subType;
      this.subTypeIsSet = true;
    }
    @JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(Optional<Reference> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
    }
    @JsonProperty("subtitle")
    public void setSubtitle(Optional<String> subtitle) {
      this.subtitle = subtitle;
      this.subtitleIsSet = true;
    }
    @JsonProperty("issued")
    public void setIssued(Optional<DateTime> issued) {
      this.issued = issued;
      this.issuedIsSet = true;
    }
    @JsonProperty("term")
    public void setTerm(Optional<List<Contract_Term>> term) {
      this.term = term;
      this.termIsSet = true;
    }
    @JsonProperty("alias")
    public void setAlias(Optional<List<String>> alias) {
      this.alias = alias;
      this.aliasIsSet = true;
    }
    @JsonProperty("relevantHistory")
    public void setRelevantHistory(Optional<List<Reference>> relevantHistory) {
      this.relevantHistory = relevantHistory;
      this.relevantHistoryIsSet = true;
    }
    @JsonProperty("rule")
    public void setRule(Optional<List<Contract_Rule>> rule) {
      this.rule = rule;
      this.ruleIsSet = true;
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
    @JsonProperty("authority")
    public void setAuthority(Optional<List<Reference>> authority) {
      this.authority = authority;
      this.authorityIsSet = true;
    }
    @JsonProperty("topicCodeableConcept")
    public void setTopicCodeableConcept(Optional<CodeableConcept> topicCodeableConcept) {
      this.topicCodeableConcept = topicCodeableConcept;
      this.topicCodeableConceptIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("scope")
    public void setScope(Optional<CodeableConcept> scope) {
      this.scope = scope;
      this.scopeIsSet = true;
    }
    @JsonProperty("legal")
    public void setLegal(Optional<List<Contract_Legal>> legal) {
      this.legal = legal;
      this.legalIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("contentDerivative")
    public void setContentDerivative(Optional<CodeableConcept> contentDerivative) {
      this.contentDerivative = contentDerivative;
      this.contentDerivativeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("friendly")
    public void setFriendly(Optional<List<Contract_Friendly>> friendly) {
      this.friendly = friendly;
      this.friendlyIsSet = true;
    }
    @JsonProperty("instantiatesUri")
    public void setInstantiatesUri(Optional<Uri> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
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
    @JsonProperty("author")
    public void setAuthor(Optional<Reference> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("supportingInfo")
    public void setSupportingInfo(Optional<List<Reference>> supportingInfo) {
      this.supportingInfo = supportingInfo;
      this.supportingInfoIsSet = true;
    }
    @JsonProperty("domain")
    public void setDomain(Optional<List<Reference>> domain) {
      this.domain = domain;
      this.domainIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("expirationType")
    public void setExpirationType(Optional<CodeableConcept> expirationType) {
      this.expirationType = expirationType;
      this.expirationTypeIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<List<Reference>> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("site")
    public void setSite(Optional<List<Reference>> site) {
      this.site = site;
      this.siteIsSet = true;
    }
    @JsonProperty("contentDefinition")
    public void setContentDefinition(Optional<Contract_ContentDefinition> contentDefinition) {
      this.contentDefinition = contentDefinition;
      this.contentDefinitionIsSet = true;
    }
    @JsonProperty("legalState")
    public void setLegalState(Optional<CodeableConcept> legalState) {
      this.legalState = legalState;
      this.legalStateIsSet = true;
    }
    @JsonProperty("signer")
    public void setSigner(Optional<List<Contract_Signer>> signer) {
      this.signer = signer;
      this.signerIsSet = true;
    }
    @JsonProperty("legallyBindingReference")
    public void setLegallyBindingReference(Optional<Reference> legallyBindingReference) {
      this.legallyBindingReference = legallyBindingReference;
      this.legallyBindingReferenceIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("applies")
    public void setApplies(Optional<Period> applies) {
      this.applies = applies;
      this.appliesIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("topicReference")
    public void setTopicReference(Optional<Reference> topicReference) {
      this.topicReference = topicReference;
      this.topicReferenceIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Attachment> legallyBindingAttachment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> subType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> subtitle() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> issued() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Contract_Term>> term() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> alias() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> relevantHistory() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Contract_Rule>> rule() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> authority() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> topicCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> scope() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Contract_Legal>> legal() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> contentDerivative() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Contract_Friendly>> friendly() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> instantiatesUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> author() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> supportingInfo() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> domain() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> expirationType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> site() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Contract_ContentDefinition> contentDefinition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> legalState() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Contract_Signer>> signer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> legallyBindingReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> applies() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> topicReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableContract fromJson(Json json) {
    ImmutableContract.Builder builder = ((ImmutableContract.Builder) ImmutableContract.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.legallyBindingAttachmentIsSet) {
      builder.legallyBindingAttachment(json.legallyBindingAttachment);
    }
    if (json.subTypeIsSet) {
      builder.subType(json.subType);
    }
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.subtitleIsSet) {
      builder.subtitle(json.subtitle);
    }
    if (json.issuedIsSet) {
      builder.issued(json.issued);
    }
    if (json.termIsSet) {
      builder.term(json.term);
    }
    if (json.aliasIsSet) {
      builder.alias(json.alias);
    }
    if (json.relevantHistoryIsSet) {
      builder.relevantHistory(json.relevantHistory);
    }
    if (json.ruleIsSet) {
      builder.rule(json.rule);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.authorityIsSet) {
      builder.authority(json.authority);
    }
    if (json.topicCodeableConceptIsSet) {
      builder.topicCodeableConcept(json.topicCodeableConcept);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.scopeIsSet) {
      builder.scope(json.scope);
    }
    if (json.legalIsSet) {
      builder.legal(json.legal);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.contentDerivativeIsSet) {
      builder.contentDerivative(json.contentDerivative);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.friendlyIsSet) {
      builder.friendly(json.friendly);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.supportingInfoIsSet) {
      builder.supportingInfo(json.supportingInfo);
    }
    if (json.domainIsSet) {
      builder.domain(json.domain);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.expirationTypeIsSet) {
      builder.expirationType(json.expirationType);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.siteIsSet) {
      builder.site(json.site);
    }
    if (json.contentDefinitionIsSet) {
      builder.contentDefinition(json.contentDefinition);
    }
    if (json.legalStateIsSet) {
      builder.legalState(json.legalState);
    }
    if (json.signerIsSet) {
      builder.signer(json.signer);
    }
    if (json.legallyBindingReferenceIsSet) {
      builder.legallyBindingReference(json.legallyBindingReference);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.appliesIsSet) {
      builder.applies(json.applies);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.topicReferenceIsSet) {
      builder.topicReference(json.topicReference);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    return (ImmutableContract) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Contract} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Contract instance
   */
  public static Contract copyOf(Contract instance) {
    if (instance instanceof ImmutableContract) {
      return (ImmutableContract) instance;
    }
    return ((ImmutableContract.Builder) ImmutableContract.builder())
        .extension(instance.extension())
        .legallyBindingAttachment(instance.legallyBindingAttachment())
        .subType(instance.subType())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .subtitle(instance.subtitle())
        .issued(instance.issued())
        .term(instance.term())
        .alias(instance.alias())
        .relevantHistory(instance.relevantHistory())
        .rule(instance.rule())
        .resourceType(instance.resourceType())
        .language(instance.language())
        .authority(instance.authority())
        .topicCodeableConcept(instance.topicCodeableConcept())
        .identifier(instance.identifier())
        .scope(instance.scope())
        .legal(instance.legal())
        .contained(instance.contained())
        .contentDerivative(instance.contentDerivative())
        .id(instance.id())
        .title(instance.title())
        .version(instance.version())
        .friendly(instance.friendly())
        .instantiatesUri(instance.instantiatesUri())
        .meta(instance.meta())
        .modifierExtension(instance.modifierExtension())
        .author(instance.author())
        .text(instance.text())
        .supportingInfo(instance.supportingInfo())
        .domain(instance.domain())
        .implicitRules(instance.implicitRules())
        .expirationType(instance.expirationType())
        .subject(instance.subject())
        .site(instance.site())
        .contentDefinition(instance.contentDefinition())
        .legalState(instance.legalState())
        .signer(instance.signer())
        .legallyBindingReference(instance.legallyBindingReference())
        .url(instance.url())
        .applies(instance.applies())
        .name(instance.name())
        .status(instance.status())
        .topicReference(instance.topicReference())
        .type(instance.type())
        .build();
  }

  /**
   * Creates a builder for {@link Contract Contract}.
   * <pre>
   * ImmutableContract.builder()
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Contract#extension() extension}
   *    .legallyBindingAttachment(com.medplum.types.fhir.Attachment) // optional {@link Contract#legallyBindingAttachment() legallyBindingAttachment}
   *    .subType(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Contract#subType() subType}
   *    .instantiatesCanonical(com.medplum.types.fhir.Reference) // optional {@link Contract#instantiatesCanonical() instantiatesCanonical}
   *    .subtitle(String) // optional {@link Contract#subtitle() subtitle}
   *    .issued(com.medplum.types.fhir.DateTime) // optional {@link Contract#issued() issued}
   *    .term(List&amp;lt;com.medplum.types.fhir.Contract_Term&amp;gt;) // optional {@link Contract#term() term}
   *    .alias(List&amp;lt;String&amp;gt;) // optional {@link Contract#alias() alias}
   *    .relevantHistory(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Contract#relevantHistory() relevantHistory}
   *    .rule(List&amp;lt;com.medplum.types.fhir.Contract_Rule&amp;gt;) // optional {@link Contract#rule() rule}
   *    .resourceType(String) // required {@link Contract#resourceType() resourceType}
   *    .language(com.medplum.types.fhir.Code) // optional {@link Contract#language() language}
   *    .authority(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Contract#authority() authority}
   *    .topicCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link Contract#topicCodeableConcept() topicCodeableConcept}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link Contract#identifier() identifier}
   *    .scope(com.medplum.types.fhir.CodeableConcept) // optional {@link Contract#scope() scope}
   *    .legal(List&amp;lt;com.medplum.types.fhir.Contract_Legal&amp;gt;) // optional {@link Contract#legal() legal}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link Contract#contained() contained}
   *    .contentDerivative(com.medplum.types.fhir.CodeableConcept) // optional {@link Contract#contentDerivative() contentDerivative}
   *    .id(com.medplum.types.fhir.Id) // optional {@link Contract#id() id}
   *    .title(String) // optional {@link Contract#title() title}
   *    .version(String) // optional {@link Contract#version() version}
   *    .friendly(List&amp;lt;com.medplum.types.fhir.Contract_Friendly&amp;gt;) // optional {@link Contract#friendly() friendly}
   *    .instantiatesUri(com.medplum.types.fhir.Uri) // optional {@link Contract#instantiatesUri() instantiatesUri}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link Contract#meta() meta}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Contract#modifierExtension() modifierExtension}
   *    .author(com.medplum.types.fhir.Reference) // optional {@link Contract#author() author}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link Contract#text() text}
   *    .supportingInfo(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Contract#supportingInfo() supportingInfo}
   *    .domain(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Contract#domain() domain}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link Contract#implicitRules() implicitRules}
   *    .expirationType(com.medplum.types.fhir.CodeableConcept) // optional {@link Contract#expirationType() expirationType}
   *    .subject(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Contract#subject() subject}
   *    .site(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Contract#site() site}
   *    .contentDefinition(com.medplum.types.fhir.Contract_ContentDefinition) // optional {@link Contract#contentDefinition() contentDefinition}
   *    .legalState(com.medplum.types.fhir.CodeableConcept) // optional {@link Contract#legalState() legalState}
   *    .signer(List&amp;lt;com.medplum.types.fhir.Contract_Signer&amp;gt;) // optional {@link Contract#signer() signer}
   *    .legallyBindingReference(com.medplum.types.fhir.Reference) // optional {@link Contract#legallyBindingReference() legallyBindingReference}
   *    .url(com.medplum.types.fhir.Uri) // optional {@link Contract#url() url}
   *    .applies(com.medplum.types.fhir.Period) // optional {@link Contract#applies() applies}
   *    .name(String) // optional {@link Contract#name() name}
   *    .status(com.medplum.types.fhir.Code) // optional {@link Contract#status() status}
   *    .topicReference(com.medplum.types.fhir.Reference) // optional {@link Contract#topicReference() topicReference}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link Contract#type() type}
   *    .build();
   * </pre>
   * @return A new Contract builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableContract.Builder();
  }

  /**
   * Builds instances of type {@link Contract Contract}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Contract", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_LEGALLY_BINDING_ATTACHMENT = 0x2L;
    private static final long OPT_BIT_SUB_TYPE = 0x4L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x8L;
    private static final long OPT_BIT_SUBTITLE = 0x10L;
    private static final long OPT_BIT_ISSUED = 0x20L;
    private static final long OPT_BIT_TERM = 0x40L;
    private static final long OPT_BIT_ALIAS = 0x80L;
    private static final long OPT_BIT_RELEVANT_HISTORY = 0x100L;
    private static final long OPT_BIT_RULE = 0x200L;
    private static final long OPT_BIT_LANGUAGE = 0x400L;
    private static final long OPT_BIT_AUTHORITY = 0x800L;
    private static final long OPT_BIT_TOPIC_CODEABLE_CONCEPT = 0x1000L;
    private static final long OPT_BIT_IDENTIFIER = 0x2000L;
    private static final long OPT_BIT_SCOPE = 0x4000L;
    private static final long OPT_BIT_LEGAL = 0x8000L;
    private static final long OPT_BIT_CONTAINED = 0x10000L;
    private static final long OPT_BIT_CONTENT_DERIVATIVE = 0x20000L;
    private static final long OPT_BIT_ID = 0x40000L;
    private static final long OPT_BIT_TITLE = 0x80000L;
    private static final long OPT_BIT_VERSION = 0x100000L;
    private static final long OPT_BIT_FRIENDLY = 0x200000L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x400000L;
    private static final long OPT_BIT_META = 0x800000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1000000L;
    private static final long OPT_BIT_AUTHOR = 0x2000000L;
    private static final long OPT_BIT_TEXT = 0x4000000L;
    private static final long OPT_BIT_SUPPORTING_INFO = 0x8000000L;
    private static final long OPT_BIT_DOMAIN = 0x10000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20000000L;
    private static final long OPT_BIT_EXPIRATION_TYPE = 0x40000000L;
    private static final long OPT_BIT_SUBJECT = 0x80000000L;
    private static final long OPT_BIT_SITE = 0x100000000L;
    private static final long OPT_BIT_CONTENT_DEFINITION = 0x200000000L;
    private static final long OPT_BIT_LEGAL_STATE = 0x400000000L;
    private static final long OPT_BIT_SIGNER = 0x800000000L;
    private static final long OPT_BIT_LEGALLY_BINDING_REFERENCE = 0x1000000000L;
    private static final long OPT_BIT_URL = 0x2000000000L;
    private static final long OPT_BIT_APPLIES = 0x4000000000L;
    private static final long OPT_BIT_NAME = 0x8000000000L;
    private static final long OPT_BIT_STATUS = 0x10000000000L;
    private static final long OPT_BIT_TOPIC_REFERENCE = 0x20000000000L;
    private static final long OPT_BIT_TYPE = 0x40000000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable Attachment legallyBindingAttachment;
    private @Nullable List<CodeableConcept> subType;
    private @Nullable Reference instantiatesCanonical;
    private @Nullable String subtitle;
    private @Nullable DateTime issued;
    private @Nullable List<Contract_Term> term;
    private @Nullable List<String> alias;
    private @Nullable List<Reference> relevantHistory;
    private @Nullable List<Contract_Rule> rule;
    private @Nullable String resourceType;
    private @Nullable Code language;
    private @Nullable List<Reference> authority;
    private @Nullable CodeableConcept topicCodeableConcept;
    private @Nullable List<Identifier> identifier;
    private @Nullable CodeableConcept scope;
    private @Nullable List<Contract_Legal> legal;
    private @Nullable List<ResourceList> contained;
    private @Nullable CodeableConcept contentDerivative;
    private @Nullable Id id;
    private @Nullable String title;
    private @Nullable String version;
    private @Nullable List<Contract_Friendly> friendly;
    private @Nullable Uri instantiatesUri;
    private @Nullable Meta meta;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference author;
    private @Nullable Narrative text;
    private @Nullable List<Reference> supportingInfo;
    private @Nullable List<Reference> domain;
    private @Nullable Uri implicitRules;
    private @Nullable CodeableConcept expirationType;
    private @Nullable List<Reference> subject;
    private @Nullable List<Reference> site;
    private @Nullable Contract_ContentDefinition contentDefinition;
    private @Nullable CodeableConcept legalState;
    private @Nullable List<Contract_Signer> signer;
    private @Nullable Reference legallyBindingReference;
    private @Nullable Uri url;
    private @Nullable Period applies;
    private @Nullable String name;
    private @Nullable Code status;
    private @Nullable Reference topicReference;
    private @Nullable CodeableConcept type;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Contract#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract#legallyBindingAttachment() legallyBindingAttachment} to legallyBindingAttachment.
     * @param legallyBindingAttachment The value for legallyBindingAttachment
     * @return {@code this} builder for chained invocation
     */
    public final Builder legallyBindingAttachment(Attachment legallyBindingAttachment) {
      checkNotIsSet(legallyBindingAttachmentIsSet(), "legallyBindingAttachment");
      this.legallyBindingAttachment = Objects.requireNonNull(legallyBindingAttachment, "legallyBindingAttachment");
      optBits |= OPT_BIT_LEGALLY_BINDING_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#legallyBindingAttachment() legallyBindingAttachment} to legallyBindingAttachment.
     * @param legallyBindingAttachment The value for legallyBindingAttachment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("legallyBindingAttachment")
    public final Builder legallyBindingAttachment(Optional<? extends Attachment> legallyBindingAttachment) {
      checkNotIsSet(legallyBindingAttachmentIsSet(), "legallyBindingAttachment");
      this.legallyBindingAttachment = legallyBindingAttachment.orElse(null);
      optBits |= OPT_BIT_LEGALLY_BINDING_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for chained invocation
     */
    public final Builder subType(List<CodeableConcept> subType) {
      checkNotIsSet(subTypeIsSet(), "subType");
      this.subType = Objects.requireNonNull(subType, "subType");
      optBits |= OPT_BIT_SUB_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subType")
    public final Builder subType(Optional<? extends List<CodeableConcept>> subType) {
      checkNotIsSet(subTypeIsSet(), "subType");
      this.subType = subType.orElse(null);
      optBits |= OPT_BIT_SUB_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesCanonical(Reference instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = Objects.requireNonNull(instantiatesCanonical, "instantiatesCanonical");
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instantiatesCanonical")
    public final Builder instantiatesCanonical(Optional<? extends Reference> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = instantiatesCanonical.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for chained invocation
     */
    public final Builder subtitle(String subtitle) {
      checkNotIsSet(subtitleIsSet(), "subtitle");
      this.subtitle = Objects.requireNonNull(subtitle, "subtitle");
      optBits |= OPT_BIT_SUBTITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subtitle")
    public final Builder subtitle(Optional<String> subtitle) {
      checkNotIsSet(subtitleIsSet(), "subtitle");
      this.subtitle = subtitle.orElse(null);
      optBits |= OPT_BIT_SUBTITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for chained invocation
     */
    public final Builder issued(DateTime issued) {
      checkNotIsSet(issuedIsSet(), "issued");
      this.issued = Objects.requireNonNull(issued, "issued");
      optBits |= OPT_BIT_ISSUED;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("issued")
    public final Builder issued(Optional<? extends DateTime> issued) {
      checkNotIsSet(issuedIsSet(), "issued");
      this.issued = issued.orElse(null);
      optBits |= OPT_BIT_ISSUED;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#term() term} to term.
     * @param term The value for term
     * @return {@code this} builder for chained invocation
     */
    public final Builder term(List<Contract_Term> term) {
      checkNotIsSet(termIsSet(), "term");
      this.term = Objects.requireNonNull(term, "term");
      optBits |= OPT_BIT_TERM;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#term() term} to term.
     * @param term The value for term
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("term")
    public final Builder term(Optional<? extends List<Contract_Term>> term) {
      checkNotIsSet(termIsSet(), "term");
      this.term = term.orElse(null);
      optBits |= OPT_BIT_TERM;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for chained invocation
     */
    public final Builder alias(List<String> alias) {
      checkNotIsSet(aliasIsSet(), "alias");
      this.alias = Objects.requireNonNull(alias, "alias");
      optBits |= OPT_BIT_ALIAS;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("alias")
    public final Builder alias(Optional<? extends List<String>> alias) {
      checkNotIsSet(aliasIsSet(), "alias");
      this.alias = alias.orElse(null);
      optBits |= OPT_BIT_ALIAS;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for chained invocation
     */
    public final Builder relevantHistory(List<Reference> relevantHistory) {
      checkNotIsSet(relevantHistoryIsSet(), "relevantHistory");
      this.relevantHistory = Objects.requireNonNull(relevantHistory, "relevantHistory");
      optBits |= OPT_BIT_RELEVANT_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relevantHistory")
    public final Builder relevantHistory(Optional<? extends List<Reference>> relevantHistory) {
      checkNotIsSet(relevantHistoryIsSet(), "relevantHistory");
      this.relevantHistory = relevantHistory.orElse(null);
      optBits |= OPT_BIT_RELEVANT_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#rule() rule} to rule.
     * @param rule The value for rule
     * @return {@code this} builder for chained invocation
     */
    public final Builder rule(List<Contract_Rule> rule) {
      checkNotIsSet(ruleIsSet(), "rule");
      this.rule = Objects.requireNonNull(rule, "rule");
      optBits |= OPT_BIT_RULE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#rule() rule} to rule.
     * @param rule The value for rule
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rule")
    public final Builder rule(Optional<? extends List<Contract_Rule>> rule) {
      checkNotIsSet(ruleIsSet(), "rule");
      this.rule = rule.orElse(null);
      optBits |= OPT_BIT_RULE;
      return this;
    }

    /**
     * Initializes the value for the {@link Contract#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Contract#language() language} to language.
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
     * Initializes the optional value {@link Contract#language() language} to language.
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
     * Initializes the optional value {@link Contract#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for chained invocation
     */
    public final Builder authority(List<Reference> authority) {
      checkNotIsSet(authorityIsSet(), "authority");
      this.authority = Objects.requireNonNull(authority, "authority");
      optBits |= OPT_BIT_AUTHORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authority")
    public final Builder authority(Optional<? extends List<Reference>> authority) {
      checkNotIsSet(authorityIsSet(), "authority");
      this.authority = authority.orElse(null);
      optBits |= OPT_BIT_AUTHORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#topicCodeableConcept() topicCodeableConcept} to topicCodeableConcept.
     * @param topicCodeableConcept The value for topicCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder topicCodeableConcept(CodeableConcept topicCodeableConcept) {
      checkNotIsSet(topicCodeableConceptIsSet(), "topicCodeableConcept");
      this.topicCodeableConcept = Objects.requireNonNull(topicCodeableConcept, "topicCodeableConcept");
      optBits |= OPT_BIT_TOPIC_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#topicCodeableConcept() topicCodeableConcept} to topicCodeableConcept.
     * @param topicCodeableConcept The value for topicCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("topicCodeableConcept")
    public final Builder topicCodeableConcept(Optional<? extends CodeableConcept> topicCodeableConcept) {
      checkNotIsSet(topicCodeableConceptIsSet(), "topicCodeableConcept");
      this.topicCodeableConcept = topicCodeableConcept.orElse(null);
      optBits |= OPT_BIT_TOPIC_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Contract#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Contract#scope() scope} to scope.
     * @param scope The value for scope
     * @return {@code this} builder for chained invocation
     */
    public final Builder scope(CodeableConcept scope) {
      checkNotIsSet(scopeIsSet(), "scope");
      this.scope = Objects.requireNonNull(scope, "scope");
      optBits |= OPT_BIT_SCOPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#scope() scope} to scope.
     * @param scope The value for scope
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("scope")
    public final Builder scope(Optional<? extends CodeableConcept> scope) {
      checkNotIsSet(scopeIsSet(), "scope");
      this.scope = scope.orElse(null);
      optBits |= OPT_BIT_SCOPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#legal() legal} to legal.
     * @param legal The value for legal
     * @return {@code this} builder for chained invocation
     */
    public final Builder legal(List<Contract_Legal> legal) {
      checkNotIsSet(legalIsSet(), "legal");
      this.legal = Objects.requireNonNull(legal, "legal");
      optBits |= OPT_BIT_LEGAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#legal() legal} to legal.
     * @param legal The value for legal
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("legal")
    public final Builder legal(Optional<? extends List<Contract_Legal>> legal) {
      checkNotIsSet(legalIsSet(), "legal");
      this.legal = legal.orElse(null);
      optBits |= OPT_BIT_LEGAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#contained() contained} to contained.
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
     * Initializes the optional value {@link Contract#contained() contained} to contained.
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
     * Initializes the optional value {@link Contract#contentDerivative() contentDerivative} to contentDerivative.
     * @param contentDerivative The value for contentDerivative
     * @return {@code this} builder for chained invocation
     */
    public final Builder contentDerivative(CodeableConcept contentDerivative) {
      checkNotIsSet(contentDerivativeIsSet(), "contentDerivative");
      this.contentDerivative = Objects.requireNonNull(contentDerivative, "contentDerivative");
      optBits |= OPT_BIT_CONTENT_DERIVATIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#contentDerivative() contentDerivative} to contentDerivative.
     * @param contentDerivative The value for contentDerivative
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contentDerivative")
    public final Builder contentDerivative(Optional<? extends CodeableConcept> contentDerivative) {
      checkNotIsSet(contentDerivativeIsSet(), "contentDerivative");
      this.contentDerivative = contentDerivative.orElse(null);
      optBits |= OPT_BIT_CONTENT_DERIVATIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#id() id} to id.
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
     * Initializes the optional value {@link Contract#id() id} to id.
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
     * Initializes the optional value {@link Contract#title() title} to title.
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
     * Initializes the optional value {@link Contract#title() title} to title.
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
     * Initializes the optional value {@link Contract#version() version} to version.
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
     * Initializes the optional value {@link Contract#version() version} to version.
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
     * Initializes the optional value {@link Contract#friendly() friendly} to friendly.
     * @param friendly The value for friendly
     * @return {@code this} builder for chained invocation
     */
    public final Builder friendly(List<Contract_Friendly> friendly) {
      checkNotIsSet(friendlyIsSet(), "friendly");
      this.friendly = Objects.requireNonNull(friendly, "friendly");
      optBits |= OPT_BIT_FRIENDLY;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#friendly() friendly} to friendly.
     * @param friendly The value for friendly
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("friendly")
    public final Builder friendly(Optional<? extends List<Contract_Friendly>> friendly) {
      checkNotIsSet(friendlyIsSet(), "friendly");
      this.friendly = friendly.orElse(null);
      optBits |= OPT_BIT_FRIENDLY;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesUri(Uri instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = Objects.requireNonNull(instantiatesUri, "instantiatesUri");
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instantiatesUri")
    public final Builder instantiatesUri(Optional<? extends Uri> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = instantiatesUri.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#meta() meta} to meta.
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
     * Initializes the optional value {@link Contract#meta() meta} to meta.
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
     * Initializes the optional value {@link Contract#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    public final Builder author(Reference author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = Objects.requireNonNull(author, "author");
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("author")
    public final Builder author(Optional<? extends Reference> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = author.orElse(null);
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#text() text} to text.
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
     * Initializes the optional value {@link Contract#text() text} to text.
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
     * Initializes the optional value {@link Contract#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingInfo(List<Reference> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = Objects.requireNonNull(supportingInfo, "supportingInfo");
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("supportingInfo")
    public final Builder supportingInfo(Optional<? extends List<Reference>> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = supportingInfo.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for chained invocation
     */
    public final Builder domain(List<Reference> domain) {
      checkNotIsSet(domainIsSet(), "domain");
      this.domain = Objects.requireNonNull(domain, "domain");
      optBits |= OPT_BIT_DOMAIN;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("domain")
    public final Builder domain(Optional<? extends List<Reference>> domain) {
      checkNotIsSet(domainIsSet(), "domain");
      this.domain = domain.orElse(null);
      optBits |= OPT_BIT_DOMAIN;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Contract#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Contract#expirationType() expirationType} to expirationType.
     * @param expirationType The value for expirationType
     * @return {@code this} builder for chained invocation
     */
    public final Builder expirationType(CodeableConcept expirationType) {
      checkNotIsSet(expirationTypeIsSet(), "expirationType");
      this.expirationType = Objects.requireNonNull(expirationType, "expirationType");
      optBits |= OPT_BIT_EXPIRATION_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#expirationType() expirationType} to expirationType.
     * @param expirationType The value for expirationType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("expirationType")
    public final Builder expirationType(Optional<? extends CodeableConcept> expirationType) {
      checkNotIsSet(expirationTypeIsSet(), "expirationType");
      this.expirationType = expirationType.orElse(null);
      optBits |= OPT_BIT_EXPIRATION_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#subject() subject} to subject.
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
     * Initializes the optional value {@link Contract#subject() subject} to subject.
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
     * Initializes the optional value {@link Contract#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for chained invocation
     */
    public final Builder site(List<Reference> site) {
      checkNotIsSet(siteIsSet(), "site");
      this.site = Objects.requireNonNull(site, "site");
      optBits |= OPT_BIT_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("site")
    public final Builder site(Optional<? extends List<Reference>> site) {
      checkNotIsSet(siteIsSet(), "site");
      this.site = site.orElse(null);
      optBits |= OPT_BIT_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#contentDefinition() contentDefinition} to contentDefinition.
     * @param contentDefinition The value for contentDefinition
     * @return {@code this} builder for chained invocation
     */
    public final Builder contentDefinition(Contract_ContentDefinition contentDefinition) {
      checkNotIsSet(contentDefinitionIsSet(), "contentDefinition");
      this.contentDefinition = Objects.requireNonNull(contentDefinition, "contentDefinition");
      optBits |= OPT_BIT_CONTENT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#contentDefinition() contentDefinition} to contentDefinition.
     * @param contentDefinition The value for contentDefinition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contentDefinition")
    public final Builder contentDefinition(Optional<? extends Contract_ContentDefinition> contentDefinition) {
      checkNotIsSet(contentDefinitionIsSet(), "contentDefinition");
      this.contentDefinition = contentDefinition.orElse(null);
      optBits |= OPT_BIT_CONTENT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#legalState() legalState} to legalState.
     * @param legalState The value for legalState
     * @return {@code this} builder for chained invocation
     */
    public final Builder legalState(CodeableConcept legalState) {
      checkNotIsSet(legalStateIsSet(), "legalState");
      this.legalState = Objects.requireNonNull(legalState, "legalState");
      optBits |= OPT_BIT_LEGAL_STATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#legalState() legalState} to legalState.
     * @param legalState The value for legalState
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("legalState")
    public final Builder legalState(Optional<? extends CodeableConcept> legalState) {
      checkNotIsSet(legalStateIsSet(), "legalState");
      this.legalState = legalState.orElse(null);
      optBits |= OPT_BIT_LEGAL_STATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#signer() signer} to signer.
     * @param signer The value for signer
     * @return {@code this} builder for chained invocation
     */
    public final Builder signer(List<Contract_Signer> signer) {
      checkNotIsSet(signerIsSet(), "signer");
      this.signer = Objects.requireNonNull(signer, "signer");
      optBits |= OPT_BIT_SIGNER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#signer() signer} to signer.
     * @param signer The value for signer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("signer")
    public final Builder signer(Optional<? extends List<Contract_Signer>> signer) {
      checkNotIsSet(signerIsSet(), "signer");
      this.signer = signer.orElse(null);
      optBits |= OPT_BIT_SIGNER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#legallyBindingReference() legallyBindingReference} to legallyBindingReference.
     * @param legallyBindingReference The value for legallyBindingReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder legallyBindingReference(Reference legallyBindingReference) {
      checkNotIsSet(legallyBindingReferenceIsSet(), "legallyBindingReference");
      this.legallyBindingReference = Objects.requireNonNull(legallyBindingReference, "legallyBindingReference");
      optBits |= OPT_BIT_LEGALLY_BINDING_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#legallyBindingReference() legallyBindingReference} to legallyBindingReference.
     * @param legallyBindingReference The value for legallyBindingReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("legallyBindingReference")
    public final Builder legallyBindingReference(Optional<? extends Reference> legallyBindingReference) {
      checkNotIsSet(legallyBindingReferenceIsSet(), "legallyBindingReference");
      this.legallyBindingReference = legallyBindingReference.orElse(null);
      optBits |= OPT_BIT_LEGALLY_BINDING_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#url() url} to url.
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
     * Initializes the optional value {@link Contract#url() url} to url.
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
     * Initializes the optional value {@link Contract#applies() applies} to applies.
     * @param applies The value for applies
     * @return {@code this} builder for chained invocation
     */
    public final Builder applies(Period applies) {
      checkNotIsSet(appliesIsSet(), "applies");
      this.applies = Objects.requireNonNull(applies, "applies");
      optBits |= OPT_BIT_APPLIES;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#applies() applies} to applies.
     * @param applies The value for applies
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("applies")
    public final Builder applies(Optional<? extends Period> applies) {
      checkNotIsSet(appliesIsSet(), "applies");
      this.applies = applies.orElse(null);
      optBits |= OPT_BIT_APPLIES;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#name() name} to name.
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
     * Initializes the optional value {@link Contract#name() name} to name.
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
     * Initializes the optional value {@link Contract#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(Code status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends Code> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#topicReference() topicReference} to topicReference.
     * @param topicReference The value for topicReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder topicReference(Reference topicReference) {
      checkNotIsSet(topicReferenceIsSet(), "topicReference");
      this.topicReference = Objects.requireNonNull(topicReference, "topicReference");
      optBits |= OPT_BIT_TOPIC_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#topicReference() topicReference} to topicReference.
     * @param topicReference The value for topicReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("topicReference")
    public final Builder topicReference(Optional<? extends Reference> topicReference) {
      checkNotIsSet(topicReferenceIsSet(), "topicReference");
      this.topicReference = topicReference.orElse(null);
      optBits |= OPT_BIT_TOPIC_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#type() type} to type.
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
     * Initializes the optional value {@link Contract#type() type} to type.
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
     * Builds a new {@link Contract Contract}.
     * @return An immutable instance of Contract
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Contract build() {
      checkRequiredAttributes();
      return new ImmutableContract(
          extension,
          legallyBindingAttachment,
          subType,
          instantiatesCanonical,
          subtitle,
          issued,
          term,
          alias,
          relevantHistory,
          rule,
          resourceType,
          language,
          authority,
          topicCodeableConcept,
          identifier,
          scope,
          legal,
          contained,
          contentDerivative,
          id,
          title,
          version,
          friendly,
          instantiatesUri,
          meta,
          modifierExtension,
          author,
          text,
          supportingInfo,
          domain,
          implicitRules,
          expirationType,
          subject,
          site,
          contentDefinition,
          legalState,
          signer,
          legallyBindingReference,
          url,
          applies,
          name,
          status,
          topicReference,
          type);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean legallyBindingAttachmentIsSet() {
      return (optBits & OPT_BIT_LEGALLY_BINDING_ATTACHMENT) != 0;
    }

    private boolean subTypeIsSet() {
      return (optBits & OPT_BIT_SUB_TYPE) != 0;
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean subtitleIsSet() {
      return (optBits & OPT_BIT_SUBTITLE) != 0;
    }

    private boolean issuedIsSet() {
      return (optBits & OPT_BIT_ISSUED) != 0;
    }

    private boolean termIsSet() {
      return (optBits & OPT_BIT_TERM) != 0;
    }

    private boolean aliasIsSet() {
      return (optBits & OPT_BIT_ALIAS) != 0;
    }

    private boolean relevantHistoryIsSet() {
      return (optBits & OPT_BIT_RELEVANT_HISTORY) != 0;
    }

    private boolean ruleIsSet() {
      return (optBits & OPT_BIT_RULE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean authorityIsSet() {
      return (optBits & OPT_BIT_AUTHORITY) != 0;
    }

    private boolean topicCodeableConceptIsSet() {
      return (optBits & OPT_BIT_TOPIC_CODEABLE_CONCEPT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean scopeIsSet() {
      return (optBits & OPT_BIT_SCOPE) != 0;
    }

    private boolean legalIsSet() {
      return (optBits & OPT_BIT_LEGAL) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean contentDerivativeIsSet() {
      return (optBits & OPT_BIT_CONTENT_DERIVATIVE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean friendlyIsSet() {
      return (optBits & OPT_BIT_FRIENDLY) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean supportingInfoIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFO) != 0;
    }

    private boolean domainIsSet() {
      return (optBits & OPT_BIT_DOMAIN) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean expirationTypeIsSet() {
      return (optBits & OPT_BIT_EXPIRATION_TYPE) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean siteIsSet() {
      return (optBits & OPT_BIT_SITE) != 0;
    }

    private boolean contentDefinitionIsSet() {
      return (optBits & OPT_BIT_CONTENT_DEFINITION) != 0;
    }

    private boolean legalStateIsSet() {
      return (optBits & OPT_BIT_LEGAL_STATE) != 0;
    }

    private boolean signerIsSet() {
      return (optBits & OPT_BIT_SIGNER) != 0;
    }

    private boolean legallyBindingReferenceIsSet() {
      return (optBits & OPT_BIT_LEGALLY_BINDING_REFERENCE) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean appliesIsSet() {
      return (optBits & OPT_BIT_APPLIES) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean topicReferenceIsSet() {
      return (optBits & OPT_BIT_TOPIC_REFERENCE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Contract is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Contract, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Contract", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Contract#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Contract", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Contract#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Contract#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Contract#legallyBindingAttachment() legallyBindingAttachment} to legallyBindingAttachment.
     * @param legallyBindingAttachment The value for legallyBindingAttachment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal legallyBindingAttachment(Attachment legallyBindingAttachment);

    /**
     * Initializes the optional value {@link Contract#legallyBindingAttachment() legallyBindingAttachment} to legallyBindingAttachment.
     * @param legallyBindingAttachment The value for legallyBindingAttachment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal legallyBindingAttachment(Optional<? extends Attachment> legallyBindingAttachment);

    /**
     * Initializes the optional value {@link Contract#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subType(List<CodeableConcept> subType);

    /**
     * Initializes the optional value {@link Contract#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subType(Optional<? extends List<CodeableConcept>> subType);

    /**
     * Initializes the optional value {@link Contract#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesCanonical(Reference instantiatesCanonical);

    /**
     * Initializes the optional value {@link Contract#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesCanonical(Optional<? extends Reference> instantiatesCanonical);

    /**
     * Initializes the optional value {@link Contract#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subtitle(String subtitle);

    /**
     * Initializes the optional value {@link Contract#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subtitle(Optional<String> subtitle);

    /**
     * Initializes the optional value {@link Contract#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for chained invocation
     */
    BuildFinal issued(DateTime issued);

    /**
     * Initializes the optional value {@link Contract#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal issued(Optional<? extends DateTime> issued);

    /**
     * Initializes the optional value {@link Contract#term() term} to term.
     * @param term The value for term
     * @return {@code this} builder for chained invocation
     */
    BuildFinal term(List<Contract_Term> term);

    /**
     * Initializes the optional value {@link Contract#term() term} to term.
     * @param term The value for term
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal term(Optional<? extends List<Contract_Term>> term);

    /**
     * Initializes the optional value {@link Contract#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for chained invocation
     */
    BuildFinal alias(List<String> alias);

    /**
     * Initializes the optional value {@link Contract#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal alias(Optional<? extends List<String>> alias);

    /**
     * Initializes the optional value {@link Contract#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relevantHistory(List<Reference> relevantHistory);

    /**
     * Initializes the optional value {@link Contract#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relevantHistory(Optional<? extends List<Reference>> relevantHistory);

    /**
     * Initializes the optional value {@link Contract#rule() rule} to rule.
     * @param rule The value for rule
     * @return {@code this} builder for chained invocation
     */
    BuildFinal rule(List<Contract_Rule> rule);

    /**
     * Initializes the optional value {@link Contract#rule() rule} to rule.
     * @param rule The value for rule
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal rule(Optional<? extends List<Contract_Rule>> rule);

    /**
     * Initializes the optional value {@link Contract#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Contract#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Contract#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authority(List<Reference> authority);

    /**
     * Initializes the optional value {@link Contract#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authority(Optional<? extends List<Reference>> authority);

    /**
     * Initializes the optional value {@link Contract#topicCodeableConcept() topicCodeableConcept} to topicCodeableConcept.
     * @param topicCodeableConcept The value for topicCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topicCodeableConcept(CodeableConcept topicCodeableConcept);

    /**
     * Initializes the optional value {@link Contract#topicCodeableConcept() topicCodeableConcept} to topicCodeableConcept.
     * @param topicCodeableConcept The value for topicCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topicCodeableConcept(Optional<? extends CodeableConcept> topicCodeableConcept);

    /**
     * Initializes the optional value {@link Contract#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Contract#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Contract#scope() scope} to scope.
     * @param scope The value for scope
     * @return {@code this} builder for chained invocation
     */
    BuildFinal scope(CodeableConcept scope);

    /**
     * Initializes the optional value {@link Contract#scope() scope} to scope.
     * @param scope The value for scope
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal scope(Optional<? extends CodeableConcept> scope);

    /**
     * Initializes the optional value {@link Contract#legal() legal} to legal.
     * @param legal The value for legal
     * @return {@code this} builder for chained invocation
     */
    BuildFinal legal(List<Contract_Legal> legal);

    /**
     * Initializes the optional value {@link Contract#legal() legal} to legal.
     * @param legal The value for legal
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal legal(Optional<? extends List<Contract_Legal>> legal);

    /**
     * Initializes the optional value {@link Contract#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Contract#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Contract#contentDerivative() contentDerivative} to contentDerivative.
     * @param contentDerivative The value for contentDerivative
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contentDerivative(CodeableConcept contentDerivative);

    /**
     * Initializes the optional value {@link Contract#contentDerivative() contentDerivative} to contentDerivative.
     * @param contentDerivative The value for contentDerivative
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contentDerivative(Optional<? extends CodeableConcept> contentDerivative);

    /**
     * Initializes the optional value {@link Contract#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Contract#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Contract#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link Contract#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Initializes the optional value {@link Contract#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link Contract#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link Contract#friendly() friendly} to friendly.
     * @param friendly The value for friendly
     * @return {@code this} builder for chained invocation
     */
    BuildFinal friendly(List<Contract_Friendly> friendly);

    /**
     * Initializes the optional value {@link Contract#friendly() friendly} to friendly.
     * @param friendly The value for friendly
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal friendly(Optional<? extends List<Contract_Friendly>> friendly);

    /**
     * Initializes the optional value {@link Contract#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesUri(Uri instantiatesUri);

    /**
     * Initializes the optional value {@link Contract#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesUri(Optional<? extends Uri> instantiatesUri);

    /**
     * Initializes the optional value {@link Contract#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Contract#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Contract#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Contract#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Contract#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(Reference author);

    /**
     * Initializes the optional value {@link Contract#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(Optional<? extends Reference> author);

    /**
     * Initializes the optional value {@link Contract#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Contract#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Contract#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInfo(List<Reference> supportingInfo);

    /**
     * Initializes the optional value {@link Contract#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInfo(Optional<? extends List<Reference>> supportingInfo);

    /**
     * Initializes the optional value {@link Contract#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for chained invocation
     */
    BuildFinal domain(List<Reference> domain);

    /**
     * Initializes the optional value {@link Contract#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal domain(Optional<? extends List<Reference>> domain);

    /**
     * Initializes the optional value {@link Contract#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Contract#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Contract#expirationType() expirationType} to expirationType.
     * @param expirationType The value for expirationType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal expirationType(CodeableConcept expirationType);

    /**
     * Initializes the optional value {@link Contract#expirationType() expirationType} to expirationType.
     * @param expirationType The value for expirationType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal expirationType(Optional<? extends CodeableConcept> expirationType);

    /**
     * Initializes the optional value {@link Contract#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(List<Reference> subject);

    /**
     * Initializes the optional value {@link Contract#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends List<Reference>> subject);

    /**
     * Initializes the optional value {@link Contract#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for chained invocation
     */
    BuildFinal site(List<Reference> site);

    /**
     * Initializes the optional value {@link Contract#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal site(Optional<? extends List<Reference>> site);

    /**
     * Initializes the optional value {@link Contract#contentDefinition() contentDefinition} to contentDefinition.
     * @param contentDefinition The value for contentDefinition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contentDefinition(Contract_ContentDefinition contentDefinition);

    /**
     * Initializes the optional value {@link Contract#contentDefinition() contentDefinition} to contentDefinition.
     * @param contentDefinition The value for contentDefinition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contentDefinition(Optional<? extends Contract_ContentDefinition> contentDefinition);

    /**
     * Initializes the optional value {@link Contract#legalState() legalState} to legalState.
     * @param legalState The value for legalState
     * @return {@code this} builder for chained invocation
     */
    BuildFinal legalState(CodeableConcept legalState);

    /**
     * Initializes the optional value {@link Contract#legalState() legalState} to legalState.
     * @param legalState The value for legalState
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal legalState(Optional<? extends CodeableConcept> legalState);

    /**
     * Initializes the optional value {@link Contract#signer() signer} to signer.
     * @param signer The value for signer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal signer(List<Contract_Signer> signer);

    /**
     * Initializes the optional value {@link Contract#signer() signer} to signer.
     * @param signer The value for signer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal signer(Optional<? extends List<Contract_Signer>> signer);

    /**
     * Initializes the optional value {@link Contract#legallyBindingReference() legallyBindingReference} to legallyBindingReference.
     * @param legallyBindingReference The value for legallyBindingReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal legallyBindingReference(Reference legallyBindingReference);

    /**
     * Initializes the optional value {@link Contract#legallyBindingReference() legallyBindingReference} to legallyBindingReference.
     * @param legallyBindingReference The value for legallyBindingReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal legallyBindingReference(Optional<? extends Reference> legallyBindingReference);

    /**
     * Initializes the optional value {@link Contract#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link Contract#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link Contract#applies() applies} to applies.
     * @param applies The value for applies
     * @return {@code this} builder for chained invocation
     */
    BuildFinal applies(Period applies);

    /**
     * Initializes the optional value {@link Contract#applies() applies} to applies.
     * @param applies The value for applies
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal applies(Optional<? extends Period> applies);

    /**
     * Initializes the optional value {@link Contract#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link Contract#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link Contract#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link Contract#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link Contract#topicReference() topicReference} to topicReference.
     * @param topicReference The value for topicReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topicReference(Reference topicReference);

    /**
     * Initializes the optional value {@link Contract#topicReference() topicReference} to topicReference.
     * @param topicReference The value for topicReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topicReference(Optional<? extends Reference> topicReference);

    /**
     * Initializes the optional value {@link Contract#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(CodeableConcept type);

    /**
     * Initializes the optional value {@link Contract#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends CodeableConcept> type);

    /**
     * Builds a new {@link Contract Contract}.
     * @return An immutable instance of Contract
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Contract build();
  }
}
