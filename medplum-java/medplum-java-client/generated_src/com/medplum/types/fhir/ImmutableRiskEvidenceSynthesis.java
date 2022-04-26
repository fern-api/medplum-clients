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
 * Immutable implementation of {@link RiskEvidenceSynthesis}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRiskEvidenceSynthesis.builder()}.
 */
@Generated(from = "RiskEvidenceSynthesis", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRiskEvidenceSynthesis implements RiskEvidenceSynthesis {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<UsageContext> useContext;
  private final String resourceType;
  private final @Nullable List<ContactDetail> endorser;
  private final @Nullable Meta meta;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable DateTime date;
  private final @Nullable String publisher;
  private final @Nullable List<RiskEvidenceSynthesis_Certainty> certainty;
  private final @Nullable List<Annotation> note;
  private final @Nullable Narrative text;
  private final @Nullable List<Extension> extension;
  private final @Nullable Period effectivePeriod;
  private final @Nullable List<ContactDetail> editor;
  private final @Nullable Date approvalDate;
  private final @Nullable RiskEvidenceSynthesis_SampleSize sampleSize;
  private final @Nullable String version;
  private final @Nullable Markdown description;
  private final @Nullable List<ContactDetail> contact;
  private final @Nullable List<CodeableConcept> topic;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Date lastReviewDate;
  private final @Nullable List<ContactDetail> author;
  private final Reference population;
  private final @Nullable Code language;
  private final @Nullable List<RelatedArtifact> relatedArtifact;
  private final Reference outcome;
  private final @Nullable RiskevidencesynthesisStatus status;
  private final @Nullable Uri url;
  private final @Nullable Id id;
  private final @Nullable CodeableConcept synthesisType;
  private final @Nullable RiskEvidenceSynthesis_RiskEstimate riskEstimate;
  private final @Nullable Markdown copyright;
  private final @Nullable String title;
  private final @Nullable Reference exposure;
  private final @Nullable CodeableConcept studyType;
  private final @Nullable String name;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final @Nullable List<ContactDetail> reviewer;

  private ImmutableRiskEvidenceSynthesis(
      @Nullable List<Extension> modifierExtension,
      @Nullable Uri implicitRules,
      @Nullable List<UsageContext> useContext,
      String resourceType,
      @Nullable List<ContactDetail> endorser,
      @Nullable Meta meta,
      @Nullable List<ResourceList> contained,
      @Nullable DateTime date,
      @Nullable String publisher,
      @Nullable List<RiskEvidenceSynthesis_Certainty> certainty,
      @Nullable List<Annotation> note,
      @Nullable Narrative text,
      @Nullable List<Extension> extension,
      @Nullable Period effectivePeriod,
      @Nullable List<ContactDetail> editor,
      @Nullable Date approvalDate,
      @Nullable RiskEvidenceSynthesis_SampleSize sampleSize,
      @Nullable String version,
      @Nullable Markdown description,
      @Nullable List<ContactDetail> contact,
      @Nullable List<CodeableConcept> topic,
      @Nullable List<Identifier> identifier,
      @Nullable Date lastReviewDate,
      @Nullable List<ContactDetail> author,
      Reference population,
      @Nullable Code language,
      @Nullable List<RelatedArtifact> relatedArtifact,
      Reference outcome,
      @Nullable RiskevidencesynthesisStatus status,
      @Nullable Uri url,
      @Nullable Id id,
      @Nullable CodeableConcept synthesisType,
      @Nullable RiskEvidenceSynthesis_RiskEstimate riskEstimate,
      @Nullable Markdown copyright,
      @Nullable String title,
      @Nullable Reference exposure,
      @Nullable CodeableConcept studyType,
      @Nullable String name,
      @Nullable List<CodeableConcept> jurisdiction,
      @Nullable List<ContactDetail> reviewer) {
    this.modifierExtension = modifierExtension;
    this.implicitRules = implicitRules;
    this.useContext = useContext;
    this.resourceType = resourceType;
    this.endorser = endorser;
    this.meta = meta;
    this.contained = contained;
    this.date = date;
    this.publisher = publisher;
    this.certainty = certainty;
    this.note = note;
    this.text = text;
    this.extension = extension;
    this.effectivePeriod = effectivePeriod;
    this.editor = editor;
    this.approvalDate = approvalDate;
    this.sampleSize = sampleSize;
    this.version = version;
    this.description = description;
    this.contact = contact;
    this.topic = topic;
    this.identifier = identifier;
    this.lastReviewDate = lastReviewDate;
    this.author = author;
    this.population = population;
    this.language = language;
    this.relatedArtifact = relatedArtifact;
    this.outcome = outcome;
    this.status = status;
    this.url = url;
    this.id = id;
    this.synthesisType = synthesisType;
    this.riskEstimate = riskEstimate;
    this.copyright = copyright;
    this.title = title;
    this.exposure = exposure;
    this.studyType = studyType;
    this.name = name;
    this.jurisdiction = jurisdiction;
    this.reviewer = reviewer;
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code endorser} attribute
   */
  @JsonProperty("endorser")
  @Override
  public Optional<List<ContactDetail>> endorser() {
    return Optional.ofNullable(endorser);
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
   * @return The value of the {@code publisher} attribute
   */
  @JsonProperty("publisher")
  @Override
  public Optional<String> publisher() {
    return Optional.ofNullable(publisher);
  }

  /**
   * @return The value of the {@code certainty} attribute
   */
  @JsonProperty("certainty")
  @Override
  public Optional<List<RiskEvidenceSynthesis_Certainty>> certainty() {
    return Optional.ofNullable(certainty);
  }

  /**
   * @return The value of the {@code note} attribute
   */
  @JsonProperty("note")
  @Override
  public Optional<List<Annotation>> note() {
    return Optional.ofNullable(note);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code effectivePeriod} attribute
   */
  @JsonProperty("effectivePeriod")
  @Override
  public Optional<Period> effectivePeriod() {
    return Optional.ofNullable(effectivePeriod);
  }

  /**
   * @return The value of the {@code editor} attribute
   */
  @JsonProperty("editor")
  @Override
  public Optional<List<ContactDetail>> editor() {
    return Optional.ofNullable(editor);
  }

  /**
   * @return The value of the {@code approvalDate} attribute
   */
  @JsonProperty("approvalDate")
  @Override
  public Optional<Date> approvalDate() {
    return Optional.ofNullable(approvalDate);
  }

  /**
   * @return The value of the {@code sampleSize} attribute
   */
  @JsonProperty("sampleSize")
  @Override
  public Optional<RiskEvidenceSynthesis_SampleSize> sampleSize() {
    return Optional.ofNullable(sampleSize);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<Markdown> description() {
    return Optional.ofNullable(description);
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
   * @return The value of the {@code topic} attribute
   */
  @JsonProperty("topic")
  @Override
  public Optional<List<CodeableConcept>> topic() {
    return Optional.ofNullable(topic);
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
   * @return The value of the {@code lastReviewDate} attribute
   */
  @JsonProperty("lastReviewDate")
  @Override
  public Optional<Date> lastReviewDate() {
    return Optional.ofNullable(lastReviewDate);
  }

  /**
   * @return The value of the {@code author} attribute
   */
  @JsonProperty("author")
  @Override
  public Optional<List<ContactDetail>> author() {
    return Optional.ofNullable(author);
  }

  /**
   * @return The value of the {@code population} attribute
   */
  @JsonProperty("population")
  @Override
  public Reference population() {
    return population;
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
   * @return The value of the {@code relatedArtifact} attribute
   */
  @JsonProperty("relatedArtifact")
  @Override
  public Optional<List<RelatedArtifact>> relatedArtifact() {
    return Optional.ofNullable(relatedArtifact);
  }

  /**
   * @return The value of the {@code outcome} attribute
   */
  @JsonProperty("outcome")
  @Override
  public Reference outcome() {
    return outcome;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<RiskevidencesynthesisStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code synthesisType} attribute
   */
  @JsonProperty("synthesisType")
  @Override
  public Optional<CodeableConcept> synthesisType() {
    return Optional.ofNullable(synthesisType);
  }

  /**
   * @return The value of the {@code riskEstimate} attribute
   */
  @JsonProperty("riskEstimate")
  @Override
  public Optional<RiskEvidenceSynthesis_RiskEstimate> riskEstimate() {
    return Optional.ofNullable(riskEstimate);
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
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
  }

  /**
   * @return The value of the {@code exposure} attribute
   */
  @JsonProperty("exposure")
  @Override
  public Optional<Reference> exposure() {
    return Optional.ofNullable(exposure);
  }

  /**
   * @return The value of the {@code studyType} attribute
   */
  @JsonProperty("studyType")
  @Override
  public Optional<CodeableConcept> studyType() {
    return Optional.ofNullable(studyType);
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @JsonProperty("jurisdiction")
  @Override
  public Optional<List<CodeableConcept>> jurisdiction() {
    return Optional.ofNullable(jurisdiction);
  }

  /**
   * @return The value of the {@code reviewer} attribute
   */
  @JsonProperty("reviewer")
  @Override
  public Optional<List<ContactDetail>> reviewer() {
    return Optional.ofNullable(reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        newValue,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        value,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        newValue,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        value,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withUseContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        newValue,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withUseContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        value,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RiskEvidenceSynthesis#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        newValue,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#endorser() endorser} attribute.
   * @param value The value for endorser
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withEndorser(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "endorser");
    if (this.endorser == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        newValue,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#endorser() endorser} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endorser
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withEndorser(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.endorser == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        value,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        newValue,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        value,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        newValue,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        value,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        newValue,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        value,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withPublisher(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "publisher");
    if (Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        newValue,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withPublisher(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.publisher, value)) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        value,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#certainty() certainty} attribute.
   * @param value The value for certainty
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withCertainty(List<RiskEvidenceSynthesis_Certainty> value) {
    @Nullable List<RiskEvidenceSynthesis_Certainty> newValue = Objects.requireNonNull(value, "certainty");
    if (this.certainty == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        newValue,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#certainty() certainty} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for certainty
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withCertainty(Optional<? extends List<RiskEvidenceSynthesis_Certainty>> optional) {
    @Nullable List<RiskEvidenceSynthesis_Certainty> value = optional.orElse(null);
    if (this.certainty == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        value,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        newValue,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        value,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        newValue,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        value,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        newValue,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        value,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withEffectivePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        newValue,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withEffectivePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        value,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#editor() editor} attribute.
   * @param value The value for editor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withEditor(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "editor");
    if (this.editor == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        newValue,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#editor() editor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for editor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withEditor(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.editor == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        value,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#approvalDate() approvalDate} attribute.
   * @param value The value for approvalDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withApprovalDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "approvalDate");
    if (this.approvalDate == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        newValue,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#approvalDate() approvalDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for approvalDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withApprovalDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.approvalDate == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        value,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#sampleSize() sampleSize} attribute.
   * @param value The value for sampleSize
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withSampleSize(RiskEvidenceSynthesis_SampleSize value) {
    @Nullable RiskEvidenceSynthesis_SampleSize newValue = Objects.requireNonNull(value, "sampleSize");
    if (this.sampleSize == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        newValue,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#sampleSize() sampleSize} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sampleSize
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withSampleSize(Optional<? extends RiskEvidenceSynthesis_SampleSize> optional) {
    @Nullable RiskEvidenceSynthesis_SampleSize value = optional.orElse(null);
    if (this.sampleSize == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        value,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        newValue,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        value,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        newValue,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        value,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        newValue,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        value,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#topic() topic} attribute.
   * @param value The value for topic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withTopic(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "topic");
    if (this.topic == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        newValue,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#topic() topic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withTopic(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.topic == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        value,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        newValue,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        value,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#lastReviewDate() lastReviewDate} attribute.
   * @param value The value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withLastReviewDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "lastReviewDate");
    if (this.lastReviewDate == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        newValue,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#lastReviewDate() lastReviewDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withLastReviewDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.lastReviewDate == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        value,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withAuthor(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        newValue,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withAuthor(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        value,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RiskEvidenceSynthesis#population() population} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for population
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withPopulation(Reference value) {
    if (this.population == value) return this;
    Reference newValue = Objects.requireNonNull(value, "population");
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        newValue,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        newValue,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        value,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#relatedArtifact() relatedArtifact} attribute.
   * @param value The value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withRelatedArtifact(List<RelatedArtifact> value) {
    @Nullable List<RelatedArtifact> newValue = Objects.requireNonNull(value, "relatedArtifact");
    if (this.relatedArtifact == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        newValue,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#relatedArtifact() relatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withRelatedArtifact(Optional<? extends List<RelatedArtifact>> optional) {
    @Nullable List<RelatedArtifact> value = optional.orElse(null);
    if (this.relatedArtifact == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        value,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link RiskEvidenceSynthesis#outcome() outcome} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for outcome
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withOutcome(Reference value) {
    if (this.outcome == value) return this;
    Reference newValue = Objects.requireNonNull(value, "outcome");
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        newValue,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withStatus(RiskevidencesynthesisStatus value) {
    @Nullable RiskevidencesynthesisStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        newValue,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withStatus(Optional<? extends RiskevidencesynthesisStatus> optional) {
    @Nullable RiskevidencesynthesisStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        value,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        newValue,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        value,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        newValue,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        value,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#synthesisType() synthesisType} attribute.
   * @param value The value for synthesisType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withSynthesisType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "synthesisType");
    if (this.synthesisType == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        newValue,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#synthesisType() synthesisType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for synthesisType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withSynthesisType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.synthesisType == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        value,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#riskEstimate() riskEstimate} attribute.
   * @param value The value for riskEstimate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withRiskEstimate(RiskEvidenceSynthesis_RiskEstimate value) {
    @Nullable RiskEvidenceSynthesis_RiskEstimate newValue = Objects.requireNonNull(value, "riskEstimate");
    if (this.riskEstimate == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        newValue,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#riskEstimate() riskEstimate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for riskEstimate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withRiskEstimate(Optional<? extends RiskEvidenceSynthesis_RiskEstimate> optional) {
    @Nullable RiskEvidenceSynthesis_RiskEstimate value = optional.orElse(null);
    if (this.riskEstimate == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        value,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withCopyright(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        newValue,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withCopyright(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        value,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        newValue,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        value,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#exposure() exposure} attribute.
   * @param value The value for exposure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withExposure(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "exposure");
    if (this.exposure == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        newValue,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#exposure() exposure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exposure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withExposure(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.exposure == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        value,
        this.studyType,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#studyType() studyType} attribute.
   * @param value The value for studyType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withStudyType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "studyType");
    if (this.studyType == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        newValue,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#studyType() studyType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for studyType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withStudyType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.studyType == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        value,
        this.name,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        newValue,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        value,
        this.jurisdiction,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        newValue,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        value,
        this.reviewer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis#reviewer() reviewer} attribute.
   * @param value The value for reviewer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis withReviewer(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "reviewer");
    if (this.reviewer == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis#reviewer() reviewer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reviewer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis withReviewer(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.reviewer == value) return this;
    return new ImmutableRiskEvidenceSynthesis(
        this.modifierExtension,
        this.implicitRules,
        this.useContext,
        this.resourceType,
        this.endorser,
        this.meta,
        this.contained,
        this.date,
        this.publisher,
        this.certainty,
        this.note,
        this.text,
        this.extension,
        this.effectivePeriod,
        this.editor,
        this.approvalDate,
        this.sampleSize,
        this.version,
        this.description,
        this.contact,
        this.topic,
        this.identifier,
        this.lastReviewDate,
        this.author,
        this.population,
        this.language,
        this.relatedArtifact,
        this.outcome,
        this.status,
        this.url,
        this.id,
        this.synthesisType,
        this.riskEstimate,
        this.copyright,
        this.title,
        this.exposure,
        this.studyType,
        this.name,
        this.jurisdiction,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRiskEvidenceSynthesis} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRiskEvidenceSynthesis
        && equalTo((ImmutableRiskEvidenceSynthesis) another);
  }

  private boolean equalTo(ImmutableRiskEvidenceSynthesis another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(useContext, another.useContext)
        && resourceType.equals(another.resourceType)
        && Objects.equals(endorser, another.endorser)
        && Objects.equals(meta, another.meta)
        && Objects.equals(contained, another.contained)
        && Objects.equals(date, another.date)
        && Objects.equals(publisher, another.publisher)
        && Objects.equals(certainty, another.certainty)
        && Objects.equals(note, another.note)
        && Objects.equals(text, another.text)
        && Objects.equals(extension, another.extension)
        && Objects.equals(effectivePeriod, another.effectivePeriod)
        && Objects.equals(editor, another.editor)
        && Objects.equals(approvalDate, another.approvalDate)
        && Objects.equals(sampleSize, another.sampleSize)
        && Objects.equals(version, another.version)
        && Objects.equals(description, another.description)
        && Objects.equals(contact, another.contact)
        && Objects.equals(topic, another.topic)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(lastReviewDate, another.lastReviewDate)
        && Objects.equals(author, another.author)
        && population.equals(another.population)
        && Objects.equals(language, another.language)
        && Objects.equals(relatedArtifact, another.relatedArtifact)
        && outcome.equals(another.outcome)
        && Objects.equals(status, another.status)
        && Objects.equals(url, another.url)
        && Objects.equals(id, another.id)
        && Objects.equals(synthesisType, another.synthesisType)
        && Objects.equals(riskEstimate, another.riskEstimate)
        && Objects.equals(copyright, another.copyright)
        && Objects.equals(title, another.title)
        && Objects.equals(exposure, another.exposure)
        && Objects.equals(studyType, another.studyType)
        && Objects.equals(name, another.name)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(reviewer, another.reviewer);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code implicitRules}, {@code useContext}, {@code resourceType}, {@code endorser}, {@code meta}, {@code contained}, {@code date}, {@code publisher}, {@code certainty}, {@code note}, {@code text}, {@code extension}, {@code effectivePeriod}, {@code editor}, {@code approvalDate}, {@code sampleSize}, {@code version}, {@code description}, {@code contact}, {@code topic}, {@code identifier}, {@code lastReviewDate}, {@code author}, {@code population}, {@code language}, {@code relatedArtifact}, {@code outcome}, {@code status}, {@code url}, {@code id}, {@code synthesisType}, {@code riskEstimate}, {@code copyright}, {@code title}, {@code exposure}, {@code studyType}, {@code name}, {@code jurisdiction}, {@code reviewer}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(useContext);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(endorser);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(publisher);
    h += (h << 5) + Objects.hashCode(certainty);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(effectivePeriod);
    h += (h << 5) + Objects.hashCode(editor);
    h += (h << 5) + Objects.hashCode(approvalDate);
    h += (h << 5) + Objects.hashCode(sampleSize);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(topic);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(lastReviewDate);
    h += (h << 5) + Objects.hashCode(author);
    h += (h << 5) + population.hashCode();
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(relatedArtifact);
    h += (h << 5) + outcome.hashCode();
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(synthesisType);
    h += (h << 5) + Objects.hashCode(riskEstimate);
    h += (h << 5) + Objects.hashCode(copyright);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(exposure);
    h += (h << 5) + Objects.hashCode(studyType);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(reviewer);
    return h;
  }

  /**
   * Prints the immutable value {@code RiskEvidenceSynthesis} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("RiskEvidenceSynthesis{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (implicitRules != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (useContext != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (builder.length() > 22) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (endorser != null) {
      builder.append(", ");
      builder.append("endorser=").append(endorser);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (certainty != null) {
      builder.append(", ");
      builder.append("certainty=").append(certainty);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (effectivePeriod != null) {
      builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (editor != null) {
      builder.append(", ");
      builder.append("editor=").append(editor);
    }
    if (approvalDate != null) {
      builder.append(", ");
      builder.append("approvalDate=").append(approvalDate);
    }
    if (sampleSize != null) {
      builder.append(", ");
      builder.append("sampleSize=").append(sampleSize);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (topic != null) {
      builder.append(", ");
      builder.append("topic=").append(topic);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (lastReviewDate != null) {
      builder.append(", ");
      builder.append("lastReviewDate=").append(lastReviewDate);
    }
    if (author != null) {
      builder.append(", ");
      builder.append("author=").append(author);
    }
    builder.append(", ");
    builder.append("population=").append(population);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (relatedArtifact != null) {
      builder.append(", ");
      builder.append("relatedArtifact=").append(relatedArtifact);
    }
    builder.append(", ");
    builder.append("outcome=").append(outcome);
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (synthesisType != null) {
      builder.append(", ");
      builder.append("synthesisType=").append(synthesisType);
    }
    if (riskEstimate != null) {
      builder.append(", ");
      builder.append("riskEstimate=").append(riskEstimate);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (exposure != null) {
      builder.append(", ");
      builder.append("exposure=").append(exposure);
    }
    if (studyType != null) {
      builder.append(", ");
      builder.append("studyType=").append(studyType);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
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
  @Generated(from = "RiskEvidenceSynthesis", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements RiskEvidenceSynthesis {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<UsageContext>> useContext = Optional.empty();
    boolean useContextIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<ContactDetail>> endorser = Optional.empty();
    boolean endorserIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<String> publisher = Optional.empty();
    boolean publisherIsSet;
    @Nullable Optional<List<RiskEvidenceSynthesis_Certainty>> certainty = Optional.empty();
    boolean certaintyIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Period> effectivePeriod = Optional.empty();
    boolean effectivePeriodIsSet;
    @Nullable Optional<List<ContactDetail>> editor = Optional.empty();
    boolean editorIsSet;
    @Nullable Optional<Date> approvalDate = Optional.empty();
    boolean approvalDateIsSet;
    @Nullable Optional<RiskEvidenceSynthesis_SampleSize> sampleSize = Optional.empty();
    boolean sampleSizeIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<List<CodeableConcept>> topic = Optional.empty();
    boolean topicIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Date> lastReviewDate = Optional.empty();
    boolean lastReviewDateIsSet;
    @Nullable Optional<List<ContactDetail>> author = Optional.empty();
    boolean authorIsSet;
    @Nullable Reference population;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<RelatedArtifact>> relatedArtifact = Optional.empty();
    boolean relatedArtifactIsSet;
    @Nullable Reference outcome;
    @Nullable Optional<RiskevidencesynthesisStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> synthesisType = Optional.empty();
    boolean synthesisTypeIsSet;
    @Nullable Optional<RiskEvidenceSynthesis_RiskEstimate> riskEstimate = Optional.empty();
    boolean riskEstimateIsSet;
    @Nullable Optional<Markdown> copyright = Optional.empty();
    boolean copyrightIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<Reference> exposure = Optional.empty();
    boolean exposureIsSet;
    @Nullable Optional<CodeableConcept> studyType = Optional.empty();
    boolean studyTypeIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<List<ContactDetail>> reviewer = Optional.empty();
    boolean reviewerIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("useContext")
    public void setUseContext(Optional<List<UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("endorser")
    public void setEndorser(Optional<List<ContactDetail>> endorser) {
      this.endorser = endorser;
      this.endorserIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
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
    @JsonProperty("publisher")
    public void setPublisher(Optional<String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @JsonProperty("certainty")
    public void setCertainty(Optional<List<RiskEvidenceSynthesis_Certainty>> certainty) {
      this.certainty = certainty;
      this.certaintyIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("effectivePeriod")
    public void setEffectivePeriod(Optional<Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @JsonProperty("editor")
    public void setEditor(Optional<List<ContactDetail>> editor) {
      this.editor = editor;
      this.editorIsSet = true;
    }
    @JsonProperty("approvalDate")
    public void setApprovalDate(Optional<Date> approvalDate) {
      this.approvalDate = approvalDate;
      this.approvalDateIsSet = true;
    }
    @JsonProperty("sampleSize")
    public void setSampleSize(Optional<RiskEvidenceSynthesis_SampleSize> sampleSize) {
      this.sampleSize = sampleSize;
      this.sampleSizeIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("topic")
    public void setTopic(Optional<List<CodeableConcept>> topic) {
      this.topic = topic;
      this.topicIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("lastReviewDate")
    public void setLastReviewDate(Optional<Date> lastReviewDate) {
      this.lastReviewDate = lastReviewDate;
      this.lastReviewDateIsSet = true;
    }
    @JsonProperty("author")
    public void setAuthor(Optional<List<ContactDetail>> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @JsonProperty("population")
    public void setPopulation(Reference population) {
      this.population = population;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("relatedArtifact")
    public void setRelatedArtifact(Optional<List<RelatedArtifact>> relatedArtifact) {
      this.relatedArtifact = relatedArtifact;
      this.relatedArtifactIsSet = true;
    }
    @JsonProperty("outcome")
    public void setOutcome(Reference outcome) {
      this.outcome = outcome;
    }
    @JsonProperty("status")
    public void setStatus(Optional<RiskevidencesynthesisStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("synthesisType")
    public void setSynthesisType(Optional<CodeableConcept> synthesisType) {
      this.synthesisType = synthesisType;
      this.synthesisTypeIsSet = true;
    }
    @JsonProperty("riskEstimate")
    public void setRiskEstimate(Optional<RiskEvidenceSynthesis_RiskEstimate> riskEstimate) {
      this.riskEstimate = riskEstimate;
      this.riskEstimateIsSet = true;
    }
    @JsonProperty("copyright")
    public void setCopyright(Optional<Markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("exposure")
    public void setExposure(Optional<Reference> exposure) {
      this.exposure = exposure;
      this.exposureIsSet = true;
    }
    @JsonProperty("studyType")
    public void setStudyType(Optional<CodeableConcept> studyType) {
      this.studyType = studyType;
      this.studyTypeIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<List<CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("reviewer")
    public void setReviewer(Optional<List<ContactDetail>> reviewer) {
      this.reviewer = reviewer;
      this.reviewerIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> endorser() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<RiskEvidenceSynthesis_Certainty>> certainty() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> editor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> approvalDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<RiskEvidenceSynthesis_SampleSize> sampleSize() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> topic() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> lastReviewDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> author() { throw new UnsupportedOperationException(); }
    @Override
    public Reference population() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<RelatedArtifact>> relatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public Reference outcome() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<RiskevidencesynthesisStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> synthesisType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<RiskEvidenceSynthesis_RiskEstimate> riskEstimate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> exposure() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> studyType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> reviewer() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRiskEvidenceSynthesis fromJson(Json json) {
    ImmutableRiskEvidenceSynthesis.Builder builder = ((ImmutableRiskEvidenceSynthesis.Builder) ImmutableRiskEvidenceSynthesis.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.endorserIsSet) {
      builder.endorser(json.endorser);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.certaintyIsSet) {
      builder.certainty(json.certainty);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.editorIsSet) {
      builder.editor(json.editor);
    }
    if (json.approvalDateIsSet) {
      builder.approvalDate(json.approvalDate);
    }
    if (json.sampleSizeIsSet) {
      builder.sampleSize(json.sampleSize);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.topicIsSet) {
      builder.topic(json.topic);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.lastReviewDateIsSet) {
      builder.lastReviewDate(json.lastReviewDate);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.population != null) {
      builder.population(json.population);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.relatedArtifactIsSet) {
      builder.relatedArtifact(json.relatedArtifact);
    }
    if (json.outcome != null) {
      builder.outcome(json.outcome);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.synthesisTypeIsSet) {
      builder.synthesisType(json.synthesisType);
    }
    if (json.riskEstimateIsSet) {
      builder.riskEstimate(json.riskEstimate);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.exposureIsSet) {
      builder.exposure(json.exposure);
    }
    if (json.studyTypeIsSet) {
      builder.studyType(json.studyType);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
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
        .modifierExtension(instance.modifierExtension())
        .implicitRules(instance.implicitRules())
        .useContext(instance.useContext())
        .resourceType(instance.resourceType())
        .endorser(instance.endorser())
        .meta(instance.meta())
        .contained(instance.contained())
        .date(instance.date())
        .publisher(instance.publisher())
        .certainty(instance.certainty())
        .note(instance.note())
        .text(instance.text())
        .extension(instance.extension())
        .effectivePeriod(instance.effectivePeriod())
        .editor(instance.editor())
        .approvalDate(instance.approvalDate())
        .sampleSize(instance.sampleSize())
        .version(instance.version())
        .description(instance.description())
        .contact(instance.contact())
        .topic(instance.topic())
        .identifier(instance.identifier())
        .lastReviewDate(instance.lastReviewDate())
        .author(instance.author())
        .population(instance.population())
        .language(instance.language())
        .relatedArtifact(instance.relatedArtifact())
        .outcome(instance.outcome())
        .status(instance.status())
        .url(instance.url())
        .id(instance.id())
        .synthesisType(instance.synthesisType())
        .riskEstimate(instance.riskEstimate())
        .copyright(instance.copyright())
        .title(instance.title())
        .exposure(instance.exposure())
        .studyType(instance.studyType())
        .name(instance.name())
        .jurisdiction(instance.jurisdiction())
        .reviewer(instance.reviewer())
        .build();
  }

  /**
   * Creates a builder for {@link RiskEvidenceSynthesis RiskEvidenceSynthesis}.
   * <pre>
   * ImmutableRiskEvidenceSynthesis.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link RiskEvidenceSynthesis#modifierExtension() modifierExtension}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link RiskEvidenceSynthesis#implicitRules() implicitRules}
   *    .useContext(List&amp;lt;com.medplum.types.fhir.UsageContext&amp;gt;) // optional {@link RiskEvidenceSynthesis#useContext() useContext}
   *    .resourceType(String) // required {@link RiskEvidenceSynthesis#resourceType() resourceType}
   *    .endorser(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link RiskEvidenceSynthesis#endorser() endorser}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link RiskEvidenceSynthesis#meta() meta}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link RiskEvidenceSynthesis#contained() contained}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link RiskEvidenceSynthesis#date() date}
   *    .publisher(String) // optional {@link RiskEvidenceSynthesis#publisher() publisher}
   *    .certainty(List&amp;lt;com.medplum.types.fhir.RiskEvidenceSynthesis_Certainty&amp;gt;) // optional {@link RiskEvidenceSynthesis#certainty() certainty}
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link RiskEvidenceSynthesis#note() note}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link RiskEvidenceSynthesis#text() text}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link RiskEvidenceSynthesis#extension() extension}
   *    .effectivePeriod(com.medplum.types.fhir.Period) // optional {@link RiskEvidenceSynthesis#effectivePeriod() effectivePeriod}
   *    .editor(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link RiskEvidenceSynthesis#editor() editor}
   *    .approvalDate(com.medplum.types.fhir.Date) // optional {@link RiskEvidenceSynthesis#approvalDate() approvalDate}
   *    .sampleSize(com.medplum.types.fhir.RiskEvidenceSynthesis_SampleSize) // optional {@link RiskEvidenceSynthesis#sampleSize() sampleSize}
   *    .version(String) // optional {@link RiskEvidenceSynthesis#version() version}
   *    .description(com.medplum.types.fhir.Markdown) // optional {@link RiskEvidenceSynthesis#description() description}
   *    .contact(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link RiskEvidenceSynthesis#contact() contact}
   *    .topic(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link RiskEvidenceSynthesis#topic() topic}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link RiskEvidenceSynthesis#identifier() identifier}
   *    .lastReviewDate(com.medplum.types.fhir.Date) // optional {@link RiskEvidenceSynthesis#lastReviewDate() lastReviewDate}
   *    .author(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link RiskEvidenceSynthesis#author() author}
   *    .population(com.medplum.types.fhir.Reference) // required {@link RiskEvidenceSynthesis#population() population}
   *    .language(com.medplum.types.fhir.Code) // optional {@link RiskEvidenceSynthesis#language() language}
   *    .relatedArtifact(List&amp;lt;com.medplum.types.fhir.RelatedArtifact&amp;gt;) // optional {@link RiskEvidenceSynthesis#relatedArtifact() relatedArtifact}
   *    .outcome(com.medplum.types.fhir.Reference) // required {@link RiskEvidenceSynthesis#outcome() outcome}
   *    .status(com.medplum.types.fhir.RiskevidencesynthesisStatus) // optional {@link RiskEvidenceSynthesis#status() status}
   *    .url(com.medplum.types.fhir.Uri) // optional {@link RiskEvidenceSynthesis#url() url}
   *    .id(com.medplum.types.fhir.Id) // optional {@link RiskEvidenceSynthesis#id() id}
   *    .synthesisType(com.medplum.types.fhir.CodeableConcept) // optional {@link RiskEvidenceSynthesis#synthesisType() synthesisType}
   *    .riskEstimate(com.medplum.types.fhir.RiskEvidenceSynthesis_RiskEstimate) // optional {@link RiskEvidenceSynthesis#riskEstimate() riskEstimate}
   *    .copyright(com.medplum.types.fhir.Markdown) // optional {@link RiskEvidenceSynthesis#copyright() copyright}
   *    .title(String) // optional {@link RiskEvidenceSynthesis#title() title}
   *    .exposure(com.medplum.types.fhir.Reference) // optional {@link RiskEvidenceSynthesis#exposure() exposure}
   *    .studyType(com.medplum.types.fhir.CodeableConcept) // optional {@link RiskEvidenceSynthesis#studyType() studyType}
   *    .name(String) // optional {@link RiskEvidenceSynthesis#name() name}
   *    .jurisdiction(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link RiskEvidenceSynthesis#jurisdiction() jurisdiction}
   *    .reviewer(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link RiskEvidenceSynthesis#reviewer() reviewer}
   *    .build();
   * </pre>
   * @return A new RiskEvidenceSynthesis builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableRiskEvidenceSynthesis.Builder();
  }

  /**
   * Builds instances of type {@link RiskEvidenceSynthesis RiskEvidenceSynthesis}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "RiskEvidenceSynthesis", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, PopulationBuildStage, OutcomeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_POPULATION = 0x2L;
    private static final long INIT_BIT_OUTCOME = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2L;
    private static final long OPT_BIT_USE_CONTEXT = 0x4L;
    private static final long OPT_BIT_ENDORSER = 0x8L;
    private static final long OPT_BIT_META = 0x10L;
    private static final long OPT_BIT_CONTAINED = 0x20L;
    private static final long OPT_BIT_DATE = 0x40L;
    private static final long OPT_BIT_PUBLISHER = 0x80L;
    private static final long OPT_BIT_CERTAINTY = 0x100L;
    private static final long OPT_BIT_NOTE = 0x200L;
    private static final long OPT_BIT_TEXT = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x1000L;
    private static final long OPT_BIT_EDITOR = 0x2000L;
    private static final long OPT_BIT_APPROVAL_DATE = 0x4000L;
    private static final long OPT_BIT_SAMPLE_SIZE = 0x8000L;
    private static final long OPT_BIT_VERSION = 0x10000L;
    private static final long OPT_BIT_DESCRIPTION = 0x20000L;
    private static final long OPT_BIT_CONTACT = 0x40000L;
    private static final long OPT_BIT_TOPIC = 0x80000L;
    private static final long OPT_BIT_IDENTIFIER = 0x100000L;
    private static final long OPT_BIT_LAST_REVIEW_DATE = 0x200000L;
    private static final long OPT_BIT_AUTHOR = 0x400000L;
    private static final long OPT_BIT_LANGUAGE = 0x800000L;
    private static final long OPT_BIT_RELATED_ARTIFACT = 0x1000000L;
    private static final long OPT_BIT_STATUS = 0x2000000L;
    private static final long OPT_BIT_URL = 0x4000000L;
    private static final long OPT_BIT_ID = 0x8000000L;
    private static final long OPT_BIT_SYNTHESIS_TYPE = 0x10000000L;
    private static final long OPT_BIT_RISK_ESTIMATE = 0x20000000L;
    private static final long OPT_BIT_COPYRIGHT = 0x40000000L;
    private static final long OPT_BIT_TITLE = 0x80000000L;
    private static final long OPT_BIT_EXPOSURE = 0x100000000L;
    private static final long OPT_BIT_STUDY_TYPE = 0x200000000L;
    private static final long OPT_BIT_NAME = 0x400000000L;
    private static final long OPT_BIT_JURISDICTION = 0x800000000L;
    private static final long OPT_BIT_REVIEWER = 0x1000000000L;
    private long initBits = 0x7L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Uri implicitRules;
    private @Nullable List<UsageContext> useContext;
    private @Nullable String resourceType;
    private @Nullable List<ContactDetail> endorser;
    private @Nullable Meta meta;
    private @Nullable List<ResourceList> contained;
    private @Nullable DateTime date;
    private @Nullable String publisher;
    private @Nullable List<RiskEvidenceSynthesis_Certainty> certainty;
    private @Nullable List<Annotation> note;
    private @Nullable Narrative text;
    private @Nullable List<Extension> extension;
    private @Nullable Period effectivePeriod;
    private @Nullable List<ContactDetail> editor;
    private @Nullable Date approvalDate;
    private @Nullable RiskEvidenceSynthesis_SampleSize sampleSize;
    private @Nullable String version;
    private @Nullable Markdown description;
    private @Nullable List<ContactDetail> contact;
    private @Nullable List<CodeableConcept> topic;
    private @Nullable List<Identifier> identifier;
    private @Nullable Date lastReviewDate;
    private @Nullable List<ContactDetail> author;
    private @Nullable Reference population;
    private @Nullable Code language;
    private @Nullable List<RelatedArtifact> relatedArtifact;
    private @Nullable Reference outcome;
    private @Nullable RiskevidencesynthesisStatus status;
    private @Nullable Uri url;
    private @Nullable Id id;
    private @Nullable CodeableConcept synthesisType;
    private @Nullable RiskEvidenceSynthesis_RiskEstimate riskEstimate;
    private @Nullable Markdown copyright;
    private @Nullable String title;
    private @Nullable Reference exposure;
    private @Nullable CodeableConcept studyType;
    private @Nullable String name;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable List<ContactDetail> reviewer;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#useContext() useContext} to useContext.
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
     * Initializes the value for the {@link RiskEvidenceSynthesis#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for chained invocation
     */
    public final Builder endorser(List<ContactDetail> endorser) {
      checkNotIsSet(endorserIsSet(), "endorser");
      this.endorser = Objects.requireNonNull(endorser, "endorser");
      optBits |= OPT_BIT_ENDORSER;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("endorser")
    public final Builder endorser(Optional<? extends List<ContactDetail>> endorser) {
      checkNotIsSet(endorserIsSet(), "endorser");
      this.endorser = endorser.orElse(null);
      optBits |= OPT_BIT_ENDORSER;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#meta() meta} to meta.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#meta() meta} to meta.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#contained() contained} to contained.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#contained() contained} to contained.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#date() date} to date.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#date() date} to date.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#certainty() certainty} to certainty.
     * @param certainty The value for certainty
     * @return {@code this} builder for chained invocation
     */
    public final Builder certainty(List<RiskEvidenceSynthesis_Certainty> certainty) {
      checkNotIsSet(certaintyIsSet(), "certainty");
      this.certainty = Objects.requireNonNull(certainty, "certainty");
      optBits |= OPT_BIT_CERTAINTY;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#certainty() certainty} to certainty.
     * @param certainty The value for certainty
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("certainty")
    public final Builder certainty(Optional<? extends List<RiskEvidenceSynthesis_Certainty>> certainty) {
      checkNotIsSet(certaintyIsSet(), "certainty");
      this.certainty = certainty.orElse(null);
      optBits |= OPT_BIT_CERTAINTY;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    public final Builder note(List<Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("note")
    public final Builder note(Optional<? extends List<Annotation>> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = note.orElse(null);
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#text() text} to text.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#text() text} to text.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#extension() extension} to extension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#extension() extension} to extension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectivePeriod(Period effectivePeriod) {
      checkNotIsSet(effectivePeriodIsSet(), "effectivePeriod");
      this.effectivePeriod = Objects.requireNonNull(effectivePeriod, "effectivePeriod");
      optBits |= OPT_BIT_EFFECTIVE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("effectivePeriod")
    public final Builder effectivePeriod(Optional<? extends Period> effectivePeriod) {
      checkNotIsSet(effectivePeriodIsSet(), "effectivePeriod");
      this.effectivePeriod = effectivePeriod.orElse(null);
      optBits |= OPT_BIT_EFFECTIVE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for chained invocation
     */
    public final Builder editor(List<ContactDetail> editor) {
      checkNotIsSet(editorIsSet(), "editor");
      this.editor = Objects.requireNonNull(editor, "editor");
      optBits |= OPT_BIT_EDITOR;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("editor")
    public final Builder editor(Optional<? extends List<ContactDetail>> editor) {
      checkNotIsSet(editorIsSet(), "editor");
      this.editor = editor.orElse(null);
      optBits |= OPT_BIT_EDITOR;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder approvalDate(Date approvalDate) {
      checkNotIsSet(approvalDateIsSet(), "approvalDate");
      this.approvalDate = Objects.requireNonNull(approvalDate, "approvalDate");
      optBits |= OPT_BIT_APPROVAL_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("approvalDate")
    public final Builder approvalDate(Optional<? extends Date> approvalDate) {
      checkNotIsSet(approvalDateIsSet(), "approvalDate");
      this.approvalDate = approvalDate.orElse(null);
      optBits |= OPT_BIT_APPROVAL_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#sampleSize() sampleSize} to sampleSize.
     * @param sampleSize The value for sampleSize
     * @return {@code this} builder for chained invocation
     */
    public final Builder sampleSize(RiskEvidenceSynthesis_SampleSize sampleSize) {
      checkNotIsSet(sampleSizeIsSet(), "sampleSize");
      this.sampleSize = Objects.requireNonNull(sampleSize, "sampleSize");
      optBits |= OPT_BIT_SAMPLE_SIZE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#sampleSize() sampleSize} to sampleSize.
     * @param sampleSize The value for sampleSize
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sampleSize")
    public final Builder sampleSize(Optional<? extends RiskEvidenceSynthesis_SampleSize> sampleSize) {
      checkNotIsSet(sampleSizeIsSet(), "sampleSize");
      this.sampleSize = sampleSize.orElse(null);
      optBits |= OPT_BIT_SAMPLE_SIZE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#version() version} to version.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#version() version} to version.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#description() description} to description.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#description() description} to description.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#contact() contact} to contact.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#contact() contact} to contact.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for chained invocation
     */
    public final Builder topic(List<CodeableConcept> topic) {
      checkNotIsSet(topicIsSet(), "topic");
      this.topic = Objects.requireNonNull(topic, "topic");
      optBits |= OPT_BIT_TOPIC;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("topic")
    public final Builder topic(Optional<? extends List<CodeableConcept>> topic) {
      checkNotIsSet(topicIsSet(), "topic");
      this.topic = topic.orElse(null);
      optBits |= OPT_BIT_TOPIC;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder lastReviewDate(Date lastReviewDate) {
      checkNotIsSet(lastReviewDateIsSet(), "lastReviewDate");
      this.lastReviewDate = Objects.requireNonNull(lastReviewDate, "lastReviewDate");
      optBits |= OPT_BIT_LAST_REVIEW_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastReviewDate")
    public final Builder lastReviewDate(Optional<? extends Date> lastReviewDate) {
      checkNotIsSet(lastReviewDateIsSet(), "lastReviewDate");
      this.lastReviewDate = lastReviewDate.orElse(null);
      optBits |= OPT_BIT_LAST_REVIEW_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    public final Builder author(List<ContactDetail> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = Objects.requireNonNull(author, "author");
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("author")
    public final Builder author(Optional<? extends List<ContactDetail>> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = author.orElse(null);
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the value for the {@link RiskEvidenceSynthesis#population() population} attribute.
     * @param population The value for population 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("population")
    public final Builder population(Reference population) {
      checkNotIsSet(populationIsSet(), "population");
      this.population = Objects.requireNonNull(population, "population");
      initBits &= ~INIT_BIT_POPULATION;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#language() language} to language.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#language() language} to language.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for chained invocation
     */
    public final Builder relatedArtifact(List<RelatedArtifact> relatedArtifact) {
      checkNotIsSet(relatedArtifactIsSet(), "relatedArtifact");
      this.relatedArtifact = Objects.requireNonNull(relatedArtifact, "relatedArtifact");
      optBits |= OPT_BIT_RELATED_ARTIFACT;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relatedArtifact")
    public final Builder relatedArtifact(Optional<? extends List<RelatedArtifact>> relatedArtifact) {
      checkNotIsSet(relatedArtifactIsSet(), "relatedArtifact");
      this.relatedArtifact = relatedArtifact.orElse(null);
      optBits |= OPT_BIT_RELATED_ARTIFACT;
      return this;
    }

    /**
     * Initializes the value for the {@link RiskEvidenceSynthesis#outcome() outcome} attribute.
     * @param outcome The value for outcome 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outcome")
    public final Builder outcome(Reference outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = Objects.requireNonNull(outcome, "outcome");
      initBits &= ~INIT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(RiskevidencesynthesisStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends RiskevidencesynthesisStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#url() url} to url.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#url() url} to url.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#id() id} to id.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#id() id} to id.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#synthesisType() synthesisType} to synthesisType.
     * @param synthesisType The value for synthesisType
     * @return {@code this} builder for chained invocation
     */
    public final Builder synthesisType(CodeableConcept synthesisType) {
      checkNotIsSet(synthesisTypeIsSet(), "synthesisType");
      this.synthesisType = Objects.requireNonNull(synthesisType, "synthesisType");
      optBits |= OPT_BIT_SYNTHESIS_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#synthesisType() synthesisType} to synthesisType.
     * @param synthesisType The value for synthesisType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("synthesisType")
    public final Builder synthesisType(Optional<? extends CodeableConcept> synthesisType) {
      checkNotIsSet(synthesisTypeIsSet(), "synthesisType");
      this.synthesisType = synthesisType.orElse(null);
      optBits |= OPT_BIT_SYNTHESIS_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#riskEstimate() riskEstimate} to riskEstimate.
     * @param riskEstimate The value for riskEstimate
     * @return {@code this} builder for chained invocation
     */
    public final Builder riskEstimate(RiskEvidenceSynthesis_RiskEstimate riskEstimate) {
      checkNotIsSet(riskEstimateIsSet(), "riskEstimate");
      this.riskEstimate = Objects.requireNonNull(riskEstimate, "riskEstimate");
      optBits |= OPT_BIT_RISK_ESTIMATE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#riskEstimate() riskEstimate} to riskEstimate.
     * @param riskEstimate The value for riskEstimate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("riskEstimate")
    public final Builder riskEstimate(Optional<? extends RiskEvidenceSynthesis_RiskEstimate> riskEstimate) {
      checkNotIsSet(riskEstimateIsSet(), "riskEstimate");
      this.riskEstimate = riskEstimate.orElse(null);
      optBits |= OPT_BIT_RISK_ESTIMATE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#title() title} to title.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#title() title} to title.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#exposure() exposure} to exposure.
     * @param exposure The value for exposure
     * @return {@code this} builder for chained invocation
     */
    public final Builder exposure(Reference exposure) {
      checkNotIsSet(exposureIsSet(), "exposure");
      this.exposure = Objects.requireNonNull(exposure, "exposure");
      optBits |= OPT_BIT_EXPOSURE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#exposure() exposure} to exposure.
     * @param exposure The value for exposure
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("exposure")
    public final Builder exposure(Optional<? extends Reference> exposure) {
      checkNotIsSet(exposureIsSet(), "exposure");
      this.exposure = exposure.orElse(null);
      optBits |= OPT_BIT_EXPOSURE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#studyType() studyType} to studyType.
     * @param studyType The value for studyType
     * @return {@code this} builder for chained invocation
     */
    public final Builder studyType(CodeableConcept studyType) {
      checkNotIsSet(studyTypeIsSet(), "studyType");
      this.studyType = Objects.requireNonNull(studyType, "studyType");
      optBits |= OPT_BIT_STUDY_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#studyType() studyType} to studyType.
     * @param studyType The value for studyType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("studyType")
    public final Builder studyType(Optional<? extends CodeableConcept> studyType) {
      checkNotIsSet(studyTypeIsSet(), "studyType");
      this.studyType = studyType.orElse(null);
      optBits |= OPT_BIT_STUDY_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#name() name} to name.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#name() name} to name.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for chained invocation
     */
    public final Builder reviewer(List<ContactDetail> reviewer) {
      checkNotIsSet(reviewerIsSet(), "reviewer");
      this.reviewer = Objects.requireNonNull(reviewer, "reviewer");
      optBits |= OPT_BIT_REVIEWER;
      return this;
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reviewer")
    public final Builder reviewer(Optional<? extends List<ContactDetail>> reviewer) {
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
    public RiskEvidenceSynthesis build() {
      checkRequiredAttributes();
      return new ImmutableRiskEvidenceSynthesis(
          modifierExtension,
          implicitRules,
          useContext,
          resourceType,
          endorser,
          meta,
          contained,
          date,
          publisher,
          certainty,
          note,
          text,
          extension,
          effectivePeriod,
          editor,
          approvalDate,
          sampleSize,
          version,
          description,
          contact,
          topic,
          identifier,
          lastReviewDate,
          author,
          population,
          language,
          relatedArtifact,
          outcome,
          status,
          url,
          id,
          synthesisType,
          riskEstimate,
          copyright,
          title,
          exposure,
          studyType,
          name,
          jurisdiction,
          reviewer);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean endorserIsSet() {
      return (optBits & OPT_BIT_ENDORSER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean certaintyIsSet() {
      return (optBits & OPT_BIT_CERTAINTY) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean editorIsSet() {
      return (optBits & OPT_BIT_EDITOR) != 0;
    }

    private boolean approvalDateIsSet() {
      return (optBits & OPT_BIT_APPROVAL_DATE) != 0;
    }

    private boolean sampleSizeIsSet() {
      return (optBits & OPT_BIT_SAMPLE_SIZE) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean topicIsSet() {
      return (optBits & OPT_BIT_TOPIC) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean lastReviewDateIsSet() {
      return (optBits & OPT_BIT_LAST_REVIEW_DATE) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean relatedArtifactIsSet() {
      return (optBits & OPT_BIT_RELATED_ARTIFACT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean synthesisTypeIsSet() {
      return (optBits & OPT_BIT_SYNTHESIS_TYPE) != 0;
    }

    private boolean riskEstimateIsSet() {
      return (optBits & OPT_BIT_RISK_ESTIMATE) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean exposureIsSet() {
      return (optBits & OPT_BIT_EXPOSURE) != 0;
    }

    private boolean studyTypeIsSet() {
      return (optBits & OPT_BIT_STUDY_TYPE) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean reviewerIsSet() {
      return (optBits & OPT_BIT_REVIEWER) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean populationIsSet() {
      return (initBits & INIT_BIT_POPULATION) == 0;
    }

    private boolean outcomeIsSet() {
      return (initBits & INIT_BIT_OUTCOME) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of RiskEvidenceSynthesis is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!populationIsSet()) attributes.add("population");
      if (!outcomeIsSet()) attributes.add("outcome");
      return "Cannot build RiskEvidenceSynthesis, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "RiskEvidenceSynthesis", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link RiskEvidenceSynthesis#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    PopulationBuildStage resourceType(String resourceType);
  }

  @Generated(from = "RiskEvidenceSynthesis", generator = "Immutables")
  public interface PopulationBuildStage {
    /**
     * Initializes the value for the {@link RiskEvidenceSynthesis#population() population} attribute.
     * @param population The value for population 
     * @return {@code this} builder for use in a chained invocation
     */
    OutcomeBuildStage population(Reference population);
  }

  @Generated(from = "RiskEvidenceSynthesis", generator = "Immutables")
  public interface OutcomeBuildStage {
    /**
     * Initializes the value for the {@link RiskEvidenceSynthesis#outcome() outcome} attribute.
     * @param outcome The value for outcome 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcome(Reference outcome);
  }

  @Generated(from = "RiskEvidenceSynthesis", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(List<UsageContext> useContext);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(Optional<? extends List<UsageContext>> useContext);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endorser(List<ContactDetail> endorser);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endorser(Optional<? extends List<ContactDetail>> endorser);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(String publisher);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<String> publisher);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#certainty() certainty} to certainty.
     * @param certainty The value for certainty
     * @return {@code this} builder for chained invocation
     */
    BuildFinal certainty(List<RiskEvidenceSynthesis_Certainty> certainty);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#certainty() certainty} to certainty.
     * @param certainty The value for certainty
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal certainty(Optional<? extends List<RiskEvidenceSynthesis_Certainty>> certainty);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(Period effectivePeriod);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(Optional<? extends Period> effectivePeriod);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal editor(List<ContactDetail> editor);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal editor(Optional<? extends List<ContactDetail>> editor);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal approvalDate(Date approvalDate);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal approvalDate(Optional<? extends Date> approvalDate);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#sampleSize() sampleSize} to sampleSize.
     * @param sampleSize The value for sampleSize
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sampleSize(RiskEvidenceSynthesis_SampleSize sampleSize);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#sampleSize() sampleSize} to sampleSize.
     * @param sampleSize The value for sampleSize
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sampleSize(Optional<? extends RiskEvidenceSynthesis_SampleSize> sampleSize);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(Markdown description);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<? extends Markdown> description);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topic(List<CodeableConcept> topic);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topic(Optional<? extends List<CodeableConcept>> topic);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastReviewDate(Date lastReviewDate);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastReviewDate(Optional<? extends Date> lastReviewDate);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(List<ContactDetail> author);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(Optional<? extends List<ContactDetail>> author);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatedArtifact(List<RelatedArtifact> relatedArtifact);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatedArtifact(Optional<? extends List<RelatedArtifact>> relatedArtifact);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(RiskevidencesynthesisStatus status);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends RiskevidencesynthesisStatus> status);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#synthesisType() synthesisType} to synthesisType.
     * @param synthesisType The value for synthesisType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal synthesisType(CodeableConcept synthesisType);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#synthesisType() synthesisType} to synthesisType.
     * @param synthesisType The value for synthesisType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal synthesisType(Optional<? extends CodeableConcept> synthesisType);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#riskEstimate() riskEstimate} to riskEstimate.
     * @param riskEstimate The value for riskEstimate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal riskEstimate(RiskEvidenceSynthesis_RiskEstimate riskEstimate);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#riskEstimate() riskEstimate} to riskEstimate.
     * @param riskEstimate The value for riskEstimate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal riskEstimate(Optional<? extends RiskEvidenceSynthesis_RiskEstimate> riskEstimate);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(Markdown copyright);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(Optional<? extends Markdown> copyright);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#exposure() exposure} to exposure.
     * @param exposure The value for exposure
     * @return {@code this} builder for chained invocation
     */
    BuildFinal exposure(Reference exposure);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#exposure() exposure} to exposure.
     * @param exposure The value for exposure
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal exposure(Optional<? extends Reference> exposure);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#studyType() studyType} to studyType.
     * @param studyType The value for studyType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal studyType(CodeableConcept studyType);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#studyType() studyType} to studyType.
     * @param studyType The value for studyType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal studyType(Optional<? extends CodeableConcept> studyType);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(List<CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reviewer(List<ContactDetail> reviewer);

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reviewer(Optional<? extends List<ContactDetail>> reviewer);

    /**
     * Builds a new {@link RiskEvidenceSynthesis RiskEvidenceSynthesis}.
     * @return An immutable instance of RiskEvidenceSynthesis
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    RiskEvidenceSynthesis build();
  }
}
