//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Evidence}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEvidence.builder()}.
 */
@org.immutables.value.Generated(from = "Evidence", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEvidence implements com.fhir.Evidence {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.date lastReviewDate;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.markdown copyright;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author;
  private final @javax.annotation.Nullable com.fhir.Period effectivePeriod;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> exposureVariant;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String shortTitle;
  private final @javax.annotation.Nullable com.fhir.date approvalDate;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic;
  private final @javax.annotation.Nullable com.fhir.EvidenceStatus status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.lang.String subtitle;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> outcome;
  private final @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact;
  private final com.fhir.Reference exposureBackground;
  private final @javax.annotation.Nullable com.fhir.code language;

  private ImmutableEvidence(
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.date lastReviewDate,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.markdown copyright,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author,
      @javax.annotation.Nullable com.fhir.Period effectivePeriod,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> exposureVariant,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String shortTitle,
      @javax.annotation.Nullable com.fhir.date approvalDate,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic,
      @javax.annotation.Nullable com.fhir.EvidenceStatus status,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.lang.String subtitle,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> outcome,
      @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact,
      com.fhir.Reference exposureBackground,
      @javax.annotation.Nullable com.fhir.code language) {
    this.identifier = identifier;
    this.id = id;
    this.lastReviewDate = lastReviewDate;
    this.implicitRules = implicitRules;
    this.copyright = copyright;
    this.name = name;
    this.date = date;
    this.jurisdiction = jurisdiction;
    this.author = author;
    this.effectivePeriod = effectivePeriod;
    this.useContext = useContext;
    this.text = text;
    this.editor = editor;
    this.resourceType = resourceType;
    this.title = title;
    this.publisher = publisher;
    this.exposureVariant = exposureVariant;
    this.extension = extension;
    this.shortTitle = shortTitle;
    this.approvalDate = approvalDate;
    this.version = version;
    this.modifierExtension = modifierExtension;
    this.description = description;
    this.url = url;
    this.contact = contact;
    this.endorser = endorser;
    this.contained = contained;
    this.topic = topic;
    this.status = status;
    this.reviewer = reviewer;
    this.meta = meta;
    this.subtitle = subtitle;
    this.note = note;
    this.outcome = outcome;
    this.relatedArtifact = relatedArtifact;
    this.exposureBackground = exposureBackground;
    this.language = language;
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() {
    return java.util.Optional.ofNullable(jurisdiction);
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
   * @return The value of the {@code effectivePeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
  @Override
  public java.util.Optional<com.fhir.Period> effectivePeriod() {
    return java.util.Optional.ofNullable(effectivePeriod);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
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
   * @return The value of the {@code publisher} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("publisher")
  @Override
  public java.util.Optional<java.lang.String> publisher() {
    return java.util.Optional.ofNullable(publisher);
  }

  /**
   * @return The value of the {@code exposureVariant} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("exposureVariant")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> exposureVariant() {
    return java.util.Optional.ofNullable(exposureVariant);
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
   * @return The value of the {@code shortTitle} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("shortTitle")
  @Override
  public java.util.Optional<java.lang.String> shortTitle() {
    return java.util.Optional.ofNullable(shortTitle);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code url} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @Override
  public java.util.Optional<com.fhir.uri> url() {
    return java.util.Optional.ofNullable(url);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.EvidenceStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
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
   * @return The value of the {@code note} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("note")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Annotation>> note() {
    return java.util.Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code outcome} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("outcome")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> outcome() {
    return java.util.Optional.ofNullable(outcome);
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
   * @return The value of the {@code exposureBackground} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("exposureBackground")
  @Override
  public com.fhir.Reference exposureBackground() {
    return exposureBackground;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableEvidence(
        newValue,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableEvidence(
        value,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        newValue,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        value,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#lastReviewDate() lastReviewDate} attribute.
   * @param value The value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withLastReviewDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "lastReviewDate");
    if (this.lastReviewDate == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        newValue,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#lastReviewDate() lastReviewDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withLastReviewDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.lastReviewDate == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        value,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        newValue,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        value,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withCopyright(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        newValue,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withCopyright(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        value,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        newValue,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        value,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        newValue,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        value,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        newValue,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        value,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withAuthor(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        newValue,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withAuthor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        value,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withEffectivePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        newValue,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withEffectivePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        value,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        newValue,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        value,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        newValue,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        value,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#editor() editor} attribute.
   * @param value The value for editor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withEditor(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "editor");
    if (this.editor == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        newValue,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#editor() editor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for editor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withEditor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.editor == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        value,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Evidence#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEvidence withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        newValue,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        newValue,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        value,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        newValue,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        value,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#exposureVariant() exposureVariant} attribute.
   * @param value The value for exposureVariant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withExposureVariant(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "exposureVariant");
    if (this.exposureVariant == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        newValue,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#exposureVariant() exposureVariant} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exposureVariant
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withExposureVariant(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.exposureVariant == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        value,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        newValue,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        value,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#shortTitle() shortTitle} attribute.
   * @param value The value for shortTitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withShortTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "shortTitle");
    if (java.util.Objects.equals(this.shortTitle, newValue)) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        newValue,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#shortTitle() shortTitle} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for shortTitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withShortTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.shortTitle, value)) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        value,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#approvalDate() approvalDate} attribute.
   * @param value The value for approvalDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withApprovalDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "approvalDate");
    if (this.approvalDate == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        newValue,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#approvalDate() approvalDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for approvalDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withApprovalDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.approvalDate == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        value,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        newValue,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        value,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        newValue,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        value,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        newValue,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        value,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        newValue,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        value,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        newValue,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        value,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#endorser() endorser} attribute.
   * @param value The value for endorser
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withEndorser(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "endorser");
    if (this.endorser == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        newValue,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#endorser() endorser} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endorser
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withEndorser(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.endorser == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        value,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        newValue,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        value,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#topic() topic} attribute.
   * @param value The value for topic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withTopic(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "topic");
    if (this.topic == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        newValue,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#topic() topic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withTopic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.topic == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        value,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withStatus(com.fhir.EvidenceStatus value) {
    @javax.annotation.Nullable com.fhir.EvidenceStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        newValue,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withStatus(java.util.Optional<? extends com.fhir.EvidenceStatus> optional) {
    @javax.annotation.Nullable com.fhir.EvidenceStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        value,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#reviewer() reviewer} attribute.
   * @param value The value for reviewer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withReviewer(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "reviewer");
    if (this.reviewer == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        newValue,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#reviewer() reviewer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reviewer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withReviewer(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.reviewer == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        value,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        newValue,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        value,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#subtitle() subtitle} attribute.
   * @param value The value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withSubtitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "subtitle");
    if (java.util.Objects.equals(this.subtitle, newValue)) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        newValue,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#subtitle() subtitle} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withSubtitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.subtitle, value)) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        value,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        newValue,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        value,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withOutcome(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        newValue,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withOutcome(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        value,
        this.relatedArtifact,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#relatedArtifact() relatedArtifact} attribute.
   * @param value The value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withRelatedArtifact(java.util.List<com.fhir.RelatedArtifact> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> newValue = java.util.Objects.requireNonNull(value, "relatedArtifact");
    if (this.relatedArtifact == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        newValue,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#relatedArtifact() relatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withRelatedArtifact(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> value = optional.orElse(null);
    if (this.relatedArtifact == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        value,
        this.exposureBackground,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Evidence#exposureBackground() exposureBackground} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for exposureBackground
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEvidence withExposureBackground(com.fhir.Reference value) {
    if (this.exposureBackground == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "exposureBackground");
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        newValue,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableEvidence(
        this.identifier,
        this.id,
        this.lastReviewDate,
        this.implicitRules,
        this.copyright,
        this.name,
        this.date,
        this.jurisdiction,
        this.author,
        this.effectivePeriod,
        this.useContext,
        this.text,
        this.editor,
        this.resourceType,
        this.title,
        this.publisher,
        this.exposureVariant,
        this.extension,
        this.shortTitle,
        this.approvalDate,
        this.version,
        this.modifierExtension,
        this.description,
        this.url,
        this.contact,
        this.endorser,
        this.contained,
        this.topic,
        this.status,
        this.reviewer,
        this.meta,
        this.subtitle,
        this.note,
        this.outcome,
        this.relatedArtifact,
        this.exposureBackground,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEvidence} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEvidence
        && equalTo((ImmutableEvidence) another);
  }

  private boolean equalTo(ImmutableEvidence another) {
    return java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(lastReviewDate, another.lastReviewDate)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(copyright, another.copyright)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(author, another.author)
        && java.util.Objects.equals(effectivePeriod, another.effectivePeriod)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(editor, another.editor)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(exposureVariant, another.exposureVariant)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(shortTitle, another.shortTitle)
        && java.util.Objects.equals(approvalDate, another.approvalDate)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(endorser, another.endorser)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(topic, another.topic)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(reviewer, another.reviewer)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(subtitle, another.subtitle)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(outcome, another.outcome)
        && java.util.Objects.equals(relatedArtifact, another.relatedArtifact)
        && exposureBackground.equals(another.exposureBackground)
        && java.util.Objects.equals(language, another.language);
  }

  /**
   * Computes a hash code from attributes: {@code identifier}, {@code id}, {@code lastReviewDate}, {@code implicitRules}, {@code copyright}, {@code name}, {@code date}, {@code jurisdiction}, {@code author}, {@code effectivePeriod}, {@code useContext}, {@code text}, {@code editor}, {@code resourceType}, {@code title}, {@code publisher}, {@code exposureVariant}, {@code extension}, {@code shortTitle}, {@code approvalDate}, {@code version}, {@code modifierExtension}, {@code description}, {@code url}, {@code contact}, {@code endorser}, {@code contained}, {@code topic}, {@code status}, {@code reviewer}, {@code meta}, {@code subtitle}, {@code note}, {@code outcome}, {@code relatedArtifact}, {@code exposureBackground}, {@code language}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(lastReviewDate);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(copyright);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(author);
    h += (h << 5) + java.util.Objects.hashCode(effectivePeriod);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(editor);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(exposureVariant);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(shortTitle);
    h += (h << 5) + java.util.Objects.hashCode(approvalDate);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(endorser);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(topic);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(reviewer);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(subtitle);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(outcome);
    h += (h << 5) + java.util.Objects.hashCode(relatedArtifact);
    h += (h << 5) + exposureBackground.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(language);
    return h;
  }

  /**
   * Prints the immutable value {@code Evidence} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Evidence{");
    if (identifier != null) {
      builder.append("identifier=").append(identifier);
    }
    if (id != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (lastReviewDate != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("lastReviewDate=").append(lastReviewDate);
    }
    if (implicitRules != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (copyright != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (name != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (date != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (jurisdiction != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (author != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("author=").append(author);
    }
    if (effectivePeriod != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (useContext != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (text != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (editor != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("editor=").append(editor);
    }
    if (builder.length() > 9) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (exposureVariant != null) {
      builder.append(", ");
      builder.append("exposureVariant=").append(exposureVariant);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (shortTitle != null) {
      builder.append(", ");
      builder.append("shortTitle=").append(shortTitle);
    }
    if (approvalDate != null) {
      builder.append(", ");
      builder.append("approvalDate=").append(approvalDate);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (endorser != null) {
      builder.append(", ");
      builder.append("endorser=").append(endorser);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (topic != null) {
      builder.append(", ");
      builder.append("topic=").append(topic);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (reviewer != null) {
      builder.append(", ");
      builder.append("reviewer=").append(reviewer);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (subtitle != null) {
      builder.append(", ");
      builder.append("subtitle=").append(subtitle);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (outcome != null) {
      builder.append(", ");
      builder.append("outcome=").append(outcome);
    }
    if (relatedArtifact != null) {
      builder.append(", ");
      builder.append("relatedArtifact=").append(relatedArtifact);
    }
    builder.append(", ");
    builder.append("exposureBackground=").append(exposureBackground);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Evidence", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Evidence {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> lastReviewDate = java.util.Optional.empty();
    boolean lastReviewDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> copyright = java.util.Optional.empty();
    boolean copyrightIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> author = java.util.Optional.empty();
    boolean authorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> effectivePeriod = java.util.Optional.empty();
    boolean effectivePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor = java.util.Optional.empty();
    boolean editorIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> exposureVariant = java.util.Optional.empty();
    boolean exposureVariantIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> shortTitle = java.util.Optional.empty();
    boolean shortTitleIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> approvalDate = java.util.Optional.empty();
    boolean approvalDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser = java.util.Optional.empty();
    boolean endorserIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic = java.util.Optional.empty();
    boolean topicIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.EvidenceStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer = java.util.Optional.empty();
    boolean reviewerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> subtitle = java.util.Optional.empty();
    boolean subtitleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> outcome = java.util.Optional.empty();
    boolean outcomeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact = java.util.Optional.empty();
    boolean relatedArtifactIsSet;
    @javax.annotation.Nullable com.fhir.Reference exposureBackground;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lastReviewDate")
    public void setLastReviewDate(java.util.Optional<com.fhir.date> lastReviewDate) {
      this.lastReviewDate = lastReviewDate;
      this.lastReviewDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("copyright")
    public void setCopyright(java.util.Optional<com.fhir.markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public void setAuthor(java.util.Optional<java.util.List<com.fhir.ContactDetail>> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
    public void setEffectivePeriod(java.util.Optional<com.fhir.Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public void setUseContext(java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("editor")
    public void setEditor(java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor) {
      this.editor = editor;
      this.editorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public void setPublisher(java.util.Optional<java.lang.String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("exposureVariant")
    public void setExposureVariant(java.util.Optional<java.util.List<com.fhir.Reference>> exposureVariant) {
      this.exposureVariant = exposureVariant;
      this.exposureVariantIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("shortTitle")
    public void setShortTitle(java.util.Optional<java.lang.String> shortTitle) {
      this.shortTitle = shortTitle;
      this.shortTitleIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("topic")
    public void setTopic(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic) {
      this.topic = topic;
      this.topicIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.EvidenceStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reviewer")
    public void setReviewer(java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer) {
      this.reviewer = reviewer;
      this.reviewerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subtitle")
    public void setSubtitle(java.util.Optional<java.lang.String> subtitle) {
      this.subtitle = subtitle;
      this.subtitleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public void setOutcome(java.util.Optional<java.util.List<com.fhir.Reference>> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("relatedArtifact")
    public void setRelatedArtifact(java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact) {
      this.relatedArtifact = relatedArtifact;
      this.relatedArtifactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("exposureBackground")
    public void setExposureBackground(com.fhir.Reference exposureBackground) {
      this.exposureBackground = exposureBackground;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> lastReviewDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> author() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> exposureVariant() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> shortTitle() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> approvalDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.EvidenceStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> subtitle() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference exposureBackground() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableEvidence fromJson(Json json) {
    ImmutableEvidence.Builder builder = ((ImmutableEvidence.Builder) ImmutableEvidence.builder());
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.lastReviewDateIsSet) {
      builder.lastReviewDate(json.lastReviewDate);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.editorIsSet) {
      builder.editor(json.editor);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.exposureVariantIsSet) {
      builder.exposureVariant(json.exposureVariant);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.shortTitleIsSet) {
      builder.shortTitle(json.shortTitle);
    }
    if (json.approvalDateIsSet) {
      builder.approvalDate(json.approvalDate);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.endorserIsSet) {
      builder.endorser(json.endorser);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.topicIsSet) {
      builder.topic(json.topic);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.reviewerIsSet) {
      builder.reviewer(json.reviewer);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.subtitleIsSet) {
      builder.subtitle(json.subtitle);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.relatedArtifactIsSet) {
      builder.relatedArtifact(json.relatedArtifact);
    }
    if (json.exposureBackground != null) {
      builder.exposureBackground(json.exposureBackground);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    return (ImmutableEvidence) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Evidence} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Evidence instance
   */
  public static Evidence copyOf(Evidence instance) {
    if (instance instanceof ImmutableEvidence) {
      return (ImmutableEvidence) instance;
    }
    return ((ImmutableEvidence.Builder) ImmutableEvidence.builder())
        .identifier(instance.identifier())
        .id(instance.id())
        .lastReviewDate(instance.lastReviewDate())
        .implicitRules(instance.implicitRules())
        .copyright(instance.copyright())
        .name(instance.name())
        .date(instance.date())
        .jurisdiction(instance.jurisdiction())
        .author(instance.author())
        .effectivePeriod(instance.effectivePeriod())
        .useContext(instance.useContext())
        .text(instance.text())
        .editor(instance.editor())
        .resourceType(instance.resourceType())
        .title(instance.title())
        .publisher(instance.publisher())
        .exposureVariant(instance.exposureVariant())
        .extension(instance.extension())
        .shortTitle(instance.shortTitle())
        .approvalDate(instance.approvalDate())
        .version(instance.version())
        .modifierExtension(instance.modifierExtension())
        .description(instance.description())
        .url(instance.url())
        .contact(instance.contact())
        .endorser(instance.endorser())
        .contained(instance.contained())
        .topic(instance.topic())
        .status(instance.status())
        .reviewer(instance.reviewer())
        .meta(instance.meta())
        .subtitle(instance.subtitle())
        .note(instance.note())
        .outcome(instance.outcome())
        .relatedArtifact(instance.relatedArtifact())
        .exposureBackground(instance.exposureBackground())
        .language(instance.language())
        .build();
  }

  /**
   * Creates a builder for {@link Evidence Evidence}.
   * <pre>
   * ImmutableEvidence.builder()
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Evidence#identifier() identifier}
   *    .id(com.fhir.id) // optional {@link Evidence#id() id}
   *    .lastReviewDate(com.fhir.date) // optional {@link Evidence#lastReviewDate() lastReviewDate}
   *    .implicitRules(com.fhir.uri) // optional {@link Evidence#implicitRules() implicitRules}
   *    .copyright(com.fhir.markdown) // optional {@link Evidence#copyright() copyright}
   *    .name(String) // optional {@link Evidence#name() name}
   *    .date(com.fhir.dateTime) // optional {@link Evidence#date() date}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Evidence#jurisdiction() jurisdiction}
   *    .author(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link Evidence#author() author}
   *    .effectivePeriod(com.fhir.Period) // optional {@link Evidence#effectivePeriod() effectivePeriod}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link Evidence#useContext() useContext}
   *    .text(com.fhir.Narrative) // optional {@link Evidence#text() text}
   *    .editor(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link Evidence#editor() editor}
   *    .resourceType(String) // required {@link Evidence#resourceType() resourceType}
   *    .title(String) // optional {@link Evidence#title() title}
   *    .publisher(String) // optional {@link Evidence#publisher() publisher}
   *    .exposureVariant(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Evidence#exposureVariant() exposureVariant}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Evidence#extension() extension}
   *    .shortTitle(String) // optional {@link Evidence#shortTitle() shortTitle}
   *    .approvalDate(com.fhir.date) // optional {@link Evidence#approvalDate() approvalDate}
   *    .version(String) // optional {@link Evidence#version() version}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Evidence#modifierExtension() modifierExtension}
   *    .description(com.fhir.markdown) // optional {@link Evidence#description() description}
   *    .url(com.fhir.uri) // optional {@link Evidence#url() url}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link Evidence#contact() contact}
   *    .endorser(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link Evidence#endorser() endorser}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Evidence#contained() contained}
   *    .topic(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Evidence#topic() topic}
   *    .status(com.fhir.EvidenceStatus) // optional {@link Evidence#status() status}
   *    .reviewer(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link Evidence#reviewer() reviewer}
   *    .meta(com.fhir.Meta) // optional {@link Evidence#meta() meta}
   *    .subtitle(String) // optional {@link Evidence#subtitle() subtitle}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link Evidence#note() note}
   *    .outcome(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Evidence#outcome() outcome}
   *    .relatedArtifact(List&amp;lt;com.fhir.RelatedArtifact&amp;gt;) // optional {@link Evidence#relatedArtifact() relatedArtifact}
   *    .exposureBackground(com.fhir.Reference) // required {@link Evidence#exposureBackground() exposureBackground}
   *    .language(com.fhir.code) // optional {@link Evidence#language() language}
   *    .build();
   * </pre>
   * @return A new Evidence builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableEvidence.Builder();
  }

  /**
   * Builds instances of type {@link Evidence Evidence}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Evidence", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, ExposureBackgroundBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_EXPOSURE_BACKGROUND = 0x2L;
    private static final long OPT_BIT_IDENTIFIER = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_LAST_REVIEW_DATE = 0x4L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x8L;
    private static final long OPT_BIT_COPYRIGHT = 0x10L;
    private static final long OPT_BIT_NAME = 0x20L;
    private static final long OPT_BIT_DATE = 0x40L;
    private static final long OPT_BIT_JURISDICTION = 0x80L;
    private static final long OPT_BIT_AUTHOR = 0x100L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x200L;
    private static final long OPT_BIT_USE_CONTEXT = 0x400L;
    private static final long OPT_BIT_TEXT = 0x800L;
    private static final long OPT_BIT_EDITOR = 0x1000L;
    private static final long OPT_BIT_TITLE = 0x2000L;
    private static final long OPT_BIT_PUBLISHER = 0x4000L;
    private static final long OPT_BIT_EXPOSURE_VARIANT = 0x8000L;
    private static final long OPT_BIT_EXTENSION = 0x10000L;
    private static final long OPT_BIT_SHORT_TITLE = 0x20000L;
    private static final long OPT_BIT_APPROVAL_DATE = 0x40000L;
    private static final long OPT_BIT_VERSION = 0x80000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100000L;
    private static final long OPT_BIT_DESCRIPTION = 0x200000L;
    private static final long OPT_BIT_URL = 0x400000L;
    private static final long OPT_BIT_CONTACT = 0x800000L;
    private static final long OPT_BIT_ENDORSER = 0x1000000L;
    private static final long OPT_BIT_CONTAINED = 0x2000000L;
    private static final long OPT_BIT_TOPIC = 0x4000000L;
    private static final long OPT_BIT_STATUS = 0x8000000L;
    private static final long OPT_BIT_REVIEWER = 0x10000000L;
    private static final long OPT_BIT_META = 0x20000000L;
    private static final long OPT_BIT_SUBTITLE = 0x40000000L;
    private static final long OPT_BIT_NOTE = 0x80000000L;
    private static final long OPT_BIT_OUTCOME = 0x100000000L;
    private static final long OPT_BIT_RELATED_ARTIFACT = 0x200000000L;
    private static final long OPT_BIT_LANGUAGE = 0x400000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.date lastReviewDate;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.markdown copyright;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author;
    private @javax.annotation.Nullable com.fhir.Period effectivePeriod;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> exposureVariant;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String shortTitle;
    private @javax.annotation.Nullable com.fhir.date approvalDate;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic;
    private @javax.annotation.Nullable com.fhir.EvidenceStatus status;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String subtitle;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> outcome;
    private @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact;
    private @javax.annotation.Nullable com.fhir.Reference exposureBackground;
    private @javax.annotation.Nullable com.fhir.code language;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Evidence#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Evidence#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Evidence#id() id} to id.
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
     * Initializes the optional value {@link Evidence#id() id} to id.
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
     * Initializes the optional value {@link Evidence#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link Evidence#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link Evidence#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Evidence#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Evidence#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link Evidence#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link Evidence#name() name} to name.
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
     * Initializes the optional value {@link Evidence#name() name} to name.
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
     * Initializes the optional value {@link Evidence#date() date} to date.
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
     * Initializes the optional value {@link Evidence#date() date} to date.
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
     * Initializes the optional value {@link Evidence#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link Evidence#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link Evidence#author() author} to author.
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
     * Initializes the optional value {@link Evidence#author() author} to author.
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
     * Initializes the optional value {@link Evidence#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link Evidence#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link Evidence#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link Evidence#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link Evidence#text() text} to text.
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
     * Initializes the optional value {@link Evidence#text() text} to text.
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
     * Initializes the optional value {@link Evidence#editor() editor} to editor.
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
     * Initializes the optional value {@link Evidence#editor() editor} to editor.
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
     * Initializes the value for the {@link Evidence#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Evidence#title() title} to title.
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
     * Initializes the optional value {@link Evidence#title() title} to title.
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
     * Initializes the optional value {@link Evidence#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link Evidence#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link Evidence#exposureVariant() exposureVariant} to exposureVariant.
     * @param exposureVariant The value for exposureVariant
     * @return {@code this} builder for chained invocation
     */
    public final Builder exposureVariant(java.util.List<com.fhir.Reference> exposureVariant) {
      checkNotIsSet(exposureVariantIsSet(), "exposureVariant");
      this.exposureVariant = java.util.Objects.requireNonNull(exposureVariant, "exposureVariant");
      optBits |= OPT_BIT_EXPOSURE_VARIANT;
      return this;
    }

    /**
     * Initializes the optional value {@link Evidence#exposureVariant() exposureVariant} to exposureVariant.
     * @param exposureVariant The value for exposureVariant
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exposureVariant")
    public final Builder exposureVariant(java.util.Optional<? extends java.util.List<com.fhir.Reference>> exposureVariant) {
      checkNotIsSet(exposureVariantIsSet(), "exposureVariant");
      this.exposureVariant = exposureVariant.orElse(null);
      optBits |= OPT_BIT_EXPOSURE_VARIANT;
      return this;
    }

    /**
     * Initializes the optional value {@link Evidence#extension() extension} to extension.
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
     * Initializes the optional value {@link Evidence#extension() extension} to extension.
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
     * Initializes the optional value {@link Evidence#shortTitle() shortTitle} to shortTitle.
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
     * Initializes the optional value {@link Evidence#shortTitle() shortTitle} to shortTitle.
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
     * Initializes the optional value {@link Evidence#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link Evidence#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link Evidence#version() version} to version.
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
     * Initializes the optional value {@link Evidence#version() version} to version.
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
     * Initializes the optional value {@link Evidence#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Evidence#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Evidence#description() description} to description.
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
     * Initializes the optional value {@link Evidence#description() description} to description.
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
     * Initializes the optional value {@link Evidence#url() url} to url.
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
     * Initializes the optional value {@link Evidence#url() url} to url.
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
     * Initializes the optional value {@link Evidence#contact() contact} to contact.
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
     * Initializes the optional value {@link Evidence#contact() contact} to contact.
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
     * Initializes the optional value {@link Evidence#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link Evidence#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link Evidence#contained() contained} to contained.
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
     * Initializes the optional value {@link Evidence#contained() contained} to contained.
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
     * Initializes the optional value {@link Evidence#topic() topic} to topic.
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
     * Initializes the optional value {@link Evidence#topic() topic} to topic.
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
     * Initializes the optional value {@link Evidence#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.EvidenceStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Evidence#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.EvidenceStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Evidence#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link Evidence#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link Evidence#meta() meta} to meta.
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
     * Initializes the optional value {@link Evidence#meta() meta} to meta.
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
     * Initializes the optional value {@link Evidence#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link Evidence#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link Evidence#note() note} to note.
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
     * Initializes the optional value {@link Evidence#note() note} to note.
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
     * Initializes the optional value {@link Evidence#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcome(java.util.List<com.fhir.Reference> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = java.util.Objects.requireNonNull(outcome, "outcome");
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link Evidence#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("outcome")
    public final Builder outcome(java.util.Optional<? extends java.util.List<com.fhir.Reference>> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = outcome.orElse(null);
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link Evidence#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link Evidence#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the value for the {@link Evidence#exposureBackground() exposureBackground} attribute.
     * @param exposureBackground The value for exposureBackground 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exposureBackground")
    public final Builder exposureBackground(com.fhir.Reference exposureBackground) {
      checkNotIsSet(exposureBackgroundIsSet(), "exposureBackground");
      this.exposureBackground = java.util.Objects.requireNonNull(exposureBackground, "exposureBackground");
      initBits &= ~INIT_BIT_EXPOSURE_BACKGROUND;
      return this;
    }

    /**
     * Initializes the optional value {@link Evidence#language() language} to language.
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
     * Initializes the optional value {@link Evidence#language() language} to language.
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
     * Builds a new {@link Evidence Evidence}.
     * @return An immutable instance of Evidence
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Evidence build() {
      checkRequiredAttributes();
      return new ImmutableEvidence(
          identifier,
          id,
          lastReviewDate,
          implicitRules,
          copyright,
          name,
          date,
          jurisdiction,
          author,
          effectivePeriod,
          useContext,
          text,
          editor,
          resourceType,
          title,
          publisher,
          exposureVariant,
          extension,
          shortTitle,
          approvalDate,
          version,
          modifierExtension,
          description,
          url,
          contact,
          endorser,
          contained,
          topic,
          status,
          reviewer,
          meta,
          subtitle,
          note,
          outcome,
          relatedArtifact,
          exposureBackground,
          language);
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean lastReviewDateIsSet() {
      return (optBits & OPT_BIT_LAST_REVIEW_DATE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean editorIsSet() {
      return (optBits & OPT_BIT_EDITOR) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean exposureVariantIsSet() {
      return (optBits & OPT_BIT_EXPOSURE_VARIANT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean shortTitleIsSet() {
      return (optBits & OPT_BIT_SHORT_TITLE) != 0;
    }

    private boolean approvalDateIsSet() {
      return (optBits & OPT_BIT_APPROVAL_DATE) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean endorserIsSet() {
      return (optBits & OPT_BIT_ENDORSER) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean topicIsSet() {
      return (optBits & OPT_BIT_TOPIC) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean reviewerIsSet() {
      return (optBits & OPT_BIT_REVIEWER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean subtitleIsSet() {
      return (optBits & OPT_BIT_SUBTITLE) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean relatedArtifactIsSet() {
      return (optBits & OPT_BIT_RELATED_ARTIFACT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean exposureBackgroundIsSet() {
      return (initBits & INIT_BIT_EXPOSURE_BACKGROUND) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Evidence is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!exposureBackgroundIsSet()) attributes.add("exposureBackground");
      return "Cannot build Evidence, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Evidence", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Evidence#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    ExposureBackgroundBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Evidence", generator = "Immutables")
  public interface ExposureBackgroundBuildStage {
    /**
     * Initializes the value for the {@link Evidence#exposureBackground() exposureBackground} attribute.
     * @param exposureBackground The value for exposureBackground 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal exposureBackground(com.fhir.Reference exposureBackground);
  }

  @org.immutables.value.Generated(from = "Evidence", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Evidence#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Evidence#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Evidence#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Evidence#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Evidence#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastReviewDate(com.fhir.date lastReviewDate);

    /**
     * Initializes the optional value {@link Evidence#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastReviewDate(java.util.Optional<? extends com.fhir.date> lastReviewDate);

    /**
     * Initializes the optional value {@link Evidence#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Evidence#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Evidence#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(com.fhir.markdown copyright);

    /**
     * Initializes the optional value {@link Evidence#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(java.util.Optional<? extends com.fhir.markdown> copyright);

    /**
     * Initializes the optional value {@link Evidence#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link Evidence#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link Evidence#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link Evidence#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link Evidence#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link Evidence#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link Evidence#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(java.util.List<com.fhir.ContactDetail> author);

    /**
     * Initializes the optional value {@link Evidence#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> author);

    /**
     * Initializes the optional value {@link Evidence#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(com.fhir.Period effectivePeriod);

    /**
     * Initializes the optional value {@link Evidence#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(java.util.Optional<? extends com.fhir.Period> effectivePeriod);

    /**
     * Initializes the optional value {@link Evidence#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link Evidence#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link Evidence#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Evidence#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Evidence#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal editor(java.util.List<com.fhir.ContactDetail> editor);

    /**
     * Initializes the optional value {@link Evidence#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal editor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> editor);

    /**
     * Initializes the optional value {@link Evidence#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link Evidence#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link Evidence#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link Evidence#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link Evidence#exposureVariant() exposureVariant} to exposureVariant.
     * @param exposureVariant The value for exposureVariant
     * @return {@code this} builder for chained invocation
     */
    BuildFinal exposureVariant(java.util.List<com.fhir.Reference> exposureVariant);

    /**
     * Initializes the optional value {@link Evidence#exposureVariant() exposureVariant} to exposureVariant.
     * @param exposureVariant The value for exposureVariant
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal exposureVariant(java.util.Optional<? extends java.util.List<com.fhir.Reference>> exposureVariant);

    /**
     * Initializes the optional value {@link Evidence#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Evidence#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Evidence#shortTitle() shortTitle} to shortTitle.
     * @param shortTitle The value for shortTitle
     * @return {@code this} builder for chained invocation
     */
    BuildFinal shortTitle(java.lang.String shortTitle);

    /**
     * Initializes the optional value {@link Evidence#shortTitle() shortTitle} to shortTitle.
     * @param shortTitle The value for shortTitle
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal shortTitle(java.util.Optional<java.lang.String> shortTitle);

    /**
     * Initializes the optional value {@link Evidence#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal approvalDate(com.fhir.date approvalDate);

    /**
     * Initializes the optional value {@link Evidence#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal approvalDate(java.util.Optional<? extends com.fhir.date> approvalDate);

    /**
     * Initializes the optional value {@link Evidence#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link Evidence#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link Evidence#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Evidence#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Evidence#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link Evidence#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link Evidence#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link Evidence#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link Evidence#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link Evidence#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link Evidence#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endorser(java.util.List<com.fhir.ContactDetail> endorser);

    /**
     * Initializes the optional value {@link Evidence#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endorser(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> endorser);

    /**
     * Initializes the optional value {@link Evidence#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Evidence#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Evidence#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topic(java.util.List<com.fhir.CodeableConcept> topic);

    /**
     * Initializes the optional value {@link Evidence#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> topic);

    /**
     * Initializes the optional value {@link Evidence#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.EvidenceStatus status);

    /**
     * Initializes the optional value {@link Evidence#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.EvidenceStatus> status);

    /**
     * Initializes the optional value {@link Evidence#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reviewer(java.util.List<com.fhir.ContactDetail> reviewer);

    /**
     * Initializes the optional value {@link Evidence#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reviewer(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> reviewer);

    /**
     * Initializes the optional value {@link Evidence#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Evidence#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Evidence#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subtitle(java.lang.String subtitle);

    /**
     * Initializes the optional value {@link Evidence#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subtitle(java.util.Optional<java.lang.String> subtitle);

    /**
     * Initializes the optional value {@link Evidence#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link Evidence#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link Evidence#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcome(java.util.List<com.fhir.Reference> outcome);

    /**
     * Initializes the optional value {@link Evidence#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcome(java.util.Optional<? extends java.util.List<com.fhir.Reference>> outcome);

    /**
     * Initializes the optional value {@link Evidence#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatedArtifact(java.util.List<com.fhir.RelatedArtifact> relatedArtifact);

    /**
     * Initializes the optional value {@link Evidence#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatedArtifact(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> relatedArtifact);

    /**
     * Initializes the optional value {@link Evidence#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Evidence#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Builds a new {@link Evidence Evidence}.
     * @return An immutable instance of Evidence
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Evidence build();
  }
}
