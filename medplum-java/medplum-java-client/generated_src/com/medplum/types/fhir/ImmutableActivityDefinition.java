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
 * Immutable implementation of {@link ActivityDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableActivityDefinition.builder()}.
 */
@Generated(from = "ActivityDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableActivityDefinition implements ActivityDefinition {
  private final @Nullable List<Identifier> identifier;
  private final @Nullable ActivitydefinitionStatus status;
  private final @Nullable String publisher;
  private final @Nullable List<ActivityDefinition_DynamicValue> dynamicValue;
  private final @Nullable List<Extension> extension;
  private final @Nullable Canonical transform;
  private final @Nullable Markdown purpose;
  private final @Nullable Quantity quantity;
  private final @Nullable Meta meta;
  private final @Nullable String title;
  private final @Nullable List<ActivityDefinition_Participant> participant;
  private final @Nullable DateTime date;
  private final @Nullable Reference productReference;
  private final @Nullable List<UsageContext> useContext;
  private final @Nullable Markdown copyright;
  private final @Nullable Date approvalDate;
  private final @Nullable CodeableConcept productCodeableConcept;
  private final @Nullable List<RelatedArtifact> relatedArtifact;
  private final @Nullable String usage;
  private final @Nullable Age timingAge;
  private final @Nullable Reference subjectReference;
  private final @Nullable List<ContactDetail> author;
  private final @Nullable Code intent;
  private final @Nullable Period effectivePeriod;
  private final @Nullable List<Reference> observationResultRequirement;
  private final @Nullable List<CodeableConcept> jurisdiction;
  private final @Nullable Code kind;
  private final @Nullable List<Canonical> library;
  private final @Nullable Id id;
  private final @Nullable List<CodeableConcept> bodySite;
  private final @Nullable List<ContactDetail> reviewer;
  private final @Nullable CodeableConcept code;
  private final @Nullable Timing timingTiming;
  private final @Nullable Uri url;
  private final @Nullable Narrative text;
  private final @Nullable Code language;
  private final @Nullable CodeableConcept subjectCodeableConcept;
  private final @Nullable List<ContactDetail> editor;
  private final @Nullable Range timingRange;
  private final @Nullable Boolean doNotPerform;
  private final @Nullable Date lastReviewDate;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Reference location;
  private final @Nullable String version;
  private final @Nullable String timingDateTime;
  private final @Nullable String subtitle;
  private final @Nullable List<ResourceList> contained;
  private final String resourceType;
  private final @Nullable Duration timingDuration;
  private final @Nullable Uri implicitRules;
  private final @Nullable Code priority;
  private final @Nullable List<Reference> observationRequirement;
  private final @Nullable List<Dosage> dosage;
  private final @Nullable List<ContactDetail> contact;
  private final @Nullable String name;
  private final @Nullable List<CodeableConcept> topic;
  private final @Nullable List<ContactDetail> endorser;
  private final @Nullable Markdown description;
  private final @Nullable Boolean experimental;
  private final @Nullable Canonical profile;
  private final @Nullable Period timingPeriod;
  private final @Nullable List<Reference> specimenRequirement;

  private ImmutableActivityDefinition(
      @Nullable List<Identifier> identifier,
      @Nullable ActivitydefinitionStatus status,
      @Nullable String publisher,
      @Nullable List<ActivityDefinition_DynamicValue> dynamicValue,
      @Nullable List<Extension> extension,
      @Nullable Canonical transform,
      @Nullable Markdown purpose,
      @Nullable Quantity quantity,
      @Nullable Meta meta,
      @Nullable String title,
      @Nullable List<ActivityDefinition_Participant> participant,
      @Nullable DateTime date,
      @Nullable Reference productReference,
      @Nullable List<UsageContext> useContext,
      @Nullable Markdown copyright,
      @Nullable Date approvalDate,
      @Nullable CodeableConcept productCodeableConcept,
      @Nullable List<RelatedArtifact> relatedArtifact,
      @Nullable String usage,
      @Nullable Age timingAge,
      @Nullable Reference subjectReference,
      @Nullable List<ContactDetail> author,
      @Nullable Code intent,
      @Nullable Period effectivePeriod,
      @Nullable List<Reference> observationResultRequirement,
      @Nullable List<CodeableConcept> jurisdiction,
      @Nullable Code kind,
      @Nullable List<Canonical> library,
      @Nullable Id id,
      @Nullable List<CodeableConcept> bodySite,
      @Nullable List<ContactDetail> reviewer,
      @Nullable CodeableConcept code,
      @Nullable Timing timingTiming,
      @Nullable Uri url,
      @Nullable Narrative text,
      @Nullable Code language,
      @Nullable CodeableConcept subjectCodeableConcept,
      @Nullable List<ContactDetail> editor,
      @Nullable Range timingRange,
      @Nullable Boolean doNotPerform,
      @Nullable Date lastReviewDate,
      @Nullable List<Extension> modifierExtension,
      @Nullable Reference location,
      @Nullable String version,
      @Nullable String timingDateTime,
      @Nullable String subtitle,
      @Nullable List<ResourceList> contained,
      String resourceType,
      @Nullable Duration timingDuration,
      @Nullable Uri implicitRules,
      @Nullable Code priority,
      @Nullable List<Reference> observationRequirement,
      @Nullable List<Dosage> dosage,
      @Nullable List<ContactDetail> contact,
      @Nullable String name,
      @Nullable List<CodeableConcept> topic,
      @Nullable List<ContactDetail> endorser,
      @Nullable Markdown description,
      @Nullable Boolean experimental,
      @Nullable Canonical profile,
      @Nullable Period timingPeriod,
      @Nullable List<Reference> specimenRequirement) {
    this.identifier = identifier;
    this.status = status;
    this.publisher = publisher;
    this.dynamicValue = dynamicValue;
    this.extension = extension;
    this.transform = transform;
    this.purpose = purpose;
    this.quantity = quantity;
    this.meta = meta;
    this.title = title;
    this.participant = participant;
    this.date = date;
    this.productReference = productReference;
    this.useContext = useContext;
    this.copyright = copyright;
    this.approvalDate = approvalDate;
    this.productCodeableConcept = productCodeableConcept;
    this.relatedArtifact = relatedArtifact;
    this.usage = usage;
    this.timingAge = timingAge;
    this.subjectReference = subjectReference;
    this.author = author;
    this.intent = intent;
    this.effectivePeriod = effectivePeriod;
    this.observationResultRequirement = observationResultRequirement;
    this.jurisdiction = jurisdiction;
    this.kind = kind;
    this.library = library;
    this.id = id;
    this.bodySite = bodySite;
    this.reviewer = reviewer;
    this.code = code;
    this.timingTiming = timingTiming;
    this.url = url;
    this.text = text;
    this.language = language;
    this.subjectCodeableConcept = subjectCodeableConcept;
    this.editor = editor;
    this.timingRange = timingRange;
    this.doNotPerform = doNotPerform;
    this.lastReviewDate = lastReviewDate;
    this.modifierExtension = modifierExtension;
    this.location = location;
    this.version = version;
    this.timingDateTime = timingDateTime;
    this.subtitle = subtitle;
    this.contained = contained;
    this.resourceType = resourceType;
    this.timingDuration = timingDuration;
    this.implicitRules = implicitRules;
    this.priority = priority;
    this.observationRequirement = observationRequirement;
    this.dosage = dosage;
    this.contact = contact;
    this.name = name;
    this.topic = topic;
    this.endorser = endorser;
    this.description = description;
    this.experimental = experimental;
    this.profile = profile;
    this.timingPeriod = timingPeriod;
    this.specimenRequirement = specimenRequirement;
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<ActivitydefinitionStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code dynamicValue} attribute
   */
  @JsonProperty("dynamicValue")
  @Override
  public Optional<List<ActivityDefinition_DynamicValue>> dynamicValue() {
    return Optional.ofNullable(dynamicValue);
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
   * @return The value of the {@code transform} attribute
   */
  @JsonProperty("transform")
  @Override
  public Optional<Canonical> transform() {
    return Optional.ofNullable(transform);
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
   * @return The value of the {@code quantity} attribute
   */
  @JsonProperty("quantity")
  @Override
  public Optional<Quantity> quantity() {
    return Optional.ofNullable(quantity);
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
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
  }

  /**
   * @return The value of the {@code participant} attribute
   */
  @JsonProperty("participant")
  @Override
  public Optional<List<ActivityDefinition_Participant>> participant() {
    return Optional.ofNullable(participant);
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
   * @return The value of the {@code productReference} attribute
   */
  @JsonProperty("productReference")
  @Override
  public Optional<Reference> productReference() {
    return Optional.ofNullable(productReference);
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
   * @return The value of the {@code copyright} attribute
   */
  @JsonProperty("copyright")
  @Override
  public Optional<Markdown> copyright() {
    return Optional.ofNullable(copyright);
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
   * @return The value of the {@code productCodeableConcept} attribute
   */
  @JsonProperty("productCodeableConcept")
  @Override
  public Optional<CodeableConcept> productCodeableConcept() {
    return Optional.ofNullable(productCodeableConcept);
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
   * @return The value of the {@code usage} attribute
   */
  @JsonProperty("usage")
  @Override
  public Optional<String> usage() {
    return Optional.ofNullable(usage);
  }

  /**
   * @return The value of the {@code timingAge} attribute
   */
  @JsonProperty("timingAge")
  @Override
  public Optional<Age> timingAge() {
    return Optional.ofNullable(timingAge);
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
   * @return The value of the {@code author} attribute
   */
  @JsonProperty("author")
  @Override
  public Optional<List<ContactDetail>> author() {
    return Optional.ofNullable(author);
  }

  /**
   * @return The value of the {@code intent} attribute
   */
  @JsonProperty("intent")
  @Override
  public Optional<Code> intent() {
    return Optional.ofNullable(intent);
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
   * @return The value of the {@code observationResultRequirement} attribute
   */
  @JsonProperty("observationResultRequirement")
  @Override
  public Optional<List<Reference>> observationResultRequirement() {
    return Optional.ofNullable(observationResultRequirement);
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
   * @return The value of the {@code kind} attribute
   */
  @JsonProperty("kind")
  @Override
  public Optional<Code> kind() {
    return Optional.ofNullable(kind);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code bodySite} attribute
   */
  @JsonProperty("bodySite")
  @Override
  public Optional<List<CodeableConcept>> bodySite() {
    return Optional.ofNullable(bodySite);
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<CodeableConcept> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code timingTiming} attribute
   */
  @JsonProperty("timingTiming")
  @Override
  public Optional<Timing> timingTiming() {
    return Optional.ofNullable(timingTiming);
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
   * @return The value of the {@code subjectCodeableConcept} attribute
   */
  @JsonProperty("subjectCodeableConcept")
  @Override
  public Optional<CodeableConcept> subjectCodeableConcept() {
    return Optional.ofNullable(subjectCodeableConcept);
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
   * @return The value of the {@code timingRange} attribute
   */
  @JsonProperty("timingRange")
  @Override
  public Optional<Range> timingRange() {
    return Optional.ofNullable(timingRange);
  }

  /**
   * @return The value of the {@code doNotPerform} attribute
   */
  @JsonProperty("doNotPerform")
  @Override
  public Optional<Boolean> doNotPerform() {
    return Optional.ofNullable(doNotPerform);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code location} attribute
   */
  @JsonProperty("location")
  @Override
  public Optional<Reference> location() {
    return Optional.ofNullable(location);
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
   * @return The value of the {@code timingDateTime} attribute
   */
  @JsonProperty("timingDateTime")
  @Override
  public Optional<String> timingDateTime() {
    return Optional.ofNullable(timingDateTime);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code timingDuration} attribute
   */
  @JsonProperty("timingDuration")
  @Override
  public Optional<Duration> timingDuration() {
    return Optional.ofNullable(timingDuration);
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
   * @return The value of the {@code priority} attribute
   */
  @JsonProperty("priority")
  @Override
  public Optional<Code> priority() {
    return Optional.ofNullable(priority);
  }

  /**
   * @return The value of the {@code observationRequirement} attribute
   */
  @JsonProperty("observationRequirement")
  @Override
  public Optional<List<Reference>> observationRequirement() {
    return Optional.ofNullable(observationRequirement);
  }

  /**
   * @return The value of the {@code dosage} attribute
   */
  @JsonProperty("dosage")
  @Override
  public Optional<List<Dosage>> dosage() {
    return Optional.ofNullable(dosage);
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
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
   * @return The value of the {@code endorser} attribute
   */
  @JsonProperty("endorser")
  @Override
  public Optional<List<ContactDetail>> endorser() {
    return Optional.ofNullable(endorser);
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
   * @return The value of the {@code experimental} attribute
   */
  @JsonProperty("experimental")
  @Override
  public Optional<Boolean> experimental() {
    return Optional.ofNullable(experimental);
  }

  /**
   * @return The value of the {@code profile} attribute
   */
  @JsonProperty("profile")
  @Override
  public Optional<Canonical> profile() {
    return Optional.ofNullable(profile);
  }

  /**
   * @return The value of the {@code timingPeriod} attribute
   */
  @JsonProperty("timingPeriod")
  @Override
  public Optional<Period> timingPeriod() {
    return Optional.ofNullable(timingPeriod);
  }

  /**
   * @return The value of the {@code specimenRequirement} attribute
   */
  @JsonProperty("specimenRequirement")
  @Override
  public Optional<List<Reference>> specimenRequirement() {
    return Optional.ofNullable(specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableActivityDefinition(
        newValue,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableActivityDefinition(
        value,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withStatus(ActivitydefinitionStatus value) {
    @Nullable ActivitydefinitionStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        newValue,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withStatus(Optional<? extends ActivitydefinitionStatus> optional) {
    @Nullable ActivitydefinitionStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        value,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withPublisher(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "publisher");
    if (Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        newValue,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withPublisher(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.publisher, value)) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        value,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#dynamicValue() dynamicValue} attribute.
   * @param value The value for dynamicValue
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withDynamicValue(List<ActivityDefinition_DynamicValue> value) {
    @Nullable List<ActivityDefinition_DynamicValue> newValue = Objects.requireNonNull(value, "dynamicValue");
    if (this.dynamicValue == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        newValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#dynamicValue() dynamicValue} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dynamicValue
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withDynamicValue(Optional<? extends List<ActivityDefinition_DynamicValue>> optional) {
    @Nullable List<ActivityDefinition_DynamicValue> value = optional.orElse(null);
    if (this.dynamicValue == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        value,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        newValue,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        value,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#transform() transform} attribute.
   * @param value The value for transform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withTransform(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "transform");
    if (this.transform == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        newValue,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#transform() transform} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for transform
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withTransform(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.transform == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        value,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withPurpose(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        newValue,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withPurpose(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        value,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        newValue,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        value,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        newValue,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        value,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        newValue,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        value,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#participant() participant} attribute.
   * @param value The value for participant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withParticipant(List<ActivityDefinition_Participant> value) {
    @Nullable List<ActivityDefinition_Participant> newValue = Objects.requireNonNull(value, "participant");
    if (this.participant == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        newValue,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#participant() participant} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participant
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withParticipant(Optional<? extends List<ActivityDefinition_Participant>> optional) {
    @Nullable List<ActivityDefinition_Participant> value = optional.orElse(null);
    if (this.participant == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        value,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        newValue,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        value,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#productReference() productReference} attribute.
   * @param value The value for productReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withProductReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "productReference");
    if (this.productReference == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        newValue,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#productReference() productReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withProductReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.productReference == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        value,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withUseContext(List<UsageContext> value) {
    @Nullable List<UsageContext> newValue = Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        newValue,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withUseContext(Optional<? extends List<UsageContext>> optional) {
    @Nullable List<UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        value,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withCopyright(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        newValue,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withCopyright(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        value,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#approvalDate() approvalDate} attribute.
   * @param value The value for approvalDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withApprovalDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "approvalDate");
    if (this.approvalDate == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        newValue,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#approvalDate() approvalDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for approvalDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withApprovalDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.approvalDate == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        value,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#productCodeableConcept() productCodeableConcept} attribute.
   * @param value The value for productCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withProductCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "productCodeableConcept");
    if (this.productCodeableConcept == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        newValue,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#productCodeableConcept() productCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withProductCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.productCodeableConcept == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        value,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#relatedArtifact() relatedArtifact} attribute.
   * @param value The value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withRelatedArtifact(List<RelatedArtifact> value) {
    @Nullable List<RelatedArtifact> newValue = Objects.requireNonNull(value, "relatedArtifact");
    if (this.relatedArtifact == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        newValue,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#relatedArtifact() relatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withRelatedArtifact(Optional<? extends List<RelatedArtifact>> optional) {
    @Nullable List<RelatedArtifact> value = optional.orElse(null);
    if (this.relatedArtifact == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        value,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#usage() usage} attribute.
   * @param value The value for usage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withUsage(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "usage");
    if (Objects.equals(this.usage, newValue)) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        newValue,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#usage() usage} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withUsage(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.usage, value)) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        value,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#timingAge() timingAge} attribute.
   * @param value The value for timingAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withTimingAge(Age value) {
    @Nullable Age newValue = Objects.requireNonNull(value, "timingAge");
    if (this.timingAge == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        newValue,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#timingAge() timingAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withTimingAge(Optional<? extends Age> optional) {
    @Nullable Age value = optional.orElse(null);
    if (this.timingAge == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        value,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#subjectReference() subjectReference} attribute.
   * @param value The value for subjectReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withSubjectReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subjectReference");
    if (this.subjectReference == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        newValue,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#subjectReference() subjectReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withSubjectReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subjectReference == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        value,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withAuthor(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        newValue,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withAuthor(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        value,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#intent() intent} attribute.
   * @param value The value for intent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withIntent(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "intent");
    if (this.intent == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        newValue,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#intent() intent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withIntent(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.intent == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        value,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withEffectivePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        newValue,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withEffectivePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        value,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#observationResultRequirement() observationResultRequirement} attribute.
   * @param value The value for observationResultRequirement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withObservationResultRequirement(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "observationResultRequirement");
    if (this.observationResultRequirement == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        newValue,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#observationResultRequirement() observationResultRequirement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for observationResultRequirement
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withObservationResultRequirement(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.observationResultRequirement == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        value,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        newValue,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        value,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#kind() kind} attribute.
   * @param value The value for kind
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withKind(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "kind");
    if (this.kind == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        newValue,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#kind() kind} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for kind
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withKind(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.kind == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        value,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#library() library} attribute.
   * @param value The value for library
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withLibrary(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "library");
    if (this.library == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        newValue,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#library() library} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for library
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withLibrary(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.library == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        value,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        newValue,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        value,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#bodySite() bodySite} attribute.
   * @param value The value for bodySite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withBodySite(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "bodySite");
    if (this.bodySite == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        newValue,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#bodySite() bodySite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodySite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withBodySite(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.bodySite == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        value,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#reviewer() reviewer} attribute.
   * @param value The value for reviewer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withReviewer(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "reviewer");
    if (this.reviewer == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        newValue,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#reviewer() reviewer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reviewer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withReviewer(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.reviewer == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        value,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        newValue,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        value,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#timingTiming() timingTiming} attribute.
   * @param value The value for timingTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withTimingTiming(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "timingTiming");
    if (this.timingTiming == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        newValue,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#timingTiming() timingTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withTimingTiming(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.timingTiming == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        value,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        newValue,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        value,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        newValue,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        value,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        newValue,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        value,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * @param value The value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withSubjectCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "subjectCodeableConcept");
    if (this.subjectCodeableConcept == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        newValue,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withSubjectCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.subjectCodeableConcept == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        value,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#editor() editor} attribute.
   * @param value The value for editor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withEditor(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "editor");
    if (this.editor == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        newValue,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#editor() editor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for editor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withEditor(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.editor == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        value,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#timingRange() timingRange} attribute.
   * @param value The value for timingRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withTimingRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "timingRange");
    if (this.timingRange == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        newValue,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#timingRange() timingRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withTimingRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.timingRange == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        value,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#doNotPerform() doNotPerform} attribute.
   * @param value The value for doNotPerform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withDoNotPerform(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.doNotPerform, newValue)) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        newValue,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#doNotPerform() doNotPerform} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doNotPerform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withDoNotPerform(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.doNotPerform, value)) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        value,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#lastReviewDate() lastReviewDate} attribute.
   * @param value The value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withLastReviewDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "lastReviewDate");
    if (this.lastReviewDate == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        newValue,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#lastReviewDate() lastReviewDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withLastReviewDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.lastReviewDate == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        value,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        newValue,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        value,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withLocation(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        newValue,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withLocation(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        value,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        newValue,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        value,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#timingDateTime() timingDateTime} attribute.
   * @param value The value for timingDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withTimingDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "timingDateTime");
    if (Objects.equals(this.timingDateTime, newValue)) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        newValue,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#timingDateTime() timingDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withTimingDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.timingDateTime, value)) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        value,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#subtitle() subtitle} attribute.
   * @param value The value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withSubtitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "subtitle");
    if (Objects.equals(this.subtitle, newValue)) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        newValue,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#subtitle() subtitle} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withSubtitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.subtitle, value)) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        value,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        newValue,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        value,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ActivityDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableActivityDefinition withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        newValue,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#timingDuration() timingDuration} attribute.
   * @param value The value for timingDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withTimingDuration(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "timingDuration");
    if (this.timingDuration == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        newValue,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#timingDuration() timingDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withTimingDuration(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.timingDuration == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        value,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        newValue,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        value,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withPriority(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        newValue,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withPriority(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        value,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#observationRequirement() observationRequirement} attribute.
   * @param value The value for observationRequirement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withObservationRequirement(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "observationRequirement");
    if (this.observationRequirement == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        newValue,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#observationRequirement() observationRequirement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for observationRequirement
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withObservationRequirement(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.observationRequirement == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        value,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#dosage() dosage} attribute.
   * @param value The value for dosage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withDosage(List<Dosage> value) {
    @Nullable List<Dosage> newValue = Objects.requireNonNull(value, "dosage");
    if (this.dosage == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        newValue,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#dosage() dosage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dosage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withDosage(Optional<? extends List<Dosage>> optional) {
    @Nullable List<Dosage> value = optional.orElse(null);
    if (this.dosage == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        value,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        newValue,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        value,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        newValue,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        value,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#topic() topic} attribute.
   * @param value The value for topic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withTopic(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "topic");
    if (this.topic == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        newValue,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#topic() topic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withTopic(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.topic == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        value,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#endorser() endorser} attribute.
   * @param value The value for endorser
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withEndorser(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "endorser");
    if (this.endorser == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        newValue,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#endorser() endorser} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endorser
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withEndorser(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.endorser == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        value,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        newValue,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        value,
        this.experimental,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withExperimental(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        newValue,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withExperimental(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.experimental, value)) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        value,
        this.profile,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#profile() profile} attribute.
   * @param value The value for profile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withProfile(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "profile");
    if (this.profile == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        newValue,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#profile() profile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for profile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withProfile(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.profile == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        value,
        this.timingPeriod,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#timingPeriod() timingPeriod} attribute.
   * @param value The value for timingPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withTimingPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "timingPeriod");
    if (this.timingPeriod == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        newValue,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#timingPeriod() timingPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withTimingPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.timingPeriod == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        value,
        this.specimenRequirement);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#specimenRequirement() specimenRequirement} attribute.
   * @param value The value for specimenRequirement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withSpecimenRequirement(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "specimenRequirement");
    if (this.specimenRequirement == newValue) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#specimenRequirement() specimenRequirement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specimenRequirement
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withSpecimenRequirement(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.specimenRequirement == value) return this;
    return new ImmutableActivityDefinition(
        this.identifier,
        this.status,
        this.publisher,
        this.dynamicValue,
        this.extension,
        this.transform,
        this.purpose,
        this.quantity,
        this.meta,
        this.title,
        this.participant,
        this.date,
        this.productReference,
        this.useContext,
        this.copyright,
        this.approvalDate,
        this.productCodeableConcept,
        this.relatedArtifact,
        this.usage,
        this.timingAge,
        this.subjectReference,
        this.author,
        this.intent,
        this.effectivePeriod,
        this.observationResultRequirement,
        this.jurisdiction,
        this.kind,
        this.library,
        this.id,
        this.bodySite,
        this.reviewer,
        this.code,
        this.timingTiming,
        this.url,
        this.text,
        this.language,
        this.subjectCodeableConcept,
        this.editor,
        this.timingRange,
        this.doNotPerform,
        this.lastReviewDate,
        this.modifierExtension,
        this.location,
        this.version,
        this.timingDateTime,
        this.subtitle,
        this.contained,
        this.resourceType,
        this.timingDuration,
        this.implicitRules,
        this.priority,
        this.observationRequirement,
        this.dosage,
        this.contact,
        this.name,
        this.topic,
        this.endorser,
        this.description,
        this.experimental,
        this.profile,
        this.timingPeriod,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableActivityDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableActivityDefinition
        && equalTo((ImmutableActivityDefinition) another);
  }

  private boolean equalTo(ImmutableActivityDefinition another) {
    return Objects.equals(identifier, another.identifier)
        && Objects.equals(status, another.status)
        && Objects.equals(publisher, another.publisher)
        && Objects.equals(dynamicValue, another.dynamicValue)
        && Objects.equals(extension, another.extension)
        && Objects.equals(transform, another.transform)
        && Objects.equals(purpose, another.purpose)
        && Objects.equals(quantity, another.quantity)
        && Objects.equals(meta, another.meta)
        && Objects.equals(title, another.title)
        && Objects.equals(participant, another.participant)
        && Objects.equals(date, another.date)
        && Objects.equals(productReference, another.productReference)
        && Objects.equals(useContext, another.useContext)
        && Objects.equals(copyright, another.copyright)
        && Objects.equals(approvalDate, another.approvalDate)
        && Objects.equals(productCodeableConcept, another.productCodeableConcept)
        && Objects.equals(relatedArtifact, another.relatedArtifact)
        && Objects.equals(usage, another.usage)
        && Objects.equals(timingAge, another.timingAge)
        && Objects.equals(subjectReference, another.subjectReference)
        && Objects.equals(author, another.author)
        && Objects.equals(intent, another.intent)
        && Objects.equals(effectivePeriod, another.effectivePeriod)
        && Objects.equals(observationResultRequirement, another.observationResultRequirement)
        && Objects.equals(jurisdiction, another.jurisdiction)
        && Objects.equals(kind, another.kind)
        && Objects.equals(library, another.library)
        && Objects.equals(id, another.id)
        && Objects.equals(bodySite, another.bodySite)
        && Objects.equals(reviewer, another.reviewer)
        && Objects.equals(code, another.code)
        && Objects.equals(timingTiming, another.timingTiming)
        && Objects.equals(url, another.url)
        && Objects.equals(text, another.text)
        && Objects.equals(language, another.language)
        && Objects.equals(subjectCodeableConcept, another.subjectCodeableConcept)
        && Objects.equals(editor, another.editor)
        && Objects.equals(timingRange, another.timingRange)
        && Objects.equals(doNotPerform, another.doNotPerform)
        && Objects.equals(lastReviewDate, another.lastReviewDate)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(location, another.location)
        && Objects.equals(version, another.version)
        && Objects.equals(timingDateTime, another.timingDateTime)
        && Objects.equals(subtitle, another.subtitle)
        && Objects.equals(contained, another.contained)
        && resourceType.equals(another.resourceType)
        && Objects.equals(timingDuration, another.timingDuration)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(priority, another.priority)
        && Objects.equals(observationRequirement, another.observationRequirement)
        && Objects.equals(dosage, another.dosage)
        && Objects.equals(contact, another.contact)
        && Objects.equals(name, another.name)
        && Objects.equals(topic, another.topic)
        && Objects.equals(endorser, another.endorser)
        && Objects.equals(description, another.description)
        && Objects.equals(experimental, another.experimental)
        && Objects.equals(profile, another.profile)
        && Objects.equals(timingPeriod, another.timingPeriod)
        && Objects.equals(specimenRequirement, another.specimenRequirement);
  }

  /**
   * Computes a hash code from attributes: {@code identifier}, {@code status}, {@code publisher}, {@code dynamicValue}, {@code extension}, {@code transform}, {@code purpose}, {@code quantity}, {@code meta}, {@code title}, {@code participant}, {@code date}, {@code productReference}, {@code useContext}, {@code copyright}, {@code approvalDate}, {@code productCodeableConcept}, {@code relatedArtifact}, {@code usage}, {@code timingAge}, {@code subjectReference}, {@code author}, {@code intent}, {@code effectivePeriod}, {@code observationResultRequirement}, {@code jurisdiction}, {@code kind}, {@code library}, {@code id}, {@code bodySite}, {@code reviewer}, {@code code}, {@code timingTiming}, {@code url}, {@code text}, {@code language}, {@code subjectCodeableConcept}, {@code editor}, {@code timingRange}, {@code doNotPerform}, {@code lastReviewDate}, {@code modifierExtension}, {@code location}, {@code version}, {@code timingDateTime}, {@code subtitle}, {@code contained}, {@code resourceType}, {@code timingDuration}, {@code implicitRules}, {@code priority}, {@code observationRequirement}, {@code dosage}, {@code contact}, {@code name}, {@code topic}, {@code endorser}, {@code description}, {@code experimental}, {@code profile}, {@code timingPeriod}, {@code specimenRequirement}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(publisher);
    h += (h << 5) + Objects.hashCode(dynamicValue);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(transform);
    h += (h << 5) + Objects.hashCode(purpose);
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(participant);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(productReference);
    h += (h << 5) + Objects.hashCode(useContext);
    h += (h << 5) + Objects.hashCode(copyright);
    h += (h << 5) + Objects.hashCode(approvalDate);
    h += (h << 5) + Objects.hashCode(productCodeableConcept);
    h += (h << 5) + Objects.hashCode(relatedArtifact);
    h += (h << 5) + Objects.hashCode(usage);
    h += (h << 5) + Objects.hashCode(timingAge);
    h += (h << 5) + Objects.hashCode(subjectReference);
    h += (h << 5) + Objects.hashCode(author);
    h += (h << 5) + Objects.hashCode(intent);
    h += (h << 5) + Objects.hashCode(effectivePeriod);
    h += (h << 5) + Objects.hashCode(observationResultRequirement);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    h += (h << 5) + Objects.hashCode(kind);
    h += (h << 5) + Objects.hashCode(library);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(bodySite);
    h += (h << 5) + Objects.hashCode(reviewer);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(timingTiming);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(subjectCodeableConcept);
    h += (h << 5) + Objects.hashCode(editor);
    h += (h << 5) + Objects.hashCode(timingRange);
    h += (h << 5) + Objects.hashCode(doNotPerform);
    h += (h << 5) + Objects.hashCode(lastReviewDate);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(location);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(timingDateTime);
    h += (h << 5) + Objects.hashCode(subtitle);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(timingDuration);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(priority);
    h += (h << 5) + Objects.hashCode(observationRequirement);
    h += (h << 5) + Objects.hashCode(dosage);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(topic);
    h += (h << 5) + Objects.hashCode(endorser);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(experimental);
    h += (h << 5) + Objects.hashCode(profile);
    h += (h << 5) + Objects.hashCode(timingPeriod);
    h += (h << 5) + Objects.hashCode(specimenRequirement);
    return h;
  }

  /**
   * Prints the immutable value {@code ActivityDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ActivityDefinition{");
    if (identifier != null) {
      builder.append("identifier=").append(identifier);
    }
    if (status != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (publisher != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (dynamicValue != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("dynamicValue=").append(dynamicValue);
    }
    if (extension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (transform != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("transform=").append(transform);
    }
    if (purpose != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (quantity != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (meta != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (title != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (participant != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("participant=").append(participant);
    }
    if (date != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (productReference != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("productReference=").append(productReference);
    }
    if (useContext != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (copyright != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (approvalDate != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("approvalDate=").append(approvalDate);
    }
    if (productCodeableConcept != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("productCodeableConcept=").append(productCodeableConcept);
    }
    if (relatedArtifact != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("relatedArtifact=").append(relatedArtifact);
    }
    if (usage != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("usage=").append(usage);
    }
    if (timingAge != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("timingAge=").append(timingAge);
    }
    if (subjectReference != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("subjectReference=").append(subjectReference);
    }
    if (author != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("author=").append(author);
    }
    if (intent != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("intent=").append(intent);
    }
    if (effectivePeriod != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (observationResultRequirement != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("observationResultRequirement=").append(observationResultRequirement);
    }
    if (jurisdiction != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (kind != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("kind=").append(kind);
    }
    if (library != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("library=").append(library);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (bodySite != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("bodySite=").append(bodySite);
    }
    if (reviewer != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("reviewer=").append(reviewer);
    }
    if (code != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (timingTiming != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("timingTiming=").append(timingTiming);
    }
    if (url != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (text != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (language != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (subjectCodeableConcept != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("subjectCodeableConcept=").append(subjectCodeableConcept);
    }
    if (editor != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("editor=").append(editor);
    }
    if (timingRange != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("timingRange=").append(timingRange);
    }
    if (doNotPerform != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("doNotPerform=").append(doNotPerform);
    }
    if (lastReviewDate != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("lastReviewDate=").append(lastReviewDate);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (location != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("location=").append(location);
    }
    if (version != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (timingDateTime != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("timingDateTime=").append(timingDateTime);
    }
    if (subtitle != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("subtitle=").append(subtitle);
    }
    if (contained != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (timingDuration != null) {
      builder.append(", ");
      builder.append("timingDuration=").append(timingDuration);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (priority != null) {
      builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (observationRequirement != null) {
      builder.append(", ");
      builder.append("observationRequirement=").append(observationRequirement);
    }
    if (dosage != null) {
      builder.append(", ");
      builder.append("dosage=").append(dosage);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (topic != null) {
      builder.append(", ");
      builder.append("topic=").append(topic);
    }
    if (endorser != null) {
      builder.append(", ");
      builder.append("endorser=").append(endorser);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (experimental != null) {
      builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (profile != null) {
      builder.append(", ");
      builder.append("profile=").append(profile);
    }
    if (timingPeriod != null) {
      builder.append(", ");
      builder.append("timingPeriod=").append(timingPeriod);
    }
    if (specimenRequirement != null) {
      builder.append(", ");
      builder.append("specimenRequirement=").append(specimenRequirement);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ActivityDefinition", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ActivityDefinition {
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<ActivitydefinitionStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<String> publisher = Optional.empty();
    boolean publisherIsSet;
    @Nullable Optional<List<ActivityDefinition_DynamicValue>> dynamicValue = Optional.empty();
    boolean dynamicValueIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Canonical> transform = Optional.empty();
    boolean transformIsSet;
    @Nullable Optional<Markdown> purpose = Optional.empty();
    boolean purposeIsSet;
    @Nullable Optional<Quantity> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<List<ActivityDefinition_Participant>> participant = Optional.empty();
    boolean participantIsSet;
    @Nullable Optional<DateTime> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<Reference> productReference = Optional.empty();
    boolean productReferenceIsSet;
    @Nullable Optional<List<UsageContext>> useContext = Optional.empty();
    boolean useContextIsSet;
    @Nullable Optional<Markdown> copyright = Optional.empty();
    boolean copyrightIsSet;
    @Nullable Optional<Date> approvalDate = Optional.empty();
    boolean approvalDateIsSet;
    @Nullable Optional<CodeableConcept> productCodeableConcept = Optional.empty();
    boolean productCodeableConceptIsSet;
    @Nullable Optional<List<RelatedArtifact>> relatedArtifact = Optional.empty();
    boolean relatedArtifactIsSet;
    @Nullable Optional<String> usage = Optional.empty();
    boolean usageIsSet;
    @Nullable Optional<Age> timingAge = Optional.empty();
    boolean timingAgeIsSet;
    @Nullable Optional<Reference> subjectReference = Optional.empty();
    boolean subjectReferenceIsSet;
    @Nullable Optional<List<ContactDetail>> author = Optional.empty();
    boolean authorIsSet;
    @Nullable Optional<Code> intent = Optional.empty();
    boolean intentIsSet;
    @Nullable Optional<Period> effectivePeriod = Optional.empty();
    boolean effectivePeriodIsSet;
    @Nullable Optional<List<Reference>> observationResultRequirement = Optional.empty();
    boolean observationResultRequirementIsSet;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @Nullable Optional<Code> kind = Optional.empty();
    boolean kindIsSet;
    @Nullable Optional<List<Canonical>> library = Optional.empty();
    boolean libraryIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<CodeableConcept>> bodySite = Optional.empty();
    boolean bodySiteIsSet;
    @Nullable Optional<List<ContactDetail>> reviewer = Optional.empty();
    boolean reviewerIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<Timing> timingTiming = Optional.empty();
    boolean timingTimingIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<CodeableConcept> subjectCodeableConcept = Optional.empty();
    boolean subjectCodeableConceptIsSet;
    @Nullable Optional<List<ContactDetail>> editor = Optional.empty();
    boolean editorIsSet;
    @Nullable Optional<Range> timingRange = Optional.empty();
    boolean timingRangeIsSet;
    @Nullable Optional<Boolean> doNotPerform = Optional.empty();
    boolean doNotPerformIsSet;
    @Nullable Optional<Date> lastReviewDate = Optional.empty();
    boolean lastReviewDateIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Reference> location = Optional.empty();
    boolean locationIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<String> timingDateTime = Optional.empty();
    boolean timingDateTimeIsSet;
    @Nullable Optional<String> subtitle = Optional.empty();
    boolean subtitleIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Duration> timingDuration = Optional.empty();
    boolean timingDurationIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Code> priority = Optional.empty();
    boolean priorityIsSet;
    @Nullable Optional<List<Reference>> observationRequirement = Optional.empty();
    boolean observationRequirementIsSet;
    @Nullable Optional<List<Dosage>> dosage = Optional.empty();
    boolean dosageIsSet;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<CodeableConcept>> topic = Optional.empty();
    boolean topicIsSet;
    @Nullable Optional<List<ContactDetail>> endorser = Optional.empty();
    boolean endorserIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Boolean> experimental = Optional.empty();
    boolean experimentalIsSet;
    @Nullable Optional<Canonical> profile = Optional.empty();
    boolean profileIsSet;
    @Nullable Optional<Period> timingPeriod = Optional.empty();
    boolean timingPeriodIsSet;
    @Nullable Optional<List<Reference>> specimenRequirement = Optional.empty();
    boolean specimenRequirementIsSet;
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<ActivitydefinitionStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("publisher")
    public void setPublisher(Optional<String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @JsonProperty("dynamicValue")
    public void setDynamicValue(Optional<List<ActivityDefinition_DynamicValue>> dynamicValue) {
      this.dynamicValue = dynamicValue;
      this.dynamicValueIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("transform")
    public void setTransform(Optional<Canonical> transform) {
      this.transform = transform;
      this.transformIsSet = true;
    }
    @JsonProperty("purpose")
    public void setPurpose(Optional<Markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Optional<Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("participant")
    public void setParticipant(Optional<List<ActivityDefinition_Participant>> participant) {
      this.participant = participant;
      this.participantIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<DateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("productReference")
    public void setProductReference(Optional<Reference> productReference) {
      this.productReference = productReference;
      this.productReferenceIsSet = true;
    }
    @JsonProperty("useContext")
    public void setUseContext(Optional<List<UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @JsonProperty("copyright")
    public void setCopyright(Optional<Markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @JsonProperty("approvalDate")
    public void setApprovalDate(Optional<Date> approvalDate) {
      this.approvalDate = approvalDate;
      this.approvalDateIsSet = true;
    }
    @JsonProperty("productCodeableConcept")
    public void setProductCodeableConcept(Optional<CodeableConcept> productCodeableConcept) {
      this.productCodeableConcept = productCodeableConcept;
      this.productCodeableConceptIsSet = true;
    }
    @JsonProperty("relatedArtifact")
    public void setRelatedArtifact(Optional<List<RelatedArtifact>> relatedArtifact) {
      this.relatedArtifact = relatedArtifact;
      this.relatedArtifactIsSet = true;
    }
    @JsonProperty("usage")
    public void setUsage(Optional<String> usage) {
      this.usage = usage;
      this.usageIsSet = true;
    }
    @JsonProperty("timingAge")
    public void setTimingAge(Optional<Age> timingAge) {
      this.timingAge = timingAge;
      this.timingAgeIsSet = true;
    }
    @JsonProperty("subjectReference")
    public void setSubjectReference(Optional<Reference> subjectReference) {
      this.subjectReference = subjectReference;
      this.subjectReferenceIsSet = true;
    }
    @JsonProperty("author")
    public void setAuthor(Optional<List<ContactDetail>> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @JsonProperty("intent")
    public void setIntent(Optional<Code> intent) {
      this.intent = intent;
      this.intentIsSet = true;
    }
    @JsonProperty("effectivePeriod")
    public void setEffectivePeriod(Optional<Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @JsonProperty("observationResultRequirement")
    public void setObservationResultRequirement(Optional<List<Reference>> observationResultRequirement) {
      this.observationResultRequirement = observationResultRequirement;
      this.observationResultRequirementIsSet = true;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<List<CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @JsonProperty("kind")
    public void setKind(Optional<Code> kind) {
      this.kind = kind;
      this.kindIsSet = true;
    }
    @JsonProperty("library")
    public void setLibrary(Optional<List<Canonical>> library) {
      this.library = library;
      this.libraryIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("bodySite")
    public void setBodySite(Optional<List<CodeableConcept>> bodySite) {
      this.bodySite = bodySite;
      this.bodySiteIsSet = true;
    }
    @JsonProperty("reviewer")
    public void setReviewer(Optional<List<ContactDetail>> reviewer) {
      this.reviewer = reviewer;
      this.reviewerIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("timingTiming")
    public void setTimingTiming(Optional<Timing> timingTiming) {
      this.timingTiming = timingTiming;
      this.timingTimingIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
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
    @JsonProperty("subjectCodeableConcept")
    public void setSubjectCodeableConcept(Optional<CodeableConcept> subjectCodeableConcept) {
      this.subjectCodeableConcept = subjectCodeableConcept;
      this.subjectCodeableConceptIsSet = true;
    }
    @JsonProperty("editor")
    public void setEditor(Optional<List<ContactDetail>> editor) {
      this.editor = editor;
      this.editorIsSet = true;
    }
    @JsonProperty("timingRange")
    public void setTimingRange(Optional<Range> timingRange) {
      this.timingRange = timingRange;
      this.timingRangeIsSet = true;
    }
    @JsonProperty("doNotPerform")
    public void setDoNotPerform(Optional<Boolean> doNotPerform) {
      this.doNotPerform = doNotPerform;
      this.doNotPerformIsSet = true;
    }
    @JsonProperty("lastReviewDate")
    public void setLastReviewDate(Optional<Date> lastReviewDate) {
      this.lastReviewDate = lastReviewDate;
      this.lastReviewDateIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("location")
    public void setLocation(Optional<Reference> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("timingDateTime")
    public void setTimingDateTime(Optional<String> timingDateTime) {
      this.timingDateTime = timingDateTime;
      this.timingDateTimeIsSet = true;
    }
    @JsonProperty("subtitle")
    public void setSubtitle(Optional<String> subtitle) {
      this.subtitle = subtitle;
      this.subtitleIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("timingDuration")
    public void setTimingDuration(Optional<Duration> timingDuration) {
      this.timingDuration = timingDuration;
      this.timingDurationIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("priority")
    public void setPriority(Optional<Code> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @JsonProperty("observationRequirement")
    public void setObservationRequirement(Optional<List<Reference>> observationRequirement) {
      this.observationRequirement = observationRequirement;
      this.observationRequirementIsSet = true;
    }
    @JsonProperty("dosage")
    public void setDosage(Optional<List<Dosage>> dosage) {
      this.dosage = dosage;
      this.dosageIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("topic")
    public void setTopic(Optional<List<CodeableConcept>> topic) {
      this.topic = topic;
      this.topicIsSet = true;
    }
    @JsonProperty("endorser")
    public void setEndorser(Optional<List<ContactDetail>> endorser) {
      this.endorser = endorser;
      this.endorserIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("experimental")
    public void setExperimental(Optional<Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @JsonProperty("profile")
    public void setProfile(Optional<Canonical> profile) {
      this.profile = profile;
      this.profileIsSet = true;
    }
    @JsonProperty("timingPeriod")
    public void setTimingPeriod(Optional<Period> timingPeriod) {
      this.timingPeriod = timingPeriod;
      this.timingPeriodIsSet = true;
    }
    @JsonProperty("specimenRequirement")
    public void setSpecimenRequirement(Optional<List<Reference>> specimenRequirement) {
      this.specimenRequirement = specimenRequirement;
      this.specimenRequirementIsSet = true;
    }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ActivitydefinitionStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ActivityDefinition_DynamicValue>> dynamicValue() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> transform() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ActivityDefinition_Participant>> participant() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> productReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> approvalDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> productCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<RelatedArtifact>> relatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> usage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Age> timingAge() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subjectReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> author() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> intent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> observationResultRequirement() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> kind() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> library() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> bodySite() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> reviewer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> timingTiming() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> subjectCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> editor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> timingRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> doNotPerform() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> lastReviewDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> location() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> timingDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> subtitle() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> timingDuration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> priority() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> observationRequirement() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Dosage>> dosage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> topic() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> endorser() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> profile() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> timingPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> specimenRequirement() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableActivityDefinition fromJson(Json json) {
    ImmutableActivityDefinition.Builder builder = ((ImmutableActivityDefinition.Builder) ImmutableActivityDefinition.builder());
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.dynamicValueIsSet) {
      builder.dynamicValue(json.dynamicValue);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.transformIsSet) {
      builder.transform(json.transform);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.participantIsSet) {
      builder.participant(json.participant);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.productReferenceIsSet) {
      builder.productReference(json.productReference);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.approvalDateIsSet) {
      builder.approvalDate(json.approvalDate);
    }
    if (json.productCodeableConceptIsSet) {
      builder.productCodeableConcept(json.productCodeableConcept);
    }
    if (json.relatedArtifactIsSet) {
      builder.relatedArtifact(json.relatedArtifact);
    }
    if (json.usageIsSet) {
      builder.usage(json.usage);
    }
    if (json.timingAgeIsSet) {
      builder.timingAge(json.timingAge);
    }
    if (json.subjectReferenceIsSet) {
      builder.subjectReference(json.subjectReference);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.intentIsSet) {
      builder.intent(json.intent);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.observationResultRequirementIsSet) {
      builder.observationResultRequirement(json.observationResultRequirement);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.kindIsSet) {
      builder.kind(json.kind);
    }
    if (json.libraryIsSet) {
      builder.library(json.library);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.bodySiteIsSet) {
      builder.bodySite(json.bodySite);
    }
    if (json.reviewerIsSet) {
      builder.reviewer(json.reviewer);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.timingTimingIsSet) {
      builder.timingTiming(json.timingTiming);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.subjectCodeableConceptIsSet) {
      builder.subjectCodeableConcept(json.subjectCodeableConcept);
    }
    if (json.editorIsSet) {
      builder.editor(json.editor);
    }
    if (json.timingRangeIsSet) {
      builder.timingRange(json.timingRange);
    }
    if (json.doNotPerformIsSet) {
      builder.doNotPerform(json.doNotPerform);
    }
    if (json.lastReviewDateIsSet) {
      builder.lastReviewDate(json.lastReviewDate);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.timingDateTimeIsSet) {
      builder.timingDateTime(json.timingDateTime);
    }
    if (json.subtitleIsSet) {
      builder.subtitle(json.subtitle);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.timingDurationIsSet) {
      builder.timingDuration(json.timingDuration);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.observationRequirementIsSet) {
      builder.observationRequirement(json.observationRequirement);
    }
    if (json.dosageIsSet) {
      builder.dosage(json.dosage);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.topicIsSet) {
      builder.topic(json.topic);
    }
    if (json.endorserIsSet) {
      builder.endorser(json.endorser);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.profileIsSet) {
      builder.profile(json.profile);
    }
    if (json.timingPeriodIsSet) {
      builder.timingPeriod(json.timingPeriod);
    }
    if (json.specimenRequirementIsSet) {
      builder.specimenRequirement(json.specimenRequirement);
    }
    return (ImmutableActivityDefinition) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ActivityDefinition} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ActivityDefinition instance
   */
  public static ActivityDefinition copyOf(ActivityDefinition instance) {
    if (instance instanceof ImmutableActivityDefinition) {
      return (ImmutableActivityDefinition) instance;
    }
    return ((ImmutableActivityDefinition.Builder) ImmutableActivityDefinition.builder())
        .identifier(instance.identifier())
        .status(instance.status())
        .publisher(instance.publisher())
        .dynamicValue(instance.dynamicValue())
        .extension(instance.extension())
        .transform(instance.transform())
        .purpose(instance.purpose())
        .quantity(instance.quantity())
        .meta(instance.meta())
        .title(instance.title())
        .participant(instance.participant())
        .date(instance.date())
        .productReference(instance.productReference())
        .useContext(instance.useContext())
        .copyright(instance.copyright())
        .approvalDate(instance.approvalDate())
        .productCodeableConcept(instance.productCodeableConcept())
        .relatedArtifact(instance.relatedArtifact())
        .usage(instance.usage())
        .timingAge(instance.timingAge())
        .subjectReference(instance.subjectReference())
        .author(instance.author())
        .intent(instance.intent())
        .effectivePeriod(instance.effectivePeriod())
        .observationResultRequirement(instance.observationResultRequirement())
        .jurisdiction(instance.jurisdiction())
        .kind(instance.kind())
        .library(instance.library())
        .id(instance.id())
        .bodySite(instance.bodySite())
        .reviewer(instance.reviewer())
        .code(instance.code())
        .timingTiming(instance.timingTiming())
        .url(instance.url())
        .text(instance.text())
        .language(instance.language())
        .subjectCodeableConcept(instance.subjectCodeableConcept())
        .editor(instance.editor())
        .timingRange(instance.timingRange())
        .doNotPerform(instance.doNotPerform())
        .lastReviewDate(instance.lastReviewDate())
        .modifierExtension(instance.modifierExtension())
        .location(instance.location())
        .version(instance.version())
        .timingDateTime(instance.timingDateTime())
        .subtitle(instance.subtitle())
        .contained(instance.contained())
        .resourceType(instance.resourceType())
        .timingDuration(instance.timingDuration())
        .implicitRules(instance.implicitRules())
        .priority(instance.priority())
        .observationRequirement(instance.observationRequirement())
        .dosage(instance.dosage())
        .contact(instance.contact())
        .name(instance.name())
        .topic(instance.topic())
        .endorser(instance.endorser())
        .description(instance.description())
        .experimental(instance.experimental())
        .profile(instance.profile())
        .timingPeriod(instance.timingPeriod())
        .specimenRequirement(instance.specimenRequirement())
        .build();
  }

  /**
   * Creates a builder for {@link ActivityDefinition ActivityDefinition}.
   * <pre>
   * ImmutableActivityDefinition.builder()
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link ActivityDefinition#identifier() identifier}
   *    .status(com.medplum.types.fhir.ActivitydefinitionStatus) // optional {@link ActivityDefinition#status() status}
   *    .publisher(String) // optional {@link ActivityDefinition#publisher() publisher}
   *    .dynamicValue(List&amp;lt;com.medplum.types.fhir.ActivityDefinition_DynamicValue&amp;gt;) // optional {@link ActivityDefinition#dynamicValue() dynamicValue}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ActivityDefinition#extension() extension}
   *    .transform(com.medplum.types.fhir.Canonical) // optional {@link ActivityDefinition#transform() transform}
   *    .purpose(com.medplum.types.fhir.Markdown) // optional {@link ActivityDefinition#purpose() purpose}
   *    .quantity(com.medplum.types.fhir.Quantity) // optional {@link ActivityDefinition#quantity() quantity}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link ActivityDefinition#meta() meta}
   *    .title(String) // optional {@link ActivityDefinition#title() title}
   *    .participant(List&amp;lt;com.medplum.types.fhir.ActivityDefinition_Participant&amp;gt;) // optional {@link ActivityDefinition#participant() participant}
   *    .date(com.medplum.types.fhir.DateTime) // optional {@link ActivityDefinition#date() date}
   *    .productReference(com.medplum.types.fhir.Reference) // optional {@link ActivityDefinition#productReference() productReference}
   *    .useContext(List&amp;lt;com.medplum.types.fhir.UsageContext&amp;gt;) // optional {@link ActivityDefinition#useContext() useContext}
   *    .copyright(com.medplum.types.fhir.Markdown) // optional {@link ActivityDefinition#copyright() copyright}
   *    .approvalDate(com.medplum.types.fhir.Date) // optional {@link ActivityDefinition#approvalDate() approvalDate}
   *    .productCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link ActivityDefinition#productCodeableConcept() productCodeableConcept}
   *    .relatedArtifact(List&amp;lt;com.medplum.types.fhir.RelatedArtifact&amp;gt;) // optional {@link ActivityDefinition#relatedArtifact() relatedArtifact}
   *    .usage(String) // optional {@link ActivityDefinition#usage() usage}
   *    .timingAge(com.medplum.types.fhir.Age) // optional {@link ActivityDefinition#timingAge() timingAge}
   *    .subjectReference(com.medplum.types.fhir.Reference) // optional {@link ActivityDefinition#subjectReference() subjectReference}
   *    .author(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link ActivityDefinition#author() author}
   *    .intent(com.medplum.types.fhir.Code) // optional {@link ActivityDefinition#intent() intent}
   *    .effectivePeriod(com.medplum.types.fhir.Period) // optional {@link ActivityDefinition#effectivePeriod() effectivePeriod}
   *    .observationResultRequirement(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link ActivityDefinition#observationResultRequirement() observationResultRequirement}
   *    .jurisdiction(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ActivityDefinition#jurisdiction() jurisdiction}
   *    .kind(com.medplum.types.fhir.Code) // optional {@link ActivityDefinition#kind() kind}
   *    .library(List&amp;lt;com.medplum.types.fhir.Canonical&amp;gt;) // optional {@link ActivityDefinition#library() library}
   *    .id(com.medplum.types.fhir.Id) // optional {@link ActivityDefinition#id() id}
   *    .bodySite(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ActivityDefinition#bodySite() bodySite}
   *    .reviewer(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link ActivityDefinition#reviewer() reviewer}
   *    .code(com.medplum.types.fhir.CodeableConcept) // optional {@link ActivityDefinition#code() code}
   *    .timingTiming(com.medplum.types.fhir.Timing) // optional {@link ActivityDefinition#timingTiming() timingTiming}
   *    .url(com.medplum.types.fhir.Uri) // optional {@link ActivityDefinition#url() url}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link ActivityDefinition#text() text}
   *    .language(com.medplum.types.fhir.Code) // optional {@link ActivityDefinition#language() language}
   *    .subjectCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link ActivityDefinition#subjectCodeableConcept() subjectCodeableConcept}
   *    .editor(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link ActivityDefinition#editor() editor}
   *    .timingRange(com.medplum.types.fhir.Range) // optional {@link ActivityDefinition#timingRange() timingRange}
   *    .doNotPerform(Boolean) // optional {@link ActivityDefinition#doNotPerform() doNotPerform}
   *    .lastReviewDate(com.medplum.types.fhir.Date) // optional {@link ActivityDefinition#lastReviewDate() lastReviewDate}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ActivityDefinition#modifierExtension() modifierExtension}
   *    .location(com.medplum.types.fhir.Reference) // optional {@link ActivityDefinition#location() location}
   *    .version(String) // optional {@link ActivityDefinition#version() version}
   *    .timingDateTime(String) // optional {@link ActivityDefinition#timingDateTime() timingDateTime}
   *    .subtitle(String) // optional {@link ActivityDefinition#subtitle() subtitle}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link ActivityDefinition#contained() contained}
   *    .resourceType(String) // required {@link ActivityDefinition#resourceType() resourceType}
   *    .timingDuration(com.medplum.types.fhir.Duration) // optional {@link ActivityDefinition#timingDuration() timingDuration}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link ActivityDefinition#implicitRules() implicitRules}
   *    .priority(com.medplum.types.fhir.Code) // optional {@link ActivityDefinition#priority() priority}
   *    .observationRequirement(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link ActivityDefinition#observationRequirement() observationRequirement}
   *    .dosage(List&amp;lt;com.medplum.types.fhir.Dosage&amp;gt;) // optional {@link ActivityDefinition#dosage() dosage}
   *    .contact(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link ActivityDefinition#contact() contact}
   *    .name(String) // optional {@link ActivityDefinition#name() name}
   *    .topic(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ActivityDefinition#topic() topic}
   *    .endorser(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link ActivityDefinition#endorser() endorser}
   *    .description(com.medplum.types.fhir.Markdown) // optional {@link ActivityDefinition#description() description}
   *    .experimental(Boolean) // optional {@link ActivityDefinition#experimental() experimental}
   *    .profile(com.medplum.types.fhir.Canonical) // optional {@link ActivityDefinition#profile() profile}
   *    .timingPeriod(com.medplum.types.fhir.Period) // optional {@link ActivityDefinition#timingPeriod() timingPeriod}
   *    .specimenRequirement(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link ActivityDefinition#specimenRequirement() specimenRequirement}
   *    .build();
   * </pre>
   * @return A new ActivityDefinition builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableActivityDefinition.Builder();
  }

  /**
   * Builds instances of type {@link ActivityDefinition ActivityDefinition}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ActivityDefinition", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_IDENTIFIER = 0x1L;
    private static final long OPT_BIT_STATUS = 0x2L;
    private static final long OPT_BIT_PUBLISHER = 0x4L;
    private static final long OPT_BIT_DYNAMIC_VALUE = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_TRANSFORM = 0x20L;
    private static final long OPT_BIT_PURPOSE = 0x40L;
    private static final long OPT_BIT_QUANTITY = 0x80L;
    private static final long OPT_BIT_META = 0x100L;
    private static final long OPT_BIT_TITLE = 0x200L;
    private static final long OPT_BIT_PARTICIPANT = 0x400L;
    private static final long OPT_BIT_DATE = 0x800L;
    private static final long OPT_BIT_PRODUCT_REFERENCE = 0x1000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x2000L;
    private static final long OPT_BIT_COPYRIGHT = 0x4000L;
    private static final long OPT_BIT_APPROVAL_DATE = 0x8000L;
    private static final long OPT_BIT_PRODUCT_CODEABLE_CONCEPT = 0x10000L;
    private static final long OPT_BIT_RELATED_ARTIFACT = 0x20000L;
    private static final long OPT_BIT_USAGE = 0x40000L;
    private static final long OPT_BIT_TIMING_AGE = 0x80000L;
    private static final long OPT_BIT_SUBJECT_REFERENCE = 0x100000L;
    private static final long OPT_BIT_AUTHOR = 0x200000L;
    private static final long OPT_BIT_INTENT = 0x400000L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x800000L;
    private static final long OPT_BIT_OBSERVATION_RESULT_REQUIREMENT = 0x1000000L;
    private static final long OPT_BIT_JURISDICTION = 0x2000000L;
    private static final long OPT_BIT_KIND = 0x4000000L;
    private static final long OPT_BIT_LIBRARY = 0x8000000L;
    private static final long OPT_BIT_ID = 0x10000000L;
    private static final long OPT_BIT_BODY_SITE = 0x20000000L;
    private static final long OPT_BIT_REVIEWER = 0x40000000L;
    private static final long OPT_BIT_CODE = 0x80000000L;
    private static final long OPT_BIT_TIMING_TIMING = 0x100000000L;
    private static final long OPT_BIT_URL = 0x200000000L;
    private static final long OPT_BIT_TEXT = 0x400000000L;
    private static final long OPT_BIT_LANGUAGE = 0x800000000L;
    private static final long OPT_BIT_SUBJECT_CODEABLE_CONCEPT = 0x1000000000L;
    private static final long OPT_BIT_EDITOR = 0x2000000000L;
    private static final long OPT_BIT_TIMING_RANGE = 0x4000000000L;
    private static final long OPT_BIT_DO_NOT_PERFORM = 0x8000000000L;
    private static final long OPT_BIT_LAST_REVIEW_DATE = 0x10000000000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20000000000L;
    private static final long OPT_BIT_LOCATION = 0x40000000000L;
    private static final long OPT_BIT_VERSION = 0x80000000000L;
    private static final long OPT_BIT_TIMING_DATE_TIME = 0x100000000000L;
    private static final long OPT_BIT_SUBTITLE = 0x200000000000L;
    private static final long OPT_BIT_CONTAINED = 0x400000000000L;
    private static final long OPT_BIT_TIMING_DURATION = 0x800000000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x1000000000000L;
    private static final long OPT_BIT_PRIORITY = 0x2000000000000L;
    private static final long OPT_BIT_OBSERVATION_REQUIREMENT = 0x4000000000000L;
    private static final long OPT_BIT_DOSAGE = 0x8000000000000L;
    private static final long OPT_BIT_CONTACT = 0x10000000000000L;
    private static final long OPT_BIT_NAME = 0x20000000000000L;
    private static final long OPT_BIT_TOPIC = 0x40000000000000L;
    private static final long OPT_BIT_ENDORSER = 0x80000000000000L;
    private static final long OPT_BIT_DESCRIPTION = 0x100000000000000L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x200000000000000L;
    private static final long OPT_BIT_PROFILE = 0x400000000000000L;
    private static final long OPT_BIT_TIMING_PERIOD = 0x800000000000000L;
    private static final long OPT_BIT_SPECIMEN_REQUIREMENT = 0x1000000000000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Identifier> identifier;
    private @Nullable ActivitydefinitionStatus status;
    private @Nullable String publisher;
    private @Nullable List<ActivityDefinition_DynamicValue> dynamicValue;
    private @Nullable List<Extension> extension;
    private @Nullable Canonical transform;
    private @Nullable Markdown purpose;
    private @Nullable Quantity quantity;
    private @Nullable Meta meta;
    private @Nullable String title;
    private @Nullable List<ActivityDefinition_Participant> participant;
    private @Nullable DateTime date;
    private @Nullable Reference productReference;
    private @Nullable List<UsageContext> useContext;
    private @Nullable Markdown copyright;
    private @Nullable Date approvalDate;
    private @Nullable CodeableConcept productCodeableConcept;
    private @Nullable List<RelatedArtifact> relatedArtifact;
    private @Nullable String usage;
    private @Nullable Age timingAge;
    private @Nullable Reference subjectReference;
    private @Nullable List<ContactDetail> author;
    private @Nullable Code intent;
    private @Nullable Period effectivePeriod;
    private @Nullable List<Reference> observationResultRequirement;
    private @Nullable List<CodeableConcept> jurisdiction;
    private @Nullable Code kind;
    private @Nullable List<Canonical> library;
    private @Nullable Id id;
    private @Nullable List<CodeableConcept> bodySite;
    private @Nullable List<ContactDetail> reviewer;
    private @Nullable CodeableConcept code;
    private @Nullable Timing timingTiming;
    private @Nullable Uri url;
    private @Nullable Narrative text;
    private @Nullable Code language;
    private @Nullable CodeableConcept subjectCodeableConcept;
    private @Nullable List<ContactDetail> editor;
    private @Nullable Range timingRange;
    private @Nullable Boolean doNotPerform;
    private @Nullable Date lastReviewDate;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference location;
    private @Nullable String version;
    private @Nullable String timingDateTime;
    private @Nullable String subtitle;
    private @Nullable List<ResourceList> contained;
    private @Nullable String resourceType;
    private @Nullable Duration timingDuration;
    private @Nullable Uri implicitRules;
    private @Nullable Code priority;
    private @Nullable List<Reference> observationRequirement;
    private @Nullable List<Dosage> dosage;
    private @Nullable List<ContactDetail> contact;
    private @Nullable String name;
    private @Nullable List<CodeableConcept> topic;
    private @Nullable List<ContactDetail> endorser;
    private @Nullable Markdown description;
    private @Nullable Boolean experimental;
    private @Nullable Canonical profile;
    private @Nullable Period timingPeriod;
    private @Nullable List<Reference> specimenRequirement;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ActivityDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ActivityDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(ActivitydefinitionStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends ActivitydefinitionStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ActivityDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ActivityDefinition#dynamicValue() dynamicValue} to dynamicValue.
     * @param dynamicValue The value for dynamicValue
     * @return {@code this} builder for chained invocation
     */
    public final Builder dynamicValue(List<ActivityDefinition_DynamicValue> dynamicValue) {
      checkNotIsSet(dynamicValueIsSet(), "dynamicValue");
      this.dynamicValue = Objects.requireNonNull(dynamicValue, "dynamicValue");
      optBits |= OPT_BIT_DYNAMIC_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#dynamicValue() dynamicValue} to dynamicValue.
     * @param dynamicValue The value for dynamicValue
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dynamicValue")
    public final Builder dynamicValue(Optional<? extends List<ActivityDefinition_DynamicValue>> dynamicValue) {
      checkNotIsSet(dynamicValueIsSet(), "dynamicValue");
      this.dynamicValue = dynamicValue.orElse(null);
      optBits |= OPT_BIT_DYNAMIC_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link ActivityDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link ActivityDefinition#transform() transform} to transform.
     * @param transform The value for transform
     * @return {@code this} builder for chained invocation
     */
    public final Builder transform(Canonical transform) {
      checkNotIsSet(transformIsSet(), "transform");
      this.transform = Objects.requireNonNull(transform, "transform");
      optBits |= OPT_BIT_TRANSFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#transform() transform} to transform.
     * @param transform The value for transform
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("transform")
    public final Builder transform(Optional<? extends Canonical> transform) {
      checkNotIsSet(transformIsSet(), "transform");
      this.transform = transform.orElse(null);
      optBits |= OPT_BIT_TRANSFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link ActivityDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link ActivityDefinition#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantity(Quantity quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = Objects.requireNonNull(quantity, "quantity");
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("quantity")
    public final Builder quantity(Optional<? extends Quantity> quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = quantity.orElse(null);
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link ActivityDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link ActivityDefinition#title() title} to title.
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
     * Initializes the optional value {@link ActivityDefinition#title() title} to title.
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
     * Initializes the optional value {@link ActivityDefinition#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for chained invocation
     */
    public final Builder participant(List<ActivityDefinition_Participant> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = Objects.requireNonNull(participant, "participant");
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("participant")
    public final Builder participant(Optional<? extends List<ActivityDefinition_Participant>> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = participant.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#date() date} to date.
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
     * Initializes the optional value {@link ActivityDefinition#date() date} to date.
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
     * Initializes the optional value {@link ActivityDefinition#productReference() productReference} to productReference.
     * @param productReference The value for productReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder productReference(Reference productReference) {
      checkNotIsSet(productReferenceIsSet(), "productReference");
      this.productReference = Objects.requireNonNull(productReference, "productReference");
      optBits |= OPT_BIT_PRODUCT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#productReference() productReference} to productReference.
     * @param productReference The value for productReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("productReference")
    public final Builder productReference(Optional<? extends Reference> productReference) {
      checkNotIsSet(productReferenceIsSet(), "productReference");
      this.productReference = productReference.orElse(null);
      optBits |= OPT_BIT_PRODUCT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link ActivityDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link ActivityDefinition#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link ActivityDefinition#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link ActivityDefinition#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link ActivityDefinition#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link ActivityDefinition#productCodeableConcept() productCodeableConcept} to productCodeableConcept.
     * @param productCodeableConcept The value for productCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder productCodeableConcept(CodeableConcept productCodeableConcept) {
      checkNotIsSet(productCodeableConceptIsSet(), "productCodeableConcept");
      this.productCodeableConcept = Objects.requireNonNull(productCodeableConcept, "productCodeableConcept");
      optBits |= OPT_BIT_PRODUCT_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#productCodeableConcept() productCodeableConcept} to productCodeableConcept.
     * @param productCodeableConcept The value for productCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("productCodeableConcept")
    public final Builder productCodeableConcept(Optional<? extends CodeableConcept> productCodeableConcept) {
      checkNotIsSet(productCodeableConceptIsSet(), "productCodeableConcept");
      this.productCodeableConcept = productCodeableConcept.orElse(null);
      optBits |= OPT_BIT_PRODUCT_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link ActivityDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link ActivityDefinition#usage() usage} to usage.
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
     * Initializes the optional value {@link ActivityDefinition#usage() usage} to usage.
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
     * Initializes the optional value {@link ActivityDefinition#timingAge() timingAge} to timingAge.
     * @param timingAge The value for timingAge
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingAge(Age timingAge) {
      checkNotIsSet(timingAgeIsSet(), "timingAge");
      this.timingAge = Objects.requireNonNull(timingAge, "timingAge");
      optBits |= OPT_BIT_TIMING_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#timingAge() timingAge} to timingAge.
     * @param timingAge The value for timingAge
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timingAge")
    public final Builder timingAge(Optional<? extends Age> timingAge) {
      checkNotIsSet(timingAgeIsSet(), "timingAge");
      this.timingAge = timingAge.orElse(null);
      optBits |= OPT_BIT_TIMING_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#subjectReference() subjectReference} to subjectReference.
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
     * Initializes the optional value {@link ActivityDefinition#subjectReference() subjectReference} to subjectReference.
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
     * Initializes the optional value {@link ActivityDefinition#author() author} to author.
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
     * Initializes the optional value {@link ActivityDefinition#author() author} to author.
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
     * Initializes the optional value {@link ActivityDefinition#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    public final Builder intent(Code intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = Objects.requireNonNull(intent, "intent");
      optBits |= OPT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("intent")
    public final Builder intent(Optional<? extends Code> intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = intent.orElse(null);
      optBits |= OPT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link ActivityDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link ActivityDefinition#observationResultRequirement() observationResultRequirement} to observationResultRequirement.
     * @param observationResultRequirement The value for observationResultRequirement
     * @return {@code this} builder for chained invocation
     */
    public final Builder observationResultRequirement(List<Reference> observationResultRequirement) {
      checkNotIsSet(observationResultRequirementIsSet(), "observationResultRequirement");
      this.observationResultRequirement = Objects.requireNonNull(observationResultRequirement, "observationResultRequirement");
      optBits |= OPT_BIT_OBSERVATION_RESULT_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#observationResultRequirement() observationResultRequirement} to observationResultRequirement.
     * @param observationResultRequirement The value for observationResultRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("observationResultRequirement")
    public final Builder observationResultRequirement(Optional<? extends List<Reference>> observationResultRequirement) {
      checkNotIsSet(observationResultRequirementIsSet(), "observationResultRequirement");
      this.observationResultRequirement = observationResultRequirement.orElse(null);
      optBits |= OPT_BIT_OBSERVATION_RESULT_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ActivityDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ActivityDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    public final Builder kind(Code kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = Objects.requireNonNull(kind, "kind");
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("kind")
    public final Builder kind(Optional<? extends Code> kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = kind.orElse(null);
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#library() library} to library.
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
     * Initializes the optional value {@link ActivityDefinition#library() library} to library.
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
     * Initializes the optional value {@link ActivityDefinition#id() id} to id.
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
     * Initializes the optional value {@link ActivityDefinition#id() id} to id.
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
     * Initializes the optional value {@link ActivityDefinition#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    public final Builder bodySite(List<CodeableConcept> bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = Objects.requireNonNull(bodySite, "bodySite");
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("bodySite")
    public final Builder bodySite(Optional<? extends List<CodeableConcept>> bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = bodySite.orElse(null);
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link ActivityDefinition#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link ActivityDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#timingTiming() timingTiming} to timingTiming.
     * @param timingTiming The value for timingTiming
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingTiming(Timing timingTiming) {
      checkNotIsSet(timingTimingIsSet(), "timingTiming");
      this.timingTiming = Objects.requireNonNull(timingTiming, "timingTiming");
      optBits |= OPT_BIT_TIMING_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#timingTiming() timingTiming} to timingTiming.
     * @param timingTiming The value for timingTiming
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timingTiming")
    public final Builder timingTiming(Optional<? extends Timing> timingTiming) {
      checkNotIsSet(timingTimingIsSet(), "timingTiming");
      this.timingTiming = timingTiming.orElse(null);
      optBits |= OPT_BIT_TIMING_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#url() url} to url.
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
     * Initializes the optional value {@link ActivityDefinition#url() url} to url.
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
     * Initializes the optional value {@link ActivityDefinition#text() text} to text.
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
     * Initializes the optional value {@link ActivityDefinition#text() text} to text.
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
     * Initializes the optional value {@link ActivityDefinition#language() language} to language.
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
     * Initializes the optional value {@link ActivityDefinition#language() language} to language.
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
     * Initializes the optional value {@link ActivityDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
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
     * Initializes the optional value {@link ActivityDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
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
     * Initializes the optional value {@link ActivityDefinition#editor() editor} to editor.
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
     * Initializes the optional value {@link ActivityDefinition#editor() editor} to editor.
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
     * Initializes the optional value {@link ActivityDefinition#timingRange() timingRange} to timingRange.
     * @param timingRange The value for timingRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingRange(Range timingRange) {
      checkNotIsSet(timingRangeIsSet(), "timingRange");
      this.timingRange = Objects.requireNonNull(timingRange, "timingRange");
      optBits |= OPT_BIT_TIMING_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#timingRange() timingRange} to timingRange.
     * @param timingRange The value for timingRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timingRange")
    public final Builder timingRange(Optional<? extends Range> timingRange) {
      checkNotIsSet(timingRangeIsSet(), "timingRange");
      this.timingRange = timingRange.orElse(null);
      optBits |= OPT_BIT_TIMING_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for chained invocation
     */
    public final Builder doNotPerform(boolean doNotPerform) {
      checkNotIsSet(doNotPerformIsSet(), "doNotPerform");
      this.doNotPerform = doNotPerform;
      optBits |= OPT_BIT_DO_NOT_PERFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("doNotPerform")
    public final Builder doNotPerform(Optional<Boolean> doNotPerform) {
      checkNotIsSet(doNotPerformIsSet(), "doNotPerform");
      this.doNotPerform = doNotPerform.orElse(null);
      optBits |= OPT_BIT_DO_NOT_PERFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link ActivityDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link ActivityDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ActivityDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ActivityDefinition#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(Reference location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("location")
    public final Builder location(Optional<? extends Reference> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#version() version} to version.
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
     * Initializes the optional value {@link ActivityDefinition#version() version} to version.
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
     * Initializes the optional value {@link ActivityDefinition#timingDateTime() timingDateTime} to timingDateTime.
     * @param timingDateTime The value for timingDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingDateTime(String timingDateTime) {
      checkNotIsSet(timingDateTimeIsSet(), "timingDateTime");
      this.timingDateTime = Objects.requireNonNull(timingDateTime, "timingDateTime");
      optBits |= OPT_BIT_TIMING_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#timingDateTime() timingDateTime} to timingDateTime.
     * @param timingDateTime The value for timingDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timingDateTime")
    public final Builder timingDateTime(Optional<String> timingDateTime) {
      checkNotIsSet(timingDateTimeIsSet(), "timingDateTime");
      this.timingDateTime = timingDateTime.orElse(null);
      optBits |= OPT_BIT_TIMING_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link ActivityDefinition#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link ActivityDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link ActivityDefinition#contained() contained} to contained.
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
     * Initializes the value for the {@link ActivityDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ActivityDefinition#timingDuration() timingDuration} to timingDuration.
     * @param timingDuration The value for timingDuration
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingDuration(Duration timingDuration) {
      checkNotIsSet(timingDurationIsSet(), "timingDuration");
      this.timingDuration = Objects.requireNonNull(timingDuration, "timingDuration");
      optBits |= OPT_BIT_TIMING_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#timingDuration() timingDuration} to timingDuration.
     * @param timingDuration The value for timingDuration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timingDuration")
    public final Builder timingDuration(Optional<? extends Duration> timingDuration) {
      checkNotIsSet(timingDurationIsSet(), "timingDuration");
      this.timingDuration = timingDuration.orElse(null);
      optBits |= OPT_BIT_TIMING_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ActivityDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ActivityDefinition#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    public final Builder priority(Code priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = Objects.requireNonNull(priority, "priority");
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("priority")
    public final Builder priority(Optional<? extends Code> priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = priority.orElse(null);
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#observationRequirement() observationRequirement} to observationRequirement.
     * @param observationRequirement The value for observationRequirement
     * @return {@code this} builder for chained invocation
     */
    public final Builder observationRequirement(List<Reference> observationRequirement) {
      checkNotIsSet(observationRequirementIsSet(), "observationRequirement");
      this.observationRequirement = Objects.requireNonNull(observationRequirement, "observationRequirement");
      optBits |= OPT_BIT_OBSERVATION_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#observationRequirement() observationRequirement} to observationRequirement.
     * @param observationRequirement The value for observationRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("observationRequirement")
    public final Builder observationRequirement(Optional<? extends List<Reference>> observationRequirement) {
      checkNotIsSet(observationRequirementIsSet(), "observationRequirement");
      this.observationRequirement = observationRequirement.orElse(null);
      optBits |= OPT_BIT_OBSERVATION_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for chained invocation
     */
    public final Builder dosage(List<Dosage> dosage) {
      checkNotIsSet(dosageIsSet(), "dosage");
      this.dosage = Objects.requireNonNull(dosage, "dosage");
      optBits |= OPT_BIT_DOSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dosage")
    public final Builder dosage(Optional<? extends List<Dosage>> dosage) {
      checkNotIsSet(dosageIsSet(), "dosage");
      this.dosage = dosage.orElse(null);
      optBits |= OPT_BIT_DOSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link ActivityDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link ActivityDefinition#name() name} to name.
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
     * Initializes the optional value {@link ActivityDefinition#name() name} to name.
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
     * Initializes the optional value {@link ActivityDefinition#topic() topic} to topic.
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
     * Initializes the optional value {@link ActivityDefinition#topic() topic} to topic.
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
     * Initializes the optional value {@link ActivityDefinition#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link ActivityDefinition#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link ActivityDefinition#description() description} to description.
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
     * Initializes the optional value {@link ActivityDefinition#description() description} to description.
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
     * Initializes the optional value {@link ActivityDefinition#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link ActivityDefinition#experimental() experimental} to experimental.
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
     * Initializes the optional value {@link ActivityDefinition#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for chained invocation
     */
    public final Builder profile(Canonical profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = Objects.requireNonNull(profile, "profile");
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("profile")
    public final Builder profile(Optional<? extends Canonical> profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = profile.orElse(null);
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingPeriod(Period timingPeriod) {
      checkNotIsSet(timingPeriodIsSet(), "timingPeriod");
      this.timingPeriod = Objects.requireNonNull(timingPeriod, "timingPeriod");
      optBits |= OPT_BIT_TIMING_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timingPeriod")
    public final Builder timingPeriod(Optional<? extends Period> timingPeriod) {
      checkNotIsSet(timingPeriodIsSet(), "timingPeriod");
      this.timingPeriod = timingPeriod.orElse(null);
      optBits |= OPT_BIT_TIMING_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#specimenRequirement() specimenRequirement} to specimenRequirement.
     * @param specimenRequirement The value for specimenRequirement
     * @return {@code this} builder for chained invocation
     */
    public final Builder specimenRequirement(List<Reference> specimenRequirement) {
      checkNotIsSet(specimenRequirementIsSet(), "specimenRequirement");
      this.specimenRequirement = Objects.requireNonNull(specimenRequirement, "specimenRequirement");
      optBits |= OPT_BIT_SPECIMEN_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#specimenRequirement() specimenRequirement} to specimenRequirement.
     * @param specimenRequirement The value for specimenRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specimenRequirement")
    public final Builder specimenRequirement(Optional<? extends List<Reference>> specimenRequirement) {
      checkNotIsSet(specimenRequirementIsSet(), "specimenRequirement");
      this.specimenRequirement = specimenRequirement.orElse(null);
      optBits |= OPT_BIT_SPECIMEN_REQUIREMENT;
      return this;
    }

    /**
     * Builds a new {@link ActivityDefinition ActivityDefinition}.
     * @return An immutable instance of ActivityDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ActivityDefinition build() {
      checkRequiredAttributes();
      return new ImmutableActivityDefinition(
          identifier,
          status,
          publisher,
          dynamicValue,
          extension,
          transform,
          purpose,
          quantity,
          meta,
          title,
          participant,
          date,
          productReference,
          useContext,
          copyright,
          approvalDate,
          productCodeableConcept,
          relatedArtifact,
          usage,
          timingAge,
          subjectReference,
          author,
          intent,
          effectivePeriod,
          observationResultRequirement,
          jurisdiction,
          kind,
          library,
          id,
          bodySite,
          reviewer,
          code,
          timingTiming,
          url,
          text,
          language,
          subjectCodeableConcept,
          editor,
          timingRange,
          doNotPerform,
          lastReviewDate,
          modifierExtension,
          location,
          version,
          timingDateTime,
          subtitle,
          contained,
          resourceType,
          timingDuration,
          implicitRules,
          priority,
          observationRequirement,
          dosage,
          contact,
          name,
          topic,
          endorser,
          description,
          experimental,
          profile,
          timingPeriod,
          specimenRequirement);
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean dynamicValueIsSet() {
      return (optBits & OPT_BIT_DYNAMIC_VALUE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean transformIsSet() {
      return (optBits & OPT_BIT_TRANSFORM) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean participantIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean productReferenceIsSet() {
      return (optBits & OPT_BIT_PRODUCT_REFERENCE) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean approvalDateIsSet() {
      return (optBits & OPT_BIT_APPROVAL_DATE) != 0;
    }

    private boolean productCodeableConceptIsSet() {
      return (optBits & OPT_BIT_PRODUCT_CODEABLE_CONCEPT) != 0;
    }

    private boolean relatedArtifactIsSet() {
      return (optBits & OPT_BIT_RELATED_ARTIFACT) != 0;
    }

    private boolean usageIsSet() {
      return (optBits & OPT_BIT_USAGE) != 0;
    }

    private boolean timingAgeIsSet() {
      return (optBits & OPT_BIT_TIMING_AGE) != 0;
    }

    private boolean subjectReferenceIsSet() {
      return (optBits & OPT_BIT_SUBJECT_REFERENCE) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean intentIsSet() {
      return (optBits & OPT_BIT_INTENT) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean observationResultRequirementIsSet() {
      return (optBits & OPT_BIT_OBSERVATION_RESULT_REQUIREMENT) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean kindIsSet() {
      return (optBits & OPT_BIT_KIND) != 0;
    }

    private boolean libraryIsSet() {
      return (optBits & OPT_BIT_LIBRARY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean bodySiteIsSet() {
      return (optBits & OPT_BIT_BODY_SITE) != 0;
    }

    private boolean reviewerIsSet() {
      return (optBits & OPT_BIT_REVIEWER) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean timingTimingIsSet() {
      return (optBits & OPT_BIT_TIMING_TIMING) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean subjectCodeableConceptIsSet() {
      return (optBits & OPT_BIT_SUBJECT_CODEABLE_CONCEPT) != 0;
    }

    private boolean editorIsSet() {
      return (optBits & OPT_BIT_EDITOR) != 0;
    }

    private boolean timingRangeIsSet() {
      return (optBits & OPT_BIT_TIMING_RANGE) != 0;
    }

    private boolean doNotPerformIsSet() {
      return (optBits & OPT_BIT_DO_NOT_PERFORM) != 0;
    }

    private boolean lastReviewDateIsSet() {
      return (optBits & OPT_BIT_LAST_REVIEW_DATE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean timingDateTimeIsSet() {
      return (optBits & OPT_BIT_TIMING_DATE_TIME) != 0;
    }

    private boolean subtitleIsSet() {
      return (optBits & OPT_BIT_SUBTITLE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean timingDurationIsSet() {
      return (optBits & OPT_BIT_TIMING_DURATION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean observationRequirementIsSet() {
      return (optBits & OPT_BIT_OBSERVATION_REQUIREMENT) != 0;
    }

    private boolean dosageIsSet() {
      return (optBits & OPT_BIT_DOSAGE) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean topicIsSet() {
      return (optBits & OPT_BIT_TOPIC) != 0;
    }

    private boolean endorserIsSet() {
      return (optBits & OPT_BIT_ENDORSER) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean profileIsSet() {
      return (optBits & OPT_BIT_PROFILE) != 0;
    }

    private boolean timingPeriodIsSet() {
      return (optBits & OPT_BIT_TIMING_PERIOD) != 0;
    }

    private boolean specimenRequirementIsSet() {
      return (optBits & OPT_BIT_SPECIMEN_REQUIREMENT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ActivityDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build ActivityDefinition, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ActivityDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ActivityDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "ActivityDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ActivityDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link ActivityDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link ActivityDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(ActivitydefinitionStatus status);

    /**
     * Initializes the optional value {@link ActivityDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends ActivitydefinitionStatus> status);

    /**
     * Initializes the optional value {@link ActivityDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(String publisher);

    /**
     * Initializes the optional value {@link ActivityDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(Optional<String> publisher);

    /**
     * Initializes the optional value {@link ActivityDefinition#dynamicValue() dynamicValue} to dynamicValue.
     * @param dynamicValue The value for dynamicValue
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dynamicValue(List<ActivityDefinition_DynamicValue> dynamicValue);

    /**
     * Initializes the optional value {@link ActivityDefinition#dynamicValue() dynamicValue} to dynamicValue.
     * @param dynamicValue The value for dynamicValue
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dynamicValue(Optional<? extends List<ActivityDefinition_DynamicValue>> dynamicValue);

    /**
     * Initializes the optional value {@link ActivityDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ActivityDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ActivityDefinition#transform() transform} to transform.
     * @param transform The value for transform
     * @return {@code this} builder for chained invocation
     */
    BuildFinal transform(Canonical transform);

    /**
     * Initializes the optional value {@link ActivityDefinition#transform() transform} to transform.
     * @param transform The value for transform
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal transform(Optional<? extends Canonical> transform);

    /**
     * Initializes the optional value {@link ActivityDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(Markdown purpose);

    /**
     * Initializes the optional value {@link ActivityDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(Optional<? extends Markdown> purpose);

    /**
     * Initializes the optional value {@link ActivityDefinition#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(Quantity quantity);

    /**
     * Initializes the optional value {@link ActivityDefinition#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(Optional<? extends Quantity> quantity);

    /**
     * Initializes the optional value {@link ActivityDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link ActivityDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link ActivityDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link ActivityDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Initializes the optional value {@link ActivityDefinition#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for chained invocation
     */
    BuildFinal participant(List<ActivityDefinition_Participant> participant);

    /**
     * Initializes the optional value {@link ActivityDefinition#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal participant(Optional<? extends List<ActivityDefinition_Participant>> participant);

    /**
     * Initializes the optional value {@link ActivityDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(DateTime date);

    /**
     * Initializes the optional value {@link ActivityDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends DateTime> date);

    /**
     * Initializes the optional value {@link ActivityDefinition#productReference() productReference} to productReference.
     * @param productReference The value for productReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal productReference(Reference productReference);

    /**
     * Initializes the optional value {@link ActivityDefinition#productReference() productReference} to productReference.
     * @param productReference The value for productReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productReference(Optional<? extends Reference> productReference);

    /**
     * Initializes the optional value {@link ActivityDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(List<UsageContext> useContext);

    /**
     * Initializes the optional value {@link ActivityDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(Optional<? extends List<UsageContext>> useContext);

    /**
     * Initializes the optional value {@link ActivityDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(Markdown copyright);

    /**
     * Initializes the optional value {@link ActivityDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(Optional<? extends Markdown> copyright);

    /**
     * Initializes the optional value {@link ActivityDefinition#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal approvalDate(Date approvalDate);

    /**
     * Initializes the optional value {@link ActivityDefinition#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal approvalDate(Optional<? extends Date> approvalDate);

    /**
     * Initializes the optional value {@link ActivityDefinition#productCodeableConcept() productCodeableConcept} to productCodeableConcept.
     * @param productCodeableConcept The value for productCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal productCodeableConcept(CodeableConcept productCodeableConcept);

    /**
     * Initializes the optional value {@link ActivityDefinition#productCodeableConcept() productCodeableConcept} to productCodeableConcept.
     * @param productCodeableConcept The value for productCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productCodeableConcept(Optional<? extends CodeableConcept> productCodeableConcept);

    /**
     * Initializes the optional value {@link ActivityDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatedArtifact(List<RelatedArtifact> relatedArtifact);

    /**
     * Initializes the optional value {@link ActivityDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatedArtifact(Optional<? extends List<RelatedArtifact>> relatedArtifact);

    /**
     * Initializes the optional value {@link ActivityDefinition#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal usage(String usage);

    /**
     * Initializes the optional value {@link ActivityDefinition#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal usage(Optional<String> usage);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingAge() timingAge} to timingAge.
     * @param timingAge The value for timingAge
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingAge(Age timingAge);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingAge() timingAge} to timingAge.
     * @param timingAge The value for timingAge
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingAge(Optional<? extends Age> timingAge);

    /**
     * Initializes the optional value {@link ActivityDefinition#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subjectReference(Reference subjectReference);

    /**
     * Initializes the optional value {@link ActivityDefinition#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subjectReference(Optional<? extends Reference> subjectReference);

    /**
     * Initializes the optional value {@link ActivityDefinition#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(List<ContactDetail> author);

    /**
     * Initializes the optional value {@link ActivityDefinition#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(Optional<? extends List<ContactDetail>> author);

    /**
     * Initializes the optional value {@link ActivityDefinition#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal intent(Code intent);

    /**
     * Initializes the optional value {@link ActivityDefinition#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal intent(Optional<? extends Code> intent);

    /**
     * Initializes the optional value {@link ActivityDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(Period effectivePeriod);

    /**
     * Initializes the optional value {@link ActivityDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(Optional<? extends Period> effectivePeriod);

    /**
     * Initializes the optional value {@link ActivityDefinition#observationResultRequirement() observationResultRequirement} to observationResultRequirement.
     * @param observationResultRequirement The value for observationResultRequirement
     * @return {@code this} builder for chained invocation
     */
    BuildFinal observationResultRequirement(List<Reference> observationResultRequirement);

    /**
     * Initializes the optional value {@link ActivityDefinition#observationResultRequirement() observationResultRequirement} to observationResultRequirement.
     * @param observationResultRequirement The value for observationResultRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal observationResultRequirement(Optional<? extends List<Reference>> observationResultRequirement);

    /**
     * Initializes the optional value {@link ActivityDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(List<CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link ActivityDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link ActivityDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    BuildFinal kind(Code kind);

    /**
     * Initializes the optional value {@link ActivityDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal kind(Optional<? extends Code> kind);

    /**
     * Initializes the optional value {@link ActivityDefinition#library() library} to library.
     * @param library The value for library
     * @return {@code this} builder for chained invocation
     */
    BuildFinal library(List<Canonical> library);

    /**
     * Initializes the optional value {@link ActivityDefinition#library() library} to library.
     * @param library The value for library
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal library(Optional<? extends List<Canonical>> library);

    /**
     * Initializes the optional value {@link ActivityDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link ActivityDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link ActivityDefinition#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bodySite(List<CodeableConcept> bodySite);

    /**
     * Initializes the optional value {@link ActivityDefinition#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bodySite(Optional<? extends List<CodeableConcept>> bodySite);

    /**
     * Initializes the optional value {@link ActivityDefinition#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reviewer(List<ContactDetail> reviewer);

    /**
     * Initializes the optional value {@link ActivityDefinition#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reviewer(Optional<? extends List<ContactDetail>> reviewer);

    /**
     * Initializes the optional value {@link ActivityDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(CodeableConcept code);

    /**
     * Initializes the optional value {@link ActivityDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends CodeableConcept> code);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingTiming() timingTiming} to timingTiming.
     * @param timingTiming The value for timingTiming
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingTiming(Timing timingTiming);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingTiming() timingTiming} to timingTiming.
     * @param timingTiming The value for timingTiming
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingTiming(Optional<? extends Timing> timingTiming);

    /**
     * Initializes the optional value {@link ActivityDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(Uri url);

    /**
     * Initializes the optional value {@link ActivityDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(Optional<? extends Uri> url);

    /**
     * Initializes the optional value {@link ActivityDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link ActivityDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link ActivityDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link ActivityDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link ActivityDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subjectCodeableConcept(CodeableConcept subjectCodeableConcept);

    /**
     * Initializes the optional value {@link ActivityDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subjectCodeableConcept(Optional<? extends CodeableConcept> subjectCodeableConcept);

    /**
     * Initializes the optional value {@link ActivityDefinition#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal editor(List<ContactDetail> editor);

    /**
     * Initializes the optional value {@link ActivityDefinition#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal editor(Optional<? extends List<ContactDetail>> editor);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingRange() timingRange} to timingRange.
     * @param timingRange The value for timingRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingRange(Range timingRange);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingRange() timingRange} to timingRange.
     * @param timingRange The value for timingRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingRange(Optional<? extends Range> timingRange);

    /**
     * Initializes the optional value {@link ActivityDefinition#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for chained invocation
     */
    BuildFinal doNotPerform(boolean doNotPerform);

    /**
     * Initializes the optional value {@link ActivityDefinition#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal doNotPerform(Optional<Boolean> doNotPerform);

    /**
     * Initializes the optional value {@link ActivityDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastReviewDate(Date lastReviewDate);

    /**
     * Initializes the optional value {@link ActivityDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastReviewDate(Optional<? extends Date> lastReviewDate);

    /**
     * Initializes the optional value {@link ActivityDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ActivityDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ActivityDefinition#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(Reference location);

    /**
     * Initializes the optional value {@link ActivityDefinition#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(Optional<? extends Reference> location);

    /**
     * Initializes the optional value {@link ActivityDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(String version);

    /**
     * Initializes the optional value {@link ActivityDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(Optional<String> version);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingDateTime() timingDateTime} to timingDateTime.
     * @param timingDateTime The value for timingDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingDateTime(String timingDateTime);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingDateTime() timingDateTime} to timingDateTime.
     * @param timingDateTime The value for timingDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingDateTime(Optional<String> timingDateTime);

    /**
     * Initializes the optional value {@link ActivityDefinition#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subtitle(String subtitle);

    /**
     * Initializes the optional value {@link ActivityDefinition#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subtitle(Optional<String> subtitle);

    /**
     * Initializes the optional value {@link ActivityDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link ActivityDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingDuration() timingDuration} to timingDuration.
     * @param timingDuration The value for timingDuration
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingDuration(Duration timingDuration);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingDuration() timingDuration} to timingDuration.
     * @param timingDuration The value for timingDuration
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingDuration(Optional<? extends Duration> timingDuration);

    /**
     * Initializes the optional value {@link ActivityDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link ActivityDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link ActivityDefinition#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(Code priority);

    /**
     * Initializes the optional value {@link ActivityDefinition#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(Optional<? extends Code> priority);

    /**
     * Initializes the optional value {@link ActivityDefinition#observationRequirement() observationRequirement} to observationRequirement.
     * @param observationRequirement The value for observationRequirement
     * @return {@code this} builder for chained invocation
     */
    BuildFinal observationRequirement(List<Reference> observationRequirement);

    /**
     * Initializes the optional value {@link ActivityDefinition#observationRequirement() observationRequirement} to observationRequirement.
     * @param observationRequirement The value for observationRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal observationRequirement(Optional<? extends List<Reference>> observationRequirement);

    /**
     * Initializes the optional value {@link ActivityDefinition#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dosage(List<Dosage> dosage);

    /**
     * Initializes the optional value {@link ActivityDefinition#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dosage(Optional<? extends List<Dosage>> dosage);

    /**
     * Initializes the optional value {@link ActivityDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link ActivityDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Initializes the optional value {@link ActivityDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(String name);

    /**
     * Initializes the optional value {@link ActivityDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<String> name);

    /**
     * Initializes the optional value {@link ActivityDefinition#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topic(List<CodeableConcept> topic);

    /**
     * Initializes the optional value {@link ActivityDefinition#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topic(Optional<? extends List<CodeableConcept>> topic);

    /**
     * Initializes the optional value {@link ActivityDefinition#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endorser(List<ContactDetail> endorser);

    /**
     * Initializes the optional value {@link ActivityDefinition#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endorser(Optional<? extends List<ContactDetail>> endorser);

    /**
     * Initializes the optional value {@link ActivityDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(Markdown description);

    /**
     * Initializes the optional value {@link ActivityDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<? extends Markdown> description);

    /**
     * Initializes the optional value {@link ActivityDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for chained invocation
     */
    BuildFinal experimental(boolean experimental);

    /**
     * Initializes the optional value {@link ActivityDefinition#experimental() experimental} to experimental.
     * @param experimental The value for experimental
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal experimental(Optional<Boolean> experimental);

    /**
     * Initializes the optional value {@link ActivityDefinition#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for chained invocation
     */
    BuildFinal profile(Canonical profile);

    /**
     * Initializes the optional value {@link ActivityDefinition#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal profile(Optional<? extends Canonical> profile);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingPeriod(Period timingPeriod);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingPeriod(Optional<? extends Period> timingPeriod);

    /**
     * Initializes the optional value {@link ActivityDefinition#specimenRequirement() specimenRequirement} to specimenRequirement.
     * @param specimenRequirement The value for specimenRequirement
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specimenRequirement(List<Reference> specimenRequirement);

    /**
     * Initializes the optional value {@link ActivityDefinition#specimenRequirement() specimenRequirement} to specimenRequirement.
     * @param specimenRequirement The value for specimenRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specimenRequirement(Optional<? extends List<Reference>> specimenRequirement);

    /**
     * Builds a new {@link ActivityDefinition ActivityDefinition}.
     * @return An immutable instance of ActivityDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ActivityDefinition build();
  }
}
