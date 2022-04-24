//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link RiskEvidenceSynthesis}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRiskEvidenceSynthesis.builder()}.
 */
@org.immutables.value.Generated(from = "RiskEvidenceSynthesis", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRiskEvidenceSynthesis implements com.fhir.RiskEvidenceSynthesis {
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable com.fhir.Period effectivePeriod;
  private final @javax.annotation.Nullable com.fhir.RiskevidencesynthesisStatus status;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable com.fhir.date lastReviewDate;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept studyType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.RiskEvidenceSynthesis_Certainty> certainty;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser;
  private final com.fhir.Reference outcome;
  private final @javax.annotation.Nullable com.fhir.RiskEvidenceSynthesis_SampleSize sampleSize;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable com.fhir.RiskEvidenceSynthesis_RiskEstimate riskEstimate;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable com.fhir.date approvalDate;
  private final @javax.annotation.Nullable java.lang.String version;
  private final com.fhir.Reference population;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable com.fhir.markdown copyright;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept synthesisType;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Reference exposure;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer;

  private ImmutableRiskEvidenceSynthesis(
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable com.fhir.Period effectivePeriod,
      @javax.annotation.Nullable com.fhir.RiskevidencesynthesisStatus status,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable com.fhir.date lastReviewDate,
      @javax.annotation.Nullable com.fhir.CodeableConcept studyType,
      @javax.annotation.Nullable java.util.List<com.fhir.RiskEvidenceSynthesis_Certainty> certainty,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser,
      com.fhir.Reference outcome,
      @javax.annotation.Nullable com.fhir.RiskEvidenceSynthesis_SampleSize sampleSize,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable com.fhir.RiskEvidenceSynthesis_RiskEstimate riskEstimate,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable com.fhir.date approvalDate,
      @javax.annotation.Nullable java.lang.String version,
      com.fhir.Reference population,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable com.fhir.markdown copyright,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor,
      @javax.annotation.Nullable com.fhir.CodeableConcept synthesisType,
      @javax.annotation.Nullable com.fhir.Meta meta,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Reference exposure,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer) {
    this.title = title;
    this.effectivePeriod = effectivePeriod;
    this.status = status;
    this.text = text;
    this.contact = contact;
    this.lastReviewDate = lastReviewDate;
    this.studyType = studyType;
    this.certainty = certainty;
    this.endorser = endorser;
    this.outcome = outcome;
    this.sampleSize = sampleSize;
    this.useContext = useContext;
    this.riskEstimate = riskEstimate;
    this.date = date;
    this.relatedArtifact = relatedArtifact;
    this.language = language;
    this.jurisdiction = jurisdiction;
    this.approvalDate = approvalDate;
    this.version = version;
    this.population = population;
    this.url = url;
    this.copyright = copyright;
    this.description = description;
    this.author = author;
    this.editor = editor;
    this.synthesisType = synthesisType;
    this.meta = meta;
    this.resourceType = resourceType;
    this.extension = extension;
    this.exposure = exposure;
    this.implicitRules = implicitRules;
    this.name = name;
    this.id = id;
    this.identifier = identifier;
    this.note = note;
    this.topic = topic;
    this.modifierExtension = modifierExtension;
    this.publisher = publisher;
    this.contained = contained;
    this.reviewer = reviewer;
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
   * @return The value of the {@code effectivePeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
  @Override
  public java.util.Optional<com.fhir.Period> effectivePeriod() {
    return java.util.Optional.ofNullable(effectivePeriod);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.RiskevidencesynthesisStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code contact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contact")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() {
    return java.util.Optional.ofNullable(contact);
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
   * @return The value of the {@code studyType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("studyType")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> studyType() {
    return java.util.Optional.ofNullable(studyType);
  }

  /**
   * @return The value of the {@code certainty} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("certainty")
  @Override
  public java.util.Optional<java.util.List<com.fhir.RiskEvidenceSynthesis_Certainty>> certainty() {
    return java.util.Optional.ofNullable(certainty);
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
   * @return The value of the {@code outcome} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("outcome")
  @Override
  public com.fhir.Reference outcome() {
    return outcome;
  }

  /**
   * @return The value of the {@code sampleSize} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sampleSize")
  @Override
  public java.util.Optional<com.fhir.RiskEvidenceSynthesis_SampleSize> sampleSize() {
    return java.util.Optional.ofNullable(sampleSize);
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
   * @return The value of the {@code riskEstimate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("riskEstimate")
  @Override
  public java.util.Optional<com.fhir.RiskEvidenceSynthesis_RiskEstimate> riskEstimate() {
    return java.util.Optional.ofNullable(riskEstimate);
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
   * @return The value of the {@code relatedArtifact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("relatedArtifact")
  @Override
  public java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact() {
    return java.util.Optional.ofNullable(relatedArtifact);
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() {
    return java.util.Optional.ofNullable(jurisdiction);
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
   * @return The value of the {@code version} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("version")
  @Override
  public java.util.Optional<java.lang.String> version() {
    return java.util.Optional.ofNullable(version);
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
   * @return The value of the {@code url} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @Override
  public java.util.Optional<com.fhir.uri> url() {
    return java.util.Optional.ofNullable(url);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<com.fhir.markdown> description() {
    return java.util.Optional.ofNullable(description);
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
   * @return The value of the {@code editor} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("editor")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor() {
    return java.util.Optional.ofNullable(editor);
  }

  /**
   * @return The value of the {@code synthesisType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("synthesisType")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> synthesisType() {
    return java.util.Optional.ofNullable(synthesisType);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code note} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("note")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Annotation>> note() {
    return java.util.Optional.ofNullable(note);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code reviewer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reviewer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer() {
    return java.util.Optional.ofNullable(reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableRiskEvidenceSynthesis(
        newValue,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableRiskEvidenceSynthesis(
        value,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withEffectivePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        newValue,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withEffectivePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        value,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withStatus(com.fhir.RiskevidencesynthesisStatus value) {
    @javax.annotation.Nullable com.fhir.RiskevidencesynthesisStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        newValue,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withStatus(java.util.Optional<? extends com.fhir.RiskevidencesynthesisStatus> optional) {
    @javax.annotation.Nullable com.fhir.RiskevidencesynthesisStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        value,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        newValue,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        value,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        newValue,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        value,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#lastReviewDate() lastReviewDate} attribute.
   * @param value The value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withLastReviewDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "lastReviewDate");
    if (this.lastReviewDate == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        newValue,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#lastReviewDate() lastReviewDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withLastReviewDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.lastReviewDate == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        value,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#studyType() studyType} attribute.
   * @param value The value for studyType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withStudyType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "studyType");
    if (this.studyType == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        newValue,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#studyType() studyType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for studyType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withStudyType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.studyType == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        value,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#certainty() certainty} attribute.
   * @param value The value for certainty
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withCertainty(java.util.List<com.fhir.RiskEvidenceSynthesis_Certainty> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.RiskEvidenceSynthesis_Certainty> newValue = java.util.Objects.requireNonNull(value, "certainty");
    if (this.certainty == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        newValue,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#certainty() certainty} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for certainty
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withCertainty(java.util.Optional<? extends java.util.List<com.fhir.RiskEvidenceSynthesis_Certainty>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.RiskEvidenceSynthesis_Certainty> value = optional.orElse(null);
    if (this.certainty == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        value,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#endorser() endorser} attribute.
   * @param value The value for endorser
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withEndorser(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "endorser");
    if (this.endorser == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        newValue,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#endorser() endorser} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endorser
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withEndorser(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.endorser == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        value,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RiskEvidenceSynthesis#outcome() outcome} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for outcome
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withOutcome(com.fhir.Reference value) {
    if (this.outcome == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "outcome");
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        newValue,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#sampleSize() sampleSize} attribute.
   * @param value The value for sampleSize
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withSampleSize(com.fhir.RiskEvidenceSynthesis_SampleSize value) {
    @javax.annotation.Nullable com.fhir.RiskEvidenceSynthesis_SampleSize newValue = java.util.Objects.requireNonNull(value, "sampleSize");
    if (this.sampleSize == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        newValue,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#sampleSize() sampleSize} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sampleSize
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withSampleSize(java.util.Optional<? extends com.fhir.RiskEvidenceSynthesis_SampleSize> optional) {
    @javax.annotation.Nullable com.fhir.RiskEvidenceSynthesis_SampleSize value = optional.orElse(null);
    if (this.sampleSize == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        value,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        newValue,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        value,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#riskEstimate() riskEstimate} attribute.
   * @param value The value for riskEstimate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withRiskEstimate(com.fhir.RiskEvidenceSynthesis_RiskEstimate value) {
    @javax.annotation.Nullable com.fhir.RiskEvidenceSynthesis_RiskEstimate newValue = java.util.Objects.requireNonNull(value, "riskEstimate");
    if (this.riskEstimate == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        newValue,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#riskEstimate() riskEstimate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for riskEstimate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withRiskEstimate(java.util.Optional<? extends com.fhir.RiskEvidenceSynthesis_RiskEstimate> optional) {
    @javax.annotation.Nullable com.fhir.RiskEvidenceSynthesis_RiskEstimate value = optional.orElse(null);
    if (this.riskEstimate == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        value,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        newValue,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        value,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#relatedArtifact() relatedArtifact} attribute.
   * @param value The value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withRelatedArtifact(java.util.List<com.fhir.RelatedArtifact> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> newValue = java.util.Objects.requireNonNull(value, "relatedArtifact");
    if (this.relatedArtifact == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        newValue,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#relatedArtifact() relatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withRelatedArtifact(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> value = optional.orElse(null);
    if (this.relatedArtifact == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        value,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        newValue,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        value,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        newValue,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        value,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#approvalDate() approvalDate} attribute.
   * @param value The value for approvalDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withApprovalDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "approvalDate");
    if (this.approvalDate == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        newValue,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#approvalDate() approvalDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for approvalDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withApprovalDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.approvalDate == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        value,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        newValue,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        value,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RiskEvidenceSynthesis#population() population} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for population
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withPopulation(com.fhir.Reference value) {
    if (this.population == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "population");
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        newValue,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        newValue,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        value,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withCopyright(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        newValue,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withCopyright(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        value,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        newValue,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        value,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withAuthor(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        newValue,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withAuthor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        value,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#editor() editor} attribute.
   * @param value The value for editor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withEditor(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "editor");
    if (this.editor == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        newValue,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#editor() editor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for editor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withEditor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.editor == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        value,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#synthesisType() synthesisType} attribute.
   * @param value The value for synthesisType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withSynthesisType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "synthesisType");
    if (this.synthesisType == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        newValue,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#synthesisType() synthesisType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for synthesisType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withSynthesisType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.synthesisType == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        value,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        newValue,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        value,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RiskEvidenceSynthesis#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        newValue,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        newValue,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        value,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#exposure() exposure} attribute.
   * @param value The value for exposure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withExposure(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "exposure");
    if (this.exposure == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        newValue,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#exposure() exposure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exposure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withExposure(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.exposure == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        value,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        newValue,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        value,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        newValue,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        value,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        newValue,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        value,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        newValue,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        value,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        newValue,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        value,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#topic() topic} attribute.
   * @param value The value for topic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withTopic(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "topic");
    if (this.topic == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        newValue,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#topic() topic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withTopic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.topic == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        value,
        this.modifierExtension,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        newValue,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        value,
        this.publisher,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        newValue,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        value,
        this.contained,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        newValue,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        value,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#reviewer() reviewer} attribute.
   * @param value The value for reviewer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withReviewer(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "reviewer");
    if (this.reviewer == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#reviewer() reviewer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reviewer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withReviewer(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.reviewer == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.title,
        this.effectivePeriod,
        this.status,
        this.text,
        this.contact,
        this.lastReviewDate,
        this.studyType,
        this.certainty,
        this.endorser,
        this.outcome,
        this.sampleSize,
        this.useContext,
        this.riskEstimate,
        this.date,
        this.relatedArtifact,
        this.language,
        this.jurisdiction,
        this.approvalDate,
        this.version,
        this.population,
        this.url,
        this.copyright,
        this.description,
        this.author,
        this.editor,
        this.synthesisType,
        this.meta,
        this.resourceType,
        this.extension,
        this.exposure,
        this.implicitRules,
        this.name,
        this.id,
        this.identifier,
        this.note,
        this.topic,
        this.modifierExtension,
        this.publisher,
        this.contained,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRiskEvidenceSynthesis} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRiskEvidenceSynthesis
        && equalTo((ImmutableRiskEvidenceSynthesis) another);
  }

  private boolean equalTo(ImmutableRiskEvidenceSynthesis another) {
    return java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(effectivePeriod, another.effectivePeriod)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(lastReviewDate, another.lastReviewDate)
        && java.util.Objects.equals(studyType, another.studyType)
        && java.util.Objects.equals(certainty, another.certainty)
        && java.util.Objects.equals(endorser, another.endorser)
        && outcome.equals(another.outcome)
        && java.util.Objects.equals(sampleSize, another.sampleSize)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(riskEstimate, another.riskEstimate)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(relatedArtifact, another.relatedArtifact)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(approvalDate, another.approvalDate)
        && java.util.Objects.equals(version, another.version)
        && population.equals(another.population)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(copyright, another.copyright)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(author, another.author)
        && java.util.Objects.equals(editor, another.editor)
        && java.util.Objects.equals(synthesisType, another.synthesisType)
        && java.util.Objects.equals(meta, another.meta)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(exposure, another.exposure)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(topic, another.topic)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(reviewer, another.reviewer);
  }

  /**
   * Computes a hash code from attributes: {@code title}, {@code effectivePeriod}, {@code status}, {@code text}, {@code contact}, {@code lastReviewDate}, {@code studyType}, {@code certainty}, {@code endorser}, {@code outcome}, {@code sampleSize}, {@code useContext}, {@code riskEstimate}, {@code date}, {@code relatedArtifact}, {@code language}, {@code jurisdiction}, {@code approvalDate}, {@code version}, {@code population}, {@code url}, {@code copyright}, {@code description}, {@code author}, {@code editor}, {@code synthesisType}, {@code meta}, {@code resourceType}, {@code extension}, {@code exposure}, {@code implicitRules}, {@code name}, {@code id}, {@code identifier}, {@code note}, {@code topic}, {@code modifierExtension}, {@code publisher}, {@code contained}, {@code reviewer}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(effectivePeriod);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(lastReviewDate);
    h += (h << 5) + java.util.Objects.hashCode(studyType);
    h += (h << 5) + java.util.Objects.hashCode(certainty);
    h += (h << 5) + java.util.Objects.hashCode(endorser);
    h += (h << 5) + outcome.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(sampleSize);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(riskEstimate);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(relatedArtifact);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(approvalDate);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + population.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(copyright);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(author);
    h += (h << 5) + java.util.Objects.hashCode(editor);
    h += (h << 5) + java.util.Objects.hashCode(synthesisType);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(exposure);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(topic);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(reviewer);
    return h;
  }

  /**
   * Prints the immutable value {@code RiskEvidenceSynthesis} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("RiskEvidenceSynthesis{");
    if (title != null) {
      builder.append("title=").append(title);
    }
    if (effectivePeriod != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (status != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (text != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (contact != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (lastReviewDate != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("lastReviewDate=").append(lastReviewDate);
    }
    if (studyType != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("studyType=").append(studyType);
    }
    if (certainty != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("certainty=").append(certainty);
    }
    if (endorser != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("endorser=").append(endorser);
    }
    if (builder.length() > 22) builder.append(", ");
    builder.append("outcome=").append(outcome);
    if (sampleSize != null) {
      builder.append(", ");
      builder.append("sampleSize=").append(sampleSize);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (riskEstimate != null) {
      builder.append(", ");
      builder.append("riskEstimate=").append(riskEstimate);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (relatedArtifact != null) {
      builder.append(", ");
      builder.append("relatedArtifact=").append(relatedArtifact);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (approvalDate != null) {
      builder.append(", ");
      builder.append("approvalDate=").append(approvalDate);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    builder.append(", ");
    builder.append("population=").append(population);
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (author != null) {
      builder.append(", ");
      builder.append("author=").append(author);
    }
    if (editor != null) {
      builder.append(", ");
      builder.append("editor=").append(editor);
    }
    if (synthesisType != null) {
      builder.append(", ");
      builder.append("synthesisType=").append(synthesisType);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (exposure != null) {
      builder.append(", ");
      builder.append("exposure=").append(exposure);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (topic != null) {
      builder.append(", ");
      builder.append("topic=").append(topic);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (reviewer != null) {
      builder.append(", ");
      builder.append("reviewer=").append(reviewer);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "RiskEvidenceSynthesis", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.RiskEvidenceSynthesis {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> effectivePeriod = java.util.Optional.empty();
    boolean effectivePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.RiskevidencesynthesisStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> lastReviewDate = java.util.Optional.empty();
    boolean lastReviewDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> studyType = java.util.Optional.empty();
    boolean studyTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.RiskEvidenceSynthesis_Certainty>> certainty = java.util.Optional.empty();
    boolean certaintyIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser = java.util.Optional.empty();
    boolean endorserIsSet;
    @javax.annotation.Nullable com.fhir.Reference outcome;
    @javax.annotation.Nullable java.util.Optional<com.fhir.RiskEvidenceSynthesis_SampleSize> sampleSize = java.util.Optional.empty();
    boolean sampleSizeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.RiskEvidenceSynthesis_RiskEstimate> riskEstimate = java.util.Optional.empty();
    boolean riskEstimateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact = java.util.Optional.empty();
    boolean relatedArtifactIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> approvalDate = java.util.Optional.empty();
    boolean approvalDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable com.fhir.Reference population;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> copyright = java.util.Optional.empty();
    boolean copyrightIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> author = java.util.Optional.empty();
    boolean authorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor = java.util.Optional.empty();
    boolean editorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> synthesisType = java.util.Optional.empty();
    boolean synthesisTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> exposure = java.util.Optional.empty();
    boolean exposureIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic = java.util.Optional.empty();
    boolean topicIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer = java.util.Optional.empty();
    boolean reviewerIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
    public void setEffectivePeriod(java.util.Optional<com.fhir.Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.RiskevidencesynthesisStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lastReviewDate")
    public void setLastReviewDate(java.util.Optional<com.fhir.date> lastReviewDate) {
      this.lastReviewDate = lastReviewDate;
      this.lastReviewDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("studyType")
    public void setStudyType(java.util.Optional<com.fhir.CodeableConcept> studyType) {
      this.studyType = studyType;
      this.studyTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("certainty")
    public void setCertainty(java.util.Optional<java.util.List<com.fhir.RiskEvidenceSynthesis_Certainty>> certainty) {
      this.certainty = certainty;
      this.certaintyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("endorser")
    public void setEndorser(java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser) {
      this.endorser = endorser;
      this.endorserIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public void setOutcome(com.fhir.Reference outcome) {
      this.outcome = outcome;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sampleSize")
    public void setSampleSize(java.util.Optional<com.fhir.RiskEvidenceSynthesis_SampleSize> sampleSize) {
      this.sampleSize = sampleSize;
      this.sampleSizeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public void setUseContext(java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("riskEstimate")
    public void setRiskEstimate(java.util.Optional<com.fhir.RiskEvidenceSynthesis_RiskEstimate> riskEstimate) {
      this.riskEstimate = riskEstimate;
      this.riskEstimateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("relatedArtifact")
    public void setRelatedArtifact(java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact) {
      this.relatedArtifact = relatedArtifact;
      this.relatedArtifactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("approvalDate")
    public void setApprovalDate(java.util.Optional<com.fhir.date> approvalDate) {
      this.approvalDate = approvalDate;
      this.approvalDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("population")
    public void setPopulation(com.fhir.Reference population) {
      this.population = population;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("copyright")
    public void setCopyright(java.util.Optional<com.fhir.markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public void setAuthor(java.util.Optional<java.util.List<com.fhir.ContactDetail>> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("editor")
    public void setEditor(java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor) {
      this.editor = editor;
      this.editorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("synthesisType")
    public void setSynthesisType(java.util.Optional<com.fhir.CodeableConcept> synthesisType) {
      this.synthesisType = synthesisType;
      this.synthesisTypeIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("exposure")
    public void setExposure(java.util.Optional<com.fhir.Reference> exposure) {
      this.exposure = exposure;
      this.exposureIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("topic")
    public void setTopic(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic) {
      this.topic = topic;
      this.topicIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("reviewer")
    public void setReviewer(java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer) {
      this.reviewer = reviewer;
      this.reviewerIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.RiskevidencesynthesisStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> lastReviewDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> studyType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.RiskEvidenceSynthesis_Certainty>> certainty() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference outcome() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.RiskEvidenceSynthesis_SampleSize> sampleSize() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.RiskEvidenceSynthesis_RiskEstimate> riskEstimate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> approvalDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference population() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> author() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> synthesisType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> exposure() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableRiskEvidenceSynthesis fromJson(Json json) {
    ImmutableRiskEvidenceSynthesis.Builder builder = ((ImmutableRiskEvidenceSynthesis.Builder) ImmutableRiskEvidenceSynthesis.builder());
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.lastReviewDateIsSet) {
      builder.lastReviewDate(json.lastReviewDate);
    }
    if (json.studyTypeIsSet) {
      builder.studyType(json.studyType);
    }
    if (json.certaintyIsSet) {
      builder.certainty(json.certainty);
    }
    if (json.endorserIsSet) {
      builder.endorser(json.endorser);
    }
    if (json.outcome != null) {
      builder.outcome(json.outcome);
    }
    if (json.sampleSizeIsSet) {
      builder.sampleSize(json.sampleSize);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.riskEstimateIsSet) {
      builder.riskEstimate(json.riskEstimate);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.relatedArtifactIsSet) {
      builder.relatedArtifact(json.relatedArtifact);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.approvalDateIsSet) {
      builder.approvalDate(json.approvalDate);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.population != null) {
      builder.population(json.population);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.editorIsSet) {
      builder.editor(json.editor);
    }
    if (json.synthesisTypeIsSet) {
      builder.synthesisType(json.synthesisType);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.exposureIsSet) {
      builder.exposure(json.exposure);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.topicIsSet) {
      builder.topic(json.topic);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.reviewerIsSet) {
      builder.reviewer(json.reviewer);
    }
    return (ImmutableRiskEvidenceSynthesis) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RiskEvidenceSynthesis} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RiskEvidenceSynthesis instance
   */
  public static RiskEvidenceSynthesis copyOf(RiskEvidenceSynthesis instance) {
    if (instance instanceof ImmutableRiskEvidenceSynthesis) {
      return (ImmutableRiskEvidenceSynthesis) instance;
    }
    return ((ImmutableRiskEvidenceSynthesis.Builder) ImmutableRiskEvidenceSynthesis.builder())
        .title(instance.title())
        .effectivePeriod(instance.effectivePeriod())
        .status(instance.status())
        .text(instance.text())
        .contact(instance.contact())
        .lastReviewDate(instance.lastReviewDate())
        .studyType(instance.studyType())
        .certainty(instance.certainty())
        .endorser(instance.endorser())
        .outcome(instance.outcome())
        .sampleSize(instance.sampleSize())
        .useContext(instance.useContext())
        .riskEstimate(instance.riskEstimate())
        .date(instance.date())
        .relatedArtifact(instance.relatedArtifact())
        .language(instance.language())
        .jurisdiction(instance.jurisdiction())
        .approvalDate(instance.approvalDate())
        .version(instance.version())
        .population(instance.population())
        .url(instance.url())
        .copyright(instance.copyright())
        .description(instance.description())
        .author(instance.author())
        .editor(instance.editor())
        .synthesisType(instance.synthesisType())
        .meta(instance.meta())
        .resourceType(instance.resourceType())
        .extension(instance.extension())
        .exposure(instance.exposure())
        .implicitRules(instance.implicitRules())
        .name(instance.name())
        .id(instance.id())
        .identifier(instance.identifier())
        .note(instance.note())
        .topic(instance.topic())
        .modifierExtension(instance.modifierExtension())
        .publisher(instance.publisher())
        .contained(instance.contained())
        .reviewer(instance.reviewer())
        .build();
  }

  /**
   * Creates a builder for {@link RiskEvidenceSynthesis RiskEvidenceSynthesis}.
   * <pre>
   * ImmutableRiskEvidenceSynthesis.builder()
   *    .title(String) // optional {@link RiskEvidenceSynthesis#title() title}
   *    .effectivePeriod(com.fhir.Period) // optional {@link RiskEvidenceSynthesis#effectivePeriod() effectivePeriod}
   *    .status(com.fhir.RiskevidencesynthesisStatus) // optional {@link RiskEvidenceSynthesis#status() status}
   *    .text(com.fhir.Narrative) // optional {@link RiskEvidenceSynthesis#text() text}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link RiskEvidenceSynthesis#contact() contact}
   *    .lastReviewDate(com.fhir.date) // optional {@link RiskEvidenceSynthesis#lastReviewDate() lastReviewDate}
   *    .studyType(com.fhir.CodeableConcept) // optional {@link RiskEvidenceSynthesis#studyType() studyType}
   *    .certainty(List&amp;lt;com.fhir.RiskEvidenceSynthesis_Certainty&amp;gt;) // optional {@link RiskEvidenceSynthesis#certainty() certainty}
   *    .endorser(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link RiskEvidenceSynthesis#endorser() endorser}
   *    .outcome(com.fhir.Reference) // required {@link RiskEvidenceSynthesis#outcome() outcome}
   *    .sampleSize(com.fhir.RiskEvidenceSynthesis_SampleSize) // optional {@link RiskEvidenceSynthesis#sampleSize() sampleSize}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link RiskEvidenceSynthesis#useContext() useContext}
   *    .riskEstimate(com.fhir.RiskEvidenceSynthesis_RiskEstimate) // optional {@link RiskEvidenceSynthesis#riskEstimate() riskEstimate}
   *    .date(com.fhir.dateTime) // optional {@link RiskEvidenceSynthesis#date() date}
   *    .relatedArtifact(List&amp;lt;com.fhir.RelatedArtifact&amp;gt;) // optional {@link RiskEvidenceSynthesis#relatedArtifact() relatedArtifact}
   *    .language(com.fhir.code) // optional {@link RiskEvidenceSynthesis#language() language}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link RiskEvidenceSynthesis#jurisdiction() jurisdiction}
   *    .approvalDate(com.fhir.date) // optional {@link RiskEvidenceSynthesis#approvalDate() approvalDate}
   *    .version(String) // optional {@link RiskEvidenceSynthesis#version() version}
   *    .population(com.fhir.Reference) // required {@link RiskEvidenceSynthesis#population() population}
   *    .url(com.fhir.uri) // optional {@link RiskEvidenceSynthesis#url() url}
   *    .copyright(com.fhir.markdown) // optional {@link RiskEvidenceSynthesis#copyright() copyright}
   *    .description(com.fhir.markdown) // optional {@link RiskEvidenceSynthesis#description() description}
   *    .author(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link RiskEvidenceSynthesis#author() author}
   *    .editor(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link RiskEvidenceSynthesis#editor() editor}
   *    .synthesisType(com.fhir.CodeableConcept) // optional {@link RiskEvidenceSynthesis#synthesisType() synthesisType}
   *    .meta(com.fhir.Meta) // optional {@link RiskEvidenceSynthesis#meta() meta}
   *    .resourceType(String) // required {@link RiskEvidenceSynthesis#resourceType() resourceType}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link RiskEvidenceSynthesis#extension() extension}
   *    .exposure(com.fhir.Reference) // optional {@link RiskEvidenceSynthesis#exposure() exposure}
   *    .implicitRules(com.fhir.uri) // optional {@link RiskEvidenceSynthesis#implicitRules() implicitRules}
   *    .name(String) // optional {@link RiskEvidenceSynthesis#name() name}
   *    .id(com.fhir.id) // optional {@link RiskEvidenceSynthesis#id() id}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link RiskEvidenceSynthesis#identifier() identifier}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link RiskEvidenceSynthesis#note() note}
   *    .topic(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link RiskEvidenceSynthesis#topic() topic}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link RiskEvidenceSynthesis#modifierExtension() modifierExtension}
   *    .publisher(String) // optional {@link RiskEvidenceSynthesis#publisher() publisher}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link RiskEvidenceSynthesis#contained() contained}
   *    .reviewer(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link RiskEvidenceSynthesis#reviewer() reviewer}
   *    .build();
   * </pre>
   * @return A new RiskEvidenceSynthesis builder
   */
  public static OutcomeBuildStage builder() {
    return new ImmutableRiskEvidenceSynthesis.Builder();
  }

  /**
   * Builds instances of type {@link RiskEvidenceSynthesis RiskEvidenceSynthesis}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "RiskEvidenceSynthesis", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements OutcomeBuildStage, PopulationBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_OUTCOME = 0x1L;
    private static final long INIT_BIT_POPULATION = 0x2L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x4L;
    private static final long OPT_BIT_TITLE = 0x1L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x2L;
    private static final long OPT_BIT_STATUS = 0x4L;
    private static final long OPT_BIT_TEXT = 0x8L;
    private static final long OPT_BIT_CONTACT = 0x10L;
    private static final long OPT_BIT_LAST_REVIEW_DATE = 0x20L;
    private static final long OPT_BIT_STUDY_TYPE = 0x40L;
    private static final long OPT_BIT_CERTAINTY = 0x80L;
    private static final long OPT_BIT_ENDORSER = 0x100L;
    private static final long OPT_BIT_SAMPLE_SIZE = 0x200L;
    private static final long OPT_BIT_USE_CONTEXT = 0x400L;
    private static final long OPT_BIT_RISK_ESTIMATE = 0x800L;
    private static final long OPT_BIT_DATE = 0x1000L;
    private static final long OPT_BIT_RELATED_ARTIFACT = 0x2000L;
    private static final long OPT_BIT_LANGUAGE = 0x4000L;
    private static final long OPT_BIT_JURISDICTION = 0x8000L;
    private static final long OPT_BIT_APPROVAL_DATE = 0x10000L;
    private static final long OPT_BIT_VERSION = 0x20000L;
    private static final long OPT_BIT_URL = 0x40000L;
    private static final long OPT_BIT_COPYRIGHT = 0x80000L;
    private static final long OPT_BIT_DESCRIPTION = 0x100000L;
    private static final long OPT_BIT_AUTHOR = 0x200000L;
    private static final long OPT_BIT_EDITOR = 0x400000L;
    private static final long OPT_BIT_SYNTHESIS_TYPE = 0x800000L;
    private static final long OPT_BIT_META = 0x1000000L;
    private static final long OPT_BIT_EXTENSION = 0x2000000L;
    private static final long OPT_BIT_EXPOSURE = 0x4000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x8000000L;
    private static final long OPT_BIT_NAME = 0x10000000L;
    private static final long OPT_BIT_ID = 0x20000000L;
    private static final long OPT_BIT_IDENTIFIER = 0x40000000L;
    private static final long OPT_BIT_NOTE = 0x80000000L;
    private static final long OPT_BIT_TOPIC = 0x100000000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200000000L;
    private static final long OPT_BIT_PUBLISHER = 0x400000000L;
    private static final long OPT_BIT_CONTAINED = 0x800000000L;
    private static final long OPT_BIT_REVIEWER = 0x1000000000L;
    private long initBits = 0x7L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable com.fhir.Period effectivePeriod;
    private @javax.annotation.Nullable com.fhir.RiskevidencesynthesisStatus status;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable com.fhir.date lastReviewDate;
    private @javax.annotation.Nullable com.fhir.CodeableConcept studyType;
    private @javax.annotation.Nullable java.util.List<com.fhir.RiskEvidenceSynthesis_Certainty> certainty;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser;
    private @javax.annotation.Nullable com.fhir.Reference outcome;
    private @javax.annotation.Nullable com.fhir.RiskEvidenceSynthesis_SampleSize sampleSize;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable com.fhir.RiskEvidenceSynthesis_RiskEstimate riskEstimate;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable com.fhir.date approvalDate;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable com.fhir.Reference population;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable com.fhir.markdown copyright;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor;
    private @javax.annotation.Nullable com.fhir.CodeableConcept synthesisType;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Reference exposure;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#title() title} to title.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#title() title} to title.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.RiskevidencesynthesisStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.RiskevidencesynthesisStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#text() text} to text.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#text() text} to text.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#contact() contact} to contact.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#contact() contact} to contact.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#studyType() studyType} to studyType.
     * @param studyType The value for studyType
     * @return {@code this} builder for chained invocation
     */
    public final Builder studyType(com.fhir.CodeableConcept studyType) {
      checkNotIsSet(studyTypeIsSet(), "studyType");
      this.studyType = java.util.Objects.requireNonNull(studyType, "studyType");
      optBits |= OPT_BIT_STUDY_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#studyType() studyType} to studyType.
     * @param studyType The value for studyType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("studyType")
    public final Builder studyType(java.util.Optional<? extends com.fhir.CodeableConcept> studyType) {
      checkNotIsSet(studyTypeIsSet(), "studyType");
      this.studyType = studyType.orElse(null);
      optBits |= OPT_BIT_STUDY_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#certainty() certainty} to certainty.
     * @param certainty The value for certainty
     * @return {@code this} builder for chained invocation
     */
    public final Builder certainty(java.util.List<com.fhir.RiskEvidenceSynthesis_Certainty> certainty) {
      checkNotIsSet(certaintyIsSet(), "certainty");
      this.certainty = java.util.Objects.requireNonNull(certainty, "certainty");
      optBits |= OPT_BIT_CERTAINTY;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#certainty() certainty} to certainty.
     * @param certainty The value for certainty
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certainty")
    public final Builder certainty(java.util.Optional<? extends java.util.List<com.fhir.RiskEvidenceSynthesis_Certainty>> certainty) {
      checkNotIsSet(certaintyIsSet(), "certainty");
      this.certainty = certainty.orElse(null);
      optBits |= OPT_BIT_CERTAINTY;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#endorser() endorser} to endorser.
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
     * Initializes the value for the {@link RiskEvidenceSynthesis#outcome() outcome} attribute.
     * @param outcome The value for outcome 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public final Builder outcome(com.fhir.Reference outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = java.util.Objects.requireNonNull(outcome, "outcome");
      initBits &= ~INIT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#sampleSize() sampleSize} to sampleSize.
     * @param sampleSize The value for sampleSize
     * @return {@code this} builder for chained invocation
     */
    public final Builder sampleSize(com.fhir.RiskEvidenceSynthesis_SampleSize sampleSize) {
      checkNotIsSet(sampleSizeIsSet(), "sampleSize");
      this.sampleSize = java.util.Objects.requireNonNull(sampleSize, "sampleSize");
      optBits |= OPT_BIT_SAMPLE_SIZE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#sampleSize() sampleSize} to sampleSize.
     * @param sampleSize The value for sampleSize
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sampleSize")
    public final Builder sampleSize(java.util.Optional<? extends com.fhir.RiskEvidenceSynthesis_SampleSize> sampleSize) {
      checkNotIsSet(sampleSizeIsSet(), "sampleSize");
      this.sampleSize = sampleSize.orElse(null);
      optBits |= OPT_BIT_SAMPLE_SIZE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#riskEstimate() riskEstimate} to riskEstimate.
     * @param riskEstimate The value for riskEstimate
     * @return {@code this} builder for chained invocation
     */
    public final Builder riskEstimate(com.fhir.RiskEvidenceSynthesis_RiskEstimate riskEstimate) {
      checkNotIsSet(riskEstimateIsSet(), "riskEstimate");
      this.riskEstimate = java.util.Objects.requireNonNull(riskEstimate, "riskEstimate");
      optBits |= OPT_BIT_RISK_ESTIMATE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#riskEstimate() riskEstimate} to riskEstimate.
     * @param riskEstimate The value for riskEstimate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("riskEstimate")
    public final Builder riskEstimate(java.util.Optional<? extends com.fhir.RiskEvidenceSynthesis_RiskEstimate> riskEstimate) {
      checkNotIsSet(riskEstimateIsSet(), "riskEstimate");
      this.riskEstimate = riskEstimate.orElse(null);
      optBits |= OPT_BIT_RISK_ESTIMATE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#date() date} to date.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#date() date} to date.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#language() language} to language.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#language() language} to language.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#version() version} to version.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#version() version} to version.
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
     * Initializes the value for the {@link RiskEvidenceSynthesis#population() population} attribute.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#url() url} to url.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#url() url} to url.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#description() description} to description.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#description() description} to description.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#author() author} to author.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#author() author} to author.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#editor() editor} to editor.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#editor() editor} to editor.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#synthesisType() synthesisType} to synthesisType.
     * @param synthesisType The value for synthesisType
     * @return {@code this} builder for chained invocation
     */
    public final Builder synthesisType(com.fhir.CodeableConcept synthesisType) {
      checkNotIsSet(synthesisTypeIsSet(), "synthesisType");
      this.synthesisType = java.util.Objects.requireNonNull(synthesisType, "synthesisType");
      optBits |= OPT_BIT_SYNTHESIS_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#synthesisType() synthesisType} to synthesisType.
     * @param synthesisType The value for synthesisType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("synthesisType")
    public final Builder synthesisType(java.util.Optional<? extends com.fhir.CodeableConcept> synthesisType) {
      checkNotIsSet(synthesisTypeIsSet(), "synthesisType");
      this.synthesisType = synthesisType.orElse(null);
      optBits |= OPT_BIT_SYNTHESIS_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#meta() meta} to meta.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#meta() meta} to meta.
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
     * Initializes the value for the {@link RiskEvidenceSynthesis#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#extension() extension} to extension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#extension() extension} to extension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#exposure() exposure} to exposure.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#exposure() exposure} to exposure.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#name() name} to name.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#name() name} to name.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#id() id} to id.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#id() id} to id.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    public final Builder note(java.util.List<com.fhir.Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = java.util.Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public final Builder note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = note.orElse(null);
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#topic() topic} to topic.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#topic() topic} to topic.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#contained() contained} to contained.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#contained() contained} to contained.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#reviewer() reviewer} to reviewer.
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
     * Builds a new {@link RiskEvidenceSynthesis RiskEvidenceSynthesis}.
     * @return An immutable instance of RiskEvidenceSynthesis
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.RiskEvidenceSynthesis build() {
      checkRequiredAttributes();
      return new ImmutableRiskEvidenceSynthesis(
          title,
          effectivePeriod,
          status,
          text,
          contact,
          lastReviewDate,
          studyType,
          certainty,
          endorser,
          outcome,
          sampleSize,
          useContext,
          riskEstimate,
          date,
          relatedArtifact,
          language,
          jurisdiction,
          approvalDate,
          version,
          population,
          url,
          copyright,
          description,
          author,
          editor,
          synthesisType,
          meta,
          resourceType,
          extension,
          exposure,
          implicitRules,
          name,
          id,
          identifier,
          note,
          topic,
          modifierExtension,
          publisher,
          contained,
          reviewer);
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean lastReviewDateIsSet() {
      return (optBits & OPT_BIT_LAST_REVIEW_DATE) != 0;
    }

    private boolean studyTypeIsSet() {
      return (optBits & OPT_BIT_STUDY_TYPE) != 0;
    }

    private boolean certaintyIsSet() {
      return (optBits & OPT_BIT_CERTAINTY) != 0;
    }

    private boolean endorserIsSet() {
      return (optBits & OPT_BIT_ENDORSER) != 0;
    }

    private boolean sampleSizeIsSet() {
      return (optBits & OPT_BIT_SAMPLE_SIZE) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean riskEstimateIsSet() {
      return (optBits & OPT_BIT_RISK_ESTIMATE) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean relatedArtifactIsSet() {
      return (optBits & OPT_BIT_RELATED_ARTIFACT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean approvalDateIsSet() {
      return (optBits & OPT_BIT_APPROVAL_DATE) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean editorIsSet() {
      return (optBits & OPT_BIT_EDITOR) != 0;
    }

    private boolean synthesisTypeIsSet() {
      return (optBits & OPT_BIT_SYNTHESIS_TYPE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean exposureIsSet() {
      return (optBits & OPT_BIT_EXPOSURE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean topicIsSet() {
      return (optBits & OPT_BIT_TOPIC) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean reviewerIsSet() {
      return (optBits & OPT_BIT_REVIEWER) != 0;
    }

    private boolean outcomeIsSet() {
      return (initBits & INIT_BIT_OUTCOME) == 0;
    }

    private boolean populationIsSet() {
      return (initBits & INIT_BIT_POPULATION) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of RiskEvidenceSynthesis is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!outcomeIsSet()) attributes.add("outcome");
      if (!populationIsSet()) attributes.add("population");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build RiskEvidenceSynthesis, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "RiskEvidenceSynthesis", generator = "Immutables")
  public interface OutcomeBuildStage {
    /**
     * Initializes the value for the {@link RiskEvidenceSynthesis#outcome() outcome} attribute.
     * @param outcome The value for outcome 
     * @return {@code this} builder for use in a chained invocation
     */
    PopulationBuildStage outcome(com.fhir.Reference outcome);
  }

  @org.immutables.value.Generated(from = "RiskEvidenceSynthesis", generator = "Immutables")
  public interface PopulationBuildStage {
    /**
     * Initializes the value for the {@link RiskEvidenceSynthesis#population() population} attribute.
     * @param population The value for population 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage population(com.fhir.Reference population);
  }

  @org.immutables.value.Generated(from = "RiskEvidenceSynthesis", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link RiskEvidenceSynthesis#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "RiskEvidenceSynthesis", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(com.fhir.Period effectivePeriod);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(java.util.Optional<? extends com.fhir.Period> effectivePeriod);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.RiskevidencesynthesisStatus status);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.RiskevidencesynthesisStatus> status);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastReviewDate(com.fhir.date lastReviewDate);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastReviewDate(java.util.Optional<? extends com.fhir.date> lastReviewDate);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#studyType() studyType} to studyType.
     * @param studyType The value for studyType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal studyType(com.fhir.CodeableConcept studyType);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#studyType() studyType} to studyType.
     * @param studyType The value for studyType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal studyType(java.util.Optional<? extends com.fhir.CodeableConcept> studyType);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#certainty() certainty} to certainty.
     * @param certainty The value for certainty
     * @return {@code this} builder for chained invocation
     */
    BuildFinal certainty(java.util.List<com.fhir.RiskEvidenceSynthesis_Certainty> certainty);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#certainty() certainty} to certainty.
     * @param certainty The value for certainty
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal certainty(java.util.Optional<? extends java.util.List<com.fhir.RiskEvidenceSynthesis_Certainty>> certainty);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endorser(java.util.List<com.fhir.ContactDetail> endorser);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endorser(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> endorser);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#sampleSize() sampleSize} to sampleSize.
     * @param sampleSize The value for sampleSize
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sampleSize(com.fhir.RiskEvidenceSynthesis_SampleSize sampleSize);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#sampleSize() sampleSize} to sampleSize.
     * @param sampleSize The value for sampleSize
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sampleSize(java.util.Optional<? extends com.fhir.RiskEvidenceSynthesis_SampleSize> sampleSize);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#riskEstimate() riskEstimate} to riskEstimate.
     * @param riskEstimate The value for riskEstimate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal riskEstimate(com.fhir.RiskEvidenceSynthesis_RiskEstimate riskEstimate);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#riskEstimate() riskEstimate} to riskEstimate.
     * @param riskEstimate The value for riskEstimate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal riskEstimate(java.util.Optional<? extends com.fhir.RiskEvidenceSynthesis_RiskEstimate> riskEstimate);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatedArtifact(java.util.List<com.fhir.RelatedArtifact> relatedArtifact);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatedArtifact(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> relatedArtifact);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal approvalDate(com.fhir.date approvalDate);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal approvalDate(java.util.Optional<? extends com.fhir.date> approvalDate);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(com.fhir.markdown copyright);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(java.util.Optional<? extends com.fhir.markdown> copyright);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(java.util.List<com.fhir.ContactDetail> author);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> author);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal editor(java.util.List<com.fhir.ContactDetail> editor);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal editor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> editor);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#synthesisType() synthesisType} to synthesisType.
     * @param synthesisType The value for synthesisType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal synthesisType(com.fhir.CodeableConcept synthesisType);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#synthesisType() synthesisType} to synthesisType.
     * @param synthesisType The value for synthesisType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal synthesisType(java.util.Optional<? extends com.fhir.CodeableConcept> synthesisType);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#exposure() exposure} to exposure.
     * @param exposure The value for exposure
     * @return {@code this} builder for chained invocation
     */
    BuildFinal exposure(com.fhir.Reference exposure);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#exposure() exposure} to exposure.
     * @param exposure The value for exposure
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal exposure(java.util.Optional<? extends com.fhir.Reference> exposure);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topic(java.util.List<com.fhir.CodeableConcept> topic);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> topic);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reviewer(java.util.List<com.fhir.ContactDetail> reviewer);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reviewer(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> reviewer);

    /**
     * Builds a new {@link RiskEvidenceSynthesis RiskEvidenceSynthesis}.
     * @return An immutable instance of RiskEvidenceSynthesis
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    RiskEvidenceSynthesis build();
  }
}
