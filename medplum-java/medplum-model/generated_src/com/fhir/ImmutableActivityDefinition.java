//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ActivityDefinition}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableActivityDefinition.builder()}.
 */
@org.immutables.value.Generated(from = "ActivityDefinition", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableActivityDefinition implements com.fhir.ActivityDefinition {
  private final @javax.annotation.Nullable com.fhir.code priority;
  private final @javax.annotation.Nullable java.lang.Boolean experimental;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> library;
  private final @javax.annotation.Nullable java.lang.String publisher;
  private final @javax.annotation.Nullable com.fhir.uri url;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.Reference productReference;
  private final @javax.annotation.Nullable com.fhir.markdown purpose;
  private final @javax.annotation.Nullable com.fhir.canonical transform;
  private final @javax.annotation.Nullable com.fhir.date lastReviewDate;
  private final @javax.annotation.Nullable java.lang.String subtitle;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
  private final @javax.annotation.Nullable com.fhir.code kind;
  private final @javax.annotation.Nullable com.fhir.Period effectivePeriod;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Dosage> dosage;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author;
  private final @javax.annotation.Nullable com.fhir.Duration timingDuration;
  private final @javax.annotation.Nullable com.fhir.markdown copyright;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable com.fhir.ActivitydefinitionStatus status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> observationRequirement;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String timingDateTime;
  private final @javax.annotation.Nullable com.fhir.Period timingPeriod;
  private final @javax.annotation.Nullable com.fhir.date approvalDate;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> specimenRequirement;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic;
  private final @javax.annotation.Nullable java.lang.Boolean doNotPerform;
  private final @javax.annotation.Nullable com.fhir.code intent;
  private final @javax.annotation.Nullable com.fhir.Age timingAge;
  private final @javax.annotation.Nullable com.fhir.Reference location;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept subjectCodeableConcept;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.Timing timingTiming;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept productCodeableConcept;
  private final @javax.annotation.Nullable java.lang.String usage;
  private final @javax.annotation.Nullable com.fhir.Reference subjectReference;
  private final @javax.annotation.Nullable com.fhir.Range timingRange;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> bodySite;
  private final @javax.annotation.Nullable com.fhir.canonical profile;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.Quantity quantity;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ActivityDefinition_DynamicValue> dynamicValue;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ActivityDefinition_Participant> participant;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> observationResultRequirement;
  private final @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

  private ImmutableActivityDefinition(
      @javax.annotation.Nullable com.fhir.code priority,
      @javax.annotation.Nullable java.lang.Boolean experimental,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.CodeableConcept code,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> library,
      @javax.annotation.Nullable java.lang.String publisher,
      @javax.annotation.Nullable com.fhir.uri url,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.Reference productReference,
      @javax.annotation.Nullable com.fhir.markdown purpose,
      @javax.annotation.Nullable com.fhir.canonical transform,
      @javax.annotation.Nullable com.fhir.date lastReviewDate,
      @javax.annotation.Nullable java.lang.String subtitle,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor,
      @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext,
      @javax.annotation.Nullable com.fhir.code kind,
      @javax.annotation.Nullable com.fhir.Period effectivePeriod,
      @javax.annotation.Nullable java.util.List<com.fhir.Dosage> dosage,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author,
      @javax.annotation.Nullable com.fhir.Duration timingDuration,
      @javax.annotation.Nullable com.fhir.markdown copyright,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable com.fhir.ActivitydefinitionStatus status,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> observationRequirement,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String timingDateTime,
      @javax.annotation.Nullable com.fhir.Period timingPeriod,
      @javax.annotation.Nullable com.fhir.date approvalDate,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> specimenRequirement,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic,
      @javax.annotation.Nullable java.lang.Boolean doNotPerform,
      @javax.annotation.Nullable com.fhir.code intent,
      @javax.annotation.Nullable com.fhir.Age timingAge,
      @javax.annotation.Nullable com.fhir.Reference location,
      @javax.annotation.Nullable com.fhir.CodeableConcept subjectCodeableConcept,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.Timing timingTiming,
      @javax.annotation.Nullable com.fhir.CodeableConcept productCodeableConcept,
      @javax.annotation.Nullable java.lang.String usage,
      @javax.annotation.Nullable com.fhir.Reference subjectReference,
      @javax.annotation.Nullable com.fhir.Range timingRange,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> bodySite,
      @javax.annotation.Nullable com.fhir.canonical profile,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.Quantity quantity,
      @javax.annotation.Nullable java.util.List<com.fhir.ActivityDefinition_DynamicValue> dynamicValue,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.ActivityDefinition_Participant> participant,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> observationResultRequirement,
      @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension) {
    this.priority = priority;
    this.experimental = experimental;
    this.language = language;
    this.code = code;
    this.title = title;
    this.library = library;
    this.publisher = publisher;
    this.url = url;
    this.jurisdiction = jurisdiction;
    this.name = name;
    this.productReference = productReference;
    this.purpose = purpose;
    this.transform = transform;
    this.lastReviewDate = lastReviewDate;
    this.subtitle = subtitle;
    this.editor = editor;
    this.useContext = useContext;
    this.kind = kind;
    this.effectivePeriod = effectivePeriod;
    this.dosage = dosage;
    this.version = version;
    this.author = author;
    this.timingDuration = timingDuration;
    this.copyright = copyright;
    this.description = description;
    this.status = status;
    this.endorser = endorser;
    this.observationRequirement = observationRequirement;
    this.contact = contact;
    this.meta = meta;
    this.modifierExtension = modifierExtension;
    this.timingDateTime = timingDateTime;
    this.timingPeriod = timingPeriod;
    this.approvalDate = approvalDate;
    this.specimenRequirement = specimenRequirement;
    this.contained = contained;
    this.date = date;
    this.topic = topic;
    this.doNotPerform = doNotPerform;
    this.intent = intent;
    this.timingAge = timingAge;
    this.location = location;
    this.subjectCodeableConcept = subjectCodeableConcept;
    this.text = text;
    this.timingTiming = timingTiming;
    this.productCodeableConcept = productCodeableConcept;
    this.usage = usage;
    this.subjectReference = subjectReference;
    this.timingRange = timingRange;
    this.resourceType = resourceType;
    this.bodySite = bodySite;
    this.profile = profile;
    this.identifier = identifier;
    this.quantity = quantity;
    this.dynamicValue = dynamicValue;
    this.implicitRules = implicitRules;
    this.participant = participant;
    this.id = id;
    this.reviewer = reviewer;
    this.observationResultRequirement = observationResultRequirement;
    this.relatedArtifact = relatedArtifact;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code priority} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("priority")
  @Override
  public java.util.Optional<com.fhir.code> priority() {
    return java.util.Optional.ofNullable(priority);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> code() {
    return java.util.Optional.ofNullable(code);
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
   * @return The value of the {@code library} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("library")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> library() {
    return java.util.Optional.ofNullable(library);
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
   * @return The value of the {@code url} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @Override
  public java.util.Optional<com.fhir.uri> url() {
    return java.util.Optional.ofNullable(url);
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
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code productReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("productReference")
  @Override
  public java.util.Optional<com.fhir.Reference> productReference() {
    return java.util.Optional.ofNullable(productReference);
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
   * @return The value of the {@code transform} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("transform")
  @Override
  public java.util.Optional<com.fhir.canonical> transform() {
    return java.util.Optional.ofNullable(transform);
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
   * @return The value of the {@code subtitle} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subtitle")
  @Override
  public java.util.Optional<java.lang.String> subtitle() {
    return java.util.Optional.ofNullable(subtitle);
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
   * @return The value of the {@code useContext} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("useContext")
  @Override
  public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() {
    return java.util.Optional.ofNullable(useContext);
  }

  /**
   * @return The value of the {@code kind} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("kind")
  @Override
  public java.util.Optional<com.fhir.code> kind() {
    return java.util.Optional.ofNullable(kind);
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
   * @return The value of the {@code dosage} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dosage")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Dosage>> dosage() {
    return java.util.Optional.ofNullable(dosage);
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
   * @return The value of the {@code author} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("author")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> author() {
    return java.util.Optional.ofNullable(author);
  }

  /**
   * @return The value of the {@code timingDuration} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("timingDuration")
  @Override
  public java.util.Optional<com.fhir.Duration> timingDuration() {
    return java.util.Optional.ofNullable(timingDuration);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<com.fhir.markdown> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.ActivitydefinitionStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code observationRequirement} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("observationRequirement")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> observationRequirement() {
    return java.util.Optional.ofNullable(observationRequirement);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
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
   * @return The value of the {@code timingDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("timingDateTime")
  @Override
  public java.util.Optional<java.lang.String> timingDateTime() {
    return java.util.Optional.ofNullable(timingDateTime);
  }

  /**
   * @return The value of the {@code timingPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("timingPeriod")
  @Override
  public java.util.Optional<com.fhir.Period> timingPeriod() {
    return java.util.Optional.ofNullable(timingPeriod);
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
   * @return The value of the {@code specimenRequirement} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("specimenRequirement")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> specimenRequirement() {
    return java.util.Optional.ofNullable(specimenRequirement);
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
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.dateTime> date() {
    return java.util.Optional.ofNullable(date);
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
   * @return The value of the {@code doNotPerform} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("doNotPerform")
  @Override
  public java.util.Optional<java.lang.Boolean> doNotPerform() {
    return java.util.Optional.ofNullable(doNotPerform);
  }

  /**
   * @return The value of the {@code intent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("intent")
  @Override
  public java.util.Optional<com.fhir.code> intent() {
    return java.util.Optional.ofNullable(intent);
  }

  /**
   * @return The value of the {@code timingAge} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("timingAge")
  @Override
  public java.util.Optional<com.fhir.Age> timingAge() {
    return java.util.Optional.ofNullable(timingAge);
  }

  /**
   * @return The value of the {@code location} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("location")
  @Override
  public java.util.Optional<com.fhir.Reference> location() {
    return java.util.Optional.ofNullable(location);
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
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code timingTiming} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("timingTiming")
  @Override
  public java.util.Optional<com.fhir.Timing> timingTiming() {
    return java.util.Optional.ofNullable(timingTiming);
  }

  /**
   * @return The value of the {@code productCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("productCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> productCodeableConcept() {
    return java.util.Optional.ofNullable(productCodeableConcept);
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
   * @return The value of the {@code subjectReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subjectReference")
  @Override
  public java.util.Optional<com.fhir.Reference> subjectReference() {
    return java.util.Optional.ofNullable(subjectReference);
  }

  /**
   * @return The value of the {@code timingRange} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("timingRange")
  @Override
  public java.util.Optional<com.fhir.Range> timingRange() {
    return java.util.Optional.ofNullable(timingRange);
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
   * @return The value of the {@code bodySite} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> bodySite() {
    return java.util.Optional.ofNullable(bodySite);
  }

  /**
   * @return The value of the {@code profile} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("profile")
  @Override
  public java.util.Optional<com.fhir.canonical> profile() {
    return java.util.Optional.ofNullable(profile);
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
   * @return The value of the {@code quantity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("quantity")
  @Override
  public java.util.Optional<com.fhir.Quantity> quantity() {
    return java.util.Optional.ofNullable(quantity);
  }

  /**
   * @return The value of the {@code dynamicValue} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dynamicValue")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ActivityDefinition_DynamicValue>> dynamicValue() {
    return java.util.Optional.ofNullable(dynamicValue);
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
   * @return The value of the {@code participant} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("participant")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ActivityDefinition_Participant>> participant() {
    return java.util.Optional.ofNullable(participant);
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
   * @return The value of the {@code reviewer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reviewer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer() {
    return java.util.Optional.ofNullable(reviewer);
  }

  /**
   * @return The value of the {@code observationResultRequirement} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("observationResultRequirement")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> observationResultRequirement() {
    return java.util.Optional.ofNullable(observationResultRequirement);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withPriority(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableActivityDefinition(
        newValue,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withPriority(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableActivityDefinition(
        value,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#experimental() experimental} attribute.
   * @param value The value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withExperimental(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.experimental, newValue)) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        newValue,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#experimental() experimental} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for experimental
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withExperimental(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.experimental, value)) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        value,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        newValue,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        value,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        newValue,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        value,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        newValue,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        value,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#library() library} attribute.
   * @param value The value for library
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withLibrary(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "library");
    if (this.library == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        newValue,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#library() library} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for library
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withLibrary(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.library == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        value,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#publisher() publisher} attribute.
   * @param value The value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withPublisher(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "publisher");
    if (java.util.Objects.equals(this.publisher, newValue)) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        newValue,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#publisher() publisher} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for publisher
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withPublisher(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.publisher, value)) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        value,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        newValue,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        value,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withJurisdiction(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        newValue,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withJurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        value,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        newValue,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        value,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#productReference() productReference} attribute.
   * @param value The value for productReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withProductReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "productReference");
    if (this.productReference == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        newValue,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#productReference() productReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withProductReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.productReference == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        value,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withPurpose(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        newValue,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withPurpose(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        value,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#transform() transform} attribute.
   * @param value The value for transform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withTransform(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "transform");
    if (this.transform == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        newValue,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#transform() transform} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for transform
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withTransform(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.transform == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        value,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#lastReviewDate() lastReviewDate} attribute.
   * @param value The value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withLastReviewDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "lastReviewDate");
    if (this.lastReviewDate == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        newValue,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#lastReviewDate() lastReviewDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastReviewDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withLastReviewDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.lastReviewDate == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        value,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#subtitle() subtitle} attribute.
   * @param value The value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withSubtitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "subtitle");
    if (java.util.Objects.equals(this.subtitle, newValue)) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        newValue,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#subtitle() subtitle} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subtitle
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withSubtitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.subtitle, value)) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        value,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#editor() editor} attribute.
   * @param value The value for editor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withEditor(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "editor");
    if (this.editor == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        newValue,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#editor() editor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for editor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withEditor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.editor == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        value,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#useContext() useContext} attribute.
   * @param value The value for useContext
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withUseContext(java.util.List<com.fhir.UsageContext> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> newValue = java.util.Objects.requireNonNull(value, "useContext");
    if (this.useContext == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        newValue,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#useContext() useContext} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for useContext
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withUseContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> value = optional.orElse(null);
    if (this.useContext == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        value,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#kind() kind} attribute.
   * @param value The value for kind
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withKind(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "kind");
    if (this.kind == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        newValue,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#kind() kind} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for kind
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withKind(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.kind == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        value,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#effectivePeriod() effectivePeriod} attribute.
   * @param value The value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withEffectivePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "effectivePeriod");
    if (this.effectivePeriod == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        newValue,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#effectivePeriod() effectivePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for effectivePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withEffectivePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.effectivePeriod == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        value,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#dosage() dosage} attribute.
   * @param value The value for dosage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withDosage(java.util.List<com.fhir.Dosage> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Dosage> newValue = java.util.Objects.requireNonNull(value, "dosage");
    if (this.dosage == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        newValue,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#dosage() dosage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dosage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withDosage(java.util.Optional<? extends java.util.List<com.fhir.Dosage>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Dosage> value = optional.orElse(null);
    if (this.dosage == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        value,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        newValue,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        value,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withAuthor(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        newValue,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withAuthor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        value,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#timingDuration() timingDuration} attribute.
   * @param value The value for timingDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withTimingDuration(com.fhir.Duration value) {
    @javax.annotation.Nullable com.fhir.Duration newValue = java.util.Objects.requireNonNull(value, "timingDuration");
    if (this.timingDuration == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        newValue,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#timingDuration() timingDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withTimingDuration(java.util.Optional<? extends com.fhir.Duration> optional) {
    @javax.annotation.Nullable com.fhir.Duration value = optional.orElse(null);
    if (this.timingDuration == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        value,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#copyright() copyright} attribute.
   * @param value The value for copyright
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withCopyright(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "copyright");
    if (this.copyright == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        newValue,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#copyright() copyright} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for copyright
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withCopyright(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.copyright == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        value,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        newValue,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        value,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withStatus(com.fhir.ActivitydefinitionStatus value) {
    @javax.annotation.Nullable com.fhir.ActivitydefinitionStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        newValue,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withStatus(java.util.Optional<? extends com.fhir.ActivitydefinitionStatus> optional) {
    @javax.annotation.Nullable com.fhir.ActivitydefinitionStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        value,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#endorser() endorser} attribute.
   * @param value The value for endorser
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withEndorser(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "endorser");
    if (this.endorser == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        newValue,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#endorser() endorser} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endorser
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withEndorser(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.endorser == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        value,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#observationRequirement() observationRequirement} attribute.
   * @param value The value for observationRequirement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withObservationRequirement(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "observationRequirement");
    if (this.observationRequirement == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        newValue,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#observationRequirement() observationRequirement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for observationRequirement
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withObservationRequirement(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.observationRequirement == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        value,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        newValue,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        value,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        newValue,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        value,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        newValue,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        value,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#timingDateTime() timingDateTime} attribute.
   * @param value The value for timingDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withTimingDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "timingDateTime");
    if (java.util.Objects.equals(this.timingDateTime, newValue)) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        newValue,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#timingDateTime() timingDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withTimingDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.timingDateTime, value)) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        value,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#timingPeriod() timingPeriod} attribute.
   * @param value The value for timingPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withTimingPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "timingPeriod");
    if (this.timingPeriod == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        newValue,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#timingPeriod() timingPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withTimingPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.timingPeriod == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        value,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#approvalDate() approvalDate} attribute.
   * @param value The value for approvalDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withApprovalDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "approvalDate");
    if (this.approvalDate == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        newValue,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#approvalDate() approvalDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for approvalDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withApprovalDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.approvalDate == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        value,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#specimenRequirement() specimenRequirement} attribute.
   * @param value The value for specimenRequirement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withSpecimenRequirement(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "specimenRequirement");
    if (this.specimenRequirement == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        newValue,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#specimenRequirement() specimenRequirement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specimenRequirement
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withSpecimenRequirement(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.specimenRequirement == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        value,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        newValue,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        value,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        newValue,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        value,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#topic() topic} attribute.
   * @param value The value for topic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withTopic(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "topic");
    if (this.topic == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        newValue,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#topic() topic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withTopic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.topic == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        value,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#doNotPerform() doNotPerform} attribute.
   * @param value The value for doNotPerform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withDoNotPerform(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.doNotPerform, newValue)) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        newValue,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#doNotPerform() doNotPerform} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doNotPerform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withDoNotPerform(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.doNotPerform, value)) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        value,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#intent() intent} attribute.
   * @param value The value for intent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withIntent(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "intent");
    if (this.intent == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        newValue,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#intent() intent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withIntent(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.intent == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        value,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#timingAge() timingAge} attribute.
   * @param value The value for timingAge
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withTimingAge(com.fhir.Age value) {
    @javax.annotation.Nullable com.fhir.Age newValue = java.util.Objects.requireNonNull(value, "timingAge");
    if (this.timingAge == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        newValue,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#timingAge() timingAge} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingAge
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withTimingAge(java.util.Optional<? extends com.fhir.Age> optional) {
    @javax.annotation.Nullable com.fhir.Age value = optional.orElse(null);
    if (this.timingAge == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        value,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withLocation(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        newValue,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withLocation(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        value,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * @param value The value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withSubjectCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "subjectCodeableConcept");
    if (this.subjectCodeableConcept == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        newValue,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#subjectCodeableConcept() subjectCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withSubjectCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.subjectCodeableConcept == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        value,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        newValue,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        value,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#timingTiming() timingTiming} attribute.
   * @param value The value for timingTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withTimingTiming(com.fhir.Timing value) {
    @javax.annotation.Nullable com.fhir.Timing newValue = java.util.Objects.requireNonNull(value, "timingTiming");
    if (this.timingTiming == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        newValue,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#timingTiming() timingTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withTimingTiming(java.util.Optional<? extends com.fhir.Timing> optional) {
    @javax.annotation.Nullable com.fhir.Timing value = optional.orElse(null);
    if (this.timingTiming == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        value,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#productCodeableConcept() productCodeableConcept} attribute.
   * @param value The value for productCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withProductCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "productCodeableConcept");
    if (this.productCodeableConcept == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        newValue,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#productCodeableConcept() productCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withProductCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.productCodeableConcept == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        value,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#usage() usage} attribute.
   * @param value The value for usage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withUsage(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "usage");
    if (java.util.Objects.equals(this.usage, newValue)) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        newValue,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#usage() usage} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for usage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withUsage(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.usage, value)) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        value,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#subjectReference() subjectReference} attribute.
   * @param value The value for subjectReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withSubjectReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subjectReference");
    if (this.subjectReference == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        newValue,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#subjectReference() subjectReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withSubjectReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subjectReference == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        value,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#timingRange() timingRange} attribute.
   * @param value The value for timingRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withTimingRange(com.fhir.Range value) {
    @javax.annotation.Nullable com.fhir.Range newValue = java.util.Objects.requireNonNull(value, "timingRange");
    if (this.timingRange == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        newValue,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#timingRange() timingRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timingRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withTimingRange(java.util.Optional<? extends com.fhir.Range> optional) {
    @javax.annotation.Nullable com.fhir.Range value = optional.orElse(null);
    if (this.timingRange == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        value,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ActivityDefinition#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableActivityDefinition withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        newValue,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#bodySite() bodySite} attribute.
   * @param value The value for bodySite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withBodySite(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "bodySite");
    if (this.bodySite == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        newValue,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#bodySite() bodySite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodySite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withBodySite(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.bodySite == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        value,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#profile() profile} attribute.
   * @param value The value for profile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withProfile(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "profile");
    if (this.profile == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        newValue,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#profile() profile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for profile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withProfile(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.profile == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        value,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        newValue,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        value,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withQuantity(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        newValue,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withQuantity(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        value,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#dynamicValue() dynamicValue} attribute.
   * @param value The value for dynamicValue
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withDynamicValue(java.util.List<com.fhir.ActivityDefinition_DynamicValue> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ActivityDefinition_DynamicValue> newValue = java.util.Objects.requireNonNull(value, "dynamicValue");
    if (this.dynamicValue == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        newValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#dynamicValue() dynamicValue} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dynamicValue
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withDynamicValue(java.util.Optional<? extends java.util.List<com.fhir.ActivityDefinition_DynamicValue>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ActivityDefinition_DynamicValue> value = optional.orElse(null);
    if (this.dynamicValue == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        value,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        newValue,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        value,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#participant() participant} attribute.
   * @param value The value for participant
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withParticipant(java.util.List<com.fhir.ActivityDefinition_Participant> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ActivityDefinition_Participant> newValue = java.util.Objects.requireNonNull(value, "participant");
    if (this.participant == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        newValue,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#participant() participant} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for participant
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withParticipant(java.util.Optional<? extends java.util.List<com.fhir.ActivityDefinition_Participant>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ActivityDefinition_Participant> value = optional.orElse(null);
    if (this.participant == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        value,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        newValue,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        value,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#reviewer() reviewer} attribute.
   * @param value The value for reviewer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withReviewer(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "reviewer");
    if (this.reviewer == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        newValue,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#reviewer() reviewer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reviewer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withReviewer(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.reviewer == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        value,
        this.observationResultRequirement,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#observationResultRequirement() observationResultRequirement} attribute.
   * @param value The value for observationResultRequirement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withObservationResultRequirement(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "observationResultRequirement");
    if (this.observationResultRequirement == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        newValue,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#observationResultRequirement() observationResultRequirement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for observationResultRequirement
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withObservationResultRequirement(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.observationResultRequirement == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        value,
        this.relatedArtifact,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#relatedArtifact() relatedArtifact} attribute.
   * @param value The value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withRelatedArtifact(java.util.List<com.fhir.RelatedArtifact> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> newValue = java.util.Objects.requireNonNull(value, "relatedArtifact");
    if (this.relatedArtifact == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#relatedArtifact() relatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withRelatedArtifact(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> value = optional.orElse(null);
    if (this.relatedArtifact == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ActivityDefinition#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableActivityDefinition withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ActivityDefinition#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableActivityDefinition withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableActivityDefinition(
        this.priority,
        this.experimental,
        this.language,
        this.code,
        this.title,
        this.library,
        this.publisher,
        this.url,
        this.jurisdiction,
        this.name,
        this.productReference,
        this.purpose,
        this.transform,
        this.lastReviewDate,
        this.subtitle,
        this.editor,
        this.useContext,
        this.kind,
        this.effectivePeriod,
        this.dosage,
        this.version,
        this.author,
        this.timingDuration,
        this.copyright,
        this.description,
        this.status,
        this.endorser,
        this.observationRequirement,
        this.contact,
        this.meta,
        this.modifierExtension,
        this.timingDateTime,
        this.timingPeriod,
        this.approvalDate,
        this.specimenRequirement,
        this.contained,
        this.date,
        this.topic,
        this.doNotPerform,
        this.intent,
        this.timingAge,
        this.location,
        this.subjectCodeableConcept,
        this.text,
        this.timingTiming,
        this.productCodeableConcept,
        this.usage,
        this.subjectReference,
        this.timingRange,
        this.resourceType,
        this.bodySite,
        this.profile,
        this.identifier,
        this.quantity,
        this.dynamicValue,
        this.implicitRules,
        this.participant,
        this.id,
        this.reviewer,
        this.observationResultRequirement,
        this.relatedArtifact,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableActivityDefinition} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableActivityDefinition
        && equalTo((ImmutableActivityDefinition) another);
  }

  private boolean equalTo(ImmutableActivityDefinition another) {
    return java.util.Objects.equals(priority, another.priority)
        && java.util.Objects.equals(experimental, another.experimental)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(library, another.library)
        && java.util.Objects.equals(publisher, another.publisher)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(jurisdiction, another.jurisdiction)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(productReference, another.productReference)
        && java.util.Objects.equals(purpose, another.purpose)
        && java.util.Objects.equals(transform, another.transform)
        && java.util.Objects.equals(lastReviewDate, another.lastReviewDate)
        && java.util.Objects.equals(subtitle, another.subtitle)
        && java.util.Objects.equals(editor, another.editor)
        && java.util.Objects.equals(useContext, another.useContext)
        && java.util.Objects.equals(kind, another.kind)
        && java.util.Objects.equals(effectivePeriod, another.effectivePeriod)
        && java.util.Objects.equals(dosage, another.dosage)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(author, another.author)
        && java.util.Objects.equals(timingDuration, another.timingDuration)
        && java.util.Objects.equals(copyright, another.copyright)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(endorser, another.endorser)
        && java.util.Objects.equals(observationRequirement, another.observationRequirement)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(timingDateTime, another.timingDateTime)
        && java.util.Objects.equals(timingPeriod, another.timingPeriod)
        && java.util.Objects.equals(approvalDate, another.approvalDate)
        && java.util.Objects.equals(specimenRequirement, another.specimenRequirement)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(topic, another.topic)
        && java.util.Objects.equals(doNotPerform, another.doNotPerform)
        && java.util.Objects.equals(intent, another.intent)
        && java.util.Objects.equals(timingAge, another.timingAge)
        && java.util.Objects.equals(location, another.location)
        && java.util.Objects.equals(subjectCodeableConcept, another.subjectCodeableConcept)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(timingTiming, another.timingTiming)
        && java.util.Objects.equals(productCodeableConcept, another.productCodeableConcept)
        && java.util.Objects.equals(usage, another.usage)
        && java.util.Objects.equals(subjectReference, another.subjectReference)
        && java.util.Objects.equals(timingRange, another.timingRange)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(bodySite, another.bodySite)
        && java.util.Objects.equals(profile, another.profile)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(quantity, another.quantity)
        && java.util.Objects.equals(dynamicValue, another.dynamicValue)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(participant, another.participant)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(reviewer, another.reviewer)
        && java.util.Objects.equals(observationResultRequirement, another.observationResultRequirement)
        && java.util.Objects.equals(relatedArtifact, another.relatedArtifact)
        && java.util.Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code priority}, {@code experimental}, {@code language}, {@code code}, {@code title}, {@code library}, {@code publisher}, {@code url}, {@code jurisdiction}, {@code name}, {@code productReference}, {@code purpose}, {@code transform}, {@code lastReviewDate}, {@code subtitle}, {@code editor}, {@code useContext}, {@code kind}, {@code effectivePeriod}, {@code dosage}, {@code version}, {@code author}, {@code timingDuration}, {@code copyright}, {@code description}, {@code status}, {@code endorser}, {@code observationRequirement}, {@code contact}, {@code meta}, {@code modifierExtension}, {@code timingDateTime}, {@code timingPeriod}, {@code approvalDate}, {@code specimenRequirement}, {@code contained}, {@code date}, {@code topic}, {@code doNotPerform}, {@code intent}, {@code timingAge}, {@code location}, {@code subjectCodeableConcept}, {@code text}, {@code timingTiming}, {@code productCodeableConcept}, {@code usage}, {@code subjectReference}, {@code timingRange}, {@code resourceType}, {@code bodySite}, {@code profile}, {@code identifier}, {@code quantity}, {@code dynamicValue}, {@code implicitRules}, {@code participant}, {@code id}, {@code reviewer}, {@code observationResultRequirement}, {@code relatedArtifact}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(priority);
    h += (h << 5) + java.util.Objects.hashCode(experimental);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(library);
    h += (h << 5) + java.util.Objects.hashCode(publisher);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(jurisdiction);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(productReference);
    h += (h << 5) + java.util.Objects.hashCode(purpose);
    h += (h << 5) + java.util.Objects.hashCode(transform);
    h += (h << 5) + java.util.Objects.hashCode(lastReviewDate);
    h += (h << 5) + java.util.Objects.hashCode(subtitle);
    h += (h << 5) + java.util.Objects.hashCode(editor);
    h += (h << 5) + java.util.Objects.hashCode(useContext);
    h += (h << 5) + java.util.Objects.hashCode(kind);
    h += (h << 5) + java.util.Objects.hashCode(effectivePeriod);
    h += (h << 5) + java.util.Objects.hashCode(dosage);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(author);
    h += (h << 5) + java.util.Objects.hashCode(timingDuration);
    h += (h << 5) + java.util.Objects.hashCode(copyright);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(endorser);
    h += (h << 5) + java.util.Objects.hashCode(observationRequirement);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(timingDateTime);
    h += (h << 5) + java.util.Objects.hashCode(timingPeriod);
    h += (h << 5) + java.util.Objects.hashCode(approvalDate);
    h += (h << 5) + java.util.Objects.hashCode(specimenRequirement);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(topic);
    h += (h << 5) + java.util.Objects.hashCode(doNotPerform);
    h += (h << 5) + java.util.Objects.hashCode(intent);
    h += (h << 5) + java.util.Objects.hashCode(timingAge);
    h += (h << 5) + java.util.Objects.hashCode(location);
    h += (h << 5) + java.util.Objects.hashCode(subjectCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(timingTiming);
    h += (h << 5) + java.util.Objects.hashCode(productCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(usage);
    h += (h << 5) + java.util.Objects.hashCode(subjectReference);
    h += (h << 5) + java.util.Objects.hashCode(timingRange);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(bodySite);
    h += (h << 5) + java.util.Objects.hashCode(profile);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(quantity);
    h += (h << 5) + java.util.Objects.hashCode(dynamicValue);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(participant);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(reviewer);
    h += (h << 5) + java.util.Objects.hashCode(observationResultRequirement);
    h += (h << 5) + java.util.Objects.hashCode(relatedArtifact);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code ActivityDefinition} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ActivityDefinition{");
    if (priority != null) {
      builder.append("priority=").append(priority);
    }
    if (experimental != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("experimental=").append(experimental);
    }
    if (language != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (code != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (title != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (library != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("library=").append(library);
    }
    if (publisher != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("publisher=").append(publisher);
    }
    if (url != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (jurisdiction != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    if (name != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (productReference != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("productReference=").append(productReference);
    }
    if (purpose != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (transform != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("transform=").append(transform);
    }
    if (lastReviewDate != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("lastReviewDate=").append(lastReviewDate);
    }
    if (subtitle != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("subtitle=").append(subtitle);
    }
    if (editor != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("editor=").append(editor);
    }
    if (useContext != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("useContext=").append(useContext);
    }
    if (kind != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("kind=").append(kind);
    }
    if (effectivePeriod != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("effectivePeriod=").append(effectivePeriod);
    }
    if (dosage != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("dosage=").append(dosage);
    }
    if (version != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (author != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("author=").append(author);
    }
    if (timingDuration != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("timingDuration=").append(timingDuration);
    }
    if (copyright != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("copyright=").append(copyright);
    }
    if (description != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (status != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (endorser != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("endorser=").append(endorser);
    }
    if (observationRequirement != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("observationRequirement=").append(observationRequirement);
    }
    if (contact != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (meta != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (timingDateTime != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("timingDateTime=").append(timingDateTime);
    }
    if (timingPeriod != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("timingPeriod=").append(timingPeriod);
    }
    if (approvalDate != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("approvalDate=").append(approvalDate);
    }
    if (specimenRequirement != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("specimenRequirement=").append(specimenRequirement);
    }
    if (contained != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (date != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (topic != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("topic=").append(topic);
    }
    if (doNotPerform != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("doNotPerform=").append(doNotPerform);
    }
    if (intent != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("intent=").append(intent);
    }
    if (timingAge != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("timingAge=").append(timingAge);
    }
    if (location != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("location=").append(location);
    }
    if (subjectCodeableConcept != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("subjectCodeableConcept=").append(subjectCodeableConcept);
    }
    if (text != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (timingTiming != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("timingTiming=").append(timingTiming);
    }
    if (productCodeableConcept != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("productCodeableConcept=").append(productCodeableConcept);
    }
    if (usage != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("usage=").append(usage);
    }
    if (subjectReference != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("subjectReference=").append(subjectReference);
    }
    if (timingRange != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("timingRange=").append(timingRange);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (bodySite != null) {
      builder.append(", ");
      builder.append("bodySite=").append(bodySite);
    }
    if (profile != null) {
      builder.append(", ");
      builder.append("profile=").append(profile);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (quantity != null) {
      builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (dynamicValue != null) {
      builder.append(", ");
      builder.append("dynamicValue=").append(dynamicValue);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (participant != null) {
      builder.append(", ");
      builder.append("participant=").append(participant);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (reviewer != null) {
      builder.append(", ");
      builder.append("reviewer=").append(reviewer);
    }
    if (observationResultRequirement != null) {
      builder.append(", ");
      builder.append("observationResultRequirement=").append(observationResultRequirement);
    }
    if (relatedArtifact != null) {
      builder.append(", ");
      builder.append("relatedArtifact=").append(relatedArtifact);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ActivityDefinition", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ActivityDefinition {
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> priority = java.util.Optional.empty();
    boolean priorityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> experimental = java.util.Optional.empty();
    boolean experimentalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> library = java.util.Optional.empty();
    boolean libraryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> publisher = java.util.Optional.empty();
    boolean publisherIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction = java.util.Optional.empty();
    boolean jurisdictionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> productReference = java.util.Optional.empty();
    boolean productReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> purpose = java.util.Optional.empty();
    boolean purposeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> transform = java.util.Optional.empty();
    boolean transformIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> lastReviewDate = java.util.Optional.empty();
    boolean lastReviewDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> subtitle = java.util.Optional.empty();
    boolean subtitleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor = java.util.Optional.empty();
    boolean editorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext = java.util.Optional.empty();
    boolean useContextIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> kind = java.util.Optional.empty();
    boolean kindIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> effectivePeriod = java.util.Optional.empty();
    boolean effectivePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Dosage>> dosage = java.util.Optional.empty();
    boolean dosageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> author = java.util.Optional.empty();
    boolean authorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Duration> timingDuration = java.util.Optional.empty();
    boolean timingDurationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> copyright = java.util.Optional.empty();
    boolean copyrightIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ActivitydefinitionStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser = java.util.Optional.empty();
    boolean endorserIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> observationRequirement = java.util.Optional.empty();
    boolean observationRequirementIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> timingDateTime = java.util.Optional.empty();
    boolean timingDateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> timingPeriod = java.util.Optional.empty();
    boolean timingPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> approvalDate = java.util.Optional.empty();
    boolean approvalDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> specimenRequirement = java.util.Optional.empty();
    boolean specimenRequirementIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic = java.util.Optional.empty();
    boolean topicIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> doNotPerform = java.util.Optional.empty();
    boolean doNotPerformIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> intent = java.util.Optional.empty();
    boolean intentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Age> timingAge = java.util.Optional.empty();
    boolean timingAgeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> location = java.util.Optional.empty();
    boolean locationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> subjectCodeableConcept = java.util.Optional.empty();
    boolean subjectCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Timing> timingTiming = java.util.Optional.empty();
    boolean timingTimingIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> productCodeableConcept = java.util.Optional.empty();
    boolean productCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> usage = java.util.Optional.empty();
    boolean usageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subjectReference = java.util.Optional.empty();
    boolean subjectReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Range> timingRange = java.util.Optional.empty();
    boolean timingRangeIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> bodySite = java.util.Optional.empty();
    boolean bodySiteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> profile = java.util.Optional.empty();
    boolean profileIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> quantity = java.util.Optional.empty();
    boolean quantityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ActivityDefinition_DynamicValue>> dynamicValue = java.util.Optional.empty();
    boolean dynamicValueIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ActivityDefinition_Participant>> participant = java.util.Optional.empty();
    boolean participantIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer = java.util.Optional.empty();
    boolean reviewerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> observationResultRequirement = java.util.Optional.empty();
    boolean observationResultRequirementIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact = java.util.Optional.empty();
    boolean relatedArtifactIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public void setPriority(java.util.Optional<com.fhir.code> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("experimental")
    public void setExperimental(java.util.Optional<java.lang.Boolean> experimental) {
      this.experimental = experimental;
      this.experimentalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("library")
    public void setLibrary(java.util.Optional<java.util.List<com.fhir.canonical>> library) {
      this.library = library;
      this.libraryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("publisher")
    public void setPublisher(java.util.Optional<java.lang.String> publisher) {
      this.publisher = publisher;
      this.publisherIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("jurisdiction")
    public void setJurisdiction(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("productReference")
    public void setProductReference(java.util.Optional<com.fhir.Reference> productReference) {
      this.productReference = productReference;
      this.productReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    public void setPurpose(java.util.Optional<com.fhir.markdown> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("transform")
    public void setTransform(java.util.Optional<com.fhir.canonical> transform) {
      this.transform = transform;
      this.transformIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lastReviewDate")
    public void setLastReviewDate(java.util.Optional<com.fhir.date> lastReviewDate) {
      this.lastReviewDate = lastReviewDate;
      this.lastReviewDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subtitle")
    public void setSubtitle(java.util.Optional<java.lang.String> subtitle) {
      this.subtitle = subtitle;
      this.subtitleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("editor")
    public void setEditor(java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor) {
      this.editor = editor;
      this.editorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("useContext")
    public void setUseContext(java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext) {
      this.useContext = useContext;
      this.useContextIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    public void setKind(java.util.Optional<com.fhir.code> kind) {
      this.kind = kind;
      this.kindIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("effectivePeriod")
    public void setEffectivePeriod(java.util.Optional<com.fhir.Period> effectivePeriod) {
      this.effectivePeriod = effectivePeriod;
      this.effectivePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dosage")
    public void setDosage(java.util.Optional<java.util.List<com.fhir.Dosage>> dosage) {
      this.dosage = dosage;
      this.dosageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public void setAuthor(java.util.Optional<java.util.List<com.fhir.ContactDetail>> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timingDuration")
    public void setTimingDuration(java.util.Optional<com.fhir.Duration> timingDuration) {
      this.timingDuration = timingDuration;
      this.timingDurationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("copyright")
    public void setCopyright(java.util.Optional<com.fhir.markdown> copyright) {
      this.copyright = copyright;
      this.copyrightIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.ActivitydefinitionStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("endorser")
    public void setEndorser(java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser) {
      this.endorser = endorser;
      this.endorserIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("observationRequirement")
    public void setObservationRequirement(java.util.Optional<java.util.List<com.fhir.Reference>> observationRequirement) {
      this.observationRequirement = observationRequirement;
      this.observationRequirementIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timingDateTime")
    public void setTimingDateTime(java.util.Optional<java.lang.String> timingDateTime) {
      this.timingDateTime = timingDateTime;
      this.timingDateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timingPeriod")
    public void setTimingPeriod(java.util.Optional<com.fhir.Period> timingPeriod) {
      this.timingPeriod = timingPeriod;
      this.timingPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("approvalDate")
    public void setApprovalDate(java.util.Optional<com.fhir.date> approvalDate) {
      this.approvalDate = approvalDate;
      this.approvalDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("specimenRequirement")
    public void setSpecimenRequirement(java.util.Optional<java.util.List<com.fhir.Reference>> specimenRequirement) {
      this.specimenRequirement = specimenRequirement;
      this.specimenRequirementIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("topic")
    public void setTopic(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic) {
      this.topic = topic;
      this.topicIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("doNotPerform")
    public void setDoNotPerform(java.util.Optional<java.lang.Boolean> doNotPerform) {
      this.doNotPerform = doNotPerform;
      this.doNotPerformIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("intent")
    public void setIntent(java.util.Optional<com.fhir.code> intent) {
      this.intent = intent;
      this.intentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timingAge")
    public void setTimingAge(java.util.Optional<com.fhir.Age> timingAge) {
      this.timingAge = timingAge;
      this.timingAgeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public void setLocation(java.util.Optional<com.fhir.Reference> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subjectCodeableConcept")
    public void setSubjectCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> subjectCodeableConcept) {
      this.subjectCodeableConcept = subjectCodeableConcept;
      this.subjectCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timingTiming")
    public void setTimingTiming(java.util.Optional<com.fhir.Timing> timingTiming) {
      this.timingTiming = timingTiming;
      this.timingTimingIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("productCodeableConcept")
    public void setProductCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> productCodeableConcept) {
      this.productCodeableConcept = productCodeableConcept;
      this.productCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    public void setUsage(java.util.Optional<java.lang.String> usage) {
      this.usage = usage;
      this.usageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subjectReference")
    public void setSubjectReference(java.util.Optional<com.fhir.Reference> subjectReference) {
      this.subjectReference = subjectReference;
      this.subjectReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("timingRange")
    public void setTimingRange(java.util.Optional<com.fhir.Range> timingRange) {
      this.timingRange = timingRange;
      this.timingRangeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
    public void setBodySite(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> bodySite) {
      this.bodySite = bodySite;
      this.bodySiteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    public void setProfile(java.util.Optional<com.fhir.canonical> profile) {
      this.profile = profile;
      this.profileIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public void setQuantity(java.util.Optional<com.fhir.Quantity> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dynamicValue")
    public void setDynamicValue(java.util.Optional<java.util.List<com.fhir.ActivityDefinition_DynamicValue>> dynamicValue) {
      this.dynamicValue = dynamicValue;
      this.dynamicValueIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("participant")
    public void setParticipant(java.util.Optional<java.util.List<com.fhir.ActivityDefinition_Participant>> participant) {
      this.participant = participant;
      this.participantIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reviewer")
    public void setReviewer(java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer) {
      this.reviewer = reviewer;
      this.reviewerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("observationResultRequirement")
    public void setObservationResultRequirement(java.util.Optional<java.util.List<com.fhir.Reference>> observationResultRequirement) {
      this.observationResultRequirement = observationResultRequirement;
      this.observationResultRequirementIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("relatedArtifact")
    public void setRelatedArtifact(java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact) {
      this.relatedArtifact = relatedArtifact;
      this.relatedArtifactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.code> priority() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> experimental() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> library() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> publisher() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> productReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.canonical> transform() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> lastReviewDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> subtitle() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> editor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UsageContext>> useContext() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> kind() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> effectivePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Dosage>> dosage() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> author() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Duration> timingDuration() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> copyright() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ActivitydefinitionStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> endorser() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> observationRequirement() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> timingDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> timingPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> approvalDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> specimenRequirement() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> topic() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> doNotPerform() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> intent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Age> timingAge() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> location() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> subjectCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Timing> timingTiming() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> productCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> usage() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subjectReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Range> timingRange() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> bodySite() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.canonical> profile() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> quantity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ActivityDefinition_DynamicValue>> dynamicValue() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ActivityDefinition_Participant>> participant() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> reviewer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> observationResultRequirement() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableActivityDefinition fromJson(Json json) {
    ImmutableActivityDefinition.Builder builder = ((ImmutableActivityDefinition.Builder) ImmutableActivityDefinition.builder());
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.experimentalIsSet) {
      builder.experimental(json.experimental);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.libraryIsSet) {
      builder.library(json.library);
    }
    if (json.publisherIsSet) {
      builder.publisher(json.publisher);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.productReferenceIsSet) {
      builder.productReference(json.productReference);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.transformIsSet) {
      builder.transform(json.transform);
    }
    if (json.lastReviewDateIsSet) {
      builder.lastReviewDate(json.lastReviewDate);
    }
    if (json.subtitleIsSet) {
      builder.subtitle(json.subtitle);
    }
    if (json.editorIsSet) {
      builder.editor(json.editor);
    }
    if (json.useContextIsSet) {
      builder.useContext(json.useContext);
    }
    if (json.kindIsSet) {
      builder.kind(json.kind);
    }
    if (json.effectivePeriodIsSet) {
      builder.effectivePeriod(json.effectivePeriod);
    }
    if (json.dosageIsSet) {
      builder.dosage(json.dosage);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.timingDurationIsSet) {
      builder.timingDuration(json.timingDuration);
    }
    if (json.copyrightIsSet) {
      builder.copyright(json.copyright);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.endorserIsSet) {
      builder.endorser(json.endorser);
    }
    if (json.observationRequirementIsSet) {
      builder.observationRequirement(json.observationRequirement);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.timingDateTimeIsSet) {
      builder.timingDateTime(json.timingDateTime);
    }
    if (json.timingPeriodIsSet) {
      builder.timingPeriod(json.timingPeriod);
    }
    if (json.approvalDateIsSet) {
      builder.approvalDate(json.approvalDate);
    }
    if (json.specimenRequirementIsSet) {
      builder.specimenRequirement(json.specimenRequirement);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.topicIsSet) {
      builder.topic(json.topic);
    }
    if (json.doNotPerformIsSet) {
      builder.doNotPerform(json.doNotPerform);
    }
    if (json.intentIsSet) {
      builder.intent(json.intent);
    }
    if (json.timingAgeIsSet) {
      builder.timingAge(json.timingAge);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.subjectCodeableConceptIsSet) {
      builder.subjectCodeableConcept(json.subjectCodeableConcept);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.timingTimingIsSet) {
      builder.timingTiming(json.timingTiming);
    }
    if (json.productCodeableConceptIsSet) {
      builder.productCodeableConcept(json.productCodeableConcept);
    }
    if (json.usageIsSet) {
      builder.usage(json.usage);
    }
    if (json.subjectReferenceIsSet) {
      builder.subjectReference(json.subjectReference);
    }
    if (json.timingRangeIsSet) {
      builder.timingRange(json.timingRange);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.bodySiteIsSet) {
      builder.bodySite(json.bodySite);
    }
    if (json.profileIsSet) {
      builder.profile(json.profile);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.dynamicValueIsSet) {
      builder.dynamicValue(json.dynamicValue);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.participantIsSet) {
      builder.participant(json.participant);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.reviewerIsSet) {
      builder.reviewer(json.reviewer);
    }
    if (json.observationResultRequirementIsSet) {
      builder.observationResultRequirement(json.observationResultRequirement);
    }
    if (json.relatedArtifactIsSet) {
      builder.relatedArtifact(json.relatedArtifact);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
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
        .priority(instance.priority())
        .experimental(instance.experimental())
        .language(instance.language())
        .code(instance.code())
        .title(instance.title())
        .library(instance.library())
        .publisher(instance.publisher())
        .url(instance.url())
        .jurisdiction(instance.jurisdiction())
        .name(instance.name())
        .productReference(instance.productReference())
        .purpose(instance.purpose())
        .transform(instance.transform())
        .lastReviewDate(instance.lastReviewDate())
        .subtitle(instance.subtitle())
        .editor(instance.editor())
        .useContext(instance.useContext())
        .kind(instance.kind())
        .effectivePeriod(instance.effectivePeriod())
        .dosage(instance.dosage())
        .version(instance.version())
        .author(instance.author())
        .timingDuration(instance.timingDuration())
        .copyright(instance.copyright())
        .description(instance.description())
        .status(instance.status())
        .endorser(instance.endorser())
        .observationRequirement(instance.observationRequirement())
        .contact(instance.contact())
        .meta(instance.meta())
        .modifierExtension(instance.modifierExtension())
        .timingDateTime(instance.timingDateTime())
        .timingPeriod(instance.timingPeriod())
        .approvalDate(instance.approvalDate())
        .specimenRequirement(instance.specimenRequirement())
        .contained(instance.contained())
        .date(instance.date())
        .topic(instance.topic())
        .doNotPerform(instance.doNotPerform())
        .intent(instance.intent())
        .timingAge(instance.timingAge())
        .location(instance.location())
        .subjectCodeableConcept(instance.subjectCodeableConcept())
        .text(instance.text())
        .timingTiming(instance.timingTiming())
        .productCodeableConcept(instance.productCodeableConcept())
        .usage(instance.usage())
        .subjectReference(instance.subjectReference())
        .timingRange(instance.timingRange())
        .resourceType(instance.resourceType())
        .bodySite(instance.bodySite())
        .profile(instance.profile())
        .identifier(instance.identifier())
        .quantity(instance.quantity())
        .dynamicValue(instance.dynamicValue())
        .implicitRules(instance.implicitRules())
        .participant(instance.participant())
        .id(instance.id())
        .reviewer(instance.reviewer())
        .observationResultRequirement(instance.observationResultRequirement())
        .relatedArtifact(instance.relatedArtifact())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link ActivityDefinition ActivityDefinition}.
   * <pre>
   * ImmutableActivityDefinition.builder()
   *    .priority(com.fhir.code) // optional {@link ActivityDefinition#priority() priority}
   *    .experimental(Boolean) // optional {@link ActivityDefinition#experimental() experimental}
   *    .language(com.fhir.code) // optional {@link ActivityDefinition#language() language}
   *    .code(com.fhir.CodeableConcept) // optional {@link ActivityDefinition#code() code}
   *    .title(String) // optional {@link ActivityDefinition#title() title}
   *    .library(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link ActivityDefinition#library() library}
   *    .publisher(String) // optional {@link ActivityDefinition#publisher() publisher}
   *    .url(com.fhir.uri) // optional {@link ActivityDefinition#url() url}
   *    .jurisdiction(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ActivityDefinition#jurisdiction() jurisdiction}
   *    .name(String) // optional {@link ActivityDefinition#name() name}
   *    .productReference(com.fhir.Reference) // optional {@link ActivityDefinition#productReference() productReference}
   *    .purpose(com.fhir.markdown) // optional {@link ActivityDefinition#purpose() purpose}
   *    .transform(com.fhir.canonical) // optional {@link ActivityDefinition#transform() transform}
   *    .lastReviewDate(com.fhir.date) // optional {@link ActivityDefinition#lastReviewDate() lastReviewDate}
   *    .subtitle(String) // optional {@link ActivityDefinition#subtitle() subtitle}
   *    .editor(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link ActivityDefinition#editor() editor}
   *    .useContext(List&amp;lt;com.fhir.UsageContext&amp;gt;) // optional {@link ActivityDefinition#useContext() useContext}
   *    .kind(com.fhir.code) // optional {@link ActivityDefinition#kind() kind}
   *    .effectivePeriod(com.fhir.Period) // optional {@link ActivityDefinition#effectivePeriod() effectivePeriod}
   *    .dosage(List&amp;lt;com.fhir.Dosage&amp;gt;) // optional {@link ActivityDefinition#dosage() dosage}
   *    .version(String) // optional {@link ActivityDefinition#version() version}
   *    .author(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link ActivityDefinition#author() author}
   *    .timingDuration(com.fhir.Duration) // optional {@link ActivityDefinition#timingDuration() timingDuration}
   *    .copyright(com.fhir.markdown) // optional {@link ActivityDefinition#copyright() copyright}
   *    .description(com.fhir.markdown) // optional {@link ActivityDefinition#description() description}
   *    .status(com.fhir.ActivitydefinitionStatus) // optional {@link ActivityDefinition#status() status}
   *    .endorser(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link ActivityDefinition#endorser() endorser}
   *    .observationRequirement(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ActivityDefinition#observationRequirement() observationRequirement}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link ActivityDefinition#contact() contact}
   *    .meta(com.fhir.Meta) // optional {@link ActivityDefinition#meta() meta}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ActivityDefinition#modifierExtension() modifierExtension}
   *    .timingDateTime(String) // optional {@link ActivityDefinition#timingDateTime() timingDateTime}
   *    .timingPeriod(com.fhir.Period) // optional {@link ActivityDefinition#timingPeriod() timingPeriod}
   *    .approvalDate(com.fhir.date) // optional {@link ActivityDefinition#approvalDate() approvalDate}
   *    .specimenRequirement(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ActivityDefinition#specimenRequirement() specimenRequirement}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link ActivityDefinition#contained() contained}
   *    .date(com.fhir.dateTime) // optional {@link ActivityDefinition#date() date}
   *    .topic(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ActivityDefinition#topic() topic}
   *    .doNotPerform(Boolean) // optional {@link ActivityDefinition#doNotPerform() doNotPerform}
   *    .intent(com.fhir.code) // optional {@link ActivityDefinition#intent() intent}
   *    .timingAge(com.fhir.Age) // optional {@link ActivityDefinition#timingAge() timingAge}
   *    .location(com.fhir.Reference) // optional {@link ActivityDefinition#location() location}
   *    .subjectCodeableConcept(com.fhir.CodeableConcept) // optional {@link ActivityDefinition#subjectCodeableConcept() subjectCodeableConcept}
   *    .text(com.fhir.Narrative) // optional {@link ActivityDefinition#text() text}
   *    .timingTiming(com.fhir.Timing) // optional {@link ActivityDefinition#timingTiming() timingTiming}
   *    .productCodeableConcept(com.fhir.CodeableConcept) // optional {@link ActivityDefinition#productCodeableConcept() productCodeableConcept}
   *    .usage(String) // optional {@link ActivityDefinition#usage() usage}
   *    .subjectReference(com.fhir.Reference) // optional {@link ActivityDefinition#subjectReference() subjectReference}
   *    .timingRange(com.fhir.Range) // optional {@link ActivityDefinition#timingRange() timingRange}
   *    .resourceType(String) // required {@link ActivityDefinition#resourceType() resourceType}
   *    .bodySite(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ActivityDefinition#bodySite() bodySite}
   *    .profile(com.fhir.canonical) // optional {@link ActivityDefinition#profile() profile}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link ActivityDefinition#identifier() identifier}
   *    .quantity(com.fhir.Quantity) // optional {@link ActivityDefinition#quantity() quantity}
   *    .dynamicValue(List&amp;lt;com.fhir.ActivityDefinition_DynamicValue&amp;gt;) // optional {@link ActivityDefinition#dynamicValue() dynamicValue}
   *    .implicitRules(com.fhir.uri) // optional {@link ActivityDefinition#implicitRules() implicitRules}
   *    .participant(List&amp;lt;com.fhir.ActivityDefinition_Participant&amp;gt;) // optional {@link ActivityDefinition#participant() participant}
   *    .id(com.fhir.id) // optional {@link ActivityDefinition#id() id}
   *    .reviewer(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link ActivityDefinition#reviewer() reviewer}
   *    .observationResultRequirement(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ActivityDefinition#observationResultRequirement() observationResultRequirement}
   *    .relatedArtifact(List&amp;lt;com.fhir.RelatedArtifact&amp;gt;) // optional {@link ActivityDefinition#relatedArtifact() relatedArtifact}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ActivityDefinition#extension() extension}
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
  @org.immutables.value.Generated(from = "ActivityDefinition", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_PRIORITY = 0x1L;
    private static final long OPT_BIT_EXPERIMENTAL = 0x2L;
    private static final long OPT_BIT_LANGUAGE = 0x4L;
    private static final long OPT_BIT_CODE = 0x8L;
    private static final long OPT_BIT_TITLE = 0x10L;
    private static final long OPT_BIT_LIBRARY = 0x20L;
    private static final long OPT_BIT_PUBLISHER = 0x40L;
    private static final long OPT_BIT_URL = 0x80L;
    private static final long OPT_BIT_JURISDICTION = 0x100L;
    private static final long OPT_BIT_NAME = 0x200L;
    private static final long OPT_BIT_PRODUCT_REFERENCE = 0x400L;
    private static final long OPT_BIT_PURPOSE = 0x800L;
    private static final long OPT_BIT_TRANSFORM = 0x1000L;
    private static final long OPT_BIT_LAST_REVIEW_DATE = 0x2000L;
    private static final long OPT_BIT_SUBTITLE = 0x4000L;
    private static final long OPT_BIT_EDITOR = 0x8000L;
    private static final long OPT_BIT_USE_CONTEXT = 0x10000L;
    private static final long OPT_BIT_KIND = 0x20000L;
    private static final long OPT_BIT_EFFECTIVE_PERIOD = 0x40000L;
    private static final long OPT_BIT_DOSAGE = 0x80000L;
    private static final long OPT_BIT_VERSION = 0x100000L;
    private static final long OPT_BIT_AUTHOR = 0x200000L;
    private static final long OPT_BIT_TIMING_DURATION = 0x400000L;
    private static final long OPT_BIT_COPYRIGHT = 0x800000L;
    private static final long OPT_BIT_DESCRIPTION = 0x1000000L;
    private static final long OPT_BIT_STATUS = 0x2000000L;
    private static final long OPT_BIT_ENDORSER = 0x4000000L;
    private static final long OPT_BIT_OBSERVATION_REQUIREMENT = 0x8000000L;
    private static final long OPT_BIT_CONTACT = 0x10000000L;
    private static final long OPT_BIT_META = 0x20000000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40000000L;
    private static final long OPT_BIT_TIMING_DATE_TIME = 0x80000000L;
    private static final long OPT_BIT_TIMING_PERIOD = 0x100000000L;
    private static final long OPT_BIT_APPROVAL_DATE = 0x200000000L;
    private static final long OPT_BIT_SPECIMEN_REQUIREMENT = 0x400000000L;
    private static final long OPT_BIT_CONTAINED = 0x800000000L;
    private static final long OPT_BIT_DATE = 0x1000000000L;
    private static final long OPT_BIT_TOPIC = 0x2000000000L;
    private static final long OPT_BIT_DO_NOT_PERFORM = 0x4000000000L;
    private static final long OPT_BIT_INTENT = 0x8000000000L;
    private static final long OPT_BIT_TIMING_AGE = 0x10000000000L;
    private static final long OPT_BIT_LOCATION = 0x20000000000L;
    private static final long OPT_BIT_SUBJECT_CODEABLE_CONCEPT = 0x40000000000L;
    private static final long OPT_BIT_TEXT = 0x80000000000L;
    private static final long OPT_BIT_TIMING_TIMING = 0x100000000000L;
    private static final long OPT_BIT_PRODUCT_CODEABLE_CONCEPT = 0x200000000000L;
    private static final long OPT_BIT_USAGE = 0x400000000000L;
    private static final long OPT_BIT_SUBJECT_REFERENCE = 0x800000000000L;
    private static final long OPT_BIT_TIMING_RANGE = 0x1000000000000L;
    private static final long OPT_BIT_BODY_SITE = 0x2000000000000L;
    private static final long OPT_BIT_PROFILE = 0x4000000000000L;
    private static final long OPT_BIT_IDENTIFIER = 0x8000000000000L;
    private static final long OPT_BIT_QUANTITY = 0x10000000000000L;
    private static final long OPT_BIT_DYNAMIC_VALUE = 0x20000000000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x40000000000000L;
    private static final long OPT_BIT_PARTICIPANT = 0x80000000000000L;
    private static final long OPT_BIT_ID = 0x100000000000000L;
    private static final long OPT_BIT_REVIEWER = 0x200000000000000L;
    private static final long OPT_BIT_OBSERVATION_RESULT_REQUIREMENT = 0x400000000000000L;
    private static final long OPT_BIT_RELATED_ARTIFACT = 0x800000000000000L;
    private static final long OPT_BIT_EXTENSION = 0x1000000000000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.code priority;
    private @javax.annotation.Nullable java.lang.Boolean experimental;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> library;
    private @javax.annotation.Nullable java.lang.String publisher;
    private @javax.annotation.Nullable com.fhir.uri url;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> jurisdiction;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.Reference productReference;
    private @javax.annotation.Nullable com.fhir.markdown purpose;
    private @javax.annotation.Nullable com.fhir.canonical transform;
    private @javax.annotation.Nullable com.fhir.date lastReviewDate;
    private @javax.annotation.Nullable java.lang.String subtitle;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> editor;
    private @javax.annotation.Nullable java.util.List<com.fhir.UsageContext> useContext;
    private @javax.annotation.Nullable com.fhir.code kind;
    private @javax.annotation.Nullable com.fhir.Period effectivePeriod;
    private @javax.annotation.Nullable java.util.List<com.fhir.Dosage> dosage;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> author;
    private @javax.annotation.Nullable com.fhir.Duration timingDuration;
    private @javax.annotation.Nullable com.fhir.markdown copyright;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable com.fhir.ActivitydefinitionStatus status;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> endorser;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> observationRequirement;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String timingDateTime;
    private @javax.annotation.Nullable com.fhir.Period timingPeriod;
    private @javax.annotation.Nullable com.fhir.date approvalDate;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> specimenRequirement;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> topic;
    private @javax.annotation.Nullable java.lang.Boolean doNotPerform;
    private @javax.annotation.Nullable com.fhir.code intent;
    private @javax.annotation.Nullable com.fhir.Age timingAge;
    private @javax.annotation.Nullable com.fhir.Reference location;
    private @javax.annotation.Nullable com.fhir.CodeableConcept subjectCodeableConcept;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.Timing timingTiming;
    private @javax.annotation.Nullable com.fhir.CodeableConcept productCodeableConcept;
    private @javax.annotation.Nullable java.lang.String usage;
    private @javax.annotation.Nullable com.fhir.Reference subjectReference;
    private @javax.annotation.Nullable com.fhir.Range timingRange;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> bodySite;
    private @javax.annotation.Nullable com.fhir.canonical profile;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.Quantity quantity;
    private @javax.annotation.Nullable java.util.List<com.fhir.ActivityDefinition_DynamicValue> dynamicValue;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.ActivityDefinition_Participant> participant;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> reviewer;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> observationResultRequirement;
    private @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    public final Builder priority(com.fhir.code priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = java.util.Objects.requireNonNull(priority, "priority");
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public final Builder priority(java.util.Optional<? extends com.fhir.code> priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = priority.orElse(null);
      optBits |= OPT_BIT_PRIORITY;
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
    @com.fasterxml.jackson.annotation.JsonProperty("experimental")
    public final Builder experimental(java.util.Optional<java.lang.Boolean> experimental) {
      checkNotIsSet(experimentalIsSet(), "experimental");
      this.experimental = experimental.orElse(null);
      optBits |= OPT_BIT_EXPERIMENTAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#language() language} to language.
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
     * Initializes the optional value {@link ActivityDefinition#language() language} to language.
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
     * Initializes the optional value {@link ActivityDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(com.fhir.CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends com.fhir.CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#title() title} to title.
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
     * Initializes the optional value {@link ActivityDefinition#title() title} to title.
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
     * Initializes the optional value {@link ActivityDefinition#library() library} to library.
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
     * Initializes the optional value {@link ActivityDefinition#library() library} to library.
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
     * Initializes the optional value {@link ActivityDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ActivityDefinition#publisher() publisher} to publisher.
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
     * Initializes the optional value {@link ActivityDefinition#url() url} to url.
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
     * Initializes the optional value {@link ActivityDefinition#url() url} to url.
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
     * Initializes the optional value {@link ActivityDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ActivityDefinition#jurisdiction() jurisdiction} to jurisdiction.
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
     * Initializes the optional value {@link ActivityDefinition#name() name} to name.
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
     * Initializes the optional value {@link ActivityDefinition#name() name} to name.
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
     * Initializes the optional value {@link ActivityDefinition#productReference() productReference} to productReference.
     * @param productReference The value for productReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder productReference(com.fhir.Reference productReference) {
      checkNotIsSet(productReferenceIsSet(), "productReference");
      this.productReference = java.util.Objects.requireNonNull(productReference, "productReference");
      optBits |= OPT_BIT_PRODUCT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#productReference() productReference} to productReference.
     * @param productReference The value for productReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("productReference")
    public final Builder productReference(java.util.Optional<? extends com.fhir.Reference> productReference) {
      checkNotIsSet(productReferenceIsSet(), "productReference");
      this.productReference = productReference.orElse(null);
      optBits |= OPT_BIT_PRODUCT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link ActivityDefinition#purpose() purpose} to purpose.
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
     * Initializes the optional value {@link ActivityDefinition#transform() transform} to transform.
     * @param transform The value for transform
     * @return {@code this} builder for chained invocation
     */
    public final Builder transform(com.fhir.canonical transform) {
      checkNotIsSet(transformIsSet(), "transform");
      this.transform = java.util.Objects.requireNonNull(transform, "transform");
      optBits |= OPT_BIT_TRANSFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#transform() transform} to transform.
     * @param transform The value for transform
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("transform")
    public final Builder transform(java.util.Optional<? extends com.fhir.canonical> transform) {
      checkNotIsSet(transformIsSet(), "transform");
      this.transform = transform.orElse(null);
      optBits |= OPT_BIT_TRANSFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link ActivityDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
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
     * Initializes the optional value {@link ActivityDefinition#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link ActivityDefinition#subtitle() subtitle} to subtitle.
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
     * Initializes the optional value {@link ActivityDefinition#editor() editor} to editor.
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
     * Initializes the optional value {@link ActivityDefinition#editor() editor} to editor.
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
     * Initializes the optional value {@link ActivityDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link ActivityDefinition#useContext() useContext} to useContext.
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
     * Initializes the optional value {@link ActivityDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    public final Builder kind(com.fhir.code kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = java.util.Objects.requireNonNull(kind, "kind");
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    public final Builder kind(java.util.Optional<? extends com.fhir.code> kind) {
      checkNotIsSet(kindIsSet(), "kind");
      this.kind = kind.orElse(null);
      optBits |= OPT_BIT_KIND;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link ActivityDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
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
     * Initializes the optional value {@link ActivityDefinition#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for chained invocation
     */
    public final Builder dosage(java.util.List<com.fhir.Dosage> dosage) {
      checkNotIsSet(dosageIsSet(), "dosage");
      this.dosage = java.util.Objects.requireNonNull(dosage, "dosage");
      optBits |= OPT_BIT_DOSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dosage")
    public final Builder dosage(java.util.Optional<? extends java.util.List<com.fhir.Dosage>> dosage) {
      checkNotIsSet(dosageIsSet(), "dosage");
      this.dosage = dosage.orElse(null);
      optBits |= OPT_BIT_DOSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#version() version} to version.
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
     * Initializes the optional value {@link ActivityDefinition#version() version} to version.
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
     * Initializes the optional value {@link ActivityDefinition#author() author} to author.
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
     * Initializes the optional value {@link ActivityDefinition#author() author} to author.
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
     * Initializes the optional value {@link ActivityDefinition#timingDuration() timingDuration} to timingDuration.
     * @param timingDuration The value for timingDuration
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingDuration(com.fhir.Duration timingDuration) {
      checkNotIsSet(timingDurationIsSet(), "timingDuration");
      this.timingDuration = java.util.Objects.requireNonNull(timingDuration, "timingDuration");
      optBits |= OPT_BIT_TIMING_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#timingDuration() timingDuration} to timingDuration.
     * @param timingDuration The value for timingDuration
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timingDuration")
    public final Builder timingDuration(java.util.Optional<? extends com.fhir.Duration> timingDuration) {
      checkNotIsSet(timingDurationIsSet(), "timingDuration");
      this.timingDuration = timingDuration.orElse(null);
      optBits |= OPT_BIT_TIMING_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link ActivityDefinition#copyright() copyright} to copyright.
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
     * Initializes the optional value {@link ActivityDefinition#description() description} to description.
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
     * Initializes the optional value {@link ActivityDefinition#description() description} to description.
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
     * Initializes the optional value {@link ActivityDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.ActivitydefinitionStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.ActivitydefinitionStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link ActivityDefinition#endorser() endorser} to endorser.
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
     * Initializes the optional value {@link ActivityDefinition#observationRequirement() observationRequirement} to observationRequirement.
     * @param observationRequirement The value for observationRequirement
     * @return {@code this} builder for chained invocation
     */
    public final Builder observationRequirement(java.util.List<com.fhir.Reference> observationRequirement) {
      checkNotIsSet(observationRequirementIsSet(), "observationRequirement");
      this.observationRequirement = java.util.Objects.requireNonNull(observationRequirement, "observationRequirement");
      optBits |= OPT_BIT_OBSERVATION_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#observationRequirement() observationRequirement} to observationRequirement.
     * @param observationRequirement The value for observationRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("observationRequirement")
    public final Builder observationRequirement(java.util.Optional<? extends java.util.List<com.fhir.Reference>> observationRequirement) {
      checkNotIsSet(observationRequirementIsSet(), "observationRequirement");
      this.observationRequirement = observationRequirement.orElse(null);
      optBits |= OPT_BIT_OBSERVATION_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link ActivityDefinition#contact() contact} to contact.
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
     * Initializes the optional value {@link ActivityDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link ActivityDefinition#meta() meta} to meta.
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
     * Initializes the optional value {@link ActivityDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ActivityDefinition#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ActivityDefinition#timingDateTime() timingDateTime} to timingDateTime.
     * @param timingDateTime The value for timingDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingDateTime(java.lang.String timingDateTime) {
      checkNotIsSet(timingDateTimeIsSet(), "timingDateTime");
      this.timingDateTime = java.util.Objects.requireNonNull(timingDateTime, "timingDateTime");
      optBits |= OPT_BIT_TIMING_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#timingDateTime() timingDateTime} to timingDateTime.
     * @param timingDateTime The value for timingDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timingDateTime")
    public final Builder timingDateTime(java.util.Optional<java.lang.String> timingDateTime) {
      checkNotIsSet(timingDateTimeIsSet(), "timingDateTime");
      this.timingDateTime = timingDateTime.orElse(null);
      optBits |= OPT_BIT_TIMING_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingPeriod(com.fhir.Period timingPeriod) {
      checkNotIsSet(timingPeriodIsSet(), "timingPeriod");
      this.timingPeriod = java.util.Objects.requireNonNull(timingPeriod, "timingPeriod");
      optBits |= OPT_BIT_TIMING_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timingPeriod")
    public final Builder timingPeriod(java.util.Optional<? extends com.fhir.Period> timingPeriod) {
      checkNotIsSet(timingPeriodIsSet(), "timingPeriod");
      this.timingPeriod = timingPeriod.orElse(null);
      optBits |= OPT_BIT_TIMING_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link ActivityDefinition#approvalDate() approvalDate} to approvalDate.
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
     * Initializes the optional value {@link ActivityDefinition#specimenRequirement() specimenRequirement} to specimenRequirement.
     * @param specimenRequirement The value for specimenRequirement
     * @return {@code this} builder for chained invocation
     */
    public final Builder specimenRequirement(java.util.List<com.fhir.Reference> specimenRequirement) {
      checkNotIsSet(specimenRequirementIsSet(), "specimenRequirement");
      this.specimenRequirement = java.util.Objects.requireNonNull(specimenRequirement, "specimenRequirement");
      optBits |= OPT_BIT_SPECIMEN_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#specimenRequirement() specimenRequirement} to specimenRequirement.
     * @param specimenRequirement The value for specimenRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("specimenRequirement")
    public final Builder specimenRequirement(java.util.Optional<? extends java.util.List<com.fhir.Reference>> specimenRequirement) {
      checkNotIsSet(specimenRequirementIsSet(), "specimenRequirement");
      this.specimenRequirement = specimenRequirement.orElse(null);
      optBits |= OPT_BIT_SPECIMEN_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link ActivityDefinition#contained() contained} to contained.
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
     * Initializes the optional value {@link ActivityDefinition#date() date} to date.
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
     * Initializes the optional value {@link ActivityDefinition#date() date} to date.
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
     * Initializes the optional value {@link ActivityDefinition#topic() topic} to topic.
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
     * Initializes the optional value {@link ActivityDefinition#topic() topic} to topic.
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
    @com.fasterxml.jackson.annotation.JsonProperty("doNotPerform")
    public final Builder doNotPerform(java.util.Optional<java.lang.Boolean> doNotPerform) {
      checkNotIsSet(doNotPerformIsSet(), "doNotPerform");
      this.doNotPerform = doNotPerform.orElse(null);
      optBits |= OPT_BIT_DO_NOT_PERFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    public final Builder intent(com.fhir.code intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = java.util.Objects.requireNonNull(intent, "intent");
      optBits |= OPT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("intent")
    public final Builder intent(java.util.Optional<? extends com.fhir.code> intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = intent.orElse(null);
      optBits |= OPT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#timingAge() timingAge} to timingAge.
     * @param timingAge The value for timingAge
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingAge(com.fhir.Age timingAge) {
      checkNotIsSet(timingAgeIsSet(), "timingAge");
      this.timingAge = java.util.Objects.requireNonNull(timingAge, "timingAge");
      optBits |= OPT_BIT_TIMING_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#timingAge() timingAge} to timingAge.
     * @param timingAge The value for timingAge
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timingAge")
    public final Builder timingAge(java.util.Optional<? extends com.fhir.Age> timingAge) {
      checkNotIsSet(timingAgeIsSet(), "timingAge");
      this.timingAge = timingAge.orElse(null);
      optBits |= OPT_BIT_TIMING_AGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(com.fhir.Reference location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = java.util.Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public final Builder location(java.util.Optional<? extends com.fhir.Reference> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
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
     * Initializes the optional value {@link ActivityDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
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
     * Initializes the optional value {@link ActivityDefinition#text() text} to text.
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
     * Initializes the optional value {@link ActivityDefinition#text() text} to text.
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
     * Initializes the optional value {@link ActivityDefinition#timingTiming() timingTiming} to timingTiming.
     * @param timingTiming The value for timingTiming
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingTiming(com.fhir.Timing timingTiming) {
      checkNotIsSet(timingTimingIsSet(), "timingTiming");
      this.timingTiming = java.util.Objects.requireNonNull(timingTiming, "timingTiming");
      optBits |= OPT_BIT_TIMING_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#timingTiming() timingTiming} to timingTiming.
     * @param timingTiming The value for timingTiming
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timingTiming")
    public final Builder timingTiming(java.util.Optional<? extends com.fhir.Timing> timingTiming) {
      checkNotIsSet(timingTimingIsSet(), "timingTiming");
      this.timingTiming = timingTiming.orElse(null);
      optBits |= OPT_BIT_TIMING_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#productCodeableConcept() productCodeableConcept} to productCodeableConcept.
     * @param productCodeableConcept The value for productCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder productCodeableConcept(com.fhir.CodeableConcept productCodeableConcept) {
      checkNotIsSet(productCodeableConceptIsSet(), "productCodeableConcept");
      this.productCodeableConcept = java.util.Objects.requireNonNull(productCodeableConcept, "productCodeableConcept");
      optBits |= OPT_BIT_PRODUCT_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#productCodeableConcept() productCodeableConcept} to productCodeableConcept.
     * @param productCodeableConcept The value for productCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("productCodeableConcept")
    public final Builder productCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> productCodeableConcept) {
      checkNotIsSet(productCodeableConceptIsSet(), "productCodeableConcept");
      this.productCodeableConcept = productCodeableConcept.orElse(null);
      optBits |= OPT_BIT_PRODUCT_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#usage() usage} to usage.
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
     * Initializes the optional value {@link ActivityDefinition#usage() usage} to usage.
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
     * Initializes the optional value {@link ActivityDefinition#subjectReference() subjectReference} to subjectReference.
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
     * Initializes the optional value {@link ActivityDefinition#subjectReference() subjectReference} to subjectReference.
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
     * Initializes the optional value {@link ActivityDefinition#timingRange() timingRange} to timingRange.
     * @param timingRange The value for timingRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder timingRange(com.fhir.Range timingRange) {
      checkNotIsSet(timingRangeIsSet(), "timingRange");
      this.timingRange = java.util.Objects.requireNonNull(timingRange, "timingRange");
      optBits |= OPT_BIT_TIMING_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#timingRange() timingRange} to timingRange.
     * @param timingRange The value for timingRange
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timingRange")
    public final Builder timingRange(java.util.Optional<? extends com.fhir.Range> timingRange) {
      checkNotIsSet(timingRangeIsSet(), "timingRange");
      this.timingRange = timingRange.orElse(null);
      optBits |= OPT_BIT_TIMING_RANGE;
      return this;
    }

    /**
     * Initializes the value for the {@link ActivityDefinition#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ActivityDefinition#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    public final Builder bodySite(java.util.List<com.fhir.CodeableConcept> bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = java.util.Objects.requireNonNull(bodySite, "bodySite");
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bodySite")
    public final Builder bodySite(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = bodySite.orElse(null);
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for chained invocation
     */
    public final Builder profile(com.fhir.canonical profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = java.util.Objects.requireNonNull(profile, "profile");
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    public final Builder profile(java.util.Optional<? extends com.fhir.canonical> profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = profile.orElse(null);
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ActivityDefinition#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ActivityDefinition#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantity(com.fhir.Quantity quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = java.util.Objects.requireNonNull(quantity, "quantity");
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    public final Builder quantity(java.util.Optional<? extends com.fhir.Quantity> quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = quantity.orElse(null);
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#dynamicValue() dynamicValue} to dynamicValue.
     * @param dynamicValue The value for dynamicValue
     * @return {@code this} builder for chained invocation
     */
    public final Builder dynamicValue(java.util.List<com.fhir.ActivityDefinition_DynamicValue> dynamicValue) {
      checkNotIsSet(dynamicValueIsSet(), "dynamicValue");
      this.dynamicValue = java.util.Objects.requireNonNull(dynamicValue, "dynamicValue");
      optBits |= OPT_BIT_DYNAMIC_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#dynamicValue() dynamicValue} to dynamicValue.
     * @param dynamicValue The value for dynamicValue
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dynamicValue")
    public final Builder dynamicValue(java.util.Optional<? extends java.util.List<com.fhir.ActivityDefinition_DynamicValue>> dynamicValue) {
      checkNotIsSet(dynamicValueIsSet(), "dynamicValue");
      this.dynamicValue = dynamicValue.orElse(null);
      optBits |= OPT_BIT_DYNAMIC_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ActivityDefinition#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ActivityDefinition#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for chained invocation
     */
    public final Builder participant(java.util.List<com.fhir.ActivityDefinition_Participant> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = java.util.Objects.requireNonNull(participant, "participant");
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("participant")
    public final Builder participant(java.util.Optional<? extends java.util.List<com.fhir.ActivityDefinition_Participant>> participant) {
      checkNotIsSet(participantIsSet(), "participant");
      this.participant = participant.orElse(null);
      optBits |= OPT_BIT_PARTICIPANT;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#id() id} to id.
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
     * Initializes the optional value {@link ActivityDefinition#id() id} to id.
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
     * Initializes the optional value {@link ActivityDefinition#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link ActivityDefinition#reviewer() reviewer} to reviewer.
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
     * Initializes the optional value {@link ActivityDefinition#observationResultRequirement() observationResultRequirement} to observationResultRequirement.
     * @param observationResultRequirement The value for observationResultRequirement
     * @return {@code this} builder for chained invocation
     */
    public final Builder observationResultRequirement(java.util.List<com.fhir.Reference> observationResultRequirement) {
      checkNotIsSet(observationResultRequirementIsSet(), "observationResultRequirement");
      this.observationResultRequirement = java.util.Objects.requireNonNull(observationResultRequirement, "observationResultRequirement");
      optBits |= OPT_BIT_OBSERVATION_RESULT_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#observationResultRequirement() observationResultRequirement} to observationResultRequirement.
     * @param observationResultRequirement The value for observationResultRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("observationResultRequirement")
    public final Builder observationResultRequirement(java.util.Optional<? extends java.util.List<com.fhir.Reference>> observationResultRequirement) {
      checkNotIsSet(observationResultRequirementIsSet(), "observationResultRequirement");
      this.observationResultRequirement = observationResultRequirement.orElse(null);
      optBits |= OPT_BIT_OBSERVATION_RESULT_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ActivityDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link ActivityDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
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
     * Initializes the optional value {@link ActivityDefinition#extension() extension} to extension.
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
     * Initializes the optional value {@link ActivityDefinition#extension() extension} to extension.
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
     * Builds a new {@link ActivityDefinition ActivityDefinition}.
     * @return An immutable instance of ActivityDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ActivityDefinition build() {
      checkRequiredAttributes();
      return new ImmutableActivityDefinition(
          priority,
          experimental,
          language,
          code,
          title,
          library,
          publisher,
          url,
          jurisdiction,
          name,
          productReference,
          purpose,
          transform,
          lastReviewDate,
          subtitle,
          editor,
          useContext,
          kind,
          effectivePeriod,
          dosage,
          version,
          author,
          timingDuration,
          copyright,
          description,
          status,
          endorser,
          observationRequirement,
          contact,
          meta,
          modifierExtension,
          timingDateTime,
          timingPeriod,
          approvalDate,
          specimenRequirement,
          contained,
          date,
          topic,
          doNotPerform,
          intent,
          timingAge,
          location,
          subjectCodeableConcept,
          text,
          timingTiming,
          productCodeableConcept,
          usage,
          subjectReference,
          timingRange,
          resourceType,
          bodySite,
          profile,
          identifier,
          quantity,
          dynamicValue,
          implicitRules,
          participant,
          id,
          reviewer,
          observationResultRequirement,
          relatedArtifact,
          extension);
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean experimentalIsSet() {
      return (optBits & OPT_BIT_EXPERIMENTAL) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean libraryIsSet() {
      return (optBits & OPT_BIT_LIBRARY) != 0;
    }

    private boolean publisherIsSet() {
      return (optBits & OPT_BIT_PUBLISHER) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean productReferenceIsSet() {
      return (optBits & OPT_BIT_PRODUCT_REFERENCE) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean transformIsSet() {
      return (optBits & OPT_BIT_TRANSFORM) != 0;
    }

    private boolean lastReviewDateIsSet() {
      return (optBits & OPT_BIT_LAST_REVIEW_DATE) != 0;
    }

    private boolean subtitleIsSet() {
      return (optBits & OPT_BIT_SUBTITLE) != 0;
    }

    private boolean editorIsSet() {
      return (optBits & OPT_BIT_EDITOR) != 0;
    }

    private boolean useContextIsSet() {
      return (optBits & OPT_BIT_USE_CONTEXT) != 0;
    }

    private boolean kindIsSet() {
      return (optBits & OPT_BIT_KIND) != 0;
    }

    private boolean effectivePeriodIsSet() {
      return (optBits & OPT_BIT_EFFECTIVE_PERIOD) != 0;
    }

    private boolean dosageIsSet() {
      return (optBits & OPT_BIT_DOSAGE) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean timingDurationIsSet() {
      return (optBits & OPT_BIT_TIMING_DURATION) != 0;
    }

    private boolean copyrightIsSet() {
      return (optBits & OPT_BIT_COPYRIGHT) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean endorserIsSet() {
      return (optBits & OPT_BIT_ENDORSER) != 0;
    }

    private boolean observationRequirementIsSet() {
      return (optBits & OPT_BIT_OBSERVATION_REQUIREMENT) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean timingDateTimeIsSet() {
      return (optBits & OPT_BIT_TIMING_DATE_TIME) != 0;
    }

    private boolean timingPeriodIsSet() {
      return (optBits & OPT_BIT_TIMING_PERIOD) != 0;
    }

    private boolean approvalDateIsSet() {
      return (optBits & OPT_BIT_APPROVAL_DATE) != 0;
    }

    private boolean specimenRequirementIsSet() {
      return (optBits & OPT_BIT_SPECIMEN_REQUIREMENT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean topicIsSet() {
      return (optBits & OPT_BIT_TOPIC) != 0;
    }

    private boolean doNotPerformIsSet() {
      return (optBits & OPT_BIT_DO_NOT_PERFORM) != 0;
    }

    private boolean intentIsSet() {
      return (optBits & OPT_BIT_INTENT) != 0;
    }

    private boolean timingAgeIsSet() {
      return (optBits & OPT_BIT_TIMING_AGE) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean subjectCodeableConceptIsSet() {
      return (optBits & OPT_BIT_SUBJECT_CODEABLE_CONCEPT) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean timingTimingIsSet() {
      return (optBits & OPT_BIT_TIMING_TIMING) != 0;
    }

    private boolean productCodeableConceptIsSet() {
      return (optBits & OPT_BIT_PRODUCT_CODEABLE_CONCEPT) != 0;
    }

    private boolean usageIsSet() {
      return (optBits & OPT_BIT_USAGE) != 0;
    }

    private boolean subjectReferenceIsSet() {
      return (optBits & OPT_BIT_SUBJECT_REFERENCE) != 0;
    }

    private boolean timingRangeIsSet() {
      return (optBits & OPT_BIT_TIMING_RANGE) != 0;
    }

    private boolean bodySiteIsSet() {
      return (optBits & OPT_BIT_BODY_SITE) != 0;
    }

    private boolean profileIsSet() {
      return (optBits & OPT_BIT_PROFILE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean dynamicValueIsSet() {
      return (optBits & OPT_BIT_DYNAMIC_VALUE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean participantIsSet() {
      return (optBits & OPT_BIT_PARTICIPANT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean reviewerIsSet() {
      return (optBits & OPT_BIT_REVIEWER) != 0;
    }

    private boolean observationResultRequirementIsSet() {
      return (optBits & OPT_BIT_OBSERVATION_RESULT_REQUIREMENT) != 0;
    }

    private boolean relatedArtifactIsSet() {
      return (optBits & OPT_BIT_RELATED_ARTIFACT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ActivityDefinition is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build ActivityDefinition, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ActivityDefinition", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ActivityDefinition#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "ActivityDefinition", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ActivityDefinition#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(com.fhir.code priority);

    /**
     * Initializes the optional value {@link ActivityDefinition#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(java.util.Optional<? extends com.fhir.code> priority);

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
    BuildFinal experimental(java.util.Optional<java.lang.Boolean> experimental);

    /**
     * Initializes the optional value {@link ActivityDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link ActivityDefinition#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link ActivityDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(com.fhir.CodeableConcept code);

    /**
     * Initializes the optional value {@link ActivityDefinition#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(java.util.Optional<? extends com.fhir.CodeableConcept> code);

    /**
     * Initializes the optional value {@link ActivityDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link ActivityDefinition#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link ActivityDefinition#library() library} to library.
     * @param library The value for library
     * @return {@code this} builder for chained invocation
     */
    BuildFinal library(java.util.List<com.fhir.canonical> library);

    /**
     * Initializes the optional value {@link ActivityDefinition#library() library} to library.
     * @param library The value for library
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal library(java.util.Optional<? extends java.util.List<com.fhir.canonical>> library);

    /**
     * Initializes the optional value {@link ActivityDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for chained invocation
     */
    BuildFinal publisher(java.lang.String publisher);

    /**
     * Initializes the optional value {@link ActivityDefinition#publisher() publisher} to publisher.
     * @param publisher The value for publisher
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal publisher(java.util.Optional<java.lang.String> publisher);

    /**
     * Initializes the optional value {@link ActivityDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    BuildFinal url(com.fhir.uri url);

    /**
     * Initializes the optional value {@link ActivityDefinition#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal url(java.util.Optional<? extends com.fhir.uri> url);

    /**
     * Initializes the optional value {@link ActivityDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal jurisdiction(java.util.List<com.fhir.CodeableConcept> jurisdiction);

    /**
     * Initializes the optional value {@link ActivityDefinition#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal jurisdiction(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> jurisdiction);

    /**
     * Initializes the optional value {@link ActivityDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link ActivityDefinition#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link ActivityDefinition#productReference() productReference} to productReference.
     * @param productReference The value for productReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal productReference(com.fhir.Reference productReference);

    /**
     * Initializes the optional value {@link ActivityDefinition#productReference() productReference} to productReference.
     * @param productReference The value for productReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productReference(java.util.Optional<? extends com.fhir.Reference> productReference);

    /**
     * Initializes the optional value {@link ActivityDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    BuildFinal purpose(com.fhir.markdown purpose);

    /**
     * Initializes the optional value {@link ActivityDefinition#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal purpose(java.util.Optional<? extends com.fhir.markdown> purpose);

    /**
     * Initializes the optional value {@link ActivityDefinition#transform() transform} to transform.
     * @param transform The value for transform
     * @return {@code this} builder for chained invocation
     */
    BuildFinal transform(com.fhir.canonical transform);

    /**
     * Initializes the optional value {@link ActivityDefinition#transform() transform} to transform.
     * @param transform The value for transform
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal transform(java.util.Optional<? extends com.fhir.canonical> transform);

    /**
     * Initializes the optional value {@link ActivityDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastReviewDate(com.fhir.date lastReviewDate);

    /**
     * Initializes the optional value {@link ActivityDefinition#lastReviewDate() lastReviewDate} to lastReviewDate.
     * @param lastReviewDate The value for lastReviewDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastReviewDate(java.util.Optional<? extends com.fhir.date> lastReviewDate);

    /**
     * Initializes the optional value {@link ActivityDefinition#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subtitle(java.lang.String subtitle);

    /**
     * Initializes the optional value {@link ActivityDefinition#subtitle() subtitle} to subtitle.
     * @param subtitle The value for subtitle
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subtitle(java.util.Optional<java.lang.String> subtitle);

    /**
     * Initializes the optional value {@link ActivityDefinition#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal editor(java.util.List<com.fhir.ContactDetail> editor);

    /**
     * Initializes the optional value {@link ActivityDefinition#editor() editor} to editor.
     * @param editor The value for editor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal editor(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> editor);

    /**
     * Initializes the optional value {@link ActivityDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for chained invocation
     */
    BuildFinal useContext(java.util.List<com.fhir.UsageContext> useContext);

    /**
     * Initializes the optional value {@link ActivityDefinition#useContext() useContext} to useContext.
     * @param useContext The value for useContext
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal useContext(java.util.Optional<? extends java.util.List<com.fhir.UsageContext>> useContext);

    /**
     * Initializes the optional value {@link ActivityDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for chained invocation
     */
    BuildFinal kind(com.fhir.code kind);

    /**
     * Initializes the optional value {@link ActivityDefinition#kind() kind} to kind.
     * @param kind The value for kind
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal kind(java.util.Optional<? extends com.fhir.code> kind);

    /**
     * Initializes the optional value {@link ActivityDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal effectivePeriod(com.fhir.Period effectivePeriod);

    /**
     * Initializes the optional value {@link ActivityDefinition#effectivePeriod() effectivePeriod} to effectivePeriod.
     * @param effectivePeriod The value for effectivePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal effectivePeriod(java.util.Optional<? extends com.fhir.Period> effectivePeriod);

    /**
     * Initializes the optional value {@link ActivityDefinition#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dosage(java.util.List<com.fhir.Dosage> dosage);

    /**
     * Initializes the optional value {@link ActivityDefinition#dosage() dosage} to dosage.
     * @param dosage The value for dosage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dosage(java.util.Optional<? extends java.util.List<com.fhir.Dosage>> dosage);

    /**
     * Initializes the optional value {@link ActivityDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    BuildFinal version(java.lang.String version);

    /**
     * Initializes the optional value {@link ActivityDefinition#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal version(java.util.Optional<java.lang.String> version);

    /**
     * Initializes the optional value {@link ActivityDefinition#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(java.util.List<com.fhir.ContactDetail> author);

    /**
     * Initializes the optional value {@link ActivityDefinition#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> author);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingDuration() timingDuration} to timingDuration.
     * @param timingDuration The value for timingDuration
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingDuration(com.fhir.Duration timingDuration);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingDuration() timingDuration} to timingDuration.
     * @param timingDuration The value for timingDuration
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingDuration(java.util.Optional<? extends com.fhir.Duration> timingDuration);

    /**
     * Initializes the optional value {@link ActivityDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for chained invocation
     */
    BuildFinal copyright(com.fhir.markdown copyright);

    /**
     * Initializes the optional value {@link ActivityDefinition#copyright() copyright} to copyright.
     * @param copyright The value for copyright
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal copyright(java.util.Optional<? extends com.fhir.markdown> copyright);

    /**
     * Initializes the optional value {@link ActivityDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link ActivityDefinition#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link ActivityDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.ActivitydefinitionStatus status);

    /**
     * Initializes the optional value {@link ActivityDefinition#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.ActivitydefinitionStatus> status);

    /**
     * Initializes the optional value {@link ActivityDefinition#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for chained invocation
     */
    BuildFinal endorser(java.util.List<com.fhir.ContactDetail> endorser);

    /**
     * Initializes the optional value {@link ActivityDefinition#endorser() endorser} to endorser.
     * @param endorser The value for endorser
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal endorser(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> endorser);

    /**
     * Initializes the optional value {@link ActivityDefinition#observationRequirement() observationRequirement} to observationRequirement.
     * @param observationRequirement The value for observationRequirement
     * @return {@code this} builder for chained invocation
     */
    BuildFinal observationRequirement(java.util.List<com.fhir.Reference> observationRequirement);

    /**
     * Initializes the optional value {@link ActivityDefinition#observationRequirement() observationRequirement} to observationRequirement.
     * @param observationRequirement The value for observationRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal observationRequirement(java.util.Optional<? extends java.util.List<com.fhir.Reference>> observationRequirement);

    /**
     * Initializes the optional value {@link ActivityDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link ActivityDefinition#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link ActivityDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link ActivityDefinition#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link ActivityDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ActivityDefinition#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingDateTime() timingDateTime} to timingDateTime.
     * @param timingDateTime The value for timingDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingDateTime(java.lang.String timingDateTime);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingDateTime() timingDateTime} to timingDateTime.
     * @param timingDateTime The value for timingDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingDateTime(java.util.Optional<java.lang.String> timingDateTime);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingPeriod(com.fhir.Period timingPeriod);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingPeriod() timingPeriod} to timingPeriod.
     * @param timingPeriod The value for timingPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingPeriod(java.util.Optional<? extends com.fhir.Period> timingPeriod);

    /**
     * Initializes the optional value {@link ActivityDefinition#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for chained invocation
     */
    BuildFinal approvalDate(com.fhir.date approvalDate);

    /**
     * Initializes the optional value {@link ActivityDefinition#approvalDate() approvalDate} to approvalDate.
     * @param approvalDate The value for approvalDate
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal approvalDate(java.util.Optional<? extends com.fhir.date> approvalDate);

    /**
     * Initializes the optional value {@link ActivityDefinition#specimenRequirement() specimenRequirement} to specimenRequirement.
     * @param specimenRequirement The value for specimenRequirement
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specimenRequirement(java.util.List<com.fhir.Reference> specimenRequirement);

    /**
     * Initializes the optional value {@link ActivityDefinition#specimenRequirement() specimenRequirement} to specimenRequirement.
     * @param specimenRequirement The value for specimenRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specimenRequirement(java.util.Optional<? extends java.util.List<com.fhir.Reference>> specimenRequirement);

    /**
     * Initializes the optional value {@link ActivityDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link ActivityDefinition#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link ActivityDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(com.fhir.dateTime date);

    /**
     * Initializes the optional value {@link ActivityDefinition#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(java.util.Optional<? extends com.fhir.dateTime> date);

    /**
     * Initializes the optional value {@link ActivityDefinition#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topic(java.util.List<com.fhir.CodeableConcept> topic);

    /**
     * Initializes the optional value {@link ActivityDefinition#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topic(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> topic);

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
    BuildFinal doNotPerform(java.util.Optional<java.lang.Boolean> doNotPerform);

    /**
     * Initializes the optional value {@link ActivityDefinition#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal intent(com.fhir.code intent);

    /**
     * Initializes the optional value {@link ActivityDefinition#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal intent(java.util.Optional<? extends com.fhir.code> intent);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingAge() timingAge} to timingAge.
     * @param timingAge The value for timingAge
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingAge(com.fhir.Age timingAge);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingAge() timingAge} to timingAge.
     * @param timingAge The value for timingAge
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingAge(java.util.Optional<? extends com.fhir.Age> timingAge);

    /**
     * Initializes the optional value {@link ActivityDefinition#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(com.fhir.Reference location);

    /**
     * Initializes the optional value {@link ActivityDefinition#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(java.util.Optional<? extends com.fhir.Reference> location);

    /**
     * Initializes the optional value {@link ActivityDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subjectCodeableConcept(com.fhir.CodeableConcept subjectCodeableConcept);

    /**
     * Initializes the optional value {@link ActivityDefinition#subjectCodeableConcept() subjectCodeableConcept} to subjectCodeableConcept.
     * @param subjectCodeableConcept The value for subjectCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subjectCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> subjectCodeableConcept);

    /**
     * Initializes the optional value {@link ActivityDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link ActivityDefinition#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingTiming() timingTiming} to timingTiming.
     * @param timingTiming The value for timingTiming
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingTiming(com.fhir.Timing timingTiming);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingTiming() timingTiming} to timingTiming.
     * @param timingTiming The value for timingTiming
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingTiming(java.util.Optional<? extends com.fhir.Timing> timingTiming);

    /**
     * Initializes the optional value {@link ActivityDefinition#productCodeableConcept() productCodeableConcept} to productCodeableConcept.
     * @param productCodeableConcept The value for productCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal productCodeableConcept(com.fhir.CodeableConcept productCodeableConcept);

    /**
     * Initializes the optional value {@link ActivityDefinition#productCodeableConcept() productCodeableConcept} to productCodeableConcept.
     * @param productCodeableConcept The value for productCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> productCodeableConcept);

    /**
     * Initializes the optional value {@link ActivityDefinition#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal usage(java.lang.String usage);

    /**
     * Initializes the optional value {@link ActivityDefinition#usage() usage} to usage.
     * @param usage The value for usage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal usage(java.util.Optional<java.lang.String> usage);

    /**
     * Initializes the optional value {@link ActivityDefinition#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subjectReference(com.fhir.Reference subjectReference);

    /**
     * Initializes the optional value {@link ActivityDefinition#subjectReference() subjectReference} to subjectReference.
     * @param subjectReference The value for subjectReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subjectReference(java.util.Optional<? extends com.fhir.Reference> subjectReference);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingRange() timingRange} to timingRange.
     * @param timingRange The value for timingRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal timingRange(com.fhir.Range timingRange);

    /**
     * Initializes the optional value {@link ActivityDefinition#timingRange() timingRange} to timingRange.
     * @param timingRange The value for timingRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal timingRange(java.util.Optional<? extends com.fhir.Range> timingRange);

    /**
     * Initializes the optional value {@link ActivityDefinition#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bodySite(java.util.List<com.fhir.CodeableConcept> bodySite);

    /**
     * Initializes the optional value {@link ActivityDefinition#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bodySite(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> bodySite);

    /**
     * Initializes the optional value {@link ActivityDefinition#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for chained invocation
     */
    BuildFinal profile(com.fhir.canonical profile);

    /**
     * Initializes the optional value {@link ActivityDefinition#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal profile(java.util.Optional<? extends com.fhir.canonical> profile);

    /**
     * Initializes the optional value {@link ActivityDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link ActivityDefinition#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link ActivityDefinition#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantity(com.fhir.Quantity quantity);

    /**
     * Initializes the optional value {@link ActivityDefinition#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantity(java.util.Optional<? extends com.fhir.Quantity> quantity);

    /**
     * Initializes the optional value {@link ActivityDefinition#dynamicValue() dynamicValue} to dynamicValue.
     * @param dynamicValue The value for dynamicValue
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dynamicValue(java.util.List<com.fhir.ActivityDefinition_DynamicValue> dynamicValue);

    /**
     * Initializes the optional value {@link ActivityDefinition#dynamicValue() dynamicValue} to dynamicValue.
     * @param dynamicValue The value for dynamicValue
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dynamicValue(java.util.Optional<? extends java.util.List<com.fhir.ActivityDefinition_DynamicValue>> dynamicValue);

    /**
     * Initializes the optional value {@link ActivityDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link ActivityDefinition#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link ActivityDefinition#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for chained invocation
     */
    BuildFinal participant(java.util.List<com.fhir.ActivityDefinition_Participant> participant);

    /**
     * Initializes the optional value {@link ActivityDefinition#participant() participant} to participant.
     * @param participant The value for participant
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal participant(java.util.Optional<? extends java.util.List<com.fhir.ActivityDefinition_Participant>> participant);

    /**
     * Initializes the optional value {@link ActivityDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link ActivityDefinition#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link ActivityDefinition#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reviewer(java.util.List<com.fhir.ContactDetail> reviewer);

    /**
     * Initializes the optional value {@link ActivityDefinition#reviewer() reviewer} to reviewer.
     * @param reviewer The value for reviewer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reviewer(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> reviewer);

    /**
     * Initializes the optional value {@link ActivityDefinition#observationResultRequirement() observationResultRequirement} to observationResultRequirement.
     * @param observationResultRequirement The value for observationResultRequirement
     * @return {@code this} builder for chained invocation
     */
    BuildFinal observationResultRequirement(java.util.List<com.fhir.Reference> observationResultRequirement);

    /**
     * Initializes the optional value {@link ActivityDefinition#observationResultRequirement() observationResultRequirement} to observationResultRequirement.
     * @param observationResultRequirement The value for observationResultRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal observationResultRequirement(java.util.Optional<? extends java.util.List<com.fhir.Reference>> observationResultRequirement);

    /**
     * Initializes the optional value {@link ActivityDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatedArtifact(java.util.List<com.fhir.RelatedArtifact> relatedArtifact);

    /**
     * Initializes the optional value {@link ActivityDefinition#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatedArtifact(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> relatedArtifact);

    /**
     * Initializes the optional value {@link ActivityDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ActivityDefinition#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Builds a new {@link ActivityDefinition ActivityDefinition}.
     * @return An immutable instance of ActivityDefinition
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ActivityDefinition build();
  }
}
