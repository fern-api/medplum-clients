//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Contract}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableContract.builder()}.
 */
@org.immutables.value.Generated(from = "Contract", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableContract implements com.fhir.Contract {
  private final @javax.annotation.Nullable com.fhir.CodeableConcept scope;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Contract_Rule> rule;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Contract_Signer> signer;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Contract_Friendly> friendly;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> authority;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept topicCodeableConcept;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept expirationType;
  private final @javax.annotation.Nullable com.fhir.Reference instantiatesCanonical;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.Attachment legallyBindingAttachment;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> subType;
  private final @javax.annotation.Nullable com.fhir.Period applies;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> domain;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> site;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept legalState;
  private final @javax.annotation.Nullable com.fhir.Reference legallyBindingReference;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.lang.String subtitle;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.Reference topicReference;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Contract_Term> term;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInfo;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> relevantHistory;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Contract_Legal> legal;
  private final @javax.annotation.Nullable com.fhir.Contract_ContentDefinition contentDefinition;
  private final @javax.annotation.Nullable com.fhir.Reference author;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.dateTime issued;
  private final @javax.annotation.Nullable com.fhir.uri instantiatesUri;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept contentDerivative;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> subject;
  private final @javax.annotation.Nullable java.util.List<java.lang.String> alias;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable com.fhir.code status;

  private ImmutableContract(
      @javax.annotation.Nullable com.fhir.CodeableConcept scope,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable java.util.List<com.fhir.Contract_Rule> rule,
      @javax.annotation.Nullable java.util.List<com.fhir.Contract_Signer> signer,
      @javax.annotation.Nullable java.util.List<com.fhir.Contract_Friendly> friendly,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> authority,
      @javax.annotation.Nullable com.fhir.CodeableConcept topicCodeableConcept,
      @javax.annotation.Nullable com.fhir.CodeableConcept expirationType,
      @javax.annotation.Nullable com.fhir.Reference instantiatesCanonical,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.Attachment legallyBindingAttachment,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> subType,
      @javax.annotation.Nullable com.fhir.Period applies,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> domain,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> site,
      @javax.annotation.Nullable com.fhir.CodeableConcept legalState,
      @javax.annotation.Nullable com.fhir.Reference legallyBindingReference,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.lang.String subtitle,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.Reference topicReference,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Contract_Term> term,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInfo,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> relevantHistory,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Contract_Legal> legal,
      @javax.annotation.Nullable com.fhir.Contract_ContentDefinition contentDefinition,
      @javax.annotation.Nullable com.fhir.Reference author,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.dateTime issued,
      @javax.annotation.Nullable com.fhir.uri instantiatesUri,
      @javax.annotation.Nullable com.fhir.CodeableConcept contentDerivative,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> subject,
      @javax.annotation.Nullable java.util.List<java.lang.String> alias,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable com.fhir.code status) {
    this.scope = scope;
    this.resourceType = resourceType;
    this.modifierExtension = modifierExtension;
    this.title = title;
    this.name = name;
    this.rule = rule;
    this.signer = signer;
    this.friendly = friendly;
    this.authority = authority;
    this.topicCodeableConcept = topicCodeableConcept;
    this.expirationType = expirationType;
    this.instantiatesCanonical = instantiatesCanonical;
    this.type = type;
    this.text = text;
    this.legallyBindingAttachment = legallyBindingAttachment;
    this.identifier = identifier;
    this.subType = subType;
    this.applies = applies;
    this.domain = domain;
    this.version = version;
    this.site = site;
    this.legalState = legalState;
    this.legallyBindingReference = legallyBindingReference;
    this.implicitRules = implicitRules;
    this.subtitle = subtitle;
    this.meta = meta;
    this.topicReference = topicReference;
    this.id = id;
    this.extension = extension;
    this.term = term;
    this.supportingInfo = supportingInfo;
    this.relevantHistory = relevantHistory;
    this.contained = contained;
    this.legal = legal;
    this.contentDefinition = contentDefinition;
    this.author = author;
    this.language = language;
    this.issued = issued;
    this.instantiatesUri = instantiatesUri;
    this.contentDerivative = contentDerivative;
    this.subject = subject;
    this.alias = alias;
    this.url = url;
    this.status = status;
  }

  /**
   * @return The value of the {@code scope} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("scope")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> scope() {
    return java.util.Optional.ofNullable(scope);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code rule} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("rule")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Contract_Rule>> rule() {
    return java.util.Optional.ofNullable(rule);
  }

  /**
   * @return The value of the {@code signer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("signer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Contract_Signer>> signer() {
    return java.util.Optional.ofNullable(signer);
  }

  /**
   * @return The value of the {@code friendly} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("friendly")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Contract_Friendly>> friendly() {
    return java.util.Optional.ofNullable(friendly);
  }

  /**
   * @return The value of the {@code authority} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("authority")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> authority() {
    return java.util.Optional.ofNullable(authority);
  }

  /**
   * @return The value of the {@code topicCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("topicCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> topicCodeableConcept() {
    return java.util.Optional.ofNullable(topicCodeableConcept);
  }

  /**
   * @return The value of the {@code expirationType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("expirationType")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> expirationType() {
    return java.util.Optional.ofNullable(expirationType);
  }

  /**
   * @return The value of the {@code instantiatesCanonical} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
  @Override
  public java.util.Optional<com.fhir.Reference> instantiatesCanonical() {
    return java.util.Optional.ofNullable(instantiatesCanonical);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> type() {
    return java.util.Optional.ofNullable(type);
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
   * @return The value of the {@code legallyBindingAttachment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("legallyBindingAttachment")
  @Override
  public java.util.Optional<com.fhir.Attachment> legallyBindingAttachment() {
    return java.util.Optional.ofNullable(legallyBindingAttachment);
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
   * @return The value of the {@code subType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subType")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> subType() {
    return java.util.Optional.ofNullable(subType);
  }

  /**
   * @return The value of the {@code applies} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("applies")
  @Override
  public java.util.Optional<com.fhir.Period> applies() {
    return java.util.Optional.ofNullable(applies);
  }

  /**
   * @return The value of the {@code domain} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("domain")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> domain() {
    return java.util.Optional.ofNullable(domain);
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
   * @return The value of the {@code site} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("site")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> site() {
    return java.util.Optional.ofNullable(site);
  }

  /**
   * @return The value of the {@code legalState} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("legalState")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> legalState() {
    return java.util.Optional.ofNullable(legalState);
  }

  /**
   * @return The value of the {@code legallyBindingReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("legallyBindingReference")
  @Override
  public java.util.Optional<com.fhir.Reference> legallyBindingReference() {
    return java.util.Optional.ofNullable(legallyBindingReference);
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
   * @return The value of the {@code subtitle} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subtitle")
  @Override
  public java.util.Optional<java.lang.String> subtitle() {
    return java.util.Optional.ofNullable(subtitle);
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
   * @return The value of the {@code topicReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("topicReference")
  @Override
  public java.util.Optional<com.fhir.Reference> topicReference() {
    return java.util.Optional.ofNullable(topicReference);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code term} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("term")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Contract_Term>> term() {
    return java.util.Optional.ofNullable(term);
  }

  /**
   * @return The value of the {@code supportingInfo} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("supportingInfo")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> supportingInfo() {
    return java.util.Optional.ofNullable(supportingInfo);
  }

  /**
   * @return The value of the {@code relevantHistory} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("relevantHistory")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> relevantHistory() {
    return java.util.Optional.ofNullable(relevantHistory);
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
   * @return The value of the {@code legal} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("legal")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Contract_Legal>> legal() {
    return java.util.Optional.ofNullable(legal);
  }

  /**
   * @return The value of the {@code contentDefinition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contentDefinition")
  @Override
  public java.util.Optional<com.fhir.Contract_ContentDefinition> contentDefinition() {
    return java.util.Optional.ofNullable(contentDefinition);
  }

  /**
   * @return The value of the {@code author} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("author")
  @Override
  public java.util.Optional<com.fhir.Reference> author() {
    return java.util.Optional.ofNullable(author);
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
   * @return The value of the {@code issued} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("issued")
  @Override
  public java.util.Optional<com.fhir.dateTime> issued() {
    return java.util.Optional.ofNullable(issued);
  }

  /**
   * @return The value of the {@code instantiatesUri} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
  @Override
  public java.util.Optional<com.fhir.uri> instantiatesUri() {
    return java.util.Optional.ofNullable(instantiatesUri);
  }

  /**
   * @return The value of the {@code contentDerivative} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contentDerivative")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> contentDerivative() {
    return java.util.Optional.ofNullable(contentDerivative);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> subject() {
    return java.util.Optional.ofNullable(subject);
  }

  /**
   * @return The value of the {@code alias} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("alias")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> alias() {
    return java.util.Optional.ofNullable(alias);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.code> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#scope() scope} attribute.
   * @param value The value for scope
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withScope(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "scope");
    if (this.scope == newValue) return this;
    return new ImmutableContract(
        newValue,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#scope() scope} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for scope
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withScope(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.scope == value) return this;
    return new ImmutableContract(
        value,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Contract#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableContract withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableContract(
        this.scope,
        newValue,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        newValue,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        value,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        newValue,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        value,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        newValue,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        value,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#rule() rule} attribute.
   * @param value The value for rule
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withRule(java.util.List<com.fhir.Contract_Rule> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Contract_Rule> newValue = java.util.Objects.requireNonNull(value, "rule");
    if (this.rule == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        newValue,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#rule() rule} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rule
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withRule(java.util.Optional<? extends java.util.List<com.fhir.Contract_Rule>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Contract_Rule> value = optional.orElse(null);
    if (this.rule == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        value,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#signer() signer} attribute.
   * @param value The value for signer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withSigner(java.util.List<com.fhir.Contract_Signer> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Contract_Signer> newValue = java.util.Objects.requireNonNull(value, "signer");
    if (this.signer == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        newValue,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#signer() signer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for signer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withSigner(java.util.Optional<? extends java.util.List<com.fhir.Contract_Signer>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Contract_Signer> value = optional.orElse(null);
    if (this.signer == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        value,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#friendly() friendly} attribute.
   * @param value The value for friendly
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withFriendly(java.util.List<com.fhir.Contract_Friendly> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Contract_Friendly> newValue = java.util.Objects.requireNonNull(value, "friendly");
    if (this.friendly == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        newValue,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#friendly() friendly} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for friendly
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withFriendly(java.util.Optional<? extends java.util.List<com.fhir.Contract_Friendly>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Contract_Friendly> value = optional.orElse(null);
    if (this.friendly == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        value,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#authority() authority} attribute.
   * @param value The value for authority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withAuthority(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "authority");
    if (this.authority == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        newValue,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#authority() authority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withAuthority(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.authority == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        value,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#topicCodeableConcept() topicCodeableConcept} attribute.
   * @param value The value for topicCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withTopicCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "topicCodeableConcept");
    if (this.topicCodeableConcept == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        newValue,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#topicCodeableConcept() topicCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topicCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withTopicCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.topicCodeableConcept == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        value,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#expirationType() expirationType} attribute.
   * @param value The value for expirationType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withExpirationType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "expirationType");
    if (this.expirationType == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        newValue,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#expirationType() expirationType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for expirationType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withExpirationType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.expirationType == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        value,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withInstantiatesCanonical(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        newValue,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withInstantiatesCanonical(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        value,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        newValue,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        value,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        newValue,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        value,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#legallyBindingAttachment() legallyBindingAttachment} attribute.
   * @param value The value for legallyBindingAttachment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withLegallyBindingAttachment(com.fhir.Attachment value) {
    @javax.annotation.Nullable com.fhir.Attachment newValue = java.util.Objects.requireNonNull(value, "legallyBindingAttachment");
    if (this.legallyBindingAttachment == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        newValue,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#legallyBindingAttachment() legallyBindingAttachment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for legallyBindingAttachment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withLegallyBindingAttachment(java.util.Optional<? extends com.fhir.Attachment> optional) {
    @javax.annotation.Nullable com.fhir.Attachment value = optional.orElse(null);
    if (this.legallyBindingAttachment == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        value,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        newValue,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        value,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#subType() subType} attribute.
   * @param value The value for subType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withSubType(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "subType");
    if (this.subType == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        newValue,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#subType() subType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withSubType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.subType == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        value,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#applies() applies} attribute.
   * @param value The value for applies
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withApplies(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "applies");
    if (this.applies == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        newValue,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#applies() applies} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for applies
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withApplies(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.applies == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        value,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#domain() domain} attribute.
   * @param value The value for domain
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withDomain(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "domain");
    if (this.domain == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        newValue,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#domain() domain} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for domain
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withDomain(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.domain == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        value,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        newValue,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        value,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#site() site} attribute.
   * @param value The value for site
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withSite(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "site");
    if (this.site == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        newValue,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#site() site} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for site
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withSite(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.site == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        value,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#legalState() legalState} attribute.
   * @param value The value for legalState
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withLegalState(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "legalState");
    if (this.legalState == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        newValue,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#legalState() legalState} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for legalState
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withLegalState(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.legalState == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        value,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#legallyBindingReference() legallyBindingReference} attribute.
   * @param value The value for legallyBindingReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withLegallyBindingReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "legallyBindingReference");
    if (this.legallyBindingReference == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        newValue,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#legallyBindingReference() legallyBindingReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for legallyBindingReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withLegallyBindingReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.legallyBindingReference == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        value,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        newValue,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        value,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#subtitle() subtitle} attribute.
   * @param value The value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withSubtitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "subtitle");
    if (java.util.Objects.equals(this.subtitle, newValue)) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        newValue,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#subtitle() subtitle} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withSubtitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.subtitle, value)) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        value,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        newValue,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        value,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#topicReference() topicReference} attribute.
   * @param value The value for topicReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withTopicReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "topicReference");
    if (this.topicReference == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        newValue,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#topicReference() topicReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topicReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withTopicReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.topicReference == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        value,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        newValue,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        value,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        newValue,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        value,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#term() term} attribute.
   * @param value The value for term
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withTerm(java.util.List<com.fhir.Contract_Term> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Contract_Term> newValue = java.util.Objects.requireNonNull(value, "term");
    if (this.term == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        newValue,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#term() term} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for term
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withTerm(java.util.Optional<? extends java.util.List<com.fhir.Contract_Term>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Contract_Term> value = optional.orElse(null);
    if (this.term == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        value,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#supportingInfo() supportingInfo} attribute.
   * @param value The value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withSupportingInfo(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "supportingInfo");
    if (this.supportingInfo == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        newValue,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#supportingInfo() supportingInfo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withSupportingInfo(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.supportingInfo == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        value,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#relevantHistory() relevantHistory} attribute.
   * @param value The value for relevantHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withRelevantHistory(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "relevantHistory");
    if (this.relevantHistory == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        newValue,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#relevantHistory() relevantHistory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relevantHistory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withRelevantHistory(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.relevantHistory == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        value,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        newValue,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        value,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#legal() legal} attribute.
   * @param value The value for legal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withLegal(java.util.List<com.fhir.Contract_Legal> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Contract_Legal> newValue = java.util.Objects.requireNonNull(value, "legal");
    if (this.legal == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        newValue,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#legal() legal} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for legal
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withLegal(java.util.Optional<? extends java.util.List<com.fhir.Contract_Legal>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Contract_Legal> value = optional.orElse(null);
    if (this.legal == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        value,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#contentDefinition() contentDefinition} attribute.
   * @param value The value for contentDefinition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withContentDefinition(com.fhir.Contract_ContentDefinition value) {
    @javax.annotation.Nullable com.fhir.Contract_ContentDefinition newValue = java.util.Objects.requireNonNull(value, "contentDefinition");
    if (this.contentDefinition == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        newValue,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#contentDefinition() contentDefinition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contentDefinition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withContentDefinition(java.util.Optional<? extends com.fhir.Contract_ContentDefinition> optional) {
    @javax.annotation.Nullable com.fhir.Contract_ContentDefinition value = optional.orElse(null);
    if (this.contentDefinition == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        value,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withAuthor(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        newValue,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withAuthor(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        value,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        newValue,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        value,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#issued() issued} attribute.
   * @param value The value for issued
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withIssued(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "issued");
    if (this.issued == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        newValue,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#issued() issued} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for issued
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withIssued(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.issued == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        value,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withInstantiatesUri(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        newValue,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withInstantiatesUri(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        value,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#contentDerivative() contentDerivative} attribute.
   * @param value The value for contentDerivative
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withContentDerivative(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "contentDerivative");
    if (this.contentDerivative == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        newValue,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#contentDerivative() contentDerivative} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contentDerivative
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withContentDerivative(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.contentDerivative == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        value,
        this.subject,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withSubject(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        newValue,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withSubject(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        value,
        this.alias,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#alias() alias} attribute.
   * @param value The value for alias
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withAlias(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "alias");
    if (this.alias == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        newValue,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#alias() alias} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for alias
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withAlias(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.alias == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        value,
        this.url,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        newValue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        value,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableContract(
        this.scope,
        this.resourceType,
        this.modifierExtension,
        this.title,
        this.name,
        this.rule,
        this.signer,
        this.friendly,
        this.authority,
        this.topicCodeableConcept,
        this.expirationType,
        this.instantiatesCanonical,
        this.type,
        this.text,
        this.legallyBindingAttachment,
        this.identifier,
        this.subType,
        this.applies,
        this.domain,
        this.version,
        this.site,
        this.legalState,
        this.legallyBindingReference,
        this.implicitRules,
        this.subtitle,
        this.meta,
        this.topicReference,
        this.id,
        this.extension,
        this.term,
        this.supportingInfo,
        this.relevantHistory,
        this.contained,
        this.legal,
        this.contentDefinition,
        this.author,
        this.language,
        this.issued,
        this.instantiatesUri,
        this.contentDerivative,
        this.subject,
        this.alias,
        this.url,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableContract} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableContract
        && equalTo((ImmutableContract) another);
  }

  private boolean equalTo(ImmutableContract another) {
    return java.util.Objects.equals(scope, another.scope)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(rule, another.rule)
        && java.util.Objects.equals(signer, another.signer)
        && java.util.Objects.equals(friendly, another.friendly)
        && java.util.Objects.equals(authority, another.authority)
        && java.util.Objects.equals(topicCodeableConcept, another.topicCodeableConcept)
        && java.util.Objects.equals(expirationType, another.expirationType)
        && java.util.Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(legallyBindingAttachment, another.legallyBindingAttachment)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(subType, another.subType)
        && java.util.Objects.equals(applies, another.applies)
        && java.util.Objects.equals(domain, another.domain)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(site, another.site)
        && java.util.Objects.equals(legalState, another.legalState)
        && java.util.Objects.equals(legallyBindingReference, another.legallyBindingReference)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(subtitle, another.subtitle)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(topicReference, another.topicReference)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(term, another.term)
        && java.util.Objects.equals(supportingInfo, another.supportingInfo)
        && java.util.Objects.equals(relevantHistory, another.relevantHistory)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(legal, another.legal)
        && java.util.Objects.equals(contentDefinition, another.contentDefinition)
        && java.util.Objects.equals(author, another.author)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(issued, another.issued)
        && java.util.Objects.equals(instantiatesUri, another.instantiatesUri)
        && java.util.Objects.equals(contentDerivative, another.contentDerivative)
        && java.util.Objects.equals(subject, another.subject)
        && java.util.Objects.equals(alias, another.alias)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(status, another.status);
  }

  /**
   * Computes a hash code from attributes: {@code scope}, {@code resourceType}, {@code modifierExtension}, {@code title}, {@code name}, {@code rule}, {@code signer}, {@code friendly}, {@code authority}, {@code topicCodeableConcept}, {@code expirationType}, {@code instantiatesCanonical}, {@code type}, {@code text}, {@code legallyBindingAttachment}, {@code identifier}, {@code subType}, {@code applies}, {@code domain}, {@code version}, {@code site}, {@code legalState}, {@code legallyBindingReference}, {@code implicitRules}, {@code subtitle}, {@code meta}, {@code topicReference}, {@code id}, {@code extension}, {@code term}, {@code supportingInfo}, {@code relevantHistory}, {@code contained}, {@code legal}, {@code contentDefinition}, {@code author}, {@code language}, {@code issued}, {@code instantiatesUri}, {@code contentDerivative}, {@code subject}, {@code alias}, {@code url}, {@code status}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(scope);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(rule);
    h += (h << 5) + java.util.Objects.hashCode(signer);
    h += (h << 5) + java.util.Objects.hashCode(friendly);
    h += (h << 5) + java.util.Objects.hashCode(authority);
    h += (h << 5) + java.util.Objects.hashCode(topicCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(expirationType);
    h += (h << 5) + java.util.Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(legallyBindingAttachment);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(subType);
    h += (h << 5) + java.util.Objects.hashCode(applies);
    h += (h << 5) + java.util.Objects.hashCode(domain);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(site);
    h += (h << 5) + java.util.Objects.hashCode(legalState);
    h += (h << 5) + java.util.Objects.hashCode(legallyBindingReference);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(subtitle);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(topicReference);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(term);
    h += (h << 5) + java.util.Objects.hashCode(supportingInfo);
    h += (h << 5) + java.util.Objects.hashCode(relevantHistory);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(legal);
    h += (h << 5) + java.util.Objects.hashCode(contentDefinition);
    h += (h << 5) + java.util.Objects.hashCode(author);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(issued);
    h += (h << 5) + java.util.Objects.hashCode(instantiatesUri);
    h += (h << 5) + java.util.Objects.hashCode(contentDerivative);
    h += (h << 5) + java.util.Objects.hashCode(subject);
    h += (h << 5) + java.util.Objects.hashCode(alias);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(status);
    return h;
  }

  /**
   * Prints the immutable value {@code Contract} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Contract{");
    if (scope != null) {
      builder.append("scope=").append(scope);
    }
    if (builder.length() > 9) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (rule != null) {
      builder.append(", ");
      builder.append("rule=").append(rule);
    }
    if (signer != null) {
      builder.append(", ");
      builder.append("signer=").append(signer);
    }
    if (friendly != null) {
      builder.append(", ");
      builder.append("friendly=").append(friendly);
    }
    if (authority != null) {
      builder.append(", ");
      builder.append("authority=").append(authority);
    }
    if (topicCodeableConcept != null) {
      builder.append(", ");
      builder.append("topicCodeableConcept=").append(topicCodeableConcept);
    }
    if (expirationType != null) {
      builder.append(", ");
      builder.append("expirationType=").append(expirationType);
    }
    if (instantiatesCanonical != null) {
      builder.append(", ");
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (legallyBindingAttachment != null) {
      builder.append(", ");
      builder.append("legallyBindingAttachment=").append(legallyBindingAttachment);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (subType != null) {
      builder.append(", ");
      builder.append("subType=").append(subType);
    }
    if (applies != null) {
      builder.append(", ");
      builder.append("applies=").append(applies);
    }
    if (domain != null) {
      builder.append(", ");
      builder.append("domain=").append(domain);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (site != null) {
      builder.append(", ");
      builder.append("site=").append(site);
    }
    if (legalState != null) {
      builder.append(", ");
      builder.append("legalState=").append(legalState);
    }
    if (legallyBindingReference != null) {
      builder.append(", ");
      builder.append("legallyBindingReference=").append(legallyBindingReference);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (subtitle != null) {
      builder.append(", ");
      builder.append("subtitle=").append(subtitle);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (topicReference != null) {
      builder.append(", ");
      builder.append("topicReference=").append(topicReference);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (term != null) {
      builder.append(", ");
      builder.append("term=").append(term);
    }
    if (supportingInfo != null) {
      builder.append(", ");
      builder.append("supportingInfo=").append(supportingInfo);
    }
    if (relevantHistory != null) {
      builder.append(", ");
      builder.append("relevantHistory=").append(relevantHistory);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (legal != null) {
      builder.append(", ");
      builder.append("legal=").append(legal);
    }
    if (contentDefinition != null) {
      builder.append(", ");
      builder.append("contentDefinition=").append(contentDefinition);
    }
    if (author != null) {
      builder.append(", ");
      builder.append("author=").append(author);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (issued != null) {
      builder.append(", ");
      builder.append("issued=").append(issued);
    }
    if (instantiatesUri != null) {
      builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    if (contentDerivative != null) {
      builder.append(", ");
      builder.append("contentDerivative=").append(contentDerivative);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (alias != null) {
      builder.append(", ");
      builder.append("alias=").append(alias);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
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
  @org.immutables.value.Generated(from = "Contract", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Contract {
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> scope = java.util.Optional.empty();
    boolean scopeIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Contract_Rule>> rule = java.util.Optional.empty();
    boolean ruleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Contract_Signer>> signer = java.util.Optional.empty();
    boolean signerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Contract_Friendly>> friendly = java.util.Optional.empty();
    boolean friendlyIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> authority = java.util.Optional.empty();
    boolean authorityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> topicCodeableConcept = java.util.Optional.empty();
    boolean topicCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> expirationType = java.util.Optional.empty();
    boolean expirationTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> instantiatesCanonical = java.util.Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Attachment> legallyBindingAttachment = java.util.Optional.empty();
    boolean legallyBindingAttachmentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> subType = java.util.Optional.empty();
    boolean subTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> applies = java.util.Optional.empty();
    boolean appliesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> domain = java.util.Optional.empty();
    boolean domainIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> site = java.util.Optional.empty();
    boolean siteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> legalState = java.util.Optional.empty();
    boolean legalStateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> legallyBindingReference = java.util.Optional.empty();
    boolean legallyBindingReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> subtitle = java.util.Optional.empty();
    boolean subtitleIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> topicReference = java.util.Optional.empty();
    boolean topicReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Contract_Term>> term = java.util.Optional.empty();
    boolean termIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> supportingInfo = java.util.Optional.empty();
    boolean supportingInfoIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> relevantHistory = java.util.Optional.empty();
    boolean relevantHistoryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Contract_Legal>> legal = java.util.Optional.empty();
    boolean legalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Contract_ContentDefinition> contentDefinition = java.util.Optional.empty();
    boolean contentDefinitionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> author = java.util.Optional.empty();
    boolean authorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> issued = java.util.Optional.empty();
    boolean issuedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> instantiatesUri = java.util.Optional.empty();
    boolean instantiatesUriIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> contentDerivative = java.util.Optional.empty();
    boolean contentDerivativeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> alias = java.util.Optional.empty();
    boolean aliasIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    public void setScope(java.util.Optional<com.fhir.CodeableConcept> scope) {
      this.scope = scope;
      this.scopeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("rule")
    public void setRule(java.util.Optional<java.util.List<com.fhir.Contract_Rule>> rule) {
      this.rule = rule;
      this.ruleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("signer")
    public void setSigner(java.util.Optional<java.util.List<com.fhir.Contract_Signer>> signer) {
      this.signer = signer;
      this.signerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("friendly")
    public void setFriendly(java.util.Optional<java.util.List<com.fhir.Contract_Friendly>> friendly) {
      this.friendly = friendly;
      this.friendlyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("authority")
    public void setAuthority(java.util.Optional<java.util.List<com.fhir.Reference>> authority) {
      this.authority = authority;
      this.authorityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("topicCodeableConcept")
    public void setTopicCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> topicCodeableConcept) {
      this.topicCodeableConcept = topicCodeableConcept;
      this.topicCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("expirationType")
    public void setExpirationType(java.util.Optional<com.fhir.CodeableConcept> expirationType) {
      this.expirationType = expirationType;
      this.expirationTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(java.util.Optional<com.fhir.Reference> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("legallyBindingAttachment")
    public void setLegallyBindingAttachment(java.util.Optional<com.fhir.Attachment> legallyBindingAttachment) {
      this.legallyBindingAttachment = legallyBindingAttachment;
      this.legallyBindingAttachmentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subType")
    public void setSubType(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> subType) {
      this.subType = subType;
      this.subTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("applies")
    public void setApplies(java.util.Optional<com.fhir.Period> applies) {
      this.applies = applies;
      this.appliesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    public void setDomain(java.util.Optional<java.util.List<com.fhir.Reference>> domain) {
      this.domain = domain;
      this.domainIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("site")
    public void setSite(java.util.Optional<java.util.List<com.fhir.Reference>> site) {
      this.site = site;
      this.siteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("legalState")
    public void setLegalState(java.util.Optional<com.fhir.CodeableConcept> legalState) {
      this.legalState = legalState;
      this.legalStateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("legallyBindingReference")
    public void setLegallyBindingReference(java.util.Optional<com.fhir.Reference> legallyBindingReference) {
      this.legallyBindingReference = legallyBindingReference;
      this.legallyBindingReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subtitle")
    public void setSubtitle(java.util.Optional<java.lang.String> subtitle) {
      this.subtitle = subtitle;
      this.subtitleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("topicReference")
    public void setTopicReference(java.util.Optional<com.fhir.Reference> topicReference) {
      this.topicReference = topicReference;
      this.topicReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("term")
    public void setTerm(java.util.Optional<java.util.List<com.fhir.Contract_Term>> term) {
      this.term = term;
      this.termIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("supportingInfo")
    public void setSupportingInfo(java.util.Optional<java.util.List<com.fhir.Reference>> supportingInfo) {
      this.supportingInfo = supportingInfo;
      this.supportingInfoIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("relevantHistory")
    public void setRelevantHistory(java.util.Optional<java.util.List<com.fhir.Reference>> relevantHistory) {
      this.relevantHistory = relevantHistory;
      this.relevantHistoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("legal")
    public void setLegal(java.util.Optional<java.util.List<com.fhir.Contract_Legal>> legal) {
      this.legal = legal;
      this.legalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contentDefinition")
    public void setContentDefinition(java.util.Optional<com.fhir.Contract_ContentDefinition> contentDefinition) {
      this.contentDefinition = contentDefinition;
      this.contentDefinitionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public void setAuthor(java.util.Optional<com.fhir.Reference> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("issued")
    public void setIssued(java.util.Optional<com.fhir.dateTime> issued) {
      this.issued = issued;
      this.issuedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
    public void setInstantiatesUri(java.util.Optional<com.fhir.uri> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contentDerivative")
    public void setContentDerivative(java.util.Optional<com.fhir.CodeableConcept> contentDerivative) {
      this.contentDerivative = contentDerivative;
      this.contentDerivativeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<java.util.List<com.fhir.Reference>> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    public void setAlias(java.util.Optional<java.util.List<java.lang.String>> alias) {
      this.alias = alias;
      this.aliasIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> scope() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Contract_Rule>> rule() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Contract_Signer>> signer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Contract_Friendly>> friendly() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> authority() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> topicCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> expirationType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Attachment> legallyBindingAttachment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> subType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> applies() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> domain() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> site() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> legalState() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> legallyBindingReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> subtitle() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> topicReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Contract_Term>> term() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> supportingInfo() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> relevantHistory() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Contract_Legal>> legal() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Contract_ContentDefinition> contentDefinition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> author() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> issued() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> instantiatesUri() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> contentDerivative() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> alias() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableContract fromJson(Json json) {
    ImmutableContract.Builder builder = ((ImmutableContract.Builder) ImmutableContract.builder());
    if (json.scopeIsSet) {
      builder.scope(json.scope);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.ruleIsSet) {
      builder.rule(json.rule);
    }
    if (json.signerIsSet) {
      builder.signer(json.signer);
    }
    if (json.friendlyIsSet) {
      builder.friendly(json.friendly);
    }
    if (json.authorityIsSet) {
      builder.authority(json.authority);
    }
    if (json.topicCodeableConceptIsSet) {
      builder.topicCodeableConcept(json.topicCodeableConcept);
    }
    if (json.expirationTypeIsSet) {
      builder.expirationType(json.expirationType);
    }
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.legallyBindingAttachmentIsSet) {
      builder.legallyBindingAttachment(json.legallyBindingAttachment);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.subTypeIsSet) {
      builder.subType(json.subType);
    }
    if (json.appliesIsSet) {
      builder.applies(json.applies);
    }
    if (json.domainIsSet) {
      builder.domain(json.domain);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.siteIsSet) {
      builder.site(json.site);
    }
    if (json.legalStateIsSet) {
      builder.legalState(json.legalState);
    }
    if (json.legallyBindingReferenceIsSet) {
      builder.legallyBindingReference(json.legallyBindingReference);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.subtitleIsSet) {
      builder.subtitle(json.subtitle);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.topicReferenceIsSet) {
      builder.topicReference(json.topicReference);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.termIsSet) {
      builder.term(json.term);
    }
    if (json.supportingInfoIsSet) {
      builder.supportingInfo(json.supportingInfo);
    }
    if (json.relevantHistoryIsSet) {
      builder.relevantHistory(json.relevantHistory);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.legalIsSet) {
      builder.legal(json.legal);
    }
    if (json.contentDefinitionIsSet) {
      builder.contentDefinition(json.contentDefinition);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.issuedIsSet) {
      builder.issued(json.issued);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    if (json.contentDerivativeIsSet) {
      builder.contentDerivative(json.contentDerivative);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.aliasIsSet) {
      builder.alias(json.alias);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
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
        .scope(instance.scope())
        .resourceType(instance.resourceType())
        .modifierExtension(instance.modifierExtension())
        .title(instance.title())
        .name(instance.name())
        .rule(instance.rule())
        .signer(instance.signer())
        .friendly(instance.friendly())
        .authority(instance.authority())
        .topicCodeableConcept(instance.topicCodeableConcept())
        .expirationType(instance.expirationType())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .type(instance.type())
        .text(instance.text())
        .legallyBindingAttachment(instance.legallyBindingAttachment())
        .identifier(instance.identifier())
        .subType(instance.subType())
        .applies(instance.applies())
        .domain(instance.domain())
        .version(instance.version())
        .site(instance.site())
        .legalState(instance.legalState())
        .legallyBindingReference(instance.legallyBindingReference())
        .implicitRules(instance.implicitRules())
        .subtitle(instance.subtitle())
        .meta(instance.meta())
        .topicReference(instance.topicReference())
        .id(instance.id())
        .extension(instance.extension())
        .term(instance.term())
        .supportingInfo(instance.supportingInfo())
        .relevantHistory(instance.relevantHistory())
        .contained(instance.contained())
        .legal(instance.legal())
        .contentDefinition(instance.contentDefinition())
        .author(instance.author())
        .language(instance.language())
        .issued(instance.issued())
        .instantiatesUri(instance.instantiatesUri())
        .contentDerivative(instance.contentDerivative())
        .subject(instance.subject())
        .alias(instance.alias())
        .url(instance.url())
        .status(instance.status())
        .build();
  }

  /**
   * Creates a builder for {@link Contract Contract}.
   * <pre>
   * ImmutableContract.builder()
   *    .scope(com.fhir.CodeableConcept) // optional {@link Contract#scope() scope}
   *    .resourceType(String) // required {@link Contract#resourceType() resourceType}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Contract#modifierExtension() modifierExtension}
   *    .title(String) // optional {@link Contract#title() title}
   *    .name(String) // optional {@link Contract#name() name}
   *    .rule(List&amp;lt;com.fhir.Contract_Rule&amp;gt;) // optional {@link Contract#rule() rule}
   *    .signer(List&amp;lt;com.fhir.Contract_Signer&amp;gt;) // optional {@link Contract#signer() signer}
   *    .friendly(List&amp;lt;com.fhir.Contract_Friendly&amp;gt;) // optional {@link Contract#friendly() friendly}
   *    .authority(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Contract#authority() authority}
   *    .topicCodeableConcept(com.fhir.CodeableConcept) // optional {@link Contract#topicCodeableConcept() topicCodeableConcept}
   *    .expirationType(com.fhir.CodeableConcept) // optional {@link Contract#expirationType() expirationType}
   *    .instantiatesCanonical(com.fhir.Reference) // optional {@link Contract#instantiatesCanonical() instantiatesCanonical}
   *    .type(com.fhir.CodeableConcept) // optional {@link Contract#type() type}
   *    .text(com.fhir.Narrative) // optional {@link Contract#text() text}
   *    .legallyBindingAttachment(com.fhir.Attachment) // optional {@link Contract#legallyBindingAttachment() legallyBindingAttachment}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Contract#identifier() identifier}
   *    .subType(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Contract#subType() subType}
   *    .applies(com.fhir.Period) // optional {@link Contract#applies() applies}
   *    .domain(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Contract#domain() domain}
   *    .version(String) // optional {@link Contract#version() version}
   *    .site(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Contract#site() site}
   *    .legalState(com.fhir.CodeableConcept) // optional {@link Contract#legalState() legalState}
   *    .legallyBindingReference(com.fhir.Reference) // optional {@link Contract#legallyBindingReference() legallyBindingReference}
   *    .implicitRules(com.fhir.uri) // optional {@link Contract#implicitRules() implicitRules}
   *    .subtitle(String) // optional {@link Contract#subtitle() subtitle}
   *    .meta(com.fhir.Meta) // optional {@link Contract#meta() meta}
   *    .topicReference(com.fhir.Reference) // optional {@link Contract#topicReference() topicReference}
   *    .id(com.fhir.id) // optional {@link Contract#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Contract#extension() extension}
   *    .term(List&amp;lt;com.fhir.Contract_Term&amp;gt;) // optional {@link Contract#term() term}
   *    .supportingInfo(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Contract#supportingInfo() supportingInfo}
   *    .relevantHistory(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Contract#relevantHistory() relevantHistory}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Contract#contained() contained}
   *    .legal(List&amp;lt;com.fhir.Contract_Legal&amp;gt;) // optional {@link Contract#legal() legal}
   *    .contentDefinition(com.fhir.Contract_ContentDefinition) // optional {@link Contract#contentDefinition() contentDefinition}
   *    .author(com.fhir.Reference) // optional {@link Contract#author() author}
   *    .language(com.fhir.code) // optional {@link Contract#language() language}
   *    .issued(com.fhir.dateTime) // optional {@link Contract#issued() issued}
   *    .instantiatesUri(com.fhir.uri) // optional {@link Contract#instantiatesUri() instantiatesUri}
   *    .contentDerivative(com.fhir.CodeableConcept) // optional {@link Contract#contentDerivative() contentDerivative}
   *    .subject(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Contract#subject() subject}
   *    .alias(List&amp;lt;String&amp;gt;) // optional {@link Contract#alias() alias}
   *    .url(com.fhir.uri) // optional {@link Contract#url() url}
   *    .status(com.fhir.code) // optional {@link Contract#status() status}
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
  @org.immutables.value.Generated(from = "Contract", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_SCOPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_TITLE = 0x4L;
    private static final long OPT_BIT_NAME = 0x8L;
    private static final long OPT_BIT_RULE = 0x10L;
    private static final long OPT_BIT_SIGNER = 0x20L;
    private static final long OPT_BIT_FRIENDLY = 0x40L;
    private static final long OPT_BIT_AUTHORITY = 0x80L;
    private static final long OPT_BIT_TOPIC_CODEABLE_CONCEPT = 0x100L;
    private static final long OPT_BIT_EXPIRATION_TYPE = 0x200L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x400L;
    private static final long OPT_BIT_TYPE = 0x800L;
    private static final long OPT_BIT_TEXT = 0x1000L;
    private static final long OPT_BIT_LEGALLY_BINDING_ATTACHMENT = 0x2000L;
    private static final long OPT_BIT_IDENTIFIER = 0x4000L;
    private static final long OPT_BIT_SUB_TYPE = 0x8000L;
    private static final long OPT_BIT_APPLIES = 0x10000L;
    private static final long OPT_BIT_DOMAIN = 0x20000L;
    private static final long OPT_BIT_VERSION = 0x40000L;
    private static final long OPT_BIT_SITE = 0x80000L;
    private static final long OPT_BIT_LEGAL_STATE = 0x100000L;
    private static final long OPT_BIT_LEGALLY_BINDING_REFERENCE = 0x200000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x400000L;
    private static final long OPT_BIT_SUBTITLE = 0x800000L;
    private static final long OPT_BIT_META = 0x1000000L;
    private static final long OPT_BIT_TOPIC_REFERENCE = 0x2000000L;
    private static final long OPT_BIT_ID = 0x4000000L;
    private static final long OPT_BIT_EXTENSION = 0x8000000L;
    private static final long OPT_BIT_TERM = 0x10000000L;
    private static final long OPT_BIT_SUPPORTING_INFO = 0x20000000L;
    private static final long OPT_BIT_RELEVANT_HISTORY = 0x40000000L;
    private static final long OPT_BIT_CONTAINED = 0x80000000L;
    private static final long OPT_BIT_LEGAL = 0x100000000L;
    private static final long OPT_BIT_CONTENT_DEFINITION = 0x200000000L;
    private static final long OPT_BIT_AUTHOR = 0x400000000L;
    private static final long OPT_BIT_LANGUAGE = 0x800000000L;
    private static final long OPT_BIT_ISSUED = 0x1000000000L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x2000000000L;
    private static final long OPT_BIT_CONTENT_DERIVATIVE = 0x4000000000L;
    private static final long OPT_BIT_SUBJECT = 0x8000000000L;
    private static final long OPT_BIT_ALIAS = 0x10000000000L;
    private static final long OPT_BIT_URL = 0x20000000000L;
    private static final long OPT_BIT_STATUS = 0x40000000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.CodeableConcept scope;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable java.util.List<com.fhir.Contract_Rule> rule;
    private @javax.annotation.Nullable java.util.List<com.fhir.Contract_Signer> signer;
    private @javax.annotation.Nullable java.util.List<com.fhir.Contract_Friendly> friendly;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> authority;
    private @javax.annotation.Nullable com.fhir.CodeableConcept topicCodeableConcept;
    private @javax.annotation.Nullable com.fhir.CodeableConcept expirationType;
    private @javax.annotation.Nullable com.fhir.Reference instantiatesCanonical;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.Attachment legallyBindingAttachment;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> subType;
    private @javax.annotation.Nullable com.fhir.Period applies;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> domain;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> site;
    private @javax.annotation.Nullable com.fhir.CodeableConcept legalState;
    private @javax.annotation.Nullable com.fhir.Reference legallyBindingReference;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.lang.String subtitle;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.Reference topicReference;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Contract_Term> term;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInfo;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> relevantHistory;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Contract_Legal> legal;
    private @javax.annotation.Nullable com.fhir.Contract_ContentDefinition contentDefinition;
    private @javax.annotation.Nullable com.fhir.Reference author;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.dateTime issued;
    private @javax.annotation.Nullable com.fhir.uri instantiatesUri;
    private @javax.annotation.Nullable com.fhir.CodeableConcept contentDerivative;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> subject;
    private @javax.annotation.Nullable java.util.List<java.lang.String> alias;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable com.fhir.code status;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Contract#scope() scope} to scope.
     * @param scope The value for scope
     * @return {@code this} builder for chained invocation
     */
    public final Builder scope(com.fhir.CodeableConcept scope) {
      checkNotIsSet(scopeIsSet(), "scope");
      this.scope = java.util.Objects.requireNonNull(scope, "scope");
      optBits |= OPT_BIT_SCOPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#scope() scope} to scope.
     * @param scope The value for scope
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    public final Builder scope(java.util.Optional<? extends com.fhir.CodeableConcept> scope) {
      checkNotIsSet(scopeIsSet(), "scope");
      this.scope = scope.orElse(null);
      optBits |= OPT_BIT_SCOPE;
      return this;
    }

    /**
     * Initializes the value for the {@link Contract#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Contract#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract#title() title} to title.
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
     * Initializes the optional value {@link Contract#title() title} to title.
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
     * Initializes the optional value {@link Contract#name() name} to name.
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
     * Initializes the optional value {@link Contract#name() name} to name.
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
     * Initializes the optional value {@link Contract#rule() rule} to rule.
     * @param rule The value for rule
     * @return {@code this} builder for chained invocation
     */
    public final Builder rule(java.util.List<com.fhir.Contract_Rule> rule) {
      checkNotIsSet(ruleIsSet(), "rule");
      this.rule = java.util.Objects.requireNonNull(rule, "rule");
      optBits |= OPT_BIT_RULE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#rule() rule} to rule.
     * @param rule The value for rule
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rule")
    public final Builder rule(java.util.Optional<? extends java.util.List<com.fhir.Contract_Rule>> rule) {
      checkNotIsSet(ruleIsSet(), "rule");
      this.rule = rule.orElse(null);
      optBits |= OPT_BIT_RULE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#signer() signer} to signer.
     * @param signer The value for signer
     * @return {@code this} builder for chained invocation
     */
    public final Builder signer(java.util.List<com.fhir.Contract_Signer> signer) {
      checkNotIsSet(signerIsSet(), "signer");
      this.signer = java.util.Objects.requireNonNull(signer, "signer");
      optBits |= OPT_BIT_SIGNER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#signer() signer} to signer.
     * @param signer The value for signer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("signer")
    public final Builder signer(java.util.Optional<? extends java.util.List<com.fhir.Contract_Signer>> signer) {
      checkNotIsSet(signerIsSet(), "signer");
      this.signer = signer.orElse(null);
      optBits |= OPT_BIT_SIGNER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#friendly() friendly} to friendly.
     * @param friendly The value for friendly
     * @return {@code this} builder for chained invocation
     */
    public final Builder friendly(java.util.List<com.fhir.Contract_Friendly> friendly) {
      checkNotIsSet(friendlyIsSet(), "friendly");
      this.friendly = java.util.Objects.requireNonNull(friendly, "friendly");
      optBits |= OPT_BIT_FRIENDLY;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#friendly() friendly} to friendly.
     * @param friendly The value for friendly
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("friendly")
    public final Builder friendly(java.util.Optional<? extends java.util.List<com.fhir.Contract_Friendly>> friendly) {
      checkNotIsSet(friendlyIsSet(), "friendly");
      this.friendly = friendly.orElse(null);
      optBits |= OPT_BIT_FRIENDLY;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for chained invocation
     */
    public final Builder authority(java.util.List<com.fhir.Reference> authority) {
      checkNotIsSet(authorityIsSet(), "authority");
      this.authority = java.util.Objects.requireNonNull(authority, "authority");
      optBits |= OPT_BIT_AUTHORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authority")
    public final Builder authority(java.util.Optional<? extends java.util.List<com.fhir.Reference>> authority) {
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
    public final Builder topicCodeableConcept(com.fhir.CodeableConcept topicCodeableConcept) {
      checkNotIsSet(topicCodeableConceptIsSet(), "topicCodeableConcept");
      this.topicCodeableConcept = java.util.Objects.requireNonNull(topicCodeableConcept, "topicCodeableConcept");
      optBits |= OPT_BIT_TOPIC_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#topicCodeableConcept() topicCodeableConcept} to topicCodeableConcept.
     * @param topicCodeableConcept The value for topicCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topicCodeableConcept")
    public final Builder topicCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> topicCodeableConcept) {
      checkNotIsSet(topicCodeableConceptIsSet(), "topicCodeableConcept");
      this.topicCodeableConcept = topicCodeableConcept.orElse(null);
      optBits |= OPT_BIT_TOPIC_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#expirationType() expirationType} to expirationType.
     * @param expirationType The value for expirationType
     * @return {@code this} builder for chained invocation
     */
    public final Builder expirationType(com.fhir.CodeableConcept expirationType) {
      checkNotIsSet(expirationTypeIsSet(), "expirationType");
      this.expirationType = java.util.Objects.requireNonNull(expirationType, "expirationType");
      optBits |= OPT_BIT_EXPIRATION_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#expirationType() expirationType} to expirationType.
     * @param expirationType The value for expirationType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expirationType")
    public final Builder expirationType(java.util.Optional<? extends com.fhir.CodeableConcept> expirationType) {
      checkNotIsSet(expirationTypeIsSet(), "expirationType");
      this.expirationType = expirationType.orElse(null);
      optBits |= OPT_BIT_EXPIRATION_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesCanonical(com.fhir.Reference instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = java.util.Objects.requireNonNull(instantiatesCanonical, "instantiatesCanonical");
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
    public final Builder instantiatesCanonical(java.util.Optional<? extends com.fhir.Reference> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = instantiatesCanonical.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#text() text} to text.
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
     * Initializes the optional value {@link Contract#text() text} to text.
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
     * Initializes the optional value {@link Contract#legallyBindingAttachment() legallyBindingAttachment} to legallyBindingAttachment.
     * @param legallyBindingAttachment The value for legallyBindingAttachment
     * @return {@code this} builder for chained invocation
     */
    public final Builder legallyBindingAttachment(com.fhir.Attachment legallyBindingAttachment) {
      checkNotIsSet(legallyBindingAttachmentIsSet(), "legallyBindingAttachment");
      this.legallyBindingAttachment = java.util.Objects.requireNonNull(legallyBindingAttachment, "legallyBindingAttachment");
      optBits |= OPT_BIT_LEGALLY_BINDING_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#legallyBindingAttachment() legallyBindingAttachment} to legallyBindingAttachment.
     * @param legallyBindingAttachment The value for legallyBindingAttachment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("legallyBindingAttachment")
    public final Builder legallyBindingAttachment(java.util.Optional<? extends com.fhir.Attachment> legallyBindingAttachment) {
      checkNotIsSet(legallyBindingAttachmentIsSet(), "legallyBindingAttachment");
      this.legallyBindingAttachment = legallyBindingAttachment.orElse(null);
      optBits |= OPT_BIT_LEGALLY_BINDING_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Contract#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Contract#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for chained invocation
     */
    public final Builder subType(java.util.List<com.fhir.CodeableConcept> subType) {
      checkNotIsSet(subTypeIsSet(), "subType");
      this.subType = java.util.Objects.requireNonNull(subType, "subType");
      optBits |= OPT_BIT_SUB_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subType")
    public final Builder subType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> subType) {
      checkNotIsSet(subTypeIsSet(), "subType");
      this.subType = subType.orElse(null);
      optBits |= OPT_BIT_SUB_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#applies() applies} to applies.
     * @param applies The value for applies
     * @return {@code this} builder for chained invocation
     */
    public final Builder applies(com.fhir.Period applies) {
      checkNotIsSet(appliesIsSet(), "applies");
      this.applies = java.util.Objects.requireNonNull(applies, "applies");
      optBits |= OPT_BIT_APPLIES;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#applies() applies} to applies.
     * @param applies The value for applies
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applies")
    public final Builder applies(java.util.Optional<? extends com.fhir.Period> applies) {
      checkNotIsSet(appliesIsSet(), "applies");
      this.applies = applies.orElse(null);
      optBits |= OPT_BIT_APPLIES;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for chained invocation
     */
    public final Builder domain(java.util.List<com.fhir.Reference> domain) {
      checkNotIsSet(domainIsSet(), "domain");
      this.domain = java.util.Objects.requireNonNull(domain, "domain");
      optBits |= OPT_BIT_DOMAIN;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    public final Builder domain(java.util.Optional<? extends java.util.List<com.fhir.Reference>> domain) {
      checkNotIsSet(domainIsSet(), "domain");
      this.domain = domain.orElse(null);
      optBits |= OPT_BIT_DOMAIN;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#version() version} to version.
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
     * Initializes the optional value {@link Contract#version() version} to version.
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
     * Initializes the optional value {@link Contract#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for chained invocation
     */
    public final Builder site(java.util.List<com.fhir.Reference> site) {
      checkNotIsSet(siteIsSet(), "site");
      this.site = java.util.Objects.requireNonNull(site, "site");
      optBits |= OPT_BIT_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("site")
    public final Builder site(java.util.Optional<? extends java.util.List<com.fhir.Reference>> site) {
      checkNotIsSet(siteIsSet(), "site");
      this.site = site.orElse(null);
      optBits |= OPT_BIT_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#legalState() legalState} to legalState.
     * @param legalState The value for legalState
     * @return {@code this} builder for chained invocation
     */
    public final Builder legalState(com.fhir.CodeableConcept legalState) {
      checkNotIsSet(legalStateIsSet(), "legalState");
      this.legalState = java.util.Objects.requireNonNull(legalState, "legalState");
      optBits |= OPT_BIT_LEGAL_STATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#legalState() legalState} to legalState.
     * @param legalState The value for legalState
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("legalState")
    public final Builder legalState(java.util.Optional<? extends com.fhir.CodeableConcept> legalState) {
      checkNotIsSet(legalStateIsSet(), "legalState");
      this.legalState = legalState.orElse(null);
      optBits |= OPT_BIT_LEGAL_STATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#legallyBindingReference() legallyBindingReference} to legallyBindingReference.
     * @param legallyBindingReference The value for legallyBindingReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder legallyBindingReference(com.fhir.Reference legallyBindingReference) {
      checkNotIsSet(legallyBindingReferenceIsSet(), "legallyBindingReference");
      this.legallyBindingReference = java.util.Objects.requireNonNull(legallyBindingReference, "legallyBindingReference");
      optBits |= OPT_BIT_LEGALLY_BINDING_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#legallyBindingReference() legallyBindingReference} to legallyBindingReference.
     * @param legallyBindingReference The value for legallyBindingReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("legallyBindingReference")
    public final Builder legallyBindingReference(java.util.Optional<? extends com.fhir.Reference> legallyBindingReference) {
      checkNotIsSet(legallyBindingReferenceIsSet(), "legallyBindingReference");
      this.legallyBindingReference = legallyBindingReference.orElse(null);
      optBits |= OPT_BIT_LEGALLY_BINDING_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Contract#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Contract#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for chained invocation
     */
    public final Builder subtitle(java.lang.String subtitle) {
      checkNotIsSet(subtitleIsSet(), "subtitle");
      this.subtitle = java.util.Objects.requireNonNull(subtitle, "subtitle");
      optBits |= OPT_BIT_SUBTITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subtitle")
    public final Builder subtitle(java.util.Optional<java.lang.String> subtitle) {
      checkNotIsSet(subtitleIsSet(), "subtitle");
      this.subtitle = subtitle.orElse(null);
      optBits |= OPT_BIT_SUBTITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#meta() meta} to meta.
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
     * Initializes the optional value {@link Contract#meta() meta} to meta.
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
     * Initializes the optional value {@link Contract#topicReference() topicReference} to topicReference.
     * @param topicReference The value for topicReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder topicReference(com.fhir.Reference topicReference) {
      checkNotIsSet(topicReferenceIsSet(), "topicReference");
      this.topicReference = java.util.Objects.requireNonNull(topicReference, "topicReference");
      optBits |= OPT_BIT_TOPIC_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#topicReference() topicReference} to topicReference.
     * @param topicReference The value for topicReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topicReference")
    public final Builder topicReference(java.util.Optional<? extends com.fhir.Reference> topicReference) {
      checkNotIsSet(topicReferenceIsSet(), "topicReference");
      this.topicReference = topicReference.orElse(null);
      optBits |= OPT_BIT_TOPIC_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#id() id} to id.
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
     * Initializes the optional value {@link Contract#id() id} to id.
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
     * Initializes the optional value {@link Contract#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract#term() term} to term.
     * @param term The value for term
     * @return {@code this} builder for chained invocation
     */
    public final Builder term(java.util.List<com.fhir.Contract_Term> term) {
      checkNotIsSet(termIsSet(), "term");
      this.term = java.util.Objects.requireNonNull(term, "term");
      optBits |= OPT_BIT_TERM;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#term() term} to term.
     * @param term The value for term
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("term")
    public final Builder term(java.util.Optional<? extends java.util.List<com.fhir.Contract_Term>> term) {
      checkNotIsSet(termIsSet(), "term");
      this.term = term.orElse(null);
      optBits |= OPT_BIT_TERM;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingInfo(java.util.List<com.fhir.Reference> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = java.util.Objects.requireNonNull(supportingInfo, "supportingInfo");
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supportingInfo")
    public final Builder supportingInfo(java.util.Optional<? extends java.util.List<com.fhir.Reference>> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = supportingInfo.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for chained invocation
     */
    public final Builder relevantHistory(java.util.List<com.fhir.Reference> relevantHistory) {
      checkNotIsSet(relevantHistoryIsSet(), "relevantHistory");
      this.relevantHistory = java.util.Objects.requireNonNull(relevantHistory, "relevantHistory");
      optBits |= OPT_BIT_RELEVANT_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relevantHistory")
    public final Builder relevantHistory(java.util.Optional<? extends java.util.List<com.fhir.Reference>> relevantHistory) {
      checkNotIsSet(relevantHistoryIsSet(), "relevantHistory");
      this.relevantHistory = relevantHistory.orElse(null);
      optBits |= OPT_BIT_RELEVANT_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#contained() contained} to contained.
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
     * Initializes the optional value {@link Contract#contained() contained} to contained.
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
     * Initializes the optional value {@link Contract#legal() legal} to legal.
     * @param legal The value for legal
     * @return {@code this} builder for chained invocation
     */
    public final Builder legal(java.util.List<com.fhir.Contract_Legal> legal) {
      checkNotIsSet(legalIsSet(), "legal");
      this.legal = java.util.Objects.requireNonNull(legal, "legal");
      optBits |= OPT_BIT_LEGAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#legal() legal} to legal.
     * @param legal The value for legal
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("legal")
    public final Builder legal(java.util.Optional<? extends java.util.List<com.fhir.Contract_Legal>> legal) {
      checkNotIsSet(legalIsSet(), "legal");
      this.legal = legal.orElse(null);
      optBits |= OPT_BIT_LEGAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#contentDefinition() contentDefinition} to contentDefinition.
     * @param contentDefinition The value for contentDefinition
     * @return {@code this} builder for chained invocation
     */
    public final Builder contentDefinition(com.fhir.Contract_ContentDefinition contentDefinition) {
      checkNotIsSet(contentDefinitionIsSet(), "contentDefinition");
      this.contentDefinition = java.util.Objects.requireNonNull(contentDefinition, "contentDefinition");
      optBits |= OPT_BIT_CONTENT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#contentDefinition() contentDefinition} to contentDefinition.
     * @param contentDefinition The value for contentDefinition
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contentDefinition")
    public final Builder contentDefinition(java.util.Optional<? extends com.fhir.Contract_ContentDefinition> contentDefinition) {
      checkNotIsSet(contentDefinitionIsSet(), "contentDefinition");
      this.contentDefinition = contentDefinition.orElse(null);
      optBits |= OPT_BIT_CONTENT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    public final Builder author(com.fhir.Reference author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = java.util.Objects.requireNonNull(author, "author");
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public final Builder author(java.util.Optional<? extends com.fhir.Reference> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = author.orElse(null);
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#language() language} to language.
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
     * Initializes the optional value {@link Contract#language() language} to language.
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
     * Initializes the optional value {@link Contract#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for chained invocation
     */
    public final Builder issued(com.fhir.dateTime issued) {
      checkNotIsSet(issuedIsSet(), "issued");
      this.issued = java.util.Objects.requireNonNull(issued, "issued");
      optBits |= OPT_BIT_ISSUED;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("issued")
    public final Builder issued(java.util.Optional<? extends com.fhir.dateTime> issued) {
      checkNotIsSet(issuedIsSet(), "issued");
      this.issued = issued.orElse(null);
      optBits |= OPT_BIT_ISSUED;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesUri(com.fhir.uri instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = java.util.Objects.requireNonNull(instantiatesUri, "instantiatesUri");
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
    public final Builder instantiatesUri(java.util.Optional<? extends com.fhir.uri> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = instantiatesUri.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#contentDerivative() contentDerivative} to contentDerivative.
     * @param contentDerivative The value for contentDerivative
     * @return {@code this} builder for chained invocation
     */
    public final Builder contentDerivative(com.fhir.CodeableConcept contentDerivative) {
      checkNotIsSet(contentDerivativeIsSet(), "contentDerivative");
      this.contentDerivative = java.util.Objects.requireNonNull(contentDerivative, "contentDerivative");
      optBits |= OPT_BIT_CONTENT_DERIVATIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#contentDerivative() contentDerivative} to contentDerivative.
     * @param contentDerivative The value for contentDerivative
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contentDerivative")
    public final Builder contentDerivative(java.util.Optional<? extends com.fhir.CodeableConcept> contentDerivative) {
      checkNotIsSet(contentDerivativeIsSet(), "contentDerivative");
      this.contentDerivative = contentDerivative.orElse(null);
      optBits |= OPT_BIT_CONTENT_DERIVATIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    public final Builder subject(java.util.List<com.fhir.Reference> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = java.util.Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public final Builder subject(java.util.Optional<? extends java.util.List<com.fhir.Reference>> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for chained invocation
     */
    public final Builder alias(java.util.List<java.lang.String> alias) {
      checkNotIsSet(aliasIsSet(), "alias");
      this.alias = java.util.Objects.requireNonNull(alias, "alias");
      optBits |= OPT_BIT_ALIAS;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    public final Builder alias(java.util.Optional<? extends java.util.List<java.lang.String>> alias) {
      checkNotIsSet(aliasIsSet(), "alias");
      this.alias = alias.orElse(null);
      optBits |= OPT_BIT_ALIAS;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#url() url} to url.
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
     * Initializes the optional value {@link Contract#url() url} to url.
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
     * Initializes the optional value {@link Contract#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.code status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.code> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Builds a new {@link Contract Contract}.
     * @return An immutable instance of Contract
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Contract build() {
      checkRequiredAttributes();
      return new ImmutableContract(
          scope,
          resourceType,
          modifierExtension,
          title,
          name,
          rule,
          signer,
          friendly,
          authority,
          topicCodeableConcept,
          expirationType,
          instantiatesCanonical,
          type,
          text,
          legallyBindingAttachment,
          identifier,
          subType,
          applies,
          domain,
          version,
          site,
          legalState,
          legallyBindingReference,
          implicitRules,
          subtitle,
          meta,
          topicReference,
          id,
          extension,
          term,
          supportingInfo,
          relevantHistory,
          contained,
          legal,
          contentDefinition,
          author,
          language,
          issued,
          instantiatesUri,
          contentDerivative,
          subject,
          alias,
          url,
          status);
    }

    private boolean scopeIsSet() {
      return (optBits & OPT_BIT_SCOPE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean ruleIsSet() {
      return (optBits & OPT_BIT_RULE) != 0;
    }

    private boolean signerIsSet() {
      return (optBits & OPT_BIT_SIGNER) != 0;
    }

    private boolean friendlyIsSet() {
      return (optBits & OPT_BIT_FRIENDLY) != 0;
    }

    private boolean authorityIsSet() {
      return (optBits & OPT_BIT_AUTHORITY) != 0;
    }

    private boolean topicCodeableConceptIsSet() {
      return (optBits & OPT_BIT_TOPIC_CODEABLE_CONCEPT) != 0;
    }

    private boolean expirationTypeIsSet() {
      return (optBits & OPT_BIT_EXPIRATION_TYPE) != 0;
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean legallyBindingAttachmentIsSet() {
      return (optBits & OPT_BIT_LEGALLY_BINDING_ATTACHMENT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean subTypeIsSet() {
      return (optBits & OPT_BIT_SUB_TYPE) != 0;
    }

    private boolean appliesIsSet() {
      return (optBits & OPT_BIT_APPLIES) != 0;
    }

    private boolean domainIsSet() {
      return (optBits & OPT_BIT_DOMAIN) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean siteIsSet() {
      return (optBits & OPT_BIT_SITE) != 0;
    }

    private boolean legalStateIsSet() {
      return (optBits & OPT_BIT_LEGAL_STATE) != 0;
    }

    private boolean legallyBindingReferenceIsSet() {
      return (optBits & OPT_BIT_LEGALLY_BINDING_REFERENCE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean subtitleIsSet() {
      return (optBits & OPT_BIT_SUBTITLE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean topicReferenceIsSet() {
      return (optBits & OPT_BIT_TOPIC_REFERENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean termIsSet() {
      return (optBits & OPT_BIT_TERM) != 0;
    }

    private boolean supportingInfoIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFO) != 0;
    }

    private boolean relevantHistoryIsSet() {
      return (optBits & OPT_BIT_RELEVANT_HISTORY) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean legalIsSet() {
      return (optBits & OPT_BIT_LEGAL) != 0;
    }

    private boolean contentDefinitionIsSet() {
      return (optBits & OPT_BIT_CONTENT_DEFINITION) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean issuedIsSet() {
      return (optBits & OPT_BIT_ISSUED) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean contentDerivativeIsSet() {
      return (optBits & OPT_BIT_CONTENT_DERIVATIVE) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean aliasIsSet() {
      return (optBits & OPT_BIT_ALIAS) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Contract is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Contract, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Contract", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Contract#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Contract", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Contract#scope() scope} to scope.
     * @param scope The value for scope
     * @return {@code this} builder for chained invocation
     */
    BuildFinal scope(com.fhir.CodeableConcept scope);

    /**
     * Initializes the optional value {@link Contract#scope() scope} to scope.
     * @param scope The value for scope
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal scope(java.util.Optional<? extends com.fhir.CodeableConcept> scope);

    /**
     * Initializes the optional value {@link Contract#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Contract#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Contract#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link Contract#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link Contract#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link Contract#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link Contract#rule() rule} to rule.
     * @param rule The value for rule
     * @return {@code this} builder for chained invocation
     */
    BuildFinal rule(java.util.List<com.fhir.Contract_Rule> rule);

    /**
     * Initializes the optional value {@link Contract#rule() rule} to rule.
     * @param rule The value for rule
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal rule(java.util.Optional<? extends java.util.List<com.fhir.Contract_Rule>> rule);

    /**
     * Initializes the optional value {@link Contract#signer() signer} to signer.
     * @param signer The value for signer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal signer(java.util.List<com.fhir.Contract_Signer> signer);

    /**
     * Initializes the optional value {@link Contract#signer() signer} to signer.
     * @param signer The value for signer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal signer(java.util.Optional<? extends java.util.List<com.fhir.Contract_Signer>> signer);

    /**
     * Initializes the optional value {@link Contract#friendly() friendly} to friendly.
     * @param friendly The value for friendly
     * @return {@code this} builder for chained invocation
     */
    BuildFinal friendly(java.util.List<com.fhir.Contract_Friendly> friendly);

    /**
     * Initializes the optional value {@link Contract#friendly() friendly} to friendly.
     * @param friendly The value for friendly
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal friendly(java.util.Optional<? extends java.util.List<com.fhir.Contract_Friendly>> friendly);

    /**
     * Initializes the optional value {@link Contract#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authority(java.util.List<com.fhir.Reference> authority);

    /**
     * Initializes the optional value {@link Contract#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authority(java.util.Optional<? extends java.util.List<com.fhir.Reference>> authority);

    /**
     * Initializes the optional value {@link Contract#topicCodeableConcept() topicCodeableConcept} to topicCodeableConcept.
     * @param topicCodeableConcept The value for topicCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topicCodeableConcept(com.fhir.CodeableConcept topicCodeableConcept);

    /**
     * Initializes the optional value {@link Contract#topicCodeableConcept() topicCodeableConcept} to topicCodeableConcept.
     * @param topicCodeableConcept The value for topicCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topicCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> topicCodeableConcept);

    /**
     * Initializes the optional value {@link Contract#expirationType() expirationType} to expirationType.
     * @param expirationType The value for expirationType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal expirationType(com.fhir.CodeableConcept expirationType);

    /**
     * Initializes the optional value {@link Contract#expirationType() expirationType} to expirationType.
     * @param expirationType The value for expirationType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal expirationType(java.util.Optional<? extends com.fhir.CodeableConcept> expirationType);

    /**
     * Initializes the optional value {@link Contract#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesCanonical(com.fhir.Reference instantiatesCanonical);

    /**
     * Initializes the optional value {@link Contract#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesCanonical(java.util.Optional<? extends com.fhir.Reference> instantiatesCanonical);

    /**
     * Initializes the optional value {@link Contract#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);

    /**
     * Initializes the optional value {@link Contract#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link Contract#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Contract#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Contract#legallyBindingAttachment() legallyBindingAttachment} to legallyBindingAttachment.
     * @param legallyBindingAttachment The value for legallyBindingAttachment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal legallyBindingAttachment(com.fhir.Attachment legallyBindingAttachment);

    /**
     * Initializes the optional value {@link Contract#legallyBindingAttachment() legallyBindingAttachment} to legallyBindingAttachment.
     * @param legallyBindingAttachment The value for legallyBindingAttachment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal legallyBindingAttachment(java.util.Optional<? extends com.fhir.Attachment> legallyBindingAttachment);

    /**
     * Initializes the optional value {@link Contract#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Contract#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Contract#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subType(java.util.List<com.fhir.CodeableConcept> subType);

    /**
     * Initializes the optional value {@link Contract#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> subType);

    /**
     * Initializes the optional value {@link Contract#applies() applies} to applies.
     * @param applies The value for applies
     * @return {@code this} builder for chained invocation
     */
    BuildFinal applies(com.fhir.Period applies);

    /**
     * Initializes the optional value {@link Contract#applies() applies} to applies.
     * @param applies The value for applies
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal applies(java.util.Optional<? extends com.fhir.Period> applies);

    /**
     * Initializes the optional value {@link Contract#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for chained invocation
     */
    BuildFinal domain(java.util.List<com.fhir.Reference> domain);

    /**
     * Initializes the optional value {@link Contract#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal domain(java.util.Optional<? extends java.util.List<com.fhir.Reference>> domain);

    /**
     * Initializes the optional value {@link Contract#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link Contract#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link Contract#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for chained invocation
     */
    BuildFinal site(java.util.List<com.fhir.Reference> site);

    /**
     * Initializes the optional value {@link Contract#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal site(java.util.Optional<? extends java.util.List<com.fhir.Reference>> site);

    /**
     * Initializes the optional value {@link Contract#legalState() legalState} to legalState.
     * @param legalState The value for legalState
     * @return {@code this} builder for chained invocation
     */
    BuildFinal legalState(com.fhir.CodeableConcept legalState);

    /**
     * Initializes the optional value {@link Contract#legalState() legalState} to legalState.
     * @param legalState The value for legalState
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal legalState(java.util.Optional<? extends com.fhir.CodeableConcept> legalState);

    /**
     * Initializes the optional value {@link Contract#legallyBindingReference() legallyBindingReference} to legallyBindingReference.
     * @param legallyBindingReference The value for legallyBindingReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal legallyBindingReference(com.fhir.Reference legallyBindingReference);

    /**
     * Initializes the optional value {@link Contract#legallyBindingReference() legallyBindingReference} to legallyBindingReference.
     * @param legallyBindingReference The value for legallyBindingReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal legallyBindingReference(java.util.Optional<? extends com.fhir.Reference> legallyBindingReference);

    /**
     * Initializes the optional value {@link Contract#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Contract#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Contract#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subtitle(java.lang.String subtitle);

    /**
     * Initializes the optional value {@link Contract#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subtitle(java.util.Optional<java.lang.String> subtitle);

    /**
     * Initializes the optional value {@link Contract#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Contract#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Contract#topicReference() topicReference} to topicReference.
     * @param topicReference The value for topicReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topicReference(com.fhir.Reference topicReference);

    /**
     * Initializes the optional value {@link Contract#topicReference() topicReference} to topicReference.
     * @param topicReference The value for topicReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topicReference(java.util.Optional<? extends com.fhir.Reference> topicReference);

    /**
     * Initializes the optional value {@link Contract#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Contract#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Contract#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Contract#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Contract#term() term} to term.
     * @param term The value for term
     * @return {@code this} builder for chained invocation
     */
    BuildFinal term(java.util.List<com.fhir.Contract_Term> term);

    /**
     * Initializes the optional value {@link Contract#term() term} to term.
     * @param term The value for term
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal term(java.util.Optional<? extends java.util.List<com.fhir.Contract_Term>> term);

    /**
     * Initializes the optional value {@link Contract#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInfo(java.util.List<com.fhir.Reference> supportingInfo);

    /**
     * Initializes the optional value {@link Contract#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInfo(java.util.Optional<? extends java.util.List<com.fhir.Reference>> supportingInfo);

    /**
     * Initializes the optional value {@link Contract#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relevantHistory(java.util.List<com.fhir.Reference> relevantHistory);

    /**
     * Initializes the optional value {@link Contract#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relevantHistory(java.util.Optional<? extends java.util.List<com.fhir.Reference>> relevantHistory);

    /**
     * Initializes the optional value {@link Contract#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Contract#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Contract#legal() legal} to legal.
     * @param legal The value for legal
     * @return {@code this} builder for chained invocation
     */
    BuildFinal legal(java.util.List<com.fhir.Contract_Legal> legal);

    /**
     * Initializes the optional value {@link Contract#legal() legal} to legal.
     * @param legal The value for legal
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal legal(java.util.Optional<? extends java.util.List<com.fhir.Contract_Legal>> legal);

    /**
     * Initializes the optional value {@link Contract#contentDefinition() contentDefinition} to contentDefinition.
     * @param contentDefinition The value for contentDefinition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contentDefinition(com.fhir.Contract_ContentDefinition contentDefinition);

    /**
     * Initializes the optional value {@link Contract#contentDefinition() contentDefinition} to contentDefinition.
     * @param contentDefinition The value for contentDefinition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contentDefinition(java.util.Optional<? extends com.fhir.Contract_ContentDefinition> contentDefinition);

    /**
     * Initializes the optional value {@link Contract#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(com.fhir.Reference author);

    /**
     * Initializes the optional value {@link Contract#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(java.util.Optional<? extends com.fhir.Reference> author);

    /**
     * Initializes the optional value {@link Contract#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Contract#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Contract#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for chained invocation
     */
    BuildFinal issued(com.fhir.dateTime issued);

    /**
     * Initializes the optional value {@link Contract#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal issued(java.util.Optional<? extends com.fhir.dateTime> issued);

    /**
     * Initializes the optional value {@link Contract#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesUri(com.fhir.uri instantiatesUri);

    /**
     * Initializes the optional value {@link Contract#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesUri(java.util.Optional<? extends com.fhir.uri> instantiatesUri);

    /**
     * Initializes the optional value {@link Contract#contentDerivative() contentDerivative} to contentDerivative.
     * @param contentDerivative The value for contentDerivative
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contentDerivative(com.fhir.CodeableConcept contentDerivative);

    /**
     * Initializes the optional value {@link Contract#contentDerivative() contentDerivative} to contentDerivative.
     * @param contentDerivative The value for contentDerivative
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contentDerivative(java.util.Optional<? extends com.fhir.CodeableConcept> contentDerivative);

    /**
     * Initializes the optional value {@link Contract#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(java.util.List<com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link Contract#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends java.util.List<com.fhir.Reference>> subject);

    /**
     * Initializes the optional value {@link Contract#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for chained invocation
     */
    BuildFinal alias(java.util.List<java.lang.String> alias);

    /**
     * Initializes the optional value {@link Contract#alias() alias} to alias.
     * @param alias The value for alias
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal alias(java.util.Optional<? extends java.util.List<java.lang.String>> alias);

    /**
     * Initializes the optional value {@link Contract#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link Contract#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link Contract#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link Contract#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Builds a new {@link Contract Contract}.
     * @return An immutable instance of Contract
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Contract build();
  }
}
