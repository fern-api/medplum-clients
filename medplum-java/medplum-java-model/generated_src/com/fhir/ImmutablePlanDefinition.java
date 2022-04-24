//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link PlanDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePlanDefinition.builder()}.
 */
@org.immutables.value.Generated(from = "PlanDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePlanDefinition implements com.fhir.PlanDefinition {
  private final @javax.annotation.Nullable com.fhir.Period effectivePeriod;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> library;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Action> action;
  private final @javax.annotation.Nullable com.fhir.Reference subjectReference;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.lang.String usage;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept subjectCodeableConcept;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable com.fhir.date lastReviewDate;
  private final @javax.annotation.Nullable com.fhir.PlandefinitionStatus status;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable com.fhir.date approvalDate;
  private final @javax.annotation.Nullable com.fhir.markdown purpose;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact;
  private final @javax.annotation.Nullable java.lang.String subtitle;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.markdown copyright;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable java.lang.Boolean experimental;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Goal> goal;

  private ImmutablePlanDefinition(
      @javax.annotation.Nullable com.fhir.Period effectivePeriod,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> library,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Action> action,
      @javax.annotation.Nullable com.fhir.Reference subjectReference,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.lang.String usage,
      @javax.annotation.Nullable com.fhir.CodeableConcept subjectCodeableConcept,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable com.fhir.date lastReviewDate,
      @javax.annotation.Nullable com.fhir.PlandefinitionStatus status,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable com.fhir.date approvalDate,
      @javax.annotation.Nullable com.fhir.markdown purpose,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact,
      @javax.annotation.Nullable java.lang.String subtitle,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.markdown copyright,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable java.lang.Boolean experimental,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Goal> goal) {
    this.effectivePeriod = effectivePeriod;
    this.reviewer = reviewer;
    this.type = type;
    this.library = library;
    this.version = version;
    this.editor = editor;
    this.author = author;
    this.resourceType = resourceType;
    this.action = action;
    this.subjectReference = subjectReference;
    this.jurisdiction = jurisdiction;
    this.identifier = identifier;
    this.usage = usage;
    this.subjectCodeableConcept = subjectCodeableConcept;
    this.date = date;
    this.lastReviewDate = lastReviewDate;
    this.status = status;
    this.language = language;
    this.useContext = useContext;
    this.description = description;
    this.contained = contained;
    this.text = text;
    this.title = title;
    this.url = url;
    this.approvalDate = approvalDate;
    this.purpose = purpose;
    this.modifierExtension = modifierExtension;
    this.relatedArtifact = relatedArtifact;
    this.subtitle = subtitle;
    this.implicitRules = implicitRules;
    this.topic = topic;
    this.meta = meta;
    this.copyright = copyright;
    this.id = id;
    this.contact = contact;
    this.endorser = endorser;
    this.name = name;
    this.publisher = publisher;
    this.experimental = experimental;
    this.extension = extension;
    this.goal = goal;
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
   * @return The value of the {@code reviewer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reviewer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer() {
    return java.util.Optional.ofNullable(reviewer);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> type() {
    return java.util.Optional.ofNullable(type);
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
   * @return The value of the {@code version} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("version")
  @Override
  public java.util.Optional<java.lang.String> version() {
    return java.util.Optional.ofNullable(version);
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
   * @return The value of the {@code author} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("author")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> author() {
    return java.util.Optional.ofNullable(author);
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
   * @return The value of the {@code action} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("action")
  @Override
  public java.util.Optional<java.util.List<com.fhir.PlanDefinition_Action>> action() {
    return java.util.Optional.ofNullable(action);
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() {
    return java.util.Optional.ofNullable(jurisdiction);
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
   * @return The value of the {@code usage} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("usage")
  @Override
  public java.util.Optional<java.lang.String> usage() {
    return java.util.Optional.ofNullable(usage);
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
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.dateTime> date() {
    return java.util.Optional.ofNullable(date);
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
  public java.util.Optional<com.fhir.PlandefinitionStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code useContext} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("useContext")
  @Override
  public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() {
    return java.util.Optional.ofNullable(useContext);
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
   * @return The value of the {@code title} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  @Override
  public java.util.Optional<java.lang.String> title() {
    return java.util.Optional.ofNullable(title);
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
   * @return The value of the {@code approvalDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("approvalDate")
  @Override
  public java.util.Optional<com.fhir.date> approvalDate() {
    return java.util.Optional.ofNullable(approvalDate);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code endorser} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("endorser")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser() {
    return java.util.Optional.ofNullable(endorser);
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
   * @return The value of the {@code publisher} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("publisher")
  @Override
  public java.util.Optional<java.lang.String> publisher() {
    return java.util.Optional.ofNullable(publisher);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code goal} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("goal")
  @Override
  public java.util.Optional<java.util.List<com.fhir.PlanDefinition_Goal>> goal() {
    return java.util.Optional.ofNullable(goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withEffectivePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutablePlanDefinition(
        newValue,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withEffectivePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutablePlanDefinition(
        value,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#reviewer() reviewer} attribute.
   * @param value The value for reviewer
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withReviewer(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "reviewer");
    if (this.reviewer == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        newValue,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#reviewer() reviewer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reviewer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withReviewer(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.reviewer == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        value,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        newValue,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        value,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#library() library} attribute.
   * @param value The value for library
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withLibrary(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "library");
    if (this.library == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        newValue,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#library() library} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for library
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withLibrary(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.library == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        value,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        newValue,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        value,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#editor() editor} attribute.
   * @param value The value for editor
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withEditor(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "editor");
    if (this.editor == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        newValue,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#editor() editor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for editor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withEditor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.editor == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        value,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withAuthor(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        newValue,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withAuthor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        value,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PlanDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePlanDefinition withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        newValue,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#action() action} attribute.
   * @param value The value for action
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withAction(java.util.List<com.fhir.PlanDefinition_Action> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Action> newValue = java.util.Objects.requireNonNull(value, "action");
    if (this.action == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        newValue,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#action() action} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for action
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withAction(java.util.Optional<? extends java.util.List<com.fhir.PlanDefinition_Action>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Action> value = optional.orElse(null);
    if (this.action == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        value,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#subjectReference() subjectReference} attribute.
   * @param value The value for subjectReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withSubjectReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subjectReference");
    if (this.subjectReference == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        newValue,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#subjectReference() subjectReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withSubjectReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subjectReference == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        value,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        newValue,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        value,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        newValue,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        value,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#usage() usage} attribute.
   * @param value The value for usage
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withUsage(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "usage");
    if (java.util.Objects.equals(this.usage, newValue)) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        newValue,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#usage() usage} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usage
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withUsage(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.usage, value)) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        value,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * @param value The value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withSubjectCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "subjectCodeableConcept");
    if (this.subjectCodeableConcept == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        newValue,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withSubjectCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.subjectCodeableConcept == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        value,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        newValue,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        value,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#lastReviewDate() lastReviewDate} attribute.
   * @param value The value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withLastReviewDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "lastReviewDate");
    if (this.lastReviewDate == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        newValue,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#lastReviewDate() lastReviewDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withLastReviewDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.lastReviewDate == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        value,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withStatus(com.fhir.PlandefinitionStatus value) {
    @javax.annotation.Nullable com.fhir.PlandefinitionStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        newValue,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withStatus(java.util.Optional<? extends com.fhir.PlandefinitionStatus> optional) {
    @javax.annotation.Nullable com.fhir.PlandefinitionStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        value,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        newValue,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        value,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        newValue,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        value,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        newValue,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        value,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        newValue,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        value,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        newValue,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        value,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        newValue,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        value,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        newValue,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        value,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#approvalDate() approvalDate} attribute.
   * @param value The value for approvalDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withApprovalDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "approvalDate");
    if (this.approvalDate == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        newValue,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#approvalDate() approvalDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for approvalDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withApprovalDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.approvalDate == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        value,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withPurpose(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        newValue,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withPurpose(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        value,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        newValue,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        value,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#relatedArtifact() relatedArtifact} attribute.
   * @param value The value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withRelatedArtifact(java.util.List<com.fhir.RelatedArtifact> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> newValue = java.util.Objects.requireNonNull(value, "relatedArtifact");
    if (this.relatedArtifact == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        newValue,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#relatedArtifact() relatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withRelatedArtifact(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> value = optional.orElse(null);
    if (this.relatedArtifact == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        value,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#subtitle() subtitle} attribute.
   * @param value The value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withSubtitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "subtitle");
    if (java.util.Objects.equals(this.subtitle, newValue)) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        newValue,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#subtitle() subtitle} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withSubtitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.subtitle, value)) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        value,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        newValue,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        value,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#topic() topic} attribute.
   * @param value The value for topic
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withTopic(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "topic");
    if (this.topic == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        newValue,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#topic() topic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withTopic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.topic == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        value,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        newValue,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        value,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withCopyright(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        newValue,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withCopyright(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        value,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        newValue,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        value,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        newValue,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        value,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#endorser() endorser} attribute.
   * @param value The value for endorser
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withEndorser(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "endorser");
    if (this.endorser == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        newValue,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#endorser() endorser} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endorser
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withEndorser(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.endorser == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        value,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        newValue,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        value,
        this.publisher,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        newValue,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        value,
        this.experimental,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withExperimental(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.experimental, newValue)) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        newValue,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withExperimental(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.experimental, value)) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        value,
        this.extension,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        newValue,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        value,
        this.goal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link PlanDefinition#goal() goal} attribute.
   * @param value The value for goal
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlanDefinition withGoal(java.util.List<com.fhir.PlanDefinition_Goal> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Goal> newValue = java.util.Objects.requireNonNull(value, "goal");
    if (this.goal == newValue) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link PlanDefinition#goal() goal} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for goal
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePlanDefinition withGoal(java.util.Optional<? extends java.util.List<com.fhir.PlanDefinition_Goal>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Goal> value = optional.orElse(null);
    if (this.goal == value) return this;
    return new ImmutablePlanDefinition(
        this.effectivePeriod,
        this.reviewer,
        this.type,
        this.library,
        this.version,
        this.editor,
        this.author,
        this.resourceType,
        this.action,
        this.subjectReference,
        this.jurisdiction,
        this.identifier,
        this.usage,
        this.subjectCodeableConcept,
        this.date,
        this.lastReviewDate,
        this.status,
        this.language,
        this.useContext,
        this.description,
        this.contained,
        this.text,
        this.title,
        this.url,
        this.approvalDate,
        this.purpose,
        this.modifierExtension,
        this.relatedArtifact,
        this.subtitle,
        this.implicitRules,
        this.topic,
        this.meta,
        this.copyright,
        this.id,
        this.contact,
        this.endorser,
        this.name,
        this.publisher,
        this.experimental,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePlanDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePlanDefinition
        && equalTo((ImmutablePlanDefinition) another);
  }

  private boolean equalTo(ImmutablePlanDefinition another) {
    return java.util.Objects.equals(effectivePeriod, another.effectivePeriod)
        && java.util.Objects.equals(reviewer, another.reviewer)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(library, another.library)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(editor, another.editor)
        && java.util.Objects.equals(author, another.author)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(action, another.action)
        && java.util.Objects.equals(subjectReference, another.subjectReference)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(usage, another.usage)
        && java.util.Objects.equals(subjectCodeableConcept, another.subjectCodeableConcept)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(lastReviewDate, another.lastReviewDate)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(approvalDate, another.approvalDate)
        && java.util.Objects.equals(purpose, another.purpose)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(relatedArtifact, another.relatedArtifact)
        && java.util.Objects.equals(subtitle, another.subtitle)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(topic, another.topic)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(copyright, another.copyright)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(endorser, another.endorser)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(experimental, another.experimental)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(goal, another.goal);
  }

  /**
   * Computes a hash code from attributes: {@code effectivePeriod}, {@code reviewer}, {@code type}, {@code library}, {@code version}, {@code editor}, {@code author}, {@code resourceType}, {@code action}, {@code subjectReference}, {@code jurisdiction}, {@code identifier}, {@code usage}, {@code subjectCodeableConcept}, {@code date}, {@code lastReviewDate}, {@code status}, {@code language}, {@code useContext}, {@code description}, {@code contained}, {@code text}, {@code title}, {@code url}, {@code approvalDate}, {@code purpose}, {@code modifierExtension}, {@code relatedArtifact}, {@code subtitle}, {@code implicitRules}, {@code topic}, {@code meta}, {@code copyright}, {@code id}, {@code contact}, {@code endorser}, {@code name}, {@code publisher}, {@code experimental}, {@code extension}, {@code goal}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(effectivePeriod);
    h += (h << 5) + java.util.Objects.hashCode(reviewer);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(library);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(editor);
    h += (h << 5) + java.util.Objects.hashCode(author);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(action);
    h += (h << 5) + java.util.Objects.hashCode(subjectReference);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(usage);
    h += (h << 5) + java.util.Objects.hashCode(subjectCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(lastReviewDate);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(approvalDate);
    h += (h << 5) + java.util.Objects.hashCode(purpose);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(relatedArtifact);
    h += (h << 5) + java.util.Objects.hashCode(subtitle);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(topic);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(copyright);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(endorser);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(experimental);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(goal);
    return h;
  }

  /**
   * Prints the immutable value {@code PlanDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("PlanDefinition{");
    if (effectivePeriod != null) {
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (reviewer != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("reviewer=").append(reviewer);
    }
    if (type != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (library != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("library=").append(library);
    }
    if (version != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (editor != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("editor=").append(editor);
    }
    if (author != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("author=").append(author);
    }
    if (builder.length() > 15) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (action != null) {
      builder.append(", ");
      builder.append("action=").append(action);
    }
    if (subjectReference != null) {
      builder.append(", ");
      builder.append("subjectReference=").append(subjectReference);
    }
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (usage != null) {
      builder.append(", ");
      builder.append("usage=").append(usage);
    }
    if (subjectCodeableConcept != null) {
      builder.append(", ");
      builder.append("subjectCodeableConcept=").append(subjectCodeableConcept);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (lastReviewDate != null) {
      builder.append(", ");
      builder.append("lastReviewDate=").append(lastReviewDate);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (approvalDate != null) {
      builder.append(", ");
      builder.append("approvalDate=").append(approvalDate);
    }
    if (purpose != null) {
      builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (relatedArtifact != null) {
      builder.append(", ");
      builder.append("relatedArtifact=").append(relatedArtifact);
    }
    if (subtitle != null) {
      builder.append(", ");
      builder.append("subtitle=").append(subtitle);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (topic != null) {
      builder.append(", ");
      builder.append("topic=").append(topic);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (endorser != null) {
      builder.append(", ");
      builder.append("endorser=").append(endorser);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (goal != null) {
      builder.append(", ");
      builder.append("goal=").append(goal);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "PlanDefinition", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.PlanDefinition {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> effectivePeriod = java.util.Optional.empty();
    boolean effectivePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer = java.util.Optional.empty();
    boolean reviewerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> library = java.util.Optional.empty();
    boolean libraryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor = java.util.Optional.empty();
    boolean editorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> author = java.util.Optional.empty();
    boolean authorIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.PlanDefinition_Action>> action = java.util.Optional.empty();
    boolean actionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subjectReference = java.util.Optional.empty();
    boolean subjectReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> usage = java.util.Optional.empty();
    boolean usageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> subjectCodeableConcept = java.util.Optional.empty();
    boolean subjectCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> lastReviewDate = java.util.Optional.empty();
    boolean lastReviewDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.PlandefinitionStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> approvalDate = java.util.Optional.empty();
    boolean approvalDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> purpose = java.util.Optional.empty();
    boolean purposeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact = java.util.Optional.empty();
    boolean relatedArtifactIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> subtitle = java.util.Optional.empty();
    boolean subtitleIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic = java.util.Optional.empty();
    boolean topicIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> copyright = java.util.Optional.empty();
    boolean copyrightIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser = java.util.Optional.empty();
    boolean endorserIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> experimental = java.util.Optional.empty();
    boolean experimentalIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.PlanDefinition_Goal>> goal = java.util.Optional.empty();
    boolean goalIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
    public void setEffectivePeriod(java.util.Optional<com.fhir.Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reviewer")
    public void setReviewer(java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer) {
      this.reviewer = reviewer;
      this.reviewerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("library")
    public void setLibrary(java.util.Optional<java.util.List<com.fhir.canonical>> library) {
      this.library = library;
      this.libraryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("editor")
    public void setEditor(java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor) {
      this.editor = editor;
      this.editorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public void setAuthor(java.util.Optional<java.util.List<com.fhir.ContactDetail>> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    public void setAction(java.util.Optional<java.util.List<com.fhir.PlanDefinition_Action>> action) {
      this.action = action;
      this.actionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subjectReference")
    public void setSubjectReference(java.util.Optional<com.fhir.Reference> subjectReference) {
      this.subjectReference = subjectReference;
      this.subjectReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    public void setUsage(java.util.Optional<java.lang.String> usage) {
      this.usage = usage;
      this.usageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subjectCodeableConcept")
    public void setSubjectCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> subjectCodeableConcept) {
      this.subjectCodeableConcept = subjectCodeableConcept;
      this.subjectCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lastReviewDate")
    public void setLastReviewDate(java.util.Optional<com.fhir.date> lastReviewDate) {
      this.lastReviewDate = lastReviewDate;
      this.lastReviewDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.PlandefinitionStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public void setUseContext(java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("approvalDate")
    public void setApprovalDate(java.util.Optional<com.fhir.date> approvalDate) {
      this.approvalDate = approvalDate;
      this.approvalDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    public void setPurpose(java.util.Optional<com.fhir.markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("topic")
    public void setTopic(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic) {
      this.topic = topic;
      this.topicIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("copyright")
    public void setCopyright(java.util.Optional<com.fhir.markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("endorser")
    public void setEndorser(java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser) {
      this.endorser = endorser;
      this.endorserIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public void setPublisher(java.util.Optional<java.lang.String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("experimental")
    public void setExperimental(java.util.Optional<java.lang.Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("goal")
    public void setGoal(java.util.Optional<java.util.List<com.fhir.PlanDefinition_Goal>> goal) {
      this.goal = goal;
      this.goalIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> library() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> author() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.PlanDefinition_Action>> action() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subjectReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> usage() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> subjectCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> lastReviewDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.PlandefinitionStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> approvalDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> subtitle() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.PlanDefinition_Goal>> goal() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutablePlanDefinition fromJson(Json json) {
    ImmutablePlanDefinition.Builder builder = ((ImmutablePlanDefinition.Builder) ImmutablePlanDefinition.builder());
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.reviewerIsSet) {
      builder.reviewer(json.reviewer);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.libraryIsSet) {
      builder.library(json.library);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.editorIsSet) {
      builder.editor(json.editor);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.actionIsSet) {
      builder.action(json.action);
    }
    if (json.subjectReferenceIsSet) {
      builder.subjectReference(json.subjectReference);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.usageIsSet) {
      builder.usage(json.usage);
    }
    if (json.subjectCodeableConceptIsSet) {
      builder.subjectCodeableConcept(json.subjectCodeableConcept);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.lastReviewDateIsSet) {
      builder.lastReviewDate(json.lastReviewDate);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.approvalDateIsSet) {
      builder.approvalDate(json.approvalDate);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.relatedArtifactIsSet) {
      builder.relatedArtifact(json.relatedArtifact);
    }
    if (json.subtitleIsSet) {
      builder.subtitle(json.subtitle);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.topicIsSet) {
      builder.topic(json.topic);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.endorserIsSet) {
      builder.endorser(json.endorser);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.goalIsSet) {
      builder.goal(json.goal);
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
        .effectivePeriod(instance.effectivePeriod())
        .reviewer(instance.reviewer())
        .type(instance.type())
        .library(instance.library())
        .version(instance.version())
        .editor(instance.editor())
        .author(instance.author())
        .resourceType(instance.resourceType())
        .action(instance.action())
        .subjectReference(instance.subjectReference())
        .jurisdiction(instance.jurisdiction())
        .identifier(instance.identifier())
        .usage(instance.usage())
        .subjectCodeableConcept(instance.subjectCodeableConcept())
        .date(instance.date())
        .lastReviewDate(instance.lastReviewDate())
        .status(instance.status())
        .language(instance.language())
        .useContext(instance.useContext())
        .description(instance.description())
        .contained(instance.contained())
        .text(instance.text())
        .title(instance.title())
        .url(instance.url())
        .approvalDate(instance.approvalDate())
        .purpose(instance.purpose())
        .modifierExtension(instance.modifierExtension())
        .relatedArtifact(instance.relatedArtifact())
        .subtitle(instance.subtitle())
        .implicitRules(instance.implicitRules())
        .topic(instance.topic())
        .meta(instance.meta())
        .copyright(instance.copyright())
        .id(instance.id())
        .contact(instance.contact())
        .endorser(instance.endorser())
        .name(instance.name())
        .publisher(instance.publisher())
        .experimental(instance.experimental())
        .extension(instance.extension())
        .goal(instance.goal())
        .build();
  }

  /**
   * Creates a builder for {@link PlanDefinition PlanDefinition}.
   * <pre>
   * ImmutablePlanDefinition.builder()
   *    .effectivePeriod(com.fhir.Period) // optional {@link PlanDefinition#effectivePeriod() effectivePeriod}
   *    .reviewer(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link PlanDefinition#reviewer() reviewer}
   *    .type(com.fhir.CodeableConcept) // optional {@link PlanDefinition#type() type}
   *    .library(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link PlanDefinition#library() library}
   *    .version(String) // optional {@link PlanDefinition#version() version}
   *    .editor(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link PlanDefinition#editor() editor}
   *    .author(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link PlanDefinition#author() author}
   *    .resourceType(String) // required {@link PlanDefinition#resourceType() resourceType}
   *    .action(List&amp;lt;com.fhir.PlanDefinition_Action&amp;gt;) // optional {@link PlanDefinition#action() action}
   *    .subjectReference(com.fhir.Reference) // optional {@link PlanDefinition#subjectReference() subjectReference}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link PlanDefinition#jurisdiction() jurisdiction}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link PlanDefinition#identifier() identifier}
   *    .usage(String) // optional {@link PlanDefinition#usage() usage}
   *    .subjectCodeableConcept(com.fhir.CodeableConcept) // optional {@link PlanDefinition#subjectCodeableConcept() subjectCodeableConcept}
   *    .date(com.fhir.dateTime) // optional {@link PlanDefinition#date() date}
   *    .lastReviewDate(com.fhir.date) // optional {@link PlanDefinition#lastReviewDate() lastReviewDate}
   *    .status(com.fhir.PlandefinitionStatus) // optional {@link PlanDefinition#status() status}
   *    .language(com.fhir.code) // optional {@link PlanDefinition#language() language}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link PlanDefinition#useContext() useContext}
   *    .description(com.fhir.markdown) // optional {@link PlanDefinition#description() description}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link PlanDefinition#contained() contained}
   *    .text(com.fhir.Narrative) // optional {@link PlanDefinition#text() text}
   *    .title(String) // optional {@link PlanDefinition#title() title}
   *    .url(com.fhir.uri) // optional {@link PlanDefinition#url() url}
   *    .approvalDate(com.fhir.date) // optional {@link PlanDefinition#approvalDate() approvalDate}
   *    .purpose(com.fhir.markdown) // optional {@link PlanDefinition#purpose() purpose}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link PlanDefinition#modifierExtension() modifierExtension}
   *    .relatedArtifact(List&amp;lt;com.fhir.RelatedArtifact&amp;gt;) // optional {@link PlanDefinition#relatedArtifact() relatedArtifact}
   *    .subtitle(String) // optional {@link PlanDefinition#subtitle() subtitle}
   *    .implicitRules(com.fhir.uri) // optional {@link PlanDefinition#implicitRules() implicitRules}
   *    .topic(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link PlanDefinition#topic() topic}
   *    .meta(com.fhir.Meta) // optional {@link PlanDefinition#meta() meta}
   *    .copyright(com.fhir.markdown) // optional {@link PlanDefinition#copyright() copyright}
   *    .id(com.fhir.id) // optional {@link PlanDefinition#id() id}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link PlanDefinition#contact() contact}
   *    .endorser(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link PlanDefinition#endorser() endorser}
   *    .name(String) // optional {@link PlanDefinition#name() name}
   *    .publisher(String) // optional {@link PlanDefinition#publisher() publisher}
   *    .experimental(Boolean) // optional {@link PlanDefinition#experimental() experimental}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link PlanDefinition#extension() extension}
   *    .goal(List&amp;lt;com.fhir.PlanDefinition_Goal&amp;gt;) // optional {@link PlanDefinition#goal() goal}
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
  @org.immutables.value.Generated(from = "PlanDefinition", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x1L;
    private static final long OPT_BIT_REVIEWER = 0x2L;
    private static final long OPT_BIT_TYPE = 0x4L;
    private static final long OPT_BIT_LIBRARY = 0x8L;
    private static final long OPT_BIT_VERSION = 0x10L;
    private static final long OPT_BIT_EDITOR = 0x20L;
    private static final long OPT_BIT_AUTHOR = 0x40L;
    private static final long OPT_BIT_ACTION = 0x80L;
    private static final long OPT_BIT_SUBJECT_REFERENCE = 0x100L;
    private static final long OPT_BIT_JURISDICTION = 0x200L;
    private static final long OPT_BIT_IDENTIFIER = 0x400L;
    private static final long OPT_BIT_USAGE = 0x800L;
    private static final long OPT_BIT_SUBJECT_CODEABLE_CONCEPT = 0x1000L;
    private static final long OPT_BIT_DATE = 0x2000L;
    private static final long OPT_BIT_LAST_REVIEW_DATE = 0x4000L;
    private static final long OPT_BIT_STATUS = 0x8000L;
    private static final long OPT_BIT_LANGUAGE = 0x10000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x20000L;
    private static final long OPT_BIT_DESCRIPTION = 0x40000L;
    private static final long OPT_BIT_CONTAINED = 0x80000L;
    private static final long OPT_BIT_TEXT = 0x100000L;
    private static final long OPT_BIT_TITLE = 0x200000L;
    private static final long OPT_BIT_URL = 0x400000L;
    private static final long OPT_BIT_APPROVAL_DATE = 0x800000L;
    private static final long OPT_BIT_PURPOSE = 0x1000000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2000000L;
    private static final long OPT_BIT_RELATED_ARTIFACT = 0x4000000L;
    private static final long OPT_BIT_SUBTITLE = 0x8000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10000000L;
    private static final long OPT_BIT_TOPIC = 0x20000000L;
    private static final long OPT_BIT_META = 0x40000000L;
    private static final long OPT_BIT_COPYRIGHT = 0x80000000L;
    private static final long OPT_BIT_ID = 0x100000000L;
    private static final long OPT_BIT_CONTACT = 0x200000000L;
    private static final long OPT_BIT_ENDORSER = 0x400000000L;
    private static final long OPT_BIT_NAME = 0x800000000L;
    private static final long OPT_BIT_PUBLISHER = 0x1000000000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x2000000000L;
    private static final long OPT_BIT_EXTENSION = 0x4000000000L;
    private static final long OPT_BIT_GOAL = 0x8000000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Period effectivePeriod;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> library;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Action> action;
    private @javax.annotation.Nullable com.fhir.Reference subjectReference;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.lang.String usage;
    private @javax.annotation.Nullable com.fhir.CodeableConcept subjectCodeableConcept;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable com.fhir.date lastReviewDate;
    private @javax.annotation.Nullable com.fhir.PlandefinitionStatus status;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable com.fhir.date approvalDate;
    private @javax.annotation.Nullable com.fhir.markdown purpose;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact;
    private @javax.annotation.Nullable java.lang.String subtitle;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.markdown copyright;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable java.lang.Boolean experimental;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.PlanDefinition_Goal> goal;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link PlanDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link PlanDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link PlanDefinition#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link PlanDefinition#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link PlanDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition#library() library} to library.
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
     * Initializes the optional value {@link PlanDefinition#library() library} to library.
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
     * Initializes the optional value {@link PlanDefinition#version() version} to version.
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
     * Initializes the optional value {@link PlanDefinition#version() version} to version.
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
     * Initializes the optional value {@link PlanDefinition#editor() editor} to editor.
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
     * Initializes the optional value {@link PlanDefinition#editor() editor} to editor.
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
     * Initializes the optional value {@link PlanDefinition#author() author} to author.
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
     * Initializes the optional value {@link PlanDefinition#author() author} to author.
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
     * Initializes the value for the {@link PlanDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link PlanDefinition#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for chained invocation
     */
    public final Builder action(java.util.List<com.fhir.PlanDefinition_Action> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = java.util.Objects.requireNonNull(action, "action");
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    public final Builder action(java.util.Optional<? extends java.util.List<com.fhir.PlanDefinition_Action>> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = action.orElse(null);
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition#subjectReference() subjectReference} to subjectReference.
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
     * Initializes the optional value {@link PlanDefinition#subjectReference() subjectReference} to subjectReference.
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
     * Initializes the optional value {@link PlanDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link PlanDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link PlanDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link PlanDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link PlanDefinition#usage() usage} to usage.
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
     * Initializes the optional value {@link PlanDefinition#usage() usage} to usage.
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
     * Initializes the optional value {@link PlanDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
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
     * Initializes the optional value {@link PlanDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
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
     * Initializes the optional value {@link PlanDefinition#date() date} to date.
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
     * Initializes the optional value {@link PlanDefinition#date() date} to date.
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
     * Initializes the optional value {@link PlanDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link PlanDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link PlanDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.PlandefinitionStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.PlandefinitionStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition#language() language} to language.
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
     * Initializes the optional value {@link PlanDefinition#language() language} to language.
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
     * Initializes the optional value {@link PlanDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link PlanDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link PlanDefinition#description() description} to description.
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
     * Initializes the optional value {@link PlanDefinition#description() description} to description.
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
     * Initializes the optional value {@link PlanDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link PlanDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link PlanDefinition#text() text} to text.
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
     * Initializes the optional value {@link PlanDefinition#text() text} to text.
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
     * Initializes the optional value {@link PlanDefinition#title() title} to title.
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
     * Initializes the optional value {@link PlanDefinition#title() title} to title.
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
     * Initializes the optional value {@link PlanDefinition#url() url} to url.
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
     * Initializes the optional value {@link PlanDefinition#url() url} to url.
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
     * Initializes the optional value {@link PlanDefinition#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link PlanDefinition#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link PlanDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link PlanDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link PlanDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PlanDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link PlanDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link PlanDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link PlanDefinition#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link PlanDefinition#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link PlanDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link PlanDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link PlanDefinition#topic() topic} to topic.
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
     * Initializes the optional value {@link PlanDefinition#topic() topic} to topic.
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
     * Initializes the optional value {@link PlanDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link PlanDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link PlanDefinition#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link PlanDefinition#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link PlanDefinition#id() id} to id.
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
     * Initializes the optional value {@link PlanDefinition#id() id} to id.
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
     * Initializes the optional value {@link PlanDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link PlanDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link PlanDefinition#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link PlanDefinition#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link PlanDefinition#name() name} to name.
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
     * Initializes the optional value {@link PlanDefinition#name() name} to name.
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
     * Initializes the optional value {@link PlanDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link PlanDefinition#publisher() publisher} to publisher.
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
    @com.fasterxml.jackson.annotation.JsonProperty("experimental")
    public final Builder experimental(java.util.Optional<java.lang.Boolean> experimental) {
      checkNotIsSet(experimentalIsSet(), "experimental");
      this.experimental = experimental.orElse(null);
      optBits |= OPT_BIT_EXPERIMENTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link PlanDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link PlanDefinition#goal() goal} to goal.
     * @param goal The value for goal
     * @return {@code this} builder for chained invocation
     */
    public final Builder goal(java.util.List<com.fhir.PlanDefinition_Goal> goal) {
      checkNotIsSet(goalIsSet(), "goal");
      this.goal = java.util.Objects.requireNonNull(goal, "goal");
      optBits |= OPT_BIT_GOAL;
      return this;
    }

    /**
     * Initializes the optional value {@link PlanDefinition#goal() goal} to goal.
     * @param goal The value for goal
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("goal")
    public final Builder goal(java.util.Optional<? extends java.util.List<com.fhir.PlanDefinition_Goal>> goal) {
      checkNotIsSet(goalIsSet(), "goal");
      this.goal = goal.orElse(null);
      optBits |= OPT_BIT_GOAL;
      return this;
    }

    /**
     * Builds a new {@link PlanDefinition PlanDefinition}.
     * @return An immutable instance of PlanDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.PlanDefinition build() {
      checkRequiredAttributes();
      return new ImmutablePlanDefinition(
          effectivePeriod,
          reviewer,
          type,
          library,
          version,
          editor,
          author,
          resourceType,
          action,
          subjectReference,
          jurisdiction,
          identifier,
          usage,
          subjectCodeableConcept,
          date,
          lastReviewDate,
          status,
          language,
          useContext,
          description,
          contained,
          text,
          title,
          url,
          approvalDate,
          purpose,
          modifierExtension,
          relatedArtifact,
          subtitle,
          implicitRules,
          topic,
          meta,
          copyright,
          id,
          contact,
          endorser,
          name,
          publisher,
          experimental,
          extension,
          goal);
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean reviewerIsSet() {
      return (optBits & OPT_BIT_REVIEWER) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean libraryIsSet() {
      return (optBits & OPT_BIT_LIBRARY) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean editorIsSet() {
      return (optBits & OPT_BIT_EDITOR) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean actionIsSet() {
      return (optBits & OPT_BIT_ACTION) != 0;
    }

    private boolean subjectReferenceIsSet() {
      return (optBits & OPT_BIT_SUBJECT_REFERENCE) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean usageIsSet() {
      return (optBits & OPT_BIT_USAGE) != 0;
    }

    private boolean subjectCodeableConceptIsSet() {
      return (optBits & OPT_BIT_SUBJECT_CODEABLE_CONCEPT) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean lastReviewDateIsSet() {
      return (optBits & OPT_BIT_LAST_REVIEW_DATE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean approvalDateIsSet() {
      return (optBits & OPT_BIT_APPROVAL_DATE) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean relatedArtifactIsSet() {
      return (optBits & OPT_BIT_RELATED_ARTIFACT) != 0;
    }

    private boolean subtitleIsSet() {
      return (optBits & OPT_BIT_SUBTITLE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean topicIsSet() {
      return (optBits & OPT_BIT_TOPIC) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean endorserIsSet() {
      return (optBits & OPT_BIT_ENDORSER) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean goalIsSet() {
      return (optBits & OPT_BIT_GOAL) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of PlanDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build PlanDefinition, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "PlanDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link PlanDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "PlanDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link PlanDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(com.fhir.Period effectivePeriod);

    /**
     * Initializes the optional value {@link PlanDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(java.util.Optional<? extends com.fhir.Period> effectivePeriod);

    /**
     * Initializes the optional value {@link PlanDefinition#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reviewer(java.util.List<com.fhir.ContactDetail> reviewer);

    /**
     * Initializes the optional value {@link PlanDefinition#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reviewer(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> reviewer);

    /**
     * Initializes the optional value {@link PlanDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);

    /**
     * Initializes the optional value {@link PlanDefinition#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link PlanDefinition#library() library} to library.
     * @param library The value for library
     * @return {@code this} builder for chained invocation
     */
    BuildFinal library(java.util.List<com.fhir.canonical> library);

    /**
     * Initializes the optional value {@link PlanDefinition#library() library} to library.
     * @param library The value for library
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal library(java.util.Optional<? extends java.util.List<com.fhir.canonical>> library);

    /**
     * Initializes the optional value {@link PlanDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link PlanDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link PlanDefinition#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal editor(java.util.List<com.fhir.ContactDetail> editor);

    /**
     * Initializes the optional value {@link PlanDefinition#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal editor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> editor);

    /**
     * Initializes the optional value {@link PlanDefinition#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(java.util.List<com.fhir.ContactDetail> author);

    /**
     * Initializes the optional value {@link PlanDefinition#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> author);

    /**
     * Initializes the optional value {@link PlanDefinition#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for chained invocation
     */
    BuildFinal action(java.util.List<com.fhir.PlanDefinition_Action> action);

    /**
     * Initializes the optional value {@link PlanDefinition#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal action(java.util.Optional<? extends java.util.List<com.fhir.PlanDefinition_Action>> action);

    /**
     * Initializes the optional value {@link PlanDefinition#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subjectReference(com.fhir.Reference subjectReference);

    /**
     * Initializes the optional value {@link PlanDefinition#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subjectReference(java.util.Optional<? extends com.fhir.Reference> subjectReference);

    /**
     * Initializes the optional value {@link PlanDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link PlanDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link PlanDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link PlanDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link PlanDefinition#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal usage(java.lang.String usage);

    /**
     * Initializes the optional value {@link PlanDefinition#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal usage(java.util.Optional<java.lang.String> usage);

    /**
     * Initializes the optional value {@link PlanDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subjectCodeableConcept(com.fhir.CodeableConcept subjectCodeableConcept);

    /**
     * Initializes the optional value {@link PlanDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subjectCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> subjectCodeableConcept);

    /**
     * Initializes the optional value {@link PlanDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link PlanDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link PlanDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastReviewDate(com.fhir.date lastReviewDate);

    /**
     * Initializes the optional value {@link PlanDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastReviewDate(java.util.Optional<? extends com.fhir.date> lastReviewDate);

    /**
     * Initializes the optional value {@link PlanDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.PlandefinitionStatus status);

    /**
     * Initializes the optional value {@link PlanDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.PlandefinitionStatus> status);

    /**
     * Initializes the optional value {@link PlanDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link PlanDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link PlanDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link PlanDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link PlanDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link PlanDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link PlanDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link PlanDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link PlanDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link PlanDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link PlanDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link PlanDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link PlanDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link PlanDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link PlanDefinition#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal approvalDate(com.fhir.date approvalDate);

    /**
     * Initializes the optional value {@link PlanDefinition#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal approvalDate(java.util.Optional<? extends com.fhir.date> approvalDate);

    /**
     * Initializes the optional value {@link PlanDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(com.fhir.markdown purpose);

    /**
     * Initializes the optional value {@link PlanDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(java.util.Optional<? extends com.fhir.markdown> purpose);

    /**
     * Initializes the optional value {@link PlanDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link PlanDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link PlanDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatedArtifact(java.util.List<com.fhir.RelatedArtifact> relatedArtifact);

    /**
     * Initializes the optional value {@link PlanDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatedArtifact(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> relatedArtifact);

    /**
     * Initializes the optional value {@link PlanDefinition#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subtitle(java.lang.String subtitle);

    /**
     * Initializes the optional value {@link PlanDefinition#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subtitle(java.util.Optional<java.lang.String> subtitle);

    /**
     * Initializes the optional value {@link PlanDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link PlanDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link PlanDefinition#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topic(java.util.List<com.fhir.CodeableConcept> topic);

    /**
     * Initializes the optional value {@link PlanDefinition#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> topic);

    /**
     * Initializes the optional value {@link PlanDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link PlanDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link PlanDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(com.fhir.markdown copyright);

    /**
     * Initializes the optional value {@link PlanDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(java.util.Optional<? extends com.fhir.markdown> copyright);

    /**
     * Initializes the optional value {@link PlanDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link PlanDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link PlanDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link PlanDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link PlanDefinition#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endorser(java.util.List<com.fhir.ContactDetail> endorser);

    /**
     * Initializes the optional value {@link PlanDefinition#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endorser(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> endorser);

    /**
     * Initializes the optional value {@link PlanDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link PlanDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link PlanDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link PlanDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

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
    BuildFinal experimental(java.util.Optional<java.lang.Boolean> experimental);

    /**
     * Initializes the optional value {@link PlanDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link PlanDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link PlanDefinition#goal() goal} to goal.
     * @param goal The value for goal
     * @return {@code this} builder for chained invocation
     */
    BuildFinal goal(java.util.List<com.fhir.PlanDefinition_Goal> goal);

    /**
     * Initializes the optional value {@link PlanDefinition#goal() goal} to goal.
     * @param goal The value for goal
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal goal(java.util.Optional<? extends java.util.List<com.fhir.PlanDefinition_Goal>> goal);

    /**
     * Builds a new {@link PlanDefinition PlanDefinition}.
     * @return An immutable instance of PlanDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    PlanDefinition build();
  }
}
