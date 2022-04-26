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
 * Immutable implementation of {@link ResearchDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableResearchDefinition.builder()}.
 */
@Generated(from = "ResearchDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableResearchDefinition implements ResearchDefinition {
  private final @Nullable List<String> comment;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<ContactDetail> endorser;
  private final @Nullable Uri url;
  private final @Nullable Boolean experimental;
  private final @Nullable Date approvalDate;
  private final @Nullable String usage;
  private final @Nullable List<ContactDetail> author;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Reference outcome;
  private final @Nullable List<CodeableConcept> topic;
  private final @Nullable List<ContactDetail> reviewer;
  private final @Nullable String shortTitle;
  private final @Nullable String version;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final @Nullable List<ContactDetail> contact;
  private final @Nullable Markdown purpose;
  private final @Nullable Period effectivePeriod;
  private final @Nullable Id id;
  private final @Nullable Narrative text;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable DateTime date;
  private final @Nullable Reference subjectReference;
  private final @Nullable Date lastReviewDate;
  private final @Nullable Markdown copyright;
  private final @Nullable List<RelatedArtifact> relatedArtifact;
  private final @Nullable List<UsageContext> useContext;
  private final @Nullable String publisher;
  private final @Nullable Reference exposure;
  private final @Nullable List<ContactDetail> editor;
  private final @Nullable String subtitle;
  private final @Nullable Code language;
  private final @Nullable String title;
  private final @Nullable List<ResourceList> contained;
  private final Reference population;
  private final String resourceType;
  private final @Nullable List<Extension> extension;
  private final @Nullable Markdown description;
  private final @Nullable List<Canonical> library;
  private final @Nullable String name;
  private final @Nullable ResearchdefinitionStatus status;
  private final @Nullable Meta meta;
  private final @Nullable CodeableConcept subjectCodeableConcept;
  private final @Nullable Reference exposureAlternative;

  private ImmutableResearchDefinition(
      @Nullable List<String> comment,
      @Nullable Uri implicitRules,
      @Nullable List<ContactDetail> endorser,
      @Nullable Uri url,
      @Nullable Boolean experimental,
      @Nullable Date approvalDate,
      @Nullable String usage,
      @Nullable List<ContactDetail> author,
      @Nullable List<Extension> modifierExtension,
      @Nullable Reference outcome,
      @Nullable List<CodeableConcept> topic,
      @Nullable List<ContactDetail> reviewer,
      @Nullable String shortTitle,
      @Nullable String version,
      @Nullable List<CodeableConcept> jurisdiction,
      @Nullable List<ContactDetail> contact,
      @Nullable Markdown purpose,
      @Nullable Period effectivePeriod,
      @Nullable Id id,
      @Nullable Narrative text,
      @Nullable List<Identifier> identifier,
      @Nullable DateTime date,
      @Nullable Reference subjectReference,
      @Nullable Date lastReviewDate,
      @Nullable Markdown copyright,
      @Nullable List<RelatedArtifact> relatedArtifact,
      @Nullable List<UsageContext> useContext,
      @Nullable String publisher,
      @Nullable Reference exposure,
      @Nullable List<ContactDetail> editor,
      @Nullable String subtitle,
      @Nullable Code language,
      @Nullable String title,
      @Nullable List<ResourceList> contained,
      Reference population,
      String resourceType,
      @Nullable List<Extension> extension,
      @Nullable Markdown description,
      @Nullable List<Canonical> library,
      @Nullable String name,
      @Nullable ResearchdefinitionStatus status,
      @Nullable Meta meta,
      @Nullable CodeableConcept subjectCodeableConcept,
      @Nullable Reference exposureAlternative) {
    this.comment = comment;
    this.implicitRules = implicitRules;
    this.endorser = endorser;
    this.url = url;
    this.experimental = experimental;
    this.approvalDate = approvalDate;
    this.usage = usage;
    this.author = author;
    this.modifierExtension = modifierExtension;
    this.outcome = outcome;
    this.topic = topic;
    this.reviewer = reviewer;
    this.shortTitle = shortTitle;
    this.version = version;
    this.jurisdiction = jurisdiction;
    this.contact = contact;
    this.purpose = purpose;
    this.effectivePeriod = effectivePeriod;
    this.id = id;
    this.text = text;
    this.identifier = identifier;
    this.date = date;
    this.subjectReference = subjectReference;
    this.lastReviewDate = lastReviewDate;
    this.copyright = copyright;
    this.relatedArtifact = relatedArtifact;
    this.useContext = useContext;
    this.publisher = publisher;
    this.exposure = exposure;
    this.editor = editor;
    this.subtitle = subtitle;
    this.language = language;
    this.title = title;
    this.contained = contained;
    this.population = population;
    this.resourceType = resourceType;
    this.extension = extension;
    this.description = description;
    this.library = library;
    this.name = name;
    this.status = status;
    this.meta = meta;
    this.subjectCodeableConcept = subjectCodeableConcept;
    this.exposureAlternative = exposureAlternative;
  }

  /**
   * @return The value of the {@code comment} attribute
   */
  @JsonProperty("comment")
  @Override
  public Optional<List<String>> comment() {
    return Optional.ofNullable(comment);
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
   * @return The value of the {@code endorser} attribute
   */
  @JsonProperty("endorser")
  @Override
  public Optional<List<ContactDetail>> endorser() {
    return Optional.ofNullable(endorser);
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
   * @return The value of the {@code experimental} attribute
   */
  @JsonProperty("experimental")
  @Override
  public Optional<Boolean> experimental() {
    return Optional.ofNullable(experimental);
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
   * @return The value of the {@code usage} attribute
   */
  @JsonProperty("usage")
  @Override
  public Optional<String> usage() {
    return Optional.ofNullable(usage);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code outcome} attribute
   */
  @JsonProperty("outcome")
  @Override
  public Optional<Reference> outcome() {
    return Optional.ofNullable(outcome);
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
   * @return The value of the {@code reviewer} attribute
   */
  @JsonProperty("reviewer")
  @Override
  public Optional<List<ContactDetail>> reviewer() {
    return Optional.ofNullable(reviewer);
  }

  /**
   * @return The value of the {@code shortTitle} attribute
   */
  @JsonProperty("shortTitle")
  @Override
  public Optional<String> shortTitle() {
    return Optional.ofNullable(shortTitle);
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @JsonProperty("jurisdiction")
  @Override
  public Optional<List<CodeableConcept>> jurisdiction() {
    return Optional.ofNullable(jurisdiction);
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
   * @return The value of the {@code purpose} attribute
   */
  @JsonProperty("purpose")
  @Override
  public Optional<Markdown> purpose() {
    return Optional.ofNullable(purpose);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code subjectReference} attribute
   */
  @JsonProperty("subjectReference")
  @Override
  public Optional<Reference> subjectReference() {
    return Optional.ofNullable(subjectReference);
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
   * @return The value of the {@code copyright} attribute
   */
  @JsonProperty("copyright")
  @Override
  public Optional<Markdown> copyright() {
    return Optional.ofNullable(copyright);
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
   * @return The value of the {@code useContext} attribute
   */
  @JsonProperty("useContext")
  @Override
  public Optional<List<UsageContext>> useContext() {
    return Optional.ofNullable(useContext);
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
   * @return The value of the {@code exposure} attribute
   */
  @JsonProperty("exposure")
  @Override
  public Optional<Reference> exposure() {
    return Optional.ofNullable(exposure);
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
   * @return The value of the {@code subtitle} attribute
   */
  @JsonProperty("subtitle")
  @Override
  public Optional<String> subtitle() {
    return Optional.ofNullable(subtitle);
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
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
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
   * @return The value of the {@code population} attribute
   */
  @JsonProperty("population")
  @Override
  public Reference population() {
    return population;
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code library} attribute
   */
  @JsonProperty("library")
  @Override
  public Optional<List<Canonical>> library() {
    return Optional.ofNullable(library);
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
  public Optional<ResearchdefinitionStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code subjectCodeableConcept} attribute
   */
  @JsonProperty("subjectCodeableConcept")
  @Override
  public Optional<CodeableConcept> subjectCodeableConcept() {
    return Optional.ofNullable(subjectCodeableConcept);
  }

  /**
   * @return The value of the {@code exposureAlternative} attribute
   */
  @JsonProperty("exposureAlternative")
  @Override
  public Optional<Reference> exposureAlternative() {
    return Optional.ofNullable(exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withComment(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "comment");
    if (this.comment == newValue) return this;
    return new ImmutableResearchDefinition(
        newValue,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#comment() comment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withComment(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.comment == value) return this;
    return new ImmutableResearchDefinition(
        value,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        newValue,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        value,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#endorser() endorser} attribute.
   * @param value The value for endorser
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withEndorser(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "endorser");
    if (this.endorser == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        newValue,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#endorser() endorser} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endorser
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withEndorser(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.endorser == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        value,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        newValue,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        value,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withExperimental(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        newValue,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withExperimental(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.experimental, value)) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        value,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#approvalDate() approvalDate} attribute.
   * @param value The value for approvalDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withApprovalDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "approvalDate");
    if (this.approvalDate == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        newValue,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#approvalDate() approvalDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for approvalDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withApprovalDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.approvalDate == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        value,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#usage() usage} attribute.
   * @param value The value for usage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withUsage(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "usage");
    if (Objects.equals(this.usage, newValue)) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        newValue,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#usage() usage} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withUsage(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.usage, value)) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        value,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withAuthor(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        newValue,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withAuthor(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        value,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        newValue,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        value,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withOutcome(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        newValue,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withOutcome(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        value,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#topic() topic} attribute.
   * @param value The value for topic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withTopic(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "topic");
    if (this.topic == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        newValue,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#topic() topic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withTopic(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.topic == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        value,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#reviewer() reviewer} attribute.
   * @param value The value for reviewer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withReviewer(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "reviewer");
    if (this.reviewer == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        newValue,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#reviewer() reviewer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reviewer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withReviewer(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.reviewer == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        value,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#shortTitle() shortTitle} attribute.
   * @param value The value for shortTitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withShortTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "shortTitle");
    if (Objects.equals(this.shortTitle, newValue)) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        newValue,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#shortTitle() shortTitle} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for shortTitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withShortTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.shortTitle, value)) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        value,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        newValue,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        value,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        newValue,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        value,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        newValue,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        value,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withPurpose(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        newValue,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withPurpose(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        value,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withEffectivePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        newValue,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withEffectivePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        value,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        newValue,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        value,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        newValue,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        value,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        newValue,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        value,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        newValue,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        value,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#subjectReference() subjectReference} attribute.
   * @param value The value for subjectReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withSubjectReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subjectReference");
    if (this.subjectReference == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        newValue,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#subjectReference() subjectReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withSubjectReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subjectReference == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        value,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#lastReviewDate() lastReviewDate} attribute.
   * @param value The value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withLastReviewDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "lastReviewDate");
    if (this.lastReviewDate == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        newValue,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#lastReviewDate() lastReviewDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withLastReviewDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.lastReviewDate == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        value,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withCopyright(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        newValue,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withCopyright(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        value,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#relatedArtifact() relatedArtifact} attribute.
   * @param value The value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withRelatedArtifact(List<RelatedArtifact> value) {
    @Nullable List<RelatedArtifact> newValue = Objects.requireNonNull(value, "relatedArtifact");
    if (this.relatedArtifact == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        newValue,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#relatedArtifact() relatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withRelatedArtifact(Optional<? extends List<RelatedArtifact>> optional) {
    @Nullable List<RelatedArtifact> value = optional.orElse(null);
    if (this.relatedArtifact == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        value,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withUseContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        newValue,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withUseContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        value,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withPublisher(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "publisher");
    if (Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        newValue,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withPublisher(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.publisher, value)) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        value,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#exposure() exposure} attribute.
   * @param value The value for exposure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withExposure(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "exposure");
    if (this.exposure == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        newValue,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#exposure() exposure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exposure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withExposure(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.exposure == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        value,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#editor() editor} attribute.
   * @param value The value for editor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withEditor(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "editor");
    if (this.editor == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        newValue,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#editor() editor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for editor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withEditor(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.editor == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        value,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#subtitle() subtitle} attribute.
   * @param value The value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withSubtitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "subtitle");
    if (Objects.equals(this.subtitle, newValue)) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        newValue,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#subtitle() subtitle} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withSubtitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.subtitle, value)) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        value,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        newValue,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        value,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        newValue,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        value,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        newValue,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        value,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ResearchDefinition#population() population} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for population
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableResearchDefinition withPopulation(Reference value) {
    if (this.population == value) return this;
    Reference newValue = Objects.requireNonNull(value, "population");
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        newValue,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ResearchDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableResearchDefinition withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        newValue,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        newValue,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        value,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        newValue,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        value,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#library() library} attribute.
   * @param value The value for library
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withLibrary(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "library");
    if (this.library == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        newValue,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#library() library} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for library
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withLibrary(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.library == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        value,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        newValue,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        value,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withStatus(ResearchdefinitionStatus value) {
    @Nullable ResearchdefinitionStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        newValue,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withStatus(Optional<? extends ResearchdefinitionStatus> optional) {
    @Nullable ResearchdefinitionStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        value,
        this.meta,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        newValue,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        value,
        this.subjectCodeableConcept,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * @param value The value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withSubjectCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "subjectCodeableConcept");
    if (this.subjectCodeableConcept == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        newValue,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withSubjectCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.subjectCodeableConcept == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        value,
        this.exposureAlternative);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchDefinition#exposureAlternative() exposureAlternative} attribute.
   * @param value The value for exposureAlternative
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchDefinition withExposureAlternative(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "exposureAlternative");
    if (this.exposureAlternative == newValue) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchDefinition#exposureAlternative() exposureAlternative} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exposureAlternative
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchDefinition withExposureAlternative(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.exposureAlternative == value) return this;
    return new ImmutableResearchDefinition(
        this.comment,
        this.implicitRules,
        this.endorser,
        this.url,
        this.experimental,
        this.approvalDate,
        this.usage,
        this.author,
        this.modifierExtension,
        this.outcome,
        this.topic,
        this.reviewer,
        this.shortTitle,
        this.version,
        this.jurisdiction,
        this.contact,
        this.purpose,
        this.effectivePeriod,
        this.id,
        this.text,
        this.identifier,
        this.date,
        this.subjectReference,
        this.lastReviewDate,
        this.copyright,
        this.relatedArtifact,
        this.useContext,
        this.publisher,
        this.exposure,
        this.editor,
        this.subtitle,
        this.language,
        this.title,
        this.contained,
        this.population,
        this.resourceType,
        this.extension,
        this.description,
        this.library,
        this.name,
        this.status,
        this.meta,
        this.subjectCodeableConcept,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableResearchDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableResearchDefinition
        && equalTo((ImmutableResearchDefinition) another);
  }

  private boolean equalTo(ImmutableResearchDefinition another) {
    return Objects.equals(comment, another.comment)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(endorser, another.endorser)
        && Objects.equals(url, another.url)
        && Objects.equals(experimental, another.experimental)
        && Objects.equals(approvalDate, another.approvalDate)
        && Objects.equals(usage, another.usage)
        && Objects.equals(author, another.author)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(outcome, another.outcome)
        && Objects.equals(topic, another.topic)
        && Objects.equals(reviewer, another.reviewer)
        && Objects.equals(shortTitle, another.shortTitle)
        && Objects.equals(version, another.version)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(contact, another.contact)
        && Objects.equals(purpose, another.purpose)
        && Objects.equals(effectivePeriod, another.effectivePeriod)
        && Objects.equals(id, another.id)
        && Objects.equals(text, another.text)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(date, another.date)
        && Objects.equals(subjectReference, another.subjectReference)
        && Objects.equals(lastReviewDate, another.lastReviewDate)
        && Objects.equals(copyright, another.copyright)
        && Objects.equals(relatedArtifact, another.relatedArtifact)
        && Objects.equals(useContext, another.useContext)
        && Objects.equals(publisher, another.publisher)
        && Objects.equals(exposure, another.exposure)
        && Objects.equals(editor, another.editor)
        && Objects.equals(subtitle, another.subtitle)
        && Objects.equals(language, another.language)
        && Objects.equals(title, another.title)
        && Objects.equals(contained, another.contained)
        && population.equals(another.population)
        && resourceType.equals(another.resourceType)
        && Objects.equals(extension, another.extension)
        && Objects.equals(description, another.description)
        && Objects.equals(library, another.library)
        && Objects.equals(name, another.name)
        && Objects.equals(status, another.status)
        && Objects.equals(meta, another.meta)
        && Objects.equals(subjectCodeableConcept, another.subjectCodeableConcept)
        && Objects.equals(exposureAlternative, another.exposureAlternative);
  }

  /**
   * Computes a hash code from attributes: {@code comment}, {@code implicitRules}, {@code endorser}, {@code url}, {@code experimental}, {@code approvalDate}, {@code usage}, {@code author}, {@code modifierExtension}, {@code outcome}, {@code topic}, {@code reviewer}, {@code shortTitle}, {@code version}, {@code jurisdiction}, {@code contact}, {@code purpose}, {@code effectivePeriod}, {@code id}, {@code text}, {@code identifier}, {@code date}, {@code subjectReference}, {@code lastReviewDate}, {@code copyright}, {@code relatedArtifact}, {@code useContext}, {@code publisher}, {@code exposure}, {@code editor}, {@code subtitle}, {@code language}, {@code title}, {@code contained}, {@code population}, {@code resourceType}, {@code extension}, {@code description}, {@code library}, {@code name}, {@code status}, {@code meta}, {@code subjectCodeableConcept}, {@code exposureAlternative}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(comment);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(endorser);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(experimental);
    h += (h << 5) + Objects.hashCode(approvalDate);
    h += (h << 5) + Objects.hashCode(usage);
    h += (h << 5) + Objects.hashCode(author);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(outcome);
    h += (h << 5) + Objects.hashCode(topic);
    h += (h << 5) + Objects.hashCode(reviewer);
    h += (h << 5) + Objects.hashCode(shortTitle);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(purpose);
    h += (h << 5) + Objects.hashCode(effectivePeriod);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(subjectReference);
    h += (h << 5) + Objects.hashCode(lastReviewDate);
    h += (h << 5) + Objects.hashCode(copyright);
    h += (h << 5) + Objects.hashCode(relatedArtifact);
    h += (h << 5) + Objects.hashCode(useContext);
    h += (h << 5) + Objects.hashCode(publisher);
    h += (h << 5) + Objects.hashCode(exposure);
    h += (h << 5) + Objects.hashCode(editor);
    h += (h << 5) + Objects.hashCode(subtitle);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + population.hashCode();
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(library);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(subjectCodeableConcept);
    h += (h << 5) + Objects.hashCode(exposureAlternative);
    return h;
  }

  /**
   * Prints the immutable value {@code ResearchDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ResearchDefinition{");
    if (comment != null) {
      builder.append("comment=").append(comment);
    }
    if (implicitRules != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (endorser != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("endorser=").append(endorser);
    }
    if (url != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (experimental != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (approvalDate != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("approvalDate=").append(approvalDate);
    }
    if (usage != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("usage=").append(usage);
    }
    if (author != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("author=").append(author);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (outcome != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("outcome=").append(outcome);
    }
    if (topic != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("topic=").append(topic);
    }
    if (reviewer != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("reviewer=").append(reviewer);
    }
    if (shortTitle != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("shortTitle=").append(shortTitle);
    }
    if (version != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (jurisdiction != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (contact != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (purpose != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (effectivePeriod != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (text != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (identifier != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (date != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (subjectReference != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("subjectReference=").append(subjectReference);
    }
    if (lastReviewDate != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("lastReviewDate=").append(lastReviewDate);
    }
    if (copyright != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (relatedArtifact != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("relatedArtifact=").append(relatedArtifact);
    }
    if (useContext != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (publisher != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (exposure != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("exposure=").append(exposure);
    }
    if (editor != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("editor=").append(editor);
    }
    if (subtitle != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("subtitle=").append(subtitle);
    }
    if (language != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (title != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (contained != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("population=").append(population);
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (library != null) {
      builder.append(", ");
      builder.append("library=").append(library);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (subjectCodeableConcept != null) {
      builder.append(", ");
      builder.append("subjectCodeableConcept=").append(subjectCodeableConcept);
    }
    if (exposureAlternative != null) {
      builder.append(", ");
      builder.append("exposureAlternative=").append(exposureAlternative);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ResearchDefinition", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ResearchDefinition {
    @Nullable Optional<List<String>> comment = Optional.empty();
    boolean commentIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<ContactDetail>> endorser = Optional.empty();
    boolean endorserIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<Boolean> experimental = Optional.empty();
    boolean experimentalIsSet;
    @Nullable Optional<Date> approvalDate = Optional.empty();
    boolean approvalDateIsSet;
    @Nullable Optional<String> usage = Optional.empty();
    boolean usageIsSet;
    @Nullable Optional<List<ContactDetail>> author = Optional.empty();
    boolean authorIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Reference> outcome = Optional.empty();
    boolean outcomeIsSet;
    @Nullable Optional<List<CodeableConcept>> topic = Optional.empty();
    boolean topicIsSet;
    @Nullable Optional<List<ContactDetail>> reviewer = Optional.empty();
    boolean reviewerIsSet;
    @Nullable Optional<String> shortTitle = Optional.empty();
    boolean shortTitleIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<Markdown> purpose = Optional.empty();
    boolean purposeIsSet;
    @Nullable Optional<Period> effectivePeriod = Optional.empty();
    boolean effectivePeriodIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<Reference> subjectReference = Optional.empty();
    boolean subjectReferenceIsSet;
    @Nullable Optional<Date> lastReviewDate = Optional.empty();
    boolean lastReviewDateIsSet;
    @Nullable Optional<Markdown> copyright = Optional.empty();
    boolean copyrightIsSet;
    @Nullable Optional<List<RelatedArtifact>> relatedArtifact = Optional.empty();
    boolean relatedArtifactIsSet;
    @Nullable Optional<List<UsageContext>> useContext = Optional.empty();
    boolean useContextIsSet;
    @Nullable Optional<String> publisher = Optional.empty();
    boolean publisherIsSet;
    @Nullable Optional<Reference> exposure = Optional.empty();
    boolean exposureIsSet;
    @Nullable Optional<List<ContactDetail>> editor = Optional.empty();
    boolean editorIsSet;
    @Nullable Optional<String> subtitle = Optional.empty();
    boolean subtitleIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Reference population;
    @Nullable String resourceType;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<Canonical>> library = Optional.empty();
    boolean libraryIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<ResearchdefinitionStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<CodeableConcept> subjectCodeableConcept = Optional.empty();
    boolean subjectCodeableConceptIsSet;
    @Nullable Optional<Reference> exposureAlternative = Optional.empty();
    boolean exposureAlternativeIsSet;
    @JsonProperty("comment")
    public void setComment(Optional<List<String>> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("endorser")
    public void setEndorser(Optional<List<ContactDetail>> endorser) {
      this.endorser = endorser;
      this.endorserIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("experimental")
    public void setExperimental(Optional<Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @JsonProperty("approvalDate")
    public void setApprovalDate(Optional<Date> approvalDate) {
      this.approvalDate = approvalDate;
      this.approvalDateIsSet = true;
    }
    @JsonProperty("usage")
    public void setUsage(Optional<String> usage) {
      this.usage = usage;
      this.usageIsSet = true;
    }
    @JsonProperty("author")
    public void setAuthor(Optional<List<ContactDetail>> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("outcome")
    public void setOutcome(Optional<Reference> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @JsonProperty("topic")
    public void setTopic(Optional<List<CodeableConcept>> topic) {
      this.topic = topic;
      this.topicIsSet = true;
    }
    @JsonProperty("reviewer")
    public void setReviewer(Optional<List<ContactDetail>> reviewer) {
      this.reviewer = reviewer;
      this.reviewerIsSet = true;
    }
    @JsonProperty("shortTitle")
    public void setShortTitle(Optional<String> shortTitle) {
      this.shortTitle = shortTitle;
      this.shortTitleIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<List<CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("purpose")
    public void setPurpose(Optional<Markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @JsonProperty("effectivePeriod")
    public void setEffectivePeriod(Optional<Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("subjectReference")
    public void setSubjectReference(Optional<Reference> subjectReference) {
      this.subjectReference = subjectReference;
      this.subjectReferenceIsSet = true;
    }
    @JsonProperty("lastReviewDate")
    public void setLastReviewDate(Optional<Date> lastReviewDate) {
      this.lastReviewDate = lastReviewDate;
      this.lastReviewDateIsSet = true;
    }
    @JsonProperty("copyright")
    public void setCopyright(Optional<Markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @JsonProperty("relatedArtifact")
    public void setRelatedArtifact(Optional<List<RelatedArtifact>> relatedArtifact) {
      this.relatedArtifact = relatedArtifact;
      this.relatedArtifactIsSet = true;
    }
    @JsonProperty("useContext")
    public void setUseContext(Optional<List<UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @JsonProperty("publisher")
    public void setPublisher(Optional<String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @JsonProperty("exposure")
    public void setExposure(Optional<Reference> exposure) {
      this.exposure = exposure;
      this.exposureIsSet = true;
    }
    @JsonProperty("editor")
    public void setEditor(Optional<List<ContactDetail>> editor) {
      this.editor = editor;
      this.editorIsSet = true;
    }
    @JsonProperty("subtitle")
    public void setSubtitle(Optional<String> subtitle) {
      this.subtitle = subtitle;
      this.subtitleIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("population")
    public void setPopulation(Reference population) {
      this.population = population;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("library")
    public void setLibrary(Optional<List<Canonical>> library) {
      this.library = library;
      this.libraryIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<ResearchdefinitionStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("subjectCodeableConcept")
    public void setSubjectCodeableConcept(Optional<CodeableConcept> subjectCodeableConcept) {
      this.subjectCodeableConcept = subjectCodeableConcept;
      this.subjectCodeableConceptIsSet = true;
    }
    @JsonProperty("exposureAlternative")
    public void setExposureAlternative(Optional<Reference> exposureAlternative) {
      this.exposureAlternative = exposureAlternative;
      this.exposureAlternativeIsSet = true;
    }
    @Override
    public Optional<List<String>> comment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> endorser() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> approvalDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> usage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> author() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> topic() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> reviewer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> shortTitle() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subjectReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> lastReviewDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<RelatedArtifact>> relatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> exposure() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> editor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> subtitle() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Reference population() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> library() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ResearchdefinitionStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> subjectCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> exposureAlternative() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableResearchDefinition fromJson(Json json) {
    ImmutableResearchDefinition.Builder builder = ((ImmutableResearchDefinition.Builder) ImmutableResearchDefinition.builder());
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.endorserIsSet) {
      builder.endorser(json.endorser);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.approvalDateIsSet) {
      builder.approvalDate(json.approvalDate);
    }
    if (json.usageIsSet) {
      builder.usage(json.usage);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.topicIsSet) {
      builder.topic(json.topic);
    }
    if (json.reviewerIsSet) {
      builder.reviewer(json.reviewer);
    }
    if (json.shortTitleIsSet) {
      builder.shortTitle(json.shortTitle);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.subjectReferenceIsSet) {
      builder.subjectReference(json.subjectReference);
    }
    if (json.lastReviewDateIsSet) {
      builder.lastReviewDate(json.lastReviewDate);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.relatedArtifactIsSet) {
      builder.relatedArtifact(json.relatedArtifact);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.exposureIsSet) {
      builder.exposure(json.exposure);
    }
    if (json.editorIsSet) {
      builder.editor(json.editor);
    }
    if (json.subtitleIsSet) {
      builder.subtitle(json.subtitle);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.population != null) {
      builder.population(json.population);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.libraryIsSet) {
      builder.library(json.library);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.subjectCodeableConceptIsSet) {
      builder.subjectCodeableConcept(json.subjectCodeableConcept);
    }
    if (json.exposureAlternativeIsSet) {
      builder.exposureAlternative(json.exposureAlternative);
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
        .comment(instance.comment())
        .implicitRules(instance.implicitRules())
        .endorser(instance.endorser())
        .url(instance.url())
        .experimental(instance.experimental())
        .approvalDate(instance.approvalDate())
        .usage(instance.usage())
        .author(instance.author())
        .modifierExtension(instance.modifierExtension())
        .outcome(instance.outcome())
        .topic(instance.topic())
        .reviewer(instance.reviewer())
        .shortTitle(instance.shortTitle())
        .version(instance.version())
        .jurisdiction(instance.jurisdiction())
        .contact(instance.contact())
        .purpose(instance.purpose())
        .effectivePeriod(instance.effectivePeriod())
        .id(instance.id())
        .text(instance.text())
        .identifier(instance.identifier())
        .date(instance.date())
        .subjectReference(instance.subjectReference())
        .lastReviewDate(instance.lastReviewDate())
        .copyright(instance.copyright())
        .relatedArtifact(instance.relatedArtifact())
        .useContext(instance.useContext())
        .publisher(instance.publisher())
        .exposure(instance.exposure())
        .editor(instance.editor())
        .subtitle(instance.subtitle())
        .language(instance.language())
        .title(instance.title())
        .contained(instance.contained())
        .population(instance.population())
        .resourceType(instance.resourceType())
        .extension(instance.extension())
        .description(instance.description())
        .library(instance.library())
        .name(instance.name())
        .status(instance.status())
        .meta(instance.meta())
        .subjectCodeableConcept(instance.subjectCodeableConcept())
        .exposureAlternative(instance.exposureAlternative())
        .build();
  }

  /**
   * Creates a builder for {@link ResearchDefinition ResearchDefinition}.
   * <pre>
   * ImmutableResearchDefinition.builder()
   *    .comment(List&amp;lt;String&amp;gt;) // optional {@link ResearchDefinition#comment() comment}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link ResearchDefinition#implicitRules() implicitRules}
   *    .endorser(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link ResearchDefinition#endorser() endorser}
   *    .url(com.medplum.types.fhir.Uri) // optional {@link ResearchDefinition#url() url}
   *    .experimental(Boolean) // optional {@link ResearchDefinition#experimental() experimental}
   *    .approvalDate(com.medplum.types.fhir.Date) // optional {@link ResearchDefinition#approvalDate() approvalDate}
   *    .usage(String) // optional {@link ResearchDefinition#usage() usage}
   *    .author(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link ResearchDefinition#author() author}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ResearchDefinition#modifierExtension() modifierExtension}
   *    .outcome(com.medplum.types.fhir.Reference) // optional {@link ResearchDefinition#outcome() outcome}
   *    .topic(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ResearchDefinition#topic() topic}
   *    .reviewer(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link ResearchDefinition#reviewer() reviewer}
   *    .shortTitle(String) // optional {@link ResearchDefinition#shortTitle() shortTitle}
   *    .version(String) // optional {@link ResearchDefinition#version() version}
   *    .jurisdiction(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ResearchDefinition#jurisdiction() jurisdiction}
   *    .contact(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link ResearchDefinition#contact() contact}
   *    .purpose(com.medplum.types.fhir.Markdown) // optional {@link ResearchDefinition#purpose() purpose}
   *    .effectivePeriod(com.medplum.types.fhir.Period) // optional {@link ResearchDefinition#effectivePeriod() effectivePeriod}
   *    .id(com.medplum.types.fhir.Id) // optional {@link ResearchDefinition#id() id}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link ResearchDefinition#text() text}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link ResearchDefinition#identifier() identifier}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link ResearchDefinition#date() date}
   *    .subjectReference(com.medplum.types.fhir.Reference) // optional {@link ResearchDefinition#subjectReference() subjectReference}
   *    .lastReviewDate(com.medplum.types.fhir.Date) // optional {@link ResearchDefinition#lastReviewDate() lastReviewDate}
   *    .copyright(com.medplum.types.fhir.Markdown) // optional {@link ResearchDefinition#copyright() copyright}
   *    .relatedArtifact(List&amp;lt;com.medplum.types.fhir.RelatedArtifact&amp;gt;) // optional {@link ResearchDefinition#relatedArtifact() relatedArtifact}
   *    .useContext(List&amp;lt;com.medplum.types.fhir.UsageContext&amp;gt;) // optional {@link ResearchDefinition#useContext() useContext}
   *    .publisher(String) // optional {@link ResearchDefinition#publisher() publisher}
   *    .exposure(com.medplum.types.fhir.Reference) // optional {@link ResearchDefinition#exposure() exposure}
   *    .editor(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link ResearchDefinition#editor() editor}
   *    .subtitle(String) // optional {@link ResearchDefinition#subtitle() subtitle}
   *    .language(com.medplum.types.fhir.Code) // optional {@link ResearchDefinition#language() language}
   *    .title(String) // optional {@link ResearchDefinition#title() title}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link ResearchDefinition#contained() contained}
   *    .population(com.medplum.types.fhir.Reference) // required {@link ResearchDefinition#population() population}
   *    .resourceType(String) // required {@link ResearchDefinition#resourceType() resourceType}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ResearchDefinition#extension() extension}
   *    .description(com.medplum.types.fhir.Markdown) // optional {@link ResearchDefinition#description() description}
   *    .library(List&amp;lt;com.medplum.types.fhir.Canonical&amp;gt;) // optional {@link ResearchDefinition#library() library}
   *    .name(String) // optional {@link ResearchDefinition#name() name}
   *    .status(com.medplum.types.fhir.ResearchdefinitionStatus) // optional {@link ResearchDefinition#status() status}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link ResearchDefinition#meta() meta}
   *    .subjectCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link ResearchDefinition#subjectCodeableConcept() subjectCodeableConcept}
   *    .exposureAlternative(com.medplum.types.fhir.Reference) // optional {@link ResearchDefinition#exposureAlternative() exposureAlternative}
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
  @Generated(from = "ResearchDefinition", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements PopulationBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_POPULATION = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_COMMENT = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2L;
    private static final long OPT_BIT_ENDORSER = 0x4L;
    private static final long OPT_BIT_URL = 0x8L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x10L;
    private static final long OPT_BIT_APPROVAL_DATE = 0x20L;
    private static final long OPT_BIT_USAGE = 0x40L;
    private static final long OPT_BIT_AUTHOR = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_OUTCOME = 0x200L;
    private static final long OPT_BIT_TOPIC = 0x400L;
    private static final long OPT_BIT_REVIEWER = 0x800L;
    private static final long OPT_BIT_SHORT_TITLE = 0x1000L;
    private static final long OPT_BIT_VERSION = 0x2000L;
    private static final long OPT_BIT_JURISDICTION = 0x4000L;
    private static final long OPT_BIT_CONTACT = 0x8000L;
    private static final long OPT_BIT_PURPOSE = 0x10000L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x20000L;
    private static final long OPT_BIT_ID = 0x40000L;
    private static final long OPT_BIT_TEXT = 0x80000L;
    private static final long OPT_BIT_IDENTIFIER = 0x100000L;
    private static final long OPT_BIT_DATE = 0x200000L;
    private static final long OPT_BIT_SUBJECT_REFERENCE = 0x400000L;
    private static final long OPT_BIT_LAST_REVIEW_DATE = 0x800000L;
    private static final long OPT_BIT_COPYRIGHT = 0x1000000L;
    private static final long OPT_BIT_RELATED_ARTIFACT = 0x2000000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x4000000L;
    private static final long OPT_BIT_PUBLISHER = 0x8000000L;
    private static final long OPT_BIT_EXPOSURE = 0x10000000L;
    private static final long OPT_BIT_EDITOR = 0x20000000L;
    private static final long OPT_BIT_SUBTITLE = 0x40000000L;
    private static final long OPT_BIT_LANGUAGE = 0x80000000L;
    private static final long OPT_BIT_TITLE = 0x100000000L;
    private static final long OPT_BIT_CONTAINED = 0x200000000L;
    private static final long OPT_BIT_EXTENSION = 0x400000000L;
    private static final long OPT_BIT_DESCRIPTION = 0x800000000L;
    private static final long OPT_BIT_LIBRARY = 0x1000000000L;
    private static final long OPT_BIT_NAME = 0x2000000000L;
    private static final long OPT_BIT_STATUS = 0x4000000000L;
    private static final long OPT_BIT_META = 0x8000000000L;
    private static final long OPT_BIT_SUBJECT_CODEABLE_CONCEPT = 0x10000000000L;
    private static final long OPT_BIT_EXPOSURE_ALTERNATIVE = 0x20000000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<String> comment;
    private @Nullable Uri implicitRules;
    private @Nullable List<ContactDetail> endorser;
    private @Nullable Uri url;
    private @Nullable Boolean experimental;
    private @Nullable Date approvalDate;
    private @Nullable String usage;
    private @Nullable List<ContactDetail> author;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference outcome;
    private @Nullable List<CodeableConcept> topic;
    private @Nullable List<ContactDetail> reviewer;
    private @Nullable String shortTitle;
    private @Nullable String version;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable List<ContactDetail> contact;
    private @Nullable Markdown purpose;
    private @Nullable Period effectivePeriod;
    private @Nullable Id id;
    private @Nullable Narrative text;
    private @Nullable List<Identifier> identifier;
    private @Nullable DateTime date;
    private @Nullable Reference subjectReference;
    private @Nullable Date lastReviewDate;
    private @Nullable Markdown copyright;
    private @Nullable List<RelatedArtifact> relatedArtifact;
    private @Nullable List<UsageContext> useContext;
    private @Nullable String publisher;
    private @Nullable Reference exposure;
    private @Nullable List<ContactDetail> editor;
    private @Nullable String subtitle;
    private @Nullable Code language;
    private @Nullable String title;
    private @Nullable List<ResourceList> contained;
    private @Nullable Reference population;
    private @Nullable String resourceType;
    private @Nullable List<Extension> extension;
    private @Nullable Markdown description;
    private @Nullable List<Canonical> library;
    private @Nullable String name;
    private @Nullable ResearchdefinitionStatus status;
    private @Nullable Meta meta;
    private @Nullable CodeableConcept subjectCodeableConcept;
    private @Nullable Reference exposureAlternative;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    public final Builder comment(List<String> comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = Objects.requireNonNull(comment, "comment");
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("comment")
    public final Builder comment(Optional<? extends List<String>> comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = comment.orElse(null);
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ResearchDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ResearchDefinition#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link ResearchDefinition#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link ResearchDefinition#url() url} to url.
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
     * Initializes the optional value {@link ResearchDefinition#url() url} to url.
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
    @JsonProperty("experimental")
    public final Builder experimental(Optional<Boolean> experimental) {
      checkNotIsSet(experimentalIsSet(), "experimental");
      this.experimental = experimental.orElse(null);
      optBits |= OPT_BIT_EXPERIMENTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link ResearchDefinition#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link ResearchDefinition#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for chained invocation
     */
    public final Builder usage(String usage) {
      checkNotIsSet(usageIsSet(), "usage");
      this.usage = Objects.requireNonNull(usage, "usage");
      optBits |= OPT_BIT_USAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("usage")
    public final Builder usage(Optional<String> usage) {
      checkNotIsSet(usageIsSet(), "usage");
      this.usage = usage.orElse(null);
      optBits |= OPT_BIT_USAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#author() author} to author.
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
     * Initializes the optional value {@link ResearchDefinition#author() author} to author.
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
     * Initializes the optional value {@link ResearchDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ResearchDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ResearchDefinition#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcome(Reference outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = Objects.requireNonNull(outcome, "outcome");
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outcome")
    public final Builder outcome(Optional<? extends Reference> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = outcome.orElse(null);
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#topic() topic} to topic.
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
     * Initializes the optional value {@link ResearchDefinition#topic() topic} to topic.
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
     * Initializes the optional value {@link ResearchDefinition#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link ResearchDefinition#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link ResearchDefinition#shortTitle() shortTitle} to shortTitle.
     * @param shortTitle The value for shortTitle
     * @return {@code this} builder for chained invocation
     */
    public final Builder shortTitle(String shortTitle) {
      checkNotIsSet(shortTitleIsSet(), "shortTitle");
      this.shortTitle = Objects.requireNonNull(shortTitle, "shortTitle");
      optBits |= OPT_BIT_SHORT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#shortTitle() shortTitle} to shortTitle.
     * @param shortTitle The value for shortTitle
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("shortTitle")
    public final Builder shortTitle(Optional<String> shortTitle) {
      checkNotIsSet(shortTitleIsSet(), "shortTitle");
      this.shortTitle = shortTitle.orElse(null);
      optBits |= OPT_BIT_SHORT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#version() version} to version.
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
     * Initializes the optional value {@link ResearchDefinition#version() version} to version.
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
     * Initializes the optional value {@link ResearchDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ResearchDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ResearchDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link ResearchDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link ResearchDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    public final Builder purpose(Markdown purpose) {
      checkNotIsSet(purposeIsSet(), "purpose");
      this.purpose = Objects.requireNonNull(purpose, "purpose");
      optBits |= OPT_BIT_PURPOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("purpose")
    public final Builder purpose(Optional<? extends Markdown> purpose) {
      checkNotIsSet(purposeIsSet(), "purpose");
      this.purpose = purpose.orElse(null);
      optBits |= OPT_BIT_PURPOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link ResearchDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link ResearchDefinition#id() id} to id.
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
     * Initializes the optional value {@link ResearchDefinition#id() id} to id.
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
     * Initializes the optional value {@link ResearchDefinition#text() text} to text.
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
     * Initializes the optional value {@link ResearchDefinition#text() text} to text.
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
     * Initializes the optional value {@link ResearchDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ResearchDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ResearchDefinition#date() date} to date.
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
     * Initializes the optional value {@link ResearchDefinition#date() date} to date.
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
     * Initializes the optional value {@link ResearchDefinition#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder subjectReference(Reference subjectReference) {
      checkNotIsSet(subjectReferenceIsSet(), "subjectReference");
      this.subjectReference = Objects.requireNonNull(subjectReference, "subjectReference");
      optBits |= OPT_BIT_SUBJECT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subjectReference")
    public final Builder subjectReference(Optional<? extends Reference> subjectReference) {
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
    public final Builder lastReviewDate(Date lastReviewDate) {
      checkNotIsSet(lastReviewDateIsSet(), "lastReviewDate");
      this.lastReviewDate = Objects.requireNonNull(lastReviewDate, "lastReviewDate");
      optBits |= OPT_BIT_LAST_REVIEW_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link ResearchDefinition#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link ResearchDefinition#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link ResearchDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link ResearchDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link ResearchDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link ResearchDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link ResearchDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ResearchDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ResearchDefinition#exposure() exposure} to exposure.
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
     * Initializes the optional value {@link ResearchDefinition#exposure() exposure} to exposure.
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
     * Initializes the optional value {@link ResearchDefinition#editor() editor} to editor.
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
     * Initializes the optional value {@link ResearchDefinition#editor() editor} to editor.
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
     * Initializes the optional value {@link ResearchDefinition#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link ResearchDefinition#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link ResearchDefinition#language() language} to language.
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
     * Initializes the optional value {@link ResearchDefinition#language() language} to language.
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
     * Initializes the optional value {@link ResearchDefinition#title() title} to title.
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
     * Initializes the optional value {@link ResearchDefinition#title() title} to title.
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
     * Initializes the optional value {@link ResearchDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link ResearchDefinition#contained() contained} to contained.
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
     * Initializes the value for the {@link ResearchDefinition#population() population} attribute.
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
     * Initializes the value for the {@link ResearchDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ResearchDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link ResearchDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link ResearchDefinition#description() description} to description.
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
     * Initializes the optional value {@link ResearchDefinition#description() description} to description.
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
     * Initializes the optional value {@link ResearchDefinition#library() library} to library.
     * @param library The value for library
     * @return {@code this} builder for chained invocation
     */
    public final Builder library(List<Canonical> library) {
      checkNotIsSet(libraryIsSet(), "library");
      this.library = Objects.requireNonNull(library, "library");
      optBits |= OPT_BIT_LIBRARY;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#library() library} to library.
     * @param library The value for library
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("library")
    public final Builder library(Optional<? extends List<Canonical>> library) {
      checkNotIsSet(libraryIsSet(), "library");
      this.library = library.orElse(null);
      optBits |= OPT_BIT_LIBRARY;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#name() name} to name.
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
     * Initializes the optional value {@link ResearchDefinition#name() name} to name.
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
     * Initializes the optional value {@link ResearchDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(ResearchdefinitionStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends ResearchdefinitionStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link ResearchDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link ResearchDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder subjectCodeableConcept(CodeableConcept subjectCodeableConcept) {
      checkNotIsSet(subjectCodeableConceptIsSet(), "subjectCodeableConcept");
      this.subjectCodeableConcept = Objects.requireNonNull(subjectCodeableConcept, "subjectCodeableConcept");
      optBits |= OPT_BIT_SUBJECT_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subjectCodeableConcept")
    public final Builder subjectCodeableConcept(Optional<? extends CodeableConcept> subjectCodeableConcept) {
      checkNotIsSet(subjectCodeableConceptIsSet(), "subjectCodeableConcept");
      this.subjectCodeableConcept = subjectCodeableConcept.orElse(null);
      optBits |= OPT_BIT_SUBJECT_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#exposureAlternative() exposureAlternative} to exposureAlternative.
     * @param exposureAlternative The value for exposureAlternative
     * @return {@code this} builder for chained invocation
     */
    public final Builder exposureAlternative(Reference exposureAlternative) {
      checkNotIsSet(exposureAlternativeIsSet(), "exposureAlternative");
      this.exposureAlternative = Objects.requireNonNull(exposureAlternative, "exposureAlternative");
      optBits |= OPT_BIT_EXPOSURE_ALTERNATIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchDefinition#exposureAlternative() exposureAlternative} to exposureAlternative.
     * @param exposureAlternative The value for exposureAlternative
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("exposureAlternative")
    public final Builder exposureAlternative(Optional<? extends Reference> exposureAlternative) {
      checkNotIsSet(exposureAlternativeIsSet(), "exposureAlternative");
      this.exposureAlternative = exposureAlternative.orElse(null);
      optBits |= OPT_BIT_EXPOSURE_ALTERNATIVE;
      return this;
    }

    /**
     * Builds a new {@link ResearchDefinition ResearchDefinition}.
     * @return An immutable instance of ResearchDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ResearchDefinition build() {
      checkRequiredAttributes();
      return new ImmutableResearchDefinition(
          comment,
          implicitRules,
          endorser,
          url,
          experimental,
          approvalDate,
          usage,
          author,
          modifierExtension,
          outcome,
          topic,
          reviewer,
          shortTitle,
          version,
          jurisdiction,
          contact,
          purpose,
          effectivePeriod,
          id,
          text,
          identifier,
          date,
          subjectReference,
          lastReviewDate,
          copyright,
          relatedArtifact,
          useContext,
          publisher,
          exposure,
          editor,
          subtitle,
          language,
          title,
          contained,
          population,
          resourceType,
          extension,
          description,
          library,
          name,
          status,
          meta,
          subjectCodeableConcept,
          exposureAlternative);
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean endorserIsSet() {
      return (optBits & OPT_BIT_ENDORSER) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean approvalDateIsSet() {
      return (optBits & OPT_BIT_APPROVAL_DATE) != 0;
    }

    private boolean usageIsSet() {
      return (optBits & OPT_BIT_USAGE) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean topicIsSet() {
      return (optBits & OPT_BIT_TOPIC) != 0;
    }

    private boolean reviewerIsSet() {
      return (optBits & OPT_BIT_REVIEWER) != 0;
    }

    private boolean shortTitleIsSet() {
      return (optBits & OPT_BIT_SHORT_TITLE) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean subjectReferenceIsSet() {
      return (optBits & OPT_BIT_SUBJECT_REFERENCE) != 0;
    }

    private boolean lastReviewDateIsSet() {
      return (optBits & OPT_BIT_LAST_REVIEW_DATE) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean relatedArtifactIsSet() {
      return (optBits & OPT_BIT_RELATED_ARTIFACT) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean exposureIsSet() {
      return (optBits & OPT_BIT_EXPOSURE) != 0;
    }

    private boolean editorIsSet() {
      return (optBits & OPT_BIT_EDITOR) != 0;
    }

    private boolean subtitleIsSet() {
      return (optBits & OPT_BIT_SUBTITLE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean libraryIsSet() {
      return (optBits & OPT_BIT_LIBRARY) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean subjectCodeableConceptIsSet() {
      return (optBits & OPT_BIT_SUBJECT_CODEABLE_CONCEPT) != 0;
    }

    private boolean exposureAlternativeIsSet() {
      return (optBits & OPT_BIT_EXPOSURE_ALTERNATIVE) != 0;
    }

    private boolean populationIsSet() {
      return (initBits & INIT_BIT_POPULATION) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ResearchDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!populationIsSet()) attributes.add("population");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build ResearchDefinition, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ResearchDefinition", generator = "Immutables")
  public interface PopulationBuildStage {
    /**
     * Initializes the value for the {@link ResearchDefinition#population() population} attribute.
     * @param population The value for population 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage population(Reference population);
  }

  @Generated(from = "ResearchDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ResearchDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "ResearchDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ResearchDefinition#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comment(List<String> comment);

    /**
     * Initializes the optional value {@link ResearchDefinition#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comment(Optional<? extends List<String>> comment);

    /**
     * Initializes the optional value {@link ResearchDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link ResearchDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link ResearchDefinition#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endorser(List<ContactDetail> endorser);

    /**
     * Initializes the optional value {@link ResearchDefinition#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endorser(Optional<? extends List<ContactDetail>> endorser);

    /**
     * Initializes the optional value {@link ResearchDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link ResearchDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

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
    BuildFinal experimental(Optional<Boolean> experimental);

    /**
     * Initializes the optional value {@link ResearchDefinition#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal approvalDate(Date approvalDate);

    /**
     * Initializes the optional value {@link ResearchDefinition#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal approvalDate(Optional<? extends Date> approvalDate);

    /**
     * Initializes the optional value {@link ResearchDefinition#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal usage(String usage);

    /**
     * Initializes the optional value {@link ResearchDefinition#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal usage(Optional<String> usage);

    /**
     * Initializes the optional value {@link ResearchDefinition#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(List<ContactDetail> author);

    /**
     * Initializes the optional value {@link ResearchDefinition#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(Optional<? extends List<ContactDetail>> author);

    /**
     * Initializes the optional value {@link ResearchDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ResearchDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ResearchDefinition#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcome(Reference outcome);

    /**
     * Initializes the optional value {@link ResearchDefinition#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcome(Optional<? extends Reference> outcome);

    /**
     * Initializes the optional value {@link ResearchDefinition#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topic(List<CodeableConcept> topic);

    /**
     * Initializes the optional value {@link ResearchDefinition#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topic(Optional<? extends List<CodeableConcept>> topic);

    /**
     * Initializes the optional value {@link ResearchDefinition#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reviewer(List<ContactDetail> reviewer);

    /**
     * Initializes the optional value {@link ResearchDefinition#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reviewer(Optional<? extends List<ContactDetail>> reviewer);

    /**
     * Initializes the optional value {@link ResearchDefinition#shortTitle() shortTitle} to shortTitle.
     * @param shortTitle The value for shortTitle
     * @return {@code this} builder for chained invocation
     */
    BuildFinal shortTitle(String shortTitle);

    /**
     * Initializes the optional value {@link ResearchDefinition#shortTitle() shortTitle} to shortTitle.
     * @param shortTitle The value for shortTitle
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal shortTitle(Optional<String> shortTitle);

    /**
     * Initializes the optional value {@link ResearchDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link ResearchDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link ResearchDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(List<CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link ResearchDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link ResearchDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link ResearchDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Initializes the optional value {@link ResearchDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(Markdown purpose);

    /**
     * Initializes the optional value {@link ResearchDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(Optional<? extends Markdown> purpose);

    /**
     * Initializes the optional value {@link ResearchDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(Period effectivePeriod);

    /**
     * Initializes the optional value {@link ResearchDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(Optional<? extends Period> effectivePeriod);

    /**
     * Initializes the optional value {@link ResearchDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link ResearchDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link ResearchDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link ResearchDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link ResearchDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link ResearchDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link ResearchDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link ResearchDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link ResearchDefinition#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subjectReference(Reference subjectReference);

    /**
     * Initializes the optional value {@link ResearchDefinition#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subjectReference(Optional<? extends Reference> subjectReference);

    /**
     * Initializes the optional value {@link ResearchDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastReviewDate(Date lastReviewDate);

    /**
     * Initializes the optional value {@link ResearchDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastReviewDate(Optional<? extends Date> lastReviewDate);

    /**
     * Initializes the optional value {@link ResearchDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(Markdown copyright);

    /**
     * Initializes the optional value {@link ResearchDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(Optional<? extends Markdown> copyright);

    /**
     * Initializes the optional value {@link ResearchDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatedArtifact(List<RelatedArtifact> relatedArtifact);

    /**
     * Initializes the optional value {@link ResearchDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatedArtifact(Optional<? extends List<RelatedArtifact>> relatedArtifact);

    /**
     * Initializes the optional value {@link ResearchDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(List<UsageContext> useContext);

    /**
     * Initializes the optional value {@link ResearchDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(Optional<? extends List<UsageContext>> useContext);

    /**
     * Initializes the optional value {@link ResearchDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(String publisher);

    /**
     * Initializes the optional value {@link ResearchDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<String> publisher);

    /**
     * Initializes the optional value {@link ResearchDefinition#exposure() exposure} to exposure.
     * @param exposure The value for exposure
     * @return {@code this} builder for chained invocation
     */
    BuildFinal exposure(Reference exposure);

    /**
     * Initializes the optional value {@link ResearchDefinition#exposure() exposure} to exposure.
     * @param exposure The value for exposure
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal exposure(Optional<? extends Reference> exposure);

    /**
     * Initializes the optional value {@link ResearchDefinition#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal editor(List<ContactDetail> editor);

    /**
     * Initializes the optional value {@link ResearchDefinition#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal editor(Optional<? extends List<ContactDetail>> editor);

    /**
     * Initializes the optional value {@link ResearchDefinition#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subtitle(String subtitle);

    /**
     * Initializes the optional value {@link ResearchDefinition#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subtitle(Optional<String> subtitle);

    /**
     * Initializes the optional value {@link ResearchDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link ResearchDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link ResearchDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link ResearchDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Initializes the optional value {@link ResearchDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link ResearchDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link ResearchDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ResearchDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ResearchDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(Markdown description);

    /**
     * Initializes the optional value {@link ResearchDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<? extends Markdown> description);

    /**
     * Initializes the optional value {@link ResearchDefinition#library() library} to library.
     * @param library The value for library
     * @return {@code this} builder for chained invocation
     */
    BuildFinal library(List<Canonical> library);

    /**
     * Initializes the optional value {@link ResearchDefinition#library() library} to library.
     * @param library The value for library
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal library(Optional<? extends List<Canonical>> library);

    /**
     * Initializes the optional value {@link ResearchDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link ResearchDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link ResearchDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(ResearchdefinitionStatus status);

    /**
     * Initializes the optional value {@link ResearchDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends ResearchdefinitionStatus> status);

    /**
     * Initializes the optional value {@link ResearchDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link ResearchDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link ResearchDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subjectCodeableConcept(CodeableConcept subjectCodeableConcept);

    /**
     * Initializes the optional value {@link ResearchDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subjectCodeableConcept(Optional<? extends CodeableConcept> subjectCodeableConcept);

    /**
     * Initializes the optional value {@link ResearchDefinition#exposureAlternative() exposureAlternative} to exposureAlternative.
     * @param exposureAlternative The value for exposureAlternative
     * @return {@code this} builder for chained invocation
     */
    BuildFinal exposureAlternative(Reference exposureAlternative);

    /**
     * Initializes the optional value {@link ResearchDefinition#exposureAlternative() exposureAlternative} to exposureAlternative.
     * @param exposureAlternative The value for exposureAlternative
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal exposureAlternative(Optional<? extends Reference> exposureAlternative);

    /**
     * Builds a new {@link ResearchDefinition ResearchDefinition}.
     * @return An immutable instance of ResearchDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ResearchDefinition build();
  }
}
