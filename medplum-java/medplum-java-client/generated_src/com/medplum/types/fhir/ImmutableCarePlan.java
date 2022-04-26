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
 * Immutable implementation of {@link CarePlan}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCarePlan.builder()}.
 */
@Generated(from = "CarePlan", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCarePlan implements CarePlan {
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Annotation> note;
  private final @Nullable List<CarePlan_Activity> activity;
  private final @Nullable Code language;
  private final @Nullable List<Reference> basedOn;
  private final @Nullable List<Reference> addresses;
  private final @Nullable Period period;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Reference> goal;
  private final @Nullable List<Reference> supportingInfo;
  private final @Nullable Narrative text;
  private final @Nullable Meta meta;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Code status;
  private final @Nullable Reference author;
  private final Reference subject;
  private final @Nullable Uri implicitRules;
  private final @Nullable Reference encounter;
  private final @Nullable List<Reference> partOf;
  private final @Nullable List<Reference> replaces;
  private final @Nullable String description;
  private final @Nullable List<Reference> careTeam;
  private final @Nullable Id id;
  private final @Nullable DateTime created;
  private final @Nullable Code intent;
  private final @Nullable List<Canonical> instantiatesCanonical;
  private final @Nullable List<CodeableConcept> category;
  private final @Nullable String title;
  private final @Nullable List<Reference> contributor;
  private final String resourceType;
  private final @Nullable List<Uri> instantiatesUri;

  private ImmutableCarePlan(
      @Nullable List<Extension> extension,
      @Nullable List<Identifier> identifier,
      @Nullable List<Annotation> note,
      @Nullable List<CarePlan_Activity> activity,
      @Nullable Code language,
      @Nullable List<Reference> basedOn,
      @Nullable List<Reference> addresses,
      @Nullable Period period,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Reference> goal,
      @Nullable List<Reference> supportingInfo,
      @Nullable Narrative text,
      @Nullable Meta meta,
      @Nullable List<ResourceList> contained,
      @Nullable Code status,
      @Nullable Reference author,
      Reference subject,
      @Nullable Uri implicitRules,
      @Nullable Reference encounter,
      @Nullable List<Reference> partOf,
      @Nullable List<Reference> replaces,
      @Nullable String description,
      @Nullable List<Reference> careTeam,
      @Nullable Id id,
      @Nullable DateTime created,
      @Nullable Code intent,
      @Nullable List<Canonical> instantiatesCanonical,
      @Nullable List<CodeableConcept> category,
      @Nullable String title,
      @Nullable List<Reference> contributor,
      String resourceType,
      @Nullable List<Uri> instantiatesUri) {
    this.extension = extension;
    this.identifier = identifier;
    this.note = note;
    this.activity = activity;
    this.language = language;
    this.basedOn = basedOn;
    this.addresses = addresses;
    this.period = period;
    this.modifierExtension = modifierExtension;
    this.goal = goal;
    this.supportingInfo = supportingInfo;
    this.text = text;
    this.meta = meta;
    this.contained = contained;
    this.status = status;
    this.author = author;
    this.subject = subject;
    this.implicitRules = implicitRules;
    this.encounter = encounter;
    this.partOf = partOf;
    this.replaces = replaces;
    this.description = description;
    this.careTeam = careTeam;
    this.id = id;
    this.created = created;
    this.intent = intent;
    this.instantiatesCanonical = instantiatesCanonical;
    this.category = category;
    this.title = title;
    this.contributor = contributor;
    this.resourceType = resourceType;
    this.instantiatesUri = instantiatesUri;
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
   * @return The value of the {@code note} attribute
   */
  @JsonProperty("note")
  @Override
  public Optional<List<Annotation>> note() {
    return Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code activity} attribute
   */
  @JsonProperty("activity")
  @Override
  public Optional<List<CarePlan_Activity>> activity() {
    return Optional.ofNullable(activity);
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
   * @return The value of the {@code basedOn} attribute
   */
  @JsonProperty("basedOn")
  @Override
  public Optional<List<Reference>> basedOn() {
    return Optional.ofNullable(basedOn);
  }

  /**
   * @return The value of the {@code addresses} attribute
   */
  @JsonProperty("addresses")
  @Override
  public Optional<List<Reference>> addresses() {
    return Optional.ofNullable(addresses);
  }

  /**
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Optional<Period> period() {
    return Optional.ofNullable(period);
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
   * @return The value of the {@code goal} attribute
   */
  @JsonProperty("goal")
  @Override
  public Optional<List<Reference>> goal() {
    return Optional.ofNullable(goal);
  }

  /**
   * @return The value of the {@code supportingInfo} attribute
   */
  @JsonProperty("supportingInfo")
  @Override
  public Optional<List<Reference>> supportingInfo() {
    return Optional.ofNullable(supportingInfo);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Code> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code author} attribute
   */
  @JsonProperty("author")
  @Override
  public Optional<Reference> author() {
    return Optional.ofNullable(author);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Reference subject() {
    return subject;
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
   * @return The value of the {@code encounter} attribute
   */
  @JsonProperty("encounter")
  @Override
  public Optional<Reference> encounter() {
    return Optional.ofNullable(encounter);
  }

  /**
   * @return The value of the {@code partOf} attribute
   */
  @JsonProperty("partOf")
  @Override
  public Optional<List<Reference>> partOf() {
    return Optional.ofNullable(partOf);
  }

  /**
   * @return The value of the {@code replaces} attribute
   */
  @JsonProperty("replaces")
  @Override
  public Optional<List<Reference>> replaces() {
    return Optional.ofNullable(replaces);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code careTeam} attribute
   */
  @JsonProperty("careTeam")
  @Override
  public Optional<List<Reference>> careTeam() {
    return Optional.ofNullable(careTeam);
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
   * @return The value of the {@code created} attribute
   */
  @JsonProperty("created")
  @Override
  public Optional<DateTime> created() {
    return Optional.ofNullable(created);
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
   * @return The value of the {@code instantiatesCanonical} attribute
   */
  @JsonProperty("instantiatesCanonical")
  @Override
  public Optional<List<Canonical>> instantiatesCanonical() {
    return Optional.ofNullable(instantiatesCanonical);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<List<CodeableConcept>> category() {
    return Optional.ofNullable(category);
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
   * @return The value of the {@code contributor} attribute
   */
  @JsonProperty("contributor")
  @Override
  public Optional<List<Reference>> contributor() {
    return Optional.ofNullable(contributor);
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
   * @return The value of the {@code instantiatesUri} attribute
   */
  @JsonProperty("instantiatesUri")
  @Override
  public Optional<List<Uri>> instantiatesUri() {
    return Optional.ofNullable(instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCarePlan(
        newValue,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCarePlan(
        value,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        newValue,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        value,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        newValue,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        value,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#activity() activity} attribute.
   * @param value The value for activity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withActivity(List<CarePlan_Activity> value) {
    @Nullable List<CarePlan_Activity> newValue = Objects.requireNonNull(value, "activity");
    if (this.activity == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        newValue,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#activity() activity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for activity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withActivity(Optional<? extends List<CarePlan_Activity>> optional) {
    @Nullable List<CarePlan_Activity> value = optional.orElse(null);
    if (this.activity == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        value,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        newValue,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        value,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withBasedOn(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        newValue,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withBasedOn(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        value,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#addresses() addresses} attribute.
   * @param value The value for addresses
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withAddresses(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "addresses");
    if (this.addresses == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        newValue,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#addresses() addresses} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for addresses
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withAddresses(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.addresses == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        value,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        newValue,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        value,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        newValue,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        value,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#goal() goal} attribute.
   * @param value The value for goal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withGoal(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "goal");
    if (this.goal == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        newValue,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#goal() goal} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for goal
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withGoal(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.goal == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        value,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#supportingInfo() supportingInfo} attribute.
   * @param value The value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withSupportingInfo(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "supportingInfo");
    if (this.supportingInfo == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        newValue,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#supportingInfo() supportingInfo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withSupportingInfo(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.supportingInfo == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        value,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        newValue,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        value,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        newValue,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        value,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        newValue,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        value,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        newValue,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        value,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withAuthor(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        newValue,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withAuthor(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        value,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CarePlan#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCarePlan withSubject(Reference value) {
    if (this.subject == value) return this;
    Reference newValue = Objects.requireNonNull(value, "subject");
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        newValue,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        newValue,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        value,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        newValue,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        value,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withPartOf(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        newValue,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withPartOf(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        value,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#replaces() replaces} attribute.
   * @param value The value for replaces
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withReplaces(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "replaces");
    if (this.replaces == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        newValue,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#replaces() replaces} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for replaces
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withReplaces(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.replaces == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        value,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        newValue,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        value,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#careTeam() careTeam} attribute.
   * @param value The value for careTeam
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withCareTeam(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "careTeam");
    if (this.careTeam == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        newValue,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#careTeam() careTeam} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for careTeam
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withCareTeam(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.careTeam == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        value,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        newValue,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        value,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withCreated(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        newValue,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withCreated(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        value,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#intent() intent} attribute.
   * @param value The value for intent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withIntent(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "intent");
    if (this.intent == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        newValue,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#intent() intent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withIntent(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.intent == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        value,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withInstantiatesCanonical(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        newValue,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withInstantiatesCanonical(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        value,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withCategory(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        newValue,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withCategory(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        value,
        this.title,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        newValue,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        value,
        this.contributor,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#contributor() contributor} attribute.
   * @param value The value for contributor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withContributor(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "contributor");
    if (this.contributor == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        newValue,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#contributor() contributor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contributor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withContributor(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.contributor == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        value,
        this.resourceType,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CarePlan#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCarePlan withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        newValue,
        this.instantiatesUri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withInstantiatesUri(List<Uri> value) {
    @Nullable List<Uri> newValue = Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withInstantiatesUri(Optional<? extends List<Uri>> optional) {
    @Nullable List<Uri> value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableCarePlan(
        this.extension,
        this.identifier,
        this.note,
        this.activity,
        this.language,
        this.basedOn,
        this.addresses,
        this.period,
        this.modifierExtension,
        this.goal,
        this.supportingInfo,
        this.text,
        this.meta,
        this.contained,
        this.status,
        this.author,
        this.subject,
        this.implicitRules,
        this.encounter,
        this.partOf,
        this.replaces,
        this.description,
        this.careTeam,
        this.id,
        this.created,
        this.intent,
        this.instantiatesCanonical,
        this.category,
        this.title,
        this.contributor,
        this.resourceType,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCarePlan} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCarePlan
        && equalTo((ImmutableCarePlan) another);
  }

  private boolean equalTo(ImmutableCarePlan another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(note, another.note)
        && Objects.equals(activity, another.activity)
        && Objects.equals(language, another.language)
        && Objects.equals(basedOn, another.basedOn)
        && Objects.equals(addresses, another.addresses)
        && Objects.equals(period, another.period)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(goal, another.goal)
        && Objects.equals(supportingInfo, another.supportingInfo)
        && Objects.equals(text, another.text)
        && Objects.equals(meta, another.meta)
        && Objects.equals(contained, another.contained)
        && Objects.equals(status, another.status)
        && Objects.equals(author, another.author)
        && subject.equals(another.subject)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(partOf, another.partOf)
        && Objects.equals(replaces, another.replaces)
        && Objects.equals(description, another.description)
        && Objects.equals(careTeam, another.careTeam)
        && Objects.equals(id, another.id)
        && Objects.equals(created, another.created)
        && Objects.equals(intent, another.intent)
        && Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && Objects.equals(category, another.category)
        && Objects.equals(title, another.title)
        && Objects.equals(contributor, another.contributor)
        && resourceType.equals(another.resourceType)
        && Objects.equals(instantiatesUri, another.instantiatesUri);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code identifier}, {@code note}, {@code activity}, {@code language}, {@code basedOn}, {@code addresses}, {@code period}, {@code modifierExtension}, {@code goal}, {@code supportingInfo}, {@code text}, {@code meta}, {@code contained}, {@code status}, {@code author}, {@code subject}, {@code implicitRules}, {@code encounter}, {@code partOf}, {@code replaces}, {@code description}, {@code careTeam}, {@code id}, {@code created}, {@code intent}, {@code instantiatesCanonical}, {@code category}, {@code title}, {@code contributor}, {@code resourceType}, {@code instantiatesUri}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(activity);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(basedOn);
    h += (h << 5) + Objects.hashCode(addresses);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(goal);
    h += (h << 5) + Objects.hashCode(supportingInfo);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(author);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(partOf);
    h += (h << 5) + Objects.hashCode(replaces);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(careTeam);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(created);
    h += (h << 5) + Objects.hashCode(intent);
    h += (h << 5) + Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(contributor);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(instantiatesUri);
    return h;
  }

  /**
   * Prints the immutable value {@code CarePlan} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CarePlan{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (identifier != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (note != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (activity != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("activity=").append(activity);
    }
    if (language != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (basedOn != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (addresses != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("addresses=").append(addresses);
    }
    if (period != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (modifierExtension != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (goal != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("goal=").append(goal);
    }
    if (supportingInfo != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("supportingInfo=").append(supportingInfo);
    }
    if (text != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (meta != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (contained != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (status != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (author != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("author=").append(author);
    }
    if (builder.length() > 9) builder.append(", ");
    builder.append("subject=").append(subject);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (partOf != null) {
      builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (replaces != null) {
      builder.append(", ");
      builder.append("replaces=").append(replaces);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (careTeam != null) {
      builder.append(", ");
      builder.append("careTeam=").append(careTeam);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (created != null) {
      builder.append(", ");
      builder.append("created=").append(created);
    }
    if (intent != null) {
      builder.append(", ");
      builder.append("intent=").append(intent);
    }
    if (instantiatesCanonical != null) {
      builder.append(", ");
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (title != null) {
      builder.append(", ");
      builder.append("title=").append(title);
    }
    if (contributor != null) {
      builder.append(", ");
      builder.append("contributor=").append(contributor);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (instantiatesUri != null) {
      builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CarePlan", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CarePlan {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<List<CarePlan_Activity>> activity = Optional.empty();
    boolean activityIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Reference>> basedOn = Optional.empty();
    boolean basedOnIsSet;
    @Nullable Optional<List<Reference>> addresses = Optional.empty();
    boolean addressesIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Reference>> goal = Optional.empty();
    boolean goalIsSet;
    @Nullable Optional<List<Reference>> supportingInfo = Optional.empty();
    boolean supportingInfoIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Reference> author = Optional.empty();
    boolean authorIsSet;
    @Nullable Reference subject;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<List<Reference>> partOf = Optional.empty();
    boolean partOfIsSet;
    @Nullable Optional<List<Reference>> replaces = Optional.empty();
    boolean replacesIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<Reference>> careTeam = Optional.empty();
    boolean careTeamIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<DateTime> created = Optional.empty();
    boolean createdIsSet;
    @Nullable Optional<Code> intent = Optional.empty();
    boolean intentIsSet;
    @Nullable Optional<List<Canonical>> instantiatesCanonical = Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @Nullable Optional<List<CodeableConcept>> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<List<Reference>> contributor = Optional.empty();
    boolean contributorIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Uri>> instantiatesUri = Optional.empty();
    boolean instantiatesUriIsSet;
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
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("activity")
    public void setActivity(Optional<List<CarePlan_Activity>> activity) {
      this.activity = activity;
      this.activityIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("basedOn")
    public void setBasedOn(Optional<List<Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @JsonProperty("addresses")
    public void setAddresses(Optional<List<Reference>> addresses) {
      this.addresses = addresses;
      this.addressesIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("goal")
    public void setGoal(Optional<List<Reference>> goal) {
      this.goal = goal;
      this.goalIsSet = true;
    }
    @JsonProperty("supportingInfo")
    public void setSupportingInfo(Optional<List<Reference>> supportingInfo) {
      this.supportingInfo = supportingInfo;
      this.supportingInfoIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
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
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("author")
    public void setAuthor(Optional<Reference> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
      this.subject = subject;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("partOf")
    public void setPartOf(Optional<List<Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @JsonProperty("replaces")
    public void setReplaces(Optional<List<Reference>> replaces) {
      this.replaces = replaces;
      this.replacesIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("careTeam")
    public void setCareTeam(Optional<List<Reference>> careTeam) {
      this.careTeam = careTeam;
      this.careTeamIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("created")
    public void setCreated(Optional<DateTime> created) {
      this.created = created;
      this.createdIsSet = true;
    }
    @JsonProperty("intent")
    public void setIntent(Optional<Code> intent) {
      this.intent = intent;
      this.intentIsSet = true;
    }
    @JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(Optional<List<Canonical>> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<List<CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("contributor")
    public void setContributor(Optional<List<Reference>> contributor) {
      this.contributor = contributor;
      this.contributorIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("instantiatesUri")
    public void setInstantiatesUri(Optional<List<Uri>> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CarePlan_Activity>> activity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> addresses() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> goal() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> supportingInfo() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> author() { throw new UnsupportedOperationException(); }
    @Override
    public Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> replaces() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> careTeam() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> intent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> contributor() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Uri>> instantiatesUri() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCarePlan fromJson(Json json) {
    ImmutableCarePlan.Builder builder = ((ImmutableCarePlan.Builder) ImmutableCarePlan.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.activityIsSet) {
      builder.activity(json.activity);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.addressesIsSet) {
      builder.addresses(json.addresses);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.goalIsSet) {
      builder.goal(json.goal);
    }
    if (json.supportingInfoIsSet) {
      builder.supportingInfo(json.supportingInfo);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.replacesIsSet) {
      builder.replaces(json.replaces);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.careTeamIsSet) {
      builder.careTeam(json.careTeam);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.intentIsSet) {
      builder.intent(json.intent);
    }
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.contributorIsSet) {
      builder.contributor(json.contributor);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    return (ImmutableCarePlan) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CarePlan} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CarePlan instance
   */
  public static CarePlan copyOf(CarePlan instance) {
    if (instance instanceof ImmutableCarePlan) {
      return (ImmutableCarePlan) instance;
    }
    return ((ImmutableCarePlan.Builder) ImmutableCarePlan.builder())
        .extension(instance.extension())
        .identifier(instance.identifier())
        .note(instance.note())
        .activity(instance.activity())
        .language(instance.language())
        .basedOn(instance.basedOn())
        .addresses(instance.addresses())
        .period(instance.period())
        .modifierExtension(instance.modifierExtension())
        .goal(instance.goal())
        .supportingInfo(instance.supportingInfo())
        .text(instance.text())
        .meta(instance.meta())
        .contained(instance.contained())
        .status(instance.status())
        .author(instance.author())
        .subject(instance.subject())
        .implicitRules(instance.implicitRules())
        .encounter(instance.encounter())
        .partOf(instance.partOf())
        .replaces(instance.replaces())
        .description(instance.description())
        .careTeam(instance.careTeam())
        .id(instance.id())
        .created(instance.created())
        .intent(instance.intent())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .category(instance.category())
        .title(instance.title())
        .contributor(instance.contributor())
        .resourceType(instance.resourceType())
        .instantiatesUri(instance.instantiatesUri())
        .build();
  }

  /**
   * Creates a builder for {@link CarePlan CarePlan}.
   * <pre>
   * ImmutableCarePlan.builder()
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CarePlan#extension() extension}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link CarePlan#identifier() identifier}
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link CarePlan#note() note}
   *    .activity(List&amp;lt;com.medplum.types.fhir.CarePlan_Activity&amp;gt;) // optional {@link CarePlan#activity() activity}
   *    .language(com.medplum.types.fhir.Code) // optional {@link CarePlan#language() language}
   *    .basedOn(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link CarePlan#basedOn() basedOn}
   *    .addresses(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link CarePlan#addresses() addresses}
   *    .period(com.medplum.types.fhir.Period) // optional {@link CarePlan#period() period}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link CarePlan#modifierExtension() modifierExtension}
   *    .goal(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link CarePlan#goal() goal}
   *    .supportingInfo(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link CarePlan#supportingInfo() supportingInfo}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link CarePlan#text() text}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link CarePlan#meta() meta}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link CarePlan#contained() contained}
   *    .status(com.medplum.types.fhir.Code) // optional {@link CarePlan#status() status}
   *    .author(com.medplum.types.fhir.Reference) // optional {@link CarePlan#author() author}
   *    .subject(com.medplum.types.fhir.Reference) // required {@link CarePlan#subject() subject}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link CarePlan#implicitRules() implicitRules}
   *    .encounter(com.medplum.types.fhir.Reference) // optional {@link CarePlan#encounter() encounter}
   *    .partOf(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link CarePlan#partOf() partOf}
   *    .replaces(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link CarePlan#replaces() replaces}
   *    .description(String) // optional {@link CarePlan#description() description}
   *    .careTeam(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link CarePlan#careTeam() careTeam}
   *    .id(com.medplum.types.fhir.Id) // optional {@link CarePlan#id() id}
   *    .created(com.medplum.types.fhir.DateTime) // optional {@link CarePlan#created() created}
   *    .intent(com.medplum.types.fhir.Code) // optional {@link CarePlan#intent() intent}
   *    .instantiatesCanonical(List&amp;lt;com.medplum.types.fhir.Canonical&amp;gt;) // optional {@link CarePlan#instantiatesCanonical() instantiatesCanonical}
   *    .category(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link CarePlan#category() category}
   *    .title(String) // optional {@link CarePlan#title() title}
   *    .contributor(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link CarePlan#contributor() contributor}
   *    .resourceType(String) // required {@link CarePlan#resourceType() resourceType}
   *    .instantiatesUri(List&amp;lt;com.medplum.types.fhir.Uri&amp;gt;) // optional {@link CarePlan#instantiatesUri() instantiatesUri}
   *    .build();
   * </pre>
   * @return A new CarePlan builder
   */
  public static SubjectBuildStage builder() {
    return new ImmutableCarePlan.Builder();
  }

  /**
   * Builds instances of type {@link CarePlan CarePlan}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CarePlan", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements SubjectBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SUBJECT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_IDENTIFIER = 0x2L;
    private static final long OPT_BIT_NOTE = 0x4L;
    private static final long OPT_BIT_ACTIVITY = 0x8L;
    private static final long OPT_BIT_LANGUAGE = 0x10L;
    private static final long OPT_BIT_BASED_ON = 0x20L;
    private static final long OPT_BIT_ADDRESSES = 0x40L;
    private static final long OPT_BIT_PERIOD = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_GOAL = 0x200L;
    private static final long OPT_BIT_SUPPORTING_INFO = 0x400L;
    private static final long OPT_BIT_TEXT = 0x800L;
    private static final long OPT_BIT_META = 0x1000L;
    private static final long OPT_BIT_CONTAINED = 0x2000L;
    private static final long OPT_BIT_STATUS = 0x4000L;
    private static final long OPT_BIT_AUTHOR = 0x8000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10000L;
    private static final long OPT_BIT_ENCOUNTER = 0x20000L;
    private static final long OPT_BIT_PART_OF = 0x40000L;
    private static final long OPT_BIT_REPLACES = 0x80000L;
    private static final long OPT_BIT_DESCRIPTION = 0x100000L;
    private static final long OPT_BIT_CARE_TEAM = 0x200000L;
    private static final long OPT_BIT_ID = 0x400000L;
    private static final long OPT_BIT_CREATED = 0x800000L;
    private static final long OPT_BIT_INTENT = 0x1000000L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x2000000L;
    private static final long OPT_BIT_CATEGORY = 0x4000000L;
    private static final long OPT_BIT_TITLE = 0x8000000L;
    private static final long OPT_BIT_CONTRIBUTOR = 0x10000000L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x20000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Annotation> note;
    private @Nullable List<CarePlan_Activity> activity;
    private @Nullable Code language;
    private @Nullable List<Reference> basedOn;
    private @Nullable List<Reference> addresses;
    private @Nullable Period period;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Reference> goal;
    private @Nullable List<Reference> supportingInfo;
    private @Nullable Narrative text;
    private @Nullable Meta meta;
    private @Nullable List<ResourceList> contained;
    private @Nullable Code status;
    private @Nullable Reference author;
    private @Nullable Reference subject;
    private @Nullable Uri implicitRules;
    private @Nullable Reference encounter;
    private @Nullable List<Reference> partOf;
    private @Nullable List<Reference> replaces;
    private @Nullable String description;
    private @Nullable List<Reference> careTeam;
    private @Nullable Id id;
    private @Nullable DateTime created;
    private @Nullable Code intent;
    private @Nullable List<Canonical> instantiatesCanonical;
    private @Nullable List<CodeableConcept> category;
    private @Nullable String title;
    private @Nullable List<Reference> contributor;
    private @Nullable String resourceType;
    private @Nullable List<Uri> instantiatesUri;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CarePlan#extension() extension} to extension.
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
     * Initializes the optional value {@link CarePlan#extension() extension} to extension.
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
     * Initializes the optional value {@link CarePlan#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CarePlan#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CarePlan#note() note} to note.
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
     * Initializes the optional value {@link CarePlan#note() note} to note.
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
     * Initializes the optional value {@link CarePlan#activity() activity} to activity.
     * @param activity The value for activity
     * @return {@code this} builder for chained invocation
     */
    public final Builder activity(List<CarePlan_Activity> activity) {
      checkNotIsSet(activityIsSet(), "activity");
      this.activity = Objects.requireNonNull(activity, "activity");
      optBits |= OPT_BIT_ACTIVITY;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#activity() activity} to activity.
     * @param activity The value for activity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("activity")
    public final Builder activity(Optional<? extends List<CarePlan_Activity>> activity) {
      checkNotIsSet(activityIsSet(), "activity");
      this.activity = activity.orElse(null);
      optBits |= OPT_BIT_ACTIVITY;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#language() language} to language.
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
     * Initializes the optional value {@link CarePlan#language() language} to language.
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
     * Initializes the optional value {@link CarePlan#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder basedOn(List<Reference> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = Objects.requireNonNull(basedOn, "basedOn");
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("basedOn")
    public final Builder basedOn(Optional<? extends List<Reference>> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = basedOn.orElse(null);
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#addresses() addresses} to addresses.
     * @param addresses The value for addresses
     * @return {@code this} builder for chained invocation
     */
    public final Builder addresses(List<Reference> addresses) {
      checkNotIsSet(addressesIsSet(), "addresses");
      this.addresses = Objects.requireNonNull(addresses, "addresses");
      optBits |= OPT_BIT_ADDRESSES;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#addresses() addresses} to addresses.
     * @param addresses The value for addresses
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("addresses")
    public final Builder addresses(Optional<? extends List<Reference>> addresses) {
      checkNotIsSet(addressesIsSet(), "addresses");
      this.addresses = addresses.orElse(null);
      optBits |= OPT_BIT_ADDRESSES;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Optional<? extends Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CarePlan#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CarePlan#goal() goal} to goal.
     * @param goal The value for goal
     * @return {@code this} builder for chained invocation
     */
    public final Builder goal(List<Reference> goal) {
      checkNotIsSet(goalIsSet(), "goal");
      this.goal = Objects.requireNonNull(goal, "goal");
      optBits |= OPT_BIT_GOAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#goal() goal} to goal.
     * @param goal The value for goal
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("goal")
    public final Builder goal(Optional<? extends List<Reference>> goal) {
      checkNotIsSet(goalIsSet(), "goal");
      this.goal = goal.orElse(null);
      optBits |= OPT_BIT_GOAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingInfo(List<Reference> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = Objects.requireNonNull(supportingInfo, "supportingInfo");
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("supportingInfo")
    public final Builder supportingInfo(Optional<? extends List<Reference>> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = supportingInfo.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#text() text} to text.
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
     * Initializes the optional value {@link CarePlan#text() text} to text.
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
     * Initializes the optional value {@link CarePlan#meta() meta} to meta.
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
     * Initializes the optional value {@link CarePlan#meta() meta} to meta.
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
     * Initializes the optional value {@link CarePlan#contained() contained} to contained.
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
     * Initializes the optional value {@link CarePlan#contained() contained} to contained.
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
     * Initializes the optional value {@link CarePlan#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(Code status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends Code> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    public final Builder author(Reference author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = Objects.requireNonNull(author, "author");
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("author")
    public final Builder author(Optional<? extends Reference> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = author.orElse(null);
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the value for the {@link CarePlan#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subject")
    public final Builder subject(Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = Objects.requireNonNull(subject, "subject");
      initBits &= ~INIT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CarePlan#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CarePlan#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    public final Builder encounter(Reference encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = Objects.requireNonNull(encounter, "encounter");
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("encounter")
    public final Builder encounter(Optional<? extends Reference> encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = encounter.orElse(null);
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder partOf(List<Reference> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = Objects.requireNonNull(partOf, "partOf");
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("partOf")
    public final Builder partOf(Optional<? extends List<Reference>> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = partOf.orElse(null);
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for chained invocation
     */
    public final Builder replaces(List<Reference> replaces) {
      checkNotIsSet(replacesIsSet(), "replaces");
      this.replaces = Objects.requireNonNull(replaces, "replaces");
      optBits |= OPT_BIT_REPLACES;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("replaces")
    public final Builder replaces(Optional<? extends List<Reference>> replaces) {
      checkNotIsSet(replacesIsSet(), "replaces");
      this.replaces = replaces.orElse(null);
      optBits |= OPT_BIT_REPLACES;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for chained invocation
     */
    public final Builder careTeam(List<Reference> careTeam) {
      checkNotIsSet(careTeamIsSet(), "careTeam");
      this.careTeam = Objects.requireNonNull(careTeam, "careTeam");
      optBits |= OPT_BIT_CARE_TEAM;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("careTeam")
    public final Builder careTeam(Optional<? extends List<Reference>> careTeam) {
      checkNotIsSet(careTeamIsSet(), "careTeam");
      this.careTeam = careTeam.orElse(null);
      optBits |= OPT_BIT_CARE_TEAM;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#id() id} to id.
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
     * Initializes the optional value {@link CarePlan#id() id} to id.
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
     * Initializes the optional value {@link CarePlan#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    public final Builder created(DateTime created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = Objects.requireNonNull(created, "created");
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("created")
    public final Builder created(Optional<? extends DateTime> created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = created.orElse(null);
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#intent() intent} to intent.
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
     * Initializes the optional value {@link CarePlan#intent() intent} to intent.
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
     * Initializes the optional value {@link CarePlan#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesCanonical(List<Canonical> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = Objects.requireNonNull(instantiatesCanonical, "instantiatesCanonical");
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instantiatesCanonical")
    public final Builder instantiatesCanonical(Optional<? extends List<Canonical>> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = instantiatesCanonical.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(List<CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(Optional<? extends List<CodeableConcept>> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#title() title} to title.
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
     * Initializes the optional value {@link CarePlan#title() title} to title.
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
     * Initializes the optional value {@link CarePlan#contributor() contributor} to contributor.
     * @param contributor The value for contributor
     * @return {@code this} builder for chained invocation
     */
    public final Builder contributor(List<Reference> contributor) {
      checkNotIsSet(contributorIsSet(), "contributor");
      this.contributor = Objects.requireNonNull(contributor, "contributor");
      optBits |= OPT_BIT_CONTRIBUTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#contributor() contributor} to contributor.
     * @param contributor The value for contributor
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contributor")
    public final Builder contributor(Optional<? extends List<Reference>> contributor) {
      checkNotIsSet(contributorIsSet(), "contributor");
      this.contributor = contributor.orElse(null);
      optBits |= OPT_BIT_CONTRIBUTOR;
      return this;
    }

    /**
     * Initializes the value for the {@link CarePlan#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link CarePlan#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesUri(List<Uri> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = Objects.requireNonNull(instantiatesUri, "instantiatesUri");
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instantiatesUri")
    public final Builder instantiatesUri(Optional<? extends List<Uri>> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = instantiatesUri.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Builds a new {@link CarePlan CarePlan}.
     * @return An immutable instance of CarePlan
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CarePlan build() {
      checkRequiredAttributes();
      return new ImmutableCarePlan(
          extension,
          identifier,
          note,
          activity,
          language,
          basedOn,
          addresses,
          period,
          modifierExtension,
          goal,
          supportingInfo,
          text,
          meta,
          contained,
          status,
          author,
          subject,
          implicitRules,
          encounter,
          partOf,
          replaces,
          description,
          careTeam,
          id,
          created,
          intent,
          instantiatesCanonical,
          category,
          title,
          contributor,
          resourceType,
          instantiatesUri);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean activityIsSet() {
      return (optBits & OPT_BIT_ACTIVITY) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean addressesIsSet() {
      return (optBits & OPT_BIT_ADDRESSES) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean goalIsSet() {
      return (optBits & OPT_BIT_GOAL) != 0;
    }

    private boolean supportingInfoIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFO) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean replacesIsSet() {
      return (optBits & OPT_BIT_REPLACES) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean careTeamIsSet() {
      return (optBits & OPT_BIT_CARE_TEAM) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean intentIsSet() {
      return (optBits & OPT_BIT_INTENT) != 0;
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean contributorIsSet() {
      return (optBits & OPT_BIT_CONTRIBUTOR) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CarePlan is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!subjectIsSet()) attributes.add("subject");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build CarePlan, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "CarePlan", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link CarePlan#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage subject(Reference subject);
  }

  @Generated(from = "CarePlan", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link CarePlan#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "CarePlan", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CarePlan#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link CarePlan#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link CarePlan#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link CarePlan#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link CarePlan#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link CarePlan#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link CarePlan#activity() activity} to activity.
     * @param activity The value for activity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal activity(List<CarePlan_Activity> activity);

    /**
     * Initializes the optional value {@link CarePlan#activity() activity} to activity.
     * @param activity The value for activity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal activity(Optional<? extends List<CarePlan_Activity>> activity);

    /**
     * Initializes the optional value {@link CarePlan#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link CarePlan#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link CarePlan#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(List<Reference> basedOn);

    /**
     * Initializes the optional value {@link CarePlan#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(Optional<? extends List<Reference>> basedOn);

    /**
     * Initializes the optional value {@link CarePlan#addresses() addresses} to addresses.
     * @param addresses The value for addresses
     * @return {@code this} builder for chained invocation
     */
    BuildFinal addresses(List<Reference> addresses);

    /**
     * Initializes the optional value {@link CarePlan#addresses() addresses} to addresses.
     * @param addresses The value for addresses
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addresses(Optional<? extends List<Reference>> addresses);

    /**
     * Initializes the optional value {@link CarePlan#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(Period period);

    /**
     * Initializes the optional value {@link CarePlan#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(Optional<? extends Period> period);

    /**
     * Initializes the optional value {@link CarePlan#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CarePlan#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link CarePlan#goal() goal} to goal.
     * @param goal The value for goal
     * @return {@code this} builder for chained invocation
     */
    BuildFinal goal(List<Reference> goal);

    /**
     * Initializes the optional value {@link CarePlan#goal() goal} to goal.
     * @param goal The value for goal
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal goal(Optional<? extends List<Reference>> goal);

    /**
     * Initializes the optional value {@link CarePlan#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInfo(List<Reference> supportingInfo);

    /**
     * Initializes the optional value {@link CarePlan#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInfo(Optional<? extends List<Reference>> supportingInfo);

    /**
     * Initializes the optional value {@link CarePlan#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link CarePlan#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link CarePlan#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link CarePlan#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link CarePlan#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link CarePlan#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link CarePlan#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link CarePlan#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link CarePlan#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(Reference author);

    /**
     * Initializes the optional value {@link CarePlan#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(Optional<? extends Reference> author);

    /**
     * Initializes the optional value {@link CarePlan#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link CarePlan#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link CarePlan#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link CarePlan#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link CarePlan#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(List<Reference> partOf);

    /**
     * Initializes the optional value {@link CarePlan#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(Optional<? extends List<Reference>> partOf);

    /**
     * Initializes the optional value {@link CarePlan#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for chained invocation
     */
    BuildFinal replaces(List<Reference> replaces);

    /**
     * Initializes the optional value {@link CarePlan#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal replaces(Optional<? extends List<Reference>> replaces);

    /**
     * Initializes the optional value {@link CarePlan#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link CarePlan#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Initializes the optional value {@link CarePlan#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for chained invocation
     */
    BuildFinal careTeam(List<Reference> careTeam);

    /**
     * Initializes the optional value {@link CarePlan#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal careTeam(Optional<? extends List<Reference>> careTeam);

    /**
     * Initializes the optional value {@link CarePlan#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link CarePlan#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link CarePlan#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(DateTime created);

    /**
     * Initializes the optional value {@link CarePlan#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(Optional<? extends DateTime> created);

    /**
     * Initializes the optional value {@link CarePlan#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal intent(Code intent);

    /**
     * Initializes the optional value {@link CarePlan#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal intent(Optional<? extends Code> intent);

    /**
     * Initializes the optional value {@link CarePlan#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesCanonical(List<Canonical> instantiatesCanonical);

    /**
     * Initializes the optional value {@link CarePlan#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesCanonical(Optional<? extends List<Canonical>> instantiatesCanonical);

    /**
     * Initializes the optional value {@link CarePlan#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(List<CodeableConcept> category);

    /**
     * Initializes the optional value {@link CarePlan#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends List<CodeableConcept>> category);

    /**
     * Initializes the optional value {@link CarePlan#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link CarePlan#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Initializes the optional value {@link CarePlan#contributor() contributor} to contributor.
     * @param contributor The value for contributor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contributor(List<Reference> contributor);

    /**
     * Initializes the optional value {@link CarePlan#contributor() contributor} to contributor.
     * @param contributor The value for contributor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contributor(Optional<? extends List<Reference>> contributor);

    /**
     * Initializes the optional value {@link CarePlan#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesUri(List<Uri> instantiatesUri);

    /**
     * Initializes the optional value {@link CarePlan#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesUri(Optional<? extends List<Uri>> instantiatesUri);

    /**
     * Builds a new {@link CarePlan CarePlan}.
     * @return An immutable instance of CarePlan
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CarePlan build();
  }
}