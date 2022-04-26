package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ResearchElementDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableResearchElementDefinition.builder()}.
 */
@Generated(from = "ResearchElementDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableResearchElementDefinition
    implements ResearchElementDefinition {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<CodeableConcept> topic;
  private final @Nullable List<Canonical> library;
  private final @Nullable String version;
  private final @Nullable Meta meta;
  private final @Nullable DateTime date;
  private final @Nullable String title;
  private final @Nullable List<ContactDetail> reviewer;
  private final @Nullable Narrative text;
  private final @Nullable Code language;
  private final @Nullable Markdown purpose;
  private final @Nullable String shortTitle;
  private final @Nullable Date approvalDate;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Id id;
  private final @Nullable List<ContactDetail> endorser;
  private final @Nullable List<ContactDetail> editor;
  private final @Nullable Uri implicitRules;
  private final @Nullable String name;
  private final List<ResearchElementDefinition_Characteristic> characteristic;
  private final @Nullable List<RelatedArtifact> relatedArtifact;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable ResearchelementdefinitionStatus status;
  private final String resourceType;
  private final @Nullable List<ContactDetail> contact;
  private final @Nullable Markdown copyright;
  private final @Nullable List<String> comment;
  private final @Nullable Uri url;
  private final @Nullable String publisher;
  private final @Nullable ResearchelementdefinitionVariabletype variableType;
  private final @Nullable String usage;
  private final @Nullable List<UsageContext> useContext;
  private final @Nullable Period effectivePeriod;
  private final @Nullable List<ContactDetail> author;
  private final @Nullable CodeableConcept subjectCodeableConcept;
  private final @Nullable Date lastReviewDate;
  private final @Nullable ResearchelementdefinitionType type;
  private final @Nullable String subtitle;
  private final @Nullable Markdown description;
  private final @Nullable Reference subjectReference;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final @Nullable List<Extension> extension;
  private final @Nullable Boolean experimental;

  private ImmutableResearchElementDefinition(
      @Nullable List<Extension> modifierExtension,
      @Nullable List<CodeableConcept> topic,
      @Nullable List<Canonical> library,
      @Nullable String version,
      @Nullable Meta meta,
      @Nullable DateTime date,
      @Nullable String title,
      @Nullable List<ContactDetail> reviewer,
      @Nullable Narrative text,
      @Nullable Code language,
      @Nullable Markdown purpose,
      @Nullable String shortTitle,
      @Nullable Date approvalDate,
      @Nullable List<Identifier> identifier,
      @Nullable Id id,
      @Nullable List<ContactDetail> endorser,
      @Nullable List<ContactDetail> editor,
      @Nullable Uri implicitRules,
      @Nullable String name,
      List<ResearchElementDefinition_Characteristic> characteristic,
      @Nullable List<RelatedArtifact> relatedArtifact,
      @Nullable List<ResourceList> contained,
      @Nullable ResearchelementdefinitionStatus status,
      String resourceType,
      @Nullable List<ContactDetail> contact,
      @Nullable Markdown copyright,
      @Nullable List<String> comment,
      @Nullable Uri url,
      @Nullable String publisher,
      @Nullable ResearchelementdefinitionVariabletype variableType,
      @Nullable String usage,
      @Nullable List<UsageContext> useContext,
      @Nullable Period effectivePeriod,
      @Nullable List<ContactDetail> author,
      @Nullable CodeableConcept subjectCodeableConcept,
      @Nullable Date lastReviewDate,
      @Nullable ResearchelementdefinitionType type,
      @Nullable String subtitle,
      @Nullable Markdown description,
      @Nullable Reference subjectReference,
      @Nullable List<CodeableConcept> jurisdiction,
      @Nullable List<Extension> extension,
      @Nullable Boolean experimental) {
    this.modifierExtension = modifierExtension;
    this.topic = topic;
    this.library = library;
    this.version = version;
    this.meta = meta;
    this.date = date;
    this.title = title;
    this.reviewer = reviewer;
    this.text = text;
    this.language = language;
    this.purpose = purpose;
    this.shortTitle = shortTitle;
    this.approvalDate = approvalDate;
    this.identifier = identifier;
    this.id = id;
    this.endorser = endorser;
    this.editor = editor;
    this.implicitRules = implicitRules;
    this.name = name;
    this.characteristic = characteristic;
    this.relatedArtifact = relatedArtifact;
    this.contained = contained;
    this.status = status;
    this.resourceType = resourceType;
    this.contact = contact;
    this.copyright = copyright;
    this.comment = comment;
    this.url = url;
    this.publisher = publisher;
    this.variableType = variableType;
    this.usage = usage;
    this.useContext = useContext;
    this.effectivePeriod = effectivePeriod;
    this.author = author;
    this.subjectCodeableConcept = subjectCodeableConcept;
    this.lastReviewDate = lastReviewDate;
    this.type = type;
    this.subtitle = subtitle;
    this.description = description;
    this.subjectReference = subjectReference;
    this.jurisdiction = jurisdiction;
    this.extension = extension;
    this.experimental = experimental;
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
   * @return The value of the {@code topic} attribute
   */
  @JsonProperty("topic")
  @Override
  public Optional<List<CodeableConcept>> topic() {
    return Optional.ofNullable(topic);
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
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public Optional<String> version() {
    return Optional.ofNullable(version);
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
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
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
   * @return The value of the {@code reviewer} attribute
   */
  @JsonProperty("reviewer")
  @Override
  public Optional<List<ContactDetail>> reviewer() {
    return Optional.ofNullable(reviewer);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * @return The value of the {@code shortTitle} attribute
   */
  @JsonProperty("shortTitle")
  @Override
  public Optional<String> shortTitle() {
    return Optional.ofNullable(shortTitle);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code endorser} attribute
   */
  @JsonProperty("endorser")
  @Override
  public Optional<List<ContactDetail>> endorser() {
    return Optional.ofNullable(endorser);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code characteristic} attribute
   */
  @JsonProperty("characteristic")
  @Override
  public List<ResearchElementDefinition_Characteristic> characteristic() {
    return characteristic;
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<ResearchelementdefinitionStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code contact} attribute
   */
  @JsonProperty("contact")
  @Override
  public Optional<List<ContactDetail>> contact() {
    return Optional.ofNullable(contact);
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
   * @return The value of the {@code comment} attribute
   */
  @JsonProperty("comment")
  @Override
  public Optional<List<String>> comment() {
    return Optional.ofNullable(comment);
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
   * @return The value of the {@code publisher} attribute
   */
  @JsonProperty("publisher")
  @Override
  public Optional<String> publisher() {
    return Optional.ofNullable(publisher);
  }

  /**
   * @return The value of the {@code variableType} attribute
   */
  @JsonProperty("variableType")
  @Override
  public Optional<ResearchelementdefinitionVariabletype> variableType() {
    return Optional.ofNullable(variableType);
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
   * @return The value of the {@code useContext} attribute
   */
  @JsonProperty("useContext")
  @Override
  public Optional<List<UsageContext>> useContext() {
    return Optional.ofNullable(useContext);
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
   * @return The value of the {@code author} attribute
   */
  @JsonProperty("author")
  @Override
  public Optional<List<ContactDetail>> author() {
    return Optional.ofNullable(author);
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
   * @return The value of the {@code lastReviewDate} attribute
   */
  @JsonProperty("lastReviewDate")
  @Override
  public Optional<Date> lastReviewDate() {
    return Optional.ofNullable(lastReviewDate);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<ResearchelementdefinitionType> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<Markdown> description() {
    return Optional.ofNullable(description);
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @JsonProperty("jurisdiction")
  @Override
  public Optional<List<CodeableConcept>> jurisdiction() {
    return Optional.ofNullable(jurisdiction);
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
   * @return The value of the {@code experimental} attribute
   */
  @JsonProperty("experimental")
  @Override
  public Optional<Boolean> experimental() {
    return Optional.ofNullable(experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableResearchElementDefinition(
        newValue,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableResearchElementDefinition(
        value,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#topic() topic} attribute.
   * @param value The value for topic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withTopic(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "topic");
    if (this.topic == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        newValue,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#topic() topic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withTopic(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.topic == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        value,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#library() library} attribute.
   * @param value The value for library
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withLibrary(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "library");
    if (this.library == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        newValue,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#library() library} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for library
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withLibrary(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.library == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        value,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        newValue,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        value,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        newValue,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        value,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        newValue,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        value,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        newValue,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        value,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#reviewer() reviewer} attribute.
   * @param value The value for reviewer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withReviewer(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "reviewer");
    if (this.reviewer == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        newValue,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#reviewer() reviewer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reviewer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withReviewer(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.reviewer == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        value,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        newValue,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        value,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        newValue,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        value,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withPurpose(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        newValue,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withPurpose(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        value,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#shortTitle() shortTitle} attribute.
   * @param value The value for shortTitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withShortTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "shortTitle");
    if (Objects.equals(this.shortTitle, newValue)) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        newValue,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#shortTitle() shortTitle} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for shortTitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withShortTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.shortTitle, value)) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        value,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#approvalDate() approvalDate} attribute.
   * @param value The value for approvalDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withApprovalDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "approvalDate");
    if (this.approvalDate == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        newValue,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#approvalDate() approvalDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for approvalDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withApprovalDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.approvalDate == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        value,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        newValue,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        value,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        newValue,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        value,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#endorser() endorser} attribute.
   * @param value The value for endorser
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withEndorser(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "endorser");
    if (this.endorser == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        newValue,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#endorser() endorser} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endorser
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withEndorser(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.endorser == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        value,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#editor() editor} attribute.
   * @param value The value for editor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withEditor(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "editor");
    if (this.editor == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        newValue,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#editor() editor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for editor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withEditor(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.editor == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        value,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        newValue,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        value,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        newValue,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        value,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ResearchElementDefinition#characteristic() characteristic}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withCharacteristic(ResearchElementDefinition_Characteristic... elements) {
    List<ResearchElementDefinition_Characteristic> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        newValue,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ResearchElementDefinition#characteristic() characteristic}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of characteristic elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withCharacteristic(Iterable<? extends ResearchElementDefinition_Characteristic> elements) {
    if (this.characteristic == elements) return this;
    List<ResearchElementDefinition_Characteristic> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        newValue,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#relatedArtifact() relatedArtifact} attribute.
   * @param value The value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withRelatedArtifact(List<RelatedArtifact> value) {
    @Nullable List<RelatedArtifact> newValue = Objects.requireNonNull(value, "relatedArtifact");
    if (this.relatedArtifact == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        newValue,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#relatedArtifact() relatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withRelatedArtifact(Optional<? extends List<RelatedArtifact>> optional) {
    @Nullable List<RelatedArtifact> value = optional.orElse(null);
    if (this.relatedArtifact == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        value,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        newValue,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        value,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withStatus(ResearchelementdefinitionStatus value) {
    @Nullable ResearchelementdefinitionStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        newValue,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withStatus(Optional<? extends ResearchelementdefinitionStatus> optional) {
    @Nullable ResearchelementdefinitionStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        value,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ResearchElementDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableResearchElementDefinition withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        newValue,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        newValue,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        value,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withCopyright(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        newValue,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withCopyright(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        value,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withComment(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "comment");
    if (this.comment == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        newValue,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#comment() comment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withComment(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.comment == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        value,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        newValue,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        value,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withPublisher(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "publisher");
    if (Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        newValue,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withPublisher(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.publisher, value)) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        value,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#variableType() variableType} attribute.
   * @param value The value for variableType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withVariableType(ResearchelementdefinitionVariabletype value) {
    @Nullable ResearchelementdefinitionVariabletype newValue = Objects.requireNonNull(value, "variableType");
    if (this.variableType == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        newValue,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#variableType() variableType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for variableType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withVariableType(Optional<? extends ResearchelementdefinitionVariabletype> optional) {
    @Nullable ResearchelementdefinitionVariabletype value = optional.orElse(null);
    if (this.variableType == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        value,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#usage() usage} attribute.
   * @param value The value for usage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withUsage(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "usage");
    if (Objects.equals(this.usage, newValue)) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        newValue,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#usage() usage} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withUsage(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.usage, value)) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        value,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withUseContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        newValue,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withUseContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        value,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withEffectivePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        newValue,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withEffectivePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        value,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withAuthor(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        newValue,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withAuthor(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        value,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * @param value The value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withSubjectCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "subjectCodeableConcept");
    if (this.subjectCodeableConcept == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        newValue,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withSubjectCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.subjectCodeableConcept == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        value,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#lastReviewDate() lastReviewDate} attribute.
   * @param value The value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withLastReviewDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "lastReviewDate");
    if (this.lastReviewDate == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        newValue,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#lastReviewDate() lastReviewDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withLastReviewDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.lastReviewDate == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        value,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withType(ResearchelementdefinitionType value) {
    @Nullable ResearchelementdefinitionType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        newValue,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withType(Optional<? extends ResearchelementdefinitionType> optional) {
    @Nullable ResearchelementdefinitionType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        value,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#subtitle() subtitle} attribute.
   * @param value The value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withSubtitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "subtitle");
    if (Objects.equals(this.subtitle, newValue)) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        newValue,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#subtitle() subtitle} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withSubtitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.subtitle, value)) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        value,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        newValue,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        value,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#subjectReference() subjectReference} attribute.
   * @param value The value for subjectReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withSubjectReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subjectReference");
    if (this.subjectReference == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        newValue,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#subjectReference() subjectReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withSubjectReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subjectReference == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        value,
        this.jurisdiction,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        newValue,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        value,
        this.extension,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        newValue,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchElementDefinition withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        value,
        this.experimental);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchElementDefinition#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withExperimental(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchElementDefinition#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchElementDefinition withExperimental(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.experimental, value)) return this;
    return new ImmutableResearchElementDefinition(
        this.modifierExtension,
        this.topic,
        this.library,
        this.version,
        this.meta,
        this.date,
        this.title,
        this.reviewer,
        this.text,
        this.language,
        this.purpose,
        this.shortTitle,
        this.approvalDate,
        this.identifier,
        this.id,
        this.endorser,
        this.editor,
        this.implicitRules,
        this.name,
        this.characteristic,
        this.relatedArtifact,
        this.contained,
        this.status,
        this.resourceType,
        this.contact,
        this.copyright,
        this.comment,
        this.url,
        this.publisher,
        this.variableType,
        this.usage,
        this.useContext,
        this.effectivePeriod,
        this.author,
        this.subjectCodeableConcept,
        this.lastReviewDate,
        this.type,
        this.subtitle,
        this.description,
        this.subjectReference,
        this.jurisdiction,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableResearchElementDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableResearchElementDefinition
        && equalTo((ImmutableResearchElementDefinition) another);
  }

  private boolean equalTo(ImmutableResearchElementDefinition another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(topic, another.topic)
        && Objects.equals(library, another.library)
        && Objects.equals(version, another.version)
        && Objects.equals(meta, another.meta)
        && Objects.equals(date, another.date)
        && Objects.equals(title, another.title)
        && Objects.equals(reviewer, another.reviewer)
        && Objects.equals(text, another.text)
        && Objects.equals(language, another.language)
        && Objects.equals(purpose, another.purpose)
        && Objects.equals(shortTitle, another.shortTitle)
        && Objects.equals(approvalDate, another.approvalDate)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(id, another.id)
        && Objects.equals(endorser, another.endorser)
        && Objects.equals(editor, another.editor)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(name, another.name)
        && characteristic.equals(another.characteristic)
        && Objects.equals(relatedArtifact, another.relatedArtifact)
        && Objects.equals(contained, another.contained)
        && Objects.equals(status, another.status)
        && resourceType.equals(another.resourceType)
        && Objects.equals(contact, another.contact)
        && Objects.equals(copyright, another.copyright)
        && Objects.equals(comment, another.comment)
        && Objects.equals(url, another.url)
        && Objects.equals(publisher, another.publisher)
        && Objects.equals(variableType, another.variableType)
        && Objects.equals(usage, another.usage)
        && Objects.equals(useContext, another.useContext)
        && Objects.equals(effectivePeriod, another.effectivePeriod)
        && Objects.equals(author, another.author)
        && Objects.equals(subjectCodeableConcept, another.subjectCodeableConcept)
        && Objects.equals(lastReviewDate, another.lastReviewDate)
        && Objects.equals(type, another.type)
        && Objects.equals(subtitle, another.subtitle)
        && Objects.equals(description, another.description)
        && Objects.equals(subjectReference, another.subjectReference)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(extension, another.extension)
        && Objects.equals(experimental, another.experimental);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code topic}, {@code library}, {@code version}, {@code meta}, {@code date}, {@code title}, {@code reviewer}, {@code text}, {@code language}, {@code purpose}, {@code shortTitle}, {@code approvalDate}, {@code identifier}, {@code id}, {@code endorser}, {@code editor}, {@code implicitRules}, {@code name}, {@code characteristic}, {@code relatedArtifact}, {@code contained}, {@code status}, {@code resourceType}, {@code contact}, {@code copyright}, {@code comment}, {@code url}, {@code publisher}, {@code variableType}, {@code usage}, {@code useContext}, {@code effectivePeriod}, {@code author}, {@code subjectCodeableConcept}, {@code lastReviewDate}, {@code type}, {@code subtitle}, {@code description}, {@code subjectReference}, {@code jurisdiction}, {@code extension}, {@code experimental}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(topic);
    h += (h << 5) + Objects.hashCode(library);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(reviewer);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(purpose);
    h += (h << 5) + Objects.hashCode(shortTitle);
    h += (h << 5) + Objects.hashCode(approvalDate);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(endorser);
    h += (h << 5) + Objects.hashCode(editor);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + characteristic.hashCode();
    h += (h << 5) + Objects.hashCode(relatedArtifact);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(copyright);
    h += (h << 5) + Objects.hashCode(comment);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(publisher);
    h += (h << 5) + Objects.hashCode(variableType);
    h += (h << 5) + Objects.hashCode(usage);
    h += (h << 5) + Objects.hashCode(useContext);
    h += (h << 5) + Objects.hashCode(effectivePeriod);
    h += (h << 5) + Objects.hashCode(author);
    h += (h << 5) + Objects.hashCode(subjectCodeableConcept);
    h += (h << 5) + Objects.hashCode(lastReviewDate);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(subtitle);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(subjectReference);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(experimental);
    return h;
  }

  /**
   * Prints the immutable value {@code ResearchElementDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ResearchElementDefinition{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (topic != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("topic=").append(topic);
    }
    if (library != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("library=").append(library);
    }
    if (version != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (meta != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (date != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (title != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (reviewer != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("reviewer=").append(reviewer);
    }
    if (text != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (language != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (purpose != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (shortTitle != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("shortTitle=").append(shortTitle);
    }
    if (approvalDate != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("approvalDate=").append(approvalDate);
    }
    if (identifier != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (endorser != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("endorser=").append(endorser);
    }
    if (editor != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("editor=").append(editor);
    }
    if (implicitRules != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (name != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (builder.length() > 26) builder.append(", ");
    builder.append("characteristic=").append(characteristic);
    if (relatedArtifact != null) {
      builder.append(", ");
      builder.append("relatedArtifact=").append(relatedArtifact);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (comment != null) {
      builder.append(", ");
      builder.append("comment=").append(comment);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (variableType != null) {
      builder.append(", ");
      builder.append("variableType=").append(variableType);
    }
    if (usage != null) {
      builder.append(", ");
      builder.append("usage=").append(usage);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (effectivePeriod != null) {
      builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (author != null) {
      builder.append(", ");
      builder.append("author=").append(author);
    }
    if (subjectCodeableConcept != null) {
      builder.append(", ");
      builder.append("subjectCodeableConcept=").append(subjectCodeableConcept);
    }
    if (lastReviewDate != null) {
      builder.append(", ");
      builder.append("lastReviewDate=").append(lastReviewDate);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (subtitle != null) {
      builder.append(", ");
      builder.append("subtitle=").append(subtitle);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (subjectReference != null) {
      builder.append(", ");
      builder.append("subjectReference=").append(subjectReference);
    }
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ResearchElementDefinition", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ResearchElementDefinition {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<CodeableConcept>> topic = Optional.empty();
    boolean topicIsSet;
    @Nullable Optional<List<Canonical>> library = Optional.empty();
    boolean libraryIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<List<ContactDetail>> reviewer = Optional.empty();
    boolean reviewerIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Markdown> purpose = Optional.empty();
    boolean purposeIsSet;
    @Nullable Optional<String> shortTitle = Optional.empty();
    boolean shortTitleIsSet;
    @Nullable Optional<Date> approvalDate = Optional.empty();
    boolean approvalDateIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<ContactDetail>> endorser = Optional.empty();
    boolean endorserIsSet;
    @Nullable Optional<List<ContactDetail>> editor = Optional.empty();
    boolean editorIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable List<ResearchElementDefinition_Characteristic> characteristic = Collections.emptyList();
    @Nullable Optional<List<RelatedArtifact>> relatedArtifact = Optional.empty();
    boolean relatedArtifactIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<ResearchelementdefinitionStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<Markdown> copyright = Optional.empty();
    boolean copyrightIsSet;
    @Nullable Optional<List<String>> comment = Optional.empty();
    boolean commentIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<String> publisher = Optional.empty();
    boolean publisherIsSet;
    @Nullable Optional<ResearchelementdefinitionVariabletype> variableType = Optional.empty();
    boolean variableTypeIsSet;
    @Nullable Optional<String> usage = Optional.empty();
    boolean usageIsSet;
    @Nullable Optional<List<UsageContext>> useContext = Optional.empty();
    boolean useContextIsSet;
    @Nullable Optional<Period> effectivePeriod = Optional.empty();
    boolean effectivePeriodIsSet;
    @Nullable Optional<List<ContactDetail>> author = Optional.empty();
    boolean authorIsSet;
    @Nullable Optional<CodeableConcept> subjectCodeableConcept = Optional.empty();
    boolean subjectCodeableConceptIsSet;
    @Nullable Optional<Date> lastReviewDate = Optional.empty();
    boolean lastReviewDateIsSet;
    @Nullable Optional<ResearchelementdefinitionType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<String> subtitle = Optional.empty();
    boolean subtitleIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Reference> subjectReference = Optional.empty();
    boolean subjectReferenceIsSet;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Boolean> experimental = Optional.empty();
    boolean experimentalIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("topic")
    public void setTopic(Optional<List<CodeableConcept>> topic) {
      this.topic = topic;
      this.topicIsSet = true;
    }
    @JsonProperty("library")
    public void setLibrary(Optional<List<Canonical>> library) {
      this.library = library;
      this.libraryIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("reviewer")
    public void setReviewer(Optional<List<ContactDetail>> reviewer) {
      this.reviewer = reviewer;
      this.reviewerIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("purpose")
    public void setPurpose(Optional<Markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @JsonProperty("shortTitle")
    public void setShortTitle(Optional<String> shortTitle) {
      this.shortTitle = shortTitle;
      this.shortTitleIsSet = true;
    }
    @JsonProperty("approvalDate")
    public void setApprovalDate(Optional<Date> approvalDate) {
      this.approvalDate = approvalDate;
      this.approvalDateIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("endorser")
    public void setEndorser(Optional<List<ContactDetail>> endorser) {
      this.endorser = endorser;
      this.endorserIsSet = true;
    }
    @JsonProperty("editor")
    public void setEditor(Optional<List<ContactDetail>> editor) {
      this.editor = editor;
      this.editorIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("characteristic")
    public void setCharacteristic(List<ResearchElementDefinition_Characteristic> characteristic) {
      this.characteristic = characteristic;
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
    @JsonProperty("status")
    public void setStatus(Optional<ResearchelementdefinitionStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("copyright")
    public void setCopyright(Optional<Markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @JsonProperty("comment")
    public void setComment(Optional<List<String>> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("publisher")
    public void setPublisher(Optional<String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @JsonProperty("variableType")
    public void setVariableType(Optional<ResearchelementdefinitionVariabletype> variableType) {
      this.variableType = variableType;
      this.variableTypeIsSet = true;
    }
    @JsonProperty("usage")
    public void setUsage(Optional<String> usage) {
      this.usage = usage;
      this.usageIsSet = true;
    }
    @JsonProperty("useContext")
    public void setUseContext(Optional<List<UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @JsonProperty("effectivePeriod")
    public void setEffectivePeriod(Optional<Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @JsonProperty("author")
    public void setAuthor(Optional<List<ContactDetail>> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @JsonProperty("subjectCodeableConcept")
    public void setSubjectCodeableConcept(Optional<CodeableConcept> subjectCodeableConcept) {
      this.subjectCodeableConcept = subjectCodeableConcept;
      this.subjectCodeableConceptIsSet = true;
    }
    @JsonProperty("lastReviewDate")
    public void setLastReviewDate(Optional<Date> lastReviewDate) {
      this.lastReviewDate = lastReviewDate;
      this.lastReviewDateIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<ResearchelementdefinitionType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("subtitle")
    public void setSubtitle(Optional<String> subtitle) {
      this.subtitle = subtitle;
      this.subtitleIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("subjectReference")
    public void setSubjectReference(Optional<Reference> subjectReference) {
      this.subjectReference = subjectReference;
      this.subjectReferenceIsSet = true;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<List<CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("experimental")
    public void setExperimental(Optional<Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> topic() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> library() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> reviewer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> shortTitle() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> approvalDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> endorser() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> editor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public List<ResearchElementDefinition_Characteristic> characteristic() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<RelatedArtifact>> relatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ResearchelementdefinitionStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> comment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ResearchelementdefinitionVariabletype> variableType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> usage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> author() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> subjectCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> lastReviewDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ResearchelementdefinitionType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> subtitle() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subjectReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> experimental() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableResearchElementDefinition fromJson(Json json) {
    ImmutableResearchElementDefinition.Builder builder = ((ImmutableResearchElementDefinition.Builder) ImmutableResearchElementDefinition.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.topicIsSet) {
      builder.topic(json.topic);
    }
    if (json.libraryIsSet) {
      builder.library(json.library);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.reviewerIsSet) {
      builder.reviewer(json.reviewer);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.shortTitleIsSet) {
      builder.shortTitle(json.shortTitle);
    }
    if (json.approvalDateIsSet) {
      builder.approvalDate(json.approvalDate);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.endorserIsSet) {
      builder.endorser(json.endorser);
    }
    if (json.editorIsSet) {
      builder.editor(json.editor);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.characteristic != null) {
      builder.addAllCharacteristic(json.characteristic);
    }
    if (json.relatedArtifactIsSet) {
      builder.relatedArtifact(json.relatedArtifact);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.variableTypeIsSet) {
      builder.variableType(json.variableType);
    }
    if (json.usageIsSet) {
      builder.usage(json.usage);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.subjectCodeableConceptIsSet) {
      builder.subjectCodeableConcept(json.subjectCodeableConcept);
    }
    if (json.lastReviewDateIsSet) {
      builder.lastReviewDate(json.lastReviewDate);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.subtitleIsSet) {
      builder.subtitle(json.subtitle);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.subjectReferenceIsSet) {
      builder.subjectReference(json.subjectReference);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    return (ImmutableResearchElementDefinition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ResearchElementDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ResearchElementDefinition instance
   */
  public static ResearchElementDefinition copyOf(ResearchElementDefinition instance) {
    if (instance instanceof ImmutableResearchElementDefinition) {
      return (ImmutableResearchElementDefinition) instance;
    }
    return ((ImmutableResearchElementDefinition.Builder) ImmutableResearchElementDefinition.builder())
        .modifierExtension(instance.modifierExtension())
        .topic(instance.topic())
        .library(instance.library())
        .version(instance.version())
        .meta(instance.meta())
        .date(instance.date())
        .title(instance.title())
        .reviewer(instance.reviewer())
        .text(instance.text())
        .language(instance.language())
        .purpose(instance.purpose())
        .shortTitle(instance.shortTitle())
        .approvalDate(instance.approvalDate())
        .identifier(instance.identifier())
        .id(instance.id())
        .endorser(instance.endorser())
        .editor(instance.editor())
        .implicitRules(instance.implicitRules())
        .name(instance.name())
        .addAllCharacteristic(instance.characteristic())
        .relatedArtifact(instance.relatedArtifact())
        .contained(instance.contained())
        .status(instance.status())
        .resourceType(instance.resourceType())
        .contact(instance.contact())
        .copyright(instance.copyright())
        .comment(instance.comment())
        .url(instance.url())
        .publisher(instance.publisher())
        .variableType(instance.variableType())
        .usage(instance.usage())
        .useContext(instance.useContext())
        .effectivePeriod(instance.effectivePeriod())
        .author(instance.author())
        .subjectCodeableConcept(instance.subjectCodeableConcept())
        .lastReviewDate(instance.lastReviewDate())
        .type(instance.type())
        .subtitle(instance.subtitle())
        .description(instance.description())
        .subjectReference(instance.subjectReference())
        .jurisdiction(instance.jurisdiction())
        .extension(instance.extension())
        .experimental(instance.experimental())
        .build();
  }

  /**
   * Creates a builder for {@link ResearchElementDefinition ResearchElementDefinition}.
   * <pre>
   * ImmutableResearchElementDefinition.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ResearchElementDefinition#modifierExtension() modifierExtension}
   *    .topic(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ResearchElementDefinition#topic() topic}
   *    .library(List&amp;lt;com.medplum.types.fhir.Canonical&amp;gt;) // optional {@link ResearchElementDefinition#library() library}
   *    .version(String) // optional {@link ResearchElementDefinition#version() version}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link ResearchElementDefinition#meta() meta}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link ResearchElementDefinition#date() date}
   *    .title(String) // optional {@link ResearchElementDefinition#title() title}
   *    .reviewer(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link ResearchElementDefinition#reviewer() reviewer}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link ResearchElementDefinition#text() text}
   *    .language(com.medplum.types.fhir.Code) // optional {@link ResearchElementDefinition#language() language}
   *    .purpose(com.medplum.types.fhir.Markdown) // optional {@link ResearchElementDefinition#purpose() purpose}
   *    .shortTitle(String) // optional {@link ResearchElementDefinition#shortTitle() shortTitle}
   *    .approvalDate(com.medplum.types.fhir.Date) // optional {@link ResearchElementDefinition#approvalDate() approvalDate}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link ResearchElementDefinition#identifier() identifier}
   *    .id(com.medplum.types.fhir.Id) // optional {@link ResearchElementDefinition#id() id}
   *    .endorser(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link ResearchElementDefinition#endorser() endorser}
   *    .editor(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link ResearchElementDefinition#editor() editor}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link ResearchElementDefinition#implicitRules() implicitRules}
   *    .name(String) // optional {@link ResearchElementDefinition#name() name}
   *    .addCharacteristic|addAllCharacteristic(com.medplum.types.fhir.ResearchElementDefinition_Characteristic) // {@link ResearchElementDefinition#characteristic() characteristic} elements
   *    .relatedArtifact(List&amp;lt;com.medplum.types.fhir.RelatedArtifact&amp;gt;) // optional {@link ResearchElementDefinition#relatedArtifact() relatedArtifact}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link ResearchElementDefinition#contained() contained}
   *    .status(com.medplum.types.fhir.ResearchelementdefinitionStatus) // optional {@link ResearchElementDefinition#status() status}
   *    .resourceType(String) // required {@link ResearchElementDefinition#resourceType() resourceType}
   *    .contact(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link ResearchElementDefinition#contact() contact}
   *    .copyright(com.medplum.types.fhir.Markdown) // optional {@link ResearchElementDefinition#copyright() copyright}
   *    .comment(List&amp;lt;String&amp;gt;) // optional {@link ResearchElementDefinition#comment() comment}
   *    .url(com.medplum.types.fhir.Uri) // optional {@link ResearchElementDefinition#url() url}
   *    .publisher(String) // optional {@link ResearchElementDefinition#publisher() publisher}
   *    .variableType(com.medplum.types.fhir.ResearchelementdefinitionVariabletype) // optional {@link ResearchElementDefinition#variableType() variableType}
   *    .usage(String) // optional {@link ResearchElementDefinition#usage() usage}
   *    .useContext(List&amp;lt;com.medplum.types.fhir.UsageContext&amp;gt;) // optional {@link ResearchElementDefinition#useContext() useContext}
   *    .effectivePeriod(com.medplum.types.fhir.Period) // optional {@link ResearchElementDefinition#effectivePeriod() effectivePeriod}
   *    .author(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link ResearchElementDefinition#author() author}
   *    .subjectCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link ResearchElementDefinition#subjectCodeableConcept() subjectCodeableConcept}
   *    .lastReviewDate(com.medplum.types.fhir.Date) // optional {@link ResearchElementDefinition#lastReviewDate() lastReviewDate}
   *    .type(com.medplum.types.fhir.ResearchelementdefinitionType) // optional {@link ResearchElementDefinition#type() type}
   *    .subtitle(String) // optional {@link ResearchElementDefinition#subtitle() subtitle}
   *    .description(com.medplum.types.fhir.Markdown) // optional {@link ResearchElementDefinition#description() description}
   *    .subjectReference(com.medplum.types.fhir.Reference) // optional {@link ResearchElementDefinition#subjectReference() subjectReference}
   *    .jurisdiction(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ResearchElementDefinition#jurisdiction() jurisdiction}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ResearchElementDefinition#extension() extension}
   *    .experimental(Boolean) // optional {@link ResearchElementDefinition#experimental() experimental}
   *    .build();
   * </pre>
   * @return A new ResearchElementDefinition builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableResearchElementDefinition.Builder();
  }

  /**
   * Builds instances of type {@link ResearchElementDefinition ResearchElementDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ResearchElementDefinition", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_TOPIC = 0x2L;
    private static final long OPT_BIT_LIBRARY = 0x4L;
    private static final long OPT_BIT_VERSION = 0x8L;
    private static final long OPT_BIT_META = 0x10L;
    private static final long OPT_BIT_DATE = 0x20L;
    private static final long OPT_BIT_TITLE = 0x40L;
    private static final long OPT_BIT_REVIEWER = 0x80L;
    private static final long OPT_BIT_TEXT = 0x100L;
    private static final long OPT_BIT_LANGUAGE = 0x200L;
    private static final long OPT_BIT_PURPOSE = 0x400L;
    private static final long OPT_BIT_SHORT_TITLE = 0x800L;
    private static final long OPT_BIT_APPROVAL_DATE = 0x1000L;
    private static final long OPT_BIT_IDENTIFIER = 0x2000L;
    private static final long OPT_BIT_ID = 0x4000L;
    private static final long OPT_BIT_ENDORSER = 0x8000L;
    private static final long OPT_BIT_EDITOR = 0x10000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20000L;
    private static final long OPT_BIT_NAME = 0x40000L;
    private static final long OPT_BIT_RELATED_ARTIFACT = 0x80000L;
    private static final long OPT_BIT_CONTAINED = 0x100000L;
    private static final long OPT_BIT_STATUS = 0x200000L;
    private static final long OPT_BIT_CONTACT = 0x400000L;
    private static final long OPT_BIT_COPYRIGHT = 0x800000L;
    private static final long OPT_BIT_COMMENT = 0x1000000L;
    private static final long OPT_BIT_URL = 0x2000000L;
    private static final long OPT_BIT_PUBLISHER = 0x4000000L;
    private static final long OPT_BIT_VARIABLE_TYPE = 0x8000000L;
    private static final long OPT_BIT_USAGE = 0x10000000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x20000000L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x40000000L;
    private static final long OPT_BIT_AUTHOR = 0x80000000L;
    private static final long OPT_BIT_SUBJECT_CODEABLE_CONCEPT = 0x100000000L;
    private static final long OPT_BIT_LAST_REVIEW_DATE = 0x200000000L;
    private static final long OPT_BIT_TYPE = 0x400000000L;
    private static final long OPT_BIT_SUBTITLE = 0x800000000L;
    private static final long OPT_BIT_DESCRIPTION = 0x1000000000L;
    private static final long OPT_BIT_SUBJECT_REFERENCE = 0x2000000000L;
    private static final long OPT_BIT_JURISDICTION = 0x4000000000L;
    private static final long OPT_BIT_EXTENSION = 0x8000000000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x10000000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<CodeableConcept> topic;
    private @Nullable List<Canonical> library;
    private @Nullable String version;
    private @Nullable Meta meta;
    private @Nullable DateTime date;
    private @Nullable String title;
    private @Nullable List<ContactDetail> reviewer;
    private @Nullable Narrative text;
    private @Nullable Code language;
    private @Nullable Markdown purpose;
    private @Nullable String shortTitle;
    private @Nullable Date approvalDate;
    private @Nullable List<Identifier> identifier;
    private @Nullable Id id;
    private @Nullable List<ContactDetail> endorser;
    private @Nullable List<ContactDetail> editor;
    private @Nullable Uri implicitRules;
    private @Nullable String name;
    private final List<ResearchElementDefinition_Characteristic> characteristic = new ArrayList<ResearchElementDefinition_Characteristic>();
    private @Nullable List<RelatedArtifact> relatedArtifact;
    private @Nullable List<ResourceList> contained;
    private @Nullable ResearchelementdefinitionStatus status;
    private @Nullable String resourceType;
    private @Nullable List<ContactDetail> contact;
    private @Nullable Markdown copyright;
    private @Nullable List<String> comment;
    private @Nullable Uri url;
    private @Nullable String publisher;
    private @Nullable ResearchelementdefinitionVariabletype variableType;
    private @Nullable String usage;
    private @Nullable List<UsageContext> useContext;
    private @Nullable Period effectivePeriod;
    private @Nullable List<ContactDetail> author;
    private @Nullable CodeableConcept subjectCodeableConcept;
    private @Nullable Date lastReviewDate;
    private @Nullable ResearchelementdefinitionType type;
    private @Nullable String subtitle;
    private @Nullable Markdown description;
    private @Nullable Reference subjectReference;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable List<Extension> extension;
    private @Nullable Boolean experimental;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ResearchElementDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ResearchElementDefinition#topic() topic} to topic.
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
     * Initializes the optional value {@link ResearchElementDefinition#topic() topic} to topic.
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
     * Initializes the optional value {@link ResearchElementDefinition#library() library} to library.
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
     * Initializes the optional value {@link ResearchElementDefinition#library() library} to library.
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
     * Initializes the optional value {@link ResearchElementDefinition#version() version} to version.
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
     * Initializes the optional value {@link ResearchElementDefinition#version() version} to version.
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
     * Initializes the optional value {@link ResearchElementDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link ResearchElementDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link ResearchElementDefinition#date() date} to date.
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
     * Initializes the optional value {@link ResearchElementDefinition#date() date} to date.
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
     * Initializes the optional value {@link ResearchElementDefinition#title() title} to title.
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
     * Initializes the optional value {@link ResearchElementDefinition#title() title} to title.
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
     * Initializes the optional value {@link ResearchElementDefinition#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link ResearchElementDefinition#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link ResearchElementDefinition#text() text} to text.
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
     * Initializes the optional value {@link ResearchElementDefinition#text() text} to text.
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
     * Initializes the optional value {@link ResearchElementDefinition#language() language} to language.
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
     * Initializes the optional value {@link ResearchElementDefinition#language() language} to language.
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
     * Initializes the optional value {@link ResearchElementDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link ResearchElementDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link ResearchElementDefinition#shortTitle() shortTitle} to shortTitle.
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
     * Initializes the optional value {@link ResearchElementDefinition#shortTitle() shortTitle} to shortTitle.
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
     * Initializes the optional value {@link ResearchElementDefinition#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link ResearchElementDefinition#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link ResearchElementDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ResearchElementDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ResearchElementDefinition#id() id} to id.
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
     * Initializes the optional value {@link ResearchElementDefinition#id() id} to id.
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
     * Initializes the optional value {@link ResearchElementDefinition#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link ResearchElementDefinition#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link ResearchElementDefinition#editor() editor} to editor.
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
     * Initializes the optional value {@link ResearchElementDefinition#editor() editor} to editor.
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
     * Initializes the optional value {@link ResearchElementDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ResearchElementDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ResearchElementDefinition#name() name} to name.
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
     * Initializes the optional value {@link ResearchElementDefinition#name() name} to name.
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
     * Adds one element to {@link ResearchElementDefinition#characteristic() characteristic} list.
     * @param element A characteristic element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addCharacteristic(ResearchElementDefinition_Characteristic element) {
      this.characteristic.add(Objects.requireNonNull(element, "characteristic element"));
      return this;
    }

    /**
     * Adds elements to {@link ResearchElementDefinition#characteristic() characteristic} list.
     * @param elements An array of characteristic elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addCharacteristic(ResearchElementDefinition_Characteristic... elements) {
      for (ResearchElementDefinition_Characteristic element : elements) {
        this.characteristic.add(Objects.requireNonNull(element, "characteristic element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link ResearchElementDefinition#characteristic() characteristic} list.
     * @param elements An iterable of characteristic elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllCharacteristic(Iterable<? extends ResearchElementDefinition_Characteristic> elements) {
      for (ResearchElementDefinition_Characteristic element : elements) {
        this.characteristic.add(Objects.requireNonNull(element, "characteristic element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link ResearchElementDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link ResearchElementDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link ResearchElementDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link ResearchElementDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(ResearchelementdefinitionStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends ResearchelementdefinitionStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the value for the {@link ResearchElementDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ResearchElementDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link ResearchElementDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link ResearchElementDefinition#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link ResearchElementDefinition#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link ResearchElementDefinition#comment() comment} to comment.
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
     * Initializes the optional value {@link ResearchElementDefinition#comment() comment} to comment.
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
     * Initializes the optional value {@link ResearchElementDefinition#url() url} to url.
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
     * Initializes the optional value {@link ResearchElementDefinition#url() url} to url.
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
     * Initializes the optional value {@link ResearchElementDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ResearchElementDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ResearchElementDefinition#variableType() variableType} to variableType.
     * @param variableType The value for variableType
     * @return {@code this} builder for chained invocation
     */
    public final Builder variableType(ResearchelementdefinitionVariabletype variableType) {
      checkNotIsSet(variableTypeIsSet(), "variableType");
      this.variableType = Objects.requireNonNull(variableType, "variableType");
      optBits |= OPT_BIT_VARIABLE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition#variableType() variableType} to variableType.
     * @param variableType The value for variableType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("variableType")
    public final Builder variableType(Optional<? extends ResearchelementdefinitionVariabletype> variableType) {
      checkNotIsSet(variableTypeIsSet(), "variableType");
      this.variableType = variableType.orElse(null);
      optBits |= OPT_BIT_VARIABLE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition#usage() usage} to usage.
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
     * Initializes the optional value {@link ResearchElementDefinition#usage() usage} to usage.
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
     * Initializes the optional value {@link ResearchElementDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link ResearchElementDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link ResearchElementDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link ResearchElementDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link ResearchElementDefinition#author() author} to author.
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
     * Initializes the optional value {@link ResearchElementDefinition#author() author} to author.
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
     * Initializes the optional value {@link ResearchElementDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
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
     * Initializes the optional value {@link ResearchElementDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
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
     * Initializes the optional value {@link ResearchElementDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link ResearchElementDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link ResearchElementDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(ResearchelementdefinitionType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends ResearchelementdefinitionType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchElementDefinition#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link ResearchElementDefinition#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link ResearchElementDefinition#description() description} to description.
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
     * Initializes the optional value {@link ResearchElementDefinition#description() description} to description.
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
     * Initializes the optional value {@link ResearchElementDefinition#subjectReference() subjectReference} to subjectReference.
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
     * Initializes the optional value {@link ResearchElementDefinition#subjectReference() subjectReference} to subjectReference.
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
     * Initializes the optional value {@link ResearchElementDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ResearchElementDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ResearchElementDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link ResearchElementDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link ResearchElementDefinition#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link ResearchElementDefinition#experimental() experimental} to experimental.
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
     * Builds a new {@link ResearchElementDefinition ResearchElementDefinition}.
     * @return An immutable instance of ResearchElementDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ResearchElementDefinition build() {
      checkRequiredAttributes();
      return new ImmutableResearchElementDefinition(
          modifierExtension,
          topic,
          library,
          version,
          meta,
          date,
          title,
          reviewer,
          text,
          language,
          purpose,
          shortTitle,
          approvalDate,
          identifier,
          id,
          endorser,
          editor,
          implicitRules,
          name,
          createUnmodifiableList(true, characteristic),
          relatedArtifact,
          contained,
          status,
          resourceType,
          contact,
          copyright,
          comment,
          url,
          publisher,
          variableType,
          usage,
          useContext,
          effectivePeriod,
          author,
          subjectCodeableConcept,
          lastReviewDate,
          type,
          subtitle,
          description,
          subjectReference,
          jurisdiction,
          extension,
          experimental);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean topicIsSet() {
      return (optBits & OPT_BIT_TOPIC) != 0;
    }

    private boolean libraryIsSet() {
      return (optBits & OPT_BIT_LIBRARY) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean reviewerIsSet() {
      return (optBits & OPT_BIT_REVIEWER) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean shortTitleIsSet() {
      return (optBits & OPT_BIT_SHORT_TITLE) != 0;
    }

    private boolean approvalDateIsSet() {
      return (optBits & OPT_BIT_APPROVAL_DATE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean endorserIsSet() {
      return (optBits & OPT_BIT_ENDORSER) != 0;
    }

    private boolean editorIsSet() {
      return (optBits & OPT_BIT_EDITOR) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean relatedArtifactIsSet() {
      return (optBits & OPT_BIT_RELATED_ARTIFACT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean variableTypeIsSet() {
      return (optBits & OPT_BIT_VARIABLE_TYPE) != 0;
    }

    private boolean usageIsSet() {
      return (optBits & OPT_BIT_USAGE) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean subjectCodeableConceptIsSet() {
      return (optBits & OPT_BIT_SUBJECT_CODEABLE_CONCEPT) != 0;
    }

    private boolean lastReviewDateIsSet() {
      return (optBits & OPT_BIT_LAST_REVIEW_DATE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean subtitleIsSet() {
      return (optBits & OPT_BIT_SUBTITLE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean subjectReferenceIsSet() {
      return (optBits & OPT_BIT_SUBJECT_REFERENCE) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ResearchElementDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build ResearchElementDefinition, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ResearchElementDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ResearchElementDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "ResearchElementDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ResearchElementDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topic(List<CodeableConcept> topic);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topic(Optional<? extends List<CodeableConcept>> topic);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#library() library} to library.
     * @param library The value for library
     * @return {@code this} builder for chained invocation
     */
    BuildFinal library(List<Canonical> library);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#library() library} to library.
     * @param library The value for library
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal library(Optional<? extends List<Canonical>> library);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reviewer(List<ContactDetail> reviewer);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reviewer(Optional<? extends List<ContactDetail>> reviewer);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(Markdown purpose);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(Optional<? extends Markdown> purpose);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#shortTitle() shortTitle} to shortTitle.
     * @param shortTitle The value for shortTitle
     * @return {@code this} builder for chained invocation
     */
    BuildFinal shortTitle(String shortTitle);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#shortTitle() shortTitle} to shortTitle.
     * @param shortTitle The value for shortTitle
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal shortTitle(Optional<String> shortTitle);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal approvalDate(Date approvalDate);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal approvalDate(Optional<? extends Date> approvalDate);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endorser(List<ContactDetail> endorser);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endorser(Optional<? extends List<ContactDetail>> endorser);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal editor(List<ContactDetail> editor);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal editor(Optional<? extends List<ContactDetail>> editor);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Adds one element to {@link ResearchElementDefinition#characteristic() characteristic} list.
     * @param element A characteristic element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addCharacteristic(ResearchElementDefinition_Characteristic element);

    /**
     * Adds elements to {@link ResearchElementDefinition#characteristic() characteristic} list.
     * @param elements An array of characteristic elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addCharacteristic(ResearchElementDefinition_Characteristic... elements);

    /**
     * Adds elements to {@link ResearchElementDefinition#characteristic() characteristic} list.
     * @param elements An iterable of characteristic elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllCharacteristic(Iterable<? extends ResearchElementDefinition_Characteristic> elements);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatedArtifact(List<RelatedArtifact> relatedArtifact);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatedArtifact(Optional<? extends List<RelatedArtifact>> relatedArtifact);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(ResearchelementdefinitionStatus status);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends ResearchelementdefinitionStatus> status);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(Markdown copyright);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(Optional<? extends Markdown> copyright);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comment(List<String> comment);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comment(Optional<? extends List<String>> comment);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(String publisher);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<String> publisher);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#variableType() variableType} to variableType.
     * @param variableType The value for variableType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal variableType(ResearchelementdefinitionVariabletype variableType);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#variableType() variableType} to variableType.
     * @param variableType The value for variableType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal variableType(Optional<? extends ResearchelementdefinitionVariabletype> variableType);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal usage(String usage);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal usage(Optional<String> usage);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(List<UsageContext> useContext);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(Optional<? extends List<UsageContext>> useContext);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(Period effectivePeriod);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(Optional<? extends Period> effectivePeriod);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(List<ContactDetail> author);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(Optional<? extends List<ContactDetail>> author);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subjectCodeableConcept(CodeableConcept subjectCodeableConcept);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subjectCodeableConcept(Optional<? extends CodeableConcept> subjectCodeableConcept);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastReviewDate(Date lastReviewDate);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastReviewDate(Optional<? extends Date> lastReviewDate);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(ResearchelementdefinitionType type);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends ResearchelementdefinitionType> type);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subtitle(String subtitle);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subtitle(Optional<String> subtitle);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(Markdown description);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<? extends Markdown> description);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subjectReference(Reference subjectReference);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subjectReference(Optional<? extends Reference> subjectReference);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(List<CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link ResearchElementDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(Optional<Boolean> experimental);

    /**
     * Builds a new {@link ResearchElementDefinition ResearchElementDefinition}.
     * @return An immutable instance of ResearchElementDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ResearchElementDefinition build();
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}