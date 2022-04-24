//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ResearchDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableResearchDefinition.builder()}.
 */
@org.immutables.value.Generated(from = "ResearchDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableResearchDefinition implements com.fhir.ResearchDefinition {
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact;
  private final @javax.annotation.Nullable com.fhir.Reference outcome;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.Reference subjectReference;
  private final @javax.annotation.Nullable com.fhir.date lastReviewDate;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable java.lang.String usage;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic;
  private final @javax.annotation.Nullable java.util.List<java.lang.String> comment;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable com.fhir.ResearchdefinitionStatus status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor;
  private final @javax.annotation.Nullable java.lang.String subtitle;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept subjectCodeableConcept;
  private final com.fhir.Reference population;
  private final @javax.annotation.Nullable com.fhir.date approvalDate;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable com.fhir.markdown purpose;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> library;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.markdown copyright;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable com.fhir.Reference exposure;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Period effectivePeriod;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable com.fhir.Reference exposureAlternative;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.lang.String shortTitle;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable java.lang.Boolean experimental;
  private final @javax.annotation.Nullable com.fhir.dateTime date;

  private ImmutableResearchDefinition(
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact,
      @javax.annotation.Nullable com.fhir.Reference outcome,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.Reference subjectReference,
      @javax.annotation.Nullable com.fhir.date lastReviewDate,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable java.lang.String usage,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic,
      @javax.annotation.Nullable java.util.List<java.lang.String> comment,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable com.fhir.ResearchdefinitionStatus status,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor,
      @javax.annotation.Nullable java.lang.String subtitle,
      @javax.annotation.Nullable com.fhir.CodeableConcept subjectCodeableConcept,
      com.fhir.Reference population,
      @javax.annotation.Nullable com.fhir.date approvalDate,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable com.fhir.markdown purpose,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> library,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.markdown copyright,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable com.fhir.Reference exposure,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Period effectivePeriod,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable com.fhir.Reference exposureAlternative,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.lang.String shortTitle,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable java.lang.Boolean experimental,
      @javax.annotation.Nullable com.fhir.dateTime date) {
    this.implicitRules = implicitRules;
    this.description = description;
    this.title = title;
    this.extension = extension;
    this.relatedArtifact = relatedArtifact;
    this.outcome = outcome;
    this.text = text;
    this.subjectReference = subjectReference;
    this.lastReviewDate = lastReviewDate;
    this.contained = contained;
    this.contact = contact;
    this.usage = usage;
    this.language = language;
    this.topic = topic;
    this.comment = comment;
    this.meta = meta;
    this.url = url;
    this.status = status;
    this.editor = editor;
    this.subtitle = subtitle;
    this.subjectCodeableConcept = subjectCodeableConcept;
    this.population = population;
    this.approvalDate = approvalDate;
    this.jurisdiction = jurisdiction;
    this.purpose = purpose;
    this.library = library;
    this.modifierExtension = modifierExtension;
    this.copyright = copyright;
    this.publisher = publisher;
    this.exposure = exposure;
    this.resourceType = resourceType;
    this.effectivePeriod = effectivePeriod;
    this.version = version;
    this.exposureAlternative = exposureAlternative;
    this.useContext = useContext;
    this.id = id;
    this.shortTitle = shortTitle;
    this.endorser = endorser;
    this.author = author;
    this.identifier = identifier;
    this.reviewer = reviewer;
    this.name = name;
    this.experimental = experimental;
    this.date = date;
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<com.fhir.markdown> description() {
    return java.util.Optional.ofNullable(description);
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
   * @return The value of the {@code outcome} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("outcome")
  @Override
  public java.util.Optional<com.fhir.Reference> outcome() {
    return java.util.Optional.ofNullable(outcome);
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
   * @return The value of the {@code subjectReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subjectReference")
  @Override
  public java.util.Optional<com.fhir.Reference> subjectReference() {
    return java.util.Optional.ofNullable(subjectReference);
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
   * @return The value of the {@code contact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contact")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() {
    return java.util.Optional.ofNullable(contact);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
   * @return The value of the {@code comment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("comment")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> comment() {
    return java.util.Optional.ofNullable(comment);
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
  public java.util.Optional<com.fhir.ResearchdefinitionStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code subtitle} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subtitle")
  @Override
  public java.util.Optional<java.lang.String> subtitle() {
    return java.util.Optional.ofNullable(subtitle);
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
   * @return The value of the {@code population} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("population")
  @Override
  public com.fhir.Reference population() {
    return population;
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() {
    return java.util.Optional.ofNullable(jurisdiction);
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
   * @return The value of the {@code library} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("library")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> library() {
    return java.util.Optional.ofNullable(library);
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
   * @return The value of the {@code copyright} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("copyright")
  @Override
  public java.util.Optional<com.fhir.markdown> copyright() {
    return java.util.Optional.ofNullable(copyright);
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
   * @return The value of the {@code exposure} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("exposure")
  @Override
  public java.util.Optional<com.fhir.Reference> exposure() {
    return java.util.Optional.ofNullable(exposure);
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
   * @return The value of the {@code exposureAlternative} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("exposureAlternative")
  @Override
  public java.util.Optional<com.fhir.Reference> exposureAlternative() {
    return java.util.Optional.ofNullable(exposureAlternative);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code shortTitle} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("shortTitle")
  @Override
  public java.util.Optional<java.lang.String> shortTitle() {
    return java.util.Optional.ofNullable(shortTitle);
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
   * @return The value of the {@code author} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("author")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> author() {
    return java.util.Optional.ofNullable(author);
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
   * @return The value of the {@code reviewer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reviewer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer() {
    return java.util.Optional.ofNullable(reviewer);
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
   * @return The value of the {@code experimental} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("experimental")
  @Override
  public java.util.Optional<java.lang.Boolean> experimental() {
    return java.util.Optional.ofNullable(experimental);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableResearchDefinition(
        newValue,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableResearchDefinition(
        value,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        newValue,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        value,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        newValue,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        value,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        newValue,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        value,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#relatedArtifact() relatedArtifact} attribute.
   * @param value The value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withRelatedArtifact(java.util.List<com.fhir.RelatedArtifact> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> newValue = java.util.Objects.requireNonNull(value, "relatedArtifact");
    if (this.relatedArtifact == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        newValue,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#relatedArtifact() relatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withRelatedArtifact(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> value = optional.orElse(null);
    if (this.relatedArtifact == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        value,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withOutcome(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        newValue,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withOutcome(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        value,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        newValue,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        value,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#subjectReference() subjectReference} attribute.
   * @param value The value for subjectReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withSubjectReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subjectReference");
    if (this.subjectReference == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        newValue,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#subjectReference() subjectReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withSubjectReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subjectReference == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        value,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#lastReviewDate() lastReviewDate} attribute.
   * @param value The value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withLastReviewDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "lastReviewDate");
    if (this.lastReviewDate == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        newValue,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#lastReviewDate() lastReviewDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withLastReviewDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.lastReviewDate == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        value,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        newValue,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        value,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        newValue,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        value,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#usage() usage} attribute.
   * @param value The value for usage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withUsage(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "usage");
    if (java.util.Objects.equals(this.usage, newValue)) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        newValue,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#usage() usage} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withUsage(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.usage, value)) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        value,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        newValue,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        value,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#topic() topic} attribute.
   * @param value The value for topic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withTopic(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "topic");
    if (this.topic == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        newValue,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#topic() topic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withTopic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.topic == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        value,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withComment(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "comment");
    if (this.comment == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        newValue,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#comment() comment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withComment(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.comment == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        value,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        newValue,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        value,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        newValue,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        value,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withStatus(com.fhir.ResearchdefinitionStatus value) {
    @javax.annotation.Nullable com.fhir.ResearchdefinitionStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        newValue,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withStatus(java.util.Optional<? extends com.fhir.ResearchdefinitionStatus> optional) {
    @javax.annotation.Nullable com.fhir.ResearchdefinitionStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        value,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#editor() editor} attribute.
   * @param value The value for editor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withEditor(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "editor");
    if (this.editor == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        newValue,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#editor() editor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for editor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withEditor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.editor == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        value,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#subtitle() subtitle} attribute.
   * @param value The value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withSubtitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "subtitle");
    if (java.util.Objects.equals(this.subtitle, newValue)) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        newValue,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#subtitle() subtitle} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withSubtitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.subtitle, value)) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        value,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * @param value The value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withSubjectCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "subjectCodeableConcept");
    if (this.subjectCodeableConcept == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        newValue,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withSubjectCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.subjectCodeableConcept == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        value,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ResearchDefinition#population() population} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for population
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableResearchDefinition withPopulation(com.fhir.Reference value) {
    if (this.population == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "population");
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        newValue,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#approvalDate() approvalDate} attribute.
   * @param value The value for approvalDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withApprovalDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "approvalDate");
    if (this.approvalDate == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        newValue,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#approvalDate() approvalDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for approvalDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withApprovalDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.approvalDate == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        value,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        newValue,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        value,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withPurpose(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        newValue,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withPurpose(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        value,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#library() library} attribute.
   * @param value The value for library
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withLibrary(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "library");
    if (this.library == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        newValue,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#library() library} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for library
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withLibrary(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.library == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        value,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        newValue,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        value,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withCopyright(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        newValue,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withCopyright(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        value,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        newValue,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        value,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#exposure() exposure} attribute.
   * @param value The value for exposure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withExposure(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "exposure");
    if (this.exposure == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        newValue,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#exposure() exposure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exposure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withExposure(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.exposure == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        value,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ResearchDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableResearchDefinition withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        newValue,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withEffectivePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        newValue,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withEffectivePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        value,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        newValue,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        value,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#exposureAlternative() exposureAlternative} attribute.
   * @param value The value for exposureAlternative
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withExposureAlternative(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "exposureAlternative");
    if (this.exposureAlternative == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        newValue,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#exposureAlternative() exposureAlternative} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exposureAlternative
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withExposureAlternative(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.exposureAlternative == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        value,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        newValue,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        value,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        newValue,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        value,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#shortTitle() shortTitle} attribute.
   * @param value The value for shortTitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withShortTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "shortTitle");
    if (java.util.Objects.equals(this.shortTitle, newValue)) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        newValue,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#shortTitle() shortTitle} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for shortTitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withShortTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.shortTitle, value)) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        value,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#endorser() endorser} attribute.
   * @param value The value for endorser
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withEndorser(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "endorser");
    if (this.endorser == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        newValue,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#endorser() endorser} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endorser
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withEndorser(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.endorser == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        value,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withAuthor(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        newValue,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withAuthor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        value,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        newValue,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        value,
        this.reviewer,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#reviewer() reviewer} attribute.
   * @param value The value for reviewer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withReviewer(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "reviewer");
    if (this.reviewer == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        newValue,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#reviewer() reviewer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reviewer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withReviewer(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.reviewer == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        value,
        this.name,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        newValue,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        value,
        this.experimental,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withExperimental(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        newValue,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withExperimental(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.experimental, value)) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        value,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableResearchDefinition(
        this.implicitRules,
        this.description,
        this.title,
        this.extension,
        this.relatedArtifact,
        this.outcome,
        this.text,
        this.subjectReference,
        this.lastReviewDate,
        this.contained,
        this.contact,
        this.usage,
        this.language,
        this.topic,
        this.comment,
        this.meta,
        this.url,
        this.status,
        this.editor,
        this.subtitle,
        this.subjectCodeableConcept,
        this.population,
        this.approvalDate,
        this.jurisdiction,
        this.purpose,
        this.library,
        this.modifierExtension,
        this.copyright,
        this.publisher,
        this.exposure,
        this.resourceType,
        this.effectivePeriod,
        this.version,
        this.exposureAlternative,
        this.useContext,
        this.id,
        this.shortTitle,
        this.endorser,
        this.author,
        this.identifier,
        this.reviewer,
        this.name,
        this.experimental,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableResearchDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableResearchDefinition
        && equalTo((ImmutableResearchDefinition) another);
  }

  private boolean equalTo(ImmutableResearchDefinition another) {
    return java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(relatedArtifact, another.relatedArtifact)
        && java.util.Objects.equals(outcome, another.outcome)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(subjectReference, another.subjectReference)
        && java.util.Objects.equals(lastReviewDate, another.lastReviewDate)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(usage, another.usage)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(topic, another.topic)
        && java.util.Objects.equals(comment, another.comment)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(editor, another.editor)
        && java.util.Objects.equals(subtitle, another.subtitle)
        && java.util.Objects.equals(subjectCodeableConcept, another.subjectCodeableConcept)
        && population.equals(another.population)
        && java.util.Objects.equals(approvalDate, another.approvalDate)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(purpose, another.purpose)
        && java.util.Objects.equals(library, another.library)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(copyright, another.copyright)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(exposure, another.exposure)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(effectivePeriod, another.effectivePeriod)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(exposureAlternative, another.exposureAlternative)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(shortTitle, another.shortTitle)
        && java.util.Objects.equals(endorser, another.endorser)
        && java.util.Objects.equals(author, another.author)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(reviewer, another.reviewer)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(experimental, another.experimental)
        && java.util.Objects.equals(date, another.date);
  }

  /**
   * Computes a hash code from attributes: {@code implicitRules}, {@code description}, {@code title}, {@code extension}, {@code relatedArtifact}, {@code outcome}, {@code text}, {@code subjectReference}, {@code lastReviewDate}, {@code contained}, {@code contact}, {@code usage}, {@code language}, {@code topic}, {@code comment}, {@code meta}, {@code url}, {@code status}, {@code editor}, {@code subtitle}, {@code subjectCodeableConcept}, {@code population}, {@code approvalDate}, {@code jurisdiction}, {@code purpose}, {@code library}, {@code modifierExtension}, {@code copyright}, {@code publisher}, {@code exposure}, {@code resourceType}, {@code effectivePeriod}, {@code version}, {@code exposureAlternative}, {@code useContext}, {@code id}, {@code shortTitle}, {@code endorser}, {@code author}, {@code identifier}, {@code reviewer}, {@code name}, {@code experimental}, {@code date}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(relatedArtifact);
    h += (h << 5) + java.util.Objects.hashCode(outcome);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(subjectReference);
    h += (h << 5) + java.util.Objects.hashCode(lastReviewDate);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(usage);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(topic);
    h += (h << 5) + java.util.Objects.hashCode(comment);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(editor);
    h += (h << 5) + java.util.Objects.hashCode(subtitle);
    h += (h << 5) + java.util.Objects.hashCode(subjectCodeableConcept);
    h += (h << 5) + population.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(approvalDate);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(purpose);
    h += (h << 5) + java.util.Objects.hashCode(library);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(copyright);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(exposure);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(effectivePeriod);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(exposureAlternative);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(shortTitle);
    h += (h << 5) + java.util.Objects.hashCode(endorser);
    h += (h << 5) + java.util.Objects.hashCode(author);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(reviewer);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(experimental);
    h += (h << 5) + java.util.Objects.hashCode(date);
    return h;
  }

  /**
   * Prints the immutable value {@code ResearchDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ResearchDefinition{");
    if (implicitRules != null) {
      builder.append("implicitRules=").append(implicitRules);
    }
    if (description != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (title != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (extension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (relatedArtifact != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("relatedArtifact=").append(relatedArtifact);
    }
    if (outcome != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("outcome=").append(outcome);
    }
    if (text != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (subjectReference != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("subjectReference=").append(subjectReference);
    }
    if (lastReviewDate != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("lastReviewDate=").append(lastReviewDate);
    }
    if (contained != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (contact != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (usage != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("usage=").append(usage);
    }
    if (language != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (topic != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("topic=").append(topic);
    }
    if (comment != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("comment=").append(comment);
    }
    if (meta != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (url != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (status != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (editor != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("editor=").append(editor);
    }
    if (subtitle != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("subtitle=").append(subtitle);
    }
    if (subjectCodeableConcept != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("subjectCodeableConcept=").append(subjectCodeableConcept);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("population=").append(population);
    if (approvalDate != null) {
      builder.append(", ");
      builder.append("approvalDate=").append(approvalDate);
    }
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (purpose != null) {
      builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (library != null) {
      builder.append(", ");
      builder.append("library=").append(library);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (exposure != null) {
      builder.append(", ");
      builder.append("exposure=").append(exposure);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (effectivePeriod != null) {
      builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (exposureAlternative != null) {
      builder.append(", ");
      builder.append("exposureAlternative=").append(exposureAlternative);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (shortTitle != null) {
      builder.append(", ");
      builder.append("shortTitle=").append(shortTitle);
    }
    if (endorser != null) {
      builder.append(", ");
      builder.append("endorser=").append(endorser);
    }
    if (author != null) {
      builder.append(", ");
      builder.append("author=").append(author);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (reviewer != null) {
      builder.append(", ");
      builder.append("reviewer=").append(reviewer);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ResearchDefinition", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ResearchDefinition {
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact = java.util.Optional.empty();
    boolean relatedArtifactIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> outcome = java.util.Optional.empty();
    boolean outcomeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subjectReference = java.util.Optional.empty();
    boolean subjectReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> lastReviewDate = java.util.Optional.empty();
    boolean lastReviewDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> usage = java.util.Optional.empty();
    boolean usageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic = java.util.Optional.empty();
    boolean topicIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> comment = java.util.Optional.empty();
    boolean commentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ResearchdefinitionStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor = java.util.Optional.empty();
    boolean editorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> subtitle = java.util.Optional.empty();
    boolean subtitleIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> subjectCodeableConcept = java.util.Optional.empty();
    boolean subjectCodeableConceptIsSet;
    @javax.annotation.Nullable com.fhir.Reference population;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> approvalDate = java.util.Optional.empty();
    boolean approvalDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> purpose = java.util.Optional.empty();
    boolean purposeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> library = java.util.Optional.empty();
    boolean libraryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> copyright = java.util.Optional.empty();
    boolean copyrightIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> exposure = java.util.Optional.empty();
    boolean exposureIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> effectivePeriod = java.util.Optional.empty();
    boolean effectivePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> exposureAlternative = java.util.Optional.empty();
    boolean exposureAlternativeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> shortTitle = java.util.Optional.empty();
    boolean shortTitleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser = java.util.Optional.empty();
    boolean endorserIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> author = java.util.Optional.empty();
    boolean authorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer = java.util.Optional.empty();
    boolean reviewerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> experimental = java.util.Optional.empty();
    boolean experimentalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public void setOutcome(java.util.Optional<com.fhir.Reference> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subjectReference")
    public void setSubjectReference(java.util.Optional<com.fhir.Reference> subjectReference) {
      this.subjectReference = subjectReference;
      this.subjectReferenceIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    public void setUsage(java.util.Optional<java.lang.String> usage) {
      this.usage = usage;
      this.usageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("topic")
    public void setTopic(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic) {
      this.topic = topic;
      this.topicIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    public void setComment(java.util.Optional<java.util.List<java.lang.String>> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.ResearchdefinitionStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("editor")
    public void setEditor(java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor) {
      this.editor = editor;
      this.editorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subtitle")
    public void setSubtitle(java.util.Optional<java.lang.String> subtitle) {
      this.subtitle = subtitle;
      this.subtitleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subjectCodeableConcept")
    public void setSubjectCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> subjectCodeableConcept) {
      this.subjectCodeableConcept = subjectCodeableConcept;
      this.subjectCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("population")
    public void setPopulation(com.fhir.Reference population) {
      this.population = population;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("approvalDate")
    public void setApprovalDate(java.util.Optional<com.fhir.date> approvalDate) {
      this.approvalDate = approvalDate;
      this.approvalDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    public void setPurpose(java.util.Optional<com.fhir.markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("library")
    public void setLibrary(java.util.Optional<java.util.List<com.fhir.canonical>> library) {
      this.library = library;
      this.libraryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("copyright")
    public void setCopyright(java.util.Optional<com.fhir.markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public void setPublisher(java.util.Optional<java.lang.String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("exposure")
    public void setExposure(java.util.Optional<com.fhir.Reference> exposure) {
      this.exposure = exposure;
      this.exposureIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
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
    @com.fasterxml.jackson.annotation.JsonProperty("exposureAlternative")
    public void setExposureAlternative(java.util.Optional<com.fhir.Reference> exposureAlternative) {
      this.exposureAlternative = exposureAlternative;
      this.exposureAlternativeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public void setUseContext(java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("shortTitle")
    public void setShortTitle(java.util.Optional<java.lang.String> shortTitle) {
      this.shortTitle = shortTitle;
      this.shortTitleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("endorser")
    public void setEndorser(java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser) {
      this.endorser = endorser;
      this.endorserIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public void setAuthor(java.util.Optional<java.util.List<com.fhir.ContactDetail>> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reviewer")
    public void setReviewer(java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer) {
      this.reviewer = reviewer;
      this.reviewerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("experimental")
    public void setExperimental(java.util.Optional<java.lang.Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subjectReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> lastReviewDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> usage() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> comment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ResearchdefinitionStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> subtitle() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> subjectCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference population() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> approvalDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> library() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> exposure() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> exposureAlternative() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> shortTitle() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> author() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableResearchDefinition fromJson(Json json) {
    ImmutableResearchDefinition.Builder builder = ((ImmutableResearchDefinition.Builder) ImmutableResearchDefinition.builder());
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.relatedArtifactIsSet) {
      builder.relatedArtifact(json.relatedArtifact);
    }
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.subjectReferenceIsSet) {
      builder.subjectReference(json.subjectReference);
    }
    if (json.lastReviewDateIsSet) {
      builder.lastReviewDate(json.lastReviewDate);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.usageIsSet) {
      builder.usage(json.usage);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.topicIsSet) {
      builder.topic(json.topic);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.editorIsSet) {
      builder.editor(json.editor);
    }
    if (json.subtitleIsSet) {
      builder.subtitle(json.subtitle);
    }
    if (json.subjectCodeableConceptIsSet) {
      builder.subjectCodeableConcept(json.subjectCodeableConcept);
    }
    if (json.population != null) {
      builder.population(json.population);
    }
    if (json.approvalDateIsSet) {
      builder.approvalDate(json.approvalDate);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.libraryIsSet) {
      builder.library(json.library);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.exposureIsSet) {
      builder.exposure(json.exposure);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.exposureAlternativeIsSet) {
      builder.exposureAlternative(json.exposureAlternative);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.shortTitleIsSet) {
      builder.shortTitle(json.shortTitle);
    }
    if (json.endorserIsSet) {
      builder.endorser(json.endorser);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.reviewerIsSet) {
      builder.reviewer(json.reviewer);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    return (ImmutableResearchDefinition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ResearchDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ResearchDefinition instance
   */
  public static ResearchDefinition copyOf(ResearchDefinition instance) {
    if (instance instanceof ImmutableResearchDefinition) {
      return (ImmutableResearchDefinition) instance;
    }
    return ((ImmutableResearchDefinition.Builder) ImmutableResearchDefinition.builder())
        .implicitRules(instance.implicitRules())
        .description(instance.description())
        .title(instance.title())
        .extension(instance.extension())
        .relatedArtifact(instance.relatedArtifact())
        .outcome(instance.outcome())
        .text(instance.text())
        .subjectReference(instance.subjectReference())
        .lastReviewDate(instance.lastReviewDate())
        .contained(instance.contained())
        .contact(instance.contact())
        .usage(instance.usage())
        .language(instance.language())
        .topic(instance.topic())
        .comment(instance.comment())
        .meta(instance.meta())
        .url(instance.url())
        .status(instance.status())
        .editor(instance.editor())
        .subtitle(instance.subtitle())
        .subjectCodeableConcept(instance.subjectCodeableConcept())
        .population(instance.population())
        .approvalDate(instance.approvalDate())
        .jurisdiction(instance.jurisdiction())
        .purpose(instance.purpose())
        .library(instance.library())
        .modifierExtension(instance.modifierExtension())
        .copyright(instance.copyright())
        .publisher(instance.publisher())
        .exposure(instance.exposure())
        .resourceType(instance.resourceType())
        .effectivePeriod(instance.effectivePeriod())
        .version(instance.version())
        .exposureAlternative(instance.exposureAlternative())
        .useContext(instance.useContext())
        .id(instance.id())
        .shortTitle(instance.shortTitle())
        .endorser(instance.endorser())
        .author(instance.author())
        .identifier(instance.identifier())
        .reviewer(instance.reviewer())
        .name(instance.name())
        .experimental(instance.experimental())
        .date(instance.date())
        .build();
  }

  /**
   * Creates a builder for {@link ResearchDefinition ResearchDefinition}.
   * <pre>
   * ImmutableResearchDefinition.builder()
   *    .implicitRules(com.fhir.uri) // optional {@link ResearchDefinition#implicitRules() implicitRules}
   *    .description(com.fhir.markdown) // optional {@link ResearchDefinition#description() description}
   *    .title(String) // optional {@link ResearchDefinition#title() title}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ResearchDefinition#extension() extension}
   *    .relatedArtifact(List&amp;lt;com.fhir.RelatedArtifact&amp;gt;) // optional {@link ResearchDefinition#relatedArtifact() relatedArtifact}
   *    .outcome(com.fhir.Reference) // optional {@link ResearchDefinition#outcome() outcome}
   *    .text(com.fhir.Narrative) // optional {@link ResearchDefinition#text() text}
   *    .subjectReference(com.fhir.Reference) // optional {@link ResearchDefinition#subjectReference() subjectReference}
   *    .lastReviewDate(com.fhir.date) // optional {@link ResearchDefinition#lastReviewDate() lastReviewDate}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link ResearchDefinition#contained() contained}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link ResearchDefinition#contact() contact}
   *    .usage(String) // optional {@link ResearchDefinition#usage() usage}
   *    .language(com.fhir.code) // optional {@link ResearchDefinition#language() language}
   *    .topic(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ResearchDefinition#topic() topic}
   *    .comment(List&amp;lt;String&amp;gt;) // optional {@link ResearchDefinition#comment() comment}
   *    .meta(com.fhir.Meta) // optional {@link ResearchDefinition#meta() meta}
   *    .url(com.fhir.uri) // optional {@link ResearchDefinition#url() url}
   *    .status(com.fhir.ResearchdefinitionStatus) // optional {@link ResearchDefinition#status() status}
   *    .editor(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link ResearchDefinition#editor() editor}
   *    .subtitle(String) // optional {@link ResearchDefinition#subtitle() subtitle}
   *    .subjectCodeableConcept(com.fhir.CodeableConcept) // optional {@link ResearchDefinition#subjectCodeableConcept() subjectCodeableConcept}
   *    .population(com.fhir.Reference) // required {@link ResearchDefinition#population() population}
   *    .approvalDate(com.fhir.date) // optional {@link ResearchDefinition#approvalDate() approvalDate}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ResearchDefinition#jurisdiction() jurisdiction}
   *    .purpose(com.fhir.markdown) // optional {@link ResearchDefinition#purpose() purpose}
   *    .library(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link ResearchDefinition#library() library}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ResearchDefinition#modifierExtension() modifierExtension}
   *    .copyright(com.fhir.markdown) // optional {@link ResearchDefinition#copyright() copyright}
   *    .publisher(String) // optional {@link ResearchDefinition#publisher() publisher}
   *    .exposure(com.fhir.Reference) // optional {@link ResearchDefinition#exposure() exposure}
   *    .resourceType(String) // required {@link ResearchDefinition#resourceType() resourceType}
   *    .effectivePeriod(com.fhir.Period) // optional {@link ResearchDefinition#effectivePeriod() effectivePeriod}
   *    .version(String) // optional {@link ResearchDefinition#version() version}
   *    .exposureAlternative(com.fhir.Reference) // optional {@link ResearchDefinition#exposureAlternative() exposureAlternative}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link ResearchDefinition#useContext() useContext}
   *    .id(com.fhir.id) // optional {@link ResearchDefinition#id() id}
   *    .shortTitle(String) // optional {@link ResearchDefinition#shortTitle() shortTitle}
   *    .endorser(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link ResearchDefinition#endorser() endorser}
   *    .author(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link ResearchDefinition#author() author}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link ResearchDefinition#identifier() identifier}
   *    .reviewer(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link ResearchDefinition#reviewer() reviewer}
   *    .name(String) // optional {@link ResearchDefinition#name() name}
   *    .experimental(Boolean) // optional {@link ResearchDefinition#experimental() experimental}
   *    .date(com.fhir.dateTime) // optional {@link ResearchDefinition#date() date}
   *    .build();
   * </pre>
   * @return A new ResearchDefinition builder
   */
  public static PopulationBuildStage builder() {
    return new ImmutableResearchDefinition.Builder();
  }

  /**
   * Builds instances of type {@link ResearchDefinition ResearchDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ResearchDefinition", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements PopulationBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_POPULATION = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1L;
    private static final long OPT_BIT_DESCRIPTION = 0x2L;
    private static final long OPT_BIT_TITLE = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_RELATED_ARTIFACT = 0x10L;
    private static final long OPT_BIT_OUTCOME = 0x20L;
    private static final long OPT_BIT_TEXT = 0x40L;
    private static final long OPT_BIT_SUBJECT_REFERENCE = 0x80L;
    private static final long OPT_BIT_LAST_REVIEW_DATE = 0x100L;
    private static final long OPT_BIT_CONTAINED = 0x200L;
    private static final long OPT_BIT_CONTACT = 0x400L;
    private static final long OPT_BIT_USAGE = 0x800L;
    private static final long OPT_BIT_LANGUAGE = 0x1000L;
    private static final long OPT_BIT_TOPIC = 0x2000L;
    private static final long OPT_BIT_COMMENT = 0x4000L;
    private static final long OPT_BIT_META = 0x8000L;
    private static final long OPT_BIT_URL = 0x10000L;
    private static final long OPT_BIT_STATUS = 0x20000L;
    private static final long OPT_BIT_EDITOR = 0x40000L;
    private static final long OPT_BIT_SUBTITLE = 0x80000L;
    private static final long OPT_BIT_SUBJECT_CODEABLE_CONCEPT = 0x100000L;
    private static final long OPT_BIT_APPROVAL_DATE = 0x200000L;
    private static final long OPT_BIT_JURISDICTION = 0x400000L;
    private static final long OPT_BIT_PURPOSE = 0x800000L;
    private static final long OPT_BIT_LIBRARY = 0x1000000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2000000L;
    private static final long OPT_BIT_COPYRIGHT = 0x4000000L;
    private static final long OPT_BIT_PUBLISHER = 0x8000000L;
    private static final long OPT_BIT_EXPOSURE = 0x10000000L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x20000000L;
    private static final long OPT_BIT_VERSION = 0x40000000L;
    private static final long OPT_BIT_EXPOSURE_ALTERNATIVE = 0x80000000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x100000000L;
    private static final long OPT_BIT_ID = 0x200000000L;
    private static final long OPT_BIT_SHORT_TITLE = 0x400000000L;
    private static final long OPT_BIT_ENDORSER = 0x800000000L;
    private static final long OPT_BIT_AUTHOR = 0x1000000000L;
    private static final long OPT_BIT_IDENTIFIER = 0x2000000000L;
    private static final long OPT_BIT_REVIEWER = 0x4000000000L;
    private static final long OPT_BIT_NAME = 0x8000000000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x10000000000L;
    private static final long OPT_BIT_DATE = 0x20000000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact;
    private @javax.annotation.Nullable com.fhir.Reference outcome;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.Reference subjectReference;
    private @javax.annotation.Nullable com.fhir.date lastReviewDate;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable java.lang.String usage;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic;
    private @javax.annotation.Nullable java.util.List<java.lang.String> comment;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable com.fhir.ResearchdefinitionStatus status;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor;
    private @javax.annotation.Nullable java.lang.String subtitle;
    private @javax.annotation.Nullable com.fhir.CodeableConcept subjectCodeableConcept;
    private @javax.annotation.Nullable com.fhir.Reference population;
    private @javax.annotation.Nullable com.fhir.date approvalDate;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable com.fhir.markdown purpose;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> library;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.markdown copyright;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable com.fhir.Reference exposure;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Period effectivePeriod;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable com.fhir.Reference exposureAlternative;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.lang.String shortTitle;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable java.lang.Boolean experimental;
    private @javax.annotation.Nullable com.fhir.dateTime date;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ResearchDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ResearchDefinition#description() description} to description.
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
     * Initializes the optional value {@link ResearchDefinition#description() description} to description.
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
     * Initializes the optional value {@link ResearchDefinition#title() title} to title.
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
     * Initializes the optional value {@link ResearchDefinition#title() title} to title.
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
     * Initializes the optional value {@link ResearchDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link ResearchDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link ResearchDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link ResearchDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link ResearchDefinition#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcome(com.fhir.Reference outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = java.util.Objects.requireNonNull(outcome, "outcome");
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public final Builder outcome(java.util.Optional<? extends com.fhir.Reference> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = outcome.orElse(null);
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#text() text} to text.
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
     * Initializes the optional value {@link ResearchDefinition#text() text} to text.
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
     * Initializes the optional value {@link ResearchDefinition#subjectReference() subjectReference} to subjectReference.
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
     * Initializes the optional value {@link ResearchDefinition#subjectReference() subjectReference} to subjectReference.
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
     * Initializes the optional value {@link ResearchDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link ResearchDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link ResearchDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link ResearchDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link ResearchDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link ResearchDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link ResearchDefinition#usage() usage} to usage.
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
     * Initializes the optional value {@link ResearchDefinition#usage() usage} to usage.
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
     * Initializes the optional value {@link ResearchDefinition#language() language} to language.
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
     * Initializes the optional value {@link ResearchDefinition#language() language} to language.
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
     * Initializes the optional value {@link ResearchDefinition#topic() topic} to topic.
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
     * Initializes the optional value {@link ResearchDefinition#topic() topic} to topic.
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
     * Initializes the optional value {@link ResearchDefinition#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    public final Builder comment(java.util.List<java.lang.String> comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = java.util.Objects.requireNonNull(comment, "comment");
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    public final Builder comment(java.util.Optional<? extends java.util.List<java.lang.String>> comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = comment.orElse(null);
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link ResearchDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link ResearchDefinition#url() url} to url.
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
     * Initializes the optional value {@link ResearchDefinition#url() url} to url.
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
     * Initializes the optional value {@link ResearchDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.ResearchdefinitionStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.ResearchdefinitionStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#editor() editor} to editor.
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
     * Initializes the optional value {@link ResearchDefinition#editor() editor} to editor.
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
     * Initializes the optional value {@link ResearchDefinition#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link ResearchDefinition#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link ResearchDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
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
     * Initializes the optional value {@link ResearchDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
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
     * Initializes the value for the {@link ResearchDefinition#population() population} attribute.
     * @param population The value for population 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("population")
    public final Builder population(com.fhir.Reference population) {
      checkNotIsSet(populationIsSet(), "population");
      this.population = java.util.Objects.requireNonNull(population, "population");
      initBits &= ~INIT_BIT_POPULATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link ResearchDefinition#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link ResearchDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ResearchDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ResearchDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link ResearchDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link ResearchDefinition#library() library} to library.
     * @param library The value for library
     * @return {@code this} builder for chained invocation
     */
    public final Builder library(java.util.List<com.fhir.canonical> library) {
      checkNotIsSet(libraryIsSet(), "library");
      this.library = java.util.Objects.requireNonNull(library, "library");
      optBits |= OPT_BIT_LIBRARY;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#library() library} to library.
     * @param library The value for library
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("library")
    public final Builder library(java.util.Optional<? extends java.util.List<com.fhir.canonical>> library) {
      checkNotIsSet(libraryIsSet(), "library");
      this.library = library.orElse(null);
      optBits |= OPT_BIT_LIBRARY;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ResearchDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ResearchDefinition#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link ResearchDefinition#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link ResearchDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ResearchDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ResearchDefinition#exposure() exposure} to exposure.
     * @param exposure The value for exposure
     * @return {@code this} builder for chained invocation
     */
    public final Builder exposure(com.fhir.Reference exposure) {
      checkNotIsSet(exposureIsSet(), "exposure");
      this.exposure = java.util.Objects.requireNonNull(exposure, "exposure");
      optBits |= OPT_BIT_EXPOSURE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#exposure() exposure} to exposure.
     * @param exposure The value for exposure
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exposure")
    public final Builder exposure(java.util.Optional<? extends com.fhir.Reference> exposure) {
      checkNotIsSet(exposureIsSet(), "exposure");
      this.exposure = exposure.orElse(null);
      optBits |= OPT_BIT_EXPOSURE;
      return this;
    }

    /**
     * Initializes the value for the {@link ResearchDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ResearchDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link ResearchDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link ResearchDefinition#version() version} to version.
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
     * Initializes the optional value {@link ResearchDefinition#version() version} to version.
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
     * Initializes the optional value {@link ResearchDefinition#exposureAlternative() exposureAlternative} to exposureAlternative.
     * @param exposureAlternative The value for exposureAlternative
     * @return {@code this} builder for chained invocation
     */
    public final Builder exposureAlternative(com.fhir.Reference exposureAlternative) {
      checkNotIsSet(exposureAlternativeIsSet(), "exposureAlternative");
      this.exposureAlternative = java.util.Objects.requireNonNull(exposureAlternative, "exposureAlternative");
      optBits |= OPT_BIT_EXPOSURE_ALTERNATIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#exposureAlternative() exposureAlternative} to exposureAlternative.
     * @param exposureAlternative The value for exposureAlternative
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exposureAlternative")
    public final Builder exposureAlternative(java.util.Optional<? extends com.fhir.Reference> exposureAlternative) {
      checkNotIsSet(exposureAlternativeIsSet(), "exposureAlternative");
      this.exposureAlternative = exposureAlternative.orElse(null);
      optBits |= OPT_BIT_EXPOSURE_ALTERNATIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link ResearchDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link ResearchDefinition#id() id} to id.
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
     * Initializes the optional value {@link ResearchDefinition#id() id} to id.
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
     * Initializes the optional value {@link ResearchDefinition#shortTitle() shortTitle} to shortTitle.
     * @param shortTitle The value for shortTitle
     * @return {@code this} builder for chained invocation
     */
    public final Builder shortTitle(java.lang.String shortTitle) {
      checkNotIsSet(shortTitleIsSet(), "shortTitle");
      this.shortTitle = java.util.Objects.requireNonNull(shortTitle, "shortTitle");
      optBits |= OPT_BIT_SHORT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#shortTitle() shortTitle} to shortTitle.
     * @param shortTitle The value for shortTitle
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shortTitle")
    public final Builder shortTitle(java.util.Optional<java.lang.String> shortTitle) {
      checkNotIsSet(shortTitleIsSet(), "shortTitle");
      this.shortTitle = shortTitle.orElse(null);
      optBits |= OPT_BIT_SHORT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link ResearchDefinition#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link ResearchDefinition#author() author} to author.
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
     * Initializes the optional value {@link ResearchDefinition#author() author} to author.
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
     * Initializes the optional value {@link ResearchDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ResearchDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ResearchDefinition#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link ResearchDefinition#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link ResearchDefinition#name() name} to name.
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
     * Initializes the optional value {@link ResearchDefinition#name() name} to name.
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
     * Initializes the optional value {@link ResearchDefinition#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link ResearchDefinition#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link ResearchDefinition#date() date} to date.
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
     * Initializes the optional value {@link ResearchDefinition#date() date} to date.
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
     * Builds a new {@link ResearchDefinition ResearchDefinition}.
     * @return An immutable instance of ResearchDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ResearchDefinition build() {
      checkRequiredAttributes();
      return new ImmutableResearchDefinition(
          implicitRules,
          description,
          title,
          extension,
          relatedArtifact,
          outcome,
          text,
          subjectReference,
          lastReviewDate,
          contained,
          contact,
          usage,
          language,
          topic,
          comment,
          meta,
          url,
          status,
          editor,
          subtitle,
          subjectCodeableConcept,
          population,
          approvalDate,
          jurisdiction,
          purpose,
          library,
          modifierExtension,
          copyright,
          publisher,
          exposure,
          resourceType,
          effectivePeriod,
          version,
          exposureAlternative,
          useContext,
          id,
          shortTitle,
          endorser,
          author,
          identifier,
          reviewer,
          name,
          experimental,
          date);
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean relatedArtifactIsSet() {
      return (optBits & OPT_BIT_RELATED_ARTIFACT) != 0;
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean subjectReferenceIsSet() {
      return (optBits & OPT_BIT_SUBJECT_REFERENCE) != 0;
    }

    private boolean lastReviewDateIsSet() {
      return (optBits & OPT_BIT_LAST_REVIEW_DATE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean usageIsSet() {
      return (optBits & OPT_BIT_USAGE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean topicIsSet() {
      return (optBits & OPT_BIT_TOPIC) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean editorIsSet() {
      return (optBits & OPT_BIT_EDITOR) != 0;
    }

    private boolean subtitleIsSet() {
      return (optBits & OPT_BIT_SUBTITLE) != 0;
    }

    private boolean subjectCodeableConceptIsSet() {
      return (optBits & OPT_BIT_SUBJECT_CODEABLE_CONCEPT) != 0;
    }

    private boolean approvalDateIsSet() {
      return (optBits & OPT_BIT_APPROVAL_DATE) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean libraryIsSet() {
      return (optBits & OPT_BIT_LIBRARY) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean exposureIsSet() {
      return (optBits & OPT_BIT_EXPOSURE) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean exposureAlternativeIsSet() {
      return (optBits & OPT_BIT_EXPOSURE_ALTERNATIVE) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean shortTitleIsSet() {
      return (optBits & OPT_BIT_SHORT_TITLE) != 0;
    }

    private boolean endorserIsSet() {
      return (optBits & OPT_BIT_ENDORSER) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean reviewerIsSet() {
      return (optBits & OPT_BIT_REVIEWER) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean populationIsSet() {
      return (initBits & INIT_BIT_POPULATION) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ResearchDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!populationIsSet()) attributes.add("population");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build ResearchDefinition, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ResearchDefinition", generator = "Immutables")
  public interface PopulationBuildStage {
    /**
     * Initializes the value for the {@link ResearchDefinition#population() population} attribute.
     * @param population The value for population 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage population(com.fhir.Reference population);
  }

  @org.immutables.value.Generated(from = "ResearchDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ResearchDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "ResearchDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ResearchDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link ResearchDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link ResearchDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link ResearchDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link ResearchDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link ResearchDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link ResearchDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ResearchDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ResearchDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatedArtifact(java.util.List<com.fhir.RelatedArtifact> relatedArtifact);

    /**
     * Initializes the optional value {@link ResearchDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatedArtifact(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> relatedArtifact);

    /**
     * Initializes the optional value {@link ResearchDefinition#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcome(com.fhir.Reference outcome);

    /**
     * Initializes the optional value {@link ResearchDefinition#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcome(java.util.Optional<? extends com.fhir.Reference> outcome);

    /**
     * Initializes the optional value {@link ResearchDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link ResearchDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link ResearchDefinition#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subjectReference(com.fhir.Reference subjectReference);

    /**
     * Initializes the optional value {@link ResearchDefinition#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subjectReference(java.util.Optional<? extends com.fhir.Reference> subjectReference);

    /**
     * Initializes the optional value {@link ResearchDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastReviewDate(com.fhir.date lastReviewDate);

    /**
     * Initializes the optional value {@link ResearchDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastReviewDate(java.util.Optional<? extends com.fhir.date> lastReviewDate);

    /**
     * Initializes the optional value {@link ResearchDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link ResearchDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link ResearchDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link ResearchDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link ResearchDefinition#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal usage(java.lang.String usage);

    /**
     * Initializes the optional value {@link ResearchDefinition#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal usage(java.util.Optional<java.lang.String> usage);

    /**
     * Initializes the optional value {@link ResearchDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link ResearchDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link ResearchDefinition#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topic(java.util.List<com.fhir.CodeableConcept> topic);

    /**
     * Initializes the optional value {@link ResearchDefinition#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> topic);

    /**
     * Initializes the optional value {@link ResearchDefinition#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comment(java.util.List<java.lang.String> comment);

    /**
     * Initializes the optional value {@link ResearchDefinition#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comment(java.util.Optional<? extends java.util.List<java.lang.String>> comment);

    /**
     * Initializes the optional value {@link ResearchDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link ResearchDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link ResearchDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link ResearchDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link ResearchDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.ResearchdefinitionStatus status);

    /**
     * Initializes the optional value {@link ResearchDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.ResearchdefinitionStatus> status);

    /**
     * Initializes the optional value {@link ResearchDefinition#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal editor(java.util.List<com.fhir.ContactDetail> editor);

    /**
     * Initializes the optional value {@link ResearchDefinition#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal editor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> editor);

    /**
     * Initializes the optional value {@link ResearchDefinition#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subtitle(java.lang.String subtitle);

    /**
     * Initializes the optional value {@link ResearchDefinition#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subtitle(java.util.Optional<java.lang.String> subtitle);

    /**
     * Initializes the optional value {@link ResearchDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subjectCodeableConcept(com.fhir.CodeableConcept subjectCodeableConcept);

    /**
     * Initializes the optional value {@link ResearchDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subjectCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> subjectCodeableConcept);

    /**
     * Initializes the optional value {@link ResearchDefinition#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal approvalDate(com.fhir.date approvalDate);

    /**
     * Initializes the optional value {@link ResearchDefinition#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal approvalDate(java.util.Optional<? extends com.fhir.date> approvalDate);

    /**
     * Initializes the optional value {@link ResearchDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link ResearchDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link ResearchDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(com.fhir.markdown purpose);

    /**
     * Initializes the optional value {@link ResearchDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(java.util.Optional<? extends com.fhir.markdown> purpose);

    /**
     * Initializes the optional value {@link ResearchDefinition#library() library} to library.
     * @param library The value for library
     * @return {@code this} builder for chained invocation
     */
    BuildFinal library(java.util.List<com.fhir.canonical> library);

    /**
     * Initializes the optional value {@link ResearchDefinition#library() library} to library.
     * @param library The value for library
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal library(java.util.Optional<? extends java.util.List<com.fhir.canonical>> library);

    /**
     * Initializes the optional value {@link ResearchDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ResearchDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ResearchDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(com.fhir.markdown copyright);

    /**
     * Initializes the optional value {@link ResearchDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(java.util.Optional<? extends com.fhir.markdown> copyright);

    /**
     * Initializes the optional value {@link ResearchDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link ResearchDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link ResearchDefinition#exposure() exposure} to exposure.
     * @param exposure The value for exposure
     * @return {@code this} builder for chained invocation
     */
    BuildFinal exposure(com.fhir.Reference exposure);

    /**
     * Initializes the optional value {@link ResearchDefinition#exposure() exposure} to exposure.
     * @param exposure The value for exposure
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal exposure(java.util.Optional<? extends com.fhir.Reference> exposure);

    /**
     * Initializes the optional value {@link ResearchDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(com.fhir.Period effectivePeriod);

    /**
     * Initializes the optional value {@link ResearchDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(java.util.Optional<? extends com.fhir.Period> effectivePeriod);

    /**
     * Initializes the optional value {@link ResearchDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link ResearchDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link ResearchDefinition#exposureAlternative() exposureAlternative} to exposureAlternative.
     * @param exposureAlternative The value for exposureAlternative
     * @return {@code this} builder for chained invocation
     */
    BuildFinal exposureAlternative(com.fhir.Reference exposureAlternative);

    /**
     * Initializes the optional value {@link ResearchDefinition#exposureAlternative() exposureAlternative} to exposureAlternative.
     * @param exposureAlternative The value for exposureAlternative
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal exposureAlternative(java.util.Optional<? extends com.fhir.Reference> exposureAlternative);

    /**
     * Initializes the optional value {@link ResearchDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link ResearchDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link ResearchDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link ResearchDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link ResearchDefinition#shortTitle() shortTitle} to shortTitle.
     * @param shortTitle The value for shortTitle
     * @return {@code this} builder for chained invocation
     */
    BuildFinal shortTitle(java.lang.String shortTitle);

    /**
     * Initializes the optional value {@link ResearchDefinition#shortTitle() shortTitle} to shortTitle.
     * @param shortTitle The value for shortTitle
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal shortTitle(java.util.Optional<java.lang.String> shortTitle);

    /**
     * Initializes the optional value {@link ResearchDefinition#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endorser(java.util.List<com.fhir.ContactDetail> endorser);

    /**
     * Initializes the optional value {@link ResearchDefinition#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endorser(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> endorser);

    /**
     * Initializes the optional value {@link ResearchDefinition#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(java.util.List<com.fhir.ContactDetail> author);

    /**
     * Initializes the optional value {@link ResearchDefinition#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> author);

    /**
     * Initializes the optional value {@link ResearchDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link ResearchDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link ResearchDefinition#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reviewer(java.util.List<com.fhir.ContactDetail> reviewer);

    /**
     * Initializes the optional value {@link ResearchDefinition#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reviewer(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> reviewer);

    /**
     * Initializes the optional value {@link ResearchDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link ResearchDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link ResearchDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link ResearchDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(java.util.Optional<java.lang.Boolean> experimental);

    /**
     * Initializes the optional value {@link ResearchDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link ResearchDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Builds a new {@link ResearchDefinition ResearchDefinition}.
     * @return An immutable instance of ResearchDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ResearchDefinition build();
  }
}
