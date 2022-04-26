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
 * Immutable implementation of {@link PlanDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePlanDefinition.builder()}.
 */
@Generated(from = "PlanDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePlanDefinition implements PlanDefinition {
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<ContactDetail> contact;
  private final @Nullable String usage;
  private final @Nullable Reference subjectReference;
  private final @Nullable Uri implicitRules;
  private final @Nullable CodeableConcept type;
  private final @Nullable Boolean experimental;
  private final @Nullable List<ContactDetail> endorser;
  private final @Nullable Markdown purpose;
  private final @Nullable List<ContactDetail> editor;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Meta meta;
  private final @Nullable String version;
  private final @Nullable List<ContactDetail> reviewer;
  private final @Nullable List<PlanDefinition_Action> action;
  private final @Nullable String publisher;
  private final @Nullable Narrative text;
  private final @Nullable Id id;
  private final @Nullable Markdown copyright;
  private final @Nullable List<CodeableConcept> topic;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable String subtitle;
  private final @Nullable List<UsageContext> useContext;
  private final @Nullable Date lastReviewDate;
  private final @Nullable Uri url;
  private final @Nullable CodeableConcept subjectCodeableConcept;
  private final @Nullable List<RelatedArtifact> relatedArtifact;
  private final @Nullable Period effectivePeriod;
  private final String resourceType;
  private final @Nullable DateTime date;
  private final @Nullable Date approvalDate;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<PlanDefinition_Goal> goal;
  private final @Nullable Code language;
  private final @Nullable PlandefinitionStatus status;
  private final @Nullable List<Canonical> library;
  private final @Nullable Markdown description;
  private final @Nullable String name;
  private final @Nullable String title;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final @Nullable List<ContactDetail> author;

  private ImmutablePlanDefinition(
      @Nullable List<ResourceList> contained,
      @Nullable List<ContactDetail> contact,
      @Nullable String usage,
      @Nullable Reference subjectReference,
      @Nullable Uri implicitRules,
      @Nullable CodeableConcept type,
      @Nullable Boolean experimental,
      @Nullable List<ContactDetail> endorser,
      @Nullable Markdown purpose,
      @Nullable List<ContactDetail> editor,
      @Nullable List<Extension> modifierExtension,
      @Nullable Meta meta,
      @Nullable String version,
      @Nullable List<ContactDetail> reviewer,
      @Nullable List<PlanDefinition_Action> action,
      @Nullable String publisher,
      @Nullable Narrative text,
      @Nullable Id id,
      @Nullable Markdown copyright,
      @Nullable List<CodeableConcept> topic,
      @Nullable List<Identifier> identifier,
      @Nullable String subtitle,
      @Nullable List<UsageContext> useContext,
      @Nullable Date lastReviewDate,
      @Nullable Uri url,
      @Nullable CodeableConcept subjectCodeableConcept,
      @Nullable List<RelatedArtifact> relatedArtifact,
      @Nullable Period effectivePeriod,
      String resourceType,
      @Nullable DateTime date,
      @Nullable Date approvalDate,
      @Nullable List<Extension> extension,
      @Nullable List<PlanDefinition_Goal> goal,
      @Nullable Code language,
      @Nullable PlandefinitionStatus status,
      @Nullable List<Canonical> library,
      @Nullable Markdown description,
      @Nullable String name,
      @Nullable String title,
      @Nullable List<CodeableConcept> jurisdiction,
      @Nullable List<ContactDetail> author) {
    this.contained = contained;
    this.contact = contact;
    this.usage = usage;
    this.subjectReference = subjectReference;
    this.implicitRules = implicitRules;
    this.type = type;
    this.experimental = experimental;
    this.endorser = endorser;
    this.purpose = purpose;
    this.editor = editor;
    this.modifierExtension = modifierExtension;
    this.meta = meta;
    this.version = version;
    this.reviewer = reviewer;
    this.action = action;
    this.publisher = publisher;
    this.text = text;
    this.id = id;
    this.copyright = copyright;
    this.topic = topic;
    this.identifier = identifier;
    this.subtitle = subtitle;
    this.useContext = useContext;
    this.lastReviewDate = lastReviewDate;
    this.url = url;
    this.subjectCodeableConcept = subjectCodeableConcept;
    this.relatedArtifact = relatedArtifact;
    this.effectivePeriod = effectivePeriod;
    this.resourceType = resourceType;
    this.date = date;
    this.approvalDate = approvalDate;
    this.extension = extension;
    this.goal = goal;
    this.language = language;
    this.status = status;
    this.library = library;
    this.description = description;
    this.name = name;
    this.title = title;
    this.jurisdiction = jurisdiction;
    this.author = author;
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
   * @return The value of the {@code contact} attribute
   */
  @JsonProperty("contact")
  @Override
  public Optional<List<ContactDetail>> contact() {
    return Optional.ofNullable(contact);
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
   * @return The value of the {@code subjectReference} attribute
   */
  @JsonProperty("subjectReference")
  @Override
  public Optional<Reference> subjectReference() {
    return Optional.ofNullable(subjectReference);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code endorser} attribute
   */
  @JsonProperty("endorser")
  @Override
  public Optional<List<ContactDetail>> endorser() {
    return Optional.ofNullable(endorser);
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
   * @return The value of the {@code editor} attribute
   */
  @JsonProperty("editor")
  @Override
  public Optional<List<ContactDetail>> editor() {
    return Optional.ofNullable(editor);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
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
   * @return The value of the {@code reviewer} attribute
   */
  @JsonProperty("reviewer")
  @Override
  public Optional<List<ContactDetail>> reviewer() {
    return Optional.ofNullable(reviewer);
  }

  /**
   * @return The value of the {@code action} attribute
   */
  @JsonProperty("action")
  @Override
  public Optional<List<PlanDefinition_Action>> action() {
    return Optional.ofNullable(action);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
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
   * @return The value of the {@code copyright} attribute
   */
  @JsonProperty("copyright")
  @Override
  public Optional<Markdown> copyright() {
    return Optional.ofNullable(copyright);
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
   * @return The value of the {@code subtitle} attribute
   */
  @JsonProperty("subtitle")
  @Override
  public Optional<String> subtitle() {
    return Optional.ofNullable(subtitle);
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
   * @return The value of the {@code lastReviewDate} attribute
   */
  @JsonProperty("lastReviewDate")
  @Override
  public Optional<Date> lastReviewDate() {
    return Optional.ofNullable(lastReviewDate);
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
   * @return The value of the {@code subjectCodeableConcept} attribute
   */
  @JsonProperty("subjectCodeableConcept")
  @Override
  public Optional<CodeableConcept> subjectCodeableConcept() {
    return Optional.ofNullable(subjectCodeableConcept);
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
   * @return The value of the {@code effectivePeriod} attribute
   */
  @JsonProperty("effectivePeriod")
  @Override
  public Optional<Period> effectivePeriod() {
    return Optional.ofNullable(effectivePeriod);
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
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<DateTime> date() {
    return Optional.ofNullable(date);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code goal} attribute
   */
  @JsonProperty("goal")
  @Override
  public Optional<List<PlanDefinition_Goal>> goal() {
    return Optional.ofNullable(goal);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<PlandefinitionStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<Markdown> description() {
    return Optional.ofNullable(description);
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
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
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
   * @return The value of the {@code author} attribute
   */
  @JsonProperty("author")
  @Override
  public Optional<List<ContactDetail>> author() {
    return Optional.ofNullable(author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutablePlanDefinition(
        newValue,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutablePlanDefinition(
        value,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        newValue,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        value,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#usage() usage} attribute.
   * @param value The value for usage
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withUsage(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "usage");
    if (Objects.equals(this.usage, newValue)) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        newValue,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#usage() usage} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usage
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withUsage(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.usage, value)) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        value,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#subjectReference() subjectReference} attribute.
   * @param value The value for subjectReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withSubjectReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subjectReference");
    if (this.subjectReference == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        newValue,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#subjectReference() subjectReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withSubjectReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subjectReference == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        value,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        newValue,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        value,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        newValue,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        value,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withExperimental(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.experimental, newValue)) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        newValue,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withExperimental(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.experimental, value)) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        value,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#endorser() endorser} attribute.
   * @param value The value for endorser
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withEndorser(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "endorser");
    if (this.endorser == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        newValue,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#endorser() endorser} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endorser
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withEndorser(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.endorser == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        value,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withPurpose(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        newValue,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withPurpose(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        value,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#editor() editor} attribute.
   * @param value The value for editor
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withEditor(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "editor");
    if (this.editor == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        newValue,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#editor() editor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for editor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withEditor(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.editor == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        value,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        newValue,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        value,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        newValue,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        value,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        newValue,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        value,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#reviewer() reviewer} attribute.
   * @param value The value for reviewer
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withReviewer(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "reviewer");
    if (this.reviewer == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        newValue,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#reviewer() reviewer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reviewer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withReviewer(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.reviewer == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        value,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#action() action} attribute.
   * @param value The value for action
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withAction(List<PlanDefinition_Action> value) {
    @Nullable List<PlanDefinition_Action> newValue = Objects.requireNonNull(value, "action");
    if (this.action == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        newValue,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#action() action} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for action
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withAction(Optional<? extends List<PlanDefinition_Action>> optional) {
    @Nullable List<PlanDefinition_Action> value = optional.orElse(null);
    if (this.action == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        value,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withPublisher(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "publisher");
    if (Objects.equals(this.publisher, newValue)) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        newValue,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withPublisher(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.publisher, value)) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        value,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        newValue,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        value,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        newValue,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        value,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withCopyright(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        newValue,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withCopyright(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        value,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#topic() topic} attribute.
   * @param value The value for topic
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withTopic(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "topic");
    if (this.topic == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        newValue,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#topic() topic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withTopic(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.topic == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        value,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        newValue,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        value,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#subtitle() subtitle} attribute.
   * @param value The value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withSubtitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "subtitle");
    if (Objects.equals(this.subtitle, newValue)) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        newValue,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#subtitle() subtitle} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withSubtitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.subtitle, value)) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        value,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withUseContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        newValue,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withUseContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        value,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#lastReviewDate() lastReviewDate} attribute.
   * @param value The value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withLastReviewDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "lastReviewDate");
    if (this.lastReviewDate == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        newValue,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#lastReviewDate() lastReviewDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withLastReviewDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.lastReviewDate == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        value,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        newValue,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        value,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * @param value The value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withSubjectCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "subjectCodeableConcept");
    if (this.subjectCodeableConcept == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        newValue,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withSubjectCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.subjectCodeableConcept == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        value,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#relatedArtifact() relatedArtifact} attribute.
   * @param value The value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withRelatedArtifact(List<RelatedArtifact> value) {
    @Nullable List<RelatedArtifact> newValue = Objects.requireNonNull(value, "relatedArtifact");
    if (this.relatedArtifact == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        newValue,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#relatedArtifact() relatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withRelatedArtifact(Optional<? extends List<RelatedArtifact>> optional) {
    @Nullable List<RelatedArtifact> value = optional.orElse(null);
    if (this.relatedArtifact == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        value,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withEffectivePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        newValue,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withEffectivePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        value,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PlanDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePlanDefinition withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        newValue,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        newValue,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        value,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#approvalDate() approvalDate} attribute.
   * @param value The value for approvalDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withApprovalDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "approvalDate");
    if (this.approvalDate == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        newValue,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#approvalDate() approvalDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for approvalDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withApprovalDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.approvalDate == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        value,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        newValue,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        value,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#goal() goal} attribute.
   * @param value The value for goal
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withGoal(List<PlanDefinition_Goal> value) {
    @Nullable List<PlanDefinition_Goal> newValue = Objects.requireNonNull(value, "goal");
    if (this.goal == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        newValue,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#goal() goal} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for goal
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withGoal(Optional<? extends List<PlanDefinition_Goal>> optional) {
    @Nullable List<PlanDefinition_Goal> value = optional.orElse(null);
    if (this.goal == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        value,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        newValue,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        value,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withStatus(PlandefinitionStatus value) {
    @Nullable PlandefinitionStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        newValue,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withStatus(Optional<? extends PlandefinitionStatus> optional) {
    @Nullable PlandefinitionStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        value,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#library() library} attribute.
   * @param value The value for library
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withLibrary(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "library");
    if (this.library == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        newValue,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#library() library} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for library
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withLibrary(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.library == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        value,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        newValue,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        value,
        this.name,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        newValue,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        value,
        this.title,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        newValue,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        value,
        this.jurisdiction,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        newValue,
        this.author);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        value,
        this.author);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withAuthor(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withAuthor(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutablePlanDefinition(
        this.contained,
        this.contact,
        this.usage,
        this.subjectReference,
        this.implicitRules,
        this.type,
        this.experimental,
        this.endorser,
        this.purpose,
        this.editor,
        this.modifierExtension,
        this.meta,
        this.version,
        this.reviewer,
        this.action,
        this.publisher,
        this.text,
        this.id,
        this.copyright,
        this.topic,
        this.identifier,
        this.subtitle,
        this.useContext,
        this.lastReviewDate,
        this.url,
        this.subjectCodeableConcept,
        this.relatedArtifact,
        this.effectivePeriod,
        this.resourceType,
        this.date,
        this.approvalDate,
        this.extension,
        this.goal,
        this.language,
        this.status,
        this.library,
        this.description,
        this.name,
        this.title,
        this.jurisdiction,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePlanDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePlanDefinition
        && equalTo((ImmutablePlanDefinition) another);
  }

  private boolean equalTo(ImmutablePlanDefinition another) {
    return Objects.equals(contained, another.contained)
        && Objects.equals(contact, another.contact)
        && Objects.equals(usage, another.usage)
        && Objects.equals(subjectReference, another.subjectReference)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(type, another.type)
        && Objects.equals(experimental, another.experimental)
        && Objects.equals(endorser, another.endorser)
        && Objects.equals(purpose, another.purpose)
        && Objects.equals(editor, another.editor)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(meta, another.meta)
        && Objects.equals(version, another.version)
        && Objects.equals(reviewer, another.reviewer)
        && Objects.equals(action, another.action)
        && Objects.equals(publisher, another.publisher)
        && Objects.equals(text, another.text)
        && Objects.equals(id, another.id)
        && Objects.equals(copyright, another.copyright)
        && Objects.equals(topic, another.topic)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(subtitle, another.subtitle)
        && Objects.equals(useContext, another.useContext)
        && Objects.equals(lastReviewDate, another.lastReviewDate)
        && Objects.equals(url, another.url)
        && Objects.equals(subjectCodeableConcept, another.subjectCodeableConcept)
        && Objects.equals(relatedArtifact, another.relatedArtifact)
        && Objects.equals(effectivePeriod, another.effectivePeriod)
        && resourceType.equals(another.resourceType)
        && Objects.equals(date, another.date)
        && Objects.equals(approvalDate, another.approvalDate)
        && Objects.equals(extension, another.extension)
        && Objects.equals(goal, another.goal)
        && Objects.equals(language, another.language)
        && Objects.equals(status, another.status)
        && Objects.equals(library, another.library)
        && Objects.equals(description, another.description)
        && Objects.equals(name, another.name)
        && Objects.equals(title, another.title)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(author, another.author);
  }

  /**
   * Computes a hash code from attributes: {@code contained}, {@code contact}, {@code usage}, {@code subjectReference}, {@code implicitRules}, {@code type}, {@code experimental}, {@code endorser}, {@code purpose}, {@code editor}, {@code modifierExtension}, {@code meta}, {@code version}, {@code reviewer}, {@code action}, {@code publisher}, {@code text}, {@code id}, {@code copyright}, {@code topic}, {@code identifier}, {@code subtitle}, {@code useContext}, {@code lastReviewDate}, {@code url}, {@code subjectCodeableConcept}, {@code relatedArtifact}, {@code effectivePeriod}, {@code resourceType}, {@code date}, {@code approvalDate}, {@code extension}, {@code goal}, {@code language}, {@code status}, {@code library}, {@code description}, {@code name}, {@code title}, {@code jurisdiction}, {@code author}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(usage);
    h += (h << 5) + Objects.hashCode(subjectReference);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(experimental);
    h += (h << 5) + Objects.hashCode(endorser);
    h += (h << 5) + Objects.hashCode(purpose);
    h += (h << 5) + Objects.hashCode(editor);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(reviewer);
    h += (h << 5) + Objects.hashCode(action);
    h += (h << 5) + Objects.hashCode(publisher);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(copyright);
    h += (h << 5) + Objects.hashCode(topic);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(subtitle);
    h += (h << 5) + Objects.hashCode(useContext);
    h += (h << 5) + Objects.hashCode(lastReviewDate);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(subjectCodeableConcept);
    h += (h << 5) + Objects.hashCode(relatedArtifact);
    h += (h << 5) + Objects.hashCode(effectivePeriod);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(approvalDate);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(goal);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(library);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(author);
    return h;
  }

  /**
   * Prints the immutable value {@code PlanDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("PlanDefinition{");
    if (contained != null) {
      builder.append("contained=").append(contained);
    }
    if (contact != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (usage != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("usage=").append(usage);
    }
    if (subjectReference != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("subjectReference=").append(subjectReference);
    }
    if (implicitRules != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (type != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (experimental != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (endorser != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("endorser=").append(endorser);
    }
    if (purpose != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (editor != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("editor=").append(editor);
    }
    if (modifierExtension != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (meta != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (version != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (reviewer != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("reviewer=").append(reviewer);
    }
    if (action != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("action=").append(action);
    }
    if (publisher != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (text != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (id != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (copyright != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (topic != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("topic=").append(topic);
    }
    if (identifier != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (subtitle != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("subtitle=").append(subtitle);
    }
    if (useContext != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (lastReviewDate != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("lastReviewDate=").append(lastReviewDate);
    }
    if (url != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (subjectCodeableConcept != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("subjectCodeableConcept=").append(subjectCodeableConcept);
    }
    if (relatedArtifact != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("relatedArtifact=").append(relatedArtifact);
    }
    if (effectivePeriod != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (builder.length() > 15) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (approvalDate != null) {
      builder.append(", ");
      builder.append("approvalDate=").append(approvalDate);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (goal != null) {
      builder.append(", ");
      builder.append("goal=").append(goal);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (library != null) {
      builder.append(", ");
      builder.append("library=").append(library);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (author != null) {
      builder.append(", ");
      builder.append("author=").append(author);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "PlanDefinition", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements PlanDefinition {
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<String> usage = Optional.empty();
    boolean usageIsSet;
    @Nullable Optional<Reference> subjectReference = Optional.empty();
    boolean subjectReferenceIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Boolean> experimental = Optional.empty();
    boolean experimentalIsSet;
    @Nullable Optional<List<ContactDetail>> endorser = Optional.empty();
    boolean endorserIsSet;
    @Nullable Optional<Markdown> purpose = Optional.empty();
    boolean purposeIsSet;
    @Nullable Optional<List<ContactDetail>> editor = Optional.empty();
    boolean editorIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<List<ContactDetail>> reviewer = Optional.empty();
    boolean reviewerIsSet;
    @Nullable Optional<List<PlanDefinition_Action>> action = Optional.empty();
    boolean actionIsSet;
    @Nullable Optional<String> publisher = Optional.empty();
    boolean publisherIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Markdown> copyright = Optional.empty();
    boolean copyrightIsSet;
    @Nullable Optional<List<CodeableConcept>> topic = Optional.empty();
    boolean topicIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<String> subtitle = Optional.empty();
    boolean subtitleIsSet;
    @Nullable Optional<List<UsageContext>> useContext = Optional.empty();
    boolean useContextIsSet;
    @Nullable Optional<Date> lastReviewDate = Optional.empty();
    boolean lastReviewDateIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<CodeableConcept> subjectCodeableConcept = Optional.empty();
    boolean subjectCodeableConceptIsSet;
    @Nullable Optional<List<RelatedArtifact>> relatedArtifact = Optional.empty();
    boolean relatedArtifactIsSet;
    @Nullable Optional<Period> effectivePeriod = Optional.empty();
    boolean effectivePeriodIsSet;
    @Nullable String resourceType;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<Date> approvalDate = Optional.empty();
    boolean approvalDateIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<PlanDefinition_Goal>> goal = Optional.empty();
    boolean goalIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<PlandefinitionStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<Canonical>> library = Optional.empty();
    boolean libraryIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<List<ContactDetail>> author = Optional.empty();
    boolean authorIsSet;
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("usage")
    public void setUsage(Optional<String> usage) {
      this.usage = usage;
      this.usageIsSet = true;
    }
    @JsonProperty("subjectReference")
    public void setSubjectReference(Optional<Reference> subjectReference) {
      this.subjectReference = subjectReference;
      this.subjectReferenceIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("experimental")
    public void setExperimental(Optional<Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @JsonProperty("endorser")
    public void setEndorser(Optional<List<ContactDetail>> endorser) {
      this.endorser = endorser;
      this.endorserIsSet = true;
    }
    @JsonProperty("purpose")
    public void setPurpose(Optional<Markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @JsonProperty("editor")
    public void setEditor(Optional<List<ContactDetail>> editor) {
      this.editor = editor;
      this.editorIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("reviewer")
    public void setReviewer(Optional<List<ContactDetail>> reviewer) {
      this.reviewer = reviewer;
      this.reviewerIsSet = true;
    }
    @JsonProperty("action")
    public void setAction(Optional<List<PlanDefinition_Action>> action) {
      this.action = action;
      this.actionIsSet = true;
    }
    @JsonProperty("publisher")
    public void setPublisher(Optional<String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("copyright")
    public void setCopyright(Optional<Markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
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
    @JsonProperty("subtitle")
    public void setSubtitle(Optional<String> subtitle) {
      this.subtitle = subtitle;
      this.subtitleIsSet = true;
    }
    @JsonProperty("useContext")
    public void setUseContext(Optional<List<UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @JsonProperty("lastReviewDate")
    public void setLastReviewDate(Optional<Date> lastReviewDate) {
      this.lastReviewDate = lastReviewDate;
      this.lastReviewDateIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("subjectCodeableConcept")
    public void setSubjectCodeableConcept(Optional<CodeableConcept> subjectCodeableConcept) {
      this.subjectCodeableConcept = subjectCodeableConcept;
      this.subjectCodeableConceptIsSet = true;
    }
    @JsonProperty("relatedArtifact")
    public void setRelatedArtifact(Optional<List<RelatedArtifact>> relatedArtifact) {
      this.relatedArtifact = relatedArtifact;
      this.relatedArtifactIsSet = true;
    }
    @JsonProperty("effectivePeriod")
    public void setEffectivePeriod(Optional<Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("approvalDate")
    public void setApprovalDate(Optional<Date> approvalDate) {
      this.approvalDate = approvalDate;
      this.approvalDateIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("goal")
    public void setGoal(Optional<List<PlanDefinition_Goal>> goal) {
      this.goal = goal;
      this.goalIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<PlandefinitionStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("library")
    public void setLibrary(Optional<List<Canonical>> library) {
      this.library = library;
      this.libraryIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<List<CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("author")
    public void setAuthor(Optional<List<ContactDetail>> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> usage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subjectReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> endorser() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> editor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> reviewer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PlanDefinition_Action>> action() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> topic() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> subtitle() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> lastReviewDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> subjectCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<RelatedArtifact>> relatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> approvalDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PlanDefinition_Goal>> goal() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PlandefinitionStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> library() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> author() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePlanDefinition fromJson(Json json) {
    ImmutablePlanDefinition.Builder builder = ((ImmutablePlanDefinition.Builder) ImmutablePlanDefinition.builder());
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.usageIsSet) {
      builder.usage(json.usage);
    }
    if (json.subjectReferenceIsSet) {
      builder.subjectReference(json.subjectReference);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.endorserIsSet) {
      builder.endorser(json.endorser);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.editorIsSet) {
      builder.editor(json.editor);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.reviewerIsSet) {
      builder.reviewer(json.reviewer);
    }
    if (json.actionIsSet) {
      builder.action(json.action);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.topicIsSet) {
      builder.topic(json.topic);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.subtitleIsSet) {
      builder.subtitle(json.subtitle);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.lastReviewDateIsSet) {
      builder.lastReviewDate(json.lastReviewDate);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.subjectCodeableConceptIsSet) {
      builder.subjectCodeableConcept(json.subjectCodeableConcept);
    }
    if (json.relatedArtifactIsSet) {
      builder.relatedArtifact(json.relatedArtifact);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.approvalDateIsSet) {
      builder.approvalDate(json.approvalDate);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.goalIsSet) {
      builder.goal(json.goal);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.libraryIsSet) {
      builder.library(json.library);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    return (ImmutablePlanDefinition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PlanDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PlanDefinition instance
   */
  public static PlanDefinition copyOf(PlanDefinition instance) {
    if (instance instanceof ImmutablePlanDefinition) {
      return (ImmutablePlanDefinition) instance;
    }
    return ((ImmutablePlanDefinition.Builder) ImmutablePlanDefinition.builder())
        .contained(instance.contained())
        .contact(instance.contact())
        .usage(instance.usage())
        .subjectReference(instance.subjectReference())
        .implicitRules(instance.implicitRules())
        .type(instance.type())
        .experimental(instance.experimental())
        .endorser(instance.endorser())
        .purpose(instance.purpose())
        .editor(instance.editor())
        .modifierExtension(instance.modifierExtension())
        .meta(instance.meta())
        .version(instance.version())
        .reviewer(instance.reviewer())
        .action(instance.action())
        .publisher(instance.publisher())
        .text(instance.text())
        .id(instance.id())
        .copyright(instance.copyright())
        .topic(instance.topic())
        .identifier(instance.identifier())
        .subtitle(instance.subtitle())
        .useContext(instance.useContext())
        .lastReviewDate(instance.lastReviewDate())
        .url(instance.url())
        .subjectCodeableConcept(instance.subjectCodeableConcept())
        .relatedArtifact(instance.relatedArtifact())
        .effectivePeriod(instance.effectivePeriod())
        .resourceType(instance.resourceType())
        .date(instance.date())
        .approvalDate(instance.approvalDate())
        .extension(instance.extension())
        .goal(instance.goal())
        .language(instance.language())
        .status(instance.status())
        .library(instance.library())
        .description(instance.description())
        .name(instance.name())
        .title(instance.title())
        .jurisdiction(instance.jurisdiction())
        .author(instance.author())
        .build();
  }

  /**
   * Creates a builder for {@link PlanDefinition PlanDefinition}.
   * <pre>
   * ImmutablePlanDefinition.builder()
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link PlanDefinition#contained() contained}
   *    .contact(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link PlanDefinition#contact() contact}
   *    .usage(String) // optional {@link PlanDefinition#usage() usage}
   *    .subjectReference(com.medplum.types.fhir.Reference) // optional {@link PlanDefinition#subjectReference() subjectReference}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link PlanDefinition#implicitRules() implicitRules}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link PlanDefinition#type() type}
   *    .experimental(Boolean) // optional {@link PlanDefinition#experimental() experimental}
   *    .endorser(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link PlanDefinition#endorser() endorser}
   *    .purpose(com.medplum.types.fhir.Markdown) // optional {@link PlanDefinition#purpose() purpose}
   *    .editor(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link PlanDefinition#editor() editor}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link PlanDefinition#modifierExtension() modifierExtension}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link PlanDefinition#meta() meta}
   *    .version(String) // optional {@link PlanDefinition#version() version}
   *    .reviewer(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link PlanDefinition#reviewer() reviewer}
   *    .action(List&amp;lt;com.medplum.types.fhir.PlanDefinition_Action&amp;gt;) // optional {@link PlanDefinition#action() action}
   *    .publisher(String) // optional {@link PlanDefinition#publisher() publisher}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link PlanDefinition#text() text}
   *    .id(com.medplum.types.fhir.Id) // optional {@link PlanDefinition#id() id}
   *    .copyright(com.medplum.types.fhir.Markdown) // optional {@link PlanDefinition#copyright() copyright}
   *    .topic(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link PlanDefinition#topic() topic}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link PlanDefinition#identifier() identifier}
   *    .subtitle(String) // optional {@link PlanDefinition#subtitle() subtitle}
   *    .useContext(List&amp;lt;com.medplum.types.fhir.UsageContext&amp;gt;) // optional {@link PlanDefinition#useContext() useContext}
   *    .lastReviewDate(com.medplum.types.fhir.Date) // optional {@link PlanDefinition#lastReviewDate() lastReviewDate}
   *    .url(com.medplum.types.fhir.Uri) // optional {@link PlanDefinition#url() url}
   *    .subjectCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link PlanDefinition#subjectCodeableConcept() subjectCodeableConcept}
   *    .relatedArtifact(List&amp;lt;com.medplum.types.fhir.RelatedArtifact&amp;gt;) // optional {@link PlanDefinition#relatedArtifact() relatedArtifact}
   *    .effectivePeriod(com.medplum.types.fhir.Period) // optional {@link PlanDefinition#effectivePeriod() effectivePeriod}
   *    .resourceType(String) // required {@link PlanDefinition#resourceType() resourceType}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link PlanDefinition#date() date}
   *    .approvalDate(com.medplum.types.fhir.Date) // optional {@link PlanDefinition#approvalDate() approvalDate}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link PlanDefinition#extension() extension}
   *    .goal(List&amp;lt;com.medplum.types.fhir.PlanDefinition_Goal&amp;gt;) // optional {@link PlanDefinition#goal() goal}
   *    .language(com.medplum.types.fhir.Code) // optional {@link PlanDefinition#language() language}
   *    .status(com.medplum.types.fhir.PlandefinitionStatus) // optional {@link PlanDefinition#status() status}
   *    .library(List&amp;lt;com.medplum.types.fhir.Canonical&amp;gt;) // optional {@link PlanDefinition#library() library}
   *    .description(com.medplum.types.fhir.Markdown) // optional {@link PlanDefinition#description() description}
   *    .name(String) // optional {@link PlanDefinition#name() name}
   *    .title(String) // optional {@link PlanDefinition#title() title}
   *    .jurisdiction(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link PlanDefinition#jurisdiction() jurisdiction}
   *    .author(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link PlanDefinition#author() author}
   *    .build();
   * </pre>
   * @return A new PlanDefinition builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutablePlanDefinition.Builder();
  }

  /**
   * Builds instances of type {@link PlanDefinition PlanDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PlanDefinition", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_CONTAINED = 0x1L;
    private static final long OPT_BIT_CONTACT = 0x2L;
    private static final long OPT_BIT_USAGE = 0x4L;
    private static final long OPT_BIT_SUBJECT_REFERENCE = 0x8L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10L;
    private static final long OPT_BIT_TYPE = 0x20L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x40L;
    private static final long OPT_BIT_ENDORSER = 0x80L;
    private static final long OPT_BIT_PURPOSE = 0x100L;
    private static final long OPT_BIT_EDITOR = 0x200L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x400L;
    private static final long OPT_BIT_META = 0x800L;
    private static final long OPT_BIT_VERSION = 0x1000L;
    private static final long OPT_BIT_REVIEWER = 0x2000L;
    private static final long OPT_BIT_ACTION = 0x4000L;
    private static final long OPT_BIT_PUBLISHER = 0x8000L;
    private static final long OPT_BIT_TEXT = 0x10000L;
    private static final long OPT_BIT_ID = 0x20000L;
    private static final long OPT_BIT_COPYRIGHT = 0x40000L;
    private static final long OPT_BIT_TOPIC = 0x80000L;
    private static final long OPT_BIT_IDENTIFIER = 0x100000L;
    private static final long OPT_BIT_SUBTITLE = 0x200000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x400000L;
    private static final long OPT_BIT_LAST_REVIEW_DATE = 0x800000L;
    private static final long OPT_BIT_URL = 0x1000000L;
    private static final long OPT_BIT_SUBJECT_CODEABLE_CONCEPT = 0x2000000L;
    private static final long OPT_BIT_RELATED_ARTIFACT = 0x4000000L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x8000000L;
    private static final long OPT_BIT_DATE = 0x10000000L;
    private static final long OPT_BIT_APPROVAL_DATE = 0x20000000L;
    private static final long OPT_BIT_EXTENSION = 0x40000000L;
    private static final long OPT_BIT_GOAL = 0x80000000L;
    private static final long OPT_BIT_LANGUAGE = 0x100000000L;
    private static final long OPT_BIT_STATUS = 0x200000000L;
    private static final long OPT_BIT_LIBRARY = 0x400000000L;
    private static final long OPT_BIT_DESCRIPTION = 0x800000000L;
    private static final long OPT_BIT_NAME = 0x1000000000L;
    private static final long OPT_BIT_TITLE = 0x2000000000L;
    private static final long OPT_BIT_JURISDICTION = 0x4000000000L;
    private static final long OPT_BIT_AUTHOR = 0x8000000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<ResourceList> contained;
    private @Nullable List<ContactDetail> contact;
    private @Nullable String usage;
    private @Nullable Reference subjectReference;
    private @Nullable Uri implicitRules;
    private @Nullable CodeableConcept type;
    private @Nullable Boolean experimental;
    private @Nullable List<ContactDetail> endorser;
    private @Nullable Markdown purpose;
    private @Nullable List<ContactDetail> editor;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Meta meta;
    private @Nullable String version;
    private @Nullable List<ContactDetail> reviewer;
    private @Nullable List<PlanDefinition_Action> action;
    private @Nullable String publisher;
    private @Nullable Narrative text;
    private @Nullable Id id;
    private @Nullable Markdown copyright;
    private @Nullable List<CodeableConcept> topic;
    private @Nullable List<Identifier> identifier;
    private @Nullable String subtitle;
    private @Nullable List<UsageContext> useContext;
    private @Nullable Date lastReviewDate;
    private @Nullable Uri url;
    private @Nullable CodeableConcept subjectCodeableConcept;
    private @Nullable List<RelatedArtifact> relatedArtifact;
    private @Nullable Period effectivePeriod;
    private @Nullable String resourceType;
    private @Nullable DateTime date;
    private @Nullable Date approvalDate;
    private @Nullable List<Extension> extension;
    private @Nullable List<PlanDefinition_Goal> goal;
    private @Nullable Code language;
    private @Nullable PlandefinitionStatus status;
    private @Nullable List<Canonical> library;
    private @Nullable Markdown description;
    private @Nullable String name;
    private @Nullable String title;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable List<ContactDetail> author;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link PlanDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link PlanDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link PlanDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link PlanDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link PlanDefinition#usage() usage} to usage.
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
     * Initializes the optional value {@link PlanDefinition#usage() usage} to usage.
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
     * Initializes the optional value {@link PlanDefinition#subjectReference() subjectReference} to subjectReference.
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
     * Initializes the optional value {@link PlanDefinition#subjectReference() subjectReference} to subjectReference.
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
     * Initializes the optional value {@link PlanDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link PlanDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link PlanDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link PlanDefinition#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link PlanDefinition#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link PlanDefinition#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link PlanDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link PlanDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link PlanDefinition#editor() editor} to editor.
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
     * Initializes the optional value {@link PlanDefinition#editor() editor} to editor.
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
     * Initializes the optional value {@link PlanDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PlanDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PlanDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link PlanDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link PlanDefinition#version() version} to version.
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
     * Initializes the optional value {@link PlanDefinition#version() version} to version.
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
     * Initializes the optional value {@link PlanDefinition#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link PlanDefinition#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link PlanDefinition#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for chained invocation
     */
    public final Builder action(List<PlanDefinition_Action> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = Objects.requireNonNull(action, "action");
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("action")
    public final Builder action(Optional<? extends List<PlanDefinition_Action>> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = action.orElse(null);
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link PlanDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link PlanDefinition#text() text} to text.
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
     * Initializes the optional value {@link PlanDefinition#text() text} to text.
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
     * Initializes the optional value {@link PlanDefinition#id() id} to id.
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
     * Initializes the optional value {@link PlanDefinition#id() id} to id.
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
     * Initializes the optional value {@link PlanDefinition#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link PlanDefinition#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link PlanDefinition#topic() topic} to topic.
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
     * Initializes the optional value {@link PlanDefinition#topic() topic} to topic.
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
     * Initializes the optional value {@link PlanDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link PlanDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link PlanDefinition#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link PlanDefinition#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link PlanDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link PlanDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link PlanDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link PlanDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link PlanDefinition#url() url} to url.
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
     * Initializes the optional value {@link PlanDefinition#url() url} to url.
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
     * Initializes the optional value {@link PlanDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
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
     * Initializes the optional value {@link PlanDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
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
     * Initializes the optional value {@link PlanDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link PlanDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link PlanDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link PlanDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the value for the {@link PlanDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link PlanDefinition#date() date} to date.
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
     * Initializes the optional value {@link PlanDefinition#date() date} to date.
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
     * Initializes the optional value {@link PlanDefinition#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link PlanDefinition#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link PlanDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link PlanDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link PlanDefinition#goal() goal} to goal.
     * @param goal The value for goal
     * @return {@code this} builder for chained invocation
     */
    public final Builder goal(List<PlanDefinition_Goal> goal) {
      checkNotIsSet(goalIsSet(), "goal");
      this.goal = Objects.requireNonNull(goal, "goal");
      optBits |= OPT_BIT_GOAL;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition#goal() goal} to goal.
     * @param goal The value for goal
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("goal")
    public final Builder goal(Optional<? extends List<PlanDefinition_Goal>> goal) {
      checkNotIsSet(goalIsSet(), "goal");
      this.goal = goal.orElse(null);
      optBits |= OPT_BIT_GOAL;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition#language() language} to language.
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
     * Initializes the optional value {@link PlanDefinition#language() language} to language.
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
     * Initializes the optional value {@link PlanDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(PlandefinitionStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends PlandefinitionStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition#library() library} to library.
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
     * Initializes the optional value {@link PlanDefinition#library() library} to library.
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
     * Initializes the optional value {@link PlanDefinition#description() description} to description.
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
     * Initializes the optional value {@link PlanDefinition#description() description} to description.
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
     * Initializes the optional value {@link PlanDefinition#name() name} to name.
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
     * Initializes the optional value {@link PlanDefinition#name() name} to name.
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
     * Initializes the optional value {@link PlanDefinition#title() title} to title.
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
     * Initializes the optional value {@link PlanDefinition#title() title} to title.
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
     * Initializes the optional value {@link PlanDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link PlanDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link PlanDefinition#author() author} to author.
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
     * Initializes the optional value {@link PlanDefinition#author() author} to author.
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
     * Builds a new {@link PlanDefinition PlanDefinition}.
     * @return An immutable instance of PlanDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public PlanDefinition build() {
      checkRequiredAttributes();
      return new ImmutablePlanDefinition(
          contained,
          contact,
          usage,
          subjectReference,
          implicitRules,
          type,
          experimental,
          endorser,
          purpose,
          editor,
          modifierExtension,
          meta,
          version,
          reviewer,
          action,
          publisher,
          text,
          id,
          copyright,
          topic,
          identifier,
          subtitle,
          useContext,
          lastReviewDate,
          url,
          subjectCodeableConcept,
          relatedArtifact,
          effectivePeriod,
          resourceType,
          date,
          approvalDate,
          extension,
          goal,
          language,
          status,
          library,
          description,
          name,
          title,
          jurisdiction,
          author);
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

    private boolean subjectReferenceIsSet() {
      return (optBits & OPT_BIT_SUBJECT_REFERENCE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean endorserIsSet() {
      return (optBits & OPT_BIT_ENDORSER) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean editorIsSet() {
      return (optBits & OPT_BIT_EDITOR) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean reviewerIsSet() {
      return (optBits & OPT_BIT_REVIEWER) != 0;
    }

    private boolean actionIsSet() {
      return (optBits & OPT_BIT_ACTION) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean topicIsSet() {
      return (optBits & OPT_BIT_TOPIC) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean subtitleIsSet() {
      return (optBits & OPT_BIT_SUBTITLE) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean lastReviewDateIsSet() {
      return (optBits & OPT_BIT_LAST_REVIEW_DATE) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean subjectCodeableConceptIsSet() {
      return (optBits & OPT_BIT_SUBJECT_CODEABLE_CONCEPT) != 0;
    }

    private boolean relatedArtifactIsSet() {
      return (optBits & OPT_BIT_RELATED_ARTIFACT) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean approvalDateIsSet() {
      return (optBits & OPT_BIT_APPROVAL_DATE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean goalIsSet() {
      return (optBits & OPT_BIT_GOAL) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean libraryIsSet() {
      return (optBits & OPT_BIT_LIBRARY) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of PlanDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build PlanDefinition, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "PlanDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link PlanDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "PlanDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link PlanDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link PlanDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link PlanDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link PlanDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Initializes the optional value {@link PlanDefinition#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal usage(String usage);

    /**
     * Initializes the optional value {@link PlanDefinition#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal usage(Optional<String> usage);

    /**
     * Initializes the optional value {@link PlanDefinition#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subjectReference(Reference subjectReference);

    /**
     * Initializes the optional value {@link PlanDefinition#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subjectReference(Optional<? extends Reference> subjectReference);

    /**
     * Initializes the optional value {@link PlanDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link PlanDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link PlanDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(CodeableConcept type);

    /**
     * Initializes the optional value {@link PlanDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends CodeableConcept> type);

    /**
     * Initializes the optional value {@link PlanDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link PlanDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(Optional<Boolean> experimental);

    /**
     * Initializes the optional value {@link PlanDefinition#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endorser(List<ContactDetail> endorser);

    /**
     * Initializes the optional value {@link PlanDefinition#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endorser(Optional<? extends List<ContactDetail>> endorser);

    /**
     * Initializes the optional value {@link PlanDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(Markdown purpose);

    /**
     * Initializes the optional value {@link PlanDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(Optional<? extends Markdown> purpose);

    /**
     * Initializes the optional value {@link PlanDefinition#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal editor(List<ContactDetail> editor);

    /**
     * Initializes the optional value {@link PlanDefinition#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal editor(Optional<? extends List<ContactDetail>> editor);

    /**
     * Initializes the optional value {@link PlanDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link PlanDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link PlanDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link PlanDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link PlanDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link PlanDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link PlanDefinition#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reviewer(List<ContactDetail> reviewer);

    /**
     * Initializes the optional value {@link PlanDefinition#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reviewer(Optional<? extends List<ContactDetail>> reviewer);

    /**
     * Initializes the optional value {@link PlanDefinition#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for chained invocation
     */
    BuildFinal action(List<PlanDefinition_Action> action);

    /**
     * Initializes the optional value {@link PlanDefinition#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal action(Optional<? extends List<PlanDefinition_Action>> action);

    /**
     * Initializes the optional value {@link PlanDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(String publisher);

    /**
     * Initializes the optional value {@link PlanDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<String> publisher);

    /**
     * Initializes the optional value {@link PlanDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link PlanDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link PlanDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link PlanDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link PlanDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(Markdown copyright);

    /**
     * Initializes the optional value {@link PlanDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(Optional<? extends Markdown> copyright);

    /**
     * Initializes the optional value {@link PlanDefinition#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topic(List<CodeableConcept> topic);

    /**
     * Initializes the optional value {@link PlanDefinition#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topic(Optional<? extends List<CodeableConcept>> topic);

    /**
     * Initializes the optional value {@link PlanDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link PlanDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link PlanDefinition#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subtitle(String subtitle);

    /**
     * Initializes the optional value {@link PlanDefinition#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subtitle(Optional<String> subtitle);

    /**
     * Initializes the optional value {@link PlanDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(List<UsageContext> useContext);

    /**
     * Initializes the optional value {@link PlanDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(Optional<? extends List<UsageContext>> useContext);

    /**
     * Initializes the optional value {@link PlanDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastReviewDate(Date lastReviewDate);

    /**
     * Initializes the optional value {@link PlanDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastReviewDate(Optional<? extends Date> lastReviewDate);

    /**
     * Initializes the optional value {@link PlanDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link PlanDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link PlanDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subjectCodeableConcept(CodeableConcept subjectCodeableConcept);

    /**
     * Initializes the optional value {@link PlanDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subjectCodeableConcept(Optional<? extends CodeableConcept> subjectCodeableConcept);

    /**
     * Initializes the optional value {@link PlanDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatedArtifact(List<RelatedArtifact> relatedArtifact);

    /**
     * Initializes the optional value {@link PlanDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatedArtifact(Optional<? extends List<RelatedArtifact>> relatedArtifact);

    /**
     * Initializes the optional value {@link PlanDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(Period effectivePeriod);

    /**
     * Initializes the optional value {@link PlanDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(Optional<? extends Period> effectivePeriod);

    /**
     * Initializes the optional value {@link PlanDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link PlanDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link PlanDefinition#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal approvalDate(Date approvalDate);

    /**
     * Initializes the optional value {@link PlanDefinition#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal approvalDate(Optional<? extends Date> approvalDate);

    /**
     * Initializes the optional value {@link PlanDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link PlanDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link PlanDefinition#goal() goal} to goal.
     * @param goal The value for goal
     * @return {@code this} builder for chained invocation
     */
    BuildFinal goal(List<PlanDefinition_Goal> goal);

    /**
     * Initializes the optional value {@link PlanDefinition#goal() goal} to goal.
     * @param goal The value for goal
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal goal(Optional<? extends List<PlanDefinition_Goal>> goal);

    /**
     * Initializes the optional value {@link PlanDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link PlanDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link PlanDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(PlandefinitionStatus status);

    /**
     * Initializes the optional value {@link PlanDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends PlandefinitionStatus> status);

    /**
     * Initializes the optional value {@link PlanDefinition#library() library} to library.
     * @param library The value for library
     * @return {@code this} builder for chained invocation
     */
    BuildFinal library(List<Canonical> library);

    /**
     * Initializes the optional value {@link PlanDefinition#library() library} to library.
     * @param library The value for library
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal library(Optional<? extends List<Canonical>> library);

    /**
     * Initializes the optional value {@link PlanDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(Markdown description);

    /**
     * Initializes the optional value {@link PlanDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<? extends Markdown> description);

    /**
     * Initializes the optional value {@link PlanDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link PlanDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link PlanDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link PlanDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Initializes the optional value {@link PlanDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(List<CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link PlanDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link PlanDefinition#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(List<ContactDetail> author);

    /**
     * Initializes the optional value {@link PlanDefinition#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(Optional<? extends List<ContactDetail>> author);

    /**
     * Builds a new {@link PlanDefinition PlanDefinition}.
     * @return An immutable instance of PlanDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    PlanDefinition build();
  }
}
