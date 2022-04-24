//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link EvidenceVariable}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEvidenceVariable.builder()}.
 */
@org.immutables.value.Generated(from = "EvidenceVariable", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEvidenceVariable implements com.fhir.EvidenceVariable {
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.markdown copyright;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.EvidencevariableStatus status;
  private final java.util.List<com.fhir.EvidenceVariable_Characteristic> characteristic;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor;
  private final @javax.annotation.Nullable java.lang.String shortTitle;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable java.lang.String subtitle;
  private final @javax.annotation.Nullable com.fhir.date lastReviewDate;
  private final @javax.annotation.Nullable com.fhir.Period effectivePeriod;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable com.fhir.EvidencevariableType type;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable com.fhir.date approvalDate;

  private ImmutableEvidenceVariable(
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.markdown copyright,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.EvidencevariableStatus status,
      java.util.List<com.fhir.EvidenceVariable_Characteristic> characteristic,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor,
      @javax.annotation.Nullable java.lang.String shortTitle,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable java.lang.String subtitle,
      @javax.annotation.Nullable com.fhir.date lastReviewDate,
      @javax.annotation.Nullable com.fhir.Period effectivePeriod,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable com.fhir.EvidencevariableType type,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable com.fhir.date approvalDate) {
    this.text = text;
    this.url = url;
    this.topic = topic;
    this.name = name;
    this.copyright = copyright;
    this.contained = contained;
    this.note = note;
    this.relatedArtifact = relatedArtifact;
    this.resourceType = resourceType;
    this.reviewer = reviewer;
    this.extension = extension;
    this.author = author;
    this.publisher = publisher;
    this.language = language;
    this.endorser = endorser;
    this.meta = meta;
    this.status = status;
    this.characteristic = characteristic;
    this.editor = editor;
    this.shortTitle = shortTitle;
    this.implicitRules = implicitRules;
    this.id = id;
    this.date = date;
    this.subtitle = subtitle;
    this.lastReviewDate = lastReviewDate;
    this.effectivePeriod = effectivePeriod;
    this.description = description;
    this.jurisdiction = jurisdiction;
    this.useContext = useContext;
    this.identifier = identifier;
    this.version = version;
    this.modifierExtension = modifierExtension;
    this.contact = contact;
    this.type = type;
    this.title = title;
    this.approvalDate = approvalDate;
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
   * @return The value of the {@code url} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @Override
  public java.util.Optional<com.fhir.uri> url() {
    return java.util.Optional.ofNullable(url);
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
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
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
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
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
   * @return The value of the {@code relatedArtifact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("relatedArtifact")
  @Override
  public java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact() {
    return java.util.Optional.ofNullable(relatedArtifact);
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
   * @return The value of the {@code reviewer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reviewer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer() {
    return java.util.Optional.ofNullable(reviewer);
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
   * @return The value of the {@code author} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("author")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> author() {
    return java.util.Optional.ofNullable(author);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.EvidencevariableStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code characteristic} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("characteristic")
  @Override
  public java.util.List<com.fhir.EvidenceVariable_Characteristic> characteristic() {
    return characteristic;
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
   * @return The value of the {@code shortTitle} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("shortTitle")
  @Override
  public java.util.Optional<java.lang.String> shortTitle() {
    return java.util.Optional.ofNullable(shortTitle);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
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
   * @return The value of the {@code subtitle} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subtitle")
  @Override
  public java.util.Optional<java.lang.String> subtitle() {
    return java.util.Optional.ofNullable(subtitle);
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
   * @return The value of the {@code effectivePeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
  @Override
  public java.util.Optional<com.fhir.Period> effectivePeriod() {
    return java.util.Optional.ofNullable(effectivePeriod);
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() {
    return java.util.Optional.ofNullable(jurisdiction);
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
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
   * @return The value of the {@code contact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contact")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() {
    return java.util.Optional.ofNullable(contact);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.EvidencevariableType> type() {
    return java.util.Optional.ofNullable(type);
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
   * @return The value of the {@code approvalDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("approvalDate")
  @Override
  public java.util.Optional<com.fhir.date> approvalDate() {
    return java.util.Optional.ofNullable(approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableEvidenceVariable(
        newValue,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableEvidenceVariable(
        value,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        newValue,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        value,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#topic() topic} attribute.
   * @param value The value for topic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withTopic(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "topic");
    if (this.topic == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        newValue,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#topic() topic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withTopic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.topic == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        value,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        newValue,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        value,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withCopyright(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        newValue,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withCopyright(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        value,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        newValue,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        value,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        newValue,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        value,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#relatedArtifact() relatedArtifact} attribute.
   * @param value The value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withRelatedArtifact(java.util.List<com.fhir.RelatedArtifact> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> newValue = java.util.Objects.requireNonNull(value, "relatedArtifact");
    if (this.relatedArtifact == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        newValue,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#relatedArtifact() relatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withRelatedArtifact(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> value = optional.orElse(null);
    if (this.relatedArtifact == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        value,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EvidenceVariable#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEvidenceVariable withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        newValue,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#reviewer() reviewer} attribute.
   * @param value The value for reviewer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withReviewer(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "reviewer");
    if (this.reviewer == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        newValue,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#reviewer() reviewer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reviewer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withReviewer(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.reviewer == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        value,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        newValue,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        value,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withAuthor(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        newValue,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withAuthor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        value,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        newValue,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        value,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        newValue,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        value,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#endorser() endorser} attribute.
   * @param value The value for endorser
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withEndorser(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "endorser");
    if (this.endorser == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        newValue,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#endorser() endorser} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endorser
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withEndorser(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.endorser == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        value,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        newValue,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        value,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withStatus(com.fhir.EvidencevariableStatus value) {
    @javax.annotation.Nullable com.fhir.EvidencevariableStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        newValue,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withStatus(java.util.Optional<? extends com.fhir.EvidencevariableStatus> optional) {
    @javax.annotation.Nullable com.fhir.EvidencevariableStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        value,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link EvidenceVariable#characteristic() characteristic}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withCharacteristic(com.fhir.EvidenceVariable_Characteristic... elements) {
    java.util.List<com.fhir.EvidenceVariable_Characteristic> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        newValue,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link EvidenceVariable#characteristic() characteristic}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of characteristic elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withCharacteristic(Iterable<? extends com.fhir.EvidenceVariable_Characteristic> elements) {
    if (this.characteristic == elements) return this;
    java.util.List<com.fhir.EvidenceVariable_Characteristic> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        newValue,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#editor() editor} attribute.
   * @param value The value for editor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withEditor(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "editor");
    if (this.editor == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        newValue,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#editor() editor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for editor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withEditor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.editor == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        value,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#shortTitle() shortTitle} attribute.
   * @param value The value for shortTitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withShortTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "shortTitle");
    if (java.util.Objects.equals(this.shortTitle, newValue)) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        newValue,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#shortTitle() shortTitle} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for shortTitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withShortTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.shortTitle, value)) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        value,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        newValue,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        value,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        newValue,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        value,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        newValue,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        value,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#subtitle() subtitle} attribute.
   * @param value The value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withSubtitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "subtitle");
    if (java.util.Objects.equals(this.subtitle, newValue)) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        newValue,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#subtitle() subtitle} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withSubtitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.subtitle, value)) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        value,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#lastReviewDate() lastReviewDate} attribute.
   * @param value The value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withLastReviewDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "lastReviewDate");
    if (this.lastReviewDate == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        newValue,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#lastReviewDate() lastReviewDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withLastReviewDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.lastReviewDate == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        value,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withEffectivePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        newValue,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withEffectivePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        value,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        newValue,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        value,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        newValue,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        value,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        newValue,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        value,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        newValue,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        value,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        newValue,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        value,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        newValue,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        value,
        this.contact,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        newValue,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        value,
        this.type,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withType(com.fhir.EvidencevariableType value) {
    @javax.annotation.Nullable com.fhir.EvidencevariableType newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        newValue,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withType(java.util.Optional<? extends com.fhir.EvidencevariableType> optional) {
    @javax.annotation.Nullable com.fhir.EvidencevariableType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        value,
        this.title,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        newValue,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        value,
        this.approvalDate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EvidenceVariable#approvalDate() approvalDate} attribute.
   * @param value The value for approvalDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidenceVariable withApprovalDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "approvalDate");
    if (this.approvalDate == newValue) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EvidenceVariable#approvalDate() approvalDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for approvalDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidenceVariable withApprovalDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.approvalDate == value) return this;
    return new ImmutableEvidenceVariable(
        this.text,
        this.url,
        this.topic,
        this.name,
        this.copyright,
        this.contained,
        this.note,
        this.relatedArtifact,
        this.resourceType,
        this.reviewer,
        this.extension,
        this.author,
        this.publisher,
        this.language,
        this.endorser,
        this.meta,
        this.status,
        this.characteristic,
        this.editor,
        this.shortTitle,
        this.implicitRules,
        this.id,
        this.date,
        this.subtitle,
        this.lastReviewDate,
        this.effectivePeriod,
        this.description,
        this.jurisdiction,
        this.useContext,
        this.identifier,
        this.version,
        this.modifierExtension,
        this.contact,
        this.type,
        this.title,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEvidenceVariable} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEvidenceVariable
        && equalTo((ImmutableEvidenceVariable) another);
  }

  private boolean equalTo(ImmutableEvidenceVariable another) {
    return java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(topic, another.topic)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(copyright, another.copyright)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(relatedArtifact, another.relatedArtifact)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(reviewer, another.reviewer)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(author, another.author)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(endorser, another.endorser)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(status, another.status)
        && characteristic.equals(another.characteristic)
        && java.util.Objects.equals(editor, another.editor)
        && java.util.Objects.equals(shortTitle, another.shortTitle)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(subtitle, another.subtitle)
        && java.util.Objects.equals(lastReviewDate, another.lastReviewDate)
        && java.util.Objects.equals(effectivePeriod, another.effectivePeriod)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(approvalDate, another.approvalDate);
  }

  /**
   * Computes a hash code from attributes: {@code text}, {@code url}, {@code topic}, {@code name}, {@code copyright}, {@code contained}, {@code note}, {@code relatedArtifact}, {@code resourceType}, {@code reviewer}, {@code extension}, {@code author}, {@code publisher}, {@code language}, {@code endorser}, {@code meta}, {@code status}, {@code characteristic}, {@code editor}, {@code shortTitle}, {@code implicitRules}, {@code id}, {@code date}, {@code subtitle}, {@code lastReviewDate}, {@code effectivePeriod}, {@code description}, {@code jurisdiction}, {@code useContext}, {@code identifier}, {@code version}, {@code modifierExtension}, {@code contact}, {@code type}, {@code title}, {@code approvalDate}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(topic);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(copyright);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(relatedArtifact);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(reviewer);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(author);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(endorser);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + characteristic.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(editor);
    h += (h << 5) + java.util.Objects.hashCode(shortTitle);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(subtitle);
    h += (h << 5) + java.util.Objects.hashCode(lastReviewDate);
    h += (h << 5) + java.util.Objects.hashCode(effectivePeriod);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(approvalDate);
    return h;
  }

  /**
   * Prints the immutable value {@code EvidenceVariable} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("EvidenceVariable{");
    if (text != null) {
      builder.append("text=").append(text);
    }
    if (url != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (topic != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("topic=").append(topic);
    }
    if (name != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (copyright != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (contained != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (note != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (relatedArtifact != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("relatedArtifact=").append(relatedArtifact);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (reviewer != null) {
      builder.append(", ");
      builder.append("reviewer=").append(reviewer);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (author != null) {
      builder.append(", ");
      builder.append("author=").append(author);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (endorser != null) {
      builder.append(", ");
      builder.append("endorser=").append(endorser);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    builder.append(", ");
    builder.append("characteristic=").append(characteristic);
    if (editor != null) {
      builder.append(", ");
      builder.append("editor=").append(editor);
    }
    if (shortTitle != null) {
      builder.append(", ");
      builder.append("shortTitle=").append(shortTitle);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (subtitle != null) {
      builder.append(", ");
      builder.append("subtitle=").append(subtitle);
    }
    if (lastReviewDate != null) {
      builder.append(", ");
      builder.append("lastReviewDate=").append(lastReviewDate);
    }
    if (effectivePeriod != null) {
      builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (jurisdiction != null) {
      builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (approvalDate != null) {
      builder.append(", ");
      builder.append("approvalDate=").append(approvalDate);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "EvidenceVariable", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.EvidenceVariable {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic = java.util.Optional.empty();
    boolean topicIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> copyright = java.util.Optional.empty();
    boolean copyrightIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact = java.util.Optional.empty();
    boolean relatedArtifactIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer = java.util.Optional.empty();
    boolean reviewerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> author = java.util.Optional.empty();
    boolean authorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser = java.util.Optional.empty();
    boolean endorserIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.EvidencevariableStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.EvidenceVariable_Characteristic> characteristic = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor = java.util.Optional.empty();
    boolean editorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> shortTitle = java.util.Optional.empty();
    boolean shortTitleIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> subtitle = java.util.Optional.empty();
    boolean subtitleIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> lastReviewDate = java.util.Optional.empty();
    boolean lastReviewDateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> effectivePeriod = java.util.Optional.empty();
    boolean effectivePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.EvidencevariableType> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> approvalDate = java.util.Optional.empty();
    boolean approvalDateIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("topic")
    public void setTopic(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic) {
      this.topic = topic;
      this.topicIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("copyright")
    public void setCopyright(java.util.Optional<com.fhir.markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("relatedArtifact")
    public void setRelatedArtifact(java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact) {
      this.relatedArtifact = relatedArtifact;
      this.relatedArtifactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reviewer")
    public void setReviewer(java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer) {
      this.reviewer = reviewer;
      this.reviewerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public void setAuthor(java.util.Optional<java.util.List<com.fhir.ContactDetail>> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public void setPublisher(java.util.Optional<java.lang.String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("endorser")
    public void setEndorser(java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser) {
      this.endorser = endorser;
      this.endorserIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.EvidencevariableStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("characteristic")
    public void setCharacteristic(java.util.List<com.fhir.EvidenceVariable_Characteristic> characteristic) {
      this.characteristic = characteristic;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("editor")
    public void setEditor(java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor) {
      this.editor = editor;
      this.editorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("shortTitle")
    public void setShortTitle(java.util.Optional<java.lang.String> shortTitle) {
      this.shortTitle = shortTitle;
      this.shortTitleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subtitle")
    public void setSubtitle(java.util.Optional<java.lang.String> subtitle) {
      this.subtitle = subtitle;
      this.subtitleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lastReviewDate")
    public void setLastReviewDate(java.util.Optional<com.fhir.date> lastReviewDate) {
      this.lastReviewDate = lastReviewDate;
      this.lastReviewDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
    public void setEffectivePeriod(java.util.Optional<com.fhir.Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public void setUseContext(java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.EvidencevariableType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("approvalDate")
    public void setApprovalDate(java.util.Optional<com.fhir.date> approvalDate) {
      this.approvalDate = approvalDate;
      this.approvalDateIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> author() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.EvidencevariableStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.EvidenceVariable_Characteristic> characteristic() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> shortTitle() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> subtitle() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> lastReviewDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.EvidencevariableType> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> approvalDate() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableEvidenceVariable fromJson(Json json) {
    ImmutableEvidenceVariable.Builder builder = ((ImmutableEvidenceVariable.Builder) ImmutableEvidenceVariable.builder());
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.topicIsSet) {
      builder.topic(json.topic);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.relatedArtifactIsSet) {
      builder.relatedArtifact(json.relatedArtifact);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.reviewerIsSet) {
      builder.reviewer(json.reviewer);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.endorserIsSet) {
      builder.endorser(json.endorser);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.characteristic != null) {
      builder.addAllCharacteristic(json.characteristic);
    }
    if (json.editorIsSet) {
      builder.editor(json.editor);
    }
    if (json.shortTitleIsSet) {
      builder.shortTitle(json.shortTitle);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.subtitleIsSet) {
      builder.subtitle(json.subtitle);
    }
    if (json.lastReviewDateIsSet) {
      builder.lastReviewDate(json.lastReviewDate);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.approvalDateIsSet) {
      builder.approvalDate(json.approvalDate);
    }
    return (ImmutableEvidenceVariable) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EvidenceVariable} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EvidenceVariable instance
   */
  public static EvidenceVariable copyOf(EvidenceVariable instance) {
    if (instance instanceof ImmutableEvidenceVariable) {
      return (ImmutableEvidenceVariable) instance;
    }
    return ((ImmutableEvidenceVariable.Builder) ImmutableEvidenceVariable.builder())
        .text(instance.text())
        .url(instance.url())
        .topic(instance.topic())
        .name(instance.name())
        .copyright(instance.copyright())
        .contained(instance.contained())
        .note(instance.note())
        .relatedArtifact(instance.relatedArtifact())
        .resourceType(instance.resourceType())
        .reviewer(instance.reviewer())
        .extension(instance.extension())
        .author(instance.author())
        .publisher(instance.publisher())
        .language(instance.language())
        .endorser(instance.endorser())
        .meta(instance.meta())
        .status(instance.status())
        .addAllCharacteristic(instance.characteristic())
        .editor(instance.editor())
        .shortTitle(instance.shortTitle())
        .implicitRules(instance.implicitRules())
        .id(instance.id())
        .date(instance.date())
        .subtitle(instance.subtitle())
        .lastReviewDate(instance.lastReviewDate())
        .effectivePeriod(instance.effectivePeriod())
        .description(instance.description())
        .jurisdiction(instance.jurisdiction())
        .useContext(instance.useContext())
        .identifier(instance.identifier())
        .version(instance.version())
        .modifierExtension(instance.modifierExtension())
        .contact(instance.contact())
        .type(instance.type())
        .title(instance.title())
        .approvalDate(instance.approvalDate())
        .build();
  }

  /**
   * Creates a builder for {@link EvidenceVariable EvidenceVariable}.
   * <pre>
   * ImmutableEvidenceVariable.builder()
   *    .text(com.fhir.Narrative) // optional {@link EvidenceVariable#text() text}
   *    .url(com.fhir.uri) // optional {@link EvidenceVariable#url() url}
   *    .topic(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link EvidenceVariable#topic() topic}
   *    .name(String) // optional {@link EvidenceVariable#name() name}
   *    .copyright(com.fhir.markdown) // optional {@link EvidenceVariable#copyright() copyright}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link EvidenceVariable#contained() contained}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link EvidenceVariable#note() note}
   *    .relatedArtifact(List&amp;lt;com.fhir.RelatedArtifact&amp;gt;) // optional {@link EvidenceVariable#relatedArtifact() relatedArtifact}
   *    .resourceType(String) // required {@link EvidenceVariable#resourceType() resourceType}
   *    .reviewer(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link EvidenceVariable#reviewer() reviewer}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link EvidenceVariable#extension() extension}
   *    .author(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link EvidenceVariable#author() author}
   *    .publisher(String) // optional {@link EvidenceVariable#publisher() publisher}
   *    .language(com.fhir.code) // optional {@link EvidenceVariable#language() language}
   *    .endorser(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link EvidenceVariable#endorser() endorser}
   *    .meta(com.fhir.Meta) // optional {@link EvidenceVariable#meta() meta}
   *    .status(com.fhir.EvidencevariableStatus) // optional {@link EvidenceVariable#status() status}
   *    .addCharacteristic|addAllCharacteristic(com.fhir.EvidenceVariable_Characteristic) // {@link EvidenceVariable#characteristic() characteristic} elements
   *    .editor(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link EvidenceVariable#editor() editor}
   *    .shortTitle(String) // optional {@link EvidenceVariable#shortTitle() shortTitle}
   *    .implicitRules(com.fhir.uri) // optional {@link EvidenceVariable#implicitRules() implicitRules}
   *    .id(com.fhir.id) // optional {@link EvidenceVariable#id() id}
   *    .date(com.fhir.dateTime) // optional {@link EvidenceVariable#date() date}
   *    .subtitle(String) // optional {@link EvidenceVariable#subtitle() subtitle}
   *    .lastReviewDate(com.fhir.date) // optional {@link EvidenceVariable#lastReviewDate() lastReviewDate}
   *    .effectivePeriod(com.fhir.Period) // optional {@link EvidenceVariable#effectivePeriod() effectivePeriod}
   *    .description(com.fhir.markdown) // optional {@link EvidenceVariable#description() description}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link EvidenceVariable#jurisdiction() jurisdiction}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link EvidenceVariable#useContext() useContext}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link EvidenceVariable#identifier() identifier}
   *    .version(String) // optional {@link EvidenceVariable#version() version}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link EvidenceVariable#modifierExtension() modifierExtension}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link EvidenceVariable#contact() contact}
   *    .type(com.fhir.EvidencevariableType) // optional {@link EvidenceVariable#type() type}
   *    .title(String) // optional {@link EvidenceVariable#title() title}
   *    .approvalDate(com.fhir.date) // optional {@link EvidenceVariable#approvalDate() approvalDate}
   *    .build();
   * </pre>
   * @return A new EvidenceVariable builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableEvidenceVariable.Builder();
  }

  /**
   * Builds instances of type {@link EvidenceVariable EvidenceVariable}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "EvidenceVariable", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_TEXT = 0x1L;
    private static final long OPT_BIT_URL = 0x2L;
    private static final long OPT_BIT_TOPIC = 0x4L;
    private static final long OPT_BIT_NAME = 0x8L;
    private static final long OPT_BIT_COPYRIGHT = 0x10L;
    private static final long OPT_BIT_CONTAINED = 0x20L;
    private static final long OPT_BIT_NOTE = 0x40L;
    private static final long OPT_BIT_RELATED_ARTIFACT = 0x80L;
    private static final long OPT_BIT_REVIEWER = 0x100L;
    private static final long OPT_BIT_EXTENSION = 0x200L;
    private static final long OPT_BIT_AUTHOR = 0x400L;
    private static final long OPT_BIT_PUBLISHER = 0x800L;
    private static final long OPT_BIT_LANGUAGE = 0x1000L;
    private static final long OPT_BIT_ENDORSER = 0x2000L;
    private static final long OPT_BIT_META = 0x4000L;
    private static final long OPT_BIT_STATUS = 0x8000L;
    private static final long OPT_BIT_EDITOR = 0x10000L;
    private static final long OPT_BIT_SHORT_TITLE = 0x20000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x40000L;
    private static final long OPT_BIT_ID = 0x80000L;
    private static final long OPT_BIT_DATE = 0x100000L;
    private static final long OPT_BIT_SUBTITLE = 0x200000L;
    private static final long OPT_BIT_LAST_REVIEW_DATE = 0x400000L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x800000L;
    private static final long OPT_BIT_DESCRIPTION = 0x1000000L;
    private static final long OPT_BIT_JURISDICTION = 0x2000000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x4000000L;
    private static final long OPT_BIT_IDENTIFIER = 0x8000000L;
    private static final long OPT_BIT_VERSION = 0x10000000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20000000L;
    private static final long OPT_BIT_CONTACT = 0x40000000L;
    private static final long OPT_BIT_TYPE = 0x80000000L;
    private static final long OPT_BIT_TITLE = 0x100000000L;
    private static final long OPT_BIT_APPROVAL_DATE = 0x200000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.markdown copyright;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.EvidencevariableStatus status;
    private final java.util.List<com.fhir.EvidenceVariable_Characteristic> characteristic = new java.util.ArrayList<com.fhir.EvidenceVariable_Characteristic>();
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor;
    private @javax.annotation.Nullable java.lang.String shortTitle;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable java.lang.String subtitle;
    private @javax.annotation.Nullable com.fhir.date lastReviewDate;
    private @javax.annotation.Nullable com.fhir.Period effectivePeriod;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable com.fhir.EvidencevariableType type;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable com.fhir.date approvalDate;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link EvidenceVariable#text() text} to text.
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
     * Initializes the optional value {@link EvidenceVariable#text() text} to text.
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
     * Initializes the optional value {@link EvidenceVariable#url() url} to url.
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
     * Initializes the optional value {@link EvidenceVariable#url() url} to url.
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
     * Initializes the optional value {@link EvidenceVariable#topic() topic} to topic.
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
     * Initializes the optional value {@link EvidenceVariable#topic() topic} to topic.
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
     * Initializes the optional value {@link EvidenceVariable#name() name} to name.
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
     * Initializes the optional value {@link EvidenceVariable#name() name} to name.
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
     * Initializes the optional value {@link EvidenceVariable#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link EvidenceVariable#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link EvidenceVariable#contained() contained} to contained.
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
     * Initializes the optional value {@link EvidenceVariable#contained() contained} to contained.
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
     * Initializes the optional value {@link EvidenceVariable#note() note} to note.
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
     * Initializes the optional value {@link EvidenceVariable#note() note} to note.
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
     * Initializes the optional value {@link EvidenceVariable#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link EvidenceVariable#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the value for the {@link EvidenceVariable#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link EvidenceVariable#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link EvidenceVariable#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link EvidenceVariable#extension() extension} to extension.
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
     * Initializes the optional value {@link EvidenceVariable#extension() extension} to extension.
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
     * Initializes the optional value {@link EvidenceVariable#author() author} to author.
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
     * Initializes the optional value {@link EvidenceVariable#author() author} to author.
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
     * Initializes the optional value {@link EvidenceVariable#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link EvidenceVariable#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link EvidenceVariable#language() language} to language.
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
     * Initializes the optional value {@link EvidenceVariable#language() language} to language.
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
     * Initializes the optional value {@link EvidenceVariable#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link EvidenceVariable#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link EvidenceVariable#meta() meta} to meta.
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
     * Initializes the optional value {@link EvidenceVariable#meta() meta} to meta.
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
     * Initializes the optional value {@link EvidenceVariable#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.EvidencevariableStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.EvidencevariableStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Adds one element to {@link EvidenceVariable#characteristic() characteristic} list.
     * @param element A characteristic element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addCharacteristic(com.fhir.EvidenceVariable_Characteristic element) {
      this.characteristic.add(java.util.Objects.requireNonNull(element, "characteristic element"));
      return this;
    }

    /**
     * Adds elements to {@link EvidenceVariable#characteristic() characteristic} list.
     * @param elements An array of characteristic elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addCharacteristic(com.fhir.EvidenceVariable_Characteristic... elements) {
      for (com.fhir.EvidenceVariable_Characteristic element : elements) {
        this.characteristic.add(java.util.Objects.requireNonNull(element, "characteristic element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link EvidenceVariable#characteristic() characteristic} list.
     * @param elements An iterable of characteristic elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllCharacteristic(Iterable<? extends com.fhir.EvidenceVariable_Characteristic> elements) {
      for (com.fhir.EvidenceVariable_Characteristic element : elements) {
        this.characteristic.add(java.util.Objects.requireNonNull(element, "characteristic element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable#editor() editor} to editor.
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
     * Initializes the optional value {@link EvidenceVariable#editor() editor} to editor.
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
     * Initializes the optional value {@link EvidenceVariable#shortTitle() shortTitle} to shortTitle.
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
     * Initializes the optional value {@link EvidenceVariable#shortTitle() shortTitle} to shortTitle.
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
     * Initializes the optional value {@link EvidenceVariable#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link EvidenceVariable#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link EvidenceVariable#id() id} to id.
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
     * Initializes the optional value {@link EvidenceVariable#id() id} to id.
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
     * Initializes the optional value {@link EvidenceVariable#date() date} to date.
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
     * Initializes the optional value {@link EvidenceVariable#date() date} to date.
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
     * Initializes the optional value {@link EvidenceVariable#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link EvidenceVariable#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link EvidenceVariable#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link EvidenceVariable#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link EvidenceVariable#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link EvidenceVariable#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link EvidenceVariable#description() description} to description.
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
     * Initializes the optional value {@link EvidenceVariable#description() description} to description.
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
     * Initializes the optional value {@link EvidenceVariable#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link EvidenceVariable#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link EvidenceVariable#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link EvidenceVariable#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link EvidenceVariable#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link EvidenceVariable#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link EvidenceVariable#version() version} to version.
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
     * Initializes the optional value {@link EvidenceVariable#version() version} to version.
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
     * Initializes the optional value {@link EvidenceVariable#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EvidenceVariable#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EvidenceVariable#contact() contact} to contact.
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
     * Initializes the optional value {@link EvidenceVariable#contact() contact} to contact.
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
     * Initializes the optional value {@link EvidenceVariable#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.EvidencevariableType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.EvidencevariableType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link EvidenceVariable#title() title} to title.
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
     * Initializes the optional value {@link EvidenceVariable#title() title} to title.
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
     * Initializes the optional value {@link EvidenceVariable#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link EvidenceVariable#approvalDate() approvalDate} to approvalDate.
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
     * Builds a new {@link EvidenceVariable EvidenceVariable}.
     * @return An immutable instance of EvidenceVariable
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.EvidenceVariable build() {
      checkRequiredAttributes();
      return new ImmutableEvidenceVariable(
          text,
          url,
          topic,
          name,
          copyright,
          contained,
          note,
          relatedArtifact,
          resourceType,
          reviewer,
          extension,
          author,
          publisher,
          language,
          endorser,
          meta,
          status,
          createUnmodifiableList(true, characteristic),
          editor,
          shortTitle,
          implicitRules,
          id,
          date,
          subtitle,
          lastReviewDate,
          effectivePeriod,
          description,
          jurisdiction,
          useContext,
          identifier,
          version,
          modifierExtension,
          contact,
          type,
          title,
          approvalDate);
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean topicIsSet() {
      return (optBits & OPT_BIT_TOPIC) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean relatedArtifactIsSet() {
      return (optBits & OPT_BIT_RELATED_ARTIFACT) != 0;
    }

    private boolean reviewerIsSet() {
      return (optBits & OPT_BIT_REVIEWER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean endorserIsSet() {
      return (optBits & OPT_BIT_ENDORSER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean editorIsSet() {
      return (optBits & OPT_BIT_EDITOR) != 0;
    }

    private boolean shortTitleIsSet() {
      return (optBits & OPT_BIT_SHORT_TITLE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean subtitleIsSet() {
      return (optBits & OPT_BIT_SUBTITLE) != 0;
    }

    private boolean lastReviewDateIsSet() {
      return (optBits & OPT_BIT_LAST_REVIEW_DATE) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean approvalDateIsSet() {
      return (optBits & OPT_BIT_APPROVAL_DATE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of EvidenceVariable is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build EvidenceVariable, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "EvidenceVariable", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link EvidenceVariable#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "EvidenceVariable", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link EvidenceVariable#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link EvidenceVariable#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link EvidenceVariable#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link EvidenceVariable#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link EvidenceVariable#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topic(java.util.List<com.fhir.CodeableConcept> topic);

    /**
     * Initializes the optional value {@link EvidenceVariable#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> topic);

    /**
     * Initializes the optional value {@link EvidenceVariable#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link EvidenceVariable#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link EvidenceVariable#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(com.fhir.markdown copyright);

    /**
     * Initializes the optional value {@link EvidenceVariable#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(java.util.Optional<? extends com.fhir.markdown> copyright);

    /**
     * Initializes the optional value {@link EvidenceVariable#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link EvidenceVariable#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link EvidenceVariable#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link EvidenceVariable#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link EvidenceVariable#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatedArtifact(java.util.List<com.fhir.RelatedArtifact> relatedArtifact);

    /**
     * Initializes the optional value {@link EvidenceVariable#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatedArtifact(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> relatedArtifact);

    /**
     * Initializes the optional value {@link EvidenceVariable#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reviewer(java.util.List<com.fhir.ContactDetail> reviewer);

    /**
     * Initializes the optional value {@link EvidenceVariable#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reviewer(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> reviewer);

    /**
     * Initializes the optional value {@link EvidenceVariable#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link EvidenceVariable#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link EvidenceVariable#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(java.util.List<com.fhir.ContactDetail> author);

    /**
     * Initializes the optional value {@link EvidenceVariable#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> author);

    /**
     * Initializes the optional value {@link EvidenceVariable#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link EvidenceVariable#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link EvidenceVariable#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link EvidenceVariable#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link EvidenceVariable#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endorser(java.util.List<com.fhir.ContactDetail> endorser);

    /**
     * Initializes the optional value {@link EvidenceVariable#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endorser(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> endorser);

    /**
     * Initializes the optional value {@link EvidenceVariable#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link EvidenceVariable#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link EvidenceVariable#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.EvidencevariableStatus status);

    /**
     * Initializes the optional value {@link EvidenceVariable#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.EvidencevariableStatus> status);

    /**
     * Adds one element to {@link EvidenceVariable#characteristic() characteristic} list.
     * @param element A characteristic element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addCharacteristic(com.fhir.EvidenceVariable_Characteristic element);

    /**
     * Adds elements to {@link EvidenceVariable#characteristic() characteristic} list.
     * @param elements An array of characteristic elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addCharacteristic(com.fhir.EvidenceVariable_Characteristic... elements);

    /**
     * Adds elements to {@link EvidenceVariable#characteristic() characteristic} list.
     * @param elements An iterable of characteristic elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllCharacteristic(Iterable<? extends com.fhir.EvidenceVariable_Characteristic> elements);

    /**
     * Initializes the optional value {@link EvidenceVariable#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal editor(java.util.List<com.fhir.ContactDetail> editor);

    /**
     * Initializes the optional value {@link EvidenceVariable#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal editor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> editor);

    /**
     * Initializes the optional value {@link EvidenceVariable#shortTitle() shortTitle} to shortTitle.
     * @param shortTitle The value for shortTitle
     * @return {@code this} builder for chained invocation
     */
    BuildFinal shortTitle(java.lang.String shortTitle);

    /**
     * Initializes the optional value {@link EvidenceVariable#shortTitle() shortTitle} to shortTitle.
     * @param shortTitle The value for shortTitle
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal shortTitle(java.util.Optional<java.lang.String> shortTitle);

    /**
     * Initializes the optional value {@link EvidenceVariable#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link EvidenceVariable#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link EvidenceVariable#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link EvidenceVariable#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link EvidenceVariable#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link EvidenceVariable#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link EvidenceVariable#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subtitle(java.lang.String subtitle);

    /**
     * Initializes the optional value {@link EvidenceVariable#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subtitle(java.util.Optional<java.lang.String> subtitle);

    /**
     * Initializes the optional value {@link EvidenceVariable#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastReviewDate(com.fhir.date lastReviewDate);

    /**
     * Initializes the optional value {@link EvidenceVariable#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastReviewDate(java.util.Optional<? extends com.fhir.date> lastReviewDate);

    /**
     * Initializes the optional value {@link EvidenceVariable#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(com.fhir.Period effectivePeriod);

    /**
     * Initializes the optional value {@link EvidenceVariable#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(java.util.Optional<? extends com.fhir.Period> effectivePeriod);

    /**
     * Initializes the optional value {@link EvidenceVariable#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link EvidenceVariable#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link EvidenceVariable#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link EvidenceVariable#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link EvidenceVariable#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link EvidenceVariable#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link EvidenceVariable#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link EvidenceVariable#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link EvidenceVariable#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link EvidenceVariable#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link EvidenceVariable#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link EvidenceVariable#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link EvidenceVariable#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link EvidenceVariable#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link EvidenceVariable#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.EvidencevariableType type);

    /**
     * Initializes the optional value {@link EvidenceVariable#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.EvidencevariableType> type);

    /**
     * Initializes the optional value {@link EvidenceVariable#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link EvidenceVariable#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link EvidenceVariable#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal approvalDate(com.fhir.date approvalDate);

    /**
     * Initializes the optional value {@link EvidenceVariable#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal approvalDate(java.util.Optional<? extends com.fhir.date> approvalDate);

    /**
     * Builds a new {@link EvidenceVariable EvidenceVariable}.
     * @return An immutable instance of EvidenceVariable
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    EvidenceVariable build();
  }

  private static <T> java.util.List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    java.util.ArrayList<T> list;
    if (iterable instanceof java.util.Collection<?>) {
      int size = ((java.util.Collection<?>) iterable).size();
      if (size == 0) return java.util.Collections.emptyList();
      list = new java.util.ArrayList<>();
    } else {
      list = new java.util.ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) java.util.Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> java.util.List<T> createUnmodifiableList(boolean clone, java.util.List<T> list) {
    switch(list.size()) {
    case 0: return java.util.Collections.emptyList();
    case 1: return java.util.Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList<>(list));
      } else {
        if (list instanceof java.util.ArrayList<?>) {
          ((java.util.ArrayList<?>) list).trimToSize();
        }
        return java.util.Collections.unmodifiableList(list);
      }
    }
  }
}
