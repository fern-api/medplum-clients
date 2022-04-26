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
 * Immutable implementation of {@link Communication}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCommunication.builder()}.
 */
@Generated(from = "Communication", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCommunication implements Communication {
  private final @Nullable List<CodeableConcept> category;
  private final @Nullable List<Reference> basedOn;
  private final @Nullable Reference subject;
  private final @Nullable Code language;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable DateTime sent;
  private final @Nullable List<Communication_Payload> payload;
  private final @Nullable List<Canonical> instantiatesCanonical;
  private final @Nullable Code priority;
  private final @Nullable DateTime received;
  private final @Nullable CodeableConcept statusReason;
  private final @Nullable List<Reference> inResponseTo;
  private final @Nullable List<Reference> recipient;
  private final @Nullable Code status;
  private final @Nullable List<CodeableConcept> medium;
  private final @Nullable List<Reference> reasonReference;
  private final @Nullable List<Uri> instantiatesUri;
  private final @Nullable List<Reference> about;
  private final @Nullable List<Annotation> note;
  private final @Nullable Meta meta;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<CodeableConcept> reasonCode;
  private final @Nullable Id id;
  private final @Nullable Reference sender;
  private final @Nullable List<Reference> partOf;
  private final @Nullable Uri implicitRules;
  private final @Nullable Narrative text;
  private final String resourceType;
  private final @Nullable Reference encounter;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable CodeableConcept topic;

  private ImmutableCommunication(
      @Nullable List<CodeableConcept> category,
      @Nullable List<Reference> basedOn,
      @Nullable Reference subject,
      @Nullable Code language,
      @Nullable List<ResourceList> contained,
      @Nullable DateTime sent,
      @Nullable List<Communication_Payload> payload,
      @Nullable List<Canonical> instantiatesCanonical,
      @Nullable Code priority,
      @Nullable DateTime received,
      @Nullable CodeableConcept statusReason,
      @Nullable List<Reference> inResponseTo,
      @Nullable List<Reference> recipient,
      @Nullable Code status,
      @Nullable List<CodeableConcept> medium,
      @Nullable List<Reference> reasonReference,
      @Nullable List<Uri> instantiatesUri,
      @Nullable List<Reference> about,
      @Nullable List<Annotation> note,
      @Nullable Meta meta,
      @Nullable List<Extension> extension,
      @Nullable List<CodeableConcept> reasonCode,
      @Nullable Id id,
      @Nullable Reference sender,
      @Nullable List<Reference> partOf,
      @Nullable Uri implicitRules,
      @Nullable Narrative text,
      String resourceType,
      @Nullable Reference encounter,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Identifier> identifier,
      @Nullable CodeableConcept topic) {
    this.category = category;
    this.basedOn = basedOn;
    this.subject = subject;
    this.language = language;
    this.contained = contained;
    this.sent = sent;
    this.payload = payload;
    this.instantiatesCanonical = instantiatesCanonical;
    this.priority = priority;
    this.received = received;
    this.statusReason = statusReason;
    this.inResponseTo = inResponseTo;
    this.recipient = recipient;
    this.status = status;
    this.medium = medium;
    this.reasonReference = reasonReference;
    this.instantiatesUri = instantiatesUri;
    this.about = about;
    this.note = note;
    this.meta = meta;
    this.extension = extension;
    this.reasonCode = reasonCode;
    this.id = id;
    this.sender = sender;
    this.partOf = partOf;
    this.implicitRules = implicitRules;
    this.text = text;
    this.resourceType = resourceType;
    this.encounter = encounter;
    this.modifierExtension = modifierExtension;
    this.identifier = identifier;
    this.topic = topic;
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
   * @return The value of the {@code basedOn} attribute
   */
  @JsonProperty("basedOn")
  @Override
  public Optional<List<Reference>> basedOn() {
    return Optional.ofNullable(basedOn);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Optional<Reference> subject() {
    return Optional.ofNullable(subject);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code sent} attribute
   */
  @JsonProperty("sent")
  @Override
  public Optional<DateTime> sent() {
    return Optional.ofNullable(sent);
  }

  /**
   * @return The value of the {@code payload} attribute
   */
  @JsonProperty("payload")
  @Override
  public Optional<List<Communication_Payload>> payload() {
    return Optional.ofNullable(payload);
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
   * @return The value of the {@code priority} attribute
   */
  @JsonProperty("priority")
  @Override
  public Optional<Code> priority() {
    return Optional.ofNullable(priority);
  }

  /**
   * @return The value of the {@code received} attribute
   */
  @JsonProperty("received")
  @Override
  public Optional<DateTime> received() {
    return Optional.ofNullable(received);
  }

  /**
   * @return The value of the {@code statusReason} attribute
   */
  @JsonProperty("statusReason")
  @Override
  public Optional<CodeableConcept> statusReason() {
    return Optional.ofNullable(statusReason);
  }

  /**
   * @return The value of the {@code inResponseTo} attribute
   */
  @JsonProperty("inResponseTo")
  @Override
  public Optional<List<Reference>> inResponseTo() {
    return Optional.ofNullable(inResponseTo);
  }

  /**
   * @return The value of the {@code recipient} attribute
   */
  @JsonProperty("recipient")
  @Override
  public Optional<List<Reference>> recipient() {
    return Optional.ofNullable(recipient);
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
   * @return The value of the {@code medium} attribute
   */
  @JsonProperty("medium")
  @Override
  public Optional<List<CodeableConcept>> medium() {
    return Optional.ofNullable(medium);
  }

  /**
   * @return The value of the {@code reasonReference} attribute
   */
  @JsonProperty("reasonReference")
  @Override
  public Optional<List<Reference>> reasonReference() {
    return Optional.ofNullable(reasonReference);
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
   * @return The value of the {@code about} attribute
   */
  @JsonProperty("about")
  @Override
  public Optional<List<Reference>> about() {
    return Optional.ofNullable(about);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
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
   * @return The value of the {@code reasonCode} attribute
   */
  @JsonProperty("reasonCode")
  @Override
  public Optional<List<CodeableConcept>> reasonCode() {
    return Optional.ofNullable(reasonCode);
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
   * @return The value of the {@code sender} attribute
   */
  @JsonProperty("sender")
  @Override
  public Optional<Reference> sender() {
    return Optional.ofNullable(sender);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code topic} attribute
   */
  @JsonProperty("topic")
  @Override
  public Optional<CodeableConcept> topic() {
    return Optional.ofNullable(topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withCategory(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableCommunication(
        newValue,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withCategory(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableCommunication(
        value,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withBasedOn(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        newValue,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withBasedOn(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableCommunication(
        this.category,
        value,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withSubject(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        newValue,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withSubject(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        value,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        newValue,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        value,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        newValue,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        value,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#sent() sent} attribute.
   * @param value The value for sent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withSent(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "sent");
    if (this.sent == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        newValue,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#sent() sent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withSent(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.sent == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        value,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#payload() payload} attribute.
   * @param value The value for payload
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withPayload(List<Communication_Payload> value) {
    @Nullable List<Communication_Payload> newValue = Objects.requireNonNull(value, "payload");
    if (this.payload == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        newValue,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#payload() payload} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payload
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withPayload(Optional<? extends List<Communication_Payload>> optional) {
    @Nullable List<Communication_Payload> value = optional.orElse(null);
    if (this.payload == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        value,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withInstantiatesCanonical(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        newValue,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withInstantiatesCanonical(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        value,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withPriority(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        newValue,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withPriority(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        value,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#received() received} attribute.
   * @param value The value for received
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withReceived(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "received");
    if (this.received == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        newValue,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#received() received} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for received
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withReceived(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.received == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        value,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withStatusReason(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "statusReason");
    if (this.statusReason == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        newValue,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#statusReason() statusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withStatusReason(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.statusReason == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        value,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#inResponseTo() inResponseTo} attribute.
   * @param value The value for inResponseTo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withInResponseTo(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "inResponseTo");
    if (this.inResponseTo == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        newValue,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#inResponseTo() inResponseTo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for inResponseTo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withInResponseTo(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.inResponseTo == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        value,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#recipient() recipient} attribute.
   * @param value The value for recipient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withRecipient(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "recipient");
    if (this.recipient == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        newValue,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#recipient() recipient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recipient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withRecipient(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.recipient == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        value,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        newValue,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        value,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#medium() medium} attribute.
   * @param value The value for medium
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withMedium(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "medium");
    if (this.medium == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        newValue,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#medium() medium} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medium
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withMedium(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.medium == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        value,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withReasonReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        newValue,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withReasonReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        value,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withInstantiatesUri(List<Uri> value) {
    @Nullable List<Uri> newValue = Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        newValue,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withInstantiatesUri(Optional<? extends List<Uri>> optional) {
    @Nullable List<Uri> value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        value,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#about() about} attribute.
   * @param value The value for about
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withAbout(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "about");
    if (this.about == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        newValue,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#about() about} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for about
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withAbout(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.about == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        value,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        newValue,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        value,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        newValue,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        value,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        newValue,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        value,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withReasonCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        newValue,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withReasonCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        value,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        newValue,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        value,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#sender() sender} attribute.
   * @param value The value for sender
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withSender(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "sender");
    if (this.sender == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        newValue,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#sender() sender} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sender
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withSender(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.sender == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        value,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withPartOf(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        newValue,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withPartOf(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        value,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        newValue,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        value,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        newValue,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        value,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Communication#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCommunication withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        newValue,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        newValue,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        value,
        this.modifierExtension,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        newValue,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        value,
        this.identifier,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        newValue,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        value,
        this.topic);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Communication#topic() topic} attribute.
   * @param value The value for topic
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunication withTopic(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "topic");
    if (this.topic == newValue) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Communication#topic() topic} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topic
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunication withTopic(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.topic == value) return this;
    return new ImmutableCommunication(
        this.category,
        this.basedOn,
        this.subject,
        this.language,
        this.contained,
        this.sent,
        this.payload,
        this.instantiatesCanonical,
        this.priority,
        this.received,
        this.statusReason,
        this.inResponseTo,
        this.recipient,
        this.status,
        this.medium,
        this.reasonReference,
        this.instantiatesUri,
        this.about,
        this.note,
        this.meta,
        this.extension,
        this.reasonCode,
        this.id,
        this.sender,
        this.partOf,
        this.implicitRules,
        this.text,
        this.resourceType,
        this.encounter,
        this.modifierExtension,
        this.identifier,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCommunication} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCommunication
        && equalTo((ImmutableCommunication) another);
  }

  private boolean equalTo(ImmutableCommunication another) {
    return Objects.equals(category, another.category)
        && Objects.equals(basedOn, another.basedOn)
        && Objects.equals(subject, another.subject)
        && Objects.equals(language, another.language)
        && Objects.equals(contained, another.contained)
        && Objects.equals(sent, another.sent)
        && Objects.equals(payload, another.payload)
        && Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && Objects.equals(priority, another.priority)
        && Objects.equals(received, another.received)
        && Objects.equals(statusReason, another.statusReason)
        && Objects.equals(inResponseTo, another.inResponseTo)
        && Objects.equals(recipient, another.recipient)
        && Objects.equals(status, another.status)
        && Objects.equals(medium, another.medium)
        && Objects.equals(reasonReference, another.reasonReference)
        && Objects.equals(instantiatesUri, another.instantiatesUri)
        && Objects.equals(about, another.about)
        && Objects.equals(note, another.note)
        && Objects.equals(meta, another.meta)
        && Objects.equals(extension, another.extension)
        && Objects.equals(reasonCode, another.reasonCode)
        && Objects.equals(id, another.id)
        && Objects.equals(sender, another.sender)
        && Objects.equals(partOf, another.partOf)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(text, another.text)
        && resourceType.equals(another.resourceType)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(topic, another.topic);
  }

  /**
   * Computes a hash code from attributes: {@code category}, {@code basedOn}, {@code subject}, {@code language}, {@code contained}, {@code sent}, {@code payload}, {@code instantiatesCanonical}, {@code priority}, {@code received}, {@code statusReason}, {@code inResponseTo}, {@code recipient}, {@code status}, {@code medium}, {@code reasonReference}, {@code instantiatesUri}, {@code about}, {@code note}, {@code meta}, {@code extension}, {@code reasonCode}, {@code id}, {@code sender}, {@code partOf}, {@code implicitRules}, {@code text}, {@code resourceType}, {@code encounter}, {@code modifierExtension}, {@code identifier}, {@code topic}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(basedOn);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(sent);
    h += (h << 5) + Objects.hashCode(payload);
    h += (h << 5) + Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + Objects.hashCode(priority);
    h += (h << 5) + Objects.hashCode(received);
    h += (h << 5) + Objects.hashCode(statusReason);
    h += (h << 5) + Objects.hashCode(inResponseTo);
    h += (h << 5) + Objects.hashCode(recipient);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(medium);
    h += (h << 5) + Objects.hashCode(reasonReference);
    h += (h << 5) + Objects.hashCode(instantiatesUri);
    h += (h << 5) + Objects.hashCode(about);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(reasonCode);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(sender);
    h += (h << 5) + Objects.hashCode(partOf);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(topic);
    return h;
  }

  /**
   * Prints the immutable value {@code Communication} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Communication{");
    if (category != null) {
      builder.append("category=").append(category);
    }
    if (basedOn != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (subject != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (language != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (contained != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (sent != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("sent=").append(sent);
    }
    if (payload != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("payload=").append(payload);
    }
    if (instantiatesCanonical != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (priority != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (received != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("received=").append(received);
    }
    if (statusReason != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    if (inResponseTo != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("inResponseTo=").append(inResponseTo);
    }
    if (recipient != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("recipient=").append(recipient);
    }
    if (status != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (medium != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("medium=").append(medium);
    }
    if (reasonReference != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (instantiatesUri != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    if (about != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("about=").append(about);
    }
    if (note != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (meta != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (extension != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (reasonCode != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (id != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (sender != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("sender=").append(sender);
    }
    if (partOf != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (implicitRules != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (text != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (topic != null) {
      builder.append(", ");
      builder.append("topic=").append(topic);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Communication", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Communication {
    @Nullable Optional<List<CodeableConcept>> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<List<Reference>> basedOn = Optional.empty();
    boolean basedOnIsSet;
    @Nullable Optional<Reference> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<DateTime> sent = Optional.empty();
    boolean sentIsSet;
    @Nullable Optional<List<Communication_Payload>> payload = Optional.empty();
    boolean payloadIsSet;
    @Nullable Optional<List<Canonical>> instantiatesCanonical = Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @Nullable Optional<Code> priority = Optional.empty();
    boolean priorityIsSet;
    @Nullable Optional<DateTime> received = Optional.empty();
    boolean receivedIsSet;
    @Nullable Optional<CodeableConcept> statusReason = Optional.empty();
    boolean statusReasonIsSet;
    @Nullable Optional<List<Reference>> inResponseTo = Optional.empty();
    boolean inResponseToIsSet;
    @Nullable Optional<List<Reference>> recipient = Optional.empty();
    boolean recipientIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<CodeableConcept>> medium = Optional.empty();
    boolean mediumIsSet;
    @Nullable Optional<List<Reference>> reasonReference = Optional.empty();
    boolean reasonReferenceIsSet;
    @Nullable Optional<List<Uri>> instantiatesUri = Optional.empty();
    boolean instantiatesUriIsSet;
    @Nullable Optional<List<Reference>> about = Optional.empty();
    boolean aboutIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<CodeableConcept>> reasonCode = Optional.empty();
    boolean reasonCodeIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Reference> sender = Optional.empty();
    boolean senderIsSet;
    @Nullable Optional<List<Reference>> partOf = Optional.empty();
    boolean partOfIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<CodeableConcept> topic = Optional.empty();
    boolean topicIsSet;
    @JsonProperty("category")
    public void setCategory(Optional<List<CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("basedOn")
    public void setBasedOn(Optional<List<Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("sent")
    public void setSent(Optional<DateTime> sent) {
      this.sent = sent;
      this.sentIsSet = true;
    }
    @JsonProperty("payload")
    public void setPayload(Optional<List<Communication_Payload>> payload) {
      this.payload = payload;
      this.payloadIsSet = true;
    }
    @JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(Optional<List<Canonical>> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
    }
    @JsonProperty("priority")
    public void setPriority(Optional<Code> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @JsonProperty("received")
    public void setReceived(Optional<DateTime> received) {
      this.received = received;
      this.receivedIsSet = true;
    }
    @JsonProperty("statusReason")
    public void setStatusReason(Optional<CodeableConcept> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @JsonProperty("inResponseTo")
    public void setInResponseTo(Optional<List<Reference>> inResponseTo) {
      this.inResponseTo = inResponseTo;
      this.inResponseToIsSet = true;
    }
    @JsonProperty("recipient")
    public void setRecipient(Optional<List<Reference>> recipient) {
      this.recipient = recipient;
      this.recipientIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("medium")
    public void setMedium(Optional<List<CodeableConcept>> medium) {
      this.medium = medium;
      this.mediumIsSet = true;
    }
    @JsonProperty("reasonReference")
    public void setReasonReference(Optional<List<Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @JsonProperty("instantiatesUri")
    public void setInstantiatesUri(Optional<List<Uri>> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
    }
    @JsonProperty("about")
    public void setAbout(Optional<List<Reference>> about) {
      this.about = about;
      this.aboutIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("reasonCode")
    public void setReasonCode(Optional<List<CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("sender")
    public void setSender(Optional<Reference> sender) {
      this.sender = sender;
      this.senderIsSet = true;
    }
    @JsonProperty("partOf")
    public void setPartOf(Optional<List<Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("topic")
    public void setTopic(Optional<CodeableConcept> topic) {
      this.topic = topic;
      this.topicIsSet = true;
    }
    @Override
    public Optional<List<CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> sent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Communication_Payload>> payload() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> priority() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> received() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> statusReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> inResponseTo() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> recipient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> medium() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Uri>> instantiatesUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> about() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> sender() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> topic() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCommunication fromJson(Json json) {
    ImmutableCommunication.Builder builder = ((ImmutableCommunication.Builder) ImmutableCommunication.builder());
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.sentIsSet) {
      builder.sent(json.sent);
    }
    if (json.payloadIsSet) {
      builder.payload(json.payload);
    }
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.receivedIsSet) {
      builder.received(json.received);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
    }
    if (json.inResponseToIsSet) {
      builder.inResponseTo(json.inResponseTo);
    }
    if (json.recipientIsSet) {
      builder.recipient(json.recipient);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.mediumIsSet) {
      builder.medium(json.medium);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    if (json.aboutIsSet) {
      builder.about(json.about);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.senderIsSet) {
      builder.sender(json.sender);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.topicIsSet) {
      builder.topic(json.topic);
    }
    return (ImmutableCommunication) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Communication} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Communication instance
   */
  public static Communication copyOf(Communication instance) {
    if (instance instanceof ImmutableCommunication) {
      return (ImmutableCommunication) instance;
    }
    return ((ImmutableCommunication.Builder) ImmutableCommunication.builder())
        .category(instance.category())
        .basedOn(instance.basedOn())
        .subject(instance.subject())
        .language(instance.language())
        .contained(instance.contained())
        .sent(instance.sent())
        .payload(instance.payload())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .priority(instance.priority())
        .received(instance.received())
        .statusReason(instance.statusReason())
        .inResponseTo(instance.inResponseTo())
        .recipient(instance.recipient())
        .status(instance.status())
        .medium(instance.medium())
        .reasonReference(instance.reasonReference())
        .instantiatesUri(instance.instantiatesUri())
        .about(instance.about())
        .note(instance.note())
        .meta(instance.meta())
        .extension(instance.extension())
        .reasonCode(instance.reasonCode())
        .id(instance.id())
        .sender(instance.sender())
        .partOf(instance.partOf())
        .implicitRules(instance.implicitRules())
        .text(instance.text())
        .resourceType(instance.resourceType())
        .encounter(instance.encounter())
        .modifierExtension(instance.modifierExtension())
        .identifier(instance.identifier())
        .topic(instance.topic())
        .build();
  }

  /**
   * Creates a builder for {@link Communication Communication}.
   * <pre>
   * ImmutableCommunication.builder()
   *    .category(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Communication#category() category}
   *    .basedOn(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Communication#basedOn() basedOn}
   *    .subject(com.medplum.types.fhir.Reference) // optional {@link Communication#subject() subject}
   *    .language(com.medplum.types.fhir.Code) // optional {@link Communication#language() language}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link Communication#contained() contained}
   *    .sent(com.medplum.types.fhir.DateTime) // optional {@link Communication#sent() sent}
   *    .payload(List&amp;lt;com.medplum.types.fhir.Communication_Payload&amp;gt;) // optional {@link Communication#payload() payload}
   *    .instantiatesCanonical(List&amp;lt;com.medplum.types.fhir.Canonical&amp;gt;) // optional {@link Communication#instantiatesCanonical() instantiatesCanonical}
   *    .priority(com.medplum.types.fhir.Code) // optional {@link Communication#priority() priority}
   *    .received(com.medplum.types.fhir.DateTime) // optional {@link Communication#received() received}
   *    .statusReason(com.medplum.types.fhir.CodeableConcept) // optional {@link Communication#statusReason() statusReason}
   *    .inResponseTo(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Communication#inResponseTo() inResponseTo}
   *    .recipient(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Communication#recipient() recipient}
   *    .status(com.medplum.types.fhir.Code) // optional {@link Communication#status() status}
   *    .medium(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Communication#medium() medium}
   *    .reasonReference(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Communication#reasonReference() reasonReference}
   *    .instantiatesUri(List&amp;lt;com.medplum.types.fhir.Uri&amp;gt;) // optional {@link Communication#instantiatesUri() instantiatesUri}
   *    .about(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Communication#about() about}
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link Communication#note() note}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link Communication#meta() meta}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Communication#extension() extension}
   *    .reasonCode(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Communication#reasonCode() reasonCode}
   *    .id(com.medplum.types.fhir.Id) // optional {@link Communication#id() id}
   *    .sender(com.medplum.types.fhir.Reference) // optional {@link Communication#sender() sender}
   *    .partOf(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Communication#partOf() partOf}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link Communication#implicitRules() implicitRules}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link Communication#text() text}
   *    .resourceType(String) // required {@link Communication#resourceType() resourceType}
   *    .encounter(com.medplum.types.fhir.Reference) // optional {@link Communication#encounter() encounter}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Communication#modifierExtension() modifierExtension}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link Communication#identifier() identifier}
   *    .topic(com.medplum.types.fhir.CodeableConcept) // optional {@link Communication#topic() topic}
   *    .build();
   * </pre>
   * @return A new Communication builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableCommunication.Builder();
  }

  /**
   * Builds instances of type {@link Communication Communication}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Communication", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_CATEGORY = 0x1L;
    private static final long OPT_BIT_BASED_ON = 0x2L;
    private static final long OPT_BIT_SUBJECT = 0x4L;
    private static final long OPT_BIT_LANGUAGE = 0x8L;
    private static final long OPT_BIT_CONTAINED = 0x10L;
    private static final long OPT_BIT_SENT = 0x20L;
    private static final long OPT_BIT_PAYLOAD = 0x40L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x80L;
    private static final long OPT_BIT_PRIORITY = 0x100L;
    private static final long OPT_BIT_RECEIVED = 0x200L;
    private static final long OPT_BIT_STATUS_REASON = 0x400L;
    private static final long OPT_BIT_IN_RESPONSE_TO = 0x800L;
    private static final long OPT_BIT_RECIPIENT = 0x1000L;
    private static final long OPT_BIT_STATUS = 0x2000L;
    private static final long OPT_BIT_MEDIUM = 0x4000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x8000L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x10000L;
    private static final long OPT_BIT_ABOUT = 0x20000L;
    private static final long OPT_BIT_NOTE = 0x40000L;
    private static final long OPT_BIT_META = 0x80000L;
    private static final long OPT_BIT_EXTENSION = 0x100000L;
    private static final long OPT_BIT_REASON_CODE = 0x200000L;
    private static final long OPT_BIT_ID = 0x400000L;
    private static final long OPT_BIT_SENDER = 0x800000L;
    private static final long OPT_BIT_PART_OF = 0x1000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2000000L;
    private static final long OPT_BIT_TEXT = 0x4000000L;
    private static final long OPT_BIT_ENCOUNTER = 0x8000000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10000000L;
    private static final long OPT_BIT_IDENTIFIER = 0x20000000L;
    private static final long OPT_BIT_TOPIC = 0x40000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<CodeableConcept> category;
    private @Nullable List<Reference> basedOn;
    private @Nullable Reference subject;
    private @Nullable Code language;
    private @Nullable List<ResourceList> contained;
    private @Nullable DateTime sent;
    private @Nullable List<Communication_Payload> payload;
    private @Nullable List<Canonical> instantiatesCanonical;
    private @Nullable Code priority;
    private @Nullable DateTime received;
    private @Nullable CodeableConcept statusReason;
    private @Nullable List<Reference> inResponseTo;
    private @Nullable List<Reference> recipient;
    private @Nullable Code status;
    private @Nullable List<CodeableConcept> medium;
    private @Nullable List<Reference> reasonReference;
    private @Nullable List<Uri> instantiatesUri;
    private @Nullable List<Reference> about;
    private @Nullable List<Annotation> note;
    private @Nullable Meta meta;
    private @Nullable List<Extension> extension;
    private @Nullable List<CodeableConcept> reasonCode;
    private @Nullable Id id;
    private @Nullable Reference sender;
    private @Nullable List<Reference> partOf;
    private @Nullable Uri implicitRules;
    private @Nullable Narrative text;
    private @Nullable String resourceType;
    private @Nullable Reference encounter;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Identifier> identifier;
    private @Nullable CodeableConcept topic;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Communication#category() category} to category.
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
     * Initializes the optional value {@link Communication#category() category} to category.
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
     * Initializes the optional value {@link Communication#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link Communication#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link Communication#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    public final Builder subject(Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subject")
    public final Builder subject(Optional<? extends Reference> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#language() language} to language.
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
     * Initializes the optional value {@link Communication#language() language} to language.
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
     * Initializes the optional value {@link Communication#contained() contained} to contained.
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
     * Initializes the optional value {@link Communication#contained() contained} to contained.
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
     * Initializes the optional value {@link Communication#sent() sent} to sent.
     * @param sent The value for sent
     * @return {@code this} builder for chained invocation
     */
    public final Builder sent(DateTime sent) {
      checkNotIsSet(sentIsSet(), "sent");
      this.sent = Objects.requireNonNull(sent, "sent");
      optBits |= OPT_BIT_SENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#sent() sent} to sent.
     * @param sent The value for sent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sent")
    public final Builder sent(Optional<? extends DateTime> sent) {
      checkNotIsSet(sentIsSet(), "sent");
      this.sent = sent.orElse(null);
      optBits |= OPT_BIT_SENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#payload() payload} to payload.
     * @param payload The value for payload
     * @return {@code this} builder for chained invocation
     */
    public final Builder payload(List<Communication_Payload> payload) {
      checkNotIsSet(payloadIsSet(), "payload");
      this.payload = Objects.requireNonNull(payload, "payload");
      optBits |= OPT_BIT_PAYLOAD;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#payload() payload} to payload.
     * @param payload The value for payload
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("payload")
    public final Builder payload(Optional<? extends List<Communication_Payload>> payload) {
      checkNotIsSet(payloadIsSet(), "payload");
      this.payload = payload.orElse(null);
      optBits |= OPT_BIT_PAYLOAD;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
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
     * Initializes the optional value {@link Communication#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
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
     * Initializes the optional value {@link Communication#priority() priority} to priority.
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
     * Initializes the optional value {@link Communication#priority() priority} to priority.
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
     * Initializes the optional value {@link Communication#received() received} to received.
     * @param received The value for received
     * @return {@code this} builder for chained invocation
     */
    public final Builder received(DateTime received) {
      checkNotIsSet(receivedIsSet(), "received");
      this.received = Objects.requireNonNull(received, "received");
      optBits |= OPT_BIT_RECEIVED;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#received() received} to received.
     * @param received The value for received
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("received")
    public final Builder received(Optional<? extends DateTime> received) {
      checkNotIsSet(receivedIsSet(), "received");
      this.received = received.orElse(null);
      optBits |= OPT_BIT_RECEIVED;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusReason(CodeableConcept statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = Objects.requireNonNull(statusReason, "statusReason");
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("statusReason")
    public final Builder statusReason(Optional<? extends CodeableConcept> statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = statusReason.orElse(null);
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#inResponseTo() inResponseTo} to inResponseTo.
     * @param inResponseTo The value for inResponseTo
     * @return {@code this} builder for chained invocation
     */
    public final Builder inResponseTo(List<Reference> inResponseTo) {
      checkNotIsSet(inResponseToIsSet(), "inResponseTo");
      this.inResponseTo = Objects.requireNonNull(inResponseTo, "inResponseTo");
      optBits |= OPT_BIT_IN_RESPONSE_TO;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#inResponseTo() inResponseTo} to inResponseTo.
     * @param inResponseTo The value for inResponseTo
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("inResponseTo")
    public final Builder inResponseTo(Optional<? extends List<Reference>> inResponseTo) {
      checkNotIsSet(inResponseToIsSet(), "inResponseTo");
      this.inResponseTo = inResponseTo.orElse(null);
      optBits |= OPT_BIT_IN_RESPONSE_TO;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for chained invocation
     */
    public final Builder recipient(List<Reference> recipient) {
      checkNotIsSet(recipientIsSet(), "recipient");
      this.recipient = Objects.requireNonNull(recipient, "recipient");
      optBits |= OPT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("recipient")
    public final Builder recipient(Optional<? extends List<Reference>> recipient) {
      checkNotIsSet(recipientIsSet(), "recipient");
      this.recipient = recipient.orElse(null);
      optBits |= OPT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#status() status} to status.
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
     * Initializes the optional value {@link Communication#status() status} to status.
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
     * Initializes the optional value {@link Communication#medium() medium} to medium.
     * @param medium The value for medium
     * @return {@code this} builder for chained invocation
     */
    public final Builder medium(List<CodeableConcept> medium) {
      checkNotIsSet(mediumIsSet(), "medium");
      this.medium = Objects.requireNonNull(medium, "medium");
      optBits |= OPT_BIT_MEDIUM;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#medium() medium} to medium.
     * @param medium The value for medium
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("medium")
    public final Builder medium(Optional<? extends List<CodeableConcept>> medium) {
      checkNotIsSet(mediumIsSet(), "medium");
      this.medium = medium.orElse(null);
      optBits |= OPT_BIT_MEDIUM;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonReference(List<Reference> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = Objects.requireNonNull(reasonReference, "reasonReference");
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reasonReference")
    public final Builder reasonReference(Optional<? extends List<Reference>> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = reasonReference.orElse(null);
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#instantiatesUri() instantiatesUri} to instantiatesUri.
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
     * Initializes the optional value {@link Communication#instantiatesUri() instantiatesUri} to instantiatesUri.
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
     * Initializes the optional value {@link Communication#about() about} to about.
     * @param about The value for about
     * @return {@code this} builder for chained invocation
     */
    public final Builder about(List<Reference> about) {
      checkNotIsSet(aboutIsSet(), "about");
      this.about = Objects.requireNonNull(about, "about");
      optBits |= OPT_BIT_ABOUT;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#about() about} to about.
     * @param about The value for about
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("about")
    public final Builder about(Optional<? extends List<Reference>> about) {
      checkNotIsSet(aboutIsSet(), "about");
      this.about = about.orElse(null);
      optBits |= OPT_BIT_ABOUT;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#note() note} to note.
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
     * Initializes the optional value {@link Communication#note() note} to note.
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
     * Initializes the optional value {@link Communication#meta() meta} to meta.
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
     * Initializes the optional value {@link Communication#meta() meta} to meta.
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
     * Initializes the optional value {@link Communication#extension() extension} to extension.
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
     * Initializes the optional value {@link Communication#extension() extension} to extension.
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
     * Initializes the optional value {@link Communication#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonCode(List<CodeableConcept> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = Objects.requireNonNull(reasonCode, "reasonCode");
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reasonCode")
    public final Builder reasonCode(Optional<? extends List<CodeableConcept>> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = reasonCode.orElse(null);
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#id() id} to id.
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
     * Initializes the optional value {@link Communication#id() id} to id.
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
     * Initializes the optional value {@link Communication#sender() sender} to sender.
     * @param sender The value for sender
     * @return {@code this} builder for chained invocation
     */
    public final Builder sender(Reference sender) {
      checkNotIsSet(senderIsSet(), "sender");
      this.sender = Objects.requireNonNull(sender, "sender");
      optBits |= OPT_BIT_SENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#sender() sender} to sender.
     * @param sender The value for sender
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sender")
    public final Builder sender(Optional<? extends Reference> sender) {
      checkNotIsSet(senderIsSet(), "sender");
      this.sender = sender.orElse(null);
      optBits |= OPT_BIT_SENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link Communication#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link Communication#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Communication#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Communication#text() text} to text.
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
     * Initializes the optional value {@link Communication#text() text} to text.
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
     * Initializes the value for the {@link Communication#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Communication#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Communication#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Communication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Communication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Communication#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Communication#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Communication#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for chained invocation
     */
    public final Builder topic(CodeableConcept topic) {
      checkNotIsSet(topicIsSet(), "topic");
      this.topic = Objects.requireNonNull(topic, "topic");
      optBits |= OPT_BIT_TOPIC;
      return this;
    }

    /**
     * Initializes the optional value {@link Communication#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("topic")
    public final Builder topic(Optional<? extends CodeableConcept> topic) {
      checkNotIsSet(topicIsSet(), "topic");
      this.topic = topic.orElse(null);
      optBits |= OPT_BIT_TOPIC;
      return this;
    }

    /**
     * Builds a new {@link Communication Communication}.
     * @return An immutable instance of Communication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Communication build() {
      checkRequiredAttributes();
      return new ImmutableCommunication(
          category,
          basedOn,
          subject,
          language,
          contained,
          sent,
          payload,
          instantiatesCanonical,
          priority,
          received,
          statusReason,
          inResponseTo,
          recipient,
          status,
          medium,
          reasonReference,
          instantiatesUri,
          about,
          note,
          meta,
          extension,
          reasonCode,
          id,
          sender,
          partOf,
          implicitRules,
          text,
          resourceType,
          encounter,
          modifierExtension,
          identifier,
          topic);
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean sentIsSet() {
      return (optBits & OPT_BIT_SENT) != 0;
    }

    private boolean payloadIsSet() {
      return (optBits & OPT_BIT_PAYLOAD) != 0;
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean receivedIsSet() {
      return (optBits & OPT_BIT_RECEIVED) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean inResponseToIsSet() {
      return (optBits & OPT_BIT_IN_RESPONSE_TO) != 0;
    }

    private boolean recipientIsSet() {
      return (optBits & OPT_BIT_RECIPIENT) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean mediumIsSet() {
      return (optBits & OPT_BIT_MEDIUM) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean aboutIsSet() {
      return (optBits & OPT_BIT_ABOUT) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean senderIsSet() {
      return (optBits & OPT_BIT_SENDER) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean topicIsSet() {
      return (optBits & OPT_BIT_TOPIC) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Communication is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Communication, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Communication", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Communication#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Communication", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Communication#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(List<CodeableConcept> category);

    /**
     * Initializes the optional value {@link Communication#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends List<CodeableConcept>> category);

    /**
     * Initializes the optional value {@link Communication#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(List<Reference> basedOn);

    /**
     * Initializes the optional value {@link Communication#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(Optional<? extends List<Reference>> basedOn);

    /**
     * Initializes the optional value {@link Communication#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(Reference subject);

    /**
     * Initializes the optional value {@link Communication#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends Reference> subject);

    /**
     * Initializes the optional value {@link Communication#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Communication#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Communication#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Communication#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Communication#sent() sent} to sent.
     * @param sent The value for sent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sent(DateTime sent);

    /**
     * Initializes the optional value {@link Communication#sent() sent} to sent.
     * @param sent The value for sent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sent(Optional<? extends DateTime> sent);

    /**
     * Initializes the optional value {@link Communication#payload() payload} to payload.
     * @param payload The value for payload
     * @return {@code this} builder for chained invocation
     */
    BuildFinal payload(List<Communication_Payload> payload);

    /**
     * Initializes the optional value {@link Communication#payload() payload} to payload.
     * @param payload The value for payload
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal payload(Optional<? extends List<Communication_Payload>> payload);

    /**
     * Initializes the optional value {@link Communication#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesCanonical(List<Canonical> instantiatesCanonical);

    /**
     * Initializes the optional value {@link Communication#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesCanonical(Optional<? extends List<Canonical>> instantiatesCanonical);

    /**
     * Initializes the optional value {@link Communication#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(Code priority);

    /**
     * Initializes the optional value {@link Communication#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(Optional<? extends Code> priority);

    /**
     * Initializes the optional value {@link Communication#received() received} to received.
     * @param received The value for received
     * @return {@code this} builder for chained invocation
     */
    BuildFinal received(DateTime received);

    /**
     * Initializes the optional value {@link Communication#received() received} to received.
     * @param received The value for received
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal received(Optional<? extends DateTime> received);

    /**
     * Initializes the optional value {@link Communication#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReason(CodeableConcept statusReason);

    /**
     * Initializes the optional value {@link Communication#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReason(Optional<? extends CodeableConcept> statusReason);

    /**
     * Initializes the optional value {@link Communication#inResponseTo() inResponseTo} to inResponseTo.
     * @param inResponseTo The value for inResponseTo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal inResponseTo(List<Reference> inResponseTo);

    /**
     * Initializes the optional value {@link Communication#inResponseTo() inResponseTo} to inResponseTo.
     * @param inResponseTo The value for inResponseTo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal inResponseTo(Optional<? extends List<Reference>> inResponseTo);

    /**
     * Initializes the optional value {@link Communication#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recipient(List<Reference> recipient);

    /**
     * Initializes the optional value {@link Communication#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recipient(Optional<? extends List<Reference>> recipient);

    /**
     * Initializes the optional value {@link Communication#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link Communication#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link Communication#medium() medium} to medium.
     * @param medium The value for medium
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medium(List<CodeableConcept> medium);

    /**
     * Initializes the optional value {@link Communication#medium() medium} to medium.
     * @param medium The value for medium
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medium(Optional<? extends List<CodeableConcept>> medium);

    /**
     * Initializes the optional value {@link Communication#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(List<Reference> reasonReference);

    /**
     * Initializes the optional value {@link Communication#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(Optional<? extends List<Reference>> reasonReference);

    /**
     * Initializes the optional value {@link Communication#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesUri(List<Uri> instantiatesUri);

    /**
     * Initializes the optional value {@link Communication#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesUri(Optional<? extends List<Uri>> instantiatesUri);

    /**
     * Initializes the optional value {@link Communication#about() about} to about.
     * @param about The value for about
     * @return {@code this} builder for chained invocation
     */
    BuildFinal about(List<Reference> about);

    /**
     * Initializes the optional value {@link Communication#about() about} to about.
     * @param about The value for about
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal about(Optional<? extends List<Reference>> about);

    /**
     * Initializes the optional value {@link Communication#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link Communication#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link Communication#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Communication#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Communication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Communication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Communication#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(List<CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link Communication#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(Optional<? extends List<CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link Communication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Communication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Communication#sender() sender} to sender.
     * @param sender The value for sender
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sender(Reference sender);

    /**
     * Initializes the optional value {@link Communication#sender() sender} to sender.
     * @param sender The value for sender
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sender(Optional<? extends Reference> sender);

    /**
     * Initializes the optional value {@link Communication#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(List<Reference> partOf);

    /**
     * Initializes the optional value {@link Communication#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(Optional<? extends List<Reference>> partOf);

    /**
     * Initializes the optional value {@link Communication#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Communication#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Communication#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Communication#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Communication#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link Communication#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link Communication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Communication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Communication#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Communication#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Communication#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topic(CodeableConcept topic);

    /**
     * Initializes the optional value {@link Communication#topic() topic} to topic.
     * @param topic The value for topic
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topic(Optional<? extends CodeableConcept> topic);

    /**
     * Builds a new {@link Communication Communication}.
     * @return An immutable instance of Communication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Communication build();
  }
}
