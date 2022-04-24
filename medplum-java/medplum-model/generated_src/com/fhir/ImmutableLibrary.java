//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Library}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLibrary.builder()}.
 */
@org.immutables.value.Generated(from = "Library", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableLibrary implements com.fhir.Library {
  private final @javax.annotation.Nullable java.lang.Boolean experimental;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept subjectCodeableConcept;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ParameterDefinition> parameter;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable com.fhir.date lastReviewDate;
  private final @javax.annotation.Nullable com.fhir.LibraryStatus status;
  private final @javax.annotation.Nullable com.fhir.markdown purpose;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor;
  private final @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement> dataRequirement;
  private final @javax.annotation.Nullable com.fhir.Reference subjectReference;
  private final @javax.annotation.Nullable com.fhir.date approvalDate;
  private final @javax.annotation.Nullable java.lang.String usage;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.markdown copyright;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact;
  private final @javax.annotation.Nullable java.lang.String subtitle;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable com.fhir.Period effectivePeriod;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Attachment> content;

  private ImmutableLibrary(
      @javax.annotation.Nullable java.lang.Boolean experimental,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable com.fhir.code language,
      com.fhir.CodeableConcept type,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser,
      @javax.annotation.Nullable com.fhir.CodeableConcept subjectCodeableConcept,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable java.util.List<com.fhir.ParameterDefinition> parameter,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable com.fhir.date lastReviewDate,
      @javax.annotation.Nullable com.fhir.LibraryStatus status,
      @javax.annotation.Nullable com.fhir.markdown purpose,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor,
      @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement> dataRequirement,
      @javax.annotation.Nullable com.fhir.Reference subjectReference,
      @javax.annotation.Nullable com.fhir.date approvalDate,
      @javax.annotation.Nullable java.lang.String usage,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.markdown copyright,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact,
      @javax.annotation.Nullable java.lang.String subtitle,
      @javax.annotation.Nullable com.fhir.Meta meta,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable com.fhir.Period effectivePeriod,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable java.util.List<com.fhir.Attachment> content) {
    this.experimental = experimental;
    this.contact = contact;
    this.language = language;
    this.type = type;
    this.version = version;
    this.modifierExtension = modifierExtension;
    this.endorser = endorser;
    this.subjectCodeableConcept = subjectCodeableConcept;
    this.description = description;
    this.parameter = parameter;
    this.contained = contained;
    this.topic = topic;
    this.url = url;
    this.lastReviewDate = lastReviewDate;
    this.status = status;
    this.purpose = purpose;
    this.identifier = identifier;
    this.editor = editor;
    this.dataRequirement = dataRequirement;
    this.subjectReference = subjectReference;
    this.approvalDate = approvalDate;
    this.usage = usage;
    this.useContext = useContext;
    this.implicitRules = implicitRules;
    this.copyright = copyright;
    this.author = author;
    this.reviewer = reviewer;
    this.date = date;
    this.id = id;
    this.extension = extension;
    this.relatedArtifact = relatedArtifact;
    this.subtitle = subtitle;
    this.meta = meta;
    this.resourceType = resourceType;
    this.jurisdiction = jurisdiction;
    this.publisher = publisher;
    this.effectivePeriod = effectivePeriod;
    this.name = name;
    this.text = text;
    this.title = title;
    this.content = content;
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
   * @return The value of the {@code contact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contact")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() {
    return java.util.Optional.ofNullable(contact);
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public com.fhir.CodeableConcept type() {
    return type;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code endorser} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("endorser")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser() {
    return java.util.Optional.ofNullable(endorser);
  }

  /**
   * @return The value of the {@code subjectCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subjectCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> subjectCodeableConcept() {
    return java.util.Optional.ofNullable(subjectCodeableConcept);
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
   * @return The value of the {@code parameter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("parameter")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ParameterDefinition>> parameter() {
    return java.util.Optional.ofNullable(parameter);
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
   * @return The value of the {@code topic} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("topic")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic() {
    return java.util.Optional.ofNullable(topic);
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
   * @return The value of the {@code lastReviewDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("lastReviewDate")
  @Override
  public java.util.Optional<com.fhir.date> lastReviewDate() {
    return java.util.Optional.ofNullable(lastReviewDate);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.LibraryStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code editor} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("editor")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor() {
    return java.util.Optional.ofNullable(editor);
  }

  /**
   * @return The value of the {@code dataRequirement} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dataRequirement")
  @Override
  public java.util.Optional<java.util.List<com.fhir.DataRequirement>> dataRequirement() {
    return java.util.Optional.ofNullable(dataRequirement);
  }

  /**
   * @return The value of the {@code subjectReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subjectReference")
  @Override
  public java.util.Optional<com.fhir.Reference> subjectReference() {
    return java.util.Optional.ofNullable(subjectReference);
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
   * @return The value of the {@code usage} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("usage")
  @Override
  public java.util.Optional<java.lang.String> usage() {
    return java.util.Optional.ofNullable(usage);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code author} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("author")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> author() {
    return java.util.Optional.ofNullable(author);
  }

  /**
   * @return The value of the {@code reviewer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reviewer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer() {
    return java.util.Optional.ofNullable(reviewer);
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
   * @return The value of the {@code relatedArtifact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("relatedArtifact")
  @Override
  public java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact() {
    return java.util.Optional.ofNullable(relatedArtifact);
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
   * @return The value of the {@code publisher} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("publisher")
  @Override
  public java.util.Optional<java.lang.String> publisher() {
    return java.util.Optional.ofNullable(publisher);
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
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
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
   * @return The value of the {@code title} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  @Override
  public java.util.Optional<java.lang.String> title() {
    return java.util.Optional.ofNullable(title);
  }

  /**
   * @return The value of the {@code content} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("content")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Attachment>> content() {
    return java.util.Optional.ofNullable(content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withExperimental(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableLibrary(
        newValue,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withExperimental(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.experimental, value)) return this;
    return new ImmutableLibrary(
        value,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        newValue,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        value,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        newValue,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        value,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Library#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLibrary withType(com.fhir.CodeableConcept value) {
    if (this.type == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        newValue,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        newValue,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        value,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        newValue,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        value,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#endorser() endorser} attribute.
   * @param value The value for endorser
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withEndorser(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "endorser");
    if (this.endorser == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        newValue,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#endorser() endorser} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endorser
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withEndorser(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.endorser == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        value,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * @param value The value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withSubjectCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "subjectCodeableConcept");
    if (this.subjectCodeableConcept == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        newValue,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withSubjectCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.subjectCodeableConcept == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        value,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        newValue,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        value,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#parameter() parameter} attribute.
   * @param value The value for parameter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withParameter(java.util.List<com.fhir.ParameterDefinition> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ParameterDefinition> newValue = java.util.Objects.requireNonNull(value, "parameter");
    if (this.parameter == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        newValue,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#parameter() parameter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parameter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withParameter(java.util.Optional<? extends java.util.List<com.fhir.ParameterDefinition>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ParameterDefinition> value = optional.orElse(null);
    if (this.parameter == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        value,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        newValue,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        value,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#topic() topic} attribute.
   * @param value The value for topic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withTopic(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "topic");
    if (this.topic == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        newValue,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#topic() topic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withTopic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.topic == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        value,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        newValue,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        value,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#lastReviewDate() lastReviewDate} attribute.
   * @param value The value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withLastReviewDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "lastReviewDate");
    if (this.lastReviewDate == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        newValue,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#lastReviewDate() lastReviewDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withLastReviewDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.lastReviewDate == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        value,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withStatus(com.fhir.LibraryStatus value) {
    @javax.annotation.Nullable com.fhir.LibraryStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        newValue,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withStatus(java.util.Optional<? extends com.fhir.LibraryStatus> optional) {
    @javax.annotation.Nullable com.fhir.LibraryStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        value,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withPurpose(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        newValue,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withPurpose(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        value,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        newValue,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        value,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#editor() editor} attribute.
   * @param value The value for editor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withEditor(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "editor");
    if (this.editor == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        newValue,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#editor() editor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for editor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withEditor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.editor == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        value,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#dataRequirement() dataRequirement} attribute.
   * @param value The value for dataRequirement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withDataRequirement(java.util.List<com.fhir.DataRequirement> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement> newValue = java.util.Objects.requireNonNull(value, "dataRequirement");
    if (this.dataRequirement == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        newValue,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#dataRequirement() dataRequirement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dataRequirement
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withDataRequirement(java.util.Optional<? extends java.util.List<com.fhir.DataRequirement>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement> value = optional.orElse(null);
    if (this.dataRequirement == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        value,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#subjectReference() subjectReference} attribute.
   * @param value The value for subjectReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withSubjectReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subjectReference");
    if (this.subjectReference == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        newValue,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#subjectReference() subjectReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withSubjectReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subjectReference == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        value,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#approvalDate() approvalDate} attribute.
   * @param value The value for approvalDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withApprovalDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "approvalDate");
    if (this.approvalDate == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        newValue,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#approvalDate() approvalDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for approvalDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withApprovalDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.approvalDate == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        value,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#usage() usage} attribute.
   * @param value The value for usage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withUsage(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "usage");
    if (java.util.Objects.equals(this.usage, newValue)) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        newValue,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#usage() usage} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withUsage(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.usage, value)) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        value,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        newValue,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        value,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        newValue,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        value,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withCopyright(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        newValue,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withCopyright(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        value,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withAuthor(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        newValue,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withAuthor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        value,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#reviewer() reviewer} attribute.
   * @param value The value for reviewer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withReviewer(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "reviewer");
    if (this.reviewer == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        newValue,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#reviewer() reviewer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reviewer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withReviewer(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.reviewer == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        value,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        newValue,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        value,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        newValue,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        value,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        newValue,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        value,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#relatedArtifact() relatedArtifact} attribute.
   * @param value The value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withRelatedArtifact(java.util.List<com.fhir.RelatedArtifact> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> newValue = java.util.Objects.requireNonNull(value, "relatedArtifact");
    if (this.relatedArtifact == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        newValue,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#relatedArtifact() relatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withRelatedArtifact(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> value = optional.orElse(null);
    if (this.relatedArtifact == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        value,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#subtitle() subtitle} attribute.
   * @param value The value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withSubtitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "subtitle");
    if (java.util.Objects.equals(this.subtitle, newValue)) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        newValue,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#subtitle() subtitle} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withSubtitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.subtitle, value)) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        value,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        newValue,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        value,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Library#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLibrary withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        newValue,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        newValue,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        value,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        newValue,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        value,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withEffectivePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        newValue,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withEffectivePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        value,
        this.name,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        newValue,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        value,
        this.text,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        newValue,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        value,
        this.title,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        newValue,
        this.content);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        value,
        this.content);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Library#content() content} attribute.
   * @param value The value for content
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLibrary withContent(java.util.List<com.fhir.Attachment> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Attachment> newValue = java.util.Objects.requireNonNull(value, "content");
    if (this.content == newValue) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Library#content() content} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for content
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLibrary withContent(java.util.Optional<? extends java.util.List<com.fhir.Attachment>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Attachment> value = optional.orElse(null);
    if (this.content == value) return this;
    return new ImmutableLibrary(
        this.experimental,
        this.contact,
        this.language,
        this.type,
        this.version,
        this.modifierExtension,
        this.endorser,
        this.subjectCodeableConcept,
        this.description,
        this.parameter,
        this.contained,
        this.topic,
        this.url,
        this.lastReviewDate,
        this.status,
        this.purpose,
        this.identifier,
        this.editor,
        this.dataRequirement,
        this.subjectReference,
        this.approvalDate,
        this.usage,
        this.useContext,
        this.implicitRules,
        this.copyright,
        this.author,
        this.reviewer,
        this.date,
        this.id,
        this.extension,
        this.relatedArtifact,
        this.subtitle,
        this.meta,
        this.resourceType,
        this.jurisdiction,
        this.publisher,
        this.effectivePeriod,
        this.name,
        this.text,
        this.title,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLibrary} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLibrary
        && equalTo((ImmutableLibrary) another);
  }

  private boolean equalTo(ImmutableLibrary another) {
    return java.util.Objects.equals(experimental, another.experimental)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(language, another.language)
        && type.equals(another.type)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(endorser, another.endorser)
        && java.util.Objects.equals(subjectCodeableConcept, another.subjectCodeableConcept)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(parameter, another.parameter)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(topic, another.topic)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(lastReviewDate, another.lastReviewDate)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(purpose, another.purpose)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(editor, another.editor)
        && java.util.Objects.equals(dataRequirement, another.dataRequirement)
        && java.util.Objects.equals(subjectReference, another.subjectReference)
        && java.util.Objects.equals(approvalDate, another.approvalDate)
        && java.util.Objects.equals(usage, another.usage)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(copyright, another.copyright)
        && java.util.Objects.equals(author, another.author)
        && java.util.Objects.equals(reviewer, another.reviewer)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(relatedArtifact, another.relatedArtifact)
        && java.util.Objects.equals(subtitle, another.subtitle)
        && java.util.Objects.equals(meta, another.meta)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(effectivePeriod, another.effectivePeriod)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(content, another.content);
  }

  /**
   * Computes a hash code from attributes: {@code experimental}, {@code contact}, {@code language}, {@code type}, {@code version}, {@code modifierExtension}, {@code endorser}, {@code subjectCodeableConcept}, {@code description}, {@code parameter}, {@code contained}, {@code topic}, {@code url}, {@code lastReviewDate}, {@code status}, {@code purpose}, {@code identifier}, {@code editor}, {@code dataRequirement}, {@code subjectReference}, {@code approvalDate}, {@code usage}, {@code useContext}, {@code implicitRules}, {@code copyright}, {@code author}, {@code reviewer}, {@code date}, {@code id}, {@code extension}, {@code relatedArtifact}, {@code subtitle}, {@code meta}, {@code resourceType}, {@code jurisdiction}, {@code publisher}, {@code effectivePeriod}, {@code name}, {@code text}, {@code title}, {@code content}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(experimental);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(endorser);
    h += (h << 5) + java.util.Objects.hashCode(subjectCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(parameter);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(topic);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(lastReviewDate);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(purpose);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(editor);
    h += (h << 5) + java.util.Objects.hashCode(dataRequirement);
    h += (h << 5) + java.util.Objects.hashCode(subjectReference);
    h += (h << 5) + java.util.Objects.hashCode(approvalDate);
    h += (h << 5) + java.util.Objects.hashCode(usage);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(copyright);
    h += (h << 5) + java.util.Objects.hashCode(author);
    h += (h << 5) + java.util.Objects.hashCode(reviewer);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(relatedArtifact);
    h += (h << 5) + java.util.Objects.hashCode(subtitle);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(effectivePeriod);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(content);
    return h;
  }

  /**
   * Prints the immutable value {@code Library} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Library{");
    if (experimental != null) {
      builder.append("experimental=").append(experimental);
    }
    if (contact != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (language != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (builder.length() > 8) builder.append(", ");
    builder.append("type=").append(type);
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (endorser != null) {
      builder.append(", ");
      builder.append("endorser=").append(endorser);
    }
    if (subjectCodeableConcept != null) {
      builder.append(", ");
      builder.append("subjectCodeableConcept=").append(subjectCodeableConcept);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (parameter != null) {
      builder.append(", ");
      builder.append("parameter=").append(parameter);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (topic != null) {
      builder.append(", ");
      builder.append("topic=").append(topic);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (lastReviewDate != null) {
      builder.append(", ");
      builder.append("lastReviewDate=").append(lastReviewDate);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (purpose != null) {
      builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (editor != null) {
      builder.append(", ");
      builder.append("editor=").append(editor);
    }
    if (dataRequirement != null) {
      builder.append(", ");
      builder.append("dataRequirement=").append(dataRequirement);
    }
    if (subjectReference != null) {
      builder.append(", ");
      builder.append("subjectReference=").append(subjectReference);
    }
    if (approvalDate != null) {
      builder.append(", ");
      builder.append("approvalDate=").append(approvalDate);
    }
    if (usage != null) {
      builder.append(", ");
      builder.append("usage=").append(usage);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (author != null) {
      builder.append(", ");
      builder.append("author=").append(author);
    }
    if (reviewer != null) {
      builder.append(", ");
      builder.append("reviewer=").append(reviewer);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (relatedArtifact != null) {
      builder.append(", ");
      builder.append("relatedArtifact=").append(relatedArtifact);
    }
    if (subtitle != null) {
      builder.append(", ");
      builder.append("subtitle=").append(subtitle);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (effectivePeriod != null) {
      builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (content != null) {
      builder.append(", ");
      builder.append("content=").append(content);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Library", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Library {
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> experimental = java.util.Optional.empty();
    boolean experimentalIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept type;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser = java.util.Optional.empty();
    boolean endorserIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> subjectCodeableConcept = java.util.Optional.empty();
    boolean subjectCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ParameterDefinition>> parameter = java.util.Optional.empty();
    boolean parameterIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic = java.util.Optional.empty();
    boolean topicIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> lastReviewDate = java.util.Optional.empty();
    boolean lastReviewDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.LibraryStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> purpose = java.util.Optional.empty();
    boolean purposeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor = java.util.Optional.empty();
    boolean editorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.DataRequirement>> dataRequirement = java.util.Optional.empty();
    boolean dataRequirementIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subjectReference = java.util.Optional.empty();
    boolean subjectReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> approvalDate = java.util.Optional.empty();
    boolean approvalDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> usage = java.util.Optional.empty();
    boolean usageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> copyright = java.util.Optional.empty();
    boolean copyrightIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> author = java.util.Optional.empty();
    boolean authorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer = java.util.Optional.empty();
    boolean reviewerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact = java.util.Optional.empty();
    boolean relatedArtifactIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> subtitle = java.util.Optional.empty();
    boolean subtitleIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> effectivePeriod = java.util.Optional.empty();
    boolean effectivePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Attachment>> content = java.util.Optional.empty();
    boolean contentIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("experimental")
    public void setExperimental(java.util.Optional<java.lang.Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(com.fhir.CodeableConcept type) {
      this.type = type;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("endorser")
    public void setEndorser(java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser) {
      this.endorser = endorser;
      this.endorserIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subjectCodeableConcept")
    public void setSubjectCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> subjectCodeableConcept) {
      this.subjectCodeableConcept = subjectCodeableConcept;
      this.subjectCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("parameter")
    public void setParameter(java.util.Optional<java.util.List<com.fhir.ParameterDefinition>> parameter) {
      this.parameter = parameter;
      this.parameterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("topic")
    public void setTopic(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic) {
      this.topic = topic;
      this.topicIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lastReviewDate")
    public void setLastReviewDate(java.util.Optional<com.fhir.date> lastReviewDate) {
      this.lastReviewDate = lastReviewDate;
      this.lastReviewDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.LibraryStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    public void setPurpose(java.util.Optional<com.fhir.markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("editor")
    public void setEditor(java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor) {
      this.editor = editor;
      this.editorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dataRequirement")
    public void setDataRequirement(java.util.Optional<java.util.List<com.fhir.DataRequirement>> dataRequirement) {
      this.dataRequirement = dataRequirement;
      this.dataRequirementIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subjectReference")
    public void setSubjectReference(java.util.Optional<com.fhir.Reference> subjectReference) {
      this.subjectReference = subjectReference;
      this.subjectReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("approvalDate")
    public void setApprovalDate(java.util.Optional<com.fhir.date> approvalDate) {
      this.approvalDate = approvalDate;
      this.approvalDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    public void setUsage(java.util.Optional<java.lang.String> usage) {
      this.usage = usage;
      this.usageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public void setUseContext(java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("copyright")
    public void setCopyright(java.util.Optional<com.fhir.markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public void setAuthor(java.util.Optional<java.util.List<com.fhir.ContactDetail>> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reviewer")
    public void setReviewer(java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer) {
      this.reviewer = reviewer;
      this.reviewerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("relatedArtifact")
    public void setRelatedArtifact(java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact) {
      this.relatedArtifact = relatedArtifact;
      this.relatedArtifactIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public void setPublisher(java.util.Optional<java.lang.String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
    public void setEffectivePeriod(java.util.Optional<com.fhir.Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    public void setContent(java.util.Optional<java.util.List<com.fhir.Attachment>> content) {
      this.content = content;
      this.contentIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> subjectCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ParameterDefinition>> parameter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> lastReviewDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.LibraryStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.DataRequirement>> dataRequirement() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subjectReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> approvalDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> usage() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> author() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> subtitle() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Attachment>> content() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableLibrary fromJson(Json json) {
    ImmutableLibrary.Builder builder = ((ImmutableLibrary.Builder) ImmutableLibrary.builder());
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.endorserIsSet) {
      builder.endorser(json.endorser);
    }
    if (json.subjectCodeableConceptIsSet) {
      builder.subjectCodeableConcept(json.subjectCodeableConcept);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.parameterIsSet) {
      builder.parameter(json.parameter);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.topicIsSet) {
      builder.topic(json.topic);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.lastReviewDateIsSet) {
      builder.lastReviewDate(json.lastReviewDate);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.editorIsSet) {
      builder.editor(json.editor);
    }
    if (json.dataRequirementIsSet) {
      builder.dataRequirement(json.dataRequirement);
    }
    if (json.subjectReferenceIsSet) {
      builder.subjectReference(json.subjectReference);
    }
    if (json.approvalDateIsSet) {
      builder.approvalDate(json.approvalDate);
    }
    if (json.usageIsSet) {
      builder.usage(json.usage);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.reviewerIsSet) {
      builder.reviewer(json.reviewer);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.relatedArtifactIsSet) {
      builder.relatedArtifact(json.relatedArtifact);
    }
    if (json.subtitleIsSet) {
      builder.subtitle(json.subtitle);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.contentIsSet) {
      builder.content(json.content);
    }
    return (ImmutableLibrary) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Library} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Library instance
   */
  public static Library copyOf(Library instance) {
    if (instance instanceof ImmutableLibrary) {
      return (ImmutableLibrary) instance;
    }
    return ((ImmutableLibrary.Builder) ImmutableLibrary.builder())
        .experimental(instance.experimental())
        .contact(instance.contact())
        .language(instance.language())
        .type(instance.type())
        .version(instance.version())
        .modifierExtension(instance.modifierExtension())
        .endorser(instance.endorser())
        .subjectCodeableConcept(instance.subjectCodeableConcept())
        .description(instance.description())
        .parameter(instance.parameter())
        .contained(instance.contained())
        .topic(instance.topic())
        .url(instance.url())
        .lastReviewDate(instance.lastReviewDate())
        .status(instance.status())
        .purpose(instance.purpose())
        .identifier(instance.identifier())
        .editor(instance.editor())
        .dataRequirement(instance.dataRequirement())
        .subjectReference(instance.subjectReference())
        .approvalDate(instance.approvalDate())
        .usage(instance.usage())
        .useContext(instance.useContext())
        .implicitRules(instance.implicitRules())
        .copyright(instance.copyright())
        .author(instance.author())
        .reviewer(instance.reviewer())
        .date(instance.date())
        .id(instance.id())
        .extension(instance.extension())
        .relatedArtifact(instance.relatedArtifact())
        .subtitle(instance.subtitle())
        .meta(instance.meta())
        .resourceType(instance.resourceType())
        .jurisdiction(instance.jurisdiction())
        .publisher(instance.publisher())
        .effectivePeriod(instance.effectivePeriod())
        .name(instance.name())
        .text(instance.text())
        .title(instance.title())
        .content(instance.content())
        .build();
  }

  /**
   * Creates a builder for {@link Library Library}.
   * <pre>
   * ImmutableLibrary.builder()
   *    .experimental(Boolean) // optional {@link Library#experimental() experimental}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link Library#contact() contact}
   *    .language(com.fhir.code) // optional {@link Library#language() language}
   *    .type(com.fhir.CodeableConcept) // required {@link Library#type() type}
   *    .version(String) // optional {@link Library#version() version}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Library#modifierExtension() modifierExtension}
   *    .endorser(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link Library#endorser() endorser}
   *    .subjectCodeableConcept(com.fhir.CodeableConcept) // optional {@link Library#subjectCodeableConcept() subjectCodeableConcept}
   *    .description(com.fhir.markdown) // optional {@link Library#description() description}
   *    .parameter(List&amp;lt;com.fhir.ParameterDefinition&amp;gt;) // optional {@link Library#parameter() parameter}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Library#contained() contained}
   *    .topic(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Library#topic() topic}
   *    .url(com.fhir.uri) // optional {@link Library#url() url}
   *    .lastReviewDate(com.fhir.date) // optional {@link Library#lastReviewDate() lastReviewDate}
   *    .status(com.fhir.LibraryStatus) // optional {@link Library#status() status}
   *    .purpose(com.fhir.markdown) // optional {@link Library#purpose() purpose}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Library#identifier() identifier}
   *    .editor(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link Library#editor() editor}
   *    .dataRequirement(List&amp;lt;com.fhir.DataRequirement&amp;gt;) // optional {@link Library#dataRequirement() dataRequirement}
   *    .subjectReference(com.fhir.Reference) // optional {@link Library#subjectReference() subjectReference}
   *    .approvalDate(com.fhir.date) // optional {@link Library#approvalDate() approvalDate}
   *    .usage(String) // optional {@link Library#usage() usage}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link Library#useContext() useContext}
   *    .implicitRules(com.fhir.uri) // optional {@link Library#implicitRules() implicitRules}
   *    .copyright(com.fhir.markdown) // optional {@link Library#copyright() copyright}
   *    .author(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link Library#author() author}
   *    .reviewer(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link Library#reviewer() reviewer}
   *    .date(com.fhir.dateTime) // optional {@link Library#date() date}
   *    .id(com.fhir.id) // optional {@link Library#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Library#extension() extension}
   *    .relatedArtifact(List&amp;lt;com.fhir.RelatedArtifact&amp;gt;) // optional {@link Library#relatedArtifact() relatedArtifact}
   *    .subtitle(String) // optional {@link Library#subtitle() subtitle}
   *    .meta(com.fhir.Meta) // optional {@link Library#meta() meta}
   *    .resourceType(String) // required {@link Library#resourceType() resourceType}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Library#jurisdiction() jurisdiction}
   *    .publisher(String) // optional {@link Library#publisher() publisher}
   *    .effectivePeriod(com.fhir.Period) // optional {@link Library#effectivePeriod() effectivePeriod}
   *    .name(String) // optional {@link Library#name() name}
   *    .text(com.fhir.Narrative) // optional {@link Library#text() text}
   *    .title(String) // optional {@link Library#title() title}
   *    .content(List&amp;lt;com.fhir.Attachment&amp;gt;) // optional {@link Library#content() content}
   *    .build();
   * </pre>
   * @return A new Library builder
   */
  public static TypeBuildStage builder() {
    return new ImmutableLibrary.Builder();
  }

  /**
   * Builds instances of type {@link Library Library}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Library", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements TypeBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x1L;
    private static final long OPT_BIT_CONTACT = 0x2L;
    private static final long OPT_BIT_LANGUAGE = 0x4L;
    private static final long OPT_BIT_VERSION = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_ENDORSER = 0x20L;
    private static final long OPT_BIT_SUBJECT_CODEABLE_CONCEPT = 0x40L;
    private static final long OPT_BIT_DESCRIPTION = 0x80L;
    private static final long OPT_BIT_PARAMETER = 0x100L;
    private static final long OPT_BIT_CONTAINED = 0x200L;
    private static final long OPT_BIT_TOPIC = 0x400L;
    private static final long OPT_BIT_URL = 0x800L;
    private static final long OPT_BIT_LAST_REVIEW_DATE = 0x1000L;
    private static final long OPT_BIT_STATUS = 0x2000L;
    private static final long OPT_BIT_PURPOSE = 0x4000L;
    private static final long OPT_BIT_IDENTIFIER = 0x8000L;
    private static final long OPT_BIT_EDITOR = 0x10000L;
    private static final long OPT_BIT_DATA_REQUIREMENT = 0x20000L;
    private static final long OPT_BIT_SUBJECT_REFERENCE = 0x40000L;
    private static final long OPT_BIT_APPROVAL_DATE = 0x80000L;
    private static final long OPT_BIT_USAGE = 0x100000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x200000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x400000L;
    private static final long OPT_BIT_COPYRIGHT = 0x800000L;
    private static final long OPT_BIT_AUTHOR = 0x1000000L;
    private static final long OPT_BIT_REVIEWER = 0x2000000L;
    private static final long OPT_BIT_DATE = 0x4000000L;
    private static final long OPT_BIT_ID = 0x8000000L;
    private static final long OPT_BIT_EXTENSION = 0x10000000L;
    private static final long OPT_BIT_RELATED_ARTIFACT = 0x20000000L;
    private static final long OPT_BIT_SUBTITLE = 0x40000000L;
    private static final long OPT_BIT_META = 0x80000000L;
    private static final long OPT_BIT_JURISDICTION = 0x100000000L;
    private static final long OPT_BIT_PUBLISHER = 0x200000000L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x400000000L;
    private static final long OPT_BIT_NAME = 0x800000000L;
    private static final long OPT_BIT_TEXT = 0x1000000000L;
    private static final long OPT_BIT_TITLE = 0x2000000000L;
    private static final long OPT_BIT_CONTENT = 0x4000000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.Boolean experimental;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser;
    private @javax.annotation.Nullable com.fhir.CodeableConcept subjectCodeableConcept;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable java.util.List<com.fhir.ParameterDefinition> parameter;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable com.fhir.date lastReviewDate;
    private @javax.annotation.Nullable com.fhir.LibraryStatus status;
    private @javax.annotation.Nullable com.fhir.markdown purpose;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor;
    private @javax.annotation.Nullable java.util.List<com.fhir.DataRequirement> dataRequirement;
    private @javax.annotation.Nullable com.fhir.Reference subjectReference;
    private @javax.annotation.Nullable com.fhir.date approvalDate;
    private @javax.annotation.Nullable java.lang.String usage;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.markdown copyright;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact;
    private @javax.annotation.Nullable java.lang.String subtitle;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable com.fhir.Period effectivePeriod;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable java.util.List<com.fhir.Attachment> content;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Library#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link Library#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link Library#contact() contact} to contact.
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
     * Initializes the optional value {@link Library#contact() contact} to contact.
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
     * Initializes the optional value {@link Library#language() language} to language.
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
     * Initializes the optional value {@link Library#language() language} to language.
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
     * Initializes the value for the {@link Library#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(com.fhir.CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#version() version} to version.
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
     * Initializes the optional value {@link Library#version() version} to version.
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
     * Initializes the optional value {@link Library#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Library#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Library#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for chained invocation
     */
    public final Builder endorser(java.util.List<com.fhir.ContactDetail> endorser) {
      checkNotIsSet(endorserIsSet(), "endorser");
      this.endorser = java.util.Objects.requireNonNull(endorser, "endorser");
      optBits |= OPT_BIT_ENDORSER;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endorser")
    public final Builder endorser(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> endorser) {
      checkNotIsSet(endorserIsSet(), "endorser");
      this.endorser = endorser.orElse(null);
      optBits |= OPT_BIT_ENDORSER;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder subjectCodeableConcept(com.fhir.CodeableConcept subjectCodeableConcept) {
      checkNotIsSet(subjectCodeableConceptIsSet(), "subjectCodeableConcept");
      this.subjectCodeableConcept = java.util.Objects.requireNonNull(subjectCodeableConcept, "subjectCodeableConcept");
      optBits |= OPT_BIT_SUBJECT_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subjectCodeableConcept")
    public final Builder subjectCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> subjectCodeableConcept) {
      checkNotIsSet(subjectCodeableConceptIsSet(), "subjectCodeableConcept");
      this.subjectCodeableConcept = subjectCodeableConcept.orElse(null);
      optBits |= OPT_BIT_SUBJECT_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#description() description} to description.
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
     * Initializes the optional value {@link Library#description() description} to description.
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
     * Initializes the optional value {@link Library#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    public final Builder parameter(java.util.List<com.fhir.ParameterDefinition> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = java.util.Objects.requireNonNull(parameter, "parameter");
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parameter")
    public final Builder parameter(java.util.Optional<? extends java.util.List<com.fhir.ParameterDefinition>> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = parameter.orElse(null);
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#contained() contained} to contained.
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
     * Initializes the optional value {@link Library#contained() contained} to contained.
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
     * Initializes the optional value {@link Library#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for chained invocation
     */
    public final Builder topic(java.util.List<com.fhir.CodeableConcept> topic) {
      checkNotIsSet(topicIsSet(), "topic");
      this.topic = java.util.Objects.requireNonNull(topic, "topic");
      optBits |= OPT_BIT_TOPIC;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topic")
    public final Builder topic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> topic) {
      checkNotIsSet(topicIsSet(), "topic");
      this.topic = topic.orElse(null);
      optBits |= OPT_BIT_TOPIC;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#url() url} to url.
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
     * Initializes the optional value {@link Library#url() url} to url.
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
     * Initializes the optional value {@link Library#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link Library#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link Library#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.LibraryStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.LibraryStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link Library#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link Library#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Library#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Library#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for chained invocation
     */
    public final Builder editor(java.util.List<com.fhir.ContactDetail> editor) {
      checkNotIsSet(editorIsSet(), "editor");
      this.editor = java.util.Objects.requireNonNull(editor, "editor");
      optBits |= OPT_BIT_EDITOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("editor")
    public final Builder editor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> editor) {
      checkNotIsSet(editorIsSet(), "editor");
      this.editor = editor.orElse(null);
      optBits |= OPT_BIT_EDITOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#dataRequirement() dataRequirement} to dataRequirement.
     * @param dataRequirement The value for dataRequirement
     * @return {@code this} builder for chained invocation
     */
    public final Builder dataRequirement(java.util.List<com.fhir.DataRequirement> dataRequirement) {
      checkNotIsSet(dataRequirementIsSet(), "dataRequirement");
      this.dataRequirement = java.util.Objects.requireNonNull(dataRequirement, "dataRequirement");
      optBits |= OPT_BIT_DATA_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#dataRequirement() dataRequirement} to dataRequirement.
     * @param dataRequirement The value for dataRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataRequirement")
    public final Builder dataRequirement(java.util.Optional<? extends java.util.List<com.fhir.DataRequirement>> dataRequirement) {
      checkNotIsSet(dataRequirementIsSet(), "dataRequirement");
      this.dataRequirement = dataRequirement.orElse(null);
      optBits |= OPT_BIT_DATA_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder subjectReference(com.fhir.Reference subjectReference) {
      checkNotIsSet(subjectReferenceIsSet(), "subjectReference");
      this.subjectReference = java.util.Objects.requireNonNull(subjectReference, "subjectReference");
      optBits |= OPT_BIT_SUBJECT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subjectReference")
    public final Builder subjectReference(java.util.Optional<? extends com.fhir.Reference> subjectReference) {
      checkNotIsSet(subjectReferenceIsSet(), "subjectReference");
      this.subjectReference = subjectReference.orElse(null);
      optBits |= OPT_BIT_SUBJECT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link Library#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link Library#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for chained invocation
     */
    public final Builder usage(java.lang.String usage) {
      checkNotIsSet(usageIsSet(), "usage");
      this.usage = java.util.Objects.requireNonNull(usage, "usage");
      optBits |= OPT_BIT_USAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    public final Builder usage(java.util.Optional<java.lang.String> usage) {
      checkNotIsSet(usageIsSet(), "usage");
      this.usage = usage.orElse(null);
      optBits |= OPT_BIT_USAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link Library#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link Library#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Library#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Library#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link Library#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link Library#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    public final Builder author(java.util.List<com.fhir.ContactDetail> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = java.util.Objects.requireNonNull(author, "author");
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public final Builder author(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = author.orElse(null);
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for chained invocation
     */
    public final Builder reviewer(java.util.List<com.fhir.ContactDetail> reviewer) {
      checkNotIsSet(reviewerIsSet(), "reviewer");
      this.reviewer = java.util.Objects.requireNonNull(reviewer, "reviewer");
      optBits |= OPT_BIT_REVIEWER;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reviewer")
    public final Builder reviewer(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> reviewer) {
      checkNotIsSet(reviewerIsSet(), "reviewer");
      this.reviewer = reviewer.orElse(null);
      optBits |= OPT_BIT_REVIEWER;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#date() date} to date.
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
     * Initializes the optional value {@link Library#date() date} to date.
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
     * Initializes the optional value {@link Library#id() id} to id.
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
     * Initializes the optional value {@link Library#id() id} to id.
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
     * Initializes the optional value {@link Library#extension() extension} to extension.
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
     * Initializes the optional value {@link Library#extension() extension} to extension.
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
     * Initializes the optional value {@link Library#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for chained invocation
     */
    public final Builder relatedArtifact(java.util.List<com.fhir.RelatedArtifact> relatedArtifact) {
      checkNotIsSet(relatedArtifactIsSet(), "relatedArtifact");
      this.relatedArtifact = java.util.Objects.requireNonNull(relatedArtifact, "relatedArtifact");
      optBits |= OPT_BIT_RELATED_ARTIFACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relatedArtifact")
    public final Builder relatedArtifact(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> relatedArtifact) {
      checkNotIsSet(relatedArtifactIsSet(), "relatedArtifact");
      this.relatedArtifact = relatedArtifact.orElse(null);
      optBits |= OPT_BIT_RELATED_ARTIFACT;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link Library#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link Library#meta() meta} to meta.
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
     * Initializes the optional value {@link Library#meta() meta} to meta.
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
     * Initializes the value for the {@link Library#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Library#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link Library#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link Library#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link Library#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link Library#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link Library#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link Library#name() name} to name.
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
     * Initializes the optional value {@link Library#name() name} to name.
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
     * Initializes the optional value {@link Library#text() text} to text.
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
     * Initializes the optional value {@link Library#text() text} to text.
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
     * Initializes the optional value {@link Library#title() title} to title.
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
     * Initializes the optional value {@link Library#title() title} to title.
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
     * Initializes the optional value {@link Library#content() content} to content.
     * @param content The value for content
     * @return {@code this} builder for chained invocation
     */
    public final Builder content(java.util.List<com.fhir.Attachment> content) {
      checkNotIsSet(contentIsSet(), "content");
      this.content = java.util.Objects.requireNonNull(content, "content");
      optBits |= OPT_BIT_CONTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Library#content() content} to content.
     * @param content The value for content
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    public final Builder content(java.util.Optional<? extends java.util.List<com.fhir.Attachment>> content) {
      checkNotIsSet(contentIsSet(), "content");
      this.content = content.orElse(null);
      optBits |= OPT_BIT_CONTENT;
      return this;
    }

    /**
     * Builds a new {@link Library Library}.
     * @return An immutable instance of Library
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Library build() {
      checkRequiredAttributes();
      return new ImmutableLibrary(
          experimental,
          contact,
          language,
          type,
          version,
          modifierExtension,
          endorser,
          subjectCodeableConcept,
          description,
          parameter,
          contained,
          topic,
          url,
          lastReviewDate,
          status,
          purpose,
          identifier,
          editor,
          dataRequirement,
          subjectReference,
          approvalDate,
          usage,
          useContext,
          implicitRules,
          copyright,
          author,
          reviewer,
          date,
          id,
          extension,
          relatedArtifact,
          subtitle,
          meta,
          resourceType,
          jurisdiction,
          publisher,
          effectivePeriod,
          name,
          text,
          title,
          content);
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean endorserIsSet() {
      return (optBits & OPT_BIT_ENDORSER) != 0;
    }

    private boolean subjectCodeableConceptIsSet() {
      return (optBits & OPT_BIT_SUBJECT_CODEABLE_CONCEPT) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean parameterIsSet() {
      return (optBits & OPT_BIT_PARAMETER) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean topicIsSet() {
      return (optBits & OPT_BIT_TOPIC) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean lastReviewDateIsSet() {
      return (optBits & OPT_BIT_LAST_REVIEW_DATE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean editorIsSet() {
      return (optBits & OPT_BIT_EDITOR) != 0;
    }

    private boolean dataRequirementIsSet() {
      return (optBits & OPT_BIT_DATA_REQUIREMENT) != 0;
    }

    private boolean subjectReferenceIsSet() {
      return (optBits & OPT_BIT_SUBJECT_REFERENCE) != 0;
    }

    private boolean approvalDateIsSet() {
      return (optBits & OPT_BIT_APPROVAL_DATE) != 0;
    }

    private boolean usageIsSet() {
      return (optBits & OPT_BIT_USAGE) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean reviewerIsSet() {
      return (optBits & OPT_BIT_REVIEWER) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean relatedArtifactIsSet() {
      return (optBits & OPT_BIT_RELATED_ARTIFACT) != 0;
    }

    private boolean subtitleIsSet() {
      return (optBits & OPT_BIT_SUBTITLE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean contentIsSet() {
      return (optBits & OPT_BIT_CONTENT) != 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Library is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!typeIsSet()) attributes.add("type");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Library, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Library", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link Library#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage type(com.fhir.CodeableConcept type);
  }

  @org.immutables.value.Generated(from = "Library", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Library#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Library", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Library#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link Library#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(java.util.Optional<java.lang.Boolean> experimental);

    /**
     * Initializes the optional value {@link Library#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link Library#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link Library#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Library#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Library#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link Library#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link Library#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Library#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Library#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endorser(java.util.List<com.fhir.ContactDetail> endorser);

    /**
     * Initializes the optional value {@link Library#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endorser(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> endorser);

    /**
     * Initializes the optional value {@link Library#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subjectCodeableConcept(com.fhir.CodeableConcept subjectCodeableConcept);

    /**
     * Initializes the optional value {@link Library#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subjectCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> subjectCodeableConcept);

    /**
     * Initializes the optional value {@link Library#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link Library#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link Library#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parameter(java.util.List<com.fhir.ParameterDefinition> parameter);

    /**
     * Initializes the optional value {@link Library#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parameter(java.util.Optional<? extends java.util.List<com.fhir.ParameterDefinition>> parameter);

    /**
     * Initializes the optional value {@link Library#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Library#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Library#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topic(java.util.List<com.fhir.CodeableConcept> topic);

    /**
     * Initializes the optional value {@link Library#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> topic);

    /**
     * Initializes the optional value {@link Library#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link Library#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link Library#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastReviewDate(com.fhir.date lastReviewDate);

    /**
     * Initializes the optional value {@link Library#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastReviewDate(java.util.Optional<? extends com.fhir.date> lastReviewDate);

    /**
     * Initializes the optional value {@link Library#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.LibraryStatus status);

    /**
     * Initializes the optional value {@link Library#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.LibraryStatus> status);

    /**
     * Initializes the optional value {@link Library#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(com.fhir.markdown purpose);

    /**
     * Initializes the optional value {@link Library#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(java.util.Optional<? extends com.fhir.markdown> purpose);

    /**
     * Initializes the optional value {@link Library#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Library#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Library#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal editor(java.util.List<com.fhir.ContactDetail> editor);

    /**
     * Initializes the optional value {@link Library#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal editor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> editor);

    /**
     * Initializes the optional value {@link Library#dataRequirement() dataRequirement} to dataRequirement.
     * @param dataRequirement The value for dataRequirement
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dataRequirement(java.util.List<com.fhir.DataRequirement> dataRequirement);

    /**
     * Initializes the optional value {@link Library#dataRequirement() dataRequirement} to dataRequirement.
     * @param dataRequirement The value for dataRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dataRequirement(java.util.Optional<? extends java.util.List<com.fhir.DataRequirement>> dataRequirement);

    /**
     * Initializes the optional value {@link Library#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subjectReference(com.fhir.Reference subjectReference);

    /**
     * Initializes the optional value {@link Library#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subjectReference(java.util.Optional<? extends com.fhir.Reference> subjectReference);

    /**
     * Initializes the optional value {@link Library#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal approvalDate(com.fhir.date approvalDate);

    /**
     * Initializes the optional value {@link Library#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal approvalDate(java.util.Optional<? extends com.fhir.date> approvalDate);

    /**
     * Initializes the optional value {@link Library#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal usage(java.lang.String usage);

    /**
     * Initializes the optional value {@link Library#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal usage(java.util.Optional<java.lang.String> usage);

    /**
     * Initializes the optional value {@link Library#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link Library#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link Library#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Library#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Library#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(com.fhir.markdown copyright);

    /**
     * Initializes the optional value {@link Library#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(java.util.Optional<? extends com.fhir.markdown> copyright);

    /**
     * Initializes the optional value {@link Library#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(java.util.List<com.fhir.ContactDetail> author);

    /**
     * Initializes the optional value {@link Library#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> author);

    /**
     * Initializes the optional value {@link Library#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reviewer(java.util.List<com.fhir.ContactDetail> reviewer);

    /**
     * Initializes the optional value {@link Library#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reviewer(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> reviewer);

    /**
     * Initializes the optional value {@link Library#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link Library#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link Library#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Library#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Library#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Library#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Library#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatedArtifact(java.util.List<com.fhir.RelatedArtifact> relatedArtifact);

    /**
     * Initializes the optional value {@link Library#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatedArtifact(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> relatedArtifact);

    /**
     * Initializes the optional value {@link Library#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subtitle(java.lang.String subtitle);

    /**
     * Initializes the optional value {@link Library#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subtitle(java.util.Optional<java.lang.String> subtitle);

    /**
     * Initializes the optional value {@link Library#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Library#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Library#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link Library#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link Library#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link Library#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link Library#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(com.fhir.Period effectivePeriod);

    /**
     * Initializes the optional value {@link Library#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(java.util.Optional<? extends com.fhir.Period> effectivePeriod);

    /**
     * Initializes the optional value {@link Library#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link Library#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link Library#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Library#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Library#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link Library#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link Library#content() content} to content.
     * @param content The value for content
     * @return {@code this} builder for chained invocation
     */
    BuildFinal content(java.util.List<com.fhir.Attachment> content);

    /**
     * Initializes the optional value {@link Library#content() content} to content.
     * @param content The value for content
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal content(java.util.Optional<? extends java.util.List<com.fhir.Attachment>> content);

    /**
     * Builds a new {@link Library Library}.
     * @return An immutable instance of Library
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Library build();
  }
}
