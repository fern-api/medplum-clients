//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Measure}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMeasure.builder()}.
 */
@org.immutables.value.Generated(from = "Measure", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMeasure implements com.fhir.Measure {
  private final @javax.annotation.Nullable com.fhir.markdown clinicalRecommendationStatement;
  private final @javax.annotation.Nullable java.lang.String rateAggregation;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable java.lang.String usage;
  private final @javax.annotation.Nullable java.lang.String subtitle;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept subjectCodeableConcept;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Measure_SupplementalData> supplementalData;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept scoring;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept improvementNotation;
  private final @javax.annotation.Nullable com.fhir.Reference subjectReference;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author;
  private final @javax.annotation.Nullable com.fhir.markdown guidance;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable com.fhir.markdown copyright;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.date lastReviewDate;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic;
  private final @javax.annotation.Nullable com.fhir.markdown purpose;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable com.fhir.markdown rationale;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.lang.String riskAdjustment;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept compositeScoring;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type;
  private final @javax.annotation.Nullable com.fhir.Period effectivePeriod;
  private final @javax.annotation.Nullable com.fhir.date approvalDate;
  private final @javax.annotation.Nullable java.util.List<com.fhir.markdown> definition;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable java.lang.Boolean experimental;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Measure_Group> group;
  private final @javax.annotation.Nullable com.fhir.MeasureStatus status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> library;
  private final @javax.annotation.Nullable com.fhir.markdown disclaimer;

  private ImmutableMeasure(
      @javax.annotation.Nullable com.fhir.markdown clinicalRecommendationStatement,
      @javax.annotation.Nullable java.lang.String rateAggregation,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable java.lang.String usage,
      @javax.annotation.Nullable java.lang.String subtitle,
      @javax.annotation.Nullable com.fhir.CodeableConcept subjectCodeableConcept,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser,
      @javax.annotation.Nullable java.util.List<com.fhir.Measure_SupplementalData> supplementalData,
      @javax.annotation.Nullable com.fhir.CodeableConcept scoring,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.CodeableConcept improvementNotation,
      @javax.annotation.Nullable com.fhir.Reference subjectReference,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author,
      @javax.annotation.Nullable com.fhir.markdown guidance,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable com.fhir.markdown copyright,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.date lastReviewDate,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic,
      @javax.annotation.Nullable com.fhir.markdown purpose,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable com.fhir.markdown rationale,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.lang.String riskAdjustment,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable com.fhir.CodeableConcept compositeScoring,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type,
      @javax.annotation.Nullable com.fhir.Period effectivePeriod,
      @javax.annotation.Nullable com.fhir.date approvalDate,
      @javax.annotation.Nullable java.util.List<com.fhir.markdown> definition,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable java.lang.Boolean experimental,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable java.util.List<com.fhir.Measure_Group> group,
      @javax.annotation.Nullable com.fhir.MeasureStatus status,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> library,
      @javax.annotation.Nullable com.fhir.markdown disclaimer) {
    this.clinicalRecommendationStatement = clinicalRecommendationStatement;
    this.rateAggregation = rateAggregation;
    this.meta = meta;
    this.title = title;
    this.usage = usage;
    this.subtitle = subtitle;
    this.subjectCodeableConcept = subjectCodeableConcept;
    this.modifierExtension = modifierExtension;
    this.endorser = endorser;
    this.supplementalData = supplementalData;
    this.scoring = scoring;
    this.resourceType = resourceType;
    this.implicitRules = implicitRules;
    this.extension = extension;
    this.improvementNotation = improvementNotation;
    this.subjectReference = subjectReference;
    this.language = language;
    this.author = author;
    this.guidance = guidance;
    this.date = date;
    this.contact = contact;
    this.copyright = copyright;
    this.editor = editor;
    this.publisher = publisher;
    this.identifier = identifier;
    this.lastReviewDate = lastReviewDate;
    this.useContext = useContext;
    this.topic = topic;
    this.purpose = purpose;
    this.id = id;
    this.relatedArtifact = relatedArtifact;
    this.text = text;
    this.description = description;
    this.rationale = rationale;
    this.contained = contained;
    this.riskAdjustment = riskAdjustment;
    this.version = version;
    this.compositeScoring = compositeScoring;
    this.type = type;
    this.effectivePeriod = effectivePeriod;
    this.approvalDate = approvalDate;
    this.definition = definition;
    this.reviewer = reviewer;
    this.name = name;
    this.jurisdiction = jurisdiction;
    this.experimental = experimental;
    this.url = url;
    this.group = group;
    this.status = status;
    this.library = library;
    this.disclaimer = disclaimer;
  }

  /**
   * @return The value of the {@code clinicalRecommendationStatement} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("clinicalRecommendationStatement")
  @Override
  public java.util.Optional<com.fhir.markdown> clinicalRecommendationStatement() {
    return java.util.Optional.ofNullable(clinicalRecommendationStatement);
  }

  /**
   * @return The value of the {@code rateAggregation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("rateAggregation")
  @Override
  public java.util.Optional<java.lang.String> rateAggregation() {
    return java.util.Optional.ofNullable(rateAggregation);
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
   * @return The value of the {@code title} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  @Override
  public java.util.Optional<java.lang.String> title() {
    return java.util.Optional.ofNullable(title);
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
   * @return The value of the {@code supplementalData} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("supplementalData")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Measure_SupplementalData>> supplementalData() {
    return java.util.Optional.ofNullable(supplementalData);
  }

  /**
   * @return The value of the {@code scoring} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("scoring")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> scoring() {
    return java.util.Optional.ofNullable(scoring);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code improvementNotation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("improvementNotation")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> improvementNotation() {
    return java.util.Optional.ofNullable(improvementNotation);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
   * @return The value of the {@code guidance} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("guidance")
  @Override
  public java.util.Optional<com.fhir.markdown> guidance() {
    return java.util.Optional.ofNullable(guidance);
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
   * @return The value of the {@code copyright} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("copyright")
  @Override
  public java.util.Optional<com.fhir.markdown> copyright() {
    return java.util.Optional.ofNullable(copyright);
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
   * @return The value of the {@code publisher} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("publisher")
  @Override
  public java.util.Optional<java.lang.String> publisher() {
    return java.util.Optional.ofNullable(publisher);
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
   * @return The value of the {@code lastReviewDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("lastReviewDate")
  @Override
  public java.util.Optional<com.fhir.date> lastReviewDate() {
    return java.util.Optional.ofNullable(lastReviewDate);
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
   * @return The value of the {@code topic} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("topic")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic() {
    return java.util.Optional.ofNullable(topic);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
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
   * @return The value of the {@code rationale} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("rationale")
  @Override
  public java.util.Optional<com.fhir.markdown> rationale() {
    return java.util.Optional.ofNullable(rationale);
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
   * @return The value of the {@code riskAdjustment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("riskAdjustment")
  @Override
  public java.util.Optional<java.lang.String> riskAdjustment() {
    return java.util.Optional.ofNullable(riskAdjustment);
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
   * @return The value of the {@code compositeScoring} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("compositeScoring")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> compositeScoring() {
    return java.util.Optional.ofNullable(compositeScoring);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type() {
    return java.util.Optional.ofNullable(type);
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
   * @return The value of the {@code approvalDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("approvalDate")
  @Override
  public java.util.Optional<com.fhir.date> approvalDate() {
    return java.util.Optional.ofNullable(approvalDate);
  }

  /**
   * @return The value of the {@code definition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("definition")
  @Override
  public java.util.Optional<java.util.List<com.fhir.markdown>> definition() {
    return java.util.Optional.ofNullable(definition);
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() {
    return java.util.Optional.ofNullable(jurisdiction);
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
   * @return The value of the {@code url} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @Override
  public java.util.Optional<com.fhir.uri> url() {
    return java.util.Optional.ofNullable(url);
  }

  /**
   * @return The value of the {@code group} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("group")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Measure_Group>> group() {
    return java.util.Optional.ofNullable(group);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.MeasureStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code disclaimer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("disclaimer")
  @Override
  public java.util.Optional<com.fhir.markdown> disclaimer() {
    return java.util.Optional.ofNullable(disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#clinicalRecommendationStatement() clinicalRecommendationStatement} attribute.
   * @param value The value for clinicalRecommendationStatement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withClinicalRecommendationStatement(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "clinicalRecommendationStatement");
    if (this.clinicalRecommendationStatement == newValue) return this;
    return new ImmutableMeasure(
        newValue,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#clinicalRecommendationStatement() clinicalRecommendationStatement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for clinicalRecommendationStatement
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withClinicalRecommendationStatement(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.clinicalRecommendationStatement == value) return this;
    return new ImmutableMeasure(
        value,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#rateAggregation() rateAggregation} attribute.
   * @param value The value for rateAggregation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withRateAggregation(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "rateAggregation");
    if (java.util.Objects.equals(this.rateAggregation, newValue)) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        newValue,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#rateAggregation() rateAggregation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rateAggregation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withRateAggregation(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.rateAggregation, value)) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        value,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        newValue,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        value,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        newValue,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        value,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#usage() usage} attribute.
   * @param value The value for usage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withUsage(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "usage");
    if (java.util.Objects.equals(this.usage, newValue)) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        newValue,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#usage() usage} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withUsage(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.usage, value)) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        value,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#subtitle() subtitle} attribute.
   * @param value The value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withSubtitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "subtitle");
    if (java.util.Objects.equals(this.subtitle, newValue)) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        newValue,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#subtitle() subtitle} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withSubtitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.subtitle, value)) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        value,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * @param value The value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withSubjectCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "subjectCodeableConcept");
    if (this.subjectCodeableConcept == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        newValue,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withSubjectCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.subjectCodeableConcept == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        value,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        newValue,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        value,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#endorser() endorser} attribute.
   * @param value The value for endorser
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withEndorser(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "endorser");
    if (this.endorser == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        newValue,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#endorser() endorser} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endorser
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withEndorser(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.endorser == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        value,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#supplementalData() supplementalData} attribute.
   * @param value The value for supplementalData
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withSupplementalData(java.util.List<com.fhir.Measure_SupplementalData> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Measure_SupplementalData> newValue = java.util.Objects.requireNonNull(value, "supplementalData");
    if (this.supplementalData == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        newValue,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#supplementalData() supplementalData} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supplementalData
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withSupplementalData(java.util.Optional<? extends java.util.List<com.fhir.Measure_SupplementalData>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Measure_SupplementalData> value = optional.orElse(null);
    if (this.supplementalData == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        value,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#scoring() scoring} attribute.
   * @param value The value for scoring
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withScoring(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "scoring");
    if (this.scoring == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        newValue,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#scoring() scoring} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for scoring
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withScoring(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.scoring == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        value,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Measure#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMeasure withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        newValue,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        newValue,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        value,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        newValue,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        value,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#improvementNotation() improvementNotation} attribute.
   * @param value The value for improvementNotation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withImprovementNotation(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "improvementNotation");
    if (this.improvementNotation == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        newValue,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#improvementNotation() improvementNotation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for improvementNotation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withImprovementNotation(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.improvementNotation == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        value,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#subjectReference() subjectReference} attribute.
   * @param value The value for subjectReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withSubjectReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subjectReference");
    if (this.subjectReference == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        newValue,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#subjectReference() subjectReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withSubjectReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subjectReference == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        value,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        newValue,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        value,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withAuthor(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        newValue,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withAuthor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        value,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#guidance() guidance} attribute.
   * @param value The value for guidance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withGuidance(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "guidance");
    if (this.guidance == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        newValue,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#guidance() guidance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for guidance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withGuidance(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.guidance == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        value,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        newValue,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        value,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        newValue,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        value,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withCopyright(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        newValue,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withCopyright(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        value,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#editor() editor} attribute.
   * @param value The value for editor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withEditor(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "editor");
    if (this.editor == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        newValue,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#editor() editor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for editor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withEditor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.editor == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        value,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        newValue,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        value,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        newValue,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        value,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#lastReviewDate() lastReviewDate} attribute.
   * @param value The value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withLastReviewDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "lastReviewDate");
    if (this.lastReviewDate == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        newValue,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#lastReviewDate() lastReviewDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withLastReviewDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.lastReviewDate == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        value,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        newValue,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        value,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#topic() topic} attribute.
   * @param value The value for topic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withTopic(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "topic");
    if (this.topic == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        newValue,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#topic() topic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withTopic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.topic == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        value,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withPurpose(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        newValue,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withPurpose(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        value,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        newValue,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        value,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#relatedArtifact() relatedArtifact} attribute.
   * @param value The value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withRelatedArtifact(java.util.List<com.fhir.RelatedArtifact> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> newValue = java.util.Objects.requireNonNull(value, "relatedArtifact");
    if (this.relatedArtifact == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        newValue,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#relatedArtifact() relatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withRelatedArtifact(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> value = optional.orElse(null);
    if (this.relatedArtifact == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        value,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        newValue,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        value,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        newValue,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        value,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#rationale() rationale} attribute.
   * @param value The value for rationale
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withRationale(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "rationale");
    if (this.rationale == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        newValue,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#rationale() rationale} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rationale
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withRationale(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.rationale == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        value,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        newValue,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        value,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#riskAdjustment() riskAdjustment} attribute.
   * @param value The value for riskAdjustment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withRiskAdjustment(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "riskAdjustment");
    if (java.util.Objects.equals(this.riskAdjustment, newValue)) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        newValue,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#riskAdjustment() riskAdjustment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for riskAdjustment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withRiskAdjustment(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.riskAdjustment, value)) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        value,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        newValue,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        value,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#compositeScoring() compositeScoring} attribute.
   * @param value The value for compositeScoring
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withCompositeScoring(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "compositeScoring");
    if (this.compositeScoring == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        newValue,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#compositeScoring() compositeScoring} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for compositeScoring
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withCompositeScoring(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.compositeScoring == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        value,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withType(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        newValue,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        value,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withEffectivePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        newValue,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withEffectivePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        value,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#approvalDate() approvalDate} attribute.
   * @param value The value for approvalDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withApprovalDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "approvalDate");
    if (this.approvalDate == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        newValue,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#approvalDate() approvalDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for approvalDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withApprovalDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.approvalDate == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        value,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#definition() definition} attribute.
   * @param value The value for definition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withDefinition(java.util.List<com.fhir.markdown> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.markdown> newValue = java.util.Objects.requireNonNull(value, "definition");
    if (this.definition == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        newValue,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#definition() definition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withDefinition(java.util.Optional<? extends java.util.List<com.fhir.markdown>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.markdown> value = optional.orElse(null);
    if (this.definition == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        value,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#reviewer() reviewer} attribute.
   * @param value The value for reviewer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withReviewer(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "reviewer");
    if (this.reviewer == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        newValue,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#reviewer() reviewer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reviewer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withReviewer(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.reviewer == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        value,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        newValue,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        value,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        newValue,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        value,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withExperimental(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        newValue,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withExperimental(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.experimental, value)) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        value,
        this.url,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        newValue,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        value,
        this.group,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#group() group} attribute.
   * @param value The value for group
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withGroup(java.util.List<com.fhir.Measure_Group> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Measure_Group> newValue = java.util.Objects.requireNonNull(value, "group");
    if (this.group == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        newValue,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#group() group} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for group
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withGroup(java.util.Optional<? extends java.util.List<com.fhir.Measure_Group>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Measure_Group> value = optional.orElse(null);
    if (this.group == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        value,
        this.status,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withStatus(com.fhir.MeasureStatus value) {
    @javax.annotation.Nullable com.fhir.MeasureStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        newValue,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withStatus(java.util.Optional<? extends com.fhir.MeasureStatus> optional) {
    @javax.annotation.Nullable com.fhir.MeasureStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        value,
        this.library,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#library() library} attribute.
   * @param value The value for library
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withLibrary(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "library");
    if (this.library == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        newValue,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#library() library} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for library
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withLibrary(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.library == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        value,
        this.disclaimer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Measure#disclaimer() disclaimer} attribute.
   * @param value The value for disclaimer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasure withDisclaimer(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "disclaimer");
    if (this.disclaimer == newValue) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Measure#disclaimer() disclaimer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for disclaimer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasure withDisclaimer(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.disclaimer == value) return this;
    return new ImmutableMeasure(
        this.clinicalRecommendationStatement,
        this.rateAggregation,
        this.meta,
        this.title,
        this.usage,
        this.subtitle,
        this.subjectCodeableConcept,
        this.modifierExtension,
        this.endorser,
        this.supplementalData,
        this.scoring,
        this.resourceType,
        this.implicitRules,
        this.extension,
        this.improvementNotation,
        this.subjectReference,
        this.language,
        this.author,
        this.guidance,
        this.date,
        this.contact,
        this.copyright,
        this.editor,
        this.publisher,
        this.identifier,
        this.lastReviewDate,
        this.useContext,
        this.topic,
        this.purpose,
        this.id,
        this.relatedArtifact,
        this.text,
        this.description,
        this.rationale,
        this.contained,
        this.riskAdjustment,
        this.version,
        this.compositeScoring,
        this.type,
        this.effectivePeriod,
        this.approvalDate,
        this.definition,
        this.reviewer,
        this.name,
        this.jurisdiction,
        this.experimental,
        this.url,
        this.group,
        this.status,
        this.library,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMeasure} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMeasure
        && equalTo((ImmutableMeasure) another);
  }

  private boolean equalTo(ImmutableMeasure another) {
    return java.util.Objects.equals(clinicalRecommendationStatement, another.clinicalRecommendationStatement)
        && java.util.Objects.equals(rateAggregation, another.rateAggregation)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(usage, another.usage)
        && java.util.Objects.equals(subtitle, another.subtitle)
        && java.util.Objects.equals(subjectCodeableConcept, another.subjectCodeableConcept)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(endorser, another.endorser)
        && java.util.Objects.equals(supplementalData, another.supplementalData)
        && java.util.Objects.equals(scoring, another.scoring)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(improvementNotation, another.improvementNotation)
        && java.util.Objects.equals(subjectReference, another.subjectReference)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(author, another.author)
        && java.util.Objects.equals(guidance, another.guidance)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(copyright, another.copyright)
        && java.util.Objects.equals(editor, another.editor)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(lastReviewDate, another.lastReviewDate)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(topic, another.topic)
        && java.util.Objects.equals(purpose, another.purpose)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(relatedArtifact, another.relatedArtifact)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(rationale, another.rationale)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(riskAdjustment, another.riskAdjustment)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(compositeScoring, another.compositeScoring)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(effectivePeriod, another.effectivePeriod)
        && java.util.Objects.equals(approvalDate, another.approvalDate)
        && java.util.Objects.equals(definition, another.definition)
        && java.util.Objects.equals(reviewer, another.reviewer)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(experimental, another.experimental)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(group, another.group)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(library, another.library)
        && java.util.Objects.equals(disclaimer, another.disclaimer);
  }

  /**
   * Computes a hash code from attributes: {@code clinicalRecommendationStatement}, {@code rateAggregation}, {@code meta}, {@code title}, {@code usage}, {@code subtitle}, {@code subjectCodeableConcept}, {@code modifierExtension}, {@code endorser}, {@code supplementalData}, {@code scoring}, {@code resourceType}, {@code implicitRules}, {@code extension}, {@code improvementNotation}, {@code subjectReference}, {@code language}, {@code author}, {@code guidance}, {@code date}, {@code contact}, {@code copyright}, {@code editor}, {@code publisher}, {@code identifier}, {@code lastReviewDate}, {@code useContext}, {@code topic}, {@code purpose}, {@code id}, {@code relatedArtifact}, {@code text}, {@code description}, {@code rationale}, {@code contained}, {@code riskAdjustment}, {@code version}, {@code compositeScoring}, {@code type}, {@code effectivePeriod}, {@code approvalDate}, {@code definition}, {@code reviewer}, {@code name}, {@code jurisdiction}, {@code experimental}, {@code url}, {@code group}, {@code status}, {@code library}, {@code disclaimer}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(clinicalRecommendationStatement);
    h += (h << 5) + java.util.Objects.hashCode(rateAggregation);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(usage);
    h += (h << 5) + java.util.Objects.hashCode(subtitle);
    h += (h << 5) + java.util.Objects.hashCode(subjectCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(endorser);
    h += (h << 5) + java.util.Objects.hashCode(supplementalData);
    h += (h << 5) + java.util.Objects.hashCode(scoring);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(improvementNotation);
    h += (h << 5) + java.util.Objects.hashCode(subjectReference);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(author);
    h += (h << 5) + java.util.Objects.hashCode(guidance);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(copyright);
    h += (h << 5) + java.util.Objects.hashCode(editor);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(lastReviewDate);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(topic);
    h += (h << 5) + java.util.Objects.hashCode(purpose);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(relatedArtifact);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(rationale);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(riskAdjustment);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(compositeScoring);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(effectivePeriod);
    h += (h << 5) + java.util.Objects.hashCode(approvalDate);
    h += (h << 5) + java.util.Objects.hashCode(definition);
    h += (h << 5) + java.util.Objects.hashCode(reviewer);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(experimental);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(group);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(library);
    h += (h << 5) + java.util.Objects.hashCode(disclaimer);
    return h;
  }

  /**
   * Prints the immutable value {@code Measure} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Measure{");
    if (clinicalRecommendationStatement != null) {
      builder.append("clinicalRecommendationStatement=").append(clinicalRecommendationStatement);
    }
    if (rateAggregation != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("rateAggregation=").append(rateAggregation);
    }
    if (meta != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (title != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (usage != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("usage=").append(usage);
    }
    if (subtitle != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("subtitle=").append(subtitle);
    }
    if (subjectCodeableConcept != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("subjectCodeableConcept=").append(subjectCodeableConcept);
    }
    if (modifierExtension != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (endorser != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("endorser=").append(endorser);
    }
    if (supplementalData != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("supplementalData=").append(supplementalData);
    }
    if (scoring != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("scoring=").append(scoring);
    }
    if (builder.length() > 8) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (improvementNotation != null) {
      builder.append(", ");
      builder.append("improvementNotation=").append(improvementNotation);
    }
    if (subjectReference != null) {
      builder.append(", ");
      builder.append("subjectReference=").append(subjectReference);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (author != null) {
      builder.append(", ");
      builder.append("author=").append(author);
    }
    if (guidance != null) {
      builder.append(", ");
      builder.append("guidance=").append(guidance);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (editor != null) {
      builder.append(", ");
      builder.append("editor=").append(editor);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (lastReviewDate != null) {
      builder.append(", ");
      builder.append("lastReviewDate=").append(lastReviewDate);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (topic != null) {
      builder.append(", ");
      builder.append("topic=").append(topic);
    }
    if (purpose != null) {
      builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (relatedArtifact != null) {
      builder.append(", ");
      builder.append("relatedArtifact=").append(relatedArtifact);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (rationale != null) {
      builder.append(", ");
      builder.append("rationale=").append(rationale);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (riskAdjustment != null) {
      builder.append(", ");
      builder.append("riskAdjustment=").append(riskAdjustment);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (compositeScoring != null) {
      builder.append(", ");
      builder.append("compositeScoring=").append(compositeScoring);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (effectivePeriod != null) {
      builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (approvalDate != null) {
      builder.append(", ");
      builder.append("approvalDate=").append(approvalDate);
    }
    if (definition != null) {
      builder.append(", ");
      builder.append("definition=").append(definition);
    }
    if (reviewer != null) {
      builder.append(", ");
      builder.append("reviewer=").append(reviewer);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (group != null) {
      builder.append(", ");
      builder.append("group=").append(group);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (library != null) {
      builder.append(", ");
      builder.append("library=").append(library);
    }
    if (disclaimer != null) {
      builder.append(", ");
      builder.append("disclaimer=").append(disclaimer);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Measure", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Measure {
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> clinicalRecommendationStatement = java.util.Optional.empty();
    boolean clinicalRecommendationStatementIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> rateAggregation = java.util.Optional.empty();
    boolean rateAggregationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> usage = java.util.Optional.empty();
    boolean usageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> subtitle = java.util.Optional.empty();
    boolean subtitleIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> subjectCodeableConcept = java.util.Optional.empty();
    boolean subjectCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser = java.util.Optional.empty();
    boolean endorserIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Measure_SupplementalData>> supplementalData = java.util.Optional.empty();
    boolean supplementalDataIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> scoring = java.util.Optional.empty();
    boolean scoringIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> improvementNotation = java.util.Optional.empty();
    boolean improvementNotationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subjectReference = java.util.Optional.empty();
    boolean subjectReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> author = java.util.Optional.empty();
    boolean authorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> guidance = java.util.Optional.empty();
    boolean guidanceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> copyright = java.util.Optional.empty();
    boolean copyrightIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor = java.util.Optional.empty();
    boolean editorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> lastReviewDate = java.util.Optional.empty();
    boolean lastReviewDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic = java.util.Optional.empty();
    boolean topicIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> purpose = java.util.Optional.empty();
    boolean purposeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact = java.util.Optional.empty();
    boolean relatedArtifactIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> rationale = java.util.Optional.empty();
    boolean rationaleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> riskAdjustment = java.util.Optional.empty();
    boolean riskAdjustmentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> compositeScoring = java.util.Optional.empty();
    boolean compositeScoringIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> effectivePeriod = java.util.Optional.empty();
    boolean effectivePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> approvalDate = java.util.Optional.empty();
    boolean approvalDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.markdown>> definition = java.util.Optional.empty();
    boolean definitionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer = java.util.Optional.empty();
    boolean reviewerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> experimental = java.util.Optional.empty();
    boolean experimentalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Measure_Group>> group = java.util.Optional.empty();
    boolean groupIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.MeasureStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> library = java.util.Optional.empty();
    boolean libraryIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> disclaimer = java.util.Optional.empty();
    boolean disclaimerIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("clinicalRecommendationStatement")
    public void setClinicalRecommendationStatement(java.util.Optional<com.fhir.markdown> clinicalRecommendationStatement) {
      this.clinicalRecommendationStatement = clinicalRecommendationStatement;
      this.clinicalRecommendationStatementIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("rateAggregation")
    public void setRateAggregation(java.util.Optional<java.lang.String> rateAggregation) {
      this.rateAggregation = rateAggregation;
      this.rateAggregationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    public void setUsage(java.util.Optional<java.lang.String> usage) {
      this.usage = usage;
      this.usageIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("supplementalData")
    public void setSupplementalData(java.util.Optional<java.util.List<com.fhir.Measure_SupplementalData>> supplementalData) {
      this.supplementalData = supplementalData;
      this.supplementalDataIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("scoring")
    public void setScoring(java.util.Optional<com.fhir.CodeableConcept> scoring) {
      this.scoring = scoring;
      this.scoringIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("improvementNotation")
    public void setImprovementNotation(java.util.Optional<com.fhir.CodeableConcept> improvementNotation) {
      this.improvementNotation = improvementNotation;
      this.improvementNotationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subjectReference")
    public void setSubjectReference(java.util.Optional<com.fhir.Reference> subjectReference) {
      this.subjectReference = subjectReference;
      this.subjectReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public void setAuthor(java.util.Optional<java.util.List<com.fhir.ContactDetail>> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("guidance")
    public void setGuidance(java.util.Optional<com.fhir.markdown> guidance) {
      this.guidance = guidance;
      this.guidanceIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("copyright")
    public void setCopyright(java.util.Optional<com.fhir.markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("editor")
    public void setEditor(java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor) {
      this.editor = editor;
      this.editorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public void setPublisher(java.util.Optional<java.lang.String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lastReviewDate")
    public void setLastReviewDate(java.util.Optional<com.fhir.date> lastReviewDate) {
      this.lastReviewDate = lastReviewDate;
      this.lastReviewDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public void setUseContext(java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("topic")
    public void setTopic(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic) {
      this.topic = topic;
      this.topicIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    public void setPurpose(java.util.Optional<com.fhir.markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("relatedArtifact")
    public void setRelatedArtifact(java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact) {
      this.relatedArtifact = relatedArtifact;
      this.relatedArtifactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("rationale")
    public void setRationale(java.util.Optional<com.fhir.markdown> rationale) {
      this.rationale = rationale;
      this.rationaleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("riskAdjustment")
    public void setRiskAdjustment(java.util.Optional<java.lang.String> riskAdjustment) {
      this.riskAdjustment = riskAdjustment;
      this.riskAdjustmentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("compositeScoring")
    public void setCompositeScoring(java.util.Optional<com.fhir.CodeableConcept> compositeScoring) {
      this.compositeScoring = compositeScoring;
      this.compositeScoringIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
    public void setEffectivePeriod(java.util.Optional<com.fhir.Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("approvalDate")
    public void setApprovalDate(java.util.Optional<com.fhir.date> approvalDate) {
      this.approvalDate = approvalDate;
      this.approvalDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("definition")
    public void setDefinition(java.util.Optional<java.util.List<com.fhir.markdown>> definition) {
      this.definition = definition;
      this.definitionIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("experimental")
    public void setExperimental(java.util.Optional<java.lang.Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("group")
    public void setGroup(java.util.Optional<java.util.List<com.fhir.Measure_Group>> group) {
      this.group = group;
      this.groupIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.MeasureStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("library")
    public void setLibrary(java.util.Optional<java.util.List<com.fhir.canonical>> library) {
      this.library = library;
      this.libraryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("disclaimer")
    public void setDisclaimer(java.util.Optional<com.fhir.markdown> disclaimer) {
      this.disclaimer = disclaimer;
      this.disclaimerIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.markdown> clinicalRecommendationStatement() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> rateAggregation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> usage() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> subtitle() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> subjectCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Measure_SupplementalData>> supplementalData() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> scoring() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> improvementNotation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subjectReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> author() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> guidance() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> lastReviewDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> rationale() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> riskAdjustment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> compositeScoring() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> approvalDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.markdown>> definition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Measure_Group>> group() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.MeasureStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> library() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> disclaimer() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMeasure fromJson(Json json) {
    ImmutableMeasure.Builder builder = ((ImmutableMeasure.Builder) ImmutableMeasure.builder());
    if (json.clinicalRecommendationStatementIsSet) {
      builder.clinicalRecommendationStatement(json.clinicalRecommendationStatement);
    }
    if (json.rateAggregationIsSet) {
      builder.rateAggregation(json.rateAggregation);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.usageIsSet) {
      builder.usage(json.usage);
    }
    if (json.subtitleIsSet) {
      builder.subtitle(json.subtitle);
    }
    if (json.subjectCodeableConceptIsSet) {
      builder.subjectCodeableConcept(json.subjectCodeableConcept);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.endorserIsSet) {
      builder.endorser(json.endorser);
    }
    if (json.supplementalDataIsSet) {
      builder.supplementalData(json.supplementalData);
    }
    if (json.scoringIsSet) {
      builder.scoring(json.scoring);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.improvementNotationIsSet) {
      builder.improvementNotation(json.improvementNotation);
    }
    if (json.subjectReferenceIsSet) {
      builder.subjectReference(json.subjectReference);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.guidanceIsSet) {
      builder.guidance(json.guidance);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.editorIsSet) {
      builder.editor(json.editor);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.lastReviewDateIsSet) {
      builder.lastReviewDate(json.lastReviewDate);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.topicIsSet) {
      builder.topic(json.topic);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.relatedArtifactIsSet) {
      builder.relatedArtifact(json.relatedArtifact);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.rationaleIsSet) {
      builder.rationale(json.rationale);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.riskAdjustmentIsSet) {
      builder.riskAdjustment(json.riskAdjustment);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.compositeScoringIsSet) {
      builder.compositeScoring(json.compositeScoring);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.approvalDateIsSet) {
      builder.approvalDate(json.approvalDate);
    }
    if (json.definitionIsSet) {
      builder.definition(json.definition);
    }
    if (json.reviewerIsSet) {
      builder.reviewer(json.reviewer);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.groupIsSet) {
      builder.group(json.group);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.libraryIsSet) {
      builder.library(json.library);
    }
    if (json.disclaimerIsSet) {
      builder.disclaimer(json.disclaimer);
    }
    return (ImmutableMeasure) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Measure} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Measure instance
   */
  public static Measure copyOf(Measure instance) {
    if (instance instanceof ImmutableMeasure) {
      return (ImmutableMeasure) instance;
    }
    return ((ImmutableMeasure.Builder) ImmutableMeasure.builder())
        .clinicalRecommendationStatement(instance.clinicalRecommendationStatement())
        .rateAggregation(instance.rateAggregation())
        .meta(instance.meta())
        .title(instance.title())
        .usage(instance.usage())
        .subtitle(instance.subtitle())
        .subjectCodeableConcept(instance.subjectCodeableConcept())
        .modifierExtension(instance.modifierExtension())
        .endorser(instance.endorser())
        .supplementalData(instance.supplementalData())
        .scoring(instance.scoring())
        .resourceType(instance.resourceType())
        .implicitRules(instance.implicitRules())
        .extension(instance.extension())
        .improvementNotation(instance.improvementNotation())
        .subjectReference(instance.subjectReference())
        .language(instance.language())
        .author(instance.author())
        .guidance(instance.guidance())
        .date(instance.date())
        .contact(instance.contact())
        .copyright(instance.copyright())
        .editor(instance.editor())
        .publisher(instance.publisher())
        .identifier(instance.identifier())
        .lastReviewDate(instance.lastReviewDate())
        .useContext(instance.useContext())
        .topic(instance.topic())
        .purpose(instance.purpose())
        .id(instance.id())
        .relatedArtifact(instance.relatedArtifact())
        .text(instance.text())
        .description(instance.description())
        .rationale(instance.rationale())
        .contained(instance.contained())
        .riskAdjustment(instance.riskAdjustment())
        .version(instance.version())
        .compositeScoring(instance.compositeScoring())
        .type(instance.type())
        .effectivePeriod(instance.effectivePeriod())
        .approvalDate(instance.approvalDate())
        .definition(instance.definition())
        .reviewer(instance.reviewer())
        .name(instance.name())
        .jurisdiction(instance.jurisdiction())
        .experimental(instance.experimental())
        .url(instance.url())
        .group(instance.group())
        .status(instance.status())
        .library(instance.library())
        .disclaimer(instance.disclaimer())
        .build();
  }

  /**
   * Creates a builder for {@link Measure Measure}.
   * <pre>
   * ImmutableMeasure.builder()
   *    .clinicalRecommendationStatement(com.fhir.markdown) // optional {@link Measure#clinicalRecommendationStatement() clinicalRecommendationStatement}
   *    .rateAggregation(String) // optional {@link Measure#rateAggregation() rateAggregation}
   *    .meta(com.fhir.Meta) // optional {@link Measure#meta() meta}
   *    .title(String) // optional {@link Measure#title() title}
   *    .usage(String) // optional {@link Measure#usage() usage}
   *    .subtitle(String) // optional {@link Measure#subtitle() subtitle}
   *    .subjectCodeableConcept(com.fhir.CodeableConcept) // optional {@link Measure#subjectCodeableConcept() subjectCodeableConcept}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Measure#modifierExtension() modifierExtension}
   *    .endorser(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link Measure#endorser() endorser}
   *    .supplementalData(List&amp;lt;com.fhir.Measure_SupplementalData&amp;gt;) // optional {@link Measure#supplementalData() supplementalData}
   *    .scoring(com.fhir.CodeableConcept) // optional {@link Measure#scoring() scoring}
   *    .resourceType(String) // required {@link Measure#resourceType() resourceType}
   *    .implicitRules(com.fhir.uri) // optional {@link Measure#implicitRules() implicitRules}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Measure#extension() extension}
   *    .improvementNotation(com.fhir.CodeableConcept) // optional {@link Measure#improvementNotation() improvementNotation}
   *    .subjectReference(com.fhir.Reference) // optional {@link Measure#subjectReference() subjectReference}
   *    .language(com.fhir.code) // optional {@link Measure#language() language}
   *    .author(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link Measure#author() author}
   *    .guidance(com.fhir.markdown) // optional {@link Measure#guidance() guidance}
   *    .date(com.fhir.dateTime) // optional {@link Measure#date() date}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link Measure#contact() contact}
   *    .copyright(com.fhir.markdown) // optional {@link Measure#copyright() copyright}
   *    .editor(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link Measure#editor() editor}
   *    .publisher(String) // optional {@link Measure#publisher() publisher}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Measure#identifier() identifier}
   *    .lastReviewDate(com.fhir.date) // optional {@link Measure#lastReviewDate() lastReviewDate}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link Measure#useContext() useContext}
   *    .topic(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Measure#topic() topic}
   *    .purpose(com.fhir.markdown) // optional {@link Measure#purpose() purpose}
   *    .id(com.fhir.id) // optional {@link Measure#id() id}
   *    .relatedArtifact(List&amp;lt;com.fhir.RelatedArtifact&amp;gt;) // optional {@link Measure#relatedArtifact() relatedArtifact}
   *    .text(com.fhir.Narrative) // optional {@link Measure#text() text}
   *    .description(com.fhir.markdown) // optional {@link Measure#description() description}
   *    .rationale(com.fhir.markdown) // optional {@link Measure#rationale() rationale}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Measure#contained() contained}
   *    .riskAdjustment(String) // optional {@link Measure#riskAdjustment() riskAdjustment}
   *    .version(String) // optional {@link Measure#version() version}
   *    .compositeScoring(com.fhir.CodeableConcept) // optional {@link Measure#compositeScoring() compositeScoring}
   *    .type(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Measure#type() type}
   *    .effectivePeriod(com.fhir.Period) // optional {@link Measure#effectivePeriod() effectivePeriod}
   *    .approvalDate(com.fhir.date) // optional {@link Measure#approvalDate() approvalDate}
   *    .definition(List&amp;lt;com.fhir.markdown&amp;gt;) // optional {@link Measure#definition() definition}
   *    .reviewer(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link Measure#reviewer() reviewer}
   *    .name(String) // optional {@link Measure#name() name}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Measure#jurisdiction() jurisdiction}
   *    .experimental(Boolean) // optional {@link Measure#experimental() experimental}
   *    .url(com.fhir.uri) // optional {@link Measure#url() url}
   *    .group(List&amp;lt;com.fhir.Measure_Group&amp;gt;) // optional {@link Measure#group() group}
   *    .status(com.fhir.MeasureStatus) // optional {@link Measure#status() status}
   *    .library(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link Measure#library() library}
   *    .disclaimer(com.fhir.markdown) // optional {@link Measure#disclaimer() disclaimer}
   *    .build();
   * </pre>
   * @return A new Measure builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableMeasure.Builder();
  }

  /**
   * Builds instances of type {@link Measure Measure}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Measure", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_CLINICAL_RECOMMENDATION_STATEMENT = 0x1L;
    private static final long OPT_BIT_RATE_AGGREGATION = 0x2L;
    private static final long OPT_BIT_META = 0x4L;
    private static final long OPT_BIT_TITLE = 0x8L;
    private static final long OPT_BIT_USAGE = 0x10L;
    private static final long OPT_BIT_SUBTITLE = 0x20L;
    private static final long OPT_BIT_SUBJECT_CODEABLE_CONCEPT = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_ENDORSER = 0x100L;
    private static final long OPT_BIT_SUPPLEMENTAL_DATA = 0x200L;
    private static final long OPT_BIT_SCORING = 0x400L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x800L;
    private static final long OPT_BIT_EXTENSION = 0x1000L;
    private static final long OPT_BIT_IMPROVEMENT_NOTATION = 0x2000L;
    private static final long OPT_BIT_SUBJECT_REFERENCE = 0x4000L;
    private static final long OPT_BIT_LANGUAGE = 0x8000L;
    private static final long OPT_BIT_AUTHOR = 0x10000L;
    private static final long OPT_BIT_GUIDANCE = 0x20000L;
    private static final long OPT_BIT_DATE = 0x40000L;
    private static final long OPT_BIT_CONTACT = 0x80000L;
    private static final long OPT_BIT_COPYRIGHT = 0x100000L;
    private static final long OPT_BIT_EDITOR = 0x200000L;
    private static final long OPT_BIT_PUBLISHER = 0x400000L;
    private static final long OPT_BIT_IDENTIFIER = 0x800000L;
    private static final long OPT_BIT_LAST_REVIEW_DATE = 0x1000000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x2000000L;
    private static final long OPT_BIT_TOPIC = 0x4000000L;
    private static final long OPT_BIT_PURPOSE = 0x8000000L;
    private static final long OPT_BIT_ID = 0x10000000L;
    private static final long OPT_BIT_RELATED_ARTIFACT = 0x20000000L;
    private static final long OPT_BIT_TEXT = 0x40000000L;
    private static final long OPT_BIT_DESCRIPTION = 0x80000000L;
    private static final long OPT_BIT_RATIONALE = 0x100000000L;
    private static final long OPT_BIT_CONTAINED = 0x200000000L;
    private static final long OPT_BIT_RISK_ADJUSTMENT = 0x400000000L;
    private static final long OPT_BIT_VERSION = 0x800000000L;
    private static final long OPT_BIT_COMPOSITE_SCORING = 0x1000000000L;
    private static final long OPT_BIT_TYPE = 0x2000000000L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x4000000000L;
    private static final long OPT_BIT_APPROVAL_DATE = 0x8000000000L;
    private static final long OPT_BIT_DEFINITION = 0x10000000000L;
    private static final long OPT_BIT_REVIEWER = 0x20000000000L;
    private static final long OPT_BIT_NAME = 0x40000000000L;
    private static final long OPT_BIT_JURISDICTION = 0x80000000000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x100000000000L;
    private static final long OPT_BIT_URL = 0x200000000000L;
    private static final long OPT_BIT_GROUP = 0x400000000000L;
    private static final long OPT_BIT_STATUS = 0x800000000000L;
    private static final long OPT_BIT_LIBRARY = 0x1000000000000L;
    private static final long OPT_BIT_DISCLAIMER = 0x2000000000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.markdown clinicalRecommendationStatement;
    private @javax.annotation.Nullable java.lang.String rateAggregation;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable java.lang.String usage;
    private @javax.annotation.Nullable java.lang.String subtitle;
    private @javax.annotation.Nullable com.fhir.CodeableConcept subjectCodeableConcept;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser;
    private @javax.annotation.Nullable java.util.List<com.fhir.Measure_SupplementalData> supplementalData;
    private @javax.annotation.Nullable com.fhir.CodeableConcept scoring;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept improvementNotation;
    private @javax.annotation.Nullable com.fhir.Reference subjectReference;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author;
    private @javax.annotation.Nullable com.fhir.markdown guidance;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable com.fhir.markdown copyright;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.date lastReviewDate;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic;
    private @javax.annotation.Nullable com.fhir.markdown purpose;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable com.fhir.markdown rationale;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.lang.String riskAdjustment;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable com.fhir.CodeableConcept compositeScoring;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type;
    private @javax.annotation.Nullable com.fhir.Period effectivePeriod;
    private @javax.annotation.Nullable com.fhir.date approvalDate;
    private @javax.annotation.Nullable java.util.List<com.fhir.markdown> definition;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable java.lang.Boolean experimental;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable java.util.List<com.fhir.Measure_Group> group;
    private @javax.annotation.Nullable com.fhir.MeasureStatus status;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> library;
    private @javax.annotation.Nullable com.fhir.markdown disclaimer;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Measure#clinicalRecommendationStatement() clinicalRecommendationStatement} to clinicalRecommendationStatement.
     * @param clinicalRecommendationStatement The value for clinicalRecommendationStatement
     * @return {@code this} builder for chained invocation
     */
    public final Builder clinicalRecommendationStatement(com.fhir.markdown clinicalRecommendationStatement) {
      checkNotIsSet(clinicalRecommendationStatementIsSet(), "clinicalRecommendationStatement");
      this.clinicalRecommendationStatement = java.util.Objects.requireNonNull(clinicalRecommendationStatement, "clinicalRecommendationStatement");
      optBits |= OPT_BIT_CLINICAL_RECOMMENDATION_STATEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#clinicalRecommendationStatement() clinicalRecommendationStatement} to clinicalRecommendationStatement.
     * @param clinicalRecommendationStatement The value for clinicalRecommendationStatement
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clinicalRecommendationStatement")
    public final Builder clinicalRecommendationStatement(java.util.Optional<? extends com.fhir.markdown> clinicalRecommendationStatement) {
      checkNotIsSet(clinicalRecommendationStatementIsSet(), "clinicalRecommendationStatement");
      this.clinicalRecommendationStatement = clinicalRecommendationStatement.orElse(null);
      optBits |= OPT_BIT_CLINICAL_RECOMMENDATION_STATEMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#rateAggregation() rateAggregation} to rateAggregation.
     * @param rateAggregation The value for rateAggregation
     * @return {@code this} builder for chained invocation
     */
    public final Builder rateAggregation(java.lang.String rateAggregation) {
      checkNotIsSet(rateAggregationIsSet(), "rateAggregation");
      this.rateAggregation = java.util.Objects.requireNonNull(rateAggregation, "rateAggregation");
      optBits |= OPT_BIT_RATE_AGGREGATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#rateAggregation() rateAggregation} to rateAggregation.
     * @param rateAggregation The value for rateAggregation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rateAggregation")
    public final Builder rateAggregation(java.util.Optional<java.lang.String> rateAggregation) {
      checkNotIsSet(rateAggregationIsSet(), "rateAggregation");
      this.rateAggregation = rateAggregation.orElse(null);
      optBits |= OPT_BIT_RATE_AGGREGATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#meta() meta} to meta.
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
     * Initializes the optional value {@link Measure#meta() meta} to meta.
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
     * Initializes the optional value {@link Measure#title() title} to title.
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
     * Initializes the optional value {@link Measure#title() title} to title.
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
     * Initializes the optional value {@link Measure#usage() usage} to usage.
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
     * Initializes the optional value {@link Measure#usage() usage} to usage.
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
     * Initializes the optional value {@link Measure#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link Measure#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link Measure#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
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
     * Initializes the optional value {@link Measure#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
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
     * Initializes the optional value {@link Measure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Measure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Measure#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link Measure#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link Measure#supplementalData() supplementalData} to supplementalData.
     * @param supplementalData The value for supplementalData
     * @return {@code this} builder for chained invocation
     */
    public final Builder supplementalData(java.util.List<com.fhir.Measure_SupplementalData> supplementalData) {
      checkNotIsSet(supplementalDataIsSet(), "supplementalData");
      this.supplementalData = java.util.Objects.requireNonNull(supplementalData, "supplementalData");
      optBits |= OPT_BIT_SUPPLEMENTAL_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#supplementalData() supplementalData} to supplementalData.
     * @param supplementalData The value for supplementalData
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supplementalData")
    public final Builder supplementalData(java.util.Optional<? extends java.util.List<com.fhir.Measure_SupplementalData>> supplementalData) {
      checkNotIsSet(supplementalDataIsSet(), "supplementalData");
      this.supplementalData = supplementalData.orElse(null);
      optBits |= OPT_BIT_SUPPLEMENTAL_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#scoring() scoring} to scoring.
     * @param scoring The value for scoring
     * @return {@code this} builder for chained invocation
     */
    public final Builder scoring(com.fhir.CodeableConcept scoring) {
      checkNotIsSet(scoringIsSet(), "scoring");
      this.scoring = java.util.Objects.requireNonNull(scoring, "scoring");
      optBits |= OPT_BIT_SCORING;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#scoring() scoring} to scoring.
     * @param scoring The value for scoring
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scoring")
    public final Builder scoring(java.util.Optional<? extends com.fhir.CodeableConcept> scoring) {
      checkNotIsSet(scoringIsSet(), "scoring");
      this.scoring = scoring.orElse(null);
      optBits |= OPT_BIT_SCORING;
      return this;
    }

    /**
     * Initializes the value for the {@link Measure#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Measure#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Measure#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Measure#extension() extension} to extension.
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
     * Initializes the optional value {@link Measure#extension() extension} to extension.
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
     * Initializes the optional value {@link Measure#improvementNotation() improvementNotation} to improvementNotation.
     * @param improvementNotation The value for improvementNotation
     * @return {@code this} builder for chained invocation
     */
    public final Builder improvementNotation(com.fhir.CodeableConcept improvementNotation) {
      checkNotIsSet(improvementNotationIsSet(), "improvementNotation");
      this.improvementNotation = java.util.Objects.requireNonNull(improvementNotation, "improvementNotation");
      optBits |= OPT_BIT_IMPROVEMENT_NOTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#improvementNotation() improvementNotation} to improvementNotation.
     * @param improvementNotation The value for improvementNotation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("improvementNotation")
    public final Builder improvementNotation(java.util.Optional<? extends com.fhir.CodeableConcept> improvementNotation) {
      checkNotIsSet(improvementNotationIsSet(), "improvementNotation");
      this.improvementNotation = improvementNotation.orElse(null);
      optBits |= OPT_BIT_IMPROVEMENT_NOTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#subjectReference() subjectReference} to subjectReference.
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
     * Initializes the optional value {@link Measure#subjectReference() subjectReference} to subjectReference.
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
     * Initializes the optional value {@link Measure#language() language} to language.
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
     * Initializes the optional value {@link Measure#language() language} to language.
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
     * Initializes the optional value {@link Measure#author() author} to author.
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
     * Initializes the optional value {@link Measure#author() author} to author.
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
     * Initializes the optional value {@link Measure#guidance() guidance} to guidance.
     * @param guidance The value for guidance
     * @return {@code this} builder for chained invocation
     */
    public final Builder guidance(com.fhir.markdown guidance) {
      checkNotIsSet(guidanceIsSet(), "guidance");
      this.guidance = java.util.Objects.requireNonNull(guidance, "guidance");
      optBits |= OPT_BIT_GUIDANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#guidance() guidance} to guidance.
     * @param guidance The value for guidance
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("guidance")
    public final Builder guidance(java.util.Optional<? extends com.fhir.markdown> guidance) {
      checkNotIsSet(guidanceIsSet(), "guidance");
      this.guidance = guidance.orElse(null);
      optBits |= OPT_BIT_GUIDANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#date() date} to date.
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
     * Initializes the optional value {@link Measure#date() date} to date.
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
     * Initializes the optional value {@link Measure#contact() contact} to contact.
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
     * Initializes the optional value {@link Measure#contact() contact} to contact.
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
     * Initializes the optional value {@link Measure#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link Measure#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link Measure#editor() editor} to editor.
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
     * Initializes the optional value {@link Measure#editor() editor} to editor.
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
     * Initializes the optional value {@link Measure#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link Measure#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link Measure#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Measure#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Measure#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link Measure#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link Measure#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link Measure#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link Measure#topic() topic} to topic.
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
     * Initializes the optional value {@link Measure#topic() topic} to topic.
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
     * Initializes the optional value {@link Measure#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link Measure#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link Measure#id() id} to id.
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
     * Initializes the optional value {@link Measure#id() id} to id.
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
     * Initializes the optional value {@link Measure#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link Measure#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link Measure#text() text} to text.
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
     * Initializes the optional value {@link Measure#text() text} to text.
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
     * Initializes the optional value {@link Measure#description() description} to description.
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
     * Initializes the optional value {@link Measure#description() description} to description.
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
     * Initializes the optional value {@link Measure#rationale() rationale} to rationale.
     * @param rationale The value for rationale
     * @return {@code this} builder for chained invocation
     */
    public final Builder rationale(com.fhir.markdown rationale) {
      checkNotIsSet(rationaleIsSet(), "rationale");
      this.rationale = java.util.Objects.requireNonNull(rationale, "rationale");
      optBits |= OPT_BIT_RATIONALE;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#rationale() rationale} to rationale.
     * @param rationale The value for rationale
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rationale")
    public final Builder rationale(java.util.Optional<? extends com.fhir.markdown> rationale) {
      checkNotIsSet(rationaleIsSet(), "rationale");
      this.rationale = rationale.orElse(null);
      optBits |= OPT_BIT_RATIONALE;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#contained() contained} to contained.
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
     * Initializes the optional value {@link Measure#contained() contained} to contained.
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
     * Initializes the optional value {@link Measure#riskAdjustment() riskAdjustment} to riskAdjustment.
     * @param riskAdjustment The value for riskAdjustment
     * @return {@code this} builder for chained invocation
     */
    public final Builder riskAdjustment(java.lang.String riskAdjustment) {
      checkNotIsSet(riskAdjustmentIsSet(), "riskAdjustment");
      this.riskAdjustment = java.util.Objects.requireNonNull(riskAdjustment, "riskAdjustment");
      optBits |= OPT_BIT_RISK_ADJUSTMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#riskAdjustment() riskAdjustment} to riskAdjustment.
     * @param riskAdjustment The value for riskAdjustment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("riskAdjustment")
    public final Builder riskAdjustment(java.util.Optional<java.lang.String> riskAdjustment) {
      checkNotIsSet(riskAdjustmentIsSet(), "riskAdjustment");
      this.riskAdjustment = riskAdjustment.orElse(null);
      optBits |= OPT_BIT_RISK_ADJUSTMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#version() version} to version.
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
     * Initializes the optional value {@link Measure#version() version} to version.
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
     * Initializes the optional value {@link Measure#compositeScoring() compositeScoring} to compositeScoring.
     * @param compositeScoring The value for compositeScoring
     * @return {@code this} builder for chained invocation
     */
    public final Builder compositeScoring(com.fhir.CodeableConcept compositeScoring) {
      checkNotIsSet(compositeScoringIsSet(), "compositeScoring");
      this.compositeScoring = java.util.Objects.requireNonNull(compositeScoring, "compositeScoring");
      optBits |= OPT_BIT_COMPOSITE_SCORING;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#compositeScoring() compositeScoring} to compositeScoring.
     * @param compositeScoring The value for compositeScoring
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compositeScoring")
    public final Builder compositeScoring(java.util.Optional<? extends com.fhir.CodeableConcept> compositeScoring) {
      checkNotIsSet(compositeScoringIsSet(), "compositeScoring");
      this.compositeScoring = compositeScoring.orElse(null);
      optBits |= OPT_BIT_COMPOSITE_SCORING;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(java.util.List<com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link Measure#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link Measure#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link Measure#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link Measure#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for chained invocation
     */
    public final Builder definition(java.util.List<com.fhir.markdown> definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = java.util.Objects.requireNonNull(definition, "definition");
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definition")
    public final Builder definition(java.util.Optional<? extends java.util.List<com.fhir.markdown>> definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = definition.orElse(null);
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link Measure#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link Measure#name() name} to name.
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
     * Initializes the optional value {@link Measure#name() name} to name.
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
     * Initializes the optional value {@link Measure#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link Measure#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link Measure#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link Measure#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link Measure#url() url} to url.
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
     * Initializes the optional value {@link Measure#url() url} to url.
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
     * Initializes the optional value {@link Measure#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for chained invocation
     */
    public final Builder group(java.util.List<com.fhir.Measure_Group> group) {
      checkNotIsSet(groupIsSet(), "group");
      this.group = java.util.Objects.requireNonNull(group, "group");
      optBits |= OPT_BIT_GROUP;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("group")
    public final Builder group(java.util.Optional<? extends java.util.List<com.fhir.Measure_Group>> group) {
      checkNotIsSet(groupIsSet(), "group");
      this.group = group.orElse(null);
      optBits |= OPT_BIT_GROUP;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.MeasureStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.MeasureStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#library() library} to library.
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
     * Initializes the optional value {@link Measure#library() library} to library.
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
     * Initializes the optional value {@link Measure#disclaimer() disclaimer} to disclaimer.
     * @param disclaimer The value for disclaimer
     * @return {@code this} builder for chained invocation
     */
    public final Builder disclaimer(com.fhir.markdown disclaimer) {
      checkNotIsSet(disclaimerIsSet(), "disclaimer");
      this.disclaimer = java.util.Objects.requireNonNull(disclaimer, "disclaimer");
      optBits |= OPT_BIT_DISCLAIMER;
      return this;
    }

    /**
     * Initializes the optional value {@link Measure#disclaimer() disclaimer} to disclaimer.
     * @param disclaimer The value for disclaimer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disclaimer")
    public final Builder disclaimer(java.util.Optional<? extends com.fhir.markdown> disclaimer) {
      checkNotIsSet(disclaimerIsSet(), "disclaimer");
      this.disclaimer = disclaimer.orElse(null);
      optBits |= OPT_BIT_DISCLAIMER;
      return this;
    }

    /**
     * Builds a new {@link Measure Measure}.
     * @return An immutable instance of Measure
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Measure build() {
      checkRequiredAttributes();
      return new ImmutableMeasure(
          clinicalRecommendationStatement,
          rateAggregation,
          meta,
          title,
          usage,
          subtitle,
          subjectCodeableConcept,
          modifierExtension,
          endorser,
          supplementalData,
          scoring,
          resourceType,
          implicitRules,
          extension,
          improvementNotation,
          subjectReference,
          language,
          author,
          guidance,
          date,
          contact,
          copyright,
          editor,
          publisher,
          identifier,
          lastReviewDate,
          useContext,
          topic,
          purpose,
          id,
          relatedArtifact,
          text,
          description,
          rationale,
          contained,
          riskAdjustment,
          version,
          compositeScoring,
          type,
          effectivePeriod,
          approvalDate,
          definition,
          reviewer,
          name,
          jurisdiction,
          experimental,
          url,
          group,
          status,
          library,
          disclaimer);
    }

    private boolean clinicalRecommendationStatementIsSet() {
      return (optBits & OPT_BIT_CLINICAL_RECOMMENDATION_STATEMENT) != 0;
    }

    private boolean rateAggregationIsSet() {
      return (optBits & OPT_BIT_RATE_AGGREGATION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean usageIsSet() {
      return (optBits & OPT_BIT_USAGE) != 0;
    }

    private boolean subtitleIsSet() {
      return (optBits & OPT_BIT_SUBTITLE) != 0;
    }

    private boolean subjectCodeableConceptIsSet() {
      return (optBits & OPT_BIT_SUBJECT_CODEABLE_CONCEPT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean endorserIsSet() {
      return (optBits & OPT_BIT_ENDORSER) != 0;
    }

    private boolean supplementalDataIsSet() {
      return (optBits & OPT_BIT_SUPPLEMENTAL_DATA) != 0;
    }

    private boolean scoringIsSet() {
      return (optBits & OPT_BIT_SCORING) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean improvementNotationIsSet() {
      return (optBits & OPT_BIT_IMPROVEMENT_NOTATION) != 0;
    }

    private boolean subjectReferenceIsSet() {
      return (optBits & OPT_BIT_SUBJECT_REFERENCE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean guidanceIsSet() {
      return (optBits & OPT_BIT_GUIDANCE) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean editorIsSet() {
      return (optBits & OPT_BIT_EDITOR) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean lastReviewDateIsSet() {
      return (optBits & OPT_BIT_LAST_REVIEW_DATE) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean topicIsSet() {
      return (optBits & OPT_BIT_TOPIC) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean relatedArtifactIsSet() {
      return (optBits & OPT_BIT_RELATED_ARTIFACT) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean rationaleIsSet() {
      return (optBits & OPT_BIT_RATIONALE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean riskAdjustmentIsSet() {
      return (optBits & OPT_BIT_RISK_ADJUSTMENT) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean compositeScoringIsSet() {
      return (optBits & OPT_BIT_COMPOSITE_SCORING) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean approvalDateIsSet() {
      return (optBits & OPT_BIT_APPROVAL_DATE) != 0;
    }

    private boolean definitionIsSet() {
      return (optBits & OPT_BIT_DEFINITION) != 0;
    }

    private boolean reviewerIsSet() {
      return (optBits & OPT_BIT_REVIEWER) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean groupIsSet() {
      return (optBits & OPT_BIT_GROUP) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean libraryIsSet() {
      return (optBits & OPT_BIT_LIBRARY) != 0;
    }

    private boolean disclaimerIsSet() {
      return (optBits & OPT_BIT_DISCLAIMER) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Measure is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Measure, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Measure", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Measure#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Measure", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Measure#clinicalRecommendationStatement() clinicalRecommendationStatement} to clinicalRecommendationStatement.
     * @param clinicalRecommendationStatement The value for clinicalRecommendationStatement
     * @return {@code this} builder for chained invocation
     */
    BuildFinal clinicalRecommendationStatement(com.fhir.markdown clinicalRecommendationStatement);

    /**
     * Initializes the optional value {@link Measure#clinicalRecommendationStatement() clinicalRecommendationStatement} to clinicalRecommendationStatement.
     * @param clinicalRecommendationStatement The value for clinicalRecommendationStatement
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal clinicalRecommendationStatement(java.util.Optional<? extends com.fhir.markdown> clinicalRecommendationStatement);

    /**
     * Initializes the optional value {@link Measure#rateAggregation() rateAggregation} to rateAggregation.
     * @param rateAggregation The value for rateAggregation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal rateAggregation(java.lang.String rateAggregation);

    /**
     * Initializes the optional value {@link Measure#rateAggregation() rateAggregation} to rateAggregation.
     * @param rateAggregation The value for rateAggregation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal rateAggregation(java.util.Optional<java.lang.String> rateAggregation);

    /**
     * Initializes the optional value {@link Measure#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Measure#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Measure#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link Measure#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link Measure#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal usage(java.lang.String usage);

    /**
     * Initializes the optional value {@link Measure#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal usage(java.util.Optional<java.lang.String> usage);

    /**
     * Initializes the optional value {@link Measure#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subtitle(java.lang.String subtitle);

    /**
     * Initializes the optional value {@link Measure#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subtitle(java.util.Optional<java.lang.String> subtitle);

    /**
     * Initializes the optional value {@link Measure#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subjectCodeableConcept(com.fhir.CodeableConcept subjectCodeableConcept);

    /**
     * Initializes the optional value {@link Measure#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subjectCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> subjectCodeableConcept);

    /**
     * Initializes the optional value {@link Measure#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Measure#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Measure#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endorser(java.util.List<com.fhir.ContactDetail> endorser);

    /**
     * Initializes the optional value {@link Measure#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endorser(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> endorser);

    /**
     * Initializes the optional value {@link Measure#supplementalData() supplementalData} to supplementalData.
     * @param supplementalData The value for supplementalData
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supplementalData(java.util.List<com.fhir.Measure_SupplementalData> supplementalData);

    /**
     * Initializes the optional value {@link Measure#supplementalData() supplementalData} to supplementalData.
     * @param supplementalData The value for supplementalData
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supplementalData(java.util.Optional<? extends java.util.List<com.fhir.Measure_SupplementalData>> supplementalData);

    /**
     * Initializes the optional value {@link Measure#scoring() scoring} to scoring.
     * @param scoring The value for scoring
     * @return {@code this} builder for chained invocation
     */
    BuildFinal scoring(com.fhir.CodeableConcept scoring);

    /**
     * Initializes the optional value {@link Measure#scoring() scoring} to scoring.
     * @param scoring The value for scoring
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal scoring(java.util.Optional<? extends com.fhir.CodeableConcept> scoring);

    /**
     * Initializes the optional value {@link Measure#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Measure#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Measure#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Measure#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Measure#improvementNotation() improvementNotation} to improvementNotation.
     * @param improvementNotation The value for improvementNotation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal improvementNotation(com.fhir.CodeableConcept improvementNotation);

    /**
     * Initializes the optional value {@link Measure#improvementNotation() improvementNotation} to improvementNotation.
     * @param improvementNotation The value for improvementNotation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal improvementNotation(java.util.Optional<? extends com.fhir.CodeableConcept> improvementNotation);

    /**
     * Initializes the optional value {@link Measure#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subjectReference(com.fhir.Reference subjectReference);

    /**
     * Initializes the optional value {@link Measure#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subjectReference(java.util.Optional<? extends com.fhir.Reference> subjectReference);

    /**
     * Initializes the optional value {@link Measure#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Measure#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Measure#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(java.util.List<com.fhir.ContactDetail> author);

    /**
     * Initializes the optional value {@link Measure#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> author);

    /**
     * Initializes the optional value {@link Measure#guidance() guidance} to guidance.
     * @param guidance The value for guidance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal guidance(com.fhir.markdown guidance);

    /**
     * Initializes the optional value {@link Measure#guidance() guidance} to guidance.
     * @param guidance The value for guidance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal guidance(java.util.Optional<? extends com.fhir.markdown> guidance);

    /**
     * Initializes the optional value {@link Measure#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link Measure#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link Measure#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link Measure#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link Measure#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(com.fhir.markdown copyright);

    /**
     * Initializes the optional value {@link Measure#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(java.util.Optional<? extends com.fhir.markdown> copyright);

    /**
     * Initializes the optional value {@link Measure#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal editor(java.util.List<com.fhir.ContactDetail> editor);

    /**
     * Initializes the optional value {@link Measure#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal editor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> editor);

    /**
     * Initializes the optional value {@link Measure#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link Measure#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link Measure#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Measure#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Measure#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastReviewDate(com.fhir.date lastReviewDate);

    /**
     * Initializes the optional value {@link Measure#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastReviewDate(java.util.Optional<? extends com.fhir.date> lastReviewDate);

    /**
     * Initializes the optional value {@link Measure#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link Measure#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link Measure#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topic(java.util.List<com.fhir.CodeableConcept> topic);

    /**
     * Initializes the optional value {@link Measure#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> topic);

    /**
     * Initializes the optional value {@link Measure#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(com.fhir.markdown purpose);

    /**
     * Initializes the optional value {@link Measure#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(java.util.Optional<? extends com.fhir.markdown> purpose);

    /**
     * Initializes the optional value {@link Measure#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Measure#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Measure#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatedArtifact(java.util.List<com.fhir.RelatedArtifact> relatedArtifact);

    /**
     * Initializes the optional value {@link Measure#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatedArtifact(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> relatedArtifact);

    /**
     * Initializes the optional value {@link Measure#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Measure#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Measure#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link Measure#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link Measure#rationale() rationale} to rationale.
     * @param rationale The value for rationale
     * @return {@code this} builder for chained invocation
     */
    BuildFinal rationale(com.fhir.markdown rationale);

    /**
     * Initializes the optional value {@link Measure#rationale() rationale} to rationale.
     * @param rationale The value for rationale
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal rationale(java.util.Optional<? extends com.fhir.markdown> rationale);

    /**
     * Initializes the optional value {@link Measure#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Measure#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Measure#riskAdjustment() riskAdjustment} to riskAdjustment.
     * @param riskAdjustment The value for riskAdjustment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal riskAdjustment(java.lang.String riskAdjustment);

    /**
     * Initializes the optional value {@link Measure#riskAdjustment() riskAdjustment} to riskAdjustment.
     * @param riskAdjustment The value for riskAdjustment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal riskAdjustment(java.util.Optional<java.lang.String> riskAdjustment);

    /**
     * Initializes the optional value {@link Measure#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link Measure#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link Measure#compositeScoring() compositeScoring} to compositeScoring.
     * @param compositeScoring The value for compositeScoring
     * @return {@code this} builder for chained invocation
     */
    BuildFinal compositeScoring(com.fhir.CodeableConcept compositeScoring);

    /**
     * Initializes the optional value {@link Measure#compositeScoring() compositeScoring} to compositeScoring.
     * @param compositeScoring The value for compositeScoring
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal compositeScoring(java.util.Optional<? extends com.fhir.CodeableConcept> compositeScoring);

    /**
     * Initializes the optional value {@link Measure#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(java.util.List<com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link Measure#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> type);

    /**
     * Initializes the optional value {@link Measure#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(com.fhir.Period effectivePeriod);

    /**
     * Initializes the optional value {@link Measure#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(java.util.Optional<? extends com.fhir.Period> effectivePeriod);

    /**
     * Initializes the optional value {@link Measure#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal approvalDate(com.fhir.date approvalDate);

    /**
     * Initializes the optional value {@link Measure#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal approvalDate(java.util.Optional<? extends com.fhir.date> approvalDate);

    /**
     * Initializes the optional value {@link Measure#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal definition(java.util.List<com.fhir.markdown> definition);

    /**
     * Initializes the optional value {@link Measure#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal definition(java.util.Optional<? extends java.util.List<com.fhir.markdown>> definition);

    /**
     * Initializes the optional value {@link Measure#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reviewer(java.util.List<com.fhir.ContactDetail> reviewer);

    /**
     * Initializes the optional value {@link Measure#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reviewer(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> reviewer);

    /**
     * Initializes the optional value {@link Measure#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link Measure#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link Measure#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link Measure#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link Measure#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link Measure#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(java.util.Optional<java.lang.Boolean> experimental);

    /**
     * Initializes the optional value {@link Measure#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link Measure#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link Measure#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for chained invocation
     */
    BuildFinal group(java.util.List<com.fhir.Measure_Group> group);

    /**
     * Initializes the optional value {@link Measure#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal group(java.util.Optional<? extends java.util.List<com.fhir.Measure_Group>> group);

    /**
     * Initializes the optional value {@link Measure#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.MeasureStatus status);

    /**
     * Initializes the optional value {@link Measure#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.MeasureStatus> status);

    /**
     * Initializes the optional value {@link Measure#library() library} to library.
     * @param library The value for library
     * @return {@code this} builder for chained invocation
     */
    BuildFinal library(java.util.List<com.fhir.canonical> library);

    /**
     * Initializes the optional value {@link Measure#library() library} to library.
     * @param library The value for library
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal library(java.util.Optional<? extends java.util.List<com.fhir.canonical>> library);

    /**
     * Initializes the optional value {@link Measure#disclaimer() disclaimer} to disclaimer.
     * @param disclaimer The value for disclaimer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal disclaimer(com.fhir.markdown disclaimer);

    /**
     * Initializes the optional value {@link Measure#disclaimer() disclaimer} to disclaimer.
     * @param disclaimer The value for disclaimer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal disclaimer(java.util.Optional<? extends com.fhir.markdown> disclaimer);

    /**
     * Builds a new {@link Measure Measure}.
     * @return An immutable instance of Measure
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Measure build();
  }
}
