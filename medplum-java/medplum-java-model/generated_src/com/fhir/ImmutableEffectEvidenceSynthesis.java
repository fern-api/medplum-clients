//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link EffectEvidenceSynthesis}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEffectEvidenceSynthesis.builder()}.
 */
@org.immutables.value.Generated(from = "EffectEvidenceSynthesis", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEffectEvidenceSynthesis implements com.fhir.EffectEvidenceSynthesis {
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.EffectEvidenceSynthesis_Certainty> certainty;
  private final @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.EffectEvidenceSynthesis_SampleSize sampleSize;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable com.fhir.EffectevidencesynthesisStatus status;
  private final @javax.annotation.Nullable com.fhir.Period effectivePeriod;
  private final @javax.annotation.Nullable java.util.List<com.fhir.EffectEvidenceSynthesis_ResultsByExposure> resultsByExposure;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept synthesisType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor;
  private final @javax.annotation.Nullable java.lang.String name;
  private final com.fhir.Reference outcome;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept studyType;
  private final @javax.annotation.Nullable com.fhir.date approvalDate;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable java.util.List<com.fhir.EffectEvidenceSynthesis_EffectEstimate> effectEstimate;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.markdown copyright;
  private final @javax.annotation.Nullable com.fhir.date lastReviewDate;
  private final com.fhir.Reference population;
  private final com.fhir.Reference exposure;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic;
  private final com.fhir.Reference exposureAlternative;
  private final @javax.annotation.Nullable java.lang.String publisher;

  private ImmutableEffectEvidenceSynthesis(
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.EffectEvidenceSynthesis_Certainty> certainty,
      @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.EffectEvidenceSynthesis_SampleSize sampleSize,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable com.fhir.EffectevidencesynthesisStatus status,
      @javax.annotation.Nullable com.fhir.Period effectivePeriod,
      @javax.annotation.Nullable java.util.List<com.fhir.EffectEvidenceSynthesis_ResultsByExposure> resultsByExposure,
      @javax.annotation.Nullable com.fhir.CodeableConcept synthesisType,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor,
      @javax.annotation.Nullable java.lang.String name,
      com.fhir.Reference outcome,
      @javax.annotation.Nullable com.fhir.CodeableConcept studyType,
      @javax.annotation.Nullable com.fhir.date approvalDate,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable java.util.List<com.fhir.EffectEvidenceSynthesis_EffectEstimate> effectEstimate,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.markdown copyright,
      @javax.annotation.Nullable com.fhir.date lastReviewDate,
      com.fhir.Reference population,
      com.fhir.Reference exposure,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic,
      com.fhir.Reference exposureAlternative,
      @javax.annotation.Nullable java.lang.String publisher) {
    this.implicitRules = implicitRules;
    this.certainty = certainty;
    this.relatedArtifact = relatedArtifact;
    this.modifierExtension = modifierExtension;
    this.contained = contained;
    this.text = text;
    this.sampleSize = sampleSize;
    this.resourceType = resourceType;
    this.description = description;
    this.useContext = useContext;
    this.author = author;
    this.title = title;
    this.status = status;
    this.effectivePeriod = effectivePeriod;
    this.resultsByExposure = resultsByExposure;
    this.synthesisType = synthesisType;
    this.identifier = identifier;
    this.endorser = endorser;
    this.id = id;
    this.note = note;
    this.editor = editor;
    this.name = name;
    this.outcome = outcome;
    this.studyType = studyType;
    this.approvalDate = approvalDate;
    this.reviewer = reviewer;
    this.version = version;
    this.effectEstimate = effectEstimate;
    this.url = url;
    this.extension = extension;
    this.jurisdiction = jurisdiction;
    this.language = language;
    this.copyright = copyright;
    this.lastReviewDate = lastReviewDate;
    this.population = population;
    this.exposure = exposure;
    this.meta = meta;
    this.date = date;
    this.contact = contact;
    this.topic = topic;
    this.exposureAlternative = exposureAlternative;
    this.publisher = publisher;
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
   * @return The value of the {@code certainty} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("certainty")
  @Override
  public java.util.Optional<java.util.List<com.fhir.EffectEvidenceSynthesis_Certainty>> certainty() {
    return java.util.Optional.ofNullable(certainty);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code sampleSize} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sampleSize")
  @Override
  public java.util.Optional<com.fhir.EffectEvidenceSynthesis_SampleSize> sampleSize() {
    return java.util.Optional.ofNullable(sampleSize);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<com.fhir.markdown> description() {
    return java.util.Optional.ofNullable(description);
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
   * @return The value of the {@code author} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("author")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> author() {
    return java.util.Optional.ofNullable(author);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.EffectevidencesynthesisStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code resultsByExposure} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resultsByExposure")
  @Override
  public java.util.Optional<java.util.List<com.fhir.EffectEvidenceSynthesis_ResultsByExposure>> resultsByExposure() {
    return java.util.Optional.ofNullable(resultsByExposure);
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code editor} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("editor")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor() {
    return java.util.Optional.ofNullable(editor);
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
   * @return The value of the {@code outcome} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("outcome")
  @Override
  public com.fhir.Reference outcome() {
    return outcome;
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
   * @return The value of the {@code approvalDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("approvalDate")
  @Override
  public java.util.Optional<com.fhir.date> approvalDate() {
    return java.util.Optional.ofNullable(approvalDate);
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
   * @return The value of the {@code version} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("version")
  @Override
  public java.util.Optional<java.lang.String> version() {
    return java.util.Optional.ofNullable(version);
  }

  /**
   * @return The value of the {@code effectEstimate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("effectEstimate")
  @Override
  public java.util.Optional<java.util.List<com.fhir.EffectEvidenceSynthesis_EffectEstimate>> effectEstimate() {
    return java.util.Optional.ofNullable(effectEstimate);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
   * @return The value of the {@code lastReviewDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("lastReviewDate")
  @Override
  public java.util.Optional<com.fhir.date> lastReviewDate() {
    return java.util.Optional.ofNullable(lastReviewDate);
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
   * @return The value of the {@code exposure} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("exposure")
  @Override
  public com.fhir.Reference exposure() {
    return exposure;
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
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.dateTime> date() {
    return java.util.Optional.ofNullable(date);
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
   * @return The value of the {@code topic} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("topic")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic() {
    return java.util.Optional.ofNullable(topic);
  }

  /**
   * @return The value of the {@code exposureAlternative} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("exposureAlternative")
  @Override
  public com.fhir.Reference exposureAlternative() {
    return exposureAlternative;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        newValue,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        value,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#certainty() certainty} attribute.
   * @param value The value for certainty
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withCertainty(java.util.List<com.fhir.EffectEvidenceSynthesis_Certainty> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.EffectEvidenceSynthesis_Certainty> newValue = java.util.Objects.requireNonNull(value, "certainty");
    if (this.certainty == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        newValue,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#certainty() certainty} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for certainty
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withCertainty(java.util.Optional<? extends java.util.List<com.fhir.EffectEvidenceSynthesis_Certainty>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.EffectEvidenceSynthesis_Certainty> value = optional.orElse(null);
    if (this.certainty == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        value,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#relatedArtifact() relatedArtifact} attribute.
   * @param value The value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withRelatedArtifact(java.util.List<com.fhir.RelatedArtifact> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> newValue = java.util.Objects.requireNonNull(value, "relatedArtifact");
    if (this.relatedArtifact == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        newValue,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#relatedArtifact() relatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withRelatedArtifact(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> value = optional.orElse(null);
    if (this.relatedArtifact == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        value,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        newValue,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        value,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        newValue,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        value,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        newValue,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        value,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#sampleSize() sampleSize} attribute.
   * @param value The value for sampleSize
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withSampleSize(com.fhir.EffectEvidenceSynthesis_SampleSize value) {
    @javax.annotation.Nullable com.fhir.EffectEvidenceSynthesis_SampleSize newValue = java.util.Objects.requireNonNull(value, "sampleSize");
    if (this.sampleSize == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        newValue,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#sampleSize() sampleSize} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sampleSize
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withSampleSize(java.util.Optional<? extends com.fhir.EffectEvidenceSynthesis_SampleSize> optional) {
    @javax.annotation.Nullable com.fhir.EffectEvidenceSynthesis_SampleSize value = optional.orElse(null);
    if (this.sampleSize == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        value,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EffectEvidenceSynthesis#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        newValue,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        newValue,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        value,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        newValue,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        value,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withAuthor(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        newValue,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withAuthor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        value,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        newValue,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        value,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withStatus(com.fhir.EffectevidencesynthesisStatus value) {
    @javax.annotation.Nullable com.fhir.EffectevidencesynthesisStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        newValue,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withStatus(java.util.Optional<? extends com.fhir.EffectevidencesynthesisStatus> optional) {
    @javax.annotation.Nullable com.fhir.EffectevidencesynthesisStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        value,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withEffectivePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        newValue,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withEffectivePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        value,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#resultsByExposure() resultsByExposure} attribute.
   * @param value The value for resultsByExposure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withResultsByExposure(java.util.List<com.fhir.EffectEvidenceSynthesis_ResultsByExposure> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.EffectEvidenceSynthesis_ResultsByExposure> newValue = java.util.Objects.requireNonNull(value, "resultsByExposure");
    if (this.resultsByExposure == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        newValue,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#resultsByExposure() resultsByExposure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resultsByExposure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withResultsByExposure(java.util.Optional<? extends java.util.List<com.fhir.EffectEvidenceSynthesis_ResultsByExposure>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.EffectEvidenceSynthesis_ResultsByExposure> value = optional.orElse(null);
    if (this.resultsByExposure == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        value,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#synthesisType() synthesisType} attribute.
   * @param value The value for synthesisType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withSynthesisType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "synthesisType");
    if (this.synthesisType == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        newValue,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#synthesisType() synthesisType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for synthesisType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withSynthesisType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.synthesisType == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        value,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        newValue,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        value,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#endorser() endorser} attribute.
   * @param value The value for endorser
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withEndorser(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "endorser");
    if (this.endorser == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        newValue,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#endorser() endorser} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endorser
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withEndorser(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.endorser == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        value,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        newValue,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        value,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        newValue,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        value,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#editor() editor} attribute.
   * @param value The value for editor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withEditor(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "editor");
    if (this.editor == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        newValue,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#editor() editor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for editor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withEditor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.editor == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        value,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        newValue,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        value,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EffectEvidenceSynthesis#outcome() outcome} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for outcome
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withOutcome(com.fhir.Reference value) {
    if (this.outcome == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "outcome");
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        newValue,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#studyType() studyType} attribute.
   * @param value The value for studyType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withStudyType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "studyType");
    if (this.studyType == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        newValue,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#studyType() studyType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for studyType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withStudyType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.studyType == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        value,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#approvalDate() approvalDate} attribute.
   * @param value The value for approvalDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withApprovalDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "approvalDate");
    if (this.approvalDate == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        newValue,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#approvalDate() approvalDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for approvalDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withApprovalDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.approvalDate == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        value,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#reviewer() reviewer} attribute.
   * @param value The value for reviewer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withReviewer(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "reviewer");
    if (this.reviewer == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        newValue,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#reviewer() reviewer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reviewer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withReviewer(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.reviewer == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        value,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        newValue,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        value,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#effectEstimate() effectEstimate} attribute.
   * @param value The value for effectEstimate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withEffectEstimate(java.util.List<com.fhir.EffectEvidenceSynthesis_EffectEstimate> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.EffectEvidenceSynthesis_EffectEstimate> newValue = java.util.Objects.requireNonNull(value, "effectEstimate");
    if (this.effectEstimate == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        newValue,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#effectEstimate() effectEstimate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectEstimate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withEffectEstimate(java.util.Optional<? extends java.util.List<com.fhir.EffectEvidenceSynthesis_EffectEstimate>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.EffectEvidenceSynthesis_EffectEstimate> value = optional.orElse(null);
    if (this.effectEstimate == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        value,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        newValue,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        value,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        newValue,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        value,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        newValue,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        value,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        newValue,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        value,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withCopyright(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        newValue,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withCopyright(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        value,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#lastReviewDate() lastReviewDate} attribute.
   * @param value The value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withLastReviewDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "lastReviewDate");
    if (this.lastReviewDate == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        newValue,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#lastReviewDate() lastReviewDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withLastReviewDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.lastReviewDate == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        value,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EffectEvidenceSynthesis#population() population} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for population
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withPopulation(com.fhir.Reference value) {
    if (this.population == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "population");
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        newValue,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EffectEvidenceSynthesis#exposure() exposure} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for exposure
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withExposure(com.fhir.Reference value) {
    if (this.exposure == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "exposure");
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        newValue,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        newValue,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        value,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        newValue,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        value,
        this.contact,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        newValue,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        value,
        this.topic,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#topic() topic} attribute.
   * @param value The value for topic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withTopic(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "topic");
    if (this.topic == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        newValue,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#topic() topic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withTopic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.topic == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        value,
        this.exposureAlternative,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EffectEvidenceSynthesis#exposureAlternative() exposureAlternative} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for exposureAlternative
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withExposureAlternative(com.fhir.Reference value) {
    if (this.exposureAlternative == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "exposureAlternative");
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        newValue,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.implicitRules,
        this.certainty,
        this.relatedArtifact,
        this.modifierExtension,
        this.contained,
        this.text,
        this.sampleSize,
        this.resourceType,
        this.description,
        this.useContext,
        this.author,
        this.title,
        this.status,
        this.effectivePeriod,
        this.resultsByExposure,
        this.synthesisType,
        this.identifier,
        this.endorser,
        this.id,
        this.note,
        this.editor,
        this.name,
        this.outcome,
        this.studyType,
        this.approvalDate,
        this.reviewer,
        this.version,
        this.effectEstimate,
        this.url,
        this.extension,
        this.jurisdiction,
        this.language,
        this.copyright,
        this.lastReviewDate,
        this.population,
        this.exposure,
        this.meta,
        this.date,
        this.contact,
        this.topic,
        this.exposureAlternative,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEffectEvidenceSynthesis} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEffectEvidenceSynthesis
        && equalTo((ImmutableEffectEvidenceSynthesis) another);
  }

  private boolean equalTo(ImmutableEffectEvidenceSynthesis another) {
    return java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(certainty, another.certainty)
        && java.util.Objects.equals(relatedArtifact, another.relatedArtifact)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(sampleSize, another.sampleSize)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(author, another.author)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(effectivePeriod, another.effectivePeriod)
        && java.util.Objects.equals(resultsByExposure, another.resultsByExposure)
        && java.util.Objects.equals(synthesisType, another.synthesisType)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(endorser, another.endorser)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(editor, another.editor)
        && java.util.Objects.equals(name, another.name)
        && outcome.equals(another.outcome)
        && java.util.Objects.equals(studyType, another.studyType)
        && java.util.Objects.equals(approvalDate, another.approvalDate)
        && java.util.Objects.equals(reviewer, another.reviewer)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(effectEstimate, another.effectEstimate)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(copyright, another.copyright)
        && java.util.Objects.equals(lastReviewDate, another.lastReviewDate)
        && population.equals(another.population)
        && exposure.equals(another.exposure)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(topic, another.topic)
        && exposureAlternative.equals(another.exposureAlternative)
        && java.util.Objects.equals(publisher, another.publisher);
  }

  /**
   * Computes a hash code from attributes: {@code implicitRules}, {@code certainty}, {@code relatedArtifact}, {@code modifierExtension}, {@code contained}, {@code text}, {@code sampleSize}, {@code resourceType}, {@code description}, {@code useContext}, {@code author}, {@code title}, {@code status}, {@code effectivePeriod}, {@code resultsByExposure}, {@code synthesisType}, {@code identifier}, {@code endorser}, {@code id}, {@code note}, {@code editor}, {@code name}, {@code outcome}, {@code studyType}, {@code approvalDate}, {@code reviewer}, {@code version}, {@code effectEstimate}, {@code url}, {@code extension}, {@code jurisdiction}, {@code language}, {@code copyright}, {@code lastReviewDate}, {@code population}, {@code exposure}, {@code meta}, {@code date}, {@code contact}, {@code topic}, {@code exposureAlternative}, {@code publisher}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(certainty);
    h += (h << 5) + java.util.Objects.hashCode(relatedArtifact);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(sampleSize);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(author);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(effectivePeriod);
    h += (h << 5) + java.util.Objects.hashCode(resultsByExposure);
    h += (h << 5) + java.util.Objects.hashCode(synthesisType);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(endorser);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(editor);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + outcome.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(studyType);
    h += (h << 5) + java.util.Objects.hashCode(approvalDate);
    h += (h << 5) + java.util.Objects.hashCode(reviewer);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(effectEstimate);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(copyright);
    h += (h << 5) + java.util.Objects.hashCode(lastReviewDate);
    h += (h << 5) + population.hashCode();
    h += (h << 5) + exposure.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(topic);
    h += (h << 5) + exposureAlternative.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    return h;
  }

  /**
   * Prints the immutable value {@code EffectEvidenceSynthesis} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("EffectEvidenceSynthesis{");
    if (implicitRules != null) {
      builder.append("implicitRules=").append(implicitRules);
    }
    if (certainty != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("certainty=").append(certainty);
    }
    if (relatedArtifact != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("relatedArtifact=").append(relatedArtifact);
    }
    if (modifierExtension != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (contained != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (text != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (sampleSize != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("sampleSize=").append(sampleSize);
    }
    if (builder.length() > 24) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (author != null) {
      builder.append(", ");
      builder.append("author=").append(author);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (effectivePeriod != null) {
      builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (resultsByExposure != null) {
      builder.append(", ");
      builder.append("resultsByExposure=").append(resultsByExposure);
    }
    if (synthesisType != null) {
      builder.append(", ");
      builder.append("synthesisType=").append(synthesisType);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (endorser != null) {
      builder.append(", ");
      builder.append("endorser=").append(endorser);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (editor != null) {
      builder.append(", ");
      builder.append("editor=").append(editor);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    builder.append(", ");
    builder.append("outcome=").append(outcome);
    if (studyType != null) {
      builder.append(", ");
      builder.append("studyType=").append(studyType);
    }
    if (approvalDate != null) {
      builder.append(", ");
      builder.append("approvalDate=").append(approvalDate);
    }
    if (reviewer != null) {
      builder.append(", ");
      builder.append("reviewer=").append(reviewer);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (effectEstimate != null) {
      builder.append(", ");
      builder.append("effectEstimate=").append(effectEstimate);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (lastReviewDate != null) {
      builder.append(", ");
      builder.append("lastReviewDate=").append(lastReviewDate);
    }
    builder.append(", ");
    builder.append("population=").append(population);
    builder.append(", ");
    builder.append("exposure=").append(exposure);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (topic != null) {
      builder.append(", ");
      builder.append("topic=").append(topic);
    }
    builder.append(", ");
    builder.append("exposureAlternative=").append(exposureAlternative);
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "EffectEvidenceSynthesis", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.EffectEvidenceSynthesis {
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.EffectEvidenceSynthesis_Certainty>> certainty = java.util.Optional.empty();
    boolean certaintyIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact = java.util.Optional.empty();
    boolean relatedArtifactIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.EffectEvidenceSynthesis_SampleSize> sampleSize = java.util.Optional.empty();
    boolean sampleSizeIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> author = java.util.Optional.empty();
    boolean authorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.EffectevidencesynthesisStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> effectivePeriod = java.util.Optional.empty();
    boolean effectivePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.EffectEvidenceSynthesis_ResultsByExposure>> resultsByExposure = java.util.Optional.empty();
    boolean resultsByExposureIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> synthesisType = java.util.Optional.empty();
    boolean synthesisTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser = java.util.Optional.empty();
    boolean endorserIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor = java.util.Optional.empty();
    boolean editorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable com.fhir.Reference outcome;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> studyType = java.util.Optional.empty();
    boolean studyTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> approvalDate = java.util.Optional.empty();
    boolean approvalDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer = java.util.Optional.empty();
    boolean reviewerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.EffectEvidenceSynthesis_EffectEstimate>> effectEstimate = java.util.Optional.empty();
    boolean effectEstimateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> copyright = java.util.Optional.empty();
    boolean copyrightIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> lastReviewDate = java.util.Optional.empty();
    boolean lastReviewDateIsSet;
    @javax.annotation.Nullable com.fhir.Reference population;
    @javax.annotation.Nullable com.fhir.Reference exposure;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic = java.util.Optional.empty();
    boolean topicIsSet;
    @javax.annotation.Nullable com.fhir.Reference exposureAlternative;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("certainty")
    public void setCertainty(java.util.Optional<java.util.List<com.fhir.EffectEvidenceSynthesis_Certainty>> certainty) {
      this.certainty = certainty;
      this.certaintyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("relatedArtifact")
    public void setRelatedArtifact(java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact) {
      this.relatedArtifact = relatedArtifact;
      this.relatedArtifactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sampleSize")
    public void setSampleSize(java.util.Optional<com.fhir.EffectEvidenceSynthesis_SampleSize> sampleSize) {
      this.sampleSize = sampleSize;
      this.sampleSizeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public void setUseContext(java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public void setAuthor(java.util.Optional<java.util.List<com.fhir.ContactDetail>> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.EffectevidencesynthesisStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
    public void setEffectivePeriod(java.util.Optional<com.fhir.Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resultsByExposure")
    public void setResultsByExposure(java.util.Optional<java.util.List<com.fhir.EffectEvidenceSynthesis_ResultsByExposure>> resultsByExposure) {
      this.resultsByExposure = resultsByExposure;
      this.resultsByExposureIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("synthesisType")
    public void setSynthesisType(java.util.Optional<com.fhir.CodeableConcept> synthesisType) {
      this.synthesisType = synthesisType;
      this.synthesisTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("endorser")
    public void setEndorser(java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser) {
      this.endorser = endorser;
      this.endorserIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("editor")
    public void setEditor(java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor) {
      this.editor = editor;
      this.editorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public void setOutcome(com.fhir.Reference outcome) {
      this.outcome = outcome;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("studyType")
    public void setStudyType(java.util.Optional<com.fhir.CodeableConcept> studyType) {
      this.studyType = studyType;
      this.studyTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("approvalDate")
    public void setApprovalDate(java.util.Optional<com.fhir.date> approvalDate) {
      this.approvalDate = approvalDate;
      this.approvalDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reviewer")
    public void setReviewer(java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer) {
      this.reviewer = reviewer;
      this.reviewerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("effectEstimate")
    public void setEffectEstimate(java.util.Optional<java.util.List<com.fhir.EffectEvidenceSynthesis_EffectEstimate>> effectEstimate) {
      this.effectEstimate = effectEstimate;
      this.effectEstimateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("copyright")
    public void setCopyright(java.util.Optional<com.fhir.markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lastReviewDate")
    public void setLastReviewDate(java.util.Optional<com.fhir.date> lastReviewDate) {
      this.lastReviewDate = lastReviewDate;
      this.lastReviewDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("population")
    public void setPopulation(com.fhir.Reference population) {
      this.population = population;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("exposure")
    public void setExposure(com.fhir.Reference exposure) {
      this.exposure = exposure;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("topic")
    public void setTopic(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic) {
      this.topic = topic;
      this.topicIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("exposureAlternative")
    public void setExposureAlternative(com.fhir.Reference exposureAlternative) {
      this.exposureAlternative = exposureAlternative;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public void setPublisher(java.util.Optional<java.lang.String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.EffectEvidenceSynthesis_Certainty>> certainty() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.EffectEvidenceSynthesis_SampleSize> sampleSize() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> author() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.EffectevidencesynthesisStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.EffectEvidenceSynthesis_ResultsByExposure>> resultsByExposure() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> synthesisType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference outcome() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> studyType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> approvalDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.EffectEvidenceSynthesis_EffectEstimate>> effectEstimate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> lastReviewDate() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference population() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference exposure() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference exposureAlternative() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableEffectEvidenceSynthesis fromJson(Json json) {
    ImmutableEffectEvidenceSynthesis.Builder builder = ((ImmutableEffectEvidenceSynthesis.Builder) ImmutableEffectEvidenceSynthesis.builder());
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.certaintyIsSet) {
      builder.certainty(json.certainty);
    }
    if (json.relatedArtifactIsSet) {
      builder.relatedArtifact(json.relatedArtifact);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.sampleSizeIsSet) {
      builder.sampleSize(json.sampleSize);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.resultsByExposureIsSet) {
      builder.resultsByExposure(json.resultsByExposure);
    }
    if (json.synthesisTypeIsSet) {
      builder.synthesisType(json.synthesisType);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.endorserIsSet) {
      builder.endorser(json.endorser);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.editorIsSet) {
      builder.editor(json.editor);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.outcome != null) {
      builder.outcome(json.outcome);
    }
    if (json.studyTypeIsSet) {
      builder.studyType(json.studyType);
    }
    if (json.approvalDateIsSet) {
      builder.approvalDate(json.approvalDate);
    }
    if (json.reviewerIsSet) {
      builder.reviewer(json.reviewer);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.effectEstimateIsSet) {
      builder.effectEstimate(json.effectEstimate);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.lastReviewDateIsSet) {
      builder.lastReviewDate(json.lastReviewDate);
    }
    if (json.population != null) {
      builder.population(json.population);
    }
    if (json.exposure != null) {
      builder.exposure(json.exposure);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.topicIsSet) {
      builder.topic(json.topic);
    }
    if (json.exposureAlternative != null) {
      builder.exposureAlternative(json.exposureAlternative);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    return (ImmutableEffectEvidenceSynthesis) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EffectEvidenceSynthesis} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EffectEvidenceSynthesis instance
   */
  public static EffectEvidenceSynthesis copyOf(EffectEvidenceSynthesis instance) {
    if (instance instanceof ImmutableEffectEvidenceSynthesis) {
      return (ImmutableEffectEvidenceSynthesis) instance;
    }
    return ((ImmutableEffectEvidenceSynthesis.Builder) ImmutableEffectEvidenceSynthesis.builder())
        .implicitRules(instance.implicitRules())
        .certainty(instance.certainty())
        .relatedArtifact(instance.relatedArtifact())
        .modifierExtension(instance.modifierExtension())
        .contained(instance.contained())
        .text(instance.text())
        .sampleSize(instance.sampleSize())
        .resourceType(instance.resourceType())
        .description(instance.description())
        .useContext(instance.useContext())
        .author(instance.author())
        .title(instance.title())
        .status(instance.status())
        .effectivePeriod(instance.effectivePeriod())
        .resultsByExposure(instance.resultsByExposure())
        .synthesisType(instance.synthesisType())
        .identifier(instance.identifier())
        .endorser(instance.endorser())
        .id(instance.id())
        .note(instance.note())
        .editor(instance.editor())
        .name(instance.name())
        .outcome(instance.outcome())
        .studyType(instance.studyType())
        .approvalDate(instance.approvalDate())
        .reviewer(instance.reviewer())
        .version(instance.version())
        .effectEstimate(instance.effectEstimate())
        .url(instance.url())
        .extension(instance.extension())
        .jurisdiction(instance.jurisdiction())
        .language(instance.language())
        .copyright(instance.copyright())
        .lastReviewDate(instance.lastReviewDate())
        .population(instance.population())
        .exposure(instance.exposure())
        .meta(instance.meta())
        .date(instance.date())
        .contact(instance.contact())
        .topic(instance.topic())
        .exposureAlternative(instance.exposureAlternative())
        .publisher(instance.publisher())
        .build();
  }

  /**
   * Creates a builder for {@link EffectEvidenceSynthesis EffectEvidenceSynthesis}.
   * <pre>
   * ImmutableEffectEvidenceSynthesis.builder()
   *    .implicitRules(com.fhir.uri) // optional {@link EffectEvidenceSynthesis#implicitRules() implicitRules}
   *    .certainty(List&amp;lt;com.fhir.EffectEvidenceSynthesis_Certainty&amp;gt;) // optional {@link EffectEvidenceSynthesis#certainty() certainty}
   *    .relatedArtifact(List&amp;lt;com.fhir.RelatedArtifact&amp;gt;) // optional {@link EffectEvidenceSynthesis#relatedArtifact() relatedArtifact}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link EffectEvidenceSynthesis#modifierExtension() modifierExtension}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link EffectEvidenceSynthesis#contained() contained}
   *    .text(com.fhir.Narrative) // optional {@link EffectEvidenceSynthesis#text() text}
   *    .sampleSize(com.fhir.EffectEvidenceSynthesis_SampleSize) // optional {@link EffectEvidenceSynthesis#sampleSize() sampleSize}
   *    .resourceType(String) // required {@link EffectEvidenceSynthesis#resourceType() resourceType}
   *    .description(com.fhir.markdown) // optional {@link EffectEvidenceSynthesis#description() description}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link EffectEvidenceSynthesis#useContext() useContext}
   *    .author(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link EffectEvidenceSynthesis#author() author}
   *    .title(String) // optional {@link EffectEvidenceSynthesis#title() title}
   *    .status(com.fhir.EffectevidencesynthesisStatus) // optional {@link EffectEvidenceSynthesis#status() status}
   *    .effectivePeriod(com.fhir.Period) // optional {@link EffectEvidenceSynthesis#effectivePeriod() effectivePeriod}
   *    .resultsByExposure(List&amp;lt;com.fhir.EffectEvidenceSynthesis_ResultsByExposure&amp;gt;) // optional {@link EffectEvidenceSynthesis#resultsByExposure() resultsByExposure}
   *    .synthesisType(com.fhir.CodeableConcept) // optional {@link EffectEvidenceSynthesis#synthesisType() synthesisType}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link EffectEvidenceSynthesis#identifier() identifier}
   *    .endorser(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link EffectEvidenceSynthesis#endorser() endorser}
   *    .id(com.fhir.id) // optional {@link EffectEvidenceSynthesis#id() id}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link EffectEvidenceSynthesis#note() note}
   *    .editor(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link EffectEvidenceSynthesis#editor() editor}
   *    .name(String) // optional {@link EffectEvidenceSynthesis#name() name}
   *    .outcome(com.fhir.Reference) // required {@link EffectEvidenceSynthesis#outcome() outcome}
   *    .studyType(com.fhir.CodeableConcept) // optional {@link EffectEvidenceSynthesis#studyType() studyType}
   *    .approvalDate(com.fhir.date) // optional {@link EffectEvidenceSynthesis#approvalDate() approvalDate}
   *    .reviewer(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link EffectEvidenceSynthesis#reviewer() reviewer}
   *    .version(String) // optional {@link EffectEvidenceSynthesis#version() version}
   *    .effectEstimate(List&amp;lt;com.fhir.EffectEvidenceSynthesis_EffectEstimate&amp;gt;) // optional {@link EffectEvidenceSynthesis#effectEstimate() effectEstimate}
   *    .url(com.fhir.uri) // optional {@link EffectEvidenceSynthesis#url() url}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link EffectEvidenceSynthesis#extension() extension}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link EffectEvidenceSynthesis#jurisdiction() jurisdiction}
   *    .language(com.fhir.code) // optional {@link EffectEvidenceSynthesis#language() language}
   *    .copyright(com.fhir.markdown) // optional {@link EffectEvidenceSynthesis#copyright() copyright}
   *    .lastReviewDate(com.fhir.date) // optional {@link EffectEvidenceSynthesis#lastReviewDate() lastReviewDate}
   *    .population(com.fhir.Reference) // required {@link EffectEvidenceSynthesis#population() population}
   *    .exposure(com.fhir.Reference) // required {@link EffectEvidenceSynthesis#exposure() exposure}
   *    .meta(com.fhir.Meta) // optional {@link EffectEvidenceSynthesis#meta() meta}
   *    .date(com.fhir.dateTime) // optional {@link EffectEvidenceSynthesis#date() date}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link EffectEvidenceSynthesis#contact() contact}
   *    .topic(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link EffectEvidenceSynthesis#topic() topic}
   *    .exposureAlternative(com.fhir.Reference) // required {@link EffectEvidenceSynthesis#exposureAlternative() exposureAlternative}
   *    .publisher(String) // optional {@link EffectEvidenceSynthesis#publisher() publisher}
   *    .build();
   * </pre>
   * @return A new EffectEvidenceSynthesis builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableEffectEvidenceSynthesis.Builder();
  }

  /**
   * Builds instances of type {@link EffectEvidenceSynthesis EffectEvidenceSynthesis}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "EffectEvidenceSynthesis", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder
      implements ResourceTypeBuildStage, OutcomeBuildStage, PopulationBuildStage, ExposureBuildStage, ExposureAlternativeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_OUTCOME = 0x2L;
    private static final long INIT_BIT_POPULATION = 0x4L;
    private static final long INIT_BIT_EXPOSURE = 0x8L;
    private static final long INIT_BIT_EXPOSURE_ALTERNATIVE = 0x10L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1L;
    private static final long OPT_BIT_CERTAINTY = 0x2L;
    private static final long OPT_BIT_RELATED_ARTIFACT = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_CONTAINED = 0x10L;
    private static final long OPT_BIT_TEXT = 0x20L;
    private static final long OPT_BIT_SAMPLE_SIZE = 0x40L;
    private static final long OPT_BIT_DESCRIPTION = 0x80L;
    private static final long OPT_BIT_USE_CONTEXT = 0x100L;
    private static final long OPT_BIT_AUTHOR = 0x200L;
    private static final long OPT_BIT_TITLE = 0x400L;
    private static final long OPT_BIT_STATUS = 0x800L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x1000L;
    private static final long OPT_BIT_RESULTS_BY_EXPOSURE = 0x2000L;
    private static final long OPT_BIT_SYNTHESIS_TYPE = 0x4000L;
    private static final long OPT_BIT_IDENTIFIER = 0x8000L;
    private static final long OPT_BIT_ENDORSER = 0x10000L;
    private static final long OPT_BIT_ID = 0x20000L;
    private static final long OPT_BIT_NOTE = 0x40000L;
    private static final long OPT_BIT_EDITOR = 0x80000L;
    private static final long OPT_BIT_NAME = 0x100000L;
    private static final long OPT_BIT_STUDY_TYPE = 0x200000L;
    private static final long OPT_BIT_APPROVAL_DATE = 0x400000L;
    private static final long OPT_BIT_REVIEWER = 0x800000L;
    private static final long OPT_BIT_VERSION = 0x1000000L;
    private static final long OPT_BIT_EFFECT_ESTIMATE = 0x2000000L;
    private static final long OPT_BIT_URL = 0x4000000L;
    private static final long OPT_BIT_EXTENSION = 0x8000000L;
    private static final long OPT_BIT_JURISDICTION = 0x10000000L;
    private static final long OPT_BIT_LANGUAGE = 0x20000000L;
    private static final long OPT_BIT_COPYRIGHT = 0x40000000L;
    private static final long OPT_BIT_LAST_REVIEW_DATE = 0x80000000L;
    private static final long OPT_BIT_META = 0x100000000L;
    private static final long OPT_BIT_DATE = 0x200000000L;
    private static final long OPT_BIT_CONTACT = 0x400000000L;
    private static final long OPT_BIT_TOPIC = 0x800000000L;
    private static final long OPT_BIT_PUBLISHER = 0x1000000000L;
    private long initBits = 0x1fL;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.EffectEvidenceSynthesis_Certainty> certainty;
    private @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.EffectEvidenceSynthesis_SampleSize sampleSize;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable com.fhir.EffectevidencesynthesisStatus status;
    private @javax.annotation.Nullable com.fhir.Period effectivePeriod;
    private @javax.annotation.Nullable java.util.List<com.fhir.EffectEvidenceSynthesis_ResultsByExposure> resultsByExposure;
    private @javax.annotation.Nullable com.fhir.CodeableConcept synthesisType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.Reference outcome;
    private @javax.annotation.Nullable com.fhir.CodeableConcept studyType;
    private @javax.annotation.Nullable com.fhir.date approvalDate;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable java.util.List<com.fhir.EffectEvidenceSynthesis_EffectEstimate> effectEstimate;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.markdown copyright;
    private @javax.annotation.Nullable com.fhir.date lastReviewDate;
    private @javax.annotation.Nullable com.fhir.Reference population;
    private @javax.annotation.Nullable com.fhir.Reference exposure;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic;
    private @javax.annotation.Nullable com.fhir.Reference exposureAlternative;
    private @javax.annotation.Nullable java.lang.String publisher;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#certainty() certainty} to certainty.
     * @param certainty The value for certainty
     * @return {@code this} builder for chained invocation
     */
    public final Builder certainty(java.util.List<com.fhir.EffectEvidenceSynthesis_Certainty> certainty) {
      checkNotIsSet(certaintyIsSet(), "certainty");
      this.certainty = java.util.Objects.requireNonNull(certainty, "certainty");
      optBits |= OPT_BIT_CERTAINTY;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#certainty() certainty} to certainty.
     * @param certainty The value for certainty
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certainty")
    public final Builder certainty(java.util.Optional<? extends java.util.List<com.fhir.EffectEvidenceSynthesis_Certainty>> certainty) {
      checkNotIsSet(certaintyIsSet(), "certainty");
      this.certainty = certainty.orElse(null);
      optBits |= OPT_BIT_CERTAINTY;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#contained() contained} to contained.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#contained() contained} to contained.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#text() text} to text.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#text() text} to text.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#sampleSize() sampleSize} to sampleSize.
     * @param sampleSize The value for sampleSize
     * @return {@code this} builder for chained invocation
     */
    public final Builder sampleSize(com.fhir.EffectEvidenceSynthesis_SampleSize sampleSize) {
      checkNotIsSet(sampleSizeIsSet(), "sampleSize");
      this.sampleSize = java.util.Objects.requireNonNull(sampleSize, "sampleSize");
      optBits |= OPT_BIT_SAMPLE_SIZE;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#sampleSize() sampleSize} to sampleSize.
     * @param sampleSize The value for sampleSize
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sampleSize")
    public final Builder sampleSize(java.util.Optional<? extends com.fhir.EffectEvidenceSynthesis_SampleSize> sampleSize) {
      checkNotIsSet(sampleSizeIsSet(), "sampleSize");
      this.sampleSize = sampleSize.orElse(null);
      optBits |= OPT_BIT_SAMPLE_SIZE;
      return this;
    }

    /**
     * Initializes the value for the {@link EffectEvidenceSynthesis#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#description() description} to description.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#description() description} to description.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#author() author} to author.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#author() author} to author.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#title() title} to title.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#title() title} to title.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.EffectevidencesynthesisStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.EffectevidencesynthesisStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#resultsByExposure() resultsByExposure} to resultsByExposure.
     * @param resultsByExposure The value for resultsByExposure
     * @return {@code this} builder for chained invocation
     */
    public final Builder resultsByExposure(java.util.List<com.fhir.EffectEvidenceSynthesis_ResultsByExposure> resultsByExposure) {
      checkNotIsSet(resultsByExposureIsSet(), "resultsByExposure");
      this.resultsByExposure = java.util.Objects.requireNonNull(resultsByExposure, "resultsByExposure");
      optBits |= OPT_BIT_RESULTS_BY_EXPOSURE;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#resultsByExposure() resultsByExposure} to resultsByExposure.
     * @param resultsByExposure The value for resultsByExposure
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resultsByExposure")
    public final Builder resultsByExposure(java.util.Optional<? extends java.util.List<com.fhir.EffectEvidenceSynthesis_ResultsByExposure>> resultsByExposure) {
      checkNotIsSet(resultsByExposureIsSet(), "resultsByExposure");
      this.resultsByExposure = resultsByExposure.orElse(null);
      optBits |= OPT_BIT_RESULTS_BY_EXPOSURE;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#synthesisType() synthesisType} to synthesisType.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#synthesisType() synthesisType} to synthesisType.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#id() id} to id.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#id() id} to id.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#note() note} to note.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#note() note} to note.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#editor() editor} to editor.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#editor() editor} to editor.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#name() name} to name.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#name() name} to name.
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
     * Initializes the value for the {@link EffectEvidenceSynthesis#outcome() outcome} attribute.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#studyType() studyType} to studyType.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#studyType() studyType} to studyType.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#version() version} to version.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#version() version} to version.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#effectEstimate() effectEstimate} to effectEstimate.
     * @param effectEstimate The value for effectEstimate
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectEstimate(java.util.List<com.fhir.EffectEvidenceSynthesis_EffectEstimate> effectEstimate) {
      checkNotIsSet(effectEstimateIsSet(), "effectEstimate");
      this.effectEstimate = java.util.Objects.requireNonNull(effectEstimate, "effectEstimate");
      optBits |= OPT_BIT_EFFECT_ESTIMATE;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#effectEstimate() effectEstimate} to effectEstimate.
     * @param effectEstimate The value for effectEstimate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("effectEstimate")
    public final Builder effectEstimate(java.util.Optional<? extends java.util.List<com.fhir.EffectEvidenceSynthesis_EffectEstimate>> effectEstimate) {
      checkNotIsSet(effectEstimateIsSet(), "effectEstimate");
      this.effectEstimate = effectEstimate.orElse(null);
      optBits |= OPT_BIT_EFFECT_ESTIMATE;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#url() url} to url.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#url() url} to url.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#extension() extension} to extension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#extension() extension} to extension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#language() language} to language.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#language() language} to language.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the value for the {@link EffectEvidenceSynthesis#population() population} attribute.
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
     * Initializes the value for the {@link EffectEvidenceSynthesis#exposure() exposure} attribute.
     * @param exposure The value for exposure 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exposure")
    public final Builder exposure(com.fhir.Reference exposure) {
      checkNotIsSet(exposureIsSet(), "exposure");
      this.exposure = java.util.Objects.requireNonNull(exposure, "exposure");
      initBits &= ~INIT_BIT_EXPOSURE;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#meta() meta} to meta.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#meta() meta} to meta.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#date() date} to date.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#date() date} to date.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#contact() contact} to contact.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#contact() contact} to contact.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#topic() topic} to topic.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#topic() topic} to topic.
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
     * Initializes the value for the {@link EffectEvidenceSynthesis#exposureAlternative() exposureAlternative} attribute.
     * @param exposureAlternative The value for exposureAlternative 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exposureAlternative")
    public final Builder exposureAlternative(com.fhir.Reference exposureAlternative) {
      checkNotIsSet(exposureAlternativeIsSet(), "exposureAlternative");
      this.exposureAlternative = java.util.Objects.requireNonNull(exposureAlternative, "exposureAlternative");
      initBits &= ~INIT_BIT_EXPOSURE_ALTERNATIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#publisher() publisher} to publisher.
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
     * Builds a new {@link EffectEvidenceSynthesis EffectEvidenceSynthesis}.
     * @return An immutable instance of EffectEvidenceSynthesis
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.EffectEvidenceSynthesis build() {
      checkRequiredAttributes();
      return new ImmutableEffectEvidenceSynthesis(
          implicitRules,
          certainty,
          relatedArtifact,
          modifierExtension,
          contained,
          text,
          sampleSize,
          resourceType,
          description,
          useContext,
          author,
          title,
          status,
          effectivePeriod,
          resultsByExposure,
          synthesisType,
          identifier,
          endorser,
          id,
          note,
          editor,
          name,
          outcome,
          studyType,
          approvalDate,
          reviewer,
          version,
          effectEstimate,
          url,
          extension,
          jurisdiction,
          language,
          copyright,
          lastReviewDate,
          population,
          exposure,
          meta,
          date,
          contact,
          topic,
          exposureAlternative,
          publisher);
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean certaintyIsSet() {
      return (optBits & OPT_BIT_CERTAINTY) != 0;
    }

    private boolean relatedArtifactIsSet() {
      return (optBits & OPT_BIT_RELATED_ARTIFACT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean sampleSizeIsSet() {
      return (optBits & OPT_BIT_SAMPLE_SIZE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean resultsByExposureIsSet() {
      return (optBits & OPT_BIT_RESULTS_BY_EXPOSURE) != 0;
    }

    private boolean synthesisTypeIsSet() {
      return (optBits & OPT_BIT_SYNTHESIS_TYPE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean endorserIsSet() {
      return (optBits & OPT_BIT_ENDORSER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean editorIsSet() {
      return (optBits & OPT_BIT_EDITOR) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean studyTypeIsSet() {
      return (optBits & OPT_BIT_STUDY_TYPE) != 0;
    }

    private boolean approvalDateIsSet() {
      return (optBits & OPT_BIT_APPROVAL_DATE) != 0;
    }

    private boolean reviewerIsSet() {
      return (optBits & OPT_BIT_REVIEWER) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean effectEstimateIsSet() {
      return (optBits & OPT_BIT_EFFECT_ESTIMATE) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean lastReviewDateIsSet() {
      return (optBits & OPT_BIT_LAST_REVIEW_DATE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean topicIsSet() {
      return (optBits & OPT_BIT_TOPIC) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean outcomeIsSet() {
      return (initBits & INIT_BIT_OUTCOME) == 0;
    }

    private boolean populationIsSet() {
      return (initBits & INIT_BIT_POPULATION) == 0;
    }

    private boolean exposureIsSet() {
      return (initBits & INIT_BIT_EXPOSURE) == 0;
    }

    private boolean exposureAlternativeIsSet() {
      return (initBits & INIT_BIT_EXPOSURE_ALTERNATIVE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of EffectEvidenceSynthesis is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!outcomeIsSet()) attributes.add("outcome");
      if (!populationIsSet()) attributes.add("population");
      if (!exposureIsSet()) attributes.add("exposure");
      if (!exposureAlternativeIsSet()) attributes.add("exposureAlternative");
      return "Cannot build EffectEvidenceSynthesis, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "EffectEvidenceSynthesis", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link EffectEvidenceSynthesis#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    OutcomeBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "EffectEvidenceSynthesis", generator = "Immutables")
  public interface OutcomeBuildStage {
    /**
     * Initializes the value for the {@link EffectEvidenceSynthesis#outcome() outcome} attribute.
     * @param outcome The value for outcome 
     * @return {@code this} builder for use in a chained invocation
     */
    PopulationBuildStage outcome(com.fhir.Reference outcome);
  }

  @org.immutables.value.Generated(from = "EffectEvidenceSynthesis", generator = "Immutables")
  public interface PopulationBuildStage {
    /**
     * Initializes the value for the {@link EffectEvidenceSynthesis#population() population} attribute.
     * @param population The value for population 
     * @return {@code this} builder for use in a chained invocation
     */
    ExposureBuildStage population(com.fhir.Reference population);
  }

  @org.immutables.value.Generated(from = "EffectEvidenceSynthesis", generator = "Immutables")
  public interface ExposureBuildStage {
    /**
     * Initializes the value for the {@link EffectEvidenceSynthesis#exposure() exposure} attribute.
     * @param exposure The value for exposure 
     * @return {@code this} builder for use in a chained invocation
     */
    ExposureAlternativeBuildStage exposure(com.fhir.Reference exposure);
  }

  @org.immutables.value.Generated(from = "EffectEvidenceSynthesis", generator = "Immutables")
  public interface ExposureAlternativeBuildStage {
    /**
     * Initializes the value for the {@link EffectEvidenceSynthesis#exposureAlternative() exposureAlternative} attribute.
     * @param exposureAlternative The value for exposureAlternative 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal exposureAlternative(com.fhir.Reference exposureAlternative);
  }

  @org.immutables.value.Generated(from = "EffectEvidenceSynthesis", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#certainty() certainty} to certainty.
     * @param certainty The value for certainty
     * @return {@code this} builder for chained invocation
     */
    BuildFinal certainty(java.util.List<com.fhir.EffectEvidenceSynthesis_Certainty> certainty);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#certainty() certainty} to certainty.
     * @param certainty The value for certainty
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal certainty(java.util.Optional<? extends java.util.List<com.fhir.EffectEvidenceSynthesis_Certainty>> certainty);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatedArtifact(java.util.List<com.fhir.RelatedArtifact> relatedArtifact);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatedArtifact(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> relatedArtifact);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#sampleSize() sampleSize} to sampleSize.
     * @param sampleSize The value for sampleSize
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sampleSize(com.fhir.EffectEvidenceSynthesis_SampleSize sampleSize);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#sampleSize() sampleSize} to sampleSize.
     * @param sampleSize The value for sampleSize
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sampleSize(java.util.Optional<? extends com.fhir.EffectEvidenceSynthesis_SampleSize> sampleSize);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(java.util.List<com.fhir.ContactDetail> author);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> author);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.EffectevidencesynthesisStatus status);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.EffectevidencesynthesisStatus> status);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(com.fhir.Period effectivePeriod);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(java.util.Optional<? extends com.fhir.Period> effectivePeriod);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#resultsByExposure() resultsByExposure} to resultsByExposure.
     * @param resultsByExposure The value for resultsByExposure
     * @return {@code this} builder for chained invocation
     */
    BuildFinal resultsByExposure(java.util.List<com.fhir.EffectEvidenceSynthesis_ResultsByExposure> resultsByExposure);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#resultsByExposure() resultsByExposure} to resultsByExposure.
     * @param resultsByExposure The value for resultsByExposure
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resultsByExposure(java.util.Optional<? extends java.util.List<com.fhir.EffectEvidenceSynthesis_ResultsByExposure>> resultsByExposure);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#synthesisType() synthesisType} to synthesisType.
     * @param synthesisType The value for synthesisType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal synthesisType(com.fhir.CodeableConcept synthesisType);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#synthesisType() synthesisType} to synthesisType.
     * @param synthesisType The value for synthesisType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal synthesisType(java.util.Optional<? extends com.fhir.CodeableConcept> synthesisType);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endorser(java.util.List<com.fhir.ContactDetail> endorser);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endorser(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> endorser);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal editor(java.util.List<com.fhir.ContactDetail> editor);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal editor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> editor);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#studyType() studyType} to studyType.
     * @param studyType The value for studyType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal studyType(com.fhir.CodeableConcept studyType);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#studyType() studyType} to studyType.
     * @param studyType The value for studyType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal studyType(java.util.Optional<? extends com.fhir.CodeableConcept> studyType);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal approvalDate(com.fhir.date approvalDate);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal approvalDate(java.util.Optional<? extends com.fhir.date> approvalDate);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reviewer(java.util.List<com.fhir.ContactDetail> reviewer);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reviewer(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> reviewer);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#effectEstimate() effectEstimate} to effectEstimate.
     * @param effectEstimate The value for effectEstimate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectEstimate(java.util.List<com.fhir.EffectEvidenceSynthesis_EffectEstimate> effectEstimate);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#effectEstimate() effectEstimate} to effectEstimate.
     * @param effectEstimate The value for effectEstimate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectEstimate(java.util.Optional<? extends java.util.List<com.fhir.EffectEvidenceSynthesis_EffectEstimate>> effectEstimate);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(com.fhir.markdown copyright);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(java.util.Optional<? extends com.fhir.markdown> copyright);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastReviewDate(com.fhir.date lastReviewDate);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastReviewDate(java.util.Optional<? extends com.fhir.date> lastReviewDate);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topic(java.util.List<com.fhir.CodeableConcept> topic);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> topic);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Builds a new {@link EffectEvidenceSynthesis EffectEvidenceSynthesis}.
     * @return An immutable instance of EffectEvidenceSynthesis
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    EffectEvidenceSynthesis build();
  }
}
