package com.fhir.types.fhir;

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
 * Immutable implementation of {@link EffectEvidenceSynthesis}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEffectEvidenceSynthesis.builder()}.
 */
@Generated(from = "EffectEvidenceSynthesis", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEffectEvidenceSynthesis implements EffectEvidenceSynthesis {
  private final @Nullable List<EffectEvidenceSynthesis_EffectEstimate> effectEstimate;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<EffectEvidenceSynthesis_Certainty> certainty;
  private final @Nullable EffectEvidenceSynthesis_SampleSize sampleSize;
  private final Reference outcome;
  private final @Nullable Id id;
  private final @Nullable Meta meta;
  private final @Nullable Uri url;
  private final @Nullable String title;
  private final @Nullable Date lastReviewDate;
  private final @Nullable List<Annotation> note;
  private final @Nullable DateTime date;
  private final @Nullable List<CodeableConcept> topic;
  private final @Nullable CodeableConcept studyType;
  private final @Nullable String name;
  private final @Nullable List<ContactDetail> reviewer;
  private final String resourceType;
  private final @Nullable List<ContactDetail> author;
  private final @Nullable List<EffectEvidenceSynthesis_ResultsByExposure> resultsByExposure;
  private final Reference exposureAlternative;
  private final @Nullable Narrative text;
  private final Reference population;
  private final @Nullable CodeableConcept synthesisType;
  private final @Nullable List<ContactDetail> endorser;
  private final @Nullable List<RelatedArtifact> relatedArtifact;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Code language;
  private final @Nullable String version;
  private final @Nullable EffectevidencesynthesisStatus status;
  private final @Nullable Period effectivePeriod;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<ContactDetail> editor;
  private final @Nullable List<ContactDetail> contact;
  private final @Nullable List<UsageContext> useContext;
  private final @Nullable Markdown description;
  private final @Nullable Uri implicitRules;
  private final @Nullable Markdown copyright;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final @Nullable Date approvalDate;
  private final Reference exposure;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String publisher;

  private ImmutableEffectEvidenceSynthesis(
      @Nullable List<EffectEvidenceSynthesis_EffectEstimate> effectEstimate,
      @Nullable List<Extension> extension,
      @Nullable List<EffectEvidenceSynthesis_Certainty> certainty,
      @Nullable EffectEvidenceSynthesis_SampleSize sampleSize,
      Reference outcome,
      @Nullable Id id,
      @Nullable Meta meta,
      @Nullable Uri url,
      @Nullable String title,
      @Nullable Date lastReviewDate,
      @Nullable List<Annotation> note,
      @Nullable DateTime date,
      @Nullable List<CodeableConcept> topic,
      @Nullable CodeableConcept studyType,
      @Nullable String name,
      @Nullable List<ContactDetail> reviewer,
      String resourceType,
      @Nullable List<ContactDetail> author,
      @Nullable List<EffectEvidenceSynthesis_ResultsByExposure> resultsByExposure,
      Reference exposureAlternative,
      @Nullable Narrative text,
      Reference population,
      @Nullable CodeableConcept synthesisType,
      @Nullable List<ContactDetail> endorser,
      @Nullable List<RelatedArtifact> relatedArtifact,
      @Nullable List<ResourceList> contained,
      @Nullable Code language,
      @Nullable String version,
      @Nullable EffectevidencesynthesisStatus status,
      @Nullable Period effectivePeriod,
      @Nullable List<Identifier> identifier,
      @Nullable List<ContactDetail> editor,
      @Nullable List<ContactDetail> contact,
      @Nullable List<UsageContext> useContext,
      @Nullable Markdown description,
      @Nullable Uri implicitRules,
      @Nullable Markdown copyright,
      @Nullable List<CodeableConcept> jurisdiction,
      @Nullable Date approvalDate,
      Reference exposure,
      @Nullable List<Extension> modifierExtension,
      @Nullable String publisher) {
    this.effectEstimate = effectEstimate;
    this.extension = extension;
    this.certainty = certainty;
    this.sampleSize = sampleSize;
    this.outcome = outcome;
    this.id = id;
    this.meta = meta;
    this.url = url;
    this.title = title;
    this.lastReviewDate = lastReviewDate;
    this.note = note;
    this.date = date;
    this.topic = topic;
    this.studyType = studyType;
    this.name = name;
    this.reviewer = reviewer;
    this.resourceType = resourceType;
    this.author = author;
    this.resultsByExposure = resultsByExposure;
    this.exposureAlternative = exposureAlternative;
    this.text = text;
    this.population = population;
    this.synthesisType = synthesisType;
    this.endorser = endorser;
    this.relatedArtifact = relatedArtifact;
    this.contained = contained;
    this.language = language;
    this.version = version;
    this.status = status;
    this.effectivePeriod = effectivePeriod;
    this.identifier = identifier;
    this.editor = editor;
    this.contact = contact;
    this.useContext = useContext;
    this.description = description;
    this.implicitRules = implicitRules;
    this.copyright = copyright;
    this.jurisdiction = jurisdiction;
    this.approvalDate = approvalDate;
    this.exposure = exposure;
    this.modifierExtension = modifierExtension;
    this.publisher = publisher;
  }

  /**
   * @return The value of the {@code effectEstimate} attribute
   */
  @JsonProperty("effectEstimate")
  @Override
  public Optional<List<EffectEvidenceSynthesis_EffectEstimate>> effectEstimate() {
    return Optional.ofNullable(effectEstimate);
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
   * @return The value of the {@code certainty} attribute
   */
  @JsonProperty("certainty")
  @Override
  public Optional<List<EffectEvidenceSynthesis_Certainty>> certainty() {
    return Optional.ofNullable(certainty);
  }

  /**
   * @return The value of the {@code sampleSize} attribute
   */
  @JsonProperty("sampleSize")
  @Override
  public Optional<EffectEvidenceSynthesis_SampleSize> sampleSize() {
    return Optional.ofNullable(sampleSize);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code url} attribute
   */
  @JsonProperty("url")
  @Override
  public Optional<Uri> url() {
    return Optional.ofNullable(url);
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
   * @return The value of the {@code lastReviewDate} attribute
   */
  @JsonProperty("lastReviewDate")
  @Override
  public Optional<Date> lastReviewDate() {
    return Optional.ofNullable(lastReviewDate);
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
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
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
   * @return The value of the {@code reviewer} attribute
   */
  @JsonProperty("reviewer")
  @Override
  public Optional<List<ContactDetail>> reviewer() {
    return Optional.ofNullable(reviewer);
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
   * @return The value of the {@code author} attribute
   */
  @JsonProperty("author")
  @Override
  public Optional<List<ContactDetail>> author() {
    return Optional.ofNullable(author);
  }

  /**
   * @return The value of the {@code resultsByExposure} attribute
   */
  @JsonProperty("resultsByExposure")
  @Override
  public Optional<List<EffectEvidenceSynthesis_ResultsByExposure>> resultsByExposure() {
    return Optional.ofNullable(resultsByExposure);
  }

  /**
   * @return The value of the {@code exposureAlternative} attribute
   */
  @JsonProperty("exposureAlternative")
  @Override
  public Reference exposureAlternative() {
    return exposureAlternative;
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
   * @return The value of the {@code population} attribute
   */
  @JsonProperty("population")
  @Override
  public Reference population() {
    return population;
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
   * @return The value of the {@code endorser} attribute
   */
  @JsonProperty("endorser")
  @Override
  public Optional<List<ContactDetail>> endorser() {
    return Optional.ofNullable(endorser);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public Optional<String> version() {
    return Optional.ofNullable(version);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<EffectevidencesynthesisStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code contact} attribute
   */
  @JsonProperty("contact")
  @Override
  public Optional<List<ContactDetail>> contact() {
    return Optional.ofNullable(contact);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<Markdown> description() {
    return Optional.ofNullable(description);
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
   * @return The value of the {@code copyright} attribute
   */
  @JsonProperty("copyright")
  @Override
  public Optional<Markdown> copyright() {
    return Optional.ofNullable(copyright);
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
   * @return The value of the {@code approvalDate} attribute
   */
  @JsonProperty("approvalDate")
  @Override
  public Optional<Date> approvalDate() {
    return Optional.ofNullable(approvalDate);
  }

  /**
   * @return The value of the {@code exposure} attribute
   */
  @JsonProperty("exposure")
  @Override
  public Reference exposure() {
    return exposure;
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
   * @return The value of the {@code publisher} attribute
   */
  @JsonProperty("publisher")
  @Override
  public Optional<String> publisher() {
    return Optional.ofNullable(publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#effectEstimate() effectEstimate} attribute.
   * @param value The value for effectEstimate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withEffectEstimate(List<EffectEvidenceSynthesis_EffectEstimate> value) {
    @Nullable List<EffectEvidenceSynthesis_EffectEstimate> newValue = Objects.requireNonNull(value, "effectEstimate");
    if (this.effectEstimate == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        newValue,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#effectEstimate() effectEstimate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectEstimate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withEffectEstimate(Optional<? extends List<EffectEvidenceSynthesis_EffectEstimate>> optional) {
    @Nullable List<EffectEvidenceSynthesis_EffectEstimate> value = optional.orElse(null);
    if (this.effectEstimate == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        value,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        newValue,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        value,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#certainty() certainty} attribute.
   * @param value The value for certainty
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withCertainty(List<EffectEvidenceSynthesis_Certainty> value) {
    @Nullable List<EffectEvidenceSynthesis_Certainty> newValue = Objects.requireNonNull(value, "certainty");
    if (this.certainty == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        newValue,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#certainty() certainty} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for certainty
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withCertainty(Optional<? extends List<EffectEvidenceSynthesis_Certainty>> optional) {
    @Nullable List<EffectEvidenceSynthesis_Certainty> value = optional.orElse(null);
    if (this.certainty == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        value,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#sampleSize() sampleSize} attribute.
   * @param value The value for sampleSize
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withSampleSize(EffectEvidenceSynthesis_SampleSize value) {
    @Nullable EffectEvidenceSynthesis_SampleSize newValue = Objects.requireNonNull(value, "sampleSize");
    if (this.sampleSize == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        newValue,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#sampleSize() sampleSize} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sampleSize
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withSampleSize(Optional<? extends EffectEvidenceSynthesis_SampleSize> optional) {
    @Nullable EffectEvidenceSynthesis_SampleSize value = optional.orElse(null);
    if (this.sampleSize == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        value,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EffectEvidenceSynthesis#outcome() outcome} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for outcome
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withOutcome(Reference value) {
    if (this.outcome == value) return this;
    Reference newValue = Objects.requireNonNull(value, "outcome");
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        newValue,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        newValue,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        value,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        newValue,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        value,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        newValue,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        value,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        newValue,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        value,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#lastReviewDate() lastReviewDate} attribute.
   * @param value The value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withLastReviewDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "lastReviewDate");
    if (this.lastReviewDate == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        newValue,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#lastReviewDate() lastReviewDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withLastReviewDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.lastReviewDate == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        value,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        newValue,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        value,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        newValue,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        value,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#topic() topic} attribute.
   * @param value The value for topic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withTopic(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "topic");
    if (this.topic == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        newValue,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#topic() topic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withTopic(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.topic == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        value,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#studyType() studyType} attribute.
   * @param value The value for studyType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withStudyType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "studyType");
    if (this.studyType == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        newValue,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#studyType() studyType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for studyType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withStudyType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.studyType == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        value,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        newValue,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        value,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#reviewer() reviewer} attribute.
   * @param value The value for reviewer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withReviewer(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "reviewer");
    if (this.reviewer == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        newValue,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#reviewer() reviewer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reviewer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withReviewer(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.reviewer == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        value,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EffectEvidenceSynthesis#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        newValue,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withAuthor(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        newValue,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withAuthor(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        value,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#resultsByExposure() resultsByExposure} attribute.
   * @param value The value for resultsByExposure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withResultsByExposure(List<EffectEvidenceSynthesis_ResultsByExposure> value) {
    @Nullable List<EffectEvidenceSynthesis_ResultsByExposure> newValue = Objects.requireNonNull(value, "resultsByExposure");
    if (this.resultsByExposure == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        newValue,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#resultsByExposure() resultsByExposure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resultsByExposure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withResultsByExposure(Optional<? extends List<EffectEvidenceSynthesis_ResultsByExposure>> optional) {
    @Nullable List<EffectEvidenceSynthesis_ResultsByExposure> value = optional.orElse(null);
    if (this.resultsByExposure == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        value,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EffectEvidenceSynthesis#exposureAlternative() exposureAlternative} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for exposureAlternative
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withExposureAlternative(Reference value) {
    if (this.exposureAlternative == value) return this;
    Reference newValue = Objects.requireNonNull(value, "exposureAlternative");
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        newValue,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        newValue,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        value,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EffectEvidenceSynthesis#population() population} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for population
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withPopulation(Reference value) {
    if (this.population == value) return this;
    Reference newValue = Objects.requireNonNull(value, "population");
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        newValue,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#synthesisType() synthesisType} attribute.
   * @param value The value for synthesisType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withSynthesisType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "synthesisType");
    if (this.synthesisType == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        newValue,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#synthesisType() synthesisType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for synthesisType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withSynthesisType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.synthesisType == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        value,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#endorser() endorser} attribute.
   * @param value The value for endorser
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withEndorser(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "endorser");
    if (this.endorser == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        newValue,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#endorser() endorser} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endorser
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withEndorser(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.endorser == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        value,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#relatedArtifact() relatedArtifact} attribute.
   * @param value The value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withRelatedArtifact(List<RelatedArtifact> value) {
    @Nullable List<RelatedArtifact> newValue = Objects.requireNonNull(value, "relatedArtifact");
    if (this.relatedArtifact == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        newValue,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#relatedArtifact() relatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withRelatedArtifact(Optional<? extends List<RelatedArtifact>> optional) {
    @Nullable List<RelatedArtifact> value = optional.orElse(null);
    if (this.relatedArtifact == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        value,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        newValue,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        value,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        newValue,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        value,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        newValue,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        value,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withStatus(EffectevidencesynthesisStatus value) {
    @Nullable EffectevidencesynthesisStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        newValue,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withStatus(Optional<? extends EffectevidencesynthesisStatus> optional) {
    @Nullable EffectevidencesynthesisStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        value,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withEffectivePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        newValue,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withEffectivePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        value,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        newValue,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        value,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#editor() editor} attribute.
   * @param value The value for editor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withEditor(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "editor");
    if (this.editor == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        newValue,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#editor() editor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for editor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withEditor(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.editor == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        value,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        newValue,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        value,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withUseContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        newValue,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withUseContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        value,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        newValue,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        value,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        newValue,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        value,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withCopyright(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        newValue,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withCopyright(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        value,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        newValue,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        value,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#approvalDate() approvalDate} attribute.
   * @param value The value for approvalDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withApprovalDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "approvalDate");
    if (this.approvalDate == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        newValue,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#approvalDate() approvalDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for approvalDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withApprovalDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.approvalDate == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        value,
        this.exposure,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EffectEvidenceSynthesis#exposure() exposure} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for exposure
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withExposure(Reference value) {
    if (this.exposure == value) return this;
    Reference newValue = Objects.requireNonNull(value, "exposure");
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        newValue,
        this.modifierExtension,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        newValue,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        value,
        this.publisher);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withPublisher(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "publisher");
    if (Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis withPublisher(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.publisher, value)) return this;
    return new ImmutableEffectEvidenceSynthesis(
        this.effectEstimate,
        this.extension,
        this.certainty,
        this.sampleSize,
        this.outcome,
        this.id,
        this.meta,
        this.url,
        this.title,
        this.lastReviewDate,
        this.note,
        this.date,
        this.topic,
        this.studyType,
        this.name,
        this.reviewer,
        this.resourceType,
        this.author,
        this.resultsByExposure,
        this.exposureAlternative,
        this.text,
        this.population,
        this.synthesisType,
        this.endorser,
        this.relatedArtifact,
        this.contained,
        this.language,
        this.version,
        this.status,
        this.effectivePeriod,
        this.identifier,
        this.editor,
        this.contact,
        this.useContext,
        this.description,
        this.implicitRules,
        this.copyright,
        this.jurisdiction,
        this.approvalDate,
        this.exposure,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEffectEvidenceSynthesis} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEffectEvidenceSynthesis
        && equalTo((ImmutableEffectEvidenceSynthesis) another);
  }

  private boolean equalTo(ImmutableEffectEvidenceSynthesis another) {
    return Objects.equals(effectEstimate, another.effectEstimate)
        && Objects.equals(extension, another.extension)
        && Objects.equals(certainty, another.certainty)
        && Objects.equals(sampleSize, another.sampleSize)
        && outcome.equals(another.outcome)
        && Objects.equals(id, another.id)
        && Objects.equals(meta, another.meta)
        && Objects.equals(url, another.url)
        && Objects.equals(title, another.title)
        && Objects.equals(lastReviewDate, another.lastReviewDate)
        && Objects.equals(note, another.note)
        && Objects.equals(date, another.date)
        && Objects.equals(topic, another.topic)
        && Objects.equals(studyType, another.studyType)
        && Objects.equals(name, another.name)
        && Objects.equals(reviewer, another.reviewer)
        && resourceType.equals(another.resourceType)
        && Objects.equals(author, another.author)
        && Objects.equals(resultsByExposure, another.resultsByExposure)
        && exposureAlternative.equals(another.exposureAlternative)
        && Objects.equals(text, another.text)
        && population.equals(another.population)
        && Objects.equals(synthesisType, another.synthesisType)
        && Objects.equals(endorser, another.endorser)
        && Objects.equals(relatedArtifact, another.relatedArtifact)
        && Objects.equals(contained, another.contained)
        && Objects.equals(language, another.language)
        && Objects.equals(version, another.version)
        && Objects.equals(status, another.status)
        && Objects.equals(effectivePeriod, another.effectivePeriod)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(editor, another.editor)
        && Objects.equals(contact, another.contact)
        && Objects.equals(useContext, another.useContext)
        && Objects.equals(description, another.description)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(copyright, another.copyright)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(approvalDate, another.approvalDate)
        && exposure.equals(another.exposure)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(publisher, another.publisher);
  }

  /**
   * Computes a hash code from attributes: {@code effectEstimate}, {@code extension}, {@code certainty}, {@code sampleSize}, {@code outcome}, {@code id}, {@code meta}, {@code url}, {@code title}, {@code lastReviewDate}, {@code note}, {@code date}, {@code topic}, {@code studyType}, {@code name}, {@code reviewer}, {@code resourceType}, {@code author}, {@code resultsByExposure}, {@code exposureAlternative}, {@code text}, {@code population}, {@code synthesisType}, {@code endorser}, {@code relatedArtifact}, {@code contained}, {@code language}, {@code version}, {@code status}, {@code effectivePeriod}, {@code identifier}, {@code editor}, {@code contact}, {@code useContext}, {@code description}, {@code implicitRules}, {@code copyright}, {@code jurisdiction}, {@code approvalDate}, {@code exposure}, {@code modifierExtension}, {@code publisher}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(effectEstimate);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(certainty);
    h += (h << 5) + Objects.hashCode(sampleSize);
    h += (h << 5) + outcome.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(lastReviewDate);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(topic);
    h += (h << 5) + Objects.hashCode(studyType);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(reviewer);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(author);
    h += (h << 5) + Objects.hashCode(resultsByExposure);
    h += (h << 5) + exposureAlternative.hashCode();
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + population.hashCode();
    h += (h << 5) + Objects.hashCode(synthesisType);
    h += (h << 5) + Objects.hashCode(endorser);
    h += (h << 5) + Objects.hashCode(relatedArtifact);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(effectivePeriod);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(editor);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(useContext);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(copyright);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(approvalDate);
    h += (h << 5) + exposure.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(publisher);
    return h;
  }

  /**
   * Prints the immutable value {@code EffectEvidenceSynthesis} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("EffectEvidenceSynthesis{");
    if (effectEstimate != null) {
      builder.append("effectEstimate=").append(effectEstimate);
    }
    if (extension != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (certainty != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("certainty=").append(certainty);
    }
    if (sampleSize != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("sampleSize=").append(sampleSize);
    }
    if (builder.length() > 24) builder.append(", ");
    builder.append("outcome=").append(outcome);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (lastReviewDate != null) {
      builder.append(", ");
      builder.append("lastReviewDate=").append(lastReviewDate);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (topic != null) {
      builder.append(", ");
      builder.append("topic=").append(topic);
    }
    if (studyType != null) {
      builder.append(", ");
      builder.append("studyType=").append(studyType);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (reviewer != null) {
      builder.append(", ");
      builder.append("reviewer=").append(reviewer);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (author != null) {
      builder.append(", ");
      builder.append("author=").append(author);
    }
    if (resultsByExposure != null) {
      builder.append(", ");
      builder.append("resultsByExposure=").append(resultsByExposure);
    }
    builder.append(", ");
    builder.append("exposureAlternative=").append(exposureAlternative);
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    builder.append(", ");
    builder.append("population=").append(population);
    if (synthesisType != null) {
      builder.append(", ");
      builder.append("synthesisType=").append(synthesisType);
    }
    if (endorser != null) {
      builder.append(", ");
      builder.append("endorser=").append(endorser);
    }
    if (relatedArtifact != null) {
      builder.append(", ");
      builder.append("relatedArtifact=").append(relatedArtifact);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (effectivePeriod != null) {
      builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (editor != null) {
      builder.append(", ");
      builder.append("editor=").append(editor);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (approvalDate != null) {
      builder.append(", ");
      builder.append("approvalDate=").append(approvalDate);
    }
    builder.append(", ");
    builder.append("exposure=").append(exposure);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
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
  @Generated(from = "EffectEvidenceSynthesis", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements EffectEvidenceSynthesis {
    @Nullable Optional<List<EffectEvidenceSynthesis_EffectEstimate>> effectEstimate = Optional.empty();
    boolean effectEstimateIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<EffectEvidenceSynthesis_Certainty>> certainty = Optional.empty();
    boolean certaintyIsSet;
    @Nullable Optional<EffectEvidenceSynthesis_SampleSize> sampleSize = Optional.empty();
    boolean sampleSizeIsSet;
    @Nullable Reference outcome;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<Date> lastReviewDate = Optional.empty();
    boolean lastReviewDateIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<List<CodeableConcept>> topic = Optional.empty();
    boolean topicIsSet;
    @Nullable Optional<CodeableConcept> studyType = Optional.empty();
    boolean studyTypeIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<ContactDetail>> reviewer = Optional.empty();
    boolean reviewerIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<ContactDetail>> author = Optional.empty();
    boolean authorIsSet;
    @Nullable Optional<List<EffectEvidenceSynthesis_ResultsByExposure>> resultsByExposure = Optional.empty();
    boolean resultsByExposureIsSet;
    @Nullable Reference exposureAlternative;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Reference population;
    @Nullable Optional<CodeableConcept> synthesisType = Optional.empty();
    boolean synthesisTypeIsSet;
    @Nullable Optional<List<ContactDetail>> endorser = Optional.empty();
    boolean endorserIsSet;
    @Nullable Optional<List<RelatedArtifact>> relatedArtifact = Optional.empty();
    boolean relatedArtifactIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<EffectevidencesynthesisStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Period> effectivePeriod = Optional.empty();
    boolean effectivePeriodIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<ContactDetail>> editor = Optional.empty();
    boolean editorIsSet;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<List<UsageContext>> useContext = Optional.empty();
    boolean useContextIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Markdown> copyright = Optional.empty();
    boolean copyrightIsSet;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<Date> approvalDate = Optional.empty();
    boolean approvalDateIsSet;
    @Nullable Reference exposure;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> publisher = Optional.empty();
    boolean publisherIsSet;
    @JsonProperty("effectEstimate")
    public void setEffectEstimate(Optional<List<EffectEvidenceSynthesis_EffectEstimate>> effectEstimate) {
      this.effectEstimate = effectEstimate;
      this.effectEstimateIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("certainty")
    public void setCertainty(Optional<List<EffectEvidenceSynthesis_Certainty>> certainty) {
      this.certainty = certainty;
      this.certaintyIsSet = true;
    }
    @JsonProperty("sampleSize")
    public void setSampleSize(Optional<EffectEvidenceSynthesis_SampleSize> sampleSize) {
      this.sampleSize = sampleSize;
      this.sampleSizeIsSet = true;
    }
    @JsonProperty("outcome")
    public void setOutcome(Reference outcome) {
      this.outcome = outcome;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("lastReviewDate")
    public void setLastReviewDate(Optional<Date> lastReviewDate) {
      this.lastReviewDate = lastReviewDate;
      this.lastReviewDateIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("topic")
    public void setTopic(Optional<List<CodeableConcept>> topic) {
      this.topic = topic;
      this.topicIsSet = true;
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
    @JsonProperty("reviewer")
    public void setReviewer(Optional<List<ContactDetail>> reviewer) {
      this.reviewer = reviewer;
      this.reviewerIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("author")
    public void setAuthor(Optional<List<ContactDetail>> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @JsonProperty("resultsByExposure")
    public void setResultsByExposure(Optional<List<EffectEvidenceSynthesis_ResultsByExposure>> resultsByExposure) {
      this.resultsByExposure = resultsByExposure;
      this.resultsByExposureIsSet = true;
    }
    @JsonProperty("exposureAlternative")
    public void setExposureAlternative(Reference exposureAlternative) {
      this.exposureAlternative = exposureAlternative;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("population")
    public void setPopulation(Reference population) {
      this.population = population;
    }
    @JsonProperty("synthesisType")
    public void setSynthesisType(Optional<CodeableConcept> synthesisType) {
      this.synthesisType = synthesisType;
      this.synthesisTypeIsSet = true;
    }
    @JsonProperty("endorser")
    public void setEndorser(Optional<List<ContactDetail>> endorser) {
      this.endorser = endorser;
      this.endorserIsSet = true;
    }
    @JsonProperty("relatedArtifact")
    public void setRelatedArtifact(Optional<List<RelatedArtifact>> relatedArtifact) {
      this.relatedArtifact = relatedArtifact;
      this.relatedArtifactIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<EffectevidencesynthesisStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("effectivePeriod")
    public void setEffectivePeriod(Optional<Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("editor")
    public void setEditor(Optional<List<ContactDetail>> editor) {
      this.editor = editor;
      this.editorIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("useContext")
    public void setUseContext(Optional<List<UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("copyright")
    public void setCopyright(Optional<Markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<List<CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("approvalDate")
    public void setApprovalDate(Optional<Date> approvalDate) {
      this.approvalDate = approvalDate;
      this.approvalDateIsSet = true;
    }
    @JsonProperty("exposure")
    public void setExposure(Reference exposure) {
      this.exposure = exposure;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("publisher")
    public void setPublisher(Optional<String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @Override
    public Optional<List<EffectEvidenceSynthesis_EffectEstimate>> effectEstimate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<EffectEvidenceSynthesis_Certainty>> certainty() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<EffectEvidenceSynthesis_SampleSize> sampleSize() { throw new UnsupportedOperationException(); }
    @Override
    public Reference outcome() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> lastReviewDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> topic() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> studyType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> reviewer() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> author() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<EffectEvidenceSynthesis_ResultsByExposure>> resultsByExposure() { throw new UnsupportedOperationException(); }
    @Override
    public Reference exposureAlternative() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Reference population() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> synthesisType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> endorser() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<RelatedArtifact>> relatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<EffectevidencesynthesisStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> editor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> approvalDate() { throw new UnsupportedOperationException(); }
    @Override
    public Reference exposure() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> publisher() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEffectEvidenceSynthesis fromJson(Json json) {
    ImmutableEffectEvidenceSynthesis.Builder builder = ((ImmutableEffectEvidenceSynthesis.Builder) ImmutableEffectEvidenceSynthesis.builder());
    if (json.effectEstimateIsSet) {
      builder.effectEstimate(json.effectEstimate);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.certaintyIsSet) {
      builder.certainty(json.certainty);
    }
    if (json.sampleSizeIsSet) {
      builder.sampleSize(json.sampleSize);
    }
    if (json.outcome != null) {
      builder.outcome(json.outcome);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.lastReviewDateIsSet) {
      builder.lastReviewDate(json.lastReviewDate);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.topicIsSet) {
      builder.topic(json.topic);
    }
    if (json.studyTypeIsSet) {
      builder.studyType(json.studyType);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.reviewerIsSet) {
      builder.reviewer(json.reviewer);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.resultsByExposureIsSet) {
      builder.resultsByExposure(json.resultsByExposure);
    }
    if (json.exposureAlternative != null) {
      builder.exposureAlternative(json.exposureAlternative);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.population != null) {
      builder.population(json.population);
    }
    if (json.synthesisTypeIsSet) {
      builder.synthesisType(json.synthesisType);
    }
    if (json.endorserIsSet) {
      builder.endorser(json.endorser);
    }
    if (json.relatedArtifactIsSet) {
      builder.relatedArtifact(json.relatedArtifact);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.editorIsSet) {
      builder.editor(json.editor);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.approvalDateIsSet) {
      builder.approvalDate(json.approvalDate);
    }
    if (json.exposure != null) {
      builder.exposure(json.exposure);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
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
        .effectEstimate(instance.effectEstimate())
        .extension(instance.extension())
        .certainty(instance.certainty())
        .sampleSize(instance.sampleSize())
        .outcome(instance.outcome())
        .id(instance.id())
        .meta(instance.meta())
        .url(instance.url())
        .title(instance.title())
        .lastReviewDate(instance.lastReviewDate())
        .note(instance.note())
        .date(instance.date())
        .topic(instance.topic())
        .studyType(instance.studyType())
        .name(instance.name())
        .reviewer(instance.reviewer())
        .resourceType(instance.resourceType())
        .author(instance.author())
        .resultsByExposure(instance.resultsByExposure())
        .exposureAlternative(instance.exposureAlternative())
        .text(instance.text())
        .population(instance.population())
        .synthesisType(instance.synthesisType())
        .endorser(instance.endorser())
        .relatedArtifact(instance.relatedArtifact())
        .contained(instance.contained())
        .language(instance.language())
        .version(instance.version())
        .status(instance.status())
        .effectivePeriod(instance.effectivePeriod())
        .identifier(instance.identifier())
        .editor(instance.editor())
        .contact(instance.contact())
        .useContext(instance.useContext())
        .description(instance.description())
        .implicitRules(instance.implicitRules())
        .copyright(instance.copyright())
        .jurisdiction(instance.jurisdiction())
        .approvalDate(instance.approvalDate())
        .exposure(instance.exposure())
        .modifierExtension(instance.modifierExtension())
        .publisher(instance.publisher())
        .build();
  }

  /**
   * Creates a builder for {@link EffectEvidenceSynthesis EffectEvidenceSynthesis}.
   * <pre>
   * ImmutableEffectEvidenceSynthesis.builder()
   *    .effectEstimate(List&amp;lt;com.fhir.types.fhir.EffectEvidenceSynthesis_EffectEstimate&amp;gt;) // optional {@link EffectEvidenceSynthesis#effectEstimate() effectEstimate}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link EffectEvidenceSynthesis#extension() extension}
   *    .certainty(List&amp;lt;com.fhir.types.fhir.EffectEvidenceSynthesis_Certainty&amp;gt;) // optional {@link EffectEvidenceSynthesis#certainty() certainty}
   *    .sampleSize(com.fhir.types.fhir.EffectEvidenceSynthesis_SampleSize) // optional {@link EffectEvidenceSynthesis#sampleSize() sampleSize}
   *    .outcome(com.fhir.types.fhir.Reference) // required {@link EffectEvidenceSynthesis#outcome() outcome}
   *    .id(com.fhir.types.fhir.Id) // optional {@link EffectEvidenceSynthesis#id() id}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link EffectEvidenceSynthesis#meta() meta}
   *    .url(com.fhir.types.fhir.Uri) // optional {@link EffectEvidenceSynthesis#url() url}
   *    .title(String) // optional {@link EffectEvidenceSynthesis#title() title}
   *    .lastReviewDate(com.fhir.types.fhir.Date) // optional {@link EffectEvidenceSynthesis#lastReviewDate() lastReviewDate}
   *    .note(List&amp;lt;com.fhir.types.fhir.Annotation&amp;gt;) // optional {@link EffectEvidenceSynthesis#note() note}
   *    .date(com.fhir.types.fhir.DateTime) // optional {@link EffectEvidenceSynthesis#date() date}
   *    .topic(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link EffectEvidenceSynthesis#topic() topic}
   *    .studyType(com.fhir.types.fhir.CodeableConcept) // optional {@link EffectEvidenceSynthesis#studyType() studyType}
   *    .name(String) // optional {@link EffectEvidenceSynthesis#name() name}
   *    .reviewer(List&amp;lt;com.fhir.types.fhir.ContactDetail&amp;gt;) // optional {@link EffectEvidenceSynthesis#reviewer() reviewer}
   *    .resourceType(String) // required {@link EffectEvidenceSynthesis#resourceType() resourceType}
   *    .author(List&amp;lt;com.fhir.types.fhir.ContactDetail&amp;gt;) // optional {@link EffectEvidenceSynthesis#author() author}
   *    .resultsByExposure(List&amp;lt;com.fhir.types.fhir.EffectEvidenceSynthesis_ResultsByExposure&amp;gt;) // optional {@link EffectEvidenceSynthesis#resultsByExposure() resultsByExposure}
   *    .exposureAlternative(com.fhir.types.fhir.Reference) // required {@link EffectEvidenceSynthesis#exposureAlternative() exposureAlternative}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link EffectEvidenceSynthesis#text() text}
   *    .population(com.fhir.types.fhir.Reference) // required {@link EffectEvidenceSynthesis#population() population}
   *    .synthesisType(com.fhir.types.fhir.CodeableConcept) // optional {@link EffectEvidenceSynthesis#synthesisType() synthesisType}
   *    .endorser(List&amp;lt;com.fhir.types.fhir.ContactDetail&amp;gt;) // optional {@link EffectEvidenceSynthesis#endorser() endorser}
   *    .relatedArtifact(List&amp;lt;com.fhir.types.fhir.RelatedArtifact&amp;gt;) // optional {@link EffectEvidenceSynthesis#relatedArtifact() relatedArtifact}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link EffectEvidenceSynthesis#contained() contained}
   *    .language(com.fhir.types.fhir.Code) // optional {@link EffectEvidenceSynthesis#language() language}
   *    .version(String) // optional {@link EffectEvidenceSynthesis#version() version}
   *    .status(com.fhir.types.fhir.EffectevidencesynthesisStatus) // optional {@link EffectEvidenceSynthesis#status() status}
   *    .effectivePeriod(com.fhir.types.fhir.Period) // optional {@link EffectEvidenceSynthesis#effectivePeriod() effectivePeriod}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link EffectEvidenceSynthesis#identifier() identifier}
   *    .editor(List&amp;lt;com.fhir.types.fhir.ContactDetail&amp;gt;) // optional {@link EffectEvidenceSynthesis#editor() editor}
   *    .contact(List&amp;lt;com.fhir.types.fhir.ContactDetail&amp;gt;) // optional {@link EffectEvidenceSynthesis#contact() contact}
   *    .useContext(List&amp;lt;com.fhir.types.fhir.UsageContext&amp;gt;) // optional {@link EffectEvidenceSynthesis#useContext() useContext}
   *    .description(com.fhir.types.fhir.Markdown) // optional {@link EffectEvidenceSynthesis#description() description}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link EffectEvidenceSynthesis#implicitRules() implicitRules}
   *    .copyright(com.fhir.types.fhir.Markdown) // optional {@link EffectEvidenceSynthesis#copyright() copyright}
   *    .jurisdiction(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link EffectEvidenceSynthesis#jurisdiction() jurisdiction}
   *    .approvalDate(com.fhir.types.fhir.Date) // optional {@link EffectEvidenceSynthesis#approvalDate() approvalDate}
   *    .exposure(com.fhir.types.fhir.Reference) // required {@link EffectEvidenceSynthesis#exposure() exposure}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link EffectEvidenceSynthesis#modifierExtension() modifierExtension}
   *    .publisher(String) // optional {@link EffectEvidenceSynthesis#publisher() publisher}
   *    .build();
   * </pre>
   * @return A new EffectEvidenceSynthesis builder
   */
  public static OutcomeBuildStage builder() {
    return new ImmutableEffectEvidenceSynthesis.Builder();
  }

  /**
   * Builds instances of type {@link EffectEvidenceSynthesis EffectEvidenceSynthesis}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "EffectEvidenceSynthesis", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder
      implements OutcomeBuildStage, ResourceTypeBuildStage, ExposureAlternativeBuildStage, PopulationBuildStage, ExposureBuildStage, BuildFinal {
    private static final long INIT_BIT_OUTCOME = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long INIT_BIT_EXPOSURE_ALTERNATIVE = 0x4L;
    private static final long INIT_BIT_POPULATION = 0x8L;
    private static final long INIT_BIT_EXPOSURE = 0x10L;
    private static final long OPT_BIT_EFFECT_ESTIMATE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_CERTAINTY = 0x4L;
    private static final long OPT_BIT_SAMPLE_SIZE = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_META = 0x20L;
    private static final long OPT_BIT_URL = 0x40L;
    private static final long OPT_BIT_TITLE = 0x80L;
    private static final long OPT_BIT_LAST_REVIEW_DATE = 0x100L;
    private static final long OPT_BIT_NOTE = 0x200L;
    private static final long OPT_BIT_DATE = 0x400L;
    private static final long OPT_BIT_TOPIC = 0x800L;
    private static final long OPT_BIT_STUDY_TYPE = 0x1000L;
    private static final long OPT_BIT_NAME = 0x2000L;
    private static final long OPT_BIT_REVIEWER = 0x4000L;
    private static final long OPT_BIT_AUTHOR = 0x8000L;
    private static final long OPT_BIT_RESULTS_BY_EXPOSURE = 0x10000L;
    private static final long OPT_BIT_TEXT = 0x20000L;
    private static final long OPT_BIT_SYNTHESIS_TYPE = 0x40000L;
    private static final long OPT_BIT_ENDORSER = 0x80000L;
    private static final long OPT_BIT_RELATED_ARTIFACT = 0x100000L;
    private static final long OPT_BIT_CONTAINED = 0x200000L;
    private static final long OPT_BIT_LANGUAGE = 0x400000L;
    private static final long OPT_BIT_VERSION = 0x800000L;
    private static final long OPT_BIT_STATUS = 0x1000000L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x2000000L;
    private static final long OPT_BIT_IDENTIFIER = 0x4000000L;
    private static final long OPT_BIT_EDITOR = 0x8000000L;
    private static final long OPT_BIT_CONTACT = 0x10000000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x20000000L;
    private static final long OPT_BIT_DESCRIPTION = 0x40000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x80000000L;
    private static final long OPT_BIT_COPYRIGHT = 0x100000000L;
    private static final long OPT_BIT_JURISDICTION = 0x200000000L;
    private static final long OPT_BIT_APPROVAL_DATE = 0x400000000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x800000000L;
    private static final long OPT_BIT_PUBLISHER = 0x1000000000L;
    private long initBits = 0x1fL;
    private long optBits;

    private @Nullable List<EffectEvidenceSynthesis_EffectEstimate> effectEstimate;
    private @Nullable List<Extension> extension;
    private @Nullable List<EffectEvidenceSynthesis_Certainty> certainty;
    private @Nullable EffectEvidenceSynthesis_SampleSize sampleSize;
    private @Nullable Reference outcome;
    private @Nullable Id id;
    private @Nullable Meta meta;
    private @Nullable Uri url;
    private @Nullable String title;
    private @Nullable Date lastReviewDate;
    private @Nullable List<Annotation> note;
    private @Nullable DateTime date;
    private @Nullable List<CodeableConcept> topic;
    private @Nullable CodeableConcept studyType;
    private @Nullable String name;
    private @Nullable List<ContactDetail> reviewer;
    private @Nullable String resourceType;
    private @Nullable List<ContactDetail> author;
    private @Nullable List<EffectEvidenceSynthesis_ResultsByExposure> resultsByExposure;
    private @Nullable Reference exposureAlternative;
    private @Nullable Narrative text;
    private @Nullable Reference population;
    private @Nullable CodeableConcept synthesisType;
    private @Nullable List<ContactDetail> endorser;
    private @Nullable List<RelatedArtifact> relatedArtifact;
    private @Nullable List<ResourceList> contained;
    private @Nullable Code language;
    private @Nullable String version;
    private @Nullable EffectevidencesynthesisStatus status;
    private @Nullable Period effectivePeriod;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<ContactDetail> editor;
    private @Nullable List<ContactDetail> contact;
    private @Nullable List<UsageContext> useContext;
    private @Nullable Markdown description;
    private @Nullable Uri implicitRules;
    private @Nullable Markdown copyright;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable Date approvalDate;
    private @Nullable Reference exposure;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String publisher;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#effectEstimate() effectEstimate} to effectEstimate.
     * @param effectEstimate The value for effectEstimate
     * @return {@code this} builder for chained invocation
     */
    public final Builder effectEstimate(List<EffectEvidenceSynthesis_EffectEstimate> effectEstimate) {
      checkNotIsSet(effectEstimateIsSet(), "effectEstimate");
      this.effectEstimate = Objects.requireNonNull(effectEstimate, "effectEstimate");
      optBits |= OPT_BIT_EFFECT_ESTIMATE;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#effectEstimate() effectEstimate} to effectEstimate.
     * @param effectEstimate The value for effectEstimate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("effectEstimate")
    public final Builder effectEstimate(Optional<? extends List<EffectEvidenceSynthesis_EffectEstimate>> effectEstimate) {
      checkNotIsSet(effectEstimateIsSet(), "effectEstimate");
      this.effectEstimate = effectEstimate.orElse(null);
      optBits |= OPT_BIT_EFFECT_ESTIMATE;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#extension() extension} to extension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#extension() extension} to extension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#certainty() certainty} to certainty.
     * @param certainty The value for certainty
     * @return {@code this} builder for chained invocation
     */
    public final Builder certainty(List<EffectEvidenceSynthesis_Certainty> certainty) {
      checkNotIsSet(certaintyIsSet(), "certainty");
      this.certainty = Objects.requireNonNull(certainty, "certainty");
      optBits |= OPT_BIT_CERTAINTY;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#certainty() certainty} to certainty.
     * @param certainty The value for certainty
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("certainty")
    public final Builder certainty(Optional<? extends List<EffectEvidenceSynthesis_Certainty>> certainty) {
      checkNotIsSet(certaintyIsSet(), "certainty");
      this.certainty = certainty.orElse(null);
      optBits |= OPT_BIT_CERTAINTY;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#sampleSize() sampleSize} to sampleSize.
     * @param sampleSize The value for sampleSize
     * @return {@code this} builder for chained invocation
     */
    public final Builder sampleSize(EffectEvidenceSynthesis_SampleSize sampleSize) {
      checkNotIsSet(sampleSizeIsSet(), "sampleSize");
      this.sampleSize = Objects.requireNonNull(sampleSize, "sampleSize");
      optBits |= OPT_BIT_SAMPLE_SIZE;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#sampleSize() sampleSize} to sampleSize.
     * @param sampleSize The value for sampleSize
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sampleSize")
    public final Builder sampleSize(Optional<? extends EffectEvidenceSynthesis_SampleSize> sampleSize) {
      checkNotIsSet(sampleSizeIsSet(), "sampleSize");
      this.sampleSize = sampleSize.orElse(null);
      optBits |= OPT_BIT_SAMPLE_SIZE;
      return this;
    }

    /**
     * Initializes the value for the {@link EffectEvidenceSynthesis#outcome() outcome} attribute.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#id() id} to id.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#id() id} to id.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#meta() meta} to meta.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#meta() meta} to meta.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#url() url} to url.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#url() url} to url.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#title() title} to title.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#title() title} to title.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#note() note} to note.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#note() note} to note.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#date() date} to date.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#date() date} to date.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#topic() topic} to topic.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#topic() topic} to topic.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#studyType() studyType} to studyType.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#studyType() studyType} to studyType.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#name() name} to name.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#name() name} to name.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#reviewer() reviewer} to reviewer.
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
     * Initializes the value for the {@link EffectEvidenceSynthesis#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#author() author} to author.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#author() author} to author.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#resultsByExposure() resultsByExposure} to resultsByExposure.
     * @param resultsByExposure The value for resultsByExposure
     * @return {@code this} builder for chained invocation
     */
    public final Builder resultsByExposure(List<EffectEvidenceSynthesis_ResultsByExposure> resultsByExposure) {
      checkNotIsSet(resultsByExposureIsSet(), "resultsByExposure");
      this.resultsByExposure = Objects.requireNonNull(resultsByExposure, "resultsByExposure");
      optBits |= OPT_BIT_RESULTS_BY_EXPOSURE;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#resultsByExposure() resultsByExposure} to resultsByExposure.
     * @param resultsByExposure The value for resultsByExposure
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resultsByExposure")
    public final Builder resultsByExposure(Optional<? extends List<EffectEvidenceSynthesis_ResultsByExposure>> resultsByExposure) {
      checkNotIsSet(resultsByExposureIsSet(), "resultsByExposure");
      this.resultsByExposure = resultsByExposure.orElse(null);
      optBits |= OPT_BIT_RESULTS_BY_EXPOSURE;
      return this;
    }

    /**
     * Initializes the value for the {@link EffectEvidenceSynthesis#exposureAlternative() exposureAlternative} attribute.
     * @param exposureAlternative The value for exposureAlternative 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("exposureAlternative")
    public final Builder exposureAlternative(Reference exposureAlternative) {
      checkNotIsSet(exposureAlternativeIsSet(), "exposureAlternative");
      this.exposureAlternative = Objects.requireNonNull(exposureAlternative, "exposureAlternative");
      initBits &= ~INIT_BIT_EXPOSURE_ALTERNATIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#text() text} to text.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#text() text} to text.
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
     * Initializes the value for the {@link EffectEvidenceSynthesis#population() population} attribute.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#synthesisType() synthesisType} to synthesisType.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#synthesisType() synthesisType} to synthesisType.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#contained() contained} to contained.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#contained() contained} to contained.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#language() language} to language.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#language() language} to language.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#version() version} to version.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#version() version} to version.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(EffectevidencesynthesisStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends EffectevidencesynthesisStatus> status) {
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
    public final Builder effectivePeriod(Period effectivePeriod) {
      checkNotIsSet(effectivePeriodIsSet(), "effectivePeriod");
      this.effectivePeriod = Objects.requireNonNull(effectivePeriod, "effectivePeriod");
      optBits |= OPT_BIT_EFFECTIVE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#editor() editor} to editor.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#editor() editor} to editor.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#contact() contact} to contact.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#contact() contact} to contact.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#description() description} to description.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#description() description} to description.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the value for the {@link EffectEvidenceSynthesis#exposure() exposure} attribute.
     * @param exposure The value for exposure 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("exposure")
    public final Builder exposure(Reference exposure) {
      checkNotIsSet(exposureIsSet(), "exposure");
      this.exposure = Objects.requireNonNull(exposure, "exposure");
      initBits &= ~INIT_BIT_EXPOSURE;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis#publisher() publisher} to publisher.
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
     * Builds a new {@link EffectEvidenceSynthesis EffectEvidenceSynthesis}.
     * @return An immutable instance of EffectEvidenceSynthesis
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public EffectEvidenceSynthesis build() {
      checkRequiredAttributes();
      return new ImmutableEffectEvidenceSynthesis(
          effectEstimate,
          extension,
          certainty,
          sampleSize,
          outcome,
          id,
          meta,
          url,
          title,
          lastReviewDate,
          note,
          date,
          topic,
          studyType,
          name,
          reviewer,
          resourceType,
          author,
          resultsByExposure,
          exposureAlternative,
          text,
          population,
          synthesisType,
          endorser,
          relatedArtifact,
          contained,
          language,
          version,
          status,
          effectivePeriod,
          identifier,
          editor,
          contact,
          useContext,
          description,
          implicitRules,
          copyright,
          jurisdiction,
          approvalDate,
          exposure,
          modifierExtension,
          publisher);
    }

    private boolean effectEstimateIsSet() {
      return (optBits & OPT_BIT_EFFECT_ESTIMATE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean certaintyIsSet() {
      return (optBits & OPT_BIT_CERTAINTY) != 0;
    }

    private boolean sampleSizeIsSet() {
      return (optBits & OPT_BIT_SAMPLE_SIZE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean lastReviewDateIsSet() {
      return (optBits & OPT_BIT_LAST_REVIEW_DATE) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean topicIsSet() {
      return (optBits & OPT_BIT_TOPIC) != 0;
    }

    private boolean studyTypeIsSet() {
      return (optBits & OPT_BIT_STUDY_TYPE) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean reviewerIsSet() {
      return (optBits & OPT_BIT_REVIEWER) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean resultsByExposureIsSet() {
      return (optBits & OPT_BIT_RESULTS_BY_EXPOSURE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean synthesisTypeIsSet() {
      return (optBits & OPT_BIT_SYNTHESIS_TYPE) != 0;
    }

    private boolean endorserIsSet() {
      return (optBits & OPT_BIT_ENDORSER) != 0;
    }

    private boolean relatedArtifactIsSet() {
      return (optBits & OPT_BIT_RELATED_ARTIFACT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean editorIsSet() {
      return (optBits & OPT_BIT_EDITOR) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean approvalDateIsSet() {
      return (optBits & OPT_BIT_APPROVAL_DATE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean outcomeIsSet() {
      return (initBits & INIT_BIT_OUTCOME) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean exposureAlternativeIsSet() {
      return (initBits & INIT_BIT_EXPOSURE_ALTERNATIVE) == 0;
    }

    private boolean populationIsSet() {
      return (initBits & INIT_BIT_POPULATION) == 0;
    }

    private boolean exposureIsSet() {
      return (initBits & INIT_BIT_EXPOSURE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of EffectEvidenceSynthesis is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!outcomeIsSet()) attributes.add("outcome");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!exposureAlternativeIsSet()) attributes.add("exposureAlternative");
      if (!populationIsSet()) attributes.add("population");
      if (!exposureIsSet()) attributes.add("exposure");
      return "Cannot build EffectEvidenceSynthesis, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "EffectEvidenceSynthesis", generator = "Immutables")
  public interface OutcomeBuildStage {
    /**
     * Initializes the value for the {@link EffectEvidenceSynthesis#outcome() outcome} attribute.
     * @param outcome The value for outcome 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage outcome(Reference outcome);
  }

  @Generated(from = "EffectEvidenceSynthesis", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link EffectEvidenceSynthesis#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    ExposureAlternativeBuildStage resourceType(String resourceType);
  }

  @Generated(from = "EffectEvidenceSynthesis", generator = "Immutables")
  public interface ExposureAlternativeBuildStage {
    /**
     * Initializes the value for the {@link EffectEvidenceSynthesis#exposureAlternative() exposureAlternative} attribute.
     * @param exposureAlternative The value for exposureAlternative 
     * @return {@code this} builder for use in a chained invocation
     */
    PopulationBuildStage exposureAlternative(Reference exposureAlternative);
  }

  @Generated(from = "EffectEvidenceSynthesis", generator = "Immutables")
  public interface PopulationBuildStage {
    /**
     * Initializes the value for the {@link EffectEvidenceSynthesis#population() population} attribute.
     * @param population The value for population 
     * @return {@code this} builder for use in a chained invocation
     */
    ExposureBuildStage population(Reference population);
  }

  @Generated(from = "EffectEvidenceSynthesis", generator = "Immutables")
  public interface ExposureBuildStage {
    /**
     * Initializes the value for the {@link EffectEvidenceSynthesis#exposure() exposure} attribute.
     * @param exposure The value for exposure 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal exposure(Reference exposure);
  }

  @Generated(from = "EffectEvidenceSynthesis", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#effectEstimate() effectEstimate} to effectEstimate.
     * @param effectEstimate The value for effectEstimate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectEstimate(List<EffectEvidenceSynthesis_EffectEstimate> effectEstimate);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#effectEstimate() effectEstimate} to effectEstimate.
     * @param effectEstimate The value for effectEstimate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectEstimate(Optional<? extends List<EffectEvidenceSynthesis_EffectEstimate>> effectEstimate);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#certainty() certainty} to certainty.
     * @param certainty The value for certainty
     * @return {@code this} builder for chained invocation
     */
    BuildFinal certainty(List<EffectEvidenceSynthesis_Certainty> certainty);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#certainty() certainty} to certainty.
     * @param certainty The value for certainty
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal certainty(Optional<? extends List<EffectEvidenceSynthesis_Certainty>> certainty);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#sampleSize() sampleSize} to sampleSize.
     * @param sampleSize The value for sampleSize
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sampleSize(EffectEvidenceSynthesis_SampleSize sampleSize);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#sampleSize() sampleSize} to sampleSize.
     * @param sampleSize The value for sampleSize
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sampleSize(Optional<? extends EffectEvidenceSynthesis_SampleSize> sampleSize);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastReviewDate(Date lastReviewDate);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastReviewDate(Optional<? extends Date> lastReviewDate);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topic(List<CodeableConcept> topic);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topic(Optional<? extends List<CodeableConcept>> topic);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#studyType() studyType} to studyType.
     * @param studyType The value for studyType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal studyType(CodeableConcept studyType);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#studyType() studyType} to studyType.
     * @param studyType The value for studyType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal studyType(Optional<? extends CodeableConcept> studyType);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reviewer(List<ContactDetail> reviewer);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reviewer(Optional<? extends List<ContactDetail>> reviewer);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(List<ContactDetail> author);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(Optional<? extends List<ContactDetail>> author);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#resultsByExposure() resultsByExposure} to resultsByExposure.
     * @param resultsByExposure The value for resultsByExposure
     * @return {@code this} builder for chained invocation
     */
    BuildFinal resultsByExposure(List<EffectEvidenceSynthesis_ResultsByExposure> resultsByExposure);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#resultsByExposure() resultsByExposure} to resultsByExposure.
     * @param resultsByExposure The value for resultsByExposure
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resultsByExposure(Optional<? extends List<EffectEvidenceSynthesis_ResultsByExposure>> resultsByExposure);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#synthesisType() synthesisType} to synthesisType.
     * @param synthesisType The value for synthesisType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal synthesisType(CodeableConcept synthesisType);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#synthesisType() synthesisType} to synthesisType.
     * @param synthesisType The value for synthesisType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal synthesisType(Optional<? extends CodeableConcept> synthesisType);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endorser(List<ContactDetail> endorser);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endorser(Optional<? extends List<ContactDetail>> endorser);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatedArtifact(List<RelatedArtifact> relatedArtifact);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatedArtifact(Optional<? extends List<RelatedArtifact>> relatedArtifact);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(EffectevidencesynthesisStatus status);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends EffectevidencesynthesisStatus> status);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(Period effectivePeriod);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(Optional<? extends Period> effectivePeriod);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal editor(List<ContactDetail> editor);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal editor(Optional<? extends List<ContactDetail>> editor);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(List<UsageContext> useContext);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(Optional<? extends List<UsageContext>> useContext);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(Markdown description);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<? extends Markdown> description);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(Markdown copyright);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(Optional<? extends Markdown> copyright);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(List<CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal approvalDate(Date approvalDate);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal approvalDate(Optional<? extends Date> approvalDate);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(String publisher);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<String> publisher);

    /**
     * Builds a new {@link EffectEvidenceSynthesis EffectEvidenceSynthesis}.
     * @return An immutable instance of EffectEvidenceSynthesis
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    EffectEvidenceSynthesis build();
  }
}
