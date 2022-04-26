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
 * Immutable implementation of {@link Evidence}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEvidence.builder()}.
 */
@Generated(from = "Evidence", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEvidence implements Evidence {
  private final @Nullable List<Reference> exposureVariant;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final @Nullable EvidenceStatus status;
  private final @Nullable Id id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Markdown description;
  private final @Nullable Period effectivePeriod;
  private final String resourceType;
  private final @Nullable Code language;
  private final @Nullable String title;
  private final @Nullable List<ContactDetail> author;
  private final @Nullable Markdown copyright;
  private final Reference exposureBackground;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable DateTime date;
  private final @Nullable List<ContactDetail> endorser;
  private final @Nullable List<Annotation> note;
  private final @Nullable List<UsageContext> useContext;
  private final @Nullable Date lastReviewDate;
  private final @Nullable List<RelatedArtifact> relatedArtifact;
  private final @Nullable Meta meta;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<ContactDetail> reviewer;
  private final @Nullable Narrative text;
  private final @Nullable Date approvalDate;
  private final @Nullable Uri url;
  private final @Nullable String name;
  private final @Nullable String shortTitle;
  private final @Nullable String subtitle;
  private final @Nullable List<CodeableConcept> topic;
  private final @Nullable List<ContactDetail> editor;
  private final @Nullable String publisher;
  private final @Nullable List<Reference> outcome;
  private final @Nullable String version;
  private final @Nullable List<ContactDetail> contact;

  private ImmutableEvidence(
      @Nullable List<Reference> exposureVariant,
      @Nullable Uri implicitRules,
      @Nullable List<CodeableConcept> jurisdiction,
      @Nullable EvidenceStatus status,
      @Nullable Id id,
      @Nullable List<Extension> modifierExtension,
      @Nullable Markdown description,
      @Nullable Period effectivePeriod,
      String resourceType,
      @Nullable Code language,
      @Nullable String title,
      @Nullable List<ContactDetail> author,
      @Nullable Markdown copyright,
      Reference exposureBackground,
      @Nullable List<Extension> extension,
      @Nullable List<Identifier> identifier,
      @Nullable DateTime date,
      @Nullable List<ContactDetail> endorser,
      @Nullable List<Annotation> note,
      @Nullable List<UsageContext> useContext,
      @Nullable Date lastReviewDate,
      @Nullable List<RelatedArtifact> relatedArtifact,
      @Nullable Meta meta,
      @Nullable List<ResourceList> contained,
      @Nullable List<ContactDetail> reviewer,
      @Nullable Narrative text,
      @Nullable Date approvalDate,
      @Nullable Uri url,
      @Nullable String name,
      @Nullable String shortTitle,
      @Nullable String subtitle,
      @Nullable List<CodeableConcept> topic,
      @Nullable List<ContactDetail> editor,
      @Nullable String publisher,
      @Nullable List<Reference> outcome,
      @Nullable String version,
      @Nullable List<ContactDetail> contact) {
    this.exposureVariant = exposureVariant;
    this.implicitRules = implicitRules;
    this.jurisdiction = jurisdiction;
    this.status = status;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.description = description;
    this.effectivePeriod = effectivePeriod;
    this.resourceType = resourceType;
    this.language = language;
    this.title = title;
    this.author = author;
    this.copyright = copyright;
    this.exposureBackground = exposureBackground;
    this.extension = extension;
    this.identifier = identifier;
    this.date = date;
    this.endorser = endorser;
    this.note = note;
    this.useContext = useContext;
    this.lastReviewDate = lastReviewDate;
    this.relatedArtifact = relatedArtifact;
    this.meta = meta;
    this.contained = contained;
    this.reviewer = reviewer;
    this.text = text;
    this.approvalDate = approvalDate;
    this.url = url;
    this.name = name;
    this.shortTitle = shortTitle;
    this.subtitle = subtitle;
    this.topic = topic;
    this.editor = editor;
    this.publisher = publisher;
    this.outcome = outcome;
    this.version = version;
    this.contact = contact;
  }

  /**
   * @return The value of the {@code exposureVariant} attribute
   */
  @JsonProperty("exposureVariant")
  @Override
  public Optional<List<Reference>> exposureVariant() {
    return Optional.ofNullable(exposureVariant);
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @JsonProperty("jurisdiction")
  @Override
  public Optional<List<CodeableConcept>> jurisdiction() {
    return Optional.ofNullable(jurisdiction);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<EvidenceStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code author} attribute
   */
  @JsonProperty("author")
  @Override
  public Optional<List<ContactDetail>> author() {
    return Optional.ofNullable(author);
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
   * @return The value of the {@code exposureBackground} attribute
   */
  @JsonProperty("exposureBackground")
  @Override
  public Reference exposureBackground() {
    return exposureBackground;
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
   * @return The value of the {@code endorser} attribute
   */
  @JsonProperty("endorser")
  @Override
  public Optional<List<ContactDetail>> endorser() {
    return Optional.ofNullable(endorser);
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
   * @return The value of the {@code relatedArtifact} attribute
   */
  @JsonProperty("relatedArtifact")
  @Override
  public Optional<List<RelatedArtifact>> relatedArtifact() {
    return Optional.ofNullable(relatedArtifact);
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
   * @return The value of the {@code approvalDate} attribute
   */
  @JsonProperty("approvalDate")
  @Override
  public Optional<Date> approvalDate() {
    return Optional.ofNullable(approvalDate);
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
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
   * @return The value of the {@code subtitle} attribute
   */
  @JsonProperty("subtitle")
  @Override
  public Optional<String> subtitle() {
    return Optional.ofNullable(subtitle);
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
   * @return The value of the {@code editor} attribute
   */
  @JsonProperty("editor")
  @Override
  public Optional<List<ContactDetail>> editor() {
    return Optional.ofNullable(editor);
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
   * @return The value of the {@code outcome} attribute
   */
  @JsonProperty("outcome")
  @Override
  public Optional<List<Reference>> outcome() {
    return Optional.ofNullable(outcome);
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
   * @return The value of the {@code contact} attribute
   */
  @JsonProperty("contact")
  @Override
  public Optional<List<ContactDetail>> contact() {
    return Optional.ofNullable(contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#exposureVariant() exposureVariant} attribute.
   * @param value The value for exposureVariant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withExposureVariant(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "exposureVariant");
    if (this.exposureVariant == newValue) return this;
    return new ImmutableEvidence(
        newValue,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#exposureVariant() exposureVariant} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exposureVariant
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withExposureVariant(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.exposureVariant == value) return this;
    return new ImmutableEvidence(
        value,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        newValue,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        value,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        newValue,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        value,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withStatus(EvidenceStatus value) {
    @Nullable EvidenceStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        newValue,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withStatus(Optional<? extends EvidenceStatus> optional) {
    @Nullable EvidenceStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        value,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        newValue,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        value,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        newValue,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        value,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        newValue,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        value,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withEffectivePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        newValue,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withEffectivePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        value,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Evidence#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEvidence withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        newValue,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        newValue,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        value,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        newValue,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        value,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withAuthor(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        newValue,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withAuthor(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        value,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withCopyright(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        newValue,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withCopyright(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        value,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Evidence#exposureBackground() exposureBackground} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for exposureBackground
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEvidence withExposureBackground(Reference value) {
    if (this.exposureBackground == value) return this;
    Reference newValue = Objects.requireNonNull(value, "exposureBackground");
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        newValue,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        newValue,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        value,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        newValue,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        value,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        newValue,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        value,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#endorser() endorser} attribute.
   * @param value The value for endorser
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withEndorser(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "endorser");
    if (this.endorser == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        newValue,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#endorser() endorser} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endorser
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withEndorser(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.endorser == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        value,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        newValue,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        value,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withUseContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        newValue,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withUseContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        value,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#lastReviewDate() lastReviewDate} attribute.
   * @param value The value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withLastReviewDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "lastReviewDate");
    if (this.lastReviewDate == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        newValue,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#lastReviewDate() lastReviewDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withLastReviewDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.lastReviewDate == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        value,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#relatedArtifact() relatedArtifact} attribute.
   * @param value The value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withRelatedArtifact(List<RelatedArtifact> value) {
    @Nullable List<RelatedArtifact> newValue = Objects.requireNonNull(value, "relatedArtifact");
    if (this.relatedArtifact == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        newValue,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#relatedArtifact() relatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withRelatedArtifact(Optional<? extends List<RelatedArtifact>> optional) {
    @Nullable List<RelatedArtifact> value = optional.orElse(null);
    if (this.relatedArtifact == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        value,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        newValue,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        value,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        newValue,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        value,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#reviewer() reviewer} attribute.
   * @param value The value for reviewer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withReviewer(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "reviewer");
    if (this.reviewer == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        newValue,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#reviewer() reviewer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reviewer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withReviewer(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.reviewer == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        value,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        newValue,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        value,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#approvalDate() approvalDate} attribute.
   * @param value The value for approvalDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withApprovalDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "approvalDate");
    if (this.approvalDate == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        newValue,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#approvalDate() approvalDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for approvalDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withApprovalDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.approvalDate == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        value,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        newValue,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        value,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        newValue,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        value,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#shortTitle() shortTitle} attribute.
   * @param value The value for shortTitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withShortTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "shortTitle");
    if (Objects.equals(this.shortTitle, newValue)) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        newValue,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#shortTitle() shortTitle} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for shortTitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withShortTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.shortTitle, value)) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        value,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#subtitle() subtitle} attribute.
   * @param value The value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withSubtitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "subtitle");
    if (Objects.equals(this.subtitle, newValue)) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        newValue,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#subtitle() subtitle} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withSubtitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.subtitle, value)) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        value,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#topic() topic} attribute.
   * @param value The value for topic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withTopic(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "topic");
    if (this.topic == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        newValue,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#topic() topic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withTopic(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.topic == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        value,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#editor() editor} attribute.
   * @param value The value for editor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withEditor(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "editor");
    if (this.editor == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        newValue,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#editor() editor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for editor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withEditor(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.editor == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        value,
        this.publisher,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withPublisher(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "publisher");
    if (Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        newValue,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withPublisher(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.publisher, value)) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        value,
        this.outcome,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withOutcome(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        newValue,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withOutcome(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        value,
        this.version,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        newValue,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        value,
        this.contact);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Evidence#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEvidence withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Evidence#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEvidence withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableEvidence(
        this.exposureVariant,
        this.implicitRules,
        this.jurisdiction,
        this.status,
        this.id,
        this.modifierExtension,
        this.description,
        this.effectivePeriod,
        this.resourceType,
        this.language,
        this.title,
        this.author,
        this.copyright,
        this.exposureBackground,
        this.extension,
        this.identifier,
        this.date,
        this.endorser,
        this.note,
        this.useContext,
        this.lastReviewDate,
        this.relatedArtifact,
        this.meta,
        this.contained,
        this.reviewer,
        this.text,
        this.approvalDate,
        this.url,
        this.name,
        this.shortTitle,
        this.subtitle,
        this.topic,
        this.editor,
        this.publisher,
        this.outcome,
        this.version,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEvidence} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEvidence
        && equalTo((ImmutableEvidence) another);
  }

  private boolean equalTo(ImmutableEvidence another) {
    return Objects.equals(exposureVariant, another.exposureVariant)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(status, another.status)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(description, another.description)
        && Objects.equals(effectivePeriod, another.effectivePeriod)
        && resourceType.equals(another.resourceType)
        && Objects.equals(language, another.language)
        && Objects.equals(title, another.title)
        && Objects.equals(author, another.author)
        && Objects.equals(copyright, another.copyright)
        && exposureBackground.equals(another.exposureBackground)
        && Objects.equals(extension, another.extension)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(date, another.date)
        && Objects.equals(endorser, another.endorser)
        && Objects.equals(note, another.note)
        && Objects.equals(useContext, another.useContext)
        && Objects.equals(lastReviewDate, another.lastReviewDate)
        && Objects.equals(relatedArtifact, another.relatedArtifact)
        && Objects.equals(meta, another.meta)
        && Objects.equals(contained, another.contained)
        && Objects.equals(reviewer, another.reviewer)
        && Objects.equals(text, another.text)
        && Objects.equals(approvalDate, another.approvalDate)
        && Objects.equals(url, another.url)
        && Objects.equals(name, another.name)
        && Objects.equals(shortTitle, another.shortTitle)
        && Objects.equals(subtitle, another.subtitle)
        && Objects.equals(topic, another.topic)
        && Objects.equals(editor, another.editor)
        && Objects.equals(publisher, another.publisher)
        && Objects.equals(outcome, another.outcome)
        && Objects.equals(version, another.version)
        && Objects.equals(contact, another.contact);
  }

  /**
   * Computes a hash code from attributes: {@code exposureVariant}, {@code implicitRules}, {@code jurisdiction}, {@code status}, {@code id}, {@code modifierExtension}, {@code description}, {@code effectivePeriod}, {@code resourceType}, {@code language}, {@code title}, {@code author}, {@code copyright}, {@code exposureBackground}, {@code extension}, {@code identifier}, {@code date}, {@code endorser}, {@code note}, {@code useContext}, {@code lastReviewDate}, {@code relatedArtifact}, {@code meta}, {@code contained}, {@code reviewer}, {@code text}, {@code approvalDate}, {@code url}, {@code name}, {@code shortTitle}, {@code subtitle}, {@code topic}, {@code editor}, {@code publisher}, {@code outcome}, {@code version}, {@code contact}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(exposureVariant);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(effectivePeriod);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(author);
    h += (h << 5) + Objects.hashCode(copyright);
    h += (h << 5) + exposureBackground.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(endorser);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(useContext);
    h += (h << 5) + Objects.hashCode(lastReviewDate);
    h += (h << 5) + Objects.hashCode(relatedArtifact);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(reviewer);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(approvalDate);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(shortTitle);
    h += (h << 5) + Objects.hashCode(subtitle);
    h += (h << 5) + Objects.hashCode(topic);
    h += (h << 5) + Objects.hashCode(editor);
    h += (h << 5) + Objects.hashCode(publisher);
    h += (h << 5) + Objects.hashCode(outcome);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(contact);
    return h;
  }

  /**
   * Prints the immutable value {@code Evidence} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Evidence{");
    if (exposureVariant != null) {
      builder.append("exposureVariant=").append(exposureVariant);
    }
    if (implicitRules != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (jurisdiction != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (status != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (id != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (description != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (effectivePeriod != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (builder.length() > 9) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (author != null) {
      builder.append(", ");
      builder.append("author=").append(author);
    }
    if (copyright != null) {
      builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    builder.append(", ");
    builder.append("exposureBackground=").append(exposureBackground);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    if (endorser != null) {
      builder.append(", ");
      builder.append("endorser=").append(endorser);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (useContext != null) {
      builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (lastReviewDate != null) {
      builder.append(", ");
      builder.append("lastReviewDate=").append(lastReviewDate);
    }
    if (relatedArtifact != null) {
      builder.append(", ");
      builder.append("relatedArtifact=").append(relatedArtifact);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (reviewer != null) {
      builder.append(", ");
      builder.append("reviewer=").append(reviewer);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (approvalDate != null) {
      builder.append(", ");
      builder.append("approvalDate=").append(approvalDate);
    }
    if (url != null) {
      builder.append(", ");
      builder.append("url=").append(url);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (shortTitle != null) {
      builder.append(", ");
      builder.append("shortTitle=").append(shortTitle);
    }
    if (subtitle != null) {
      builder.append(", ");
      builder.append("subtitle=").append(subtitle);
    }
    if (topic != null) {
      builder.append(", ");
      builder.append("topic=").append(topic);
    }
    if (editor != null) {
      builder.append(", ");
      builder.append("editor=").append(editor);
    }
    if (publisher != null) {
      builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (outcome != null) {
      builder.append(", ");
      builder.append("outcome=").append(outcome);
    }
    if (version != null) {
      builder.append(", ");
      builder.append("version=").append(version);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Evidence", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Evidence {
    @Nullable Optional<List<Reference>> exposureVariant = Optional.empty();
    boolean exposureVariantIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<EvidenceStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Period> effectivePeriod = Optional.empty();
    boolean effectivePeriodIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<List<ContactDetail>> author = Optional.empty();
    boolean authorIsSet;
    @Nullable Optional<Markdown> copyright = Optional.empty();
    boolean copyrightIsSet;
    @Nullable Reference exposureBackground;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<List<ContactDetail>> endorser = Optional.empty();
    boolean endorserIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<List<UsageContext>> useContext = Optional.empty();
    boolean useContextIsSet;
    @Nullable Optional<Date> lastReviewDate = Optional.empty();
    boolean lastReviewDateIsSet;
    @Nullable Optional<List<RelatedArtifact>> relatedArtifact = Optional.empty();
    boolean relatedArtifactIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<ContactDetail>> reviewer = Optional.empty();
    boolean reviewerIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Date> approvalDate = Optional.empty();
    boolean approvalDateIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<String> shortTitle = Optional.empty();
    boolean shortTitleIsSet;
    @Nullable Optional<String> subtitle = Optional.empty();
    boolean subtitleIsSet;
    @Nullable Optional<List<CodeableConcept>> topic = Optional.empty();
    boolean topicIsSet;
    @Nullable Optional<List<ContactDetail>> editor = Optional.empty();
    boolean editorIsSet;
    @Nullable Optional<String> publisher = Optional.empty();
    boolean publisherIsSet;
    @Nullable Optional<List<Reference>> outcome = Optional.empty();
    boolean outcomeIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
    @JsonProperty("exposureVariant")
    public void setExposureVariant(Optional<List<Reference>> exposureVariant) {
      this.exposureVariant = exposureVariant;
      this.exposureVariantIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<List<CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<EvidenceStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
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
    @JsonProperty("author")
    public void setAuthor(Optional<List<ContactDetail>> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @JsonProperty("copyright")
    public void setCopyright(Optional<Markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @JsonProperty("exposureBackground")
    public void setExposureBackground(Reference exposureBackground) {
      this.exposureBackground = exposureBackground;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
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
    @JsonProperty("endorser")
    public void setEndorser(Optional<List<ContactDetail>> endorser) {
      this.endorser = endorser;
      this.endorserIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
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
    @JsonProperty("relatedArtifact")
    public void setRelatedArtifact(Optional<List<RelatedArtifact>> relatedArtifact) {
      this.relatedArtifact = relatedArtifact;
      this.relatedArtifactIsSet = true;
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
    @JsonProperty("approvalDate")
    public void setApprovalDate(Optional<Date> approvalDate) {
      this.approvalDate = approvalDate;
      this.approvalDateIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("shortTitle")
    public void setShortTitle(Optional<String> shortTitle) {
      this.shortTitle = shortTitle;
      this.shortTitleIsSet = true;
    }
    @JsonProperty("subtitle")
    public void setSubtitle(Optional<String> subtitle) {
      this.subtitle = subtitle;
      this.subtitleIsSet = true;
    }
    @JsonProperty("topic")
    public void setTopic(Optional<List<CodeableConcept>> topic) {
      this.topic = topic;
      this.topicIsSet = true;
    }
    @JsonProperty("editor")
    public void setEditor(Optional<List<ContactDetail>> editor) {
      this.editor = editor;
      this.editorIsSet = true;
    }
    @JsonProperty("publisher")
    public void setPublisher(Optional<String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @JsonProperty("outcome")
    public void setOutcome(Optional<List<Reference>> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @Override
    public Optional<List<Reference>> exposureVariant() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<EvidenceStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> author() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public Reference exposureBackground() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> endorser() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> lastReviewDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<RelatedArtifact>> relatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> reviewer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> approvalDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> shortTitle() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> subtitle() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> topic() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> editor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEvidence fromJson(Json json) {
    ImmutableEvidence.Builder builder = ((ImmutableEvidence.Builder) ImmutableEvidence.builder());
    if (json.exposureVariantIsSet) {
      builder.exposureVariant(json.exposureVariant);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.exposureBackground != null) {
      builder.exposureBackground(json.exposureBackground);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.endorserIsSet) {
      builder.endorser(json.endorser);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.lastReviewDateIsSet) {
      builder.lastReviewDate(json.lastReviewDate);
    }
    if (json.relatedArtifactIsSet) {
      builder.relatedArtifact(json.relatedArtifact);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.reviewerIsSet) {
      builder.reviewer(json.reviewer);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.approvalDateIsSet) {
      builder.approvalDate(json.approvalDate);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.shortTitleIsSet) {
      builder.shortTitle(json.shortTitle);
    }
    if (json.subtitleIsSet) {
      builder.subtitle(json.subtitle);
    }
    if (json.topicIsSet) {
      builder.topic(json.topic);
    }
    if (json.editorIsSet) {
      builder.editor(json.editor);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
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
        .exposureVariant(instance.exposureVariant())
        .implicitRules(instance.implicitRules())
        .jurisdiction(instance.jurisdiction())
        .status(instance.status())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .description(instance.description())
        .effectivePeriod(instance.effectivePeriod())
        .resourceType(instance.resourceType())
        .language(instance.language())
        .title(instance.title())
        .author(instance.author())
        .copyright(instance.copyright())
        .exposureBackground(instance.exposureBackground())
        .extension(instance.extension())
        .identifier(instance.identifier())
        .date(instance.date())
        .endorser(instance.endorser())
        .note(instance.note())
        .useContext(instance.useContext())
        .lastReviewDate(instance.lastReviewDate())
        .relatedArtifact(instance.relatedArtifact())
        .meta(instance.meta())
        .contained(instance.contained())
        .reviewer(instance.reviewer())
        .text(instance.text())
        .approvalDate(instance.approvalDate())
        .url(instance.url())
        .name(instance.name())
        .shortTitle(instance.shortTitle())
        .subtitle(instance.subtitle())
        .topic(instance.topic())
        .editor(instance.editor())
        .publisher(instance.publisher())
        .outcome(instance.outcome())
        .version(instance.version())
        .contact(instance.contact())
        .build();
  }

  /**
   * Creates a builder for {@link Evidence Evidence}.
   * <pre>
   * ImmutableEvidence.builder()
   *    .exposureVariant(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Evidence#exposureVariant() exposureVariant}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link Evidence#implicitRules() implicitRules}
   *    .jurisdiction(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Evidence#jurisdiction() jurisdiction}
   *    .status(com.medplum.types.fhir.EvidenceStatus) // optional {@link Evidence#status() status}
   *    .id(com.medplum.types.fhir.Id) // optional {@link Evidence#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Evidence#modifierExtension() modifierExtension}
   *    .description(com.medplum.types.fhir.Markdown) // optional {@link Evidence#description() description}
   *    .effectivePeriod(com.medplum.types.fhir.Period) // optional {@link Evidence#effectivePeriod() effectivePeriod}
   *    .resourceType(String) // required {@link Evidence#resourceType() resourceType}
   *    .language(com.medplum.types.fhir.Code) // optional {@link Evidence#language() language}
   *    .title(String) // optional {@link Evidence#title() title}
   *    .author(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link Evidence#author() author}
   *    .copyright(com.medplum.types.fhir.Markdown) // optional {@link Evidence#copyright() copyright}
   *    .exposureBackground(com.medplum.types.fhir.Reference) // required {@link Evidence#exposureBackground() exposureBackground}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Evidence#extension() extension}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link Evidence#identifier() identifier}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link Evidence#date() date}
   *    .endorser(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link Evidence#endorser() endorser}
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link Evidence#note() note}
   *    .useContext(List&amp;lt;com.medplum.types.fhir.UsageContext&amp;gt;) // optional {@link Evidence#useContext() useContext}
   *    .lastReviewDate(com.medplum.types.fhir.Date) // optional {@link Evidence#lastReviewDate() lastReviewDate}
   *    .relatedArtifact(List&amp;lt;com.medplum.types.fhir.RelatedArtifact&amp;gt;) // optional {@link Evidence#relatedArtifact() relatedArtifact}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link Evidence#meta() meta}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link Evidence#contained() contained}
   *    .reviewer(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link Evidence#reviewer() reviewer}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link Evidence#text() text}
   *    .approvalDate(com.medplum.types.fhir.Date) // optional {@link Evidence#approvalDate() approvalDate}
   *    .url(com.medplum.types.fhir.Uri) // optional {@link Evidence#url() url}
   *    .name(String) // optional {@link Evidence#name() name}
   *    .shortTitle(String) // optional {@link Evidence#shortTitle() shortTitle}
   *    .subtitle(String) // optional {@link Evidence#subtitle() subtitle}
   *    .topic(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Evidence#topic() topic}
   *    .editor(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link Evidence#editor() editor}
   *    .publisher(String) // optional {@link Evidence#publisher() publisher}
   *    .outcome(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Evidence#outcome() outcome}
   *    .version(String) // optional {@link Evidence#version() version}
   *    .contact(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link Evidence#contact() contact}
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
  @Generated(from = "Evidence", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, ExposureBackgroundBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_EXPOSURE_BACKGROUND = 0x2L;
    private static final long OPT_BIT_EXPOSURE_VARIANT = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2L;
    private static final long OPT_BIT_JURISDICTION = 0x4L;
    private static final long OPT_BIT_STATUS = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_DESCRIPTION = 0x40L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x80L;
    private static final long OPT_BIT_LANGUAGE = 0x100L;
    private static final long OPT_BIT_TITLE = 0x200L;
    private static final long OPT_BIT_AUTHOR = 0x400L;
    private static final long OPT_BIT_COPYRIGHT = 0x800L;
    private static final long OPT_BIT_EXTENSION = 0x1000L;
    private static final long OPT_BIT_IDENTIFIER = 0x2000L;
    private static final long OPT_BIT_DATE = 0x4000L;
    private static final long OPT_BIT_ENDORSER = 0x8000L;
    private static final long OPT_BIT_NOTE = 0x10000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x20000L;
    private static final long OPT_BIT_LAST_REVIEW_DATE = 0x40000L;
    private static final long OPT_BIT_RELATED_ARTIFACT = 0x80000L;
    private static final long OPT_BIT_META = 0x100000L;
    private static final long OPT_BIT_CONTAINED = 0x200000L;
    private static final long OPT_BIT_REVIEWER = 0x400000L;
    private static final long OPT_BIT_TEXT = 0x800000L;
    private static final long OPT_BIT_APPROVAL_DATE = 0x1000000L;
    private static final long OPT_BIT_URL = 0x2000000L;
    private static final long OPT_BIT_NAME = 0x4000000L;
    private static final long OPT_BIT_SHORT_TITLE = 0x8000000L;
    private static final long OPT_BIT_SUBTITLE = 0x10000000L;
    private static final long OPT_BIT_TOPIC = 0x20000000L;
    private static final long OPT_BIT_EDITOR = 0x40000000L;
    private static final long OPT_BIT_PUBLISHER = 0x80000000L;
    private static final long OPT_BIT_OUTCOME = 0x100000000L;
    private static final long OPT_BIT_VERSION = 0x200000000L;
    private static final long OPT_BIT_CONTACT = 0x400000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<Reference> exposureVariant;
    private @Nullable Uri implicitRules;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable EvidenceStatus status;
    private @Nullable Id id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Markdown description;
    private @Nullable Period effectivePeriod;
    private @Nullable String resourceType;
    private @Nullable Code language;
    private @Nullable String title;
    private @Nullable List<ContactDetail> author;
    private @Nullable Markdown copyright;
    private @Nullable Reference exposureBackground;
    private @Nullable List<Extension> extension;
    private @Nullable List<Identifier> identifier;
    private @Nullable DateTime date;
    private @Nullable List<ContactDetail> endorser;
    private @Nullable List<Annotation> note;
    private @Nullable List<UsageContext> useContext;
    private @Nullable Date lastReviewDate;
    private @Nullable List<RelatedArtifact> relatedArtifact;
    private @Nullable Meta meta;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<ContactDetail> reviewer;
    private @Nullable Narrative text;
    private @Nullable Date approvalDate;
    private @Nullable Uri url;
    private @Nullable String name;
    private @Nullable String shortTitle;
    private @Nullable String subtitle;
    private @Nullable List<CodeableConcept> topic;
    private @Nullable List<ContactDetail> editor;
    private @Nullable String publisher;
    private @Nullable List<Reference> outcome;
    private @Nullable String version;
    private @Nullable List<ContactDetail> contact;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Evidence#exposureVariant() exposureVariant} to exposureVariant.
     * @param exposureVariant The value for exposureVariant
     * @return {@code this} builder for chained invocation
     */
    public final Builder exposureVariant(List<Reference> exposureVariant) {
      checkNotIsSet(exposureVariantIsSet(), "exposureVariant");
      this.exposureVariant = Objects.requireNonNull(exposureVariant, "exposureVariant");
      optBits |= OPT_BIT_EXPOSURE_VARIANT;
      return this;
    }

    /**
     * Initializes the optional value {@link Evidence#exposureVariant() exposureVariant} to exposureVariant.
     * @param exposureVariant The value for exposureVariant
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("exposureVariant")
    public final Builder exposureVariant(Optional<? extends List<Reference>> exposureVariant) {
      checkNotIsSet(exposureVariantIsSet(), "exposureVariant");
      this.exposureVariant = exposureVariant.orElse(null);
      optBits |= OPT_BIT_EXPOSURE_VARIANT;
      return this;
    }

    /**
     * Initializes the optional value {@link Evidence#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Evidence#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Evidence#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link Evidence#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link Evidence#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(EvidenceStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Evidence#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends EvidenceStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Evidence#id() id} to id.
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
     * Initializes the optional value {@link Evidence#id() id} to id.
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
     * Initializes the optional value {@link Evidence#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Evidence#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Evidence#description() description} to description.
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
     * Initializes the optional value {@link Evidence#description() description} to description.
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
     * Initializes the optional value {@link Evidence#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link Evidence#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the value for the {@link Evidence#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Evidence#language() language} to language.
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
     * Initializes the optional value {@link Evidence#language() language} to language.
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
     * Initializes the optional value {@link Evidence#title() title} to title.
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
     * Initializes the optional value {@link Evidence#title() title} to title.
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
     * Initializes the optional value {@link Evidence#author() author} to author.
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
     * Initializes the optional value {@link Evidence#author() author} to author.
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
     * Initializes the optional value {@link Evidence#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link Evidence#copyright() copyright} to copyright.
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
     * Initializes the value for the {@link Evidence#exposureBackground() exposureBackground} attribute.
     * @param exposureBackground The value for exposureBackground 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("exposureBackground")
    public final Builder exposureBackground(Reference exposureBackground) {
      checkNotIsSet(exposureBackgroundIsSet(), "exposureBackground");
      this.exposureBackground = Objects.requireNonNull(exposureBackground, "exposureBackground");
      initBits &= ~INIT_BIT_EXPOSURE_BACKGROUND;
      return this;
    }

    /**
     * Initializes the optional value {@link Evidence#extension() extension} to extension.
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
     * Initializes the optional value {@link Evidence#extension() extension} to extension.
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
     * Initializes the optional value {@link Evidence#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Evidence#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Evidence#date() date} to date.
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
     * Initializes the optional value {@link Evidence#date() date} to date.
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
     * Initializes the optional value {@link Evidence#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link Evidence#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link Evidence#note() note} to note.
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
     * Initializes the optional value {@link Evidence#note() note} to note.
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
     * Initializes the optional value {@link Evidence#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link Evidence#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link Evidence#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link Evidence#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link Evidence#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link Evidence#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link Evidence#meta() meta} to meta.
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
     * Initializes the optional value {@link Evidence#meta() meta} to meta.
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
     * Initializes the optional value {@link Evidence#contained() contained} to contained.
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
     * Initializes the optional value {@link Evidence#contained() contained} to contained.
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
     * Initializes the optional value {@link Evidence#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link Evidence#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link Evidence#text() text} to text.
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
     * Initializes the optional value {@link Evidence#text() text} to text.
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
     * Initializes the optional value {@link Evidence#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link Evidence#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link Evidence#url() url} to url.
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
     * Initializes the optional value {@link Evidence#url() url} to url.
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
     * Initializes the optional value {@link Evidence#name() name} to name.
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
     * Initializes the optional value {@link Evidence#name() name} to name.
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
     * Initializes the optional value {@link Evidence#shortTitle() shortTitle} to shortTitle.
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
     * Initializes the optional value {@link Evidence#shortTitle() shortTitle} to shortTitle.
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
     * Initializes the optional value {@link Evidence#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link Evidence#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link Evidence#topic() topic} to topic.
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
     * Initializes the optional value {@link Evidence#topic() topic} to topic.
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
     * Initializes the optional value {@link Evidence#editor() editor} to editor.
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
     * Initializes the optional value {@link Evidence#editor() editor} to editor.
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
     * Initializes the optional value {@link Evidence#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link Evidence#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link Evidence#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcome(List<Reference> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = Objects.requireNonNull(outcome, "outcome");
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link Evidence#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outcome")
    public final Builder outcome(Optional<? extends List<Reference>> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = outcome.orElse(null);
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link Evidence#version() version} to version.
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
     * Initializes the optional value {@link Evidence#version() version} to version.
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
     * Initializes the optional value {@link Evidence#contact() contact} to contact.
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
     * Initializes the optional value {@link Evidence#contact() contact} to contact.
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
     * Builds a new {@link Evidence Evidence}.
     * @return An immutable instance of Evidence
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Evidence build() {
      checkRequiredAttributes();
      return new ImmutableEvidence(
          exposureVariant,
          implicitRules,
          jurisdiction,
          status,
          id,
          modifierExtension,
          description,
          effectivePeriod,
          resourceType,
          language,
          title,
          author,
          copyright,
          exposureBackground,
          extension,
          identifier,
          date,
          endorser,
          note,
          useContext,
          lastReviewDate,
          relatedArtifact,
          meta,
          contained,
          reviewer,
          text,
          approvalDate,
          url,
          name,
          shortTitle,
          subtitle,
          topic,
          editor,
          publisher,
          outcome,
          version,
          contact);
    }

    private boolean exposureVariantIsSet() {
      return (optBits & OPT_BIT_EXPOSURE_VARIANT) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean endorserIsSet() {
      return (optBits & OPT_BIT_ENDORSER) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean lastReviewDateIsSet() {
      return (optBits & OPT_BIT_LAST_REVIEW_DATE) != 0;
    }

    private boolean relatedArtifactIsSet() {
      return (optBits & OPT_BIT_RELATED_ARTIFACT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean reviewerIsSet() {
      return (optBits & OPT_BIT_REVIEWER) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean approvalDateIsSet() {
      return (optBits & OPT_BIT_APPROVAL_DATE) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean shortTitleIsSet() {
      return (optBits & OPT_BIT_SHORT_TITLE) != 0;
    }

    private boolean subtitleIsSet() {
      return (optBits & OPT_BIT_SUBTITLE) != 0;
    }

    private boolean topicIsSet() {
      return (optBits & OPT_BIT_TOPIC) != 0;
    }

    private boolean editorIsSet() {
      return (optBits & OPT_BIT_EDITOR) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean exposureBackgroundIsSet() {
      return (initBits & INIT_BIT_EXPOSURE_BACKGROUND) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Evidence is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!exposureBackgroundIsSet()) attributes.add("exposureBackground");
      return "Cannot build Evidence, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Evidence", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Evidence#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    ExposureBackgroundBuildStage resourceType(String resourceType);
  }

  @Generated(from = "Evidence", generator = "Immutables")
  public interface ExposureBackgroundBuildStage {
    /**
     * Initializes the value for the {@link Evidence#exposureBackground() exposureBackground} attribute.
     * @param exposureBackground The value for exposureBackground 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal exposureBackground(Reference exposureBackground);
  }

  @Generated(from = "Evidence", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Evidence#exposureVariant() exposureVariant} to exposureVariant.
     * @param exposureVariant The value for exposureVariant
     * @return {@code this} builder for chained invocation
     */
    BuildFinal exposureVariant(List<Reference> exposureVariant);

    /**
     * Initializes the optional value {@link Evidence#exposureVariant() exposureVariant} to exposureVariant.
     * @param exposureVariant The value for exposureVariant
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal exposureVariant(Optional<? extends List<Reference>> exposureVariant);

    /**
     * Initializes the optional value {@link Evidence#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Evidence#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Evidence#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(List<CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link Evidence#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link Evidence#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(EvidenceStatus status);

    /**
     * Initializes the optional value {@link Evidence#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends EvidenceStatus> status);

    /**
     * Initializes the optional value {@link Evidence#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Evidence#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Evidence#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Evidence#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Evidence#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(Markdown description);

    /**
     * Initializes the optional value {@link Evidence#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<? extends Markdown> description);

    /**
     * Initializes the optional value {@link Evidence#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(Period effectivePeriod);

    /**
     * Initializes the optional value {@link Evidence#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(Optional<? extends Period> effectivePeriod);

    /**
     * Initializes the optional value {@link Evidence#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Evidence#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Evidence#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link Evidence#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Initializes the optional value {@link Evidence#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(List<ContactDetail> author);

    /**
     * Initializes the optional value {@link Evidence#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(Optional<? extends List<ContactDetail>> author);

    /**
     * Initializes the optional value {@link Evidence#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(Markdown copyright);

    /**
     * Initializes the optional value {@link Evidence#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(Optional<? extends Markdown> copyright);

    /**
     * Initializes the optional value {@link Evidence#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Evidence#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Evidence#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Evidence#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Evidence#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link Evidence#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link Evidence#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endorser(List<ContactDetail> endorser);

    /**
     * Initializes the optional value {@link Evidence#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endorser(Optional<? extends List<ContactDetail>> endorser);

    /**
     * Initializes the optional value {@link Evidence#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link Evidence#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link Evidence#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(List<UsageContext> useContext);

    /**
     * Initializes the optional value {@link Evidence#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(Optional<? extends List<UsageContext>> useContext);

    /**
     * Initializes the optional value {@link Evidence#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastReviewDate(Date lastReviewDate);

    /**
     * Initializes the optional value {@link Evidence#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastReviewDate(Optional<? extends Date> lastReviewDate);

    /**
     * Initializes the optional value {@link Evidence#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatedArtifact(List<RelatedArtifact> relatedArtifact);

    /**
     * Initializes the optional value {@link Evidence#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatedArtifact(Optional<? extends List<RelatedArtifact>> relatedArtifact);

    /**
     * Initializes the optional value {@link Evidence#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Evidence#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Evidence#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Evidence#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Evidence#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reviewer(List<ContactDetail> reviewer);

    /**
     * Initializes the optional value {@link Evidence#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reviewer(Optional<? extends List<ContactDetail>> reviewer);

    /**
     * Initializes the optional value {@link Evidence#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Evidence#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Evidence#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal approvalDate(Date approvalDate);

    /**
     * Initializes the optional value {@link Evidence#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal approvalDate(Optional<? extends Date> approvalDate);

    /**
     * Initializes the optional value {@link Evidence#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link Evidence#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link Evidence#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link Evidence#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link Evidence#shortTitle() shortTitle} to shortTitle.
     * @param shortTitle The value for shortTitle
     * @return {@code this} builder for chained invocation
     */
    BuildFinal shortTitle(String shortTitle);

    /**
     * Initializes the optional value {@link Evidence#shortTitle() shortTitle} to shortTitle.
     * @param shortTitle The value for shortTitle
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal shortTitle(Optional<String> shortTitle);

    /**
     * Initializes the optional value {@link Evidence#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subtitle(String subtitle);

    /**
     * Initializes the optional value {@link Evidence#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subtitle(Optional<String> subtitle);

    /**
     * Initializes the optional value {@link Evidence#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topic(List<CodeableConcept> topic);

    /**
     * Initializes the optional value {@link Evidence#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topic(Optional<? extends List<CodeableConcept>> topic);

    /**
     * Initializes the optional value {@link Evidence#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal editor(List<ContactDetail> editor);

    /**
     * Initializes the optional value {@link Evidence#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal editor(Optional<? extends List<ContactDetail>> editor);

    /**
     * Initializes the optional value {@link Evidence#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(String publisher);

    /**
     * Initializes the optional value {@link Evidence#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<String> publisher);

    /**
     * Initializes the optional value {@link Evidence#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outcome(List<Reference> outcome);

    /**
     * Initializes the optional value {@link Evidence#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outcome(Optional<? extends List<Reference>> outcome);

    /**
     * Initializes the optional value {@link Evidence#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link Evidence#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link Evidence#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link Evidence#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Builds a new {@link Evidence Evidence}.
     * @return An immutable instance of Evidence
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Evidence build();
  }
}
